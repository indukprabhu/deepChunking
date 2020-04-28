package polyglot.visit;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.LLOAD;

import polyglot.ast.ArrayAccess_c;
import polyglot.ast.Assign_c;
import polyglot.ast.Expr;
import polyglot.ast.FieldAssign_c;
import polyglot.ast.Field_c;
import polyglot.ast.For_c;
import polyglot.ast.LocalAssign_c;
import polyglot.ast.LocalDecl;
import polyglot.ast.LocalDecl_c;
import polyglot.ast.Local_c;
import polyglot.ast.Node;
import polyglot.ast.NodeFactory;
import polyglot.ast.Receiver;
import polyglot.ast.Special_c;
import polyglot.ast.Stmt;
import polyglot.ast.Term;
import polyglot.frontend.Job;
import polyglot.types.LocalDef;
import polyglot.types.LocalDef_c;
import polyglot.types.Name;
import polyglot.types.SemanticException;
import polyglot.types.TypeSystem;
import polyglot.util.Position;
import polyglot.visit.FlowGraph.EdgeKey;
import x10.ast.StmtExpr_c;
import x10.ast.X10Call_c;
import x10.ast.X10Field_c;
import x10.ast.X10LocalDecl_c;
import x10.ast.X10Local_c;
import x10.ast.X10Special_c;
import x10.types.X10FieldInstance_c;
import x10.util.AltSynthesizer;
import x10.util.Synthesizer;

public class DefUseCheckerChunking extends ContextVisitor {

	
	private final TypeSystem ts;
	NodeFactory xnf;
	private AltSynthesizer syn;
	private Synthesizer synth;
	
	private static Position PCG = Position.COMPILER_GENERATED;
	private Job job;
	private Name varUseToCheck;
	public static boolean isRedefined;
	private static Stmt stmtInUse;
	private static boolean toOverrideAfterThis;
	public static Expr redefinedVarToReplace;
	public static Local_c redefinedVarToBeReplaced;
	public DefUseCheckerChunking(Job job, TypeSystem ts, NodeFactory xnf,Name varUseToCheck,Stmt stmtInUse) {
		super(job, ts, xnf);
		this.job = job;
		this.ts = ts;
		this.xnf = xnf;
		isRedefined=false;
		toOverrideAfterThis=false;
		this.stmtInUse=stmtInUse;
		this.varUseToCheck=varUseToCheck;
		syn = new AltSynthesizer(ts, xnf);
		synth = new Synthesizer(xnf, ts);
		

	}
     public Node override(Node n) {
		if(toOverrideAfterThis == true){
			return n; 
		}
		else
			return null;
	}
	
	
	protected NodeVisitor enterCall(Node parent, Node n) {
		  
		 if(n instanceof Stmt && n.position().equals(stmtInUse.position())){
			 toOverrideAfterThis = true;
		 }
		 return this;
		}
		
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		if(n instanceof FieldAssign_c){
			FieldAssign_c fa = ((FieldAssign_c)n);
			if( fa.left() instanceof FieldAssign_c && ((FieldAssign_c)fa.left()).name().toString().equals(varUseToCheck.toString()) )
			{
				//System.out.println(" this var is redifined "+((FieldAssign_c)fa.left()).name());
				isRedefined=true;
			}
		}
		/**
		 * case 2 : there is a function call which modifies the variables under consideration.
		 * here we assume that the functions that modify the varibles are
		 *  1) clear
		 *  2) add
		 *  3) remove
		 *  4) operator()= (in the case of a array writing)
		 * these function are considered by analysing the benchmark under consideration.
		 * If the function is of any of the above form, then check the receiver of the function
		 */
		else if(n instanceof X10Call_c){
			if( ((X10Call_c)n).name().toString().contains("clear") || ((X10Call_c)n).name().toString().contains("add") ||((X10Call_c)n).name().toString().contains("operator()=")
					|| ((X10Call_c)n).name().toString().contains("remove")){
				//case 1 the receiver is a Local variable
				if( ((X10Call_c)n).target() instanceof Local_c )
				{				
				Name nm = ((Local_c)((X10Call_c)n).target()).name().id();
				if(nm.toString().equals(varUseToCheck.toString())){
					//System.out.println(" this var is redifined "+nm);
					isRedefined=true;
				}
				} 
				//case 2 the receiver is a field reference
				else if( ((X10Call_c)n).target() instanceof Field_c )
				{				
				Name nm = ((Field_c)((X10Call_c)n).target()).name().id();
				if(nm.toString().equals(varUseToCheck.toString())){
					//System.out.println(" this var is redifined "+nm);
					isRedefined=true;
				}
				} 
				
			}
		}
		else if(n instanceof StmtExpr_c && ((StmtExpr_c)n).result() instanceof X10Call_c ){
			StmtExpr_c e = ((StmtExpr_c)n);
			if ( ((X10Call_c)e.result()).name().toString().contains("operator()=")){
				Stmt firstStmt = e.statements().get(0);
				if(firstStmt instanceof X10LocalDecl_c){
					Expr var =((LocalDecl_c)firstStmt).init();
					if(var instanceof X10Local_c && ((X10Local_c)var).name().toString().equals(varUseToCheck.toString())){
						
						//System.out.println(" this var is redifined "+((X10Local_c)var).name().id());
						isRedefined=true;
					}
					else if(var instanceof X10Field_c && ((X10Field_c)var).name().toString().equals(varUseToCheck.toString()) ){
						//System.out.println(" this var is redifined "+((X10Field_c)var).name());
						isRedefined=true;
					}
				}
				//System.out.print("");
				
			}
			
		}
		
		
		else if(n instanceof LocalAssign_c){
			LocalAssign_c la = ((LocalAssign_c)n);
			if( la.left() instanceof Local_c && ((Local_c)la.left()).name().toString().equals(varUseToCheck.toString()) )
			{
				//System.out.println(" this var is redifined "+((Local_c)la.left()).name());
				isRedefined=true;
			}
			
		}
		if(n instanceof LocalDecl_c){
			LocalDecl_c ld = ((LocalDecl_c)n);
			if(ld.name().toString().equals(varUseToCheck.toString())){
				//System.out.println(" this var is redifined "+varUseToCheck);
				isRedefined = true;
				
				Expr init = ld.init();
				/**
				 * The redefined variable if is using a class varible in any of the following form
				 *  1) array access.
				 *  2)filed access.
				 *  If it is using class variable then replace the local variable with class variable
				 *  Currently only array access is handeled.
				 */
				//case 1 array access
				if(init instanceof StmtExpr_c && ((StmtExpr_c)init).result() instanceof X10Call_c
						&& ((X10Call_c)((StmtExpr_c)init).result()).name().toString().equals("operator()")){
					Stmt firstStmt = ((StmtExpr_c)init).statements().get(0);
					
					if(firstStmt instanceof LocalDecl_c){
						if( ((LocalDecl_c)firstStmt).init().toString().startsWith("this") ){
							//System.out.println("class variable oK to use");
							isRedefined=false;
							redefinedVarToReplace=init;
							redefinedVarToBeReplaced=(Local_c)syn.createLocal(PCG,ld.localDef().asInstance());
						}
					}
					
				}
				
				
			}
			
			
		}
		
		
		
