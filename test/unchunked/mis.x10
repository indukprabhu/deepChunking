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
 * mis aims to find a maximal independent set from a set of nodes,
 * The algorithm utilizes random identifiers to select a candidate
 * node for MIS.
 *
 * @author Suyash Gupta
 * @author V Krishna Nandivada
 */
public class mis 
{
	var adj_graph:Array[Long];
	var nodes:Long;
	val Infinity = Long.MAX_VALUE;
	
	/** Abstract node representation as a distributed array. */
	//var nodeSet:DistArray[node];
	var nodeSet:Array[node];

	/** Parameters to enable execution with load */
	var loadValue:long=0; 

	/** Load sum represented as a distributed array. */
	//var nval:DistArray[long];
	var nval:Array[long];
	
	/** Region and Distribution specification. */
	var R: Region;	var D: Dist;
	
	/** Other Distributed Array used. */
	//var rs: DistArray[Random];
	//var misSet:DistArray[Boolean];
	//var mark:DistArray[Boolean];
	var rs: Array[Random];
	var misSet:Array[Boolean];
	var mark:Array[Boolean];

	/** 
	 * Acts as the starting point for the program execution. 
	 * <code>main</code> performs the task of accepting the input from the user 
	 * specified file, creaton of MIS, printing the output and 
	 * validating the result.
	 *
	 * @param args 		array of runtime arguments.
	 * @throws Exception	if File handling operation illegal. 
	 */	
	public static def main(args:Rail[String]) throws Exception {
		var inputFile:String = "inputmis16.txt", outputFile:String = "outputmis16.txt";
		var i:Long,j:Long;
		var flag:Boolean = false;
		var ms:mis = new mis();

		for(i=0; i<args.size; i++)
		{
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
				ms.loadValue = Long.parse(args(i+1));
				i++;
			}	
			else
				Console.OUT.println("Wrong option specified");		
		}

		var fl:File = new File(inputFile);
		var fr:FileReader = new FileReader(fl);
		var s:String = fr.readLine();
		ms.nodes = Long.parse(s);
		ms.adj_graph = new Array[Long](Region.make(0..(ms.nodes-1), 0..(ms.nodes-1)));

		/** Region creation. */		
		ms.R = Region.make(0, (ms.nodes-1));
		
		/** Creation of a Block Distribution. */
     		ms.D = Dist.makeBlock(ms.R);
    		//ms.D = Dist.makeUnique();
    		//ms.R = ms.D.region;
    		
    		/** Distribution of nodes. */
    		ms.nodeSet = new Array[node](ms.R);
    		
    		/** Some more data getting distributed. */
    		ms.misSet = new Array[Boolean](ms.R);
    		ms.mark = new Array[Boolean](ms.R);
    		ms.rs = new Array[Random](ms.R);  
		ms.nval = new Array[long](ms.R);
		
		try {
			j=0;
			while((s = fr.readLine()) != null) {
				for(i=0; i<s.length(); i++) {
					var iInt:Int = i as Int;
					var ch:Char=s.charAt(iInt);
					if(ch=='0')
						ms.adj_graph(j,i) = 0;
					else
						ms.adj_graph(j,i) = 1;	
				}
				j++;
			}
		} catch(eof: x10.io.EOFException){}
		
		ms.initialize();
		
		var startTime:long = System.nanoTime();
		var someval:Double = (Math.log(ms.nodes)/Math.log(2));
		var phases:Long = (someval as Long);
		var again:boolean = false;
		do {
			ms.misForm();
			again = ms.countNeighbor();
		}while(again);
		ms.checkMark();	
		var finishTime:long = System.nanoTime();
		var estimatedTime:long =( finishTime - startTime)/1000000;
		Console.OUT.println("Start Time: " + startTime + "\t Finish Time: " + finishTime + "\t Estimated Time: " + estimatedTime);
		
		//ms.printMis(outputFile);
		if(flag)
			ms.outputVerifier();

