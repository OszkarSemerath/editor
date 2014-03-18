//
package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SpecializedPackageAssignComponentOnCL_ICWizard.java
//
// WARNING: Do not edit this generated file
// Generated by arc/wizard.inc
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//====================================================================
import java.util.Iterator;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.wizard.*;
import org.eclipse.ui.IWorkbench;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.util.TransactionUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * SpecializedPackageAssignComponentOnCL_ICWizard class
 */
public class SpecializedPackageAssignComponentOnCL_ICWizard extends Wizard {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	// workbench selection when the wizard was started
	protected IStructuredSelection m_selection;

	// the workbench instance
	protected IWorkbench m_workbench;

	// the viewer the wizard was started from. This must be replaced with a listener system
	protected Viewer m_viewer;

	// Pages stack
	protected Stack m_pagesStack = new Stack();

	// wizard pages
	SpecializedPackageAssignComponentOnCL_ICWizardPage2 CL_IC_SpecializedPackageAssignComponentPage2;
	SpecializedPackageAssignComponentOnCL_ICWizardPage3 CL_IC_SpecializedPackageAssignComponentPage3;

	// wizard state
	// constants
	protected static final int INITIAL_WIZARD_STATE = -1;
	protected static final int CL_IC_SPECIALIZEDPACKAGEASSIGNCOMPONENT0_WIZARD_STATE = 0;
	protected static final int CL_IC_SPECIALIZEDPACKAGEASSIGNCOMPONENT1_WIZARD_STATE = 1;
	// member
	protected int m_state = INITIAL_WIZARD_STATE;
	// end wizard state

	// cache for contextual selections (public for use by unit tests)
	public ComponentReference_c v_icomp = null;

	// cache for the users selections (public for use by unit tests)
	public ComponentPackage_c v_Package = null;
	public Component_c v_Component = null;

	/**
	 * Constructor for SpecializedPackageAssignComponentOnCL_ICWizard.
	 */
	public SpecializedPackageAssignComponentOnCL_ICWizard() {
		super();
	}

	/**
	 * See field.
	 */
	public IStructuredSelection getSelection() {
		return m_selection;
	}

	public void addPages() {
		CL_IC_SpecializedPackageAssignComponentPage2 = new SpecializedPackageAssignComponentOnCL_ICWizardPage2(
				"SpecializedPackageAssignComponentOnCL_ICWizardPage2");
		addPage(CL_IC_SpecializedPackageAssignComponentPage2);
		CL_IC_SpecializedPackageAssignComponentPage3 = new SpecializedPackageAssignComponentOnCL_ICWizardPage3(
				"SpecializedPackageAssignComponentOnCL_ICWizardPage3");
		addPage(CL_IC_SpecializedPackageAssignComponentPage3);
	}

	/**
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection,
			Viewer viewer) {
		this.m_workbench = workbench;
		this.m_selection = selection;
		this.m_viewer = viewer;
		for (Iterator iterator = selection.iterator(); iterator.hasNext();) {
			Object context = iterator.next();
			if (context instanceof ComponentReference_c) {
				v_icomp = (ComponentReference_c) context;
			}
		}
	}

	public boolean canFinish() {
		boolean pagesComplete = true;
		pagesComplete = pagesComplete
				&& CL_IC_SpecializedPackageAssignComponentPage2
						.isPageComplete();
		pagesComplete = pagesComplete
				&& CL_IC_SpecializedPackageAssignComponentPage3
						.isPageComplete();
		return pagesComplete;
	}

	public IWizardPage getNextPage(IWizardPage page) {
		List pages = new ArrayList(getPages().length);
		for (int i = 0; i < getPages().length; i++) {
			pages.add(getPages()[i]);
		}
		switch (pages.indexOf(page)) {
			case CL_IC_SPECIALIZEDPACKAGEASSIGNCOMPONENT0_WIZARD_STATE :
				m_state = pages
						.indexOf(CL_IC_SpecializedPackageAssignComponentPage3);
				CL_IC_SpecializedPackageAssignComponentPage3.onPageEntry();
				return CL_IC_SpecializedPackageAssignComponentPage3;

			case CL_IC_SPECIALIZEDPACKAGEASSIGNCOMPONENT1_WIZARD_STATE :
				return null;
		}
		return null;
	}

	public IWizardPage getPreviousPage(IWizardPage page) {
		if (m_pagesStack.empty()) {
			return null;
		} else {
			List pages = new ArrayList(getPages().length);
			for (int i = 0; i < getPages().length; i++) {
				pages.add(getPages()[i]);
			}
			m_state = pages.indexOf((IWizardPage) m_pagesStack.peek());
			((PtWizardPage) m_pagesStack.peek()).onPageEntry();
			return (IWizardPage) m_pagesStack.pop();
		}
	}

	public boolean performFinish() {
		TransactionUtil.TransactionGroup transactionGroup = null;
		ModelRoot modelRoot = v_icomp.getModelRoot();
		try {
			transactionGroup = TransactionUtil
					.startTransactionsOnSelectedModelRoots("Specialized Package Assign Component"); //$NON-NLS-1$
			ComponentPackage_c v_compPackage = ComponentPackage_c
					.getOneCP_CPOnR4605(v_icomp);

			if (((v_compPackage == null))) {

				Component_c v_container = Component_c.getOneC_COnR4205(v_icomp);

				if (((v_container != null))) {

					while (((v_compPackage == null))) {

						v_compPackage = ComponentPackage_c
								.getOneCP_CPOnR4604(v_container);

						v_container = Component_c
								.getOneC_COnR4202(ComponentInComponent_c
										.getOneCN_CICOnR4203(v_container));

					}

				}

			}

			Component_c v_component = Component_c.getOneC_COnR4201(v_icomp);

			java.util.UUID v_existingId = Gd_c.Null_unique_id();

			if ((v_component != null)) {

				v_existingId = v_component.getId();

			}

			if ((v_compPackage != null)) {

				SystemModel_c v_system = SystemModel_c
						.getOneS_SYSOnR4606(v_compPackage);

				if ((v_Package != null)) {

					if ((v_Component != null)) {

						if (v_icomp != null) {
							v_icomp.Assigntocomp(v_Component.getId());
						} else {
							Throwable t = new Throwable();
							t.fillInStackTrace();
							CorePlugin
									.logError(
											"Attempted to call an operation on a null instance.",
											t);
						}

					}

				}

			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			if (transactionGroup != null)
				TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin
					.logError(
							"Transaction: Specialized Package Assign Component failed", e);//$NON-NLS-1$
			// return true so that the wizard will
			// close
			return true;
		}
		if (transactionGroup != null)
			TransactionUtil.endTransactions(transactionGroup);
		if (m_viewer != null) {
			if (m_viewer instanceof StructuredViewer) {
				((StructuredViewer) m_viewer).refresh(v_icomp);
			} else {
				m_viewer.refresh();
			}
		}
		return true;
	}
}
