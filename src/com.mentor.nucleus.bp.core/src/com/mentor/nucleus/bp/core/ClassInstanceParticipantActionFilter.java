package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.ClassInstanceParticipantActionFilter.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================
import org.eclipse.ui.IActionFilter;
import com.mentor.nucleus.bp.core.ClassInstanceParticipant_c;

public class ClassInstanceParticipantActionFilter implements IActionFilter {
	private static ClassInstanceParticipantActionFilter singleton;

	public static ClassInstanceParticipantActionFilter getSingleton() {
		if (singleton == null)
			singleton = new ClassInstanceParticipantActionFilter();
		return singleton;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IActionFilter#testAttribute(java.lang.Object, java.lang.String, java.lang.String)
	 */
	public boolean testAttribute(Object target, String name, String value) {
		ClassInstanceParticipant_c x = (ClassInstanceParticipant_c) target;
		return x.Actionfilter(name, value);
	}

}