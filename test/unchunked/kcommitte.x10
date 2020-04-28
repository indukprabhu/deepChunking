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
 * kcommitte aims to create committees of size less than or equal to k.
 * If k>=n then there shall be a single committee.
 *
 * @author Suyash Gupta
 * @author V Krishna Nandivada
 */
public class kcommitte 
{
	var adj_graph:Array[Long], nodes:Long, min_value:Rail[Long];
	val Null=Long.MAX_VALUE;

	/** Default Value for K. */
	var K:Long = 6;

	/** Abstract node representation as a distributed array. */
	//var nodeSet:DistArray[Node];
	var nodeSet:Array[Node];

	/** Parameters to enable execution with load */
	var loadValue:long=0; 

	/** Load sum represented as a distributed array. */
	//var nval:DistArray[long];
	var nval:Array[long];

	/** Region and Distribution specification. */
	var R: Region;	var D: Dist;

	/** 
	 * Acts as the starting point for the program execution. 
	 * <code>main</code> performs the task of accepting the input from the user 
	 * specified file, calling <code>polling<\code> and <code>selection<\code> 
	 * methods responsible for committee creation, printing the output and 
	 * validating the result.
	 *
	 * @param args 		array of runtime arguments.
	 * @throws Exception	if File handling operation illegal. 
	 */
	public static def main(args:Rail[String]) throws Exception {
		var inputFile:String = "inputKCommittee.txt", outputFile:String = "outputKCommittee.txt";
		var i:Long,j:Long;
		var flag:Boolean = false;
		var kc:kcommitte = new kcommitte();

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
				kc.loadValue = Long.parse(args(i+1));
				i++;
			}
			else
				Console.OUT.println("Wrong option spcified");		
		}

		var fl:File = new File(inputFile);
		var fr:FileReader = new FileReader(fl);
		var s:String = fr.readLine();
		kc.nodes = Long.parse(s);
		s = fr.readLine();
		kc.K = Long.parse(s);
		kc.adj_graph = new Array[Long](Region.make(0..(kc.nodes-1), 0..(kc.nodes-1)), 0);
		kc.min_value = new Rail[Long](kc.nodes);

		/** Region creation. */		
		kc.R = Region.make(0, (kc.nodes-1));

		/** Creation of a Block Distribution. */
		kc.D = Dist.makeBlock(kc.R);
		//kc.D = Dist.makeUnique();
		//kc.R = kc.D.region;

		/** Distribution of nodes. */
		kc.nodeSet = new Array[Node](kc.R);

		kc.nval = new Array[long](kc.R);

		try {
			j=0;
			while(!((s = fr.readLine()).equals(" "))) {
				for(i=0; i<s.length(); i++) {
					var iInt:Int = i as Int;
					var ch:Char=s.charAt(iInt);
					if(ch=='0')
						kc.adj_graph(j,i) = 0;
					else
						kc.adj_graph(j,i) = 1;	
				}
				j++;
			}
		} catch(eof: x10.io.EOFException){}

		try {
			j=0;
			while((s = fr.readLine()) != null) {
				kc.min_value(j) = Long.parse(s);
				j++;
			}
		} catch(eof: x10.io.EOFException){}

		kc.initialize();
		kc.adj_graph = null;

		var startTime:long = System.nanoTime();
		for(var k:Long=0; k<kc.K; k++) {
			kc.polling();
			kc.selection();
			kc.nodeClear();
		}
	    kc.selfCommittee();
		var finishTime:long = System.nanoTime();
		var estimatedTime:long =( finishTime - startTime)/1000000;
		Console.OUT.println("Start Time: " + startTime + "\t Finish Time: " + finishTime + "\t Estimated Time: " + estimatedTime);

		// kc.printCommittee(outputFile);
		 if(flag)
			kc.outputVerifier();
        
		if(!kc.loadValue.equals(0)) {
			var sumval:double=0;
			for(i=0; i<kc.nodes; i++) {
				val pt:Point = Point.make(i);
				var arrSum:Long = kc.getNval(pt); 
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
		var sum:Long = at(D(pt)) nval(pt);
		return sum;
	}

	/** Initializes all the fields of the abstract node. */  	
	def initialize() {
		finish {
 			for(var p:long=0; p<R.size();p++) {
               val i:Point= Point.make(p);
		 		async  
                {
		 			var j:Long;	
		 			var count:Long=0;
		 			var index:Long = i.operator()(0);
			 		nodeSet(i) = new Node();
			 		nodeSet(i).leader = index;
			 		nodeSet(i).committee = -1;
			 		nodeSet(i).value = min_value(index);
			 		for(j=0; j<nodes; j++)
				 		if(adj_graph(index,j) == 1)
					 		count++;
			 		nodeSet(i).neighbors = new Rail[Long](count);
			 		count=0;
			 		for(j=0; j<nodes; j++)
				 		if(adj_graph(index,j) == 1) {
					 		nodeSet(i).neighbors(count) = j;
					 		count++;
				 		}
				 	nodeSet(i).invitation.from=-1;
				 	nodeSet(i).invitation.to=-1;		
		 		}
			}
 		}
 	}

	/** Resets the value of all holders. */
 	def nodeClear() {
 		finish {
		for(var p:long=0; p<R.size();p++) {
                val i:Point= Point.make(p);
		 		async 
                {
			 		nodeSet(i).minActive.messageclear();
			 		nodeSet(i).invitation.invclear();
			 		nodeSet(i).minActiveHolder.clear();
                    loadweight(0);

			 	}
			 }		
 		 } 
 	}
 



	/** Polls to select candidates capable of being leader. */ 
	def polling() {
	finish {
 			for(var p:long=0; p<R.size();p++) {
                    val i:Point= Point.make(p);
		 		async 
                {
					var index:Long = i.operator()(0);
					if(nodeSet(i).committee == -1)
						nodeSet(i).minActive.setData(index, nodeSet(i).value);
					else
						nodeSet(i).minActive.setData(-1, Null);	
                    loadweight(0);
				}
		 	}
 		}
  
		for(var kk:Long=0; kk<K-1; kk++) {
            finish {
                for(var p:long=0; p<R.size();p++) {
                    val i:Point= Point.make(p);
                    async 
                    {
                        for(var j:Long=0; j<nodeSet(i).neighbors.size; j++) {
                            var pt:Point = Point.make(nodeSet(i).neighbors(j));
                            sendMinActive(pt, nodeSet(i).minActive.from, nodeSet(i).minActive.value);
                        }
                        loadweight(0);
                    }
                }	
            }

            finish {
                for(var p:long=0; p<R.size();p++) {
                    val i:Point= Point.make(p);
                    async 
                    {
                        var ms:Message = null;
                        var minValue:Long = nodeSet(i).minActive.value;
                        var minId:Long = nodeSet(i).minActive.from;

                        for(var j:Long=nodeSet(i).minActiveHolder.size()-1; j>=0; j--) {
                            ms = nodeSet(i).minActiveHolder.get(j);
                            if(ms.value < minValue) {
                                minValue = ms.value;
                                minId = ms.from;
                            }
                        }
                        nodeSet(i).minActiveHolder.clear();
                        nodeSet(i).minActive.setData(minId, minValue);
                        loadweight(0);

                    }
                }
            }
        }
        finish {
            for(var p:long=0; p<R.size();p++) {
                val i:Point= Point.make(p);
                async 
                {
                    var pt:Point = Point.make(nodeSet(i).leader);
                    if(nodeSet(i).minActive.value < getLeaderValue(pt))
                        nodeSet(i).leader = nodeSet(i).minActive.from;	
                    loadweight(0);

                }
            }
        }
    
   	} 

	/** Selects nodes to be part of committee of the leader. */ 
    def selection() {
        finish {
            for(var p:long=0; p<R.size();p++) {
                val i:Point= Point.make(p);
                async 
                {
                    var index:Long = i.operator()(0);
                    if(nodeSet(i).leader == index) {
                        var inv:Invitation = new Invitation();
                        inv.from = index;	inv.to = nodeSet(i).minActive.from;	inv.leaderVal=nodeSet(i).value;
                        nodeSet(i).invitationHolder.add(inv);
                    }
                    loadweight(0);
                }
            }
        }
        for(var kk:Long=0; kk<K-1; kk++) {
            finish {
                for(var p:long=0; p<R.size();p++) {
                        val i:Point= Point.make(p);
                    async 
                    {
                        var invite:Invitation = null;
                        for(var j:Long=0; j<nodeSet(i).invitationHolder.size(); j++) {
                            invite = nodeSet(i).invitationHolder.get(j);
                            for(var k:Long=0; k<nodeSet(i).neighbors.size; k++) {
                                var pt:Point = Point.make(nodeSet(i).neighbors(k));
                                sendInvitation(pt, invite.from, invite.to, invite.leaderVal);
                            }	
                        }
                        nodeSet(i).invitationHolder.clear();	
                        loadweight(0);
                    }
                }
            }

            finish {
                for(var p:long=0; p<R.size();p++) {
                        val i:Point= Point.make(p);
                    async 
                    {
                        nodeSet(i).invitationHolder.clear();
                        if(nodeSet(i).tempInvitationHolder.size() > 0)
                            nodeSet(i).invitationHolder.add(nodeSet(i).tempInvitationHolder.get(0));
                        var flag:boolean=false;
                        var cinvite:Invitation = null;
                        var invite:Invitation = null;
                        for(var j:Long=1; j<nodeSet(i).tempInvitationHolder.size(); j++) {
                            flag = false;
                            invite = nodeSet(i).tempInvitationHolder.get(j);
                            for(var k:Long=0; k<nodeSet(i).invitationHolder.size(); k++) {
                                cinvite = nodeSet(i).invitationHolder.get(k);
                                if(cinvite.from == invite.from && cinvite.to == invite.to) {
                                    flag = true;
                                    break;
                                }
                            }
                            if(!flag)
                                nodeSet(i).invitationHolder.add(invite);
                        }
                        nodeSet(i).tempInvitationHolder.clear();

                        loadweight(0);
                    }
                }
            }		


            finish {
                for(var p:long=0; p<R.size();p++) {
                        val i:Point= Point.make(p);
                    async 
                    {
                        var flag:Boolean=false;
                        var index:Long = i.operator()(0);

                        if(nodeSet(i).invitationHolder.size() > 0) {
                            var invite:Invitation = null;
                            var mn:Long = Long.MAX_VALUE, ifrom:Long=-1;

                            for(var j:Long=nodeSet(i).invitationHolder.size()-1; j>=0; j--) {
                                invite=nodeSet(i).invitationHolder.get(j);
                                if(invite.to == index) {
                                    if(invite.leaderVal < mn) {
                                        mn =invite.leaderVal;
                                        ifrom = invite.from;
                                    }		
                                    nodeSet(i).invitationHolder.remove(invite);
                                    flag=true;
                                }
                            }					 
                            if(flag) {
                                nodeSet(i).invitation.from = ifrom;
                                nodeSet(i).invitation.to = index;
                                nodeSet(i).invitation.leaderVal = mn;
                            }
                            else {
                                nodeSet(i).invitation.from = -1;
                                nodeSet(i).invitation.to = Null;
                                nodeSet(i).invitation.leaderVal = -1;
                            }
                        }

                        loadweight(0);
                    }
                }
            }
        }

        finish {	 
            for(var p:long=0; p<R.size();p++) {
                    val i:Point= Point.make(p);
                async 
                {
                    var index:Long = i.operator()(0);
                    if(nodeSet(i).invitation.to == index)
                        nodeSet(i).committee = nodeSet(i).invitation.from;

                    loadweight(0);
                }
            }
        }		
				
	}

	/** Sets committee for nodes to be self which are left uninvited. */
    def selfCommittee() {
        finish {
            for(var p:long=0; p<R.size();p++) {
                    val i:Point= Point.make(p);
                async 
                {
                    var index:Long = i.operator()(0);	
                    if(nodeSet(i).committee == -1)
                        nodeSet(i).committee = index;

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
	def printCommittee(var fileName:String) {
		try {
			var j:Long;
			var fl:File = new File(fileName);
			var fw:FileWriter = new FileWriter(fl);
			for(var i:Long=0; i<nodes; i++) {
				val ipt:Point = Point.make(i);
				val comm:Long = at(D(ipt)) nodeSet(ipt).committee;
				var str:String = "Node " + i + "\t: Committee " + comm;

				for(j=0; j<str.length(); j++)
				{
					var jInt:Int = j as Int;
					var ch:Char = str.charAt(jInt);
					fw.writeChar(ch);
				}
				fw.writeChar('\n');
			}		
			fw.close();
		}
		catch(ex: x10.lang.Exception){}	
	}

	/** 
	 * Provides the value of the leader node. 
	 * 
	 * @param	aNode		Node whose leader is required.
	 * @return 			value of the leader.
	 */
	def getLeaderValue(val aNode:Point) {
		val leadVal:Long = nodeSet(aNode).value;
		return leadVal;
	}

	/** 
	 * Transmits the value of <code>minActive<\code> of a node.
	 *
	 * @param	neighbor	Node which recieves <code>minActive<\code>.
	 * @param	from		Node which provides <code>minActive<\code>.
	 * @param	value		<code>minActive<\code> value.
	 */
	def sendMinActive(val neighbor:Point, val from:Long, val value:Long) {
		var ms:Message = new Message();
		ms.setData(from, value);
		atomic { nodeSet(neighbor).minActiveHolder.add(ms); }
	}

	/** 
	 * Transmits the invitation from one node to another.
	 *
	 * @param	aNode		Node which recieves invitation.
	 * @param	from		Node which provides invitation.
	 * @param	to		Node to which invitation is meant.
	 * @param	leval		Leader value.
	 */
	def sendInvitation(val aNode:Point, val from:Long, val to:Long, val leval:Long) {
		var invite:Invitation = new Invitation();
		invite.from = from; 	invite.to = to;		invite.leaderVal = leval;
		atomic { nodeSet(aNode).tempInvitationHolder.add(invite); }
	}

	/** Validates the output resulting from the execution of the algorithm. */
    def outputVerifier() {
        var i:Long; 	var id:Long=-1;	var min:Long = Long.MAX_VALUE;	var alead:Long=-1;
        var flag:Boolean = false;
        var nodeComm:Rail[Long] = new Rail[Long](nodes);
        for(i=0; i<nodes; i++) {
            val pt:Point = Point.make(i);
            var comm:Long = nodeSet(pt).committee;
            nodeComm(comm) = nodeComm(comm) + 1;
        }
        for(i=0; i<nodes; i++)
            if(nodeComm(i) > K) {
                flag = true;
                break;
            }	
        if(!flag)
            Console.OUT.println("Output verified");	
        else
            Console.OUT.println("Output Wrong");	

    }	
}

/** Defines the structure of message to be sent out by a node. */
class Message
{
	var from:Long;
	var value:Long;

	def setData(val from:Long, val value:Long) {
		this.from = from; 		this.value = value;
	}
	def messageclear(){ from = -1; value = Long.MAX_VALUE;}
}

/** Defines the structure of an invitation to be sent out by a node. */
class Invitation
{
	var from:Long;		
	var to:Long;
	var leaderVal:Long;
	def invclear() { from = -1; to = -1; leaderVal=Long.MAX_VALUE;}
}

/**
 * <code>Node</code> specifies the structure for each abstract node
 * part of the K Committe algorithm.
 */
class Node
{
	/** Value (minimum active) corresponding to a node. */
	var value:Long;

	/** Specifies the leader for the node. */
	var leader:Long;

	/** Specifies the committee to which a node belongs. */
	var committee:Long;

	/** Specifies the set of neighbors for a node. */
	var neighbors:Rail[Long];

	/** Specifies the message, consisting of minimum value, to be sent by a node. */
	var minActive:Message = new Message();

	/** Specifies the invitation sent by a node. */	
	var invitation:Invitation = new Invitation();
	var invitationHolder:ArrayList[Invitation] = new ArrayList[Invitation]();
	var tempInvitationHolder:ArrayList[Invitation] = new ArrayList[Invitation]();
	var minActiveHolder:ArrayList[Message] = new ArrayList[Message]();
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