		return n;
	}
	
	
	
	
	

}
/**
 * @author.
 * given a expression or stmt the visitor creates a list of local variables used in that stmt.
 * The vistor checks for "localDef_c" that are used in the statement or expresion.
 * 
 */
class getVarUse extends ContextVisitor{

	public static ArrayList<Name> listUses;
	public getVarUse(Job job, TypeSystem ts, NodeFactory nf) {
		super(job, ts, nf);
		listUses=new ArrayList<Name>();
				// TODO Auto-generated constructor stub
	}
	
	protected Node leaveCall(Node parent, Node old, Node n, NodeVisitor v)
			throws SemanticException {
		
      if(n instanceof X10Call_c ){
			
    	  if( ((X10Call_c)n).name().toString().contains("size") || ((X10Call_c)n).name().toString().contains("get")  ){
    		  if( ((X10Call_c)n).target() instanceof Local_c )
    		  {

    			  Name nm = ((Local_c)((X10Call_c)n).target()).name().id();
    			  if(!(  nm.toString().equals("rank") ||  nm.toString().contains("$"))){
    				  if(!checkIfAlreadyPresent(nm)){
    					  listUses.add(nm);
    				  }
    			  }
    		  }
    	  }
		}
		
		
      if(n instanceof Local_c){
    	  if(!((Local_c)n).name().toString().contains("$")){
    		  Name nm = ((Local_c)n).name().id();
    		  if(!(  nm.toString().equals("rank") || nm.toString().contains("$"))){
    			  if(!checkIfAlreadyPresent(nm)){
    				  listUses.add(nm);
    			  }
    		  }
    	  }
      }
      if(n instanceof X10Field_c ){

    	  Name fieldName= ((X10Field_c)n).name().id();
    	  if(!( fieldName.toString().equals("rank") || fieldName.toString().contains("$") )){
    		  if(!checkIfAlreadyPresent(fieldName)){
    			  listUses.add(fieldName);
    		  }
    	  }
    	  //LocalDef ld = (LocalDef) ((X10Field_c)n).fieldInstance().def();

      }
		else if(n instanceof StmtExpr_c){
			StmtExpr_c e = ((StmtExpr_c)n);
			if ( e.result() instanceof X10Call_c &&  ((X10Call_c)e.result()).name().toString().contains("operator()")){
				Stmt firstStmt = e.statements().get(0);
				if(firstStmt instanceof X10LocalDecl_c){
					Expr var =((LocalDecl_c)firstStmt).init();
					if(var instanceof X10Local_c){
						if(!checkIfAlreadyPresent(((X10Local_c)var).name().id())){
							listUses.add(((X10Local_c)var).name().id());
						}
					}
					else if(var instanceof X10Field_c){
						if(!checkIfAlreadyPresent(((X10Field_c)var).name().id())){
						listUses.add(((X10Field_c)var).name().id());
						}
					}
				}
				//System.out.print("");
				
			}
			
		}
		
		
		return n;
	}
	boolean checkIfAlreadyPresent(Name name){
		boolean present = false;
		for(Name ni: listUses){
			if(ni.toString().equals(name.toString())){
				return true;
			}
		}
		return present;
	}
	
	
}

