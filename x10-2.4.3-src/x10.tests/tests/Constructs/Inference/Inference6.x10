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

/**
 * Inference of method type parameters and method return type
 * with generic types.
 *
 * @author nystrom 8/2008
 */
public class Inference6 extends x10Test {
        def m[T](x: Rail[T]) = x(0);

	public def run(): boolean = {
                val x = m([1n]);
                val y: int = x;
		return y == 1n;
	}

	public static def main(var args: Rail[String]): void = {
		new Inference6().execute();
	}
}

