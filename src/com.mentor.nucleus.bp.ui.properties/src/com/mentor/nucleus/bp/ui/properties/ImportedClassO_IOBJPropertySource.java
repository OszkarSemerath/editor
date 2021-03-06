//======================================================================
//
// File: ImportedClassO_IOBJPropertySource.java
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

public class ImportedClassO_IOBJPropertySource implements IPropertySource {
	private ImportedClass_c m_inst;
	private ModelClass_c[] m_ClassClassReference;
	private PropertyDescriptor[] m_propertyDescriptors;

	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public ImportedClassO_IOBJPropertySource(ImportedClass_c inst) {
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
		ModelClass_c[] v_classClassReference = ModelClass_c
				.getManyO_OBJsOnR101((ImportedClass_c) m_inst);

		m_ClassClassReference = v_classClassReference;
		num_children += m_ClassClassReference.length;

		sorter.sort(v_classClassReference);
		if (m_propertyDescriptors == null
				|| 2 + num_children != m_propertyDescriptors.length) {
			m_propertyDescriptors = new PropertyDescriptor[2 + num_children];
			boolean readonly = false;

			m_propertyDescriptors[0] = new PropertyDescriptor("Obj_Name",
					"Class Name");
			m_propertyDescriptors[0]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);
			m_propertyDescriptors[1] = new PropertyDescriptor("Obj_KL",
					"Class Key Letter");
			m_propertyDescriptors[1]
					.setCategory(BridgepointPropertySheetPage.basicCategoryName);

			int d_index = 2;
			for (int i = 0; i < m_ClassClassReference.length; ++i) {
				m_propertyDescriptors[d_index] = new PropertyDescriptor(
						"ClassClassReference." + String.valueOf(i),
						"Class Reference");
				m_propertyDescriptors[d_index].setCategory("Class");
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
		if (id.equals("Obj_Name")) {
			return m_inst.getObj_name();
		} else if (id.equals("Obj_KL")) {
			return m_inst.getObj_kl();
		}
		int d_index = 2;
		for (int i = 0; i < m_ClassClassReference.length; ++i) {
			if (m_propertyDescriptors[d_index].getId().equals(id)) {
				return new ClassO_OBJPropertySource(m_ClassClassReference[i]);
			}
			++d_index;
		}

		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value) {
	}
}
