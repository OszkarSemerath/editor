package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    ClassOperationFormalizeOnMSG_SMWizardPage1.java
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

public class ClassOperationFormalizeOnMSG_SMWizardPage1 extends PtWizardPage
		implements
			Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)

	// cache for user choices

	/**
	 * Constructors for ClassOperationFormalizeOnMSG_SMWizardPage1.
	 */
	public ClassOperationFormalizeOnMSG_SMWizardPage1() {
		super("");
		init();
	}

	public ClassOperationFormalizeOnMSG_SMWizardPage1(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Formalize");
		setDescription("Choose the message to send");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((ClassOperationFormalizeOnMSG_SMWizard) getWizard())
						.getSelection());

		// cache for previous user selections
		Operation_c v_Message = ((ClassOperationFormalizeOnMSG_SMWizard) getWizard()).v_Message;

		// cache for context
		SynchronousMessage_c v_syncMessage = ((ClassOperationFormalizeOnMSG_SMWizard) getWizard()).v_syncMessage;

		Operation_c v_operation = Operation_c
				.getOneO_TFROnR1011(OperationMessage_c
						.getOneMSG_OOnR1020(v_syncMessage));

		java.util.UUID v_existingId = Gd_c.Null_unique_id();

		if (((v_operation != null))) {

			v_existingId = v_operation.getTfr_id();

		}

		Message_c v_message = Message_c.getOneMSG_MOnR1018(v_syncMessage);

		InteractionParticipant_c v_participant = InteractionParticipant_c
				.getOneSQ_POnR1007(v_message);

		ClassParticipant_c v_cp = ClassParticipant_c
				.getOneSQ_CPOnR930(v_participant);

		if (((v_cp == null))) {

			v_cp = ClassParticipant_c
					.getOneSQ_CPOnR930(InteractionParticipant_c
							.getOneSQ_POnR940(Lifespan_c
									.getOneSQ_LSOnR930(v_participant)));

		}

		ClassInstanceParticipant_c v_cip = ClassInstanceParticipant_c
				.getOneSQ_CIPOnR930(v_participant);

		ModelClass_c v_mclass = ModelClass_c.getOneO_OBJOnR939(v_cp);

		if (((v_mclass == null)) && ((v_cip != null))) {

			Communication_c v_communication = Communication_c
					.getOneCOMM_COMMOnR1126(ParticipantInCommunication_c
							.getOneCOMM_PICOnR1126(InteractionParticipant_c
									.getOneSQ_POnR930(v_cip)));

			if (((v_communication == null) || !v_message
					.getParticipatesincommunication())) {

				v_mclass = ModelClass_c.getOneO_OBJOnR934(v_cip);

			}

		}

		if (((v_mclass != null))) {

			if (((v_Message != null))) {

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
