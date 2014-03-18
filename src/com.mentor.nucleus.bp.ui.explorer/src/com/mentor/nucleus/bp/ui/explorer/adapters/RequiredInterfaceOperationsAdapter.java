package com.mentor.nucleus.bp.ui.explorer.adapters;
//======================================================================
//
// File: com/mentor/nucleus/bp/ui/explorer/adapters/RequiredInterfaceOperationsAdapter.java
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
// class RequiredOperation_c from the tree viewer and the hierarchy
// it imposes.
//
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;
import com.mentor.nucleus.bp.core.*;

import com.mentor.nucleus.bp.ui.explorer.*;
import com.mentor.nucleus.bp.core.sorter.PropertyParameter_cSorter;
/**
 * This file adapts the meta-model entity; 'RequiredOperation_c'
 * so that it works with the Eclipse JFace user interface components.
 * <p>
 * Do not edit this class, it was created using the Mentor 
 * Graphics MC-Java code generator product.
 * </p>
 */
public class RequiredInterfaceOperationsAdapter implements ITreeContentProvider {
	static RequiredInterfaceOperationsAdapter requiredinterfaceoperationsadapter = null;
	/**
	 * Returns the adapters singleton instance. If this
	 * is the first time, the instance is created.
	 */
	public static RequiredInterfaceOperationsAdapter getInstance() {
		if (requiredinterfaceoperationsadapter == null) {
			requiredinterfaceoperationsadapter = new RequiredInterfaceOperationsAdapter();
		}
		return requiredinterfaceoperationsadapter;
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
		Requirement_c result180 = Requirement_c
				.getOneC_ROnR4500(RequiredExecutableProperty_c
						.getOneSPR_REPOnR4502((RequiredOperation_c) arg));
		if (result180 != null) {
			return result180;
		}
		ImportedRequirement_c result181 = ImportedRequirement_c
				.getOneCL_IROnR4703(ImportedReference_c.getOneCL_IIROnR4701(InterfaceReference_c.getOneC_IROnR4009(Requirement_c.getOneC_ROnR4500(RequiredExecutableProperty_c
						.getOneSPR_REPOnR4502((RequiredOperation_c) arg)))));
		if (result181 != null) {
			return result181;
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
		PropertyParameter_c[] parameters_4502_1 = PropertyParameter_c
				.getManyC_PPsOnR4006(ExecutableProperty_c.getManyC_EPsOnR4500(RequiredExecutableProperty_c
						.getManySPR_REPsOnR4502((RequiredOperation_c) arg)));

		resultSize += parameters_4502_1.length;

		Object[] result = new Object[resultSize];
		int count = 0;
		PropertyParameter_cSorter sorterC_PP = new PropertyParameter_cSorter();
		sorterC_PP.sort(parameters_4502_1);
		for (int i = 0; i < parameters_4502_1.length; i++) {
			result[count] = new MultipleOccurrenceElement(parameters_4502_1[i]);
			count++;
		}
		return result;
	}
	/**
	 * @see ITreeContentProvider#hasChildren(Object)
	 * Returns true if this node has any children
	 */
	public boolean hasChildren(Object arg) {
		PropertyParameter_c[] parameters_4502_1 = PropertyParameter_c
				.getManyC_PPsOnR4006(ExecutableProperty_c.getManyC_EPsOnR4500(RequiredExecutableProperty_c
						.getManySPR_REPsOnR4502((RequiredOperation_c) arg)));

		if (parameters_4502_1.length > 0)
			return true;
		return false;
	}
}
