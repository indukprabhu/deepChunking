/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2014.
 */

import harness.x10Test;
import x10.util.Box;
/**
 * Purpose: Checks boxed integer value is checks against primtive dependent type.
 * Issue: Constraint on self is not met.
 * vj: Fixed to deal with new boxing scheme in X10 2.0.
 * @author vcave
 **/
public class ObjectToPrimitiveConstrained3 extends x10Test {
	 
	public def run(): boolean = {
		var primitive:Box[Int]  = new Box[Int](3n);
		return !(primitive.value instanceof Int(4n));
	}
	
	public static def main(Rail[String]) {
		new ObjectToPrimitiveConstrained3().execute();
	}
}
