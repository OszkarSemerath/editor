//=====================================================================
//
//File:      $RCSfile: UnitTestGenerator.pl,v $
//Version:   $Revision: 1.14 $
//Modified:  $Date: 2013/01/10 23:21:36 $
//
// WARNING:      Do not edit this generated file
// Generated by: UnitTestGenerator.pl
// Version:      1.14
// Matrix:       CopyPasteSourceDestinationTestMatrix.txt
//
//(c) Copyright 2007-2014 by Mentor Graphics Corp. All rights reserved.
//
//=====================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
// 
//       http://www.apache.org/licenses/LICENSE-2.0
// 
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//=====================================================================

package com.mentor.nucleus.bp.core.test.cpts;

import java.io.File;

import junit.framework.Test;
import junit.framework.TestSuite;
import com.mentor.nucleus.bp.core.test.cpts.*;

public class CopyPasteSourceDestinationTestsTestSuite extends TestSuite {

    /**
     * Returns the suite.  This is required to
     * use the JUnit Launcher.
     */
    public static Test suite() {
        return new CopyPasteSourceDestinationTestsTestSuite();
    }

    /**
     * Construct the test suite.
     */
    public CopyPasteSourceDestinationTestsTestSuite()
    {
        addTest(new TestSuite(CopyPasteSourceDestinationTests_0.class));
        addTest(new TestSuite(CopyPasteSourceDestinationTests_1.class));
        addTest(new TestSuite(CopyPasteSourceDestinationTests_2.class));
    }
}

