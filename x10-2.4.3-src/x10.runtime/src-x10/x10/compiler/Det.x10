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

package x10.compiler;

import x10.lang.annotations.MethodAnnotation;
import x10.lang.annotations.StatementAnnotation;

/**
 * This annotation is used to mark a statement or method as determinate.

 * <p> This annotation is currently purely for documentation. Will be checked
 * in subsequent versions of the compiler.
 */
public interface Det extends MethodAnnotation, StatementAnnotation { }