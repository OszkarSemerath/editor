package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SpecializedPackageCantHappenInStateOnSM_EVTWizardPage1.java
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

public class SpecializedPackageCantHappenInStateOnSM_EVTWizardPage1
		extends
			PtWizardPage implements Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)
	public Combo StateCombo;
	public Label StateLabel;

	// cache for user choices
	StateMachineState_c State = null;
	StateMachineState_c[] StateInstances;

	/**
	 * Constructors for SpecializedPackageCantHappenInStateOnSM_EVTWizardPage1.
	 */
	public SpecializedPackageCantHappenInStateOnSM_EVTWizardPage1() {
		super("");
		init();
	}

	public SpecializedPackageCantHappenInStateOnSM_EVTWizardPage1(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Cant Happen in State");
		setDescription("Select state where this event can't happen");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((SpecializedPackageCantHappenInStateOnSM_EVTWizard) getWizard())
						.getSelection());

		// cache for context
		StateMachineEvent_c v_event = ((SpecializedPackageCantHappenInStateOnSM_EVTWizard) getWizard()).v_event;

		StateMachine_c v_stateMachine = StateMachine_c
				.getOneSM_SMOnR502(v_event);

		ClassStateMachine_c v_classStateMachine = ClassStateMachine_c
				.getOneSM_ASMOnR517(v_stateMachine);

		boolean v_isClassStateMachine = (v_classStateMachine != null);

		ModelClass_c v_modelClass = ModelClass_c
				.getOneO_OBJOnR518(InstanceStateMachine_c
						.getOneSM_ISMOnR517(v_stateMachine));

		if ((v_isClassStateMachine)) {

			v_modelClass = ModelClass_c.getOneO_OBJOnR519(ClassStateMachine_c
					.getOneSM_ASMOnR517(v_stateMachine));

		}

		StateMachine_c[] v_machines = StateMachine_c
				.getManySM_SMsOnR517(InstanceStateMachine_c.getManySM_ISMsOnR518(ModelClass_c.getManyO_OBJsOnR2(Subsystem_c
						.getManyS_SSsOnR1(Domain_c
								.getManyS_DOMsOnR1(Subsystem_c
										.getManyS_SSsOnR2(v_modelClass))))));

		if ((v_isClassStateMachine)) {

			v_machines = StateMachine_c
					.getManySM_SMsOnR517(ClassStateMachine_c.getManySM_ASMsOnR519(ModelClass_c.getManyO_OBJsOnR2(Subsystem_c
							.getManyS_SSsOnR1(Domain_c
									.getManyS_DOMsOnR1(Subsystem_c
											.getManyS_SSsOnR2(v_modelClass))))));

		}

		// select related by where USER::selectOne
		StateMachineState_c[] v_stateInstances = StateMachineState_c
				.getManySM_STATEsOnR501(v_machines);
		StateMachineState_c v_state = null;
		int stateInstCount;
		int stateResultCount = 0;
		for (stateInstCount = 0; stateInstCount < v_stateInstances.length; stateInstCount++) {
			StateMachineState_c selected = v_stateInstances[stateInstCount];
			if (User_c.Selectone(selected.getSmstt_id())
					&& v_event.Canstateignoreorsaycanthappen(true,
							selected.getSmstt_id(), selected.getSm_id())) {
				stateResultCount++;
			}
		}
		this.StateInstances = new StateMachineState_c[stateResultCount];
		stateResultCount = 0;
		for (stateInstCount = 0; stateInstCount < v_stateInstances.length; stateInstCount++) {
			StateMachineState_c selected = v_stateInstances[stateInstCount];
			if (User_c.Selectone(selected.getSmstt_id())
					&& v_event.Canstateignoreorsaycanthappen(true,
							selected.getSmstt_id(), selected.getSm_id())) {
				this.StateInstances[stateResultCount] = selected;
				stateResultCount++;
			}
		}
		StateCombo.removeAll();
		for (stateInstCount = 0; stateInstCount < stateResultCount; stateInstCount++)
			StateCombo
					.add(((StateMachineState_c) this.StateInstances[stateInstCount])
							.Getnamewithclass());
		if (stateResultCount > 0) {
			StateCombo.select(0);
			updateSelectedState();
		}

		if (((v_event != null))) {

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

		StateLabel = new Label(composite, SWT.NONE);
		StateLabel.setText("State");
		StateCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		StateCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
		StateCombo.addListener(SWT.Selection, this);
	}

	// public for unit tests
	public void updateSelectedState() {
		this.State = StateInstances[StateCombo.getSelectionIndex()];
		((SpecializedPackageCantHappenInStateOnSM_EVTWizard) getWizard()).v_state = this.State;
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		if (event.widget == StateCombo) {
			updateSelectedState();
		}
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		if (State == null)
			isPageComplete = false;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		((SpecializedPackageCantHappenInStateOnSM_EVTWizard) getWizard()).v_state = State;
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
		if (State == null)
			return false;
		return true;
	}

}
