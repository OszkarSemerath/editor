package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/SendSignalActionsAdapter.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_adapters.inc
// Version:      $Revision: 1.31 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class SendSignal_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
/**
 * This file adapts the meta-model entity; 'SendSignal_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class SendSignalActionsAdapter implements ITreeContentProvider {
	static SendSignalActionsAdapter sendsignalactionsadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static SendSignalActionsAdapter getInstance() {
		if (sendsignalactionsadapter == null) {
			sendsignalactionsadapter = new SendSignalActionsAdapter();
		}
		return sendsignalactionsadapter;
	}
	/**
	 * @see IContentProvider#inputChanged(Viewer, Object, Object)
	 * Called when the tree's input has been changed
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		// Nothing to do
	}
	/**
	 * @see IContentProvider#dispose()
	 * Called when this viewer is no longer needed
	 */
	public void dispose() {
		// Nothing to dispose
	}
	/**
	 * @see ITreeContentProvider#getParent(Object)
	 * Returns the parent of this node
	 */
	public Object getParent(Object arg) {
		Activity_c result152 = Activity_c.getOneA_AOnR1101(ActivityNode_c
				.getOneA_NOnR1105(ActionNode_c
						.getOneA_ACTOnR1107((SendSignal_c) arg)));
		if (result152 != null) {
			return result152;
		}
		Package_c result153 = Package_c
				.getOneEP_PKGOnR8000(PackageableElement_c.getOnePE_PEOnR8001(ActivityNode_c
						.getOneA_NOnR1105(ActionNode_c
								.getOneA_ACTOnR1107((SendSignal_c) arg))));
		if (result153 != null) {
			return result153;
		}
		return null;
	}
	/**
	 * @see IStructuredContentProvider#getElements(Object)
	 * Returns the elements below this node
	 */
	public Object[] getElements(Object arg) {
		return getChildren(arg);
	}

	/**
	 * @see ITreeContentProvider#getChildren(Object)
	 * Returns the children of this node
	 */
	public Object[] getChildren(Object arg) {
		int resultSize = 0;

		Object[] result = new Object[resultSize];
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		return false;
	}
}
