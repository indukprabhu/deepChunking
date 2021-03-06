/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2011.
 */

import harness.x10Test;

/**
 * Test ULong.typeName().
 *
 * @author Salikh Zakirov 5/2011
 */
public class ULongTypename extends x10Test {
    public def run(): boolean = {
	val u1 = 1ul;
	val a1 = u1 as Any;
	if (!(u1.typeName().equals("x10.lang.ULong"))) return false;
	if (!(a1.typeName().equals("x10.lang.ULong"))) return false;
	if (!new Typed[ULong]().f(u1).equals("x10.lang.ULong")) return false;
	if (!new Typed[Any]().f(a1).equals("x10.lang.ULong")) return false;
	return true;
    }

    static class Typed[T] {
	def f(x:T):String {
	    return x.typeName();
	}
    }

    public static def main(Rail[String]) {
        new ULongTypename().execute();
    }
}
