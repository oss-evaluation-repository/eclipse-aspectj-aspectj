package ca.ubc.cs.spl.aspectPatterns.examples.proxy.java;

/* -*- Mode: Java; tab-width: 4; indent-tabs-mode: nil; c-basic-offset: 4 -*-
 *
 * This file is part of the design patterns project at UBC
 *
 * The contents of this file are subject to the Mozilla Public License
 * Version 1.1 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * either https://www.mozilla.org/MPL/ or https://aspectj.org/MPL/.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * The Original Code is ca.ubc.cs.spl.aspectPatterns.
 *
 * For more details and the latest version of this code, please see:
 * https://www.cs.ubc.ca/labs/spl/projects/aodps.html
 *
 * Contributor(s):
 */

/**
 * Acts as <i>RealSubject</i> according to GoF. It implements the
 * <code>OutputSubject</code> interface.
 *
 * @author  Jan Hannemann
 * @author  Gregor Kiczales
 * @version 1.1, 02/17/04
 */

public class OutputImplementation implements OutputSubject {

	/**
	 * A type of <i>request(..)</i>. Prints the argument string to
	 * <code>System.out</code>
	 *
	 * @param s the string to print
	 */

	public void safeRequest(String s) {
		System.out.println("[RealSubject.safeRequest()]: "+s);
	}

	/**
	 * A type of <i>request(..)</i>.
	 * <code>System.out</code>
	 *
	 * @param s the string to print
	 */

	public void regularRequest(String s) {
		System.out.println("[RealSubject.regularRequest()]: "+s);
	}

	/**
	 * A type of <i>request(..)</i>.
	 *
	 * @param s the string to print
	 */

	public void unsafeRequest(String s) {
		System.out.println("[RealSubject.unsafeRequest()]: "+s);
	}
}
