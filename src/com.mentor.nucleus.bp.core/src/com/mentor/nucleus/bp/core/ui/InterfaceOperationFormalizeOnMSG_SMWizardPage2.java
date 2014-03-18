package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    InterfaceOperationFormalizeOnMSG_SMWizardPage2.java
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

public class InterfaceOperationFormalizeOnMSG_SMWizardPage2
		extends
			PtWizardPage implements Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)
	public Combo OperationCombo;
	public Label OperationLabel;

	// cache for user choices
	InterfaceOperation_c Operation = null;
	InterfaceOperation_c[] OperationInstances;

	/**
	 * Constructors for InterfaceOperationFormalizeOnMSG_SMWizardPage2.
	 */
	public InterfaceOperationFormalizeOnMSG_SMWizardPage2() {
		super("");
		init();
	}

	public InterfaceOperationFormalizeOnMSG_SMWizardPage2(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Formalize");
		setDescription("Choose the message to send");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((InterfaceOperationFormalizeOnMSG_SMWizard) getWizard())
						.getSelection());

		// cache for context
		SynchronousMessage_c v_syncMessage = ((InterfaceOperationFormalizeOnMSG_SMWizard) getWizard()).v_syncMessage;

		Message_c v_message = Message_c.getOneMSG_MOnR1018(v_syncMessage);

		InteractionParticipant_c v_participant = InteractionParticipant_c
				.getOneSQ_POnR1007(v_message);

		ComponentParticipant_c v_cop = ComponentParticipant_c
				.getOneSQ_COPOnR930(v_participant);

		if (((v_cop == null))) {

			v_cop = ComponentParticipant_c
					.getOneSQ_COPOnR930(InteractionParticipant_c
							.getOneSQ_POnR940(Lifespan_c
									.getOneSQ_LSOnR930(v_participant)));

		}

		Component_c v_component = (Component_c) modelRoot.getInstanceList(
				Component_c.class).getGlobal(null, Gd_c.Null_unique_id());

		if (((v_cop != null))) {

			v_component = Component_c.getOneC_COnR955(v_cop);

		}

		if (((v_component != null))) {

			// select related by where USER::selectOne
			InterfaceOperation_c[] v_OperationInstances = InterfaceOperation_c
					.getManyC_IOsOnR4004(ExecutableProperty_c.getManyC_EPsOnR4003(Interface_c
							.getManyC_IsOnR4012(InterfaceReference_c
									.getManyC_IRsOnR4016(Port_c
											.getManyC_POsOnR4010(v_component)))));
			InterfaceOperation_c v_Operation = null;
			int OperationInstCount;
			int OperationResultCount = 0;
			for (OperationInstCount = 0; OperationInstCount < v_OperationInstances.length; OperationInstCount++) {
				InterfaceOperation_c selected = v_OperationInstances[OperationInstCount];
				if (User_c.Selectone(selected.getId())
						&& v_syncMessage
								.Canformalizeusinginterfaceoperation(selected
										.getId())) {
					OperationResultCount++;
				}
			}
			this.OperationInstances = new InterfaceOperation_c[OperationResultCount];
			OperationResultCount = 0;
			for (OperationInstCount = 0; OperationInstCount < v_OperationInstances.length; OperationInstCount++) {
				InterfaceOperation_c selected = v_OperationInstances[OperationInstCount];
				if (User_c.Selectone(selected.getId())
						&& v_syncMessage
								.Canformalizeusinginterfaceoperation(selected
										.getId())) {
					this.OperationInstances[OperationResultCount] = selected;
					OperationResultCount++;
				}
			}
			OperationCombo.removeAll();
			for (OperationInstCount = 0; OperationInstCount < OperationResultCount; OperationInstCount++)
				OperationCombo
						.add(((InterfaceOperation_c) this.OperationInstances[OperationInstCount])
								.getName());
			if (OperationResultCount == 1) {
				OperationCombo.select(0);
				updateSelectedOperation();
			}

			if (((v_Operation != null))) {

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

		OperationLabel = new Label(composite, SWT.NONE);
		OperationLabel.setText("Operation");
		OperationCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		OperationCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
		OperationCombo.addListener(SWT.Selection, this);
	}

	// public for unit tests
	public void updateSelectedOperation() {
		this.Operation = OperationInstances[OperationCombo.getSelectionIndex()];
		((InterfaceOperationFormalizeOnMSG_SMWizard) getWizard()).v_Operation = this.Operation;
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		if (event.widget == OperationCombo) {
			updateSelectedOperation();
		}
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		if (Operation == null)
			isPageComplete = false;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		((InterfaceOperationFormalizeOnMSG_SMWizard) getWizard()).v_Operation = Operation;
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
		if (Operation == null)
			return false;
		return true;
	}

}
