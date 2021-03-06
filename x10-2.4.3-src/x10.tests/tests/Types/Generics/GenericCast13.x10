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

//LIMITATION:

import harness.x10Test;



/**
 * @author bdlucas 8/2008
 */

public class GenericCast13 extends GenericTest {

    interface I[T] {
        def m(T):long;
    }

    interface J[T] {
        def m(T):long;
    }

    class A implements I[long], J[String] {
        public def m(long) = 0;
        public def m(String) = 1;
    }

    public def run() = {
        
        var a:Any = new A();

        var exceptions:long = 0;

        try {
            var i:I[String] = a as I[String]; // ERR: Warning: This is an unsound cast because X10 currently does not perform constraint solving at runtime for generic parameters.
        } catch (ClassCastException) {
            exceptions++;
        }

        try {
            var j:J[long] = a as J[long]; // ERR: Warning: This is an unsound cast because X10 currently does not perform constraint solving at runtime for generic parameters.
        } catch (ClassCastException) {
            exceptions++;
        }

        return exceptions==2;
    }

    public static def main(var args: Rail[String]): void = {
        new GenericCast13().execute();
    }
}
