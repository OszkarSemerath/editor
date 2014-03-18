//======================================================================
//
// File: CommunicationLinksCOMM_LNKPropertySource.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/BuildPropertySource.arc
// Version:      $Revision: 1.66 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

package com.mentor.nucleus.bp.ui.properties;
import org.eclipse.ui.views.properties.*;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.DimensionsUtil;

public class CommunicationLinksCOMM_LNKPropertySource
		implements
			IPropertySource {
	private CommunicationLink_c m_inst;
	private ClassInstanceParticipant_c[] m_InstancesLinkStart;
	private ClassInstanceParticipant_c[] m_InstancesLinkEnd;
	private ClassParticipant_c[] m_ImportedClassesLinkStart;
	private ClassParticipant_c[] m_ImportedClassesLinkEnd;
	private ExternalEntityParticipant_c[] m_ImportedExternalEntitiesLinkStart;
	private ExternalEntityParticipant_c[] m_ImportedExternalEntitiesLinkEnd;
	private FunctionPackageParticipant_c[] m_ImportedFunctionPackagesLinkStart;
	private FunctionPackageParticipant_c[] m_ImportedFunctionPackagesLinkEnd;
	private ActorParticipant_c[] m_ActorsLinkStart;
	private ActorParticipant_c[] m_ActorsLinkEnd;
	private ComponentParticipant_c[] m_ComponentParticipantsLinkStart;
	private ComponentParticipant_c[] m_ComponentParticipantsLinkEnd;
	private PackageParticipant_c[] m_ImportedPackagesLinkStart;
	private PackageParticipant_c[] m_ImportedPackagesLinkEnd;
	private PropertyDescriptor[] m_propertyDescriptors;
	private String[] StartVisibility_vals = {"Private", "Public", "Protected"};
	private String[] EndVisibility_vals = {"Private", "Public", "Protected"};
	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public CommunicationLinksCOMM_LNKPropertySource(CommunicationLink_c inst) {
		m_inst = inst;
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getEditableValue()
	 */
	public Object getEditableValue() {
		return this;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#isPropertySet(java.lang.Object)
	 */
	public boolean isPropertySet(Object id) {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#resetPropertyValue(java.lang.Object)
	 */
	public void resetPropertyValue(Object id) {
		// do nothing
	}

	public String toString() {
		return m_inst.Get_name();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors() {
		if (m_inst == null || m_inst.isOrphaned())
			return new IPropertyDescriptor[0];
		int num_children = 0;
		ClassInstanceParticipant_c[] v_instancesLinkStart = ClassInstanceParticipant_c
				.getManySQ_CIPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1133((CommunicationLink_c) m_inst));

		m_InstancesLinkStart = v_instancesLinkStart;
		num_children += m_InstancesLinkStart.length;

		sorter.sort(v_instancesLinkStart);
		ClassInstanceParticipant_c[] v_instancesLinkEnd = ClassInstanceParticipant_c
				.getManySQ_CIPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1134((CommunicationLink_c) m_inst));

		m_InstancesLinkEnd = v_instancesLinkEnd;
		num_children += m_InstancesLinkEnd.length;

		sorter.sort(v_instancesLinkEnd);
		ClassParticipant_c[] v_importedclassesLinkStart = ClassParticipant_c
				.getManySQ_CPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1133((CommunicationLink_c) m_inst));

		m_ImportedClassesLinkStart = v_importedclassesLinkStart;
		num_children += m_ImportedClassesLinkStart.length;

		sorter.sort(v_importedclassesLinkStart);
		ClassParticipant_c[] v_importedclassesLinkEnd = ClassParticipant_c
				.getManySQ_CPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1134((CommunicationLink_c) m_inst));

		m_ImportedClassesLinkEnd = v_importedclassesLinkEnd;
		num_children += m_ImportedClassesLinkEnd.length;

		sorter.sort(v_importedclassesLinkEnd);
		ExternalEntityParticipant_c[] v_importedexternalentitiesLinkStart = ExternalEntityParticipant_c
				.getManySQ_EEPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1133((CommunicationLink_c) m_inst));

		m_ImportedExternalEntitiesLinkStart = v_importedexternalentitiesLinkStart;
		num_children += m_ImportedExternalEntitiesLinkStart.length;

		sorter.sort(v_importedexternalentitiesLinkStart);
		ExternalEntityParticipant_c[] v_importedexternalentitiesLinkEnd = ExternalEntityParticipant_c
				.getManySQ_EEPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1134((CommunicationLink_c) m_inst));

		m_ImportedExternalEntitiesLinkEnd = v_importedexternalentitiesLinkEnd;
		num_children += m_ImportedExternalEntitiesLinkEnd.length;

		sorter.sort(v_importedexternalentitiesLinkEnd);
		FunctionPackageParticipant_c[] v_importedfunctionpackagesLinkStart = FunctionPackageParticipant_c
				.getManySQ_FPPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1133((CommunicationLink_c) m_inst));

		m_ImportedFunctionPackagesLinkStart = v_importedfunctionpackagesLinkStart;
		num_children += m_ImportedFunctionPackagesLinkStart.length;

		sorter.sort(v_importedfunctionpackagesLinkStart);
		FunctionPackageParticipant_c[] v_importedfunctionpackagesLinkEnd = FunctionPackageParticipant_c
				.getManySQ_FPPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1134((CommunicationLink_c) m_inst));

		m_ImportedFunctionPackagesLinkEnd = v_importedfunctionpackagesLinkEnd;
		num_children += m_ImportedFunctionPackagesLinkEnd.length;

		sorter.sort(v_importedfunctionpackagesLinkEnd);
		ActorParticipant_c[] v_actorsLinkStart = ActorParticipant_c
				.getManySQ_APsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1133((CommunicationLink_c) m_inst));

		m_ActorsLinkStart = v_actorsLinkStart;
		num_children += m_ActorsLinkStart.length;

		sorter.sort(v_actorsLinkStart);
		ActorParticipant_c[] v_actorsLinkEnd = ActorParticipant_c
				.getManySQ_APsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1134((CommunicationLink_c) m_inst));

		m_ActorsLinkEnd = v_actorsLinkEnd;
		num_children += m_ActorsLinkEnd.length;

		sorter.sort(v_actorsLinkEnd);
		ComponentParticipant_c[] v_componentparticipantsLinkStart = ComponentParticipant_c
				.getManySQ_COPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1133((CommunicationLink_c) m_inst));

		m_ComponentParticipantsLinkStart = v_componentparticipantsLinkStart;
		num_children += m_ComponentParticipantsLinkStart.length;

		sorter.sort(v_componentparticipantsLinkStart);
		ComponentParticipant_c[] v_componentparticipantsLinkEnd = ComponentParticipant_c
				.getManySQ_COPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1134((CommunicationLink_c) m_inst));

		m_ComponentParticipantsLinkEnd = v_componentparticipantsLinkEnd;
		num_children += m_ComponentParticipantsLinkEnd.length;

		sorter.sort(v_componentparticipantsLinkEnd);
		PackageParticipant_c[] v_importedpackagesLinkStart = PackageParticipant_c
				.getManySQ_PPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1133((CommunicationLink_c) m_inst));

		m_ImportedPackagesLinkStart = v_importedpackagesLinkStart;
		num_children += m_ImportedPackagesLinkStart.length;

		sorter.sort(v_importedpackagesLinkStart);
		PackageParticipant_c[] v_importedpackagesLinkEnd = PackageParticipant_c
				.getManySQ_PPsOnR930(InteractionParticipant_c
						.getManySQ_PsOnR1134((CommunicationLink_c) m_inst));

		m_ImportedPackagesLinkEnd = v_importedpackagesLinkEnd;
		num_children += m_ImportedPackagesLinkEnd.length;

		sorter.sort(v_importedpackagesLinkEnd);
		if (m_propertyDescriptors == null
				|| 7 + num_children != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[7 + num_children];
			boolean readonly = false;

			m_propertyDescriptors[0] = new TextPropertyDescriptor("Numb",
					"Association Number");
			m_propertyDescriptors[0]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[1] = new TextPropertyDescriptor("StartText",
					"Start Text Phrase");
			m_propertyDescriptors[1]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[2] = new TextPropertyDescriptor("EndText",
					"End Text Phrase");
			m_propertyDescriptors[2]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[3] = new PropertyDescriptor("isFormal",
					"Is Formal");
			m_propertyDescriptors[3]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[4] = new EnumPropertyDescriptor(
					"StartVisibility", "Start Visibility",
					StartVisibility_vals, readonly);
			m_propertyDescriptors[4]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[5] = new EnumPropertyDescriptor(
					"EndVisibility", "End Visibility", EndVisibility_vals,
					readonly);
			m_propertyDescriptors[5]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[6] = new DescriptionPropertyDescriptor(
					"Descrip", "Link Description", m_inst);
			m_propertyDescriptors[6]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);

			int d_index = 7;
			for (int i = 0; i < m_InstancesLinkStart.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"InstancesLinkStart." + String.valueOf(i), "Link Start");
				m_propertyDescriptors[d_index].setCategory("Instances");
				++d_index;
			}

			for (int i = 0; i < m_InstancesLinkEnd.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"InstancesLinkEnd." + String.valueOf(i), "Link End");
				m_propertyDescriptors[d_index].setCategory("Instances");
				++d_index;
			}

			for (int i = 0; i < m_ImportedClassesLinkStart.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedClassesLinkStart." + String.valueOf(i),
						"Link Start");
				m_propertyDescriptors[d_index].setCategory("Imported Classes");
				++d_index;
			}

			for (int i = 0; i < m_ImportedClassesLinkEnd.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedClassesLinkEnd." + String.valueOf(i),
						"Link End");
				m_propertyDescriptors[d_index].setCategory("Imported Classes");
				++d_index;
			}

			for (int i = 0; i < m_ImportedExternalEntitiesLinkStart.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedExternalEntitiesLinkStart."
								+ String.valueOf(i), "Link Start");
				m_propertyDescriptors[d_index]
						.setCategory("Imported External Entities");
				++d_index;
			}

			for (int i = 0; i < m_ImportedExternalEntitiesLinkEnd.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedExternalEntitiesLinkEnd." + String.valueOf(i),
						"Link End");
				m_propertyDescriptors[d_index]
						.setCategory("Imported External Entities");
				++d_index;
			}

			for (int i = 0; i < m_ImportedFunctionPackagesLinkStart.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedFunctionPackagesLinkStart."
								+ String.valueOf(i), "Link Start");
				m_propertyDescriptors[d_index]
						.setCategory("Imported Function Packages");
				++d_index;
			}

			for (int i = 0; i < m_ImportedFunctionPackagesLinkEnd.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedFunctionPackagesLinkEnd." + String.valueOf(i),
						"Link End");
				m_propertyDescriptors[d_index]
						.setCategory("Imported Function Packages");
				++d_index;
			}

			for (int i = 0; i < m_ActorsLinkStart.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ActorsLinkStart." + String.valueOf(i), "Link Start");
				m_propertyDescriptors[d_index].setCategory("Actors");
				++d_index;
			}

			for (int i = 0; i < m_ActorsLinkEnd.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ActorsLinkEnd." + String.valueOf(i), "Link End");
				m_propertyDescriptors[d_index].setCategory("Actors");
				++d_index;
			}

			for (int i = 0; i < m_ComponentParticipantsLinkStart.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ComponentParticipantsLinkStart." + String.valueOf(i),
						"Link Start");
				m_propertyDescriptors[d_index]
						.setCategory("Component Participants");
				++d_index;
			}

			for (int i = 0; i < m_ComponentParticipantsLinkEnd.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ComponentParticipantsLinkEnd." + String.valueOf(i),
						"Link End");
				m_propertyDescriptors[d_index]
						.setCategory("Component Participants");
				++d_index;
			}

			for (int i = 0; i < m_ImportedPackagesLinkStart.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedPackagesLinkStart." + String.valueOf(i),
						"Link Start");
				m_propertyDescriptors[d_index].setCategory("Imported Packages");
				++d_index;
			}

			for (int i = 0; i < m_ImportedPackagesLinkEnd.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ImportedPackagesLinkEnd." + String.valueOf(i),
						"Link End");
				m_propertyDescriptors[d_index].setCategory("Imported Packages");
				++d_index;
			}

		}
		return m_propertyDescriptors;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyValue(java.lang.Object)
	 */
	public Object getPropertyValue(Object id) {
		if (m_inst.isOrphaned()) {
			return "";
		}
		if (id.equals("Numb")) {
			return m_inst.getNumb();
		} else if (id.equals("StartText")) {
			return m_inst.getStarttext();
		} else if (id.equals("EndText")) {
			return m_inst.getEndtext();
		} else if (id.equals("isFormal")) {
			return new Boolean(m_inst.getIsformal());
		} else if (id.equals("StartVisibility")) {
			return StartVisibility_vals[m_inst.getStartvisibility()];
		} else if (id.equals("EndVisibility")) {
			return EndVisibility_vals[m_inst.getEndvisibility()];
		} else if (id.equals("Descrip")) {
			return m_inst.getDescrip().replace('\n', '/');
		}
		int d_index = 7;
		for (int i = 0; i < m_InstancesLinkStart.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new InstancesSQ_CIPPropertySource(
						m_InstancesLinkStart[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_InstancesLinkEnd.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new InstancesSQ_CIPPropertySource(m_InstancesLinkEnd[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedClassesLinkStart.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedClassesSQ_CPPropertySource(
						m_ImportedClassesLinkStart[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedClassesLinkEnd.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedClassesSQ_CPPropertySource(
						m_ImportedClassesLinkEnd[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedExternalEntitiesLinkStart.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedExternalEntitiesSQ_EEPPropertySource(
						m_ImportedExternalEntitiesLinkStart[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedExternalEntitiesLinkEnd.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedExternalEntitiesSQ_EEPPropertySource(
						m_ImportedExternalEntitiesLinkEnd[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedFunctionPackagesLinkStart.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedFunctionPackagesSQ_FPPPropertySource(
						m_ImportedFunctionPackagesLinkStart[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedFunctionPackagesLinkEnd.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedFunctionPackagesSQ_FPPPropertySource(
						m_ImportedFunctionPackagesLinkEnd[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ActorsLinkStart.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ActorsSQ_APPropertySource(m_ActorsLinkStart[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ActorsLinkEnd.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ActorsSQ_APPropertySource(m_ActorsLinkEnd[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ComponentParticipantsLinkStart.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ComponentParticipantsSQ_COPPropertySource(
						m_ComponentParticipantsLinkStart[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ComponentParticipantsLinkEnd.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ComponentParticipantsSQ_COPPropertySource(
						m_ComponentParticipantsLinkEnd[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedPackagesLinkStart.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedPackagesSQ_PPPropertySource(
						m_ImportedPackagesLinkStart[i]);
			}
			++d_index;
		}

		for (int i = 0; i < m_ImportedPackagesLinkEnd.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ImportedPackagesSQ_PPPropertySource(
						m_ImportedPackagesLinkEnd[i]);
			}
			++d_index;
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
		boolean value_changed = false;
		String trans_name = "";
		Transaction tr = null;
		Ooaofooa modelRoot = (Ooaofooa) m_inst.getModelRoot();
		TransactionManager tm = TransactionManager.getSingleton();
		try {
			if (id.equals("Numb")) {
				if (!value.toString().equals(m_inst.getNumb())) {
					trans_name = "Change in property: 'Numb' of Communication Link";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setNumb(value.toString());
				}
			} else if (id.equals("StartText")) {
				if (!value.toString().equals(m_inst.getStarttext())) {
					trans_name = "Change in property: 'StartText' of Communication Link";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setStarttext(value.toString());
				}
			} else if (id.equals("EndText")) {
				if (!value.toString().equals(m_inst.getEndtext())) {
					trans_name = "Change in property: 'EndText' of Communication Link";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setEndtext(value.toString());
				}
			} else if (id.equals("StartVisibility")) {
				int new_val = Integer.parseInt(value.toString());
				if (new_val != m_inst.getStartvisibility()) {
					trans_name = "Change in property: 'StartVisibility' of Communication Link";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setStartvisibility(new_val);
				}
			} else if (id.equals("EndVisibility")) {
				int new_val = Integer.parseInt(value.toString());
				if (new_val != m_inst.getEndvisibility()) {
					trans_name = "Change in property: 'EndVisibility' of Communication Link";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setEndvisibility(new_val);
				}
			} else if (id.equals("Descrip")) {
				if (!value.toString().equals(m_inst.getDescrip())) {
					trans_name = "Change in property: 'Descrip' of Communication Link";//$NON-NLS-1$
					tr = tm.startTransaction(trans_name,
							Ooaofooa.getDefaultInstance());
					value_changed = true;
					m_inst.setDescrip(value.toString());
				}
			}

			// catch all exceptions and cancel the transaction
		} catch (Exception e) {
			// this can be null if there was
			// an exception starting the
			// transaction
			if (tr != null) {
				tm.cancelTransaction(tr, e);
				tr = null;
			}
			CorePlugin.logError("Transaction: " + trans_name
					+ " could not complete", e);
		}
		if (tr != null) {
			if (value_changed)
				tm.endTransaction(tr);
			else
				tm.cancelTransaction(tr);
		}
	}
}
