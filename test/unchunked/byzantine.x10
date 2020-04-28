/*Changed WriteToFile function as latest updated version. which saves as an arraylist and dumps into the file in the end.
 *
 *
 *
 *
 *
 *
 */



/* This file is part of IMSuite Benchamark Suite.
 * 
 * This file is licensed to You under the Eclipse Public License (EPL);
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * (C) Copyright IMSuite 2013-present.
 */

import x10.io.File;
import x10.io.FileReader;
import x10.io.FileWriter;
import x10.regionarray.Array;
import x10.regionarray.Dist;
import x10.regionarray.DistArray;
import x10.regionarray.Region;
import x10.util.*;

/** 
 * byzantine aims to reach a consensus among a set of nodes.
 * Nodes can be classified as traitors and non-traitors. 
 * Traitors aim to disrupt the consensus.
 * 
 * @author Suyash Gupta
 * @author V Krishna Nandivada
 */
public class byzantine {
	var adj_graph:Array[Long], traitorId:Rail[Long], simpleNodeId:Rail[Long], randomVote:Rail[Long], totalNodes:Long, nodes:Long, traitorCount:Long;
	
	/** Abstract node representation as a distributed array. */
	var allNodes:Array[Nd];
	
	/** Parameters to enable execution with load */
	var loadValue:long=0; 
	
	/** Load sum represented as a distributed array. */
	var nval:Array[long];
	
	/** Region and Distribution specification. */
	var R: Region;		var D: Dist;
	
	/** Other Distributed Array used. */
	var ifTraitor:Array[Boolean];
	
	/** Global coin toss value. */
	val gToss = coinToss();
	
	/** 
	 * Sets the value of global coin toss.
	 * The value can be either 0 or 1.
	 * 
	 * @return 	value of coin toss.
	 */

    //@NonEscaping
	final def coinToss():Long {
		var r:Random = new Random(100);
		var ret:Long = r.nextLong(2);
		return ret;
	}
	
	/** 
	 * Acts as the starting point for the program execution. 
	 * <code>main</code> performs the task of accepting the input from the user 
	 * specified file, consensus decision fromulation, printing the output 
	 * and validating the result.
	 * 
	 * @param args 		array of runtime arguments.
	 * @throws Exception	if File handling operation illegal. 
	 */
	public static def main(args:Rail[String]) throws Exception {
		var inputFile:String = "inputbyzantine.txt", outputFile:String = "outputbyzantine.txt";
		var i:Long,j:Long;
		var flag:Boolean = false;
		val bz:byzantine = new byzantine();
		
		for(i=0; i<args.size; i++) {
			if(args(i).equals("-ver") || args(i).equals("-verify"))
				flag = true;
			else if(args(i).equals("-in")) {
				inputFile = args(i+1);
				i++;
			}	
			else if(args(i).equals("-out")) {
				outputFile = args(i+1);
				i++;
			}	
			else if(args(i).equals("-lfon")) {
				bz.loadValue = Long.parse(args(i+1));
				i++;
			}
			else
				Console.OUT.println("Wrong option spcified");		
		}
		
		var fl:File = new File(inputFile);
		var fr:FileReader = new FileReader(fl);
		var s:String = fr.readLine();
		bz.totalNodes = Long.parse(s);
		bz.traitorCount = bz.totalNodes/8 - 1;
		bz.nodes = bz.totalNodes - bz.traitorCount;
		bz.adj_graph = new Array[Long](Region.make(0..(bz.totalNodes-1), 0..(bz.totalNodes-1)));
		bz.randomVote = new Rail[Long](bz.totalNodes);
		bz.traitorId = new Rail[Long](bz.traitorCount);
		
		/** Region creation. */
		bz.R = Region.make(0, (bz.totalNodes-1));
		
		/** Creation of a Block Distribution. */
		bz.D = Dist.makeBlock(bz.R);
		
		/** Distribution of nodes. */
		bz.allNodes = new Array[Nd](Region.make(0,bz.totalNodes));
		
		/** Some more data getting distributed. */
		//        bz.ifTraitor = DistArray.make[Boolean](bz.D);
		bz.ifTraitor = new Array[Boolean](Region.make(0,bz.totalNodes));
		
		//		bz.nval = DistArray.make[long](bz.D);
		bz.nval = new Array[long](Region.make(0,bz.totalNodes));
		
		/** Global parameters used for consensus. */
		val L = (5*bz.totalNodes/8)+1;
		val H = (3*bz.totalNodes/4)+1;
		val G = (7*bz.totalNodes/8);
		
		j=0;
		while(!((s = fr.readLine()).equals(" "))) {
			for(i=0; i<s.length(); i++) {
				var iInt:Int = i as Int;
				var ch:Char=s.charAt(iInt);
				if(ch=='0')
					bz.adj_graph(j,i) = 0;
				else
					bz.adj_graph(j,i) = 1;	
			}
			j++;
		}
		
		while(!((s = fr.readLine()).equals(" "))) {
			for(i=0; i<s.length(); i++) {
				var iInt:Int = i as Int;
				var ch:Char=s.charAt(iInt);
				if(ch=='0')
					bz.randomVote(i) = 0;
				else
					bz.randomVote(i) = 1;	
			}
		}
		
		try {	
			j=0;
			while((s = fr.readLine()) != null) {
				bz.traitorId(j) = Long.parse(s);
                //Console.OUT.println("rahul "+ bz.traitorId(j) + "\n"); 
				j++;
			}
		} catch(eof: x10.io.EOFException){}	
		
		for(pt in bz.R) {
			val statTrait:Rail[Long] = bz.traitorId;
			var ipt:Long = pt(0);
			for(var ii:Long=0; ii<statTrait.size; ii++)
				if(statTrait(ii) == ipt) 
					bz.ifTraitor(pt) = true; 
		}
		
		var diam:Long = bz.getDiameter();
		bz.initialize();
		
		var startTime:long = System.nanoTime();
		for(i=0; i<bz.totalNodes/8+1; i++) {
			for(j=0; j<diam; j++)
				bz.voteAll();
			bz.voteDecision(L, H, G);
		}
		var finishTime:long = System.nanoTime();
		var estimatedTime:long = (finishTime - startTime)/1000000;
		Console.OUT.println("Start Time: " + startTime + "\t Finish Time: " + finishTime + "\t Estimated Time: " + estimatedTime);       
		
		//bz.printDecision(outputFile);
		if(flag)
			bz.outputVerifier();
		
		if(!bz.loadValue.equals(0)) {
			var sumval:double=0;
			for(i=0; i<bz.totalNodes; i++) {
				val pt:Point = Point.make(i);
				var arrSum:Long = bz.getNval(pt); 
				sumval = sumval + arrSum;
			}
			if(sumval > 0)
				Console.OUT.println();
		}
	}
	
