package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SplitOnO_ATTRWizard.java
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
 * SplitOnO_ATTRWizard class
 */
public class SplitOnO_ATTRWizard extends Wizard {
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
	SplitOnO_ATTRWizardPage1 O_ATTR_SplitPage1;

	// wizard state
	// constants
	protected static final int INITIAL_WIZARD_STATE = -1;
	protected static final int O_ATTR_SPLIT0_WIZARD_STATE = 0;
	// member
	protected int m_state = INITIAL_WIZARD_STATE;
	// end wizard state

	// cache for contextual selections (public for use by unit tests)
	public Attribute_c v_o_attr = null;

	// cache for the users selections (public for use by unit tests)
	public AttributeReferenceInClass_c v_Split_from = null;

	/**
	 * Constructor for SplitOnO_ATTRWizard.
	 */
	public SplitOnO_ATTRWizard() {
		super();
	}

	/**
	 * See field.
	 */
	public IStructuredSelection getSelection() {
		return m_selection;
	}

	public void addPages() {
		O_ATTR_SplitPage1 = new SplitOnO_ATTRWizardPage1(
				"SplitOnO_ATTRWizardPage1");
		addPage(O_ATTR_SplitPage1);
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
			if (context instanceof Attribute_c) {
				v_o_attr = (Attribute_c) context;
			}
		}
	}

	public boolean canFinish() {
		boolean pagesComplete = true;
		pagesComplete = pagesComplete && O_ATTR_SplitPage1.isPageComplete();
		return pagesComplete;
	}

	public IWizardPage getNextPage(IWizardPage page) {
		List pages = new ArrayList(getPages().length);
		for (int i = 0; i < getPages().length; i++) {
			pages.add(getPages()[i]);
		}
		switch (pages.indexOf(page)) {
			case O_ATTR_SPLIT0_WIZARD_STATE :
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
		ModelRoot modelRoot = v_o_attr.getModelRoot();
		try {
			transactionGroup = TransactionUtil
					.startTransactionsOnSelectedModelRoots("Attribute Split"); //$NON-NLS-1$
			ReferentialAttribute_c v_rattr = ReferentialAttribute_c
					.getOneO_RATTROnR106(v_o_attr);

			if (v_rattr != null) {
				v_rattr.Split_refs(v_Split_from.getAref_id());
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			if (transactionGroup != null)
				TransactionUtil.cancelTransactions(transactionGroup, e);
			CorePlugin.logError("Transaction: Attribute Split failed", e);//$NON-NLS-1$
			// return true so that the wizard will
			// close
			return true;
		}
		if (transactionGroup != null)
			TransactionUtil.endTransactions(transactionGroup);
		if (m_viewer != null) {
			if (m_viewer instanceof StructuredViewer) {
				((StructuredViewer) m_viewer).refresh(v_o_attr);
			} else {
				m_viewer.refresh();
			}
		}
		return true;
	}
}
