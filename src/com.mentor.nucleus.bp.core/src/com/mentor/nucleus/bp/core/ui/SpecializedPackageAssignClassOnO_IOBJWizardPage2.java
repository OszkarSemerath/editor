package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SpecializedPackageAssignClassOnO_IOBJWizardPage2.java
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

public class SpecializedPackageAssignClassOnO_IOBJWizardPage2
		extends
			PtWizardPage implements Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)
	public Combo ClassCombo;
	public Label ClassLabel;

	// cache for user choices
	ModelClass_c Class = null;
	ModelClass_c[] ClassInstances;

	/**
	 * Constructors for SpecializedPackageAssignClassOnO_IOBJWizardPage2.
	 */
	public SpecializedPackageAssignClassOnO_IOBJWizardPage2() {
		super("");
		init();
	}

	public SpecializedPackageAssignClassOnO_IOBJWizardPage2(String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Assign Class");
		setDescription("Select class this imported class represents");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((SpecializedPackageAssignClassOnO_IOBJWizard) getWizard())
						.getSelection());

		// cache for previous user selections
		Subsystem_c v_Subsystem = ((SpecializedPackageAssignClassOnO_IOBJWizard) getWizard()).v_Subsystem;

		// cache for context
		ImportedClass_c v_iobj = ((SpecializedPackageAssignClassOnO_IOBJWizard) getWizard()).v_iobj;

		if (((v_Subsystem != null))) {

			// select related by where USER::selectOne
			ModelClass_c[] v_ClassInstances = ModelClass_c
					.getManyO_OBJsOnR2(v_Subsystem);
			ModelClass_c v_Class = null;
			int ClassInstCount;
			int ClassResultCount = 0;
			for (ClassInstCount = 0; ClassInstCount < v_ClassInstances.length; ClassInstCount++) {
				ModelClass_c selected = v_ClassInstances[ClassInstCount];
				if (User_c.Selectone(selected.getObj_id())) {
					ClassResultCount++;
				}
			}
			this.ClassInstances = new ModelClass_c[ClassResultCount];
			ClassResultCount = 0;
			for (ClassInstCount = 0; ClassInstCount < v_ClassInstances.length; ClassInstCount++) {
				ModelClass_c selected = v_ClassInstances[ClassInstCount];
				if (User_c.Selectone(selected.getObj_id())) {
					this.ClassInstances[ClassResultCount] = selected;
					ClassResultCount++;
				}
			}
			ClassCombo.removeAll();
			for (ClassInstCount = 0; ClassInstCount < ClassResultCount; ClassInstCount++)
				ClassCombo
						.add(((ModelClass_c) this.ClassInstances[ClassInstCount])
								.getName());
			if (ClassResultCount == 1) {
				ClassCombo.select(0);
				updateSelectedClass();
			}

			if (((v_Class != null))) {

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

		ClassLabel = new Label(composite, SWT.NONE);
		ClassLabel.setText("Class");
		ClassCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		ClassCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
		ClassCombo.addListener(SWT.Selection, this);
	}

	// public for unit tests
	public void updateSelectedClass() {
		this.Class = ClassInstances[ClassCombo.getSelectionIndex()];
		((SpecializedPackageAssignClassOnO_IOBJWizard) getWizard()).v_Class = this.Class;
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		if (event.widget == ClassCombo) {
			updateSelectedClass();
		}
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		if (Class == null)
			isPageComplete = false;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		((SpecializedPackageAssignClassOnO_IOBJWizard) getWizard()).v_Class = Class;
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
		if (Class == null)
			return false;
		return true;
	}

}