	/**
	 * Aims to busy the threads by introducing the no-op instructions
	 * equivalent to the amount of load specified.
	 * 
	 * @param  weight	Specifies the current load value for a thread.
	 * @return 		Updated load value.
	 */
	def loadweight(val weight:Long):Long {
		var j:Long=1;
		for(var i:Long=0; i<loadValue; i++){
            j= j+i;
        }
        return j;
	}
	
	def getNval(val pt:Point):Long {
		var sum:Long = nval(pt);
		return sum;
	}
	
	/** Initializes all the fields of the abstract node. */ 
	def initialize() {
		finish {
			for(i in R) {
				async
                {
					allNodes(i) = new Nd();
					var Nde:Nd = allNodes(i);
					var index:Long = i(0);
					Nde.id = index;
					Nde.permanent=0;
					var counter:Long=0, j:Long=0; 
					for(j=0; j<totalNodes; j++)
						if(adj_graph(index,j) == 1)
							counter++;
					Nde.neighbors = new Rail[Long](counter);
					counter=0;
					for(j=0; j<totalNodes; j++)
						if(adj_graph(index,j) == 1) {
							Nde.neighbors(counter) = j;
							counter++;
						}        
					Nde.voteReceived = new Rail[boolean](totalNodes);
					Nde.voteReceived(index) = true;
					Nde.vote = new Rail[Long]((Nde.neighbors.size+1));
					if(ifTraitor(i)) {
						var r:Random = new Random(index);
						for(var k:Long=0; k<Nde.neighbors.size; k++)
							Nde.vote(k) = r.nextLong(2);
						Nde.vote(Nde.neighbors.size) = randomVote(index);	
					}
					else
						Nde.vote(Nde.neighbors.size) = randomVote(index);		
				}
			}
		}
	}
	
