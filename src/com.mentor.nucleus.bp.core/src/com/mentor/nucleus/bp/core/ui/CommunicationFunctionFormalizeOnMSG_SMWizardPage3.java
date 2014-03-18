package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    CommunicationFunctionFormalizeOnMSG_SMWizardPage3.java
//
// WARNING: Do not edit this generated file
// Generated by arc/page.inc
//
// (c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.
//
//====================================================================
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.ClassQueryInterface_c;

import java.util.ArrayList;
import java.util.List;

public class CommunicationFunctionFormalizeOnMSG_SMWizardPage3
		extends
			PtWizardPage implements Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)

	// cache for user choices

	/**
	 * Constructors for CommunicationFunctionFormalizeOnMSG_SMWizardPage3.
	 */
	public CommunicationFunctionFormalizeOnMSG_SMWizardPage3() {
		super("");
		init();
	}

	public CommunicationFunctionFormalizeOnMSG_SMWizardPage3(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Formalize");
		setDescription("Choose the message to send");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((CommunicationFunctionFormalizeOnMSG_SMWizard) getWizard())
						.getSelection());

		// cache for previous user selections
		Function_c v_Message = ((CommunicationFunctionFormalizeOnMSG_SMWizard) getWizard()).v_Message;

		// cache for context
		SynchronousMessage_c v_syncMessage = ((CommunicationFunctionFormalizeOnMSG_SMWizard) getWizard()).v_syncMessage;
		FunctionPackageParticipant_c v_fpp = ((CommunicationFunctionFormalizeOnMSG_SMWizard) getWizard()).v_fpp;

		if (((v_syncMessage != null))) {

			Function_c v_function = Function_c
					.getOneS_SYNCOnR1010(FunctionMessage_c
							.getOneMSG_FOnR1020(v_syncMessage));

			if (((v_fpp != null))) {

				java.util.UUID v_existingId = Gd_c.Null_unique_id();

				if (((v_function != null))) {

					v_existingId = v_function.getSync_id();

				}

				Message_c v_message = Message_c
						.getOneMSG_MOnR1018(v_syncMessage);

				InteractionParticipant_c v_participant = InteractionParticipant_c
						.getOneSQ_POnR930(v_fpp);

				FunctionPackage_c v_fpk = FunctionPackage_c
						.getOneS_FPKOnR932(v_fpp);

				if (((v_fpk != null))) {

				}

			}

		}

	}

	public void createControl(Composite parent) {
		// create the composite to hold the widgets   
		GridData gd = null;
		Composite composite = new Composite(parent, SWT.NULL);

		// create the desired layout for this wizard page
		GridLayout gl = new GridLayout();
		int ncol = 5;
		gl.numColumns = ncol;
		composite.setLayout(gl);

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		PtWizardPage page = (PtWizardPage) getWizard().getNextPage(this);
		page.onPageEntry();
		return page;
	}

	/**
	 * @see IWizardPage#canFlipToNextPage()
	 */
	public boolean canFlipToNextPage() {
		if ((PtWizardPage) getWizard().getNextPage(this) == null)
			return false;
		return true;
	}

}
