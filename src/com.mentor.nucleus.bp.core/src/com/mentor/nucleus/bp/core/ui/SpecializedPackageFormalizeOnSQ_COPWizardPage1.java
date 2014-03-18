package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SpecializedPackageFormalizeOnSQ_COPWizardPage1.java
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

public class SpecializedPackageFormalizeOnSQ_COPWizardPage1
		extends
			PtWizardPage implements Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)

	// cache for user choices

	/**
	 * Constructors for SpecializedPackageFormalizeOnSQ_COPWizardPage1.
	 */
	public SpecializedPackageFormalizeOnSQ_COPWizardPage1() {
		super("");
		init();
	}

	public SpecializedPackageFormalizeOnSQ_COPWizardPage1(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Formalize");
		setDescription("Choose the Component that this symbol shall represent");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((SpecializedPackageFormalizeOnSQ_COPWizard) getWizard())
						.getSelection());

		// cache for previous user selections
		Component_c v_Component = ((SpecializedPackageFormalizeOnSQ_COPWizard) getWizard()).v_Component;

		// cache for context
		ComponentParticipant_c v_cop = ((SpecializedPackageFormalizeOnSQ_COPWizard) getWizard()).v_cop;

		InteractionParticipant_c v_participant = InteractionParticipant_c
				.getOneSQ_POnR930(v_cop);

		SystemModel_c v_system = SystemModel_c
				.getOneS_SYSOnR4606(ComponentPackage_c
						.getOneCP_CPOnR951(Sequence_c
								.getOneSQ_SOnR929(v_participant)));

		if ((v_system == null)) {

			if ((v_participant != null)) {

				java.util.UUID v_id = v_participant.Getsystemid();

				v_system = (SystemModel_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(SystemModel_c.class).get(v_id);

			}

		}

		if ((v_system != null)) {

			if ((v_Component != null)) {

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