	/**
	 * Calculates the diameter for the graph from the root by selecting the 
	 * maximum distance of a node from the root.
	 * 
	 * @return	Value of diameter form the root.
	 */
	def getDiameter():Long {
		var diameter:Rail[Long] = new Rail[Long](totalNodes);
		
		finish {
			for(j in (0..(totalNodes-1))) {
				async 
            {
					var distanceMat:Rail[Long] = new Rail[Long](totalNodes); var i:Long=0;
	        		var flag:boolean = false;
					var queue:ArrayList[Long] = new ArrayList[Long]();
					for(i=0; i<totalNodes; i++)
						distanceMat(i) = Long.MAX_VALUE;
					queue.add(j);
					distanceMat(j) = 0;
					
					while(queue.size() > 0) {
						var anode:Long = queue.get(0);
						queue.remove(anode);
						for(i=0; i<totalNodes; i++)
							if(adj_graph(anode, i) == 1 && distanceMat(i) == Long.MAX_VALUE) {
								distanceMat(i) = distanceMat(anode)+1;
								queue.add(i);
							}
					}
					for(i=0; i<totalNodes; i++)
						if(diameter(j) < distanceMat(i))
							diameter(j) = distanceMat(i);
				}
			}
		}
		var maxDiameter:Long = Long.MAX_VALUE;
		for(var j:Long=0; j<totalNodes; j++)
			if(maxDiameter > diameter(j))
				maxDiameter = diameter(j);
		return maxDiameter;
	}	
	
	/** Broadcasts vote from each node to all the other nodes. */
    def voteAll() {
        finish {
            for(var p:long=0; p<R.size(); p++) {
                // val q:long=R.size()-1-p;
                val i:Point=Point.make(p);
                async 
                {
                    var index:Long =  i(0);
                    if(allNodes(i).messageHolder.size() > 0) {
                        var msg:Message = new Message();
                        for(var j:Long=0; j<allNodes(i).messageHolder.size(); j++) {
                            msg = allNodes(i).messageHolder.get(j);
                            for(var k:Long=0; k<allNodes(i).neighbors.size; k++) {
                                val pt: Point = Point.make(allNodes(i).neighbors(k));
                                sendMessage(pt, msg.source, msg.vote);                           		
                            }	
                        }	
                    }
                    else {
                        if(!ifTraitor(i)) {
                            for(var j:Long=0; j<allNodes(i).neighbors.size; j++) {
                                val pt: Point = Point.make(allNodes(i).neighbors(j));
                                sendMessage(pt, index, allNodes(i).vote(allNodes(i).neighbors.size));
                            }	
                        }
                        else {
                            for(var j:Long=0; j<allNodes(i).neighbors.size; j++) {
                                val pt: Point = Point.make(allNodes(i).neighbors(j));
                                sendMessage(pt, index, allNodes(i).vote(j));
                            }	
                        }

                    }
                    loadweight(0);
                }
            }
        }

        finish {
            for(var p:long=0; p<R.size(); p++) {
                // val q:long=R.size()-1-p;
                val i:Point=Point.make(p);
                async{ 
                    allNodes(i).messageHolder.clear();
                    var msg:Message = new Message();
                    for(var j:Long=0; j<allNodes(i).tempMessageHolder.size(); j++) {
                        msg = allNodes(i).tempMessageHolder.get(j);
                        if(!allNodes(i).voteReceived(msg.source)) {
                            allNodes(i).receive.add(msg.vote);
                            allNodes(i).voteReceived(msg.source) = true;
                            allNodes(i).messageHolder.add(msg);
                        }
                    }
                    allNodes(i).tempMessageHolder.clear();
                    loadweight(0);
                }
            }
        }			                                
    }
	
	/** 
	 * Sends the message of a node to the destination node's mailbox.
	 * 
	 * @param receiver	Destination node.
	 * @param source	Source of message.
	 * @param vote		Message of source.
	 */
	def sendMessage(val receiver:Point, val source:Long, val vote:Long) {
		var msg:Message = new Message();
		msg.setMessage(source, vote);
		atomic { allNodes(receiver).tempMessageHolder.add(msg); }
        //Console.OUT.println("1");
	}
	
