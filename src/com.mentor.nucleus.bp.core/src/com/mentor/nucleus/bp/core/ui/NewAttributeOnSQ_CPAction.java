package com.mentor.nucleus.bp.core.ui;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/ui/NewAttributeOnSQ_CPAction.java
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
// creates new Attributes.
//
import java.util.Iterator;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.OoaofgraphicsUtil;
import com.mentor.nucleus.bp.core.util.RenameActionUtil;
import com.mentor.nucleus.bp.core.util.TransactionUtil;
import com.mentor.nucleus.bp.core.util.UIUtil;
import org.eclipse.jface.dialogs.MessageDialogWithToggle;
import org.eclipse.jface.preference.IPreferenceStore;

public class NewAttributeOnSQ_CPAction implements IObjectActionDelegate {

	/**
	 * Constructor for NewAttributeOnSQ_CPAction.
	 */
	public NewAttributeOnSQ_CPAction() {
		super();
	}
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// The part is mainly needed to locate the selection provider, and
		// we cache our selection in core so no action is needed here.
	}
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection structuredSelection = Selection.getInstance()
				.getStructuredSelection();
		SQ_CP_NewAttribute(structuredSelection);

	}
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		action.setImageDescriptor(CorePlugin.getImageDescriptorFor(
				"ClassParticipantAttribute_c", false));
	}
	private void SQ_CP_NewAttribute(IStructuredSelection selection) {
		// Assign the context selection variables with the action context 
		// Assign the context selection variable with the action context 
		Object context = selection.iterator().next();
		ClassParticipant_c v_cp = (ClassParticipant_c) context;
		PersistableModelComponent.ensureCoreDataTypesAvailable(v_cp
				.getModelRoot());

		TransactionUtil.TransactionGroup transactionGroup = TransactionUtil
				.startTransactionsOnSelectedModelRoots("New Attribute");
		boolean abortTransaction = false;
		try {
			// Ensure that actions take place between Verifier Activity executions
			Ooaofooa.beginSaveOperation();
			if (((v_cp != null))) {

				if (v_cp != null) {
					v_cp.Newattribute();
				} else {
					Throwable t = new Throwable();
					t.fillInStackTrace();
					CorePlugin
							.logError(
									"Attempted to call an operation on a null instance.",
									t);
				}

			}

			NonRootModelElement[] children = ClassParticipantAttribute_c
					.getManySQ_CPAsOnR935(v_cp)

			;
			NonRootModelElement newElement = children[children.length - 1];
			IPreferenceStore store = CorePlugin.getDefault()
					.getPreferenceStore();
			boolean option = store
					.getBoolean(BridgePointPreferencesStore.USE_DEFAULT_NAME_FOR_CREATION);
			if (!option) {
				String oldName = RenameActionUtil.getElementName(newElement);
				boolean performRename = UIUtil.inputDialog(null,
						"Element Creation", "Enter the name:", oldName,
						UIUtil.newRenameValidator(newElement));
				if (performRename) {
					String proposedName = UIUtil.inputDialogResult;
					RenameActionUtil.setElementName(newElement, proposedName);
					newElement.setComponent(null);
				} else {
					abortTransaction = true;
				}
			}
			// end critical section
			Ooaofooa.endSaveOperation();
			// catch all exceptions and cancel the transactions
		} catch (Exception e) {
			Ooaofooa.endSaveOperation();
			TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin.logError("Transaction: New Attribute failed", e);//$NON-NLS-1$
		}
		if ((!CorePlugin
				.getDefault()
				.getPreferenceStore()
				.getBoolean(
						BridgePointPreferencesStore.USE_DEFAULT_NAME_FOR_CREATION))
				&& abortTransaction) {
			TransactionUtil.cancelTransactions(transactionGroup);
		} else {
			TransactionUtil.endTransactions(transactionGroup);
		}

	}
} // end NewAttributeOnSQ_CPAction

