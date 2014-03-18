//========================================================================
//
// File: src/com/mentor/nucleus/bp/core/ui/cells/ClassInstanceParticipantCellProvider.java
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

public class ClassInstanceParticipantCellProvider implements ICellProvider {

    
	@Override
	public CellEditor getCellEditor(final NonRootModelElement element,
			Composite parent, ObjectElement data) {
                if(data.getName().equals("Name")) {
	                CellEditor editor = new TextCellEditor(parent);
					editor.setValidator(new ModelElementNameValidator(element));
	                return editor;
	            }
                if(data.getName().equals("InformalClassName")) {
	                CellEditor editor = new TextCellEditor(parent);
	                return editor;
	            }
                if(data.getName().equals("Descrip")) {
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
		return null;
	}
	
	@Override
	public void setValue(NonRootModelElement element, ObjectElement data, Object value) {
        if(data.getName().equals("Name"))
        {
            if ( ! value.toString().equals(((ClassInstanceParticipant_c) element).getName()) )
            {
                ((ClassInstanceParticipant_c) element).setName(value.toString());
            }
        }
        if(data.getName().equals("InformalClassName"))
        {
            if ( ! value.toString().equals(((ClassInstanceParticipant_c) element).getInformalclassname()) )
            {
                ((ClassInstanceParticipant_c) element).setInformalclassname(value.toString());
            }
        }
        if(data.getName().equals("Descrip"))
        {
            if ( ! value.toString().equals(((ClassInstanceParticipant_c) element).getDescrip()) )
            {
                ((ClassInstanceParticipant_c) element).setDescrip(value.toString());
            }
        }

	}
	
}
