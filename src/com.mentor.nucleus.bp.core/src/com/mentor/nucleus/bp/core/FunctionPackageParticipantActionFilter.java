package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.FunctionPackageParticipantActionFilter.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================
import org.eclipse.ui.IActionFilter;
import com.mentor.nucleus.bp.core.FunctionPackageParticipant_c;

public class FunctionPackageParticipantActionFilter implements IActionFilter {
	private static FunctionPackageParticipantActionFilter singleton;

	public static FunctionPackageParticipantActionFilter getSingleton() {
		if (singleton == null)
			singleton = new FunctionPackageParticipantActionFilter();
		return singleton;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionFilter#testAttribute(java.lang.Object, java.lang.String, java.lang.String)
	 */
	public boolean testAttribute(Object target, String name, String value) {
		FunctionPackageParticipant_c x = (FunctionPackageParticipant_c) target;
		return x.Actionfilter(name, value);
	}

}