	/** 
	 * Consensus decision is made based on the majority of votes.
	 * 
	 * @param L	Global variable.
	 * @param H	Global variable.
	 * @param G	Global variable.
	 */
	def voteDecision(val L:Long, val H:Long, val G:Long) {
		finish {
		 for(var p:long=0; p<R.size(); p++) {
               // val q:long=R.size()-1-p;
                val i:Point=Point.make(p);
               async 
                {
					var v0:Long=0; var v1:Long=0; var maj:Long=-1; var tally:Long=0; var j:Long=0; var threshold:Long=0;
					var nd:Nd = allNodes(i);
					for(j=0; j<nd.receive.size(); j++) {
						var rec:Long = nd.receive.get(j);
						if(rec == 1)
							v1++;
						else
							v0++;
					}
					
					if (nd.vote(nd.neighbors.size) == 1)
						v1++;
					else
						v0++;
					
					if(v1 > v0) {
						maj=1;
						tally=v1;
					}
					else {
						maj=0;
						tally=v0;
					}
					threshold = (coinToss() == 0)? L: H;
					
					if(tally > threshold)
						nd.vote(nd.neighbors.size) = maj;
					else
						nd.vote(nd.neighbors.size) = 0;
					
					if(tally > G && nd.permanent == 0) {
						nd.decision = maj;
						nd.permanent = 1;
					}
					nd.receive.clear();
					nd.voteReceived = new Rail[boolean](totalNodes);
					nd.voteReceived(i(0)) = true;
					nd.messageHolder.clear();
					
                    loadweight(0);
				}
			}
		}
	}
	
	/** 
	 * Writes the output to the user specified file.
	 * 
	 * @param  fileName	Name of the file in which output has to be stored.
	 * @throws 		input output exception if a failure in write occurs.
	 */
	def printDecision(var fileName:String) {
		try {
			var fl:File = new File(fileName);
			fw:FileWriter = new FileWriter(fl);
			var str:String;
			str="\nNon traitor nodes: ";
			for(var j:Long=0; j<str.length(); j++) {
				var jInt:Int = j as Int;
				var ch:Char = str.charAt(jInt);
				fw.writeChar(ch);
			}
			
			for(i in R) {
				val pt:Point = i;
				var iden:Long = allNodes(pt).id;
				var dec:Long = allNodes(pt).decision;
				var perma:Long = allNodes(pt).permanent;
				var stat:Boolean = false;
				if(ifTraitor(pt))
					stat = true;
				if(!stat) {
					str="\nNode " + iden + ":\t" + "Decision Taken: " + dec + "\t Permanent: " + perma;
					for(var j:Long=0; j<str.length(); j++) {	
						var jInt:Int = j as Int;
						var ch:Char = str.charAt(jInt);
						fw.writeChar(ch);
					}
				}	
			}	
			
			str="\nTraitor nodes: ";
			for(var j:Long=0; j<str.length(); j++) {
				var jInt:Int = j as Int;
				var ch:Char = str.charAt(jInt);
				fw.writeChar(ch);
			}
			
			for(i in R) {
				val pt:Point = i;
				var iden:Long = allNodes(pt).id;
				var dec:Long = allNodes(pt).decision;
				var perma:Long = allNodes(pt).permanent;
				var stat:Boolean = false;
				if(ifTraitor(pt))
					stat = true;
				if(stat) {
					str="\nNode " + iden + ":\t" + "Decision Taken: " + dec + "\t Permanent: " + perma;
					for(var j:Long=0; j<str.length(); j++) {	
						var jInt:Int = j as Int;
						var ch:Char = str.charAt(jInt);
						fw.writeChar(ch);
					}
				}	
			}	
			fw.close();
		}
		catch(ex: x10.lang.Exception){}
	}
	
	/** Validates the output resulting from the execution of the algorithm. */
	def outputVerifier() {
		var sum:Long=0;
		for(i in R) {
			val pt:Point = i;
			var decs:Long = allNodes(pt).decision;
			var stat:Boolean = false;
			if(ifTraitor(pt))
				stat = true;
			if(!stat)
				sum = sum + decs;
		}        
		
		if((sum == totalNodes - traitorCount) || (sum == 0))
			Console.OUT.println("Output verified");
	    else
            Console.OUT.println("Output Wrong");
	}
}        

/** States the structure of message to be transmitted. */
class Message
{
	var source:Long;
	var vote:Long;
	
	def setMessage(var source:Long, var vote:Long) {
		this.source = source;
		this.vote = vote;
	}
}

/**
 * <code>Nd</code> specifies the structure for each abstract node
 * part of the Byzantine algorithm.
 */
class Nd 
{
	/** Specifies the identifier for each node. */
	var id:Long;
	
	/** Specifies the decision of a node. */
	var decision:Long;                    
	
	/** Specifies the decision made by a node is set premanent or not. */
	var permanent:Long;
	
	/** Set of vote to be send a node. */
	var vote:Rail[Long];
	
	/** Set of vote received by a node from all other nodes. */
	var voteReceived:Rail[boolean];
	
