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
 * vertexColoring aims to color the vertices of a tree with 
 * three colors.
 *
 * @author Suyash Gupta
 * @author V Krishna Nandivada
 */
public class vertexColoring 
{
    var adj_graph:Array[Long], parent:Rail[Long], nodes:Long, root:Long, label:Long, nlabel:Rail[Long], colormat:Rail[Long];

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

    /** Other Distributed Array used. */
    //var again:DistArray[boolean];
    var again:Array[boolean];

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
        var inputFile:String = "inputVC.txt", outputFile:String = "outputVC.txt";
        var i:Long,j:Long;
        var flag:Boolean = false;
        var vc:vertexColoring = new vertexColoring();

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
                vc.loadValue = Long.parse(args(i+1));
                i++;
            }	
            else
                Console.OUT.println("Wrong option spcified");		
        }

        var fl:File = new File(inputFile);
        var fr:FileReader = new FileReader(fl);
        var s:String = fr.readLine();
        vc.nodes = Long.parse(s);
        vc.parent = new Rail[Long](vc.nodes);
        vc.nlabel = new Rail[Long](vc.nodes);
        vc.adj_graph = new Array[Long](Region.make(0..(vc.nodes-1), 0..(vc.nodes-1)));

        /** Region creation. */		
        vc.R = Region.make(0, (vc.nodes-1));

        /** Creation of a Block Distribution. */
        vc.D = Dist.makeBlock(vc.R);
        //vc.D = Dist.makeUnique();
        //vc.R = vc.D.region;

        /** Distribution of nodes. */
        vc.nodeSet = new Array[Node](vc.R);

        /** Some more data getting distributed. */
        vc.again = new Array[boolean](vc.R);		
        vc.nval = new Array[long](vc.R);

        s = fr.readLine();
        vc.root = Long.parse(s);
        try {
            j=0;
            while(!((s = fr.readLine()).equals(" "))) {
                for(i=0; i<s.length(); i++) {
                    var iInt:Int = i as Int;
                    var ch:Char=s.charAt(iInt);
                    if(ch=='0')
                        vc.adj_graph(j,i) = 0;
                    else
                        vc.adj_graph(j,i) = 1;	
                }
                j++;
            }
        } catch(eof: x10.io.EOFException){}

        try {
            j=0;
            while((s = fr.readLine()) != null) {
                vc.parent(j) = Long.parse(s);
                j++;
            }
        } catch(eof: x10.io.EOFException){}	

        vc.initialize();

        var startTime:long = System.nanoTime();
        vc.run();
        vc.six2three();
        var finishTime:long = System.nanoTime();
        var estimatedTime:long =( finishTime - startTime)/1000000;
        Console.OUT.println("Start Time: " + startTime + "\t Finish Time: " + finishTime + "\t Estimated Time: " + estimatedTime);

        //vc.printOutput(outputFile);
        if(flag)
            vc.outputVerifier();

        if(!vc.loadValue.equals(0)) {
            var sumval:double=0;
            for(i=0; i<vc.nodes; i++) {
                val pt:Point = Point.make(i);
                var arrSum:Long = vc.getNval(pt); 
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
            for(var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
               // async 
                {
                    var j:Long; var count:Long=0;
                    val idx:Long = i.operator()(0);
                    nlabel(idx) = idx;
                    nodeSet(i) = new Node();
                    nodeSet(i).parent = parent(idx);
                    for(j=0; j<nodes; j++)
                        if(adj_graph(idx,j) == 1 && parent(idx) != j)
                            count++;
                    nodeSet(i).children = new Rail[Long](count);		
                    count=0;
                    for(j=0; j<nodes; j++)
                        if(adj_graph(idx,j) == 1 && parent(idx) != j) {
                            nodeSet(i).children(count) = j;
                            count++;
                        }
                    nodeSet(i).color = nlabel(idx);	
                }
            }
        }
        var someval:Double = (Math.log(nodes)/Math.log(2));
        label = (someval as Long);
        if((1 << label) < nodes)
            label++;
    }

    /** Runs the algorithm till the graph consists of atmost six colors. */	
    def run() {
        val rt:Point = Point.make(root);
        nodeSet(rt).color = 0;
        var cflag:boolean = false; 		
        do {		
            sixColor();
            cflag = checkAgain();
        }while(cflag);				
    }

    /**
     * Determines the number of different colors used in the graph.
     *
     * @return 	true if there is no color >= 6.
     */
    def checkAgain():boolean {
        var flag:boolean = false;
        for(i in R) {
            flag = again(i);
            if(flag)
                break;		
        }
        return flag;
    }

    /** Reduces the number of colors used in the graph to six. */
    def sixColor() {
        finish { 		  
            for(var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
                async
                {
                    again(i) = false;
                    for(j in 0..(nodeSet(i).children.size-1)) {	
                        val cpt:Point = Point.make(nodeSet(i).children(j));
                        sendColor(cpt, nodeSet(i).color);
                    }
                    loadweight(0);
                }	
            }
        }	

        finish {
            for(var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
                async  {
                    val idx:Long = i.operator()(0);
                    if(idx != root) {
                        var xored:Long = nodeSet(i).receivedColor ^ nodeSet(i).color;
                        for(var k:Long=0; k<label; k++) {
                            var pval:Long = 1 << k;
                            var nand:Long = xored & pval;
                            if(nand == pval) {
                                var nxored:Long = nodeSet(i).color & pval;
                                if(nxored == 0)
                                    nodeSet(i).color = 2*k + 0;
                                else
                                    nodeSet(i).color = 2*k + 1;
                                break;
                            } 
                        }
                        if(nodeSet(i).color >= 6)
                            again(i) = true;
                    }
                    loadweight(0);
                }
            }
        }
    }		

    /** Reduces the number of colors from six to three. */
    def six2three() {
        for(var x:Long=5; x>2; x--) {
            shiftDown();
            val rt:Point = Point.make(root);
            val currentIter:Long = x;
            var r:Random = new Random();
            var ncolor:Long = r.nextLong(3);
            if(nodeSet(rt).color == ncolor)
                ncolor = (ncolor+1)%3;
            nodeSet(rt).color = ncolor;

            finish {
                for(var p:long=0;p<R.size();p++) {
                    val i:Point=Point.make(p);
                    async  {
                        var cparent:Long=0,cchild:Long=0;

                        if(nodeSet(i).color == currentIter) {
                            val cpr:Point = Point.make(nodeSet(i).parent);
                            cparent=getColor(cpr);
                            if(nodeSet(i).children.size >0) {
                                val cpt:Point = Point.make(nodeSet(i).children(0));
                                cchild=getColor(cpt);
                            }	
                            if(cparent+cchild == 1)
                                nodeSet(i).color=2;
                            else if(cparent+cchild == 2)
                                nodeSet(i).color=1;
                            else if(cparent+cchild == 3) {
                                if(cparent != 0 && cchild != 0)
                                    nodeSet(i).color=0;
                                else
                                    nodeSet(i).color=1;
                            }
                            else if(cparent+cchild == 4) {
                                if(cparent != 0 && cchild != 0)
                                    nodeSet(i).color=0;
                                else
                                    nodeSet(i).color=1;
                            }	 					
                            else if(cparent+cchild == 5) {
                                if(cparent != 0 && cchild != 0)
                                    nodeSet(i).color=0;
                                else
                                    nodeSet(i).color=1;
                            }
                            else
                                nodeSet(i).color = 0;
                        }


                        loadweight(0);
                    }
                }
            }	
        }			
    }

    /** Shifts the color of parent down to its children. */ 	
    def shiftDown() {
        finish {
            for(var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
                async 
                {
                    for(j in 0..(nodeSet(i).children.size-1)) {
                        val cpt:Point = Point.make(nodeSet(i).children(j));
                        sendColor(cpt, nodeSet(i).color);
                    }
                    loadweight(0);
                }
            }
        }	
        finish {
            for(var p:long=0;p<R.size();p++) {
                val i:Point=Point.make(p);
                async  {
                    val idx:Long = i.operator()(0);
                    if(idx != root)
                        nodeSet(i).color = nodeSet(i).receivedColor;
                    loadweight(0);
                }
            }
        }
    }

    /**
     * Provides the color of the <code>aNode<\code>.
     * @param   aNode 	node whose color value is required.
     * @return  		color of <code>aNode<\code>.
     */ 	
    def getColor(val aNode:Point):Long {
        val Color:Long = nodeSet(aNode).color;
        return Color;
    }

    /**
     * Sends the color of the parent node to a child node.
     * @param   childNode 	node whose color is to be changed
     * @return  acolor	color of the parent node.
     */
    def sendColor(val childNode:Point, val acolor:Long) {
        nodeSet(childNode).receivedColor = acolor;
    }

    /** 
     * Writes the output to the user specified file.
     * 
     * @param  fileName	Name of the file in which output has to be stored.
     * @throws 		input output exception if a failure in write occurs.
     */ 	
    def printOutput(var fileName:String) {
        try {
             var fl:File = new File(fileName);
             fw:FileWriter = new FileWriter(fl);
                var str:String;
                for(var q:Long=0; q<nodes; q++) {
                    val pt:Point = Point.make(q);
                    val color:Long = nodeSet(pt).color;
                    str="\n Node " + q + ": \t Color " + color;
                    for(var j:Long=0; j<str.length(); j++) {
                        var jInt:Int = j as Int;
                        var ch:Char = str.charAt(jInt);
                        fw.writeChar(ch);
                    } 			
                }
        } catch(ex: x10.lang.Exception){}	
    }

    /** Validates the output resulting from the execution of the algorithm. */   	
    def outputVerifier() {
        var k:Long;
        var count:Long=0; 
        var colormat:Rail[Long] = new Rail[Long](nodes);
        var flag:Boolean = false;
        for(k=0; k<nodes; k++)
            colormat(k)=-1;

        for(k=0; k<nodes; k++) {
            val pt:Point = Point.make(k);
            val color:Long = nodeSet(pt).color;
            if(colormat(color) <0) {
                colormat(color)=0;
                count++;
            }
        }
        if(count <= 3) {
            for(i in D) {
                var lflag:Boolean=false;
                var idx:Long = i.operator()(0);
                if(idx != root) {	
                    val cpt:Point = Point.make(nodeSet(i).parent);
                    val cpar:Long = nodeSet(cpt).color;
                    if(nodeSet(i).color == cpar)
                        flag = true;
                }	 					
                for(var j:Long=0; j<nodeSet(i).children.size; j++) {
                    val cpt:Point = Point.make(nodeSet(i).children(j));
                    val cchild:Long = nodeSet(cpt).color;
                    if(nodeSet(i).color == cchild) {
                        flag = true;
                        break;
                    }
                }	
            }
            if(!flag)
                Console.OUT.println("Output verified");	
            else
                Console.OUT.println("Output wrong");	

        }
    }
}

