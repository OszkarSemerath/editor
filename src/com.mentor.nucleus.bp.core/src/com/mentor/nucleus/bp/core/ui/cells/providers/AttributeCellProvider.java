//========================================================================
//
// File: src/com/mentor/nucleus/bp/core/ui/cells/AttributeCellProvider.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/generate_cell_modifiers.arc
// Version:      $Revision: 1.2 $
//
// Copyright 2005-2014 Mentor Graphics Corporation.  All rights reserved.
//
//========================================================================
// Licensed under the Apache License, Version 2.0 (the "License"); you may not 
// use this file except in compliance with the License.  You may obtain a copy 
// of the License at
//
//       http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software 
// distributed under the License is distributed on an "AS IS" BASIS, WITHOUT 
// WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.   See the 
// License for the specific language governing permissions and limitations under
// the License.
//======================================================================== 
//
//  Optional Comments about the generated java file
//

package com.mentor.nucleus.bp.core.ui.cells.providers;

import java.util.Vector;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.widgets.Composite;

  import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.NonRootModelElement;
import com.mentor.nucleus.bp.core.inspector.ObjectElement;
import com.mentor.nucleus.bp.core.ui.cells.ICellProvider;
import com.mentor.nucleus.bp.core.ui.cells.editors.*;
import com.mentor.nucleus.bp.core.util.*;

public class AttributeCellProvider implements ICellProvider {
    private String[] Pfx_Mode_vals = { "No Prefix",
        "Prefix",
        "Referred To Prefix" };
    
	@Override
	public CellEditor getCellEditor(final NonRootModelElement element,
			Composite parent, ObjectElement data) {
                if(data.getName().equals("Descrip")) {
	                CellEditor editor = new TextCellEditor(parent);
	                return editor;
	            }
                if(data.getName().equals("Prefix")) {
	                CellEditor editor = new TextCellEditor(parent);
	                return editor;
	            }
                if(data.getName().equals("Root_Nam")) {
	                CellEditor editor = new TextCellEditor(parent);
					editor.setValidator(new ModelElementNameValidator(element));
	                return editor;
	            }
                if(data.getName().equals("Pfx_Mode")) {
                	CellEditor editor = new EnumCellEditor(parent, Pfx_Mode_vals);
                	return editor;
                }
			  if(data.getName().equals("Dimensions")) {
			  	CellEditor editor = new TextCellEditor(parent);
			  	editor.setValidator(new DimensionsValidator(element));
			  	return editor;
			  }
                if(data.getName().equals("DefaultValue")) {
	                CellEditor editor = new TextCellEditor(parent);
	                return editor;
	            }

		return null;
	}

	@Override
	public boolean supportsEdit(NonRootModelElement element,
			ObjectElement data, Composite parent) {
		CellEditor editor = getCellEditor(element, parent, data);
		if(editor != null) {
			editor.dispose();
			return true;
		}
		return false;
	}
	
	@Override
	public String getValue(NonRootModelElement element, ObjectElement data) {
		if(data.getName().equals("Pfx_Mode")) {
	        Integer Pfx_Mode_value = (Integer) data.getValue();
			if(Pfx_Mode_value >= 0 && Pfx_Mode_value < Pfx_Mode_vals.length) {
				return Pfx_Mode_vals[Pfx_Mode_value];
			}
		}
		return null;
	}
	
	@Override
	public void setValue(NonRootModelElement element, ObjectElement data, Object value) {
        if(data.getName().equals("Descrip"))
        {
            if ( ! value.toString().equals(((Attribute_c) element).getDescrip()) )
            {
                ((Attribute_c) element).setDescrip(value.toString());
            }
        }
        if(data.getName().equals("Prefix"))
        {
            if ( ! value.toString().equals(((Attribute_c) element).getPrefix()) )
            {
                ((Attribute_c) element).setPrefix(value.toString());
            }
        }
        if(data.getName().equals("Root_Nam"))
        {
            if ( ! value.toString().equals(((Attribute_c) element).getRoot_nam()) )
            {
                ((Attribute_c) element).setRoot_nam(value.toString());
            }
        }
        if(data.getName().equals("Pfx_Mode"))
        {
            int new_val = Integer.parseInt(value.toString());
            if ( new_val != ((Attribute_c) element).getPfx_mode() )
            {
                ((Attribute_c) element).setPfx_mode(new_val);
            }
        }
        if(data.getName().equals("Dimensions"))
        {
            if ( ! value.toString().equals(((Attribute_c) element).getDimensions()) )
            {
                Vector dims = DimensionsUtil.getDimensionsData(value.toString(),(Attribute_c) element);
                if (dims.size() > 0) {
                    for (int i = 0; i < dims.size(); i++) {
                        int numElements = ((Integer)dims.get(i)).intValue();
                        ((Attribute_c) element).Resizedimensions(i, numElements, dims.size());
                    }
                } else {
                    ((Attribute_c) element).Resizedimensions(0, 0, 0);
                }
                ((Attribute_c) element).setDimensions(value.toString());
            }
        }
        if(data.getName().equals("DefaultValue"))
        {
            if ( ! value.toString().equals(((Attribute_c) element).getDefaultvalue()) )
            {
                ((Attribute_c) element).setDefaultvalue(value.toString());
            }
        }

	}
	
}