	/** Enumerates the neighbors of a node. */
	var neighbors:Rail[Long];    
	
	/** Holds the messages sent by a node. */ 
	var messageHolder:ArrayList[Message] = new ArrayList[Message]();
	var tempMessageHolder:ArrayList[Message] = new ArrayList[Message]();
	
	/** Set of votes received. */ 
	var receive:ArrayList[Long] = new ArrayList[Long]();
}

class chunk
{
    var myChunkStart:long;
    var myChunkEnd:long;
    def this(){
        myChunkStart = -1;
        myChunkEnd   =-2;
    }
}
class WorkDivider{
    static public def divideWork (var nproc:long,var t_proc:long ,var n:long,  var costArray:Rail[long], var atomicCostArray:Rail[long],   var partialCostArr:Rail[long],var partialAtomicCostArr:Rail[long], var partialAtomicCntArr:Rail[long] ): chunk{
        var blockSize:long  = (n + nproc - 1)/nproc; 
        var totCost:long=0;
        var totAtomicCost:long=0;
        var totAtomicCnt:long=0;
        for(var i:long=0;i<nproc;i++){
            totCost += partialCostArr(i);
            totAtomicCost += partialAtomicCostArr(i);
            totAtomicCnt += partialAtomicCntArr(i);
        }
        //Console.OUT.println(" atomic count "+totAtomicCnt+" atomic cost "+totAtomicCost );

        var minCost:double = Double.MAX_VALUE; var newNProc:long = -1;
        for (var i:long=1;i<=nproc; i++) {
            var cost:double=0;
            var part1:double = (totCost-totAtomicCost)*1.0/i + totAtomicCost as double;
            var part2:double =totAtomicCnt*(i-1);
            var factor:double =0.7*10000;
            cost = part1+factor*part2;
           // if (t_proc == 0) Console.OUT.println("i = " + i + " part1 = " + part1 + " part2 " + part2 + " factor * part2 = " + factor*part2 +" cost = " + cost);
            if (minCost > cost){
                minCost = cost;
                newNProc = i;
            }
        }

        //Console.OUT.println("Nproc is set to " + newNProc);
                    
        nproc = newNProc;

       var myChunk:chunk = new chunk();
       if(t_proc >= nproc){
        return myChunk;

       }
        var avgcost:long = totCost / nproc;
        var costIt:long=0;
        val delta:double = Runtime.CHUNK_DELTA;
        val deltaCost:long=(delta*avgcost) as long;
        val avgtproc:long=avgcost*t_proc;
        var ignoreCostLow:long =  (avgtproc- deltaCost);
        var maxCostLow:long= avgtproc+avgcost-deltaCost;
        var blockNum:long;
        if(t_proc==0){
            
            myChunk.myChunkStart=0;
            ignoreCostLow=0;
        }
        for(blockNum=0;blockNum<nproc; ++blockNum){
            var pcost:long=partialCostArr(blockNum);
            costIt = costIt + pcost;
            if (costIt >  ignoreCostLow) { 
                costIt = costIt - pcost;
                break;
            }
        }
        val costItEnd:long = costIt;
        var itnumber:long;
        //find iteration that crosses ignoreLow.
        for(itnumber=blockNum * blockSize  ; itnumber < n  ;itnumber ++)
        {
            if (costIt+costArray(itnumber) >= ignoreCostLow) break;
            costIt=costIt+costArray(itnumber);
        }
        if(t_proc !=0 ){
            //if costIt < igLow of previous chunk.
            if(costIt< ignoreCostLow - avgcost ){
                myChunk.myChunkStart = itnumber+1;
            }
            else {
                //if it crosses my maxCostLow then take the iteration
                if(costIt + costArray(itnumber) >= maxCostLow){
                    myChunk.myChunkStart = itnumber;

                }
                //otherwise take next iteration
                else
                    myChunk.myChunkStart = itnumber+1;
            }
        }
        else{
            myChunk.myChunkStart = 0;
        }


        costIt = costItEnd;
        for( ;blockNum<nproc; ++blockNum){
            var pcost:long=partialCostArr(blockNum);
            costIt = costIt + pcost;
            if (costIt > maxCostLow) { 
                costIt = costIt - pcost;
                break;
            }
        }
        for(itnumber=blockNum * blockSize  ; itnumber < n  ;itnumber ++)
        {
            if (costIt+costArray(itnumber) >= maxCostLow) break;
            costIt=costIt+costArray(itnumber);
        }
        //find the end it
        if(t_proc != nproc-1){
            if(costIt < ignoreCostLow ){
                //if it is < ignore Low. then it may or may not be mine, depending on startIndex. 
                myChunk.myChunkEnd = itnumber;

            }
            else {
                if(costIt+costArray(itnumber)>=(maxCostLow+avgcost)){
                    myChunk.myChunkEnd = itnumber-1;

                }
                else{

                    myChunk.myChunkEnd = itnumber;

                }
            }
        }
        else {
            myChunk.myChunkEnd = n-1;

        }
        //Console.OUT.println(" start "+myChunk.myChunkStart+ " end "+myChunk.myChunkEnd);
        return myChunk;


    }
    ///////////////////
}
class DynSched{
    var curPos:long;
    def this(){
        curPos = -1;
    }
    public def scheduleDynamic(var nproc:long,var t_proc: long, var n:long ): chunk{
        var myChunk:chunk = new chunk();
        var cSize1:long = Runtime.CHUNK_DELTA as long;
        var cSize2:long = Runtime.CHUNK_DELTA as long;
        atomic {
            var remain:long = n-(curPos+1);
            if(remain>0){
                    //dynamic scheduling 
                    if(remain >cSize2){
                        //dynamic scheduling 
                        var iters :long = cSize2; 
                        myChunk.myChunkStart = curPos+1;
                        myChunk.myChunkEnd = curPos + iters ;
                        curPos = curPos+iters;
                        remain = n- (curPos +1);
                    }
                    else{
                        //remain iteration blindly assign 
                        myChunk.myChunkStart = curPos +1;
                        myChunk.myChunkEnd = curPos +remain ;
                        curPos = curPos +remain;
                        remain = 0;
                    }
            }//else simply return with empty chunk ie myChunk.myChunkStart = -1;
            //Console.OUT.println( t_proc +" "+myChunk.myChunkStart+" "+myChunk.myChunkEnd);
        }
        return myChunk;
    }
}
class WriteToFile{

