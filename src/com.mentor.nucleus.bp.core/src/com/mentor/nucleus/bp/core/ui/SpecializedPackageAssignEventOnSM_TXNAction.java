package com.mentor.nucleus.bp.core.ui;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/ui/SpecializedPackageAssignEventOnSM_TXNAction.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_action.inc
// Version:      $Revision: 1.30 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is the main BridgePoint entry point for the action that
// creates new Assign Events.
//
import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.OoaofgraphicsUtil;
import com.mentor.nucleus.bp.core.util.RenameActionUtil;
import com.mentor.nucleus.bp.core.util.TransactionUtil;
import com.mentor.nucleus.bp.core.util.UIUtil;

public class SpecializedPackageAssignEventOnSM_TXNAction
		implements
			IObjectActionDelegate {
	private IWorkbenchPart m_part;

	/**
	 * Constructor for SpecializedPackageAssignEventOnSM_TXNAction.
	 */
	public SpecializedPackageAssignEventOnSM_TXNAction() {
		super();
	}
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// The part is mainly needed to locate the selection provider, and
		// we cache our selection in core so no action is needed here.
		m_part = targetPart;
	}
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection structuredSelection = Selection.getInstance()
				.getStructuredSelection();
		WizardDialog wd = SM_TXN_SpecializedPackageAssignEvent(structuredSelection);
		wd.open();

	}
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
	}
	// public for unit test
	public WizardDialog SM_TXN_SpecializedPackageAssignEvent(
			IStructuredSelection selection) {
		SpecializedPackageAssignEventOnSM_TXNWizard wizard = new SpecializedPackageAssignEventOnSM_TXNWizard();
		wizard.init(CorePlugin.getDefault().getWorkbench(), selection, null);
		// Instantiates the wizard container with the wizard and opens it
		WizardDialog dialog = new WizardDialog(m_part.getSite().getShell(),
				wizard);
		dialog.create();
		ImageDescriptor descr = CorePlugin.getImageDescriptor("green-bp.gif");
		dialog.getShell().setImage(descr.createImage());
		return dialog;

	}
} // end SpecializedPackageAssignEventOnSM_TXNAction

