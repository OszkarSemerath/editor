package com.mentor.nucleus.bp.core.sorter;

//======================================================================
//
// File: src/com/mentor/nucleus/bp/core/sorter/InterfaceOperation_cSorter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_metadata_elements_sorters.arc
// Version:      $Revision: 1.12.88.2 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

import com.mentor.nucleus.bp.core.InterfaceOperation_c;
import com.mentor.nucleus.bp.core.CorePlugin;

public class InterfaceOperation_cSorter extends BaseTypeSpecificSorter {

	public InterfaceOperation_cSorter() {
		super(InterfaceOperation_c.class);
	}

	public void sort(Object[] elements) {
		if (elements.length < 2) {
			return;
		}

		InterfaceOperation_c[] interfaceoperations = (InterfaceOperation_c[]) elements;
		int index = 0;
		InterfaceOperation_c tail = null;

		// Search from the end as there are fair chances that array is already
		// sorted.
		for (index = interfaceoperations.length - 1; index >= 0; index--) {
			InterfaceOperation_c interfaceoperation = InterfaceOperation_c
					.getOneC_IOOnR4019Precedes(interfaceoperations[index]);
			if (interfaceoperation == null) {
				tail = interfaceoperations[index];
				break;
			}
		}

		if (tail == null) {
			CorePlugin
					.logError(
							"Interface Operation ordering relationship R4019 is corrupt",
							null);
			return;
		}

		for (index = interfaceoperations.length - 1; index >= 0; index--) {
			interfaceoperations[index] = tail;
			tail = InterfaceOperation_c.getOneC_IOOnR4019Succeeds(tail);
		}
	}
}