    var timerDone:ArrayList[String];
    public def this(){
        timerDone = new ArrayList[String]();
    }
    public  def writeToFile(var  timer:String , var time:Double , var flush:boolean ){
        if(!flush){
            //Console.OUT.println(" inside writeto file "+time);
            val toWrite : String = timer+" "+time;
            timerDone.add(toWrite);
        }
        else
        {
            try {
                //Console.OUT.println(" inside writeto file"+timer);
            //    Console.OUT.println(" done array size "+timerDone.size());
                var str:String;
                var fl:File = new File("/home/induk/workspace/testprgms/src/classFiles/profileResults.txt");
                if (fl.isFile() && fl.canRead()) {

                    var fw:FileWriter = new FileWriter(fl,true);
                    for(var i:long=0;i<timerDone.size();i++){
                        str= timerDone.get(i);
                        //Console.OUT.println(" inside writeto file"+str);
                        for(var j:Long=0; j<str.length(); j++) {
                            var jInt:Int = j as Int;
                            var ch:Char = str.charAt(jInt);
                            fw.writeChar(ch);
                        }
                        fw.writeChar('\n');
                    }
                    fw.close();
                }
                else{
                    Console.OUT.println("file not found");
                }

            }
            catch(ex: x10.lang.Exception){}	

        }
    }

} 
class GuidSched{
    var curPos:long;
    def this(){
        curPos = -1;
    }
    public def scheduleGuided (var nproc:long,var t_proc: long, var n:long ): chunk{
        var myChunk:chunk = new chunk();
        var cSize1:long = Runtime.CHUNK_DELTA as long;
        var cSize2:long = Runtime.CHUNK_DELTA as long;
        atomic {
            var remain:long = n-(curPos+1);
            if(remain>0){
                    //guided scheduling 
                    if(remain >cSize2){
                        //guided scheduling 
                        var iters :long = (remain + nproc -1 )/nproc; //ceil of remain/nproc
                        myChunk.myChunkStart = curPos+1;
                        myChunk.myChunkEnd = curPos + iters ;
                        curPos = curPos+iters;
                        remain = n- (curPos +1);
                    }
                    else{
                        //remain iteration blindly assign 
                        myChunk.myChunkStart = curPos +1;
                        myChunk.myChunkEnd = curPos +remain ;
                        curPos = curPos +remain;
                        remain = 0;
                    }
            }//else simply return with empty chunk ie myChunk.myChunkStart = -1;
        }
        return myChunk;
    }
}

