//=====================================================================
//
//File:      $RCSfile: UnitTestGenerator.pl,v $
//Version:   $Revision: 1.14 $
//Modified:  $Date: 2013/01/10 23:21:36 $
//
// WARNING:      Do not edit this generated file
// Generated by: UnitTestGenerator.pl
// Version:      1.14
// Matrix:       graphical_anchors.txt
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

package com.mentor.nucleus.bp.ui.canvas.test.anchors;

import org.eclipse.ui.IEditorPart;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.test.common.*;
import com.mentor.nucleus.bp.ui.canvas.*;
import com.mentor.nucleus.bp.ui.graphics.editor.*;
import com.mentor.nucleus.bp.ui.canvas.test.*;

public class GraphicalAnchorTests_0 extends GraphicalAnchorTests {

	protected String getResultName() {
		return super.getResultName();
	}

	public GraphicalAnchorTests_0(String arg0) {
		super("GraphicalAnchorTests_0", arg0);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Perform the test for the given matrix column (A1) and row (B1C1).
	 * 
	 */
	public void testA1_B1C1() {
		test_id = getTestId("A1", "B1C1", "1");

		NonRootModelElement src = selectA("A1");

		NonRootModelElement dest = selectBC("B1C1");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A1) and row (B2C1).
	 * 
	 */
	public void testA1_B2C1() {
		test_id = getTestId("A1", "B2C1", "2");

		NonRootModelElement src = selectA("A1");

		NonRootModelElement dest = selectBC("B2C1");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not properly cropped.",
				checkResult_dropPointCroppedToEdge(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A1) and row (B1C2).
	 * 
	 */
	public void testA1_B1C2() {
		test_id = getTestId("A1", "B1C2", "3");

		NonRootModelElement src = selectA("A1");

		NonRootModelElement dest = selectBC("B1C2");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A1) and row (B2C2).
	 * 
	 */
	public void testA1_B2C2() {
		test_id = getTestId("A1", "B2C2", "4");

		NonRootModelElement src = selectA("A1");

		NonRootModelElement dest = selectBC("B2C2");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not properly cropped.",
				checkResult_dropPointCroppedToEdge(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A1) and row (B1C3).
	 * 
	 */
	public void testA1_B1C3() {
		test_id = getTestId("A1", "B1C3", "5");

		NonRootModelElement src = selectA("A1");

		NonRootModelElement dest = selectBC("B1C3");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A1) and row (B2C3).
	 * 
	 */
	public void testA1_B2C3() {
		test_id = getTestId("A1", "B2C3", "6");

		NonRootModelElement src = selectA("A1");

		NonRootModelElement dest = selectBC("B2C3");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not properly cropped.",
				checkResult_dropPointCroppedToEdge(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A1) and row (B3C3).
	 * 
	 */
	public void testA1_B3C3() {
		test_id = getTestId("A1", "B3C3", "7");

		NonRootModelElement src = selectA("A1");

		NonRootModelElement dest = selectBC("B3C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The anchor did not use proper closest point when no intersection present.",
				checkResult_closestPointUsed(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A2) and row (B1C1).
	 * 
	 */
	public void testA2_B1C1() {
		test_id = getTestId("A2", "B1C1", "8");

		NonRootModelElement src = selectA("A2");

		NonRootModelElement dest = selectBC("B1C1");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A2) and row (B2C1).
	 * 
	 */
	public void testA2_B2C1() {
		test_id = getTestId("A2", "B2C1", "9");

		NonRootModelElement src = selectA("A2");

		NonRootModelElement dest = selectBC("B2C1");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not properly cropped.",
				checkResult_dropPointCroppedToEdge(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A2) and row (B1C2).
	 * 
	 */
	public void testA2_B1C2() {
		test_id = getTestId("A2", "B1C2", "10");

		NonRootModelElement src = selectA("A2");

		NonRootModelElement dest = selectBC("B1C2");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A2) and row (B2C2).
	 * 
	 */
	public void testA2_B2C2() {
		test_id = getTestId("A2", "B2C2", "11");

		NonRootModelElement src = selectA("A2");

		NonRootModelElement dest = selectBC("B2C2");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not properly cropped.",
				checkResult_dropPointCroppedToEdge(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A2) and row (B1C3).
	 * 
	 */
	public void testA2_B1C3() {
		test_id = getTestId("A2", "B1C3", "12");

		NonRootModelElement src = selectA("A2");

		NonRootModelElement dest = selectBC("B1C3");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A2) and row (B2C3).
	 * 
	 */
	public void testA2_B2C3() {
		test_id = getTestId("A2", "B2C3", "13");

		NonRootModelElement src = selectA("A2");

		NonRootModelElement dest = selectBC("B2C3");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not properly cropped.",
				checkResult_dropPointCroppedToEdge(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A2) and row (B3C3).
	 * 
	 */
	public void testA2_B3C3() {
		test_id = getTestId("A2", "B3C3", "14");

		NonRootModelElement src = selectA("A2");

		NonRootModelElement dest = selectBC("B3C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The anchor did not use proper closest point when no intersection present.",
				checkResult_closestPointUsed(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A3) and row (B1C1).
	 * 
	 */
	public void testA3_B1C1() {
		test_id = getTestId("A3", "B1C1", "15");

		NonRootModelElement src = selectA("A3");

		NonRootModelElement dest = selectBC("B1C1");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the start of the target.",
				checkResult_dropPointMovedToConnectorStart(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A3) and row (B2C1).
	 * 
	 */
	public void testA3_B2C1() {
		test_id = getTestId("A3", "B2C1", "16");

		NonRootModelElement src = selectA("A3");

		NonRootModelElement dest = selectBC("B2C1");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the start of the target.",
				checkResult_dropPointMovedToConnectorStart(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A3) and row (B1C2).
	 * 
	 */
	public void testA3_B1C2() {
		test_id = getTestId("A3", "B1C2", "17");

		NonRootModelElement src = selectA("A3");

		NonRootModelElement dest = selectBC("B1C2");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the start of the target.",
				checkResult_dropPointMovedToConnectorStart(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A3) and row (B2C2).
	 * 
	 */
	public void testA3_B2C2() {
		test_id = getTestId("A3", "B2C2", "18");

		NonRootModelElement src = selectA("A3");

		NonRootModelElement dest = selectBC("B2C2");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the start of the target.",
				checkResult_dropPointMovedToConnectorStart(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A3) and row (B1C3).
	 * 
	 */
	public void testA3_B1C3() {
		test_id = getTestId("A3", "B1C3", "19");

		NonRootModelElement src = selectA("A3");

		NonRootModelElement dest = selectBC("B1C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the start of the target.",
				checkResult_dropPointMovedToConnectorStart(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A3) and row (B2C3).
	 * 
	 */
	public void testA3_B2C3() {
		test_id = getTestId("A3", "B2C3", "20");

		NonRootModelElement src = selectA("A3");

		NonRootModelElement dest = selectBC("B2C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the start of the target.",
				checkResult_dropPointMovedToConnectorStart(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A3) and row (B3C3).
	 * 
	 */
	public void testA3_B3C3() {
		test_id = getTestId("A3", "B3C3", "21");

		NonRootModelElement src = selectA("A3");

		NonRootModelElement dest = selectBC("B3C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the start of the target.",
				checkResult_dropPointMovedToConnectorStart(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A4) and row (B1C1).
	 * 
	 */
	public void testA4_B1C1() {
		test_id = getTestId("A4", "B1C1", "22");

		NonRootModelElement src = selectA("A4");

		NonRootModelElement dest = selectBC("B1C1");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the end of the target.",
				checkResult_dropPointMovedToConnectorEnd(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A4) and row (B2C1).
	 * 
	 */
	public void testA4_B2C1() {
		test_id = getTestId("A4", "B2C1", "23");

		NonRootModelElement src = selectA("A4");

		NonRootModelElement dest = selectBC("B2C1");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the end of the target.",
				checkResult_dropPointMovedToConnectorEnd(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A4) and row (B1C2).
	 * 
	 */
	public void testA4_B1C2() {
		test_id = getTestId("A4", "B1C2", "24");

		NonRootModelElement src = selectA("A4");

		NonRootModelElement dest = selectBC("B1C2");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the end of the target.",
				checkResult_dropPointMovedToConnectorEnd(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A4) and row (B2C2).
	 * 
	 */
	public void testA4_B2C2() {
		test_id = getTestId("A4", "B2C2", "25");

		NonRootModelElement src = selectA("A4");

		NonRootModelElement dest = selectBC("B2C2");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the end of the target.",
				checkResult_dropPointMovedToConnectorEnd(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A4) and row (B1C3).
	 * 
	 */
	public void testA4_B1C3() {
		test_id = getTestId("A4", "B1C3", "26");

		NonRootModelElement src = selectA("A4");

		NonRootModelElement dest = selectBC("B1C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the end of the target.",
				checkResult_dropPointMovedToConnectorEnd(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A4) and row (B2C3).
	 * 
	 */
	public void testA4_B2C3() {
		test_id = getTestId("A4", "B2C3", "27");

		NonRootModelElement src = selectA("A4");

		NonRootModelElement dest = selectBC("B2C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the end of the target.",
				checkResult_dropPointMovedToConnectorEnd(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A4) and row (B3C3).
	 * 
	 */
	public void testA4_B3C3() {
		test_id = getTestId("A4", "B3C3", "28");

		NonRootModelElement src = selectA("A4");

		NonRootModelElement dest = selectBC("B3C3");

		A_BC_Action(src, dest);
		assertTrue(
				"The location set by the user was not adjusted to the end of the target.",
				checkResult_dropPointMovedToConnectorEnd(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A5) and row (B3C1).
	 * 
	 */
	public void testA5_B3C1() {
		test_id = getTestId("A5", "B3C1", "29");

		NonRootModelElement src = selectA("A5");

		NonRootModelElement dest = selectBC("B3C1");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A5) and row (B3C2).
	 * 
	 */
	public void testA5_B3C2() {
		test_id = getTestId("A5", "B3C2", "30");

		NonRootModelElement src = selectA("A5");

		NonRootModelElement dest = selectBC("B3C2");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

	/**
	 * Perform the test for the given matrix column (A5) and row (B3C3).
	 * 
	 */
	public void testA5_B3C3() {
		test_id = getTestId("A5", "B3C3", "31");

		NonRootModelElement src = selectA("A5");

		NonRootModelElement dest = selectBC("B3C3");

		A_BC_Action(src, dest);
		assertTrue("The location set by the user was not used.",
				checkResult_dropPointUnchanged(src, dest));

		GraphicalEditor editor = getActiveEditor();
		if (editor != null && useDrawResults) {
			validateOrGenerateResults(editor, generateResults);
		}
	}

}
