//======================================================================
//
// File: ParametersC_PPPropertySource.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/BuildPropertySource.arc
// Version:      $Revision: 1.66 $
//
// (c) Copyright 2006-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================

package com.mentor.nucleus.bp.ui.properties;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

import org.eclipse.ui.views.properties.*;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.DimensionsUtil;

public class ParametersC_PPPropertySource implements IPropertySource {
	private PropertyParameter_c m_inst;
	private String[] m_DataTypeType;
	private PropertyDescriptor[] m_propertyDescriptors;
	private String[] By_Ref_vals = {"By Value", "By Reference"};
	MetadataSortingManager sorter = MetadataSortingManager.createDefault();

	public ParametersC_PPPropertySource(PropertyParameter_c inst) {
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
		return m_inst.getName();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#getPropertyDescriptors()
	 */
	public IPropertyDescriptor[] getPropertyDescriptors()
    {
    if(m_inst == null || m_inst.isOrphaned())
        return new IPropertyDescriptor[0];
      int num_children = 0;
        if (m_propertyDescriptors == null
            || 5 + num_children != m_propertyDescriptors.length)
        {
            m_propertyDescriptors =
                new PropertyDescriptor[5 + num_children];
            boolean readonly = false;

                m_propertyDescriptors[0] = new TextPropertyDescriptor("Name", "Parameter Name");
                m_propertyDescriptors[0].setValidator(new ModelElementNameValidator(m_inst));
                m_propertyDescriptors[0].setCategory(BridgepointPropertySheetPage.basicCategoryName);
                m_propertyDescriptors[1] = new DescriptionPropertyDescriptor("Descrip", "Parameter Description", m_inst);
                m_propertyDescriptors[1].setCategory(BridgepointPropertySheetPage.basicCategoryName);
                m_propertyDescriptors[2] = new EnumPropertyDescriptor("By_Ref", "By Reference Indicator", By_Ref_vals, readonly);
                m_propertyDescriptors[2].setCategory(BridgepointPropertySheetPage.basicCategoryName);
                m_propertyDescriptors[3] = new DimensionsPropertyDescriptor("Dimensions", "Array Dimensions", readonly);
                m_propertyDescriptors[3].setValidator(new DimensionsValidator((NonRootModelElement)m_inst));
                m_propertyDescriptors[3].setDescription(DimensionsValidator.getDimensionsHelpText( readonly ));
                m_propertyDescriptors[3].setCategory(BridgepointPropertySheetPage.basicCategoryName);

        int d_index = 4;
      // create combobox descriptor for Data Type
           Object[] rootsOfDataTypePackages = m_inst.getModelRoot().getModelRoots("DataTypePackage", "Domain, ComponentPackage");     
            Object[] rootsOfPackages= m_inst.getModelRoot().getModelRoots("Package", "Domain, ComponentPackage");
            List<Object> bothRoots = new ArrayList<Object>(rootsOfDataTypePackages.length + rootsOfPackages.length); 
            Collections.addAll(bothRoots , rootsOfDataTypePackages);
            Collections.addAll(bothRoots , rootsOfPackages);
            Object[] roots = bothRoots.toArray();
           
            ArrayList<DataType_c> list = new ArrayList<DataType_c>();
            for(int i = 0; i < roots.length; i++) {
                DataType_c[] children = DataType_c.DataTypeInstances((ModelRoot) roots[i]);
                for(int j = 0; j < children.length; j++) {
                    DatatypeInSuppression_c dis = DatatypeInSuppression_c.getOneS_DISOnR47(children[j]);
                    SystemDatatypeInPackage_c sdip = SystemDatatypeInPackage_c.getOneSLD_SDINPOnR4401(children[j]);
                  PackageableElement_c pe = PackageableElement_c.getOnePE_PEOnR8001(children[j]);
                  if(dis == null && sdip != null) {
                       list.add(children[j]);
                  } else if(dis == null && pe != null) {
                        list.add(children[j]);
                  }
                }
            }
              DataType_c [] set31 = list.toArray(new DataType_c[list.size()]);
    List list32 = new ArrayList(set31.length);
        for (int i = 0; i < set31.length; ++i)
        {
            if ( m_inst.Isallowedtype(set31[i].getName()) )
            {
              list32.add(set31[i].getName());
            }
        }
        Collections.sort(list32, new Comparator() {
            Collator coll = Collator.getInstance(Locale.getDefault());
            public int compare(Object a, Object b) {
                return coll.compare((String)a, (String)b);
            }
        });
        m_DataTypeType = new String[list32.size()];
        for (int i = 0; i < list32.size(); ++i)
        {
            m_DataTypeType[i] = (String)list32.get(i);
        }
			m_propertyDescriptors[d_index] = new ChooserPropertyDescriptor(
					"DataType",
                    "Type",
					 m_inst,
					"com.mentor.nucleus.bp.core.ui.actions.SetTypeOnC_PPAction", readonly);
        m_propertyDescriptors[d_index].setCategory(BridgepointPropertySheetPage.basicCategoryName);
        ++d_index;
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
		if (id.equals("Name")) {
			return m_inst.getName();
		} else if (id.equals("Descrip")) {
			return m_inst.getDescrip().replace('\n', '/');
		} else if (id.equals("By_Ref")) {
			return By_Ref_vals[m_inst.getBy_ref()];
		} else if (id.equals("Dimensions")) {
			return m_inst.getDimensions();
		}
		int d_index = 4;
		// getPropertyValue for combobox for Data Type
		if (id.equals("DataType")) {
			DataType_c val = DataType_c
					.getOneS_DTOnR4007((PropertyParameter_c) m_inst);

			if (val != null)
				return val.getName();
		}
		++d_index;
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.views.properties.IPropertySource#setPropertyValue(java.lang.Object, java.lang.Object)
	 */
	public void setPropertyValue(Object id, Object value)
    {
        boolean value_changed = false;
        String trans_name = "";
        Transaction tr = null;
        Ooaofooa modelRoot = (Ooaofooa)m_inst.getModelRoot();
        TransactionManager tm = TransactionManager.getSingleton();
        try {
        if (id.equals("Name"))
        {
            if ( ! value.toString().equals(m_inst.getName()) )
            {
                trans_name = "Change in property: 'Name' of Property Parameter";//$NON-NLS-1$
                tr = tm.startTransaction(trans_name, Ooaofooa.getDefaultInstance());
                value_changed = true;
                m_inst.setName(value.toString());
            }
        }
        else if (id.equals("Descrip"))
        {
            if ( ! value.toString().equals(m_inst.getDescrip()) )
            {
                trans_name = "Change in property: 'Descrip' of Property Parameter";//$NON-NLS-1$
                tr = tm.startTransaction(trans_name, Ooaofooa.getDefaultInstance());
                value_changed = true;
                m_inst.setDescrip(value.toString());
            }
        }
        else if (id.equals("By_Ref"))
        {
            int new_val = Integer.parseInt(value.toString());
            if ( new_val != m_inst.getBy_ref() )
            {
                trans_name = "Change in property: 'By_Ref' of Property Parameter";//$NON-NLS-1$
                tr = tm.startTransaction(trans_name, Ooaofooa.getDefaultInstance());
                value_changed = true;
                m_inst.setBy_ref(new_val);
            }
        }
        else if (id.equals("Dimensions"))
        {
            if ( ! value.toString().equals(m_inst.getDimensions()) )
            {
                trans_name = "Change in property: 'Dimensions' of Property Parameter";//$NON-NLS-1$
                tr = tm.startTransaction(trans_name, Ooaofooa.getDefaultInstance());
                value_changed = true;
                Vector dims = DimensionsUtil.getDimensionsData(value.toString(),m_inst);
                if (dims.size() > 0) {
                    for (int i = 0; i < dims.size(); i++) {
                        int numElements = ((Integer)dims.get(i)).intValue();
                        m_inst.Resizedimensions(i, numElements, dims.size());
                    }
                } else {
                    m_inst.Resizedimensions(0, 0, 0);
                }
                m_inst.setDimensions(value.toString());
            }
        }


        int d_index = 4;
        if (id.equals("DataType"))
        {
    DataType_c val = 
DataType_c.getOneS_DTOnR4007(
(PropertyParameter_c)m_inst)
;



           if ( ! value.equals(val.getName()) )
           {
// To be revisited                   Object[] roots = m_inst.getModelRoot().getModelRoots("DataTypePackage", "Domain, ComponentPackage");
                    Object[] rootsOfDataTypePackages = m_inst.getModelRoot().getModelRoots("DataTypePackage",  "Domain, ComponentPackage");   
                    Object[] rootsOfPackages= m_inst.getModelRoot().getModelRoots("Package",  "Domain, ComponentPackage");
                    List<Object> bothRoots = new ArrayList<Object>(rootsOfDataTypePackages.length + rootsOfPackages.length); 
                    Collections.addAll(bothRoots , rootsOfDataTypePackages);
                    Collections.addAll(bothRoots , rootsOfPackages);
                    Object[] roots = bothRoots.toArray();
                    
                     ArrayList<DataType_c> list = new ArrayList<DataType_c>();
                 for(int i = 0; i < roots.length; i++) {
                    DataType_c[] children = DataType_c.DataTypeInstances((ModelRoot) roots[i]);
                            for(int j = 0; j < children.length; j++) {
                                list.add(children[j]);
                            }
                        }
              DataType_c [] set33 = list.toArray(new DataType_c[list.size()]);
            for (int i = 0; i < set33.length; ++i )
            {
                if ( value.equals(set33[i].getName()) )
                {
                        trans_name = "Change in property: 'Type' of Property Parameter"; //$NON-NLS-1$
                        tr = tm.startTransaction(trans_name, Ooaofooa.getDefaultInstance());
                    m_inst.unrelateAcrossR4007From(val);
                    m_inst.relateAcrossR4007To(set33[i]);
                    value_changed = true;
                    break;
                }
            }
          }
        }
        ++d_index;

    // catch all exceptions and cancel the transaction
        } catch (Exception e) {
            // this can be null if there was
            // an exception starting the
            // transaction
            if(tr != null) {
                tm.cancelTransaction(tr, e);
                tr = null;
            }
            CorePlugin.logError("Transaction: " + trans_name + " could not complete", e);
        }
        if (tr != null){
            if ( value_changed )
                tm.endTransaction(tr);
            else
                tm.cancelTransaction(tr);
        }
    }
}
