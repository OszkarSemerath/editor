package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SpecializedPackageCantHappenEventOnSM_STATEWizardPage1.java
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

public class SpecializedPackageCantHappenEventOnSM_STATEWizardPage1
		extends
			PtWizardPage implements Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)
	public Combo EventCombo;
	public Label EventLabel;

	// cache for user choices
	StateMachineEvent_c Event = null;
	StateMachineEvent_c[] EventInstances;

	/**
	 * Constructors for SpecializedPackageCantHappenEventOnSM_STATEWizardPage1.
	 */
	public SpecializedPackageCantHappenEventOnSM_STATEWizardPage1() {
		super("");
		init();
	}

	public SpecializedPackageCantHappenEventOnSM_STATEWizardPage1(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Cant Happen Event");
		setDescription("Select event that can't happen in this state");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((SpecializedPackageCantHappenEventOnSM_STATEWizard) getWizard())
						.getSelection());

		// cache for context
		StateMachineState_c v_state = ((SpecializedPackageCantHappenEventOnSM_STATEWizard) getWizard()).v_state;

		StateMachine_c v_stateMachine = StateMachine_c
				.getOneSM_SMOnR501(v_state);

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
		StateMachineEvent_c[] v_eventInstances = StateMachineEvent_c
				.getManySM_EVTsOnR502(v_machines);
		StateMachineEvent_c v_event = null;
		int eventInstCount;
		int eventResultCount = 0;
		for (eventInstCount = 0; eventInstCount < v_eventInstances.length; eventInstCount++) {
			StateMachineEvent_c selected = v_eventInstances[eventInstCount];
			if (User_c.Selectone(selected.getSmevt_id())
					&& v_state.Canignoreorsayeventcanthappen(true,
							selected.getSmevt_id(), selected.getSm_id())) {
				eventResultCount++;
			}
		}
		this.EventInstances = new StateMachineEvent_c[eventResultCount];
		eventResultCount = 0;
		for (eventInstCount = 0; eventInstCount < v_eventInstances.length; eventInstCount++) {
			StateMachineEvent_c selected = v_eventInstances[eventInstCount];
			if (User_c.Selectone(selected.getSmevt_id())
					&& v_state.Canignoreorsayeventcanthappen(true,
							selected.getSmevt_id(), selected.getSm_id())) {
				this.EventInstances[eventResultCount] = selected;
				eventResultCount++;
			}
		}
		EventCombo.removeAll();
		for (eventInstCount = 0; eventInstCount < eventResultCount; eventInstCount++)
			EventCombo
					.add(((StateMachineEvent_c) this.EventInstances[eventInstCount])
							.Get_name());
		if (eventResultCount > 0) {
			EventCombo.select(0);
			updateSelectedEvent();
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

		EventLabel = new Label(composite, SWT.NONE);
		EventLabel.setText("Event");
		EventCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		EventCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
		EventCombo.addListener(SWT.Selection, this);
	}

	// public for unit tests
	public void updateSelectedEvent() {
		this.Event = EventInstances[EventCombo.getSelectionIndex()];
		((SpecializedPackageCantHappenEventOnSM_STATEWizard) getWizard()).v_event = this.Event;
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		if (event.widget == EventCombo) {
			updateSelectedEvent();
		}
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		if (Event == null)
			isPageComplete = false;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		((SpecializedPackageCantHappenEventOnSM_STATEWizard) getWizard()).v_event = Event;
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
		if (Event == null)
			return false;
		return true;
	}

}