/**
 * <code>Node</code> specifies the structure for each abstract node,
 * part of the Vertex coloring algorithm.
 */
class Node
{
	/** Specifies the parent of a node. */
	var parent:Long;
	
	/** Identifies the children of a node. */				
	var children:Rail[Long];
	
	/** Specifies the color of a node. */	
	var color:Long;
	
	/** Specifies the color received by a node. */
	var receivedColor:Long;
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
    static public def divideWork (var nproc:long,var t_proc: long, var n:long,  val blockSize:long,  var costArray:Rail[long],   var partialCostArr:Rail[long] ): chunk{
        var myChunk:chunk = new chunk();
        var totCost:long=0;
        for(var i:long=0;i<nproc;i++){
            totCost += partialCostArr(i);
        }
        var avgcost:long = totCost / nproc;
        var costIt:long=0;
        val delta:double = Runtime.CHUNK_DELTA;
       //Console.OUT.println("delta "+delta);
        val deltaCost:long=(delta*avgcost) as long;
        val avgtproc:long=avgcost*t_proc;
        //var ignoreCost:long = avgcost*(t_proc);
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
        //var myCost:long = 0;
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
        //Console.OUT.println("id "+t_proc+" start "+myChunk.myChunkStart+" end "+myChunk.myChunkEnd);
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
class WriteToHistoryFile{
    var timerDone:ArrayList[String];
    public def this(){
        timerDone = new ArrayList[String]();
    }
    public  def writeToFile(var  timer:String , var time:Double , var flush:boolean, var itPresent:boolean, 
            var itIndex:long, var forIndex:long){
        if(!flush){
            //Console.OUT.println(" inside writeto file it not present "+time);
            val toWrite : String = timer+" "+time;
            timerDone.add(toWrite);
        }
        else {
            try {
                //Console.OUT.println(" done array size "+timerDone.size());
                var str:String;
                var fl:File = new File("/home/induk/workspace/testprgms/src/classFiles/profileResults.txt");
                if (fl.isFile() && fl.canRead()) {

                    var fw:FileWriter = new FileWriter(fl,true);
                    if(itPresent){
                        str = "-1 Loop "+forIndex+" IterationEnd "+itIndex;
                        timerDone.add( str);
                        //Console.OUT.println(" timer updated "+timerDone.size());
                    }
                    for(var i:long=0;i<timerDone.size();i++){
                        str=timerDone.get(i);
                        for(var j:Long=0; j<str.length(); j++) {
                            var jInt:Int = j as Int;
                            var ch:Char = str.charAt(jInt);
                            fw.writeChar(ch);
                        }
                        fw.writeChar('\n');
                    }
                    timerDone.clear();
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
