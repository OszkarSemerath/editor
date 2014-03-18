package com.mentor.nucleus.bp.core.ui.actions;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/ui/GenericPackageAssignComponentOnCL_ICAction.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_selection_dialog_action.inc
// Version:      $Revision: 1.10 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is the main BridgePoint entry point for the action that
// opens a selection dialog for Assign Components.
//

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.common.*;
import com.mentor.nucleus.bp.core.ui.*;
import com.mentor.nucleus.bp.core.util.*;
import com.mentor.nucleus.bp.core.ui.dialogs.*;
import org.osgi.service.prefs.*;
import com.mentor.nucleus.bp.core.ui.preferences.*;

public class GenericPackageAssignComponentOnCL_ICAction
		implements
			IObjectActionDelegate {

	/**
	 * Constructor for GenericPackageAssignComponentOnCL_ICAction.
	 */
	public GenericPackageAssignComponentOnCL_ICAction() {
		super();
	}
	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		// The part is mainly needed to locate the selection provider, and
		// we cache our selection in core so no action is needed here.
	}
	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		IStructuredSelection structuredSelection = Selection.getInstance()
				.getStructuredSelection();
		CL_IC_GenericPackageAssignComponent(structuredSelection);
	}
	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		// do nothing
	}
	public static void CL_IC_GenericPackageAssignComponent(IStructuredSelection selection) {
    // Assign the context selection variables with the action context 
      // Assign the context selection variable with the action context 
      Object context = selection.iterator().next();
      ComponentReference_c v_element = (ComponentReference_c)context;
        // select related by where USER::selectExisting
Component_c v_existingElement = Component_c.getOneC_COnR4201(v_element);

      // ensure that all Components are loaded
      PersistenceManager.ensureAllInstancesLoaded(v_element.getModelRoot(), Component_c.class);
      // now find all the elements that should be shown 
      Component_c[] elements = getElements(v_element);      
      PackageableElement_c pe = PackageableElement_c.getOnePE_PEOnR8001(v_element);
      Package_c pkg = Package_c.getOneEP_PKGOnR8000(pe);
      Component_c comp = Component_c.getOneC_COnR8003(pe);
	  // if the current selection is many, then we do not want to
	  // filter the currently set element for any of the selection
	  // if we want to be smart about it we could process each object
	  // in the selection and if they all matched the same type we
	  // could filter
	  if(Selection.getInstance().getSelectedNonRootModelElements().length > 1) {
	       v_existingElement = null;
	  }
      ElementSelectionDialog dialog = new ElementSelectionDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), elements,
		        "component", 
				 true, v_existingElement,
				false, null);
      dialog.setBlockOnOpen(true);
      dialog.setTitle("Assign Component Selection");
      int result = dialog.open();
      if(result == Window.OK) {
					Component_c v_selectedComp = (Component_c) dialog.getResult()[0];
					if(v_selectedComp != null) {

	TransactionUtil.TransactionGroup transactionGroup = 
		TransactionUtil.startTransactionsOnSelectedModelRoots("Generic Package Assign Component");
    try {
        // Ensure that actions take place between Verifier Activity executions
		Ooaofooa.beginSaveOperation();
for(Iterator<?> iterator = selection.iterator(); iterator.hasNext();) {
	v_element = (ComponentReference_c) iterator.next();
	if (   (v_element != null) )
{

if (   (v_selectedComp != null) )
{

Component_c v_currentComp = Component_c.getOneC_COnR4201(v_element);


if ( (v_currentComp != v_selectedComp) )
{

if (v_element != null) {
v_element.Assigntocomp(			    
v_selectedComp.getId() ) ;
}
else {
  Throwable t = new Throwable();
  t.fillInStackTrace();
  CorePlugin.logError("Attempted to call an operation on a null instance.", t);
}



}


}


}


}
         // end critical section
        Ooaofooa.endSaveOperation();
	// catch all exceptions and cancel the transactions
    } catch (Exception e) {
        Ooaofooa.endSaveOperation();
		TransactionUtil.cancelTransactions(transactionGroup, e);
    	CorePlugin.logError("Transaction: Generic Package Assign Component failed", e);//$NON-NLS-1$
	}
	      TransactionUtil.endTransactions(transactionGroup);
		}
	}

  }
	public static Component_c[] getElements(ComponentReference_c v_element) {
      List<Component_c> elementList = new ArrayList<Component_c>();
      PackageableElement_c pe = PackageableElement_c.getOnePE_PEOnR8001(v_element);
      Package_c pkg = Package_c.getOneEP_PKGOnR8000(pe);
      Component_c comp = Component_c.getOneC_COnR8003(pe);
	  boolean isInGenericPackage = ((pkg !=null) || (comp !=null));
      if (!isInGenericPackage) {
        Ooaofooa[] instancesUnderSystem = Ooaofooa.getInstancesUnderSystem(v_element.getModelRoot());
        for(int i = 0; i < instancesUnderSystem.length; i++) {
    	  Component_c[] elementInstances = Component_c.ComponentInstances(instancesUnderSystem[i]);
    	  for(int j = 0; j < elementInstances.length; j++) {
		  	Component_c elem = elementInstances[j];
			          if (v_element.Canassigntocomp(elem.getId(), false)) {
    			  elementList.add(elem);
			         }
    	  }
        }
		SystemModel_c sys = ((Ooaofooa)v_element.getModelRoot()).getRoot();
		if (sys.getUseglobals()) {
		  PackageableElement_c[] pes = PackageableElement_c.
		             getManyPE_PEsOnR9100(GlobalElementInSystem_c.
				                                     getManyG_EISsOnR9100(sys));
          Component_c[] elementInstances = Component_c.getManyC_CsOnR8001(pes);
  	      for(int j = 0; j < elementInstances.length; j++) {
		  	Component_c elem = elementInstances[j];
			if (!elementList.contains(elem)) {
			  // add elements once only
    		  elementList.add(elem);
		    }
  	      }
		}
	  }
      else {
	  	PackageableElement_c[] pes = null;
        if (pkg != null) {
          pkg.Clearscope();
          pkg.Collectvisibleelementsforname(true, Gd_c.Null_unique_id(), false,
                      "", pkg.getPackage_id(), Elementtypeconstants_c.COMPONENT);
		  class PETest implements ClassQueryInterface_c {
				public boolean evaluate(Object candidate) {
					SearchResultSet_c selected = (SearchResultSet_c) candidate;
					return (selected.getName().equals("") &&
                         selected.getType() == Elementtypeconstants_c.COMPONENT);
				}
		  }
		  SearchResultSet_c results =
			           SearchResultSet_c.getOnePE_SRSOnR8005(pkg, new PETest());
          pes = PackageableElement_c.getManyPE_PEsOnR8002(
		                    ElementVisibility_c.getManyPE_VISsOnR8006(results));
        }
        else {
          if (comp != null) {
            comp.Clearscope();
            comp.Collectvisibleelementsforname(true, Gd_c.Null_unique_id(), "",
            		             comp.getId(), Elementtypeconstants_c.COMPONENT);
  		    class PETest implements ClassQueryInterface_c {
				public boolean evaluate(Object candidate) {
					ComponentResultSet_c selected = (ComponentResultSet_c) candidate;
					return (selected.getName().equals("") &&
                       selected.getType() == Elementtypeconstants_c.COMPONENT);
				}
		    }
		    ComponentResultSet_c results =
			       ComponentResultSet_c.getOnePE_CRSOnR8007(comp, new PETest());
            pes = PackageableElement_c.getManyPE_PEsOnR8004(
                          ComponentVisibility_c.getManyPE_CVSsOnR8008(results));
          }
        }
        for (int i = 0; pes != null && i < pes.length; i++) {
                    Component_c elem = Component_c.getOneC_COnR8001(pes[i]);
			          if (v_element.Canassigntocomp(elem.getId(), false)) {
            elementList.add(elem);
			         }
        }
      }
	return elementList.toArray(new Component_c[elementList.size()]);
  } // end getElements(ComponentReference_c) 
} // end GenericPackageAssignComponentOnCL_ICAction