		if(!ms.loadValue.equals(0)) {
			var sumval:double=0;
			for(i=0; i<ms.nodes; i++) {
				val pt:Point = Point.make(i);
				var arrSum:Long = ms.getNval(pt); 
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
			for( var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
				async 
                {
					nodeSet(i) = new node();
					val idex:Long = i.operator()(0);
					
					for(var j:Long=0; j<nodes; j++)
						if(adj_graph(idex,j) == 1)
							nodeSet(i).neighbors.add(j);
					rs(i) = new Random(i(0));
				}
			}
		}
		}

	/** 
	 * Aims to count the nodes which are still competing to be part of MIS.
	 *
	 * @return	true if there are still nodes competing for MIS.
	 */
	def countNeighbor():boolean {
		var flag:boolean = false;
		for(var i:Long=0; i<nodes; i++) {
			val pt:Point = Point.make(i);
			var neighSet:ArrayList[Long] = nodeSet(pt).neighbors;
			if(neighSet.size() > 0) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	/** Aims to create an MIS from a given set of nodes. */	
	def misForm() {
		finish {
				for( var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
				async  {
					val idex:Long = i.operator()(0);
					nodeSet(i).randomValue = rs(i).nextDouble();
					for(j in 0..(nodeSet(i).neighbors.size()-1)) {
						val pt:Point = Point.make(nodeSet(i).neighbors.get(j));
						sendVal(nodeSet(i).randomValue, pt);
					}

												
                    loadweight(0);
				}
			}
        }

		
                finish {
                    for( var p:long=0;p<R.size();p++) {
                        val i:Point=Point.make(p);
                        async  {
                            var j:Long;
                            var flag:Boolean=false;	
                            var minId:double = Long.MAX_VALUE;

                            for(j=0; j<nodeSet(i).neighborValue.size(); j++) {
                                var nvalue:Double=nodeSet(i).neighborValue.get(j);
                                if(minId.operator>(nvalue))
                                    minId = nvalue;
                            }		
                            if(minId.operator>(nodeSet(i).randomValue)) {
                                if(nodeSet(i).neighbors.size() > 0) {
                                    misSet(i) = true;
                                    mark(i) = true;
                                }	
                                for(k in 0..(nodeSet(i).neighbors.size()-1)) {
                                    val neighbor:Long = nodeSet(i).neighbors.get(k);
                                    val npt:Point = Point.make(neighbor);
                                    val idex:Long = i.operator()(0);

                                    {	atomic{  mark(npt) = true; }
                                    } 
                                    deleteEdge(npt, idex);
                                    deleteNeighbor(npt);
                                    deleteEdge(i, neighbor); 
                                }
                            }

                            loadweight(0);
                        }
                    }
                }
                finish {
                    for( var p:long=0;p<R.size();p++) {
                        val i:Point=Point.make(p);
                        async  {
                            if(nodeSet(i).neighbors.size() > 0) {
                                for(var j:Long=0; j<nodeSet(i).deleteQueue.size(); j++) {
                                    var nodeDelete:Long = nodeSet(i).deleteQueue.get(j);
                                    for(var k:Long=nodeSet(i).neighbors.size()-1; k>=0; k--) {
                                        var ndel:Long = nodeSet(i).neighbors.get(k);
                                        if(nodeDelete == ndel) {	
                                            nodeSet(i).neighbors.remove(ndel);
                                            break;
                                        }
                                    }
                                }

                            }
                            loadweight(0);
                        }
                    }
                }
		
		finish {
						for( var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
                async  {
                    nodeSet(i).deleteQueue.clear();
                    nodeSet(i).neighborValue.clear();		
                    loadweight(0);
                }
			}
		}
        }
       				
	
    

	/** Checks for unmarked nodes and adds them to MIS. */	
    def checkMark() {
        finish {
            for( var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
                async  {
                    if(!mark(i))
                        misSet(i)=true;
                    loadweight(0);
                }		
            }		
        }
    }
	
	/** 
	 * Adding a node to the <code>deleteQueue</code> of target node.
	 * 
	 * @param	neighbor	Whose <code>deleteQueue</code> has to be modified.
	 * @param	sender		Node to be added to the <code>deleteQueue</code>.
	 */	
	def deleteEdge(val neighbor:Point, val sender:Long) {
			atomic { nodeSet(neighbor).deleteQueue.add(sender); }
	}
	
	/** 
	 * Delete the neighbor of a node.
	 *
	 * @param	aNode		Whose neighbors are to be marked for deletion.
	 */	
	def deleteNeighbor(val anode:Point) {
				for(var j:Long=0; j<nodeSet(anode).neighbors.size(); j++) {
					var neighbor:Long = nodeSet(anode).neighbors.get(j);
					val npt:Point = Point.make(neighbor);
					val idex:Long = anode.operator()(0);
					deleteEdge(npt, idex);
					deleteEdge(anode, neighbor); 
				}
	}				 
	
	/** 
	 * Sends the random value to the neighbor.
	 *
	 * @param	value		Random value.
	 * @param	neighbor	Value receiver.
	 */
	def sendVal(val value:Double, val neighbor:Point) {
			atomic { nodeSet(neighbor).neighborValue.add(value); }
	}
	
	/** 
	 * Writes the output to the user specified file.
	 * 
	 * @param  fileName	Name of the file in which output has to be stored.
	 * @throws 		input output exception if a failure in write occurs.
	 */
	def printMis(var fileName:String) {
  		try {
 			var fl:File = new File(fileName);
			fw:FileWriter = new FileWriter(fl);
			var str:String;
			for(var i:Long=0; i<nodes; i++) {
				val pt: Point = Point.make(i);
				var ismis: Boolean = false;
							if(misSet(pt))
								ismis = true;
				if(ismis) {
					str="\n" + i;
					for(var j:Long=0; j<str.length(); j++) {
						var jInt:Int = j as Int;
						var ch:Char = str.charAt(jInt);
						fw.writeChar(ch);
					}
				}
			}
			fw.close();
		} catch(ex: x10.lang.Exception){}
  	}
  	
  	/** Validates the output resulting from the execution of the algorithm. */  	
  	def outputVerifier() {
		var i:Long;
		var flag:Boolean = false, setNodes:Rail[Boolean] = new Rail[Boolean](nodes);
		var misNodes:Rail[Boolean] = new Rail[Boolean](nodes);
		
		for(i=0; i<nodes; i++) {
			val pt: Point = Point.make(i);
			var ismis: Boolean = false;
						if(misSet(pt))
							ismis = true;
			if(ismis) {
				misNodes(i) = true;
				for(var j:Long=0; j<nodes; j++)
					if(adj_graph(i,j) == 1)
						setNodes(j) = true;
			}			
		}				
		for(i=0; i<nodes; i++) {
			if(misNodes(i) && setNodes(i)) {
				flag = true;
				break;
			}
			else if(!setNodes(i) && !misNodes(i)) {
				flag = true;
				break;
			}	
		}
		if(!flag)
			Console.OUT.println("Output verified");
        else
			Console.OUT.println("Output wrong");
	}
}

/**
 * <code>node</code> specifies the structure for each abstract node,
 * part of the MIS algorithm.
 */
class node
{
	/** Specifies the random value selected for a node. */
	var randomValue:Double;
	
	/** Specifies the set of neighbors of a node. */
	var neighbors:ArrayList[Long] = new ArrayList[Long]();

	/** Stores the information about neighors to be deleted. */	
	var deleteQueue:ArrayList[Long] = new ArrayList[Long]();
	
	/** Mailbox to store the received random values of neighbors. */
	var neighborValue:ArrayList[Double] = new ArrayList[Double]();
}
class chunk
{
    var myChunkStart:long;
    var myChunkEnd:long;
    var myCost:long;
    def this(){
        myChunkStart = -1;
        myChunkEnd   =-2;
    }
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
