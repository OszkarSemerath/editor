//========================================================================
//
//File:      com.mentor.nucleus.bp.utilities/src/com/mentor/nucleus/bp/utilities/actions/CheckModelIntegrity.java
//
//Copyright 2005-2014 Mentor Graphics Corporation. All rights reserved.
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
package com.mentor.nucleus.bp.utilities.data;

import java.util.Iterator;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IActionDelegate;

import com.mentor.nucleus.bp.core.Component_c;
import com.mentor.nucleus.bp.core.ModelClass_c;
import com.mentor.nucleus.bp.core.Package_c;
import com.mentor.nucleus.bp.core.PackageableElement_c;

public class ListPackageContents implements IActionDelegate {

	private ISelection selection;
	
	public void show(String message) {
		MessageDialog messageDialog = new MessageDialog(
			null,
			"Info",
			null,
			message,
			MessageDialog.INFORMATION,
			new String[]{"Ok"}, 0);
		messageDialog.open();
	}
	
	@Override
	public void run(IAction action) {
		
		if (selection instanceof StructuredSelection) {
			StructuredSelection structuredSelection = (StructuredSelection) selection;
			String res = "";
			for(Iterator<?> iterator = structuredSelection.iterator(); iterator.hasNext();) {
				Package_c pkg = (Package_c) iterator.next();
				res+=getContent(pkg, 0);
			}
			show(res);
		}
	}
	
	String spaces(int s) {
		String result = "";
		for(int i=0; i<s; i++) result+="|";
		return result;
	}
	
	String getContent(Package_c package_c, int size) {
		String res = "";
		res+=spaces(size) + "+Package: " + package_c.getName() + "\n";
		
		for(ModelClass_c c : ModelClass_c.getManyO_OBJsOnR8001(PackageableElement_c.getManyPE_PEsOnR8000(package_c))) {
			
			res+=spaces(size) + "+-Content: " + c.getName() + "\n";
		}
		
		for(Package_c p : Package_c.getManyEP_PKGsOnR8001(PackageableElement_c.getManyPE_PEsOnR8000(package_c))) {
			
			res+=getContent(p, size+1);
		}
		
		return res;
	}
	
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// cache the selection
		this.selection = selection;
	}

}
