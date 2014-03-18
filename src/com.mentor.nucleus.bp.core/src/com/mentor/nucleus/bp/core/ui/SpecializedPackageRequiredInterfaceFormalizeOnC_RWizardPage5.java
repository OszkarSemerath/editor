package com.mentor.nucleus.bp.core.ui;
//====================================================================
//
// File:    SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5.java
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

public class SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5
		extends
			PtWizardPage implements Listener {
	public static final String copyright = "(c) Copyright 2003-2014 Mentor Graphics Corporation  All rights reserved.";

	IWorkbench workbench;
	IStructuredSelection selection;

	// widgets on this page (public for unit tests)
	public Combo InterfaceCombo;
	public Label InterfaceLabel;

	// cache for user choices
	Interface_c Interface = null;
	Interface_c[] InterfaceInstances;

	/**
	 * Constructors for SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5.
	 */
	public SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5() {
		super("");
		init();
	}

	public SpecializedPackageRequiredInterfaceFormalizeOnC_RWizardPage5(
			String name) {
		super(name);
		init();
	}

	private void init() {
		setTitle("Formalize");
		setDescription("Choose the defined interface that this interface reference shall represent");
	}

	public void onPageEntry() {
		Ooaofooa modelRoot = Selection
				.getModelRoot((StructuredSelection) ((SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard) getWizard())
						.getSelection());

		// cache for previous user selections
		InterfacePackage_c v_Diagram = ((SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard) getWizard()).v_Diagram;

		// cache for context
		Requirement_c v_requirement = ((SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard) getWizard()).v_requirement;

		if (((v_requirement != null))) {

			Component_c v_component = Component_c.getOneC_COnR4010(Port_c
					.getOneC_POOnR4016(InterfaceReference_c
							.getOneC_IROnR4009(v_requirement)));

			if (((v_component != null))) {

				ComponentPackage_c v_componentPackage = ComponentPackage_c
						.getOneCP_CPOnR4604(v_component);

				if (((v_componentPackage == null))) {

					Component_c v_parentComponent = Component_c
							.getOneC_COnR4202(ComponentInComponent_c
									.getOneCN_CICOnR4203(v_component));

					if (((v_parentComponent != null))) {

						while (((v_componentPackage == null))) {

							v_componentPackage = ComponentPackage_c
									.getOneCP_CPOnR4604(v_parentComponent);

							v_parentComponent = Component_c
									.getOneC_COnR4202(ComponentInComponent_c
											.getOneCN_CICOnR4203(v_parentComponent));

						}

					}

				}

				if ((!(v_componentPackage == null))) {

					SystemModel_c v_system = SystemModel_c
							.getOneS_SYSOnR4606(v_componentPackage);

					Interface_c v_existingI = Interface_c
							.getOneC_IOnR4012(InterfaceReference_c
									.getOneC_IROnR4009(v_requirement));

					java.util.UUID v_id = Gd_c.Null_unique_id();

					if (((v_existingI != null))) {

						v_id = v_existingI.getId();

					}

					if (((v_Diagram != null))) {

						// select related by where USER::selectOne
						Interface_c[] v_InterfaceInstances = Interface_c
								.getManyC_IsOnR4303(v_Diagram);
						Interface_c v_Interface = null;
						int InterfaceInstCount;
						int InterfaceResultCount = 0;
						for (InterfaceInstCount = 0; InterfaceInstCount < v_InterfaceInstances.length; InterfaceInstCount++) {
							Interface_c selected = v_InterfaceInstances[InterfaceInstCount];
							if (User_c.Selectone(selected.getId())
									&& (!selected.getId().equals(v_id))) {
								InterfaceResultCount++;
							}
						}
						this.InterfaceInstances = new Interface_c[InterfaceResultCount];
						InterfaceResultCount = 0;
						for (InterfaceInstCount = 0; InterfaceInstCount < v_InterfaceInstances.length; InterfaceInstCount++) {
							Interface_c selected = v_InterfaceInstances[InterfaceInstCount];
							if (User_c.Selectone(selected.getId())
									&& (!selected.getId().equals(v_id))) {
								this.InterfaceInstances[InterfaceResultCount] = selected;
								InterfaceResultCount++;
							}
						}
						InterfaceCombo.removeAll();
						for (InterfaceInstCount = 0; InterfaceInstCount < InterfaceResultCount; InterfaceInstCount++)
							InterfaceCombo
									.add(((Interface_c) this.InterfaceInstances[InterfaceInstCount])
											.getName());
						if (InterfaceResultCount == 1) {
							InterfaceCombo.select(0);
							updateSelectedInterface();
						}

					}

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

		InterfaceLabel = new Label(composite, SWT.NONE);
		InterfaceLabel.setText("Interface");
		InterfaceCombo = new Combo(composite, SWT.BORDER | SWT.READ_ONLY);
		InterfaceCombo.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

		// set the composite as the control for this page
		setControl(composite);
		onPageEntry(); // Initialize the ui widget contents
		addListeners();
	}

	private void addListeners() {
		InterfaceCombo.addListener(SWT.Selection, this);
	}

	// public for unit tests
	public void updateSelectedInterface() {
		this.Interface = InterfaceInstances[InterfaceCombo.getSelectionIndex()];
		((SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard) getWizard()).v_Interface = this.Interface;
	}

	/**
	 * @see Listener#handleEvent(Event)
	 */
	public void handleEvent(Event event) {
		if (event.widget == InterfaceCombo) {
			updateSelectedInterface();
		}
		getWizard().getContainer().updateButtons();
	}

	public boolean isPageComplete() {
		boolean isPageComplete = true;
		if (Interface == null)
			isPageComplete = false;
		return isPageComplete;
	}

	public IWizardPage getNextPage() {
		((SpecializedPackageRequiredInterfaceFormalizeOnC_RWizard) getWizard()).v_Interface = Interface;
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
		if (Interface == null)
			return false;
		return true;
	}

}
