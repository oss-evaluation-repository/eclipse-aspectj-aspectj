package ca.ubc.cs.spl.aspectPatterns.examples.bridge.java;

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
 * Prints/draws the current system time in a text box. Represents a
 * <i>RefinedAbstraction</i> in the context of the Bridge design pattern.
 *
 * @author  Jan Hannemann
 * @author  Gregor Kiczales
 * @version 1.1, 01/26/04
 *
 */

import java.util.Date;

public class InformationScreen extends Screen {


    /**
     * Creates a new <code>InformationScreen</code> object with the provided
     * <i>Implementor</i>.
     *
     * @param si the implementor to use
     */

    public InformationScreen(ScreenImplementation si) {
        super(si);
    }


    /**
     * Draws/prints the system time in a text box
     */

    public void drawInfo() {
        Date date = new Date();
        drawTextBox("Current system time: "+date);
    }
}
