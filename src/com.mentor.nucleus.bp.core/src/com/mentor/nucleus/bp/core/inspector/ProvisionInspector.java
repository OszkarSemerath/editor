package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/ProvisionInspector.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_object_inspector.inc
// Version:      $Revision: 1.23 $
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
//
// This class is responsible for decoupling the client model entity
// class Provision_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'Provision_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class ProvisionInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public ProvisionInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    Port_c result1 = Port_c.getOneC_POOnR4016(InterfaceReference_c.getOneC_IROnR4009((Provision_c)arg));
     if (result1 != null) {
        return result1;
    }               
    Satisfaction_c result2 = Satisfaction_c.getOneC_SFOnR4002((Provision_c)arg);
     if (result2 != null) {
        return result2;
    }               
        return null;    //No parent found           
  }
  	  
  /**
   * @see IModelClassInspector#getChildRelations(Object)
   * Returns the children of this node
   */
  public ObjectElement[] getChildRelations(Object arg) {
    int resultSize = 0;
    ProvidedOperation_c [] v_providedinterfaceoperations = 
ProvidedOperation_c.getManySPR_POsOnR4503(
ProvidedExecutableProperty_c.getManySPR_PEPsOnR4501(
(Provision_c)arg)
)
;



    sort(v_providedinterfaceoperations);
    ProvidedSignal_c [] v_providedinterfacesignals = 
ProvidedSignal_c.getManySPR_PSsOnR4503(
ProvidedExecutableProperty_c.getManySPR_PEPsOnR4501(
(Provision_c)arg)
)
;



    sort(v_providedinterfacesignals);
    Delegation_c [] v_delegatedinterfacesDelegatedProvidedInterfaces = 
Delegation_c.getManyC_DGsOnR4013(
InterfaceReferenceInDelegation_c.getManyC_RIDsOnR4013(
InterfaceReference_c.getManyC_IRsOnR4009(
(Provision_c)arg)
)
)
;



    sort(v_delegatedinterfacesDelegatedProvidedInterfaces);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_providedinterfaceoperations.length ; i++) {   
        result.add(new ObjectElement("v_providedinterfaceoperations", ObjectElement.RELATION_ROLE_ELEMENT, v_providedinterfaceoperations[i], arg, false));
    }
    for (int i = 0 ; i < v_providedinterfacesignals.length ; i++) {   
        result.add(new ObjectElement("v_providedinterfacesignals", ObjectElement.RELATION_ROLE_ELEMENT, v_providedinterfacesignals[i], arg, false));
    }
    for (int i = 0 ; i < v_delegatedinterfacesDelegatedProvidedInterfaces.length ; i++) {   
        result.add(new ObjectElement("v_delegatedinterfacesDelegatedProvidedInterfaces", ObjectElement.RELATION_ROLE_ELEMENT, v_delegatedinterfacesDelegatedProvidedInterfaces[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    ProvidedOperation_c [] v_providedinterfaceoperations = 
ProvidedOperation_c.getManySPR_POsOnR4503(
ProvidedExecutableProperty_c.getManySPR_PEPsOnR4501(
(Provision_c)arg)
)
;



    if (v_providedinterfaceoperations.length > 0) return true;
    ProvidedSignal_c [] v_providedinterfacesignals = 
ProvidedSignal_c.getManySPR_PSsOnR4503(
ProvidedExecutableProperty_c.getManySPR_PEPsOnR4501(
(Provision_c)arg)
)
;



    if (v_providedinterfacesignals.length > 0) return true;
    Delegation_c [] v_delegatedinterfacesDelegatedProvidedInterfaces = 
Delegation_c.getManyC_DGsOnR4013(
InterfaceReferenceInDelegation_c.getManyC_RIDsOnR4013(
InterfaceReference_c.getManyC_IRsOnR4009(
(Provision_c)arg)
)
)
;



    if (v_delegatedinterfacesDelegatedProvidedInterfaces.length > 0) return true;
    return false;
  }
  
  public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
  	Object[] details = new Object[4];
	if(details[0] == null && referentialClass == Interface_c.class) {
		details[0] = Interface_c.getOneC_IOnR4012(
InterfaceReference_c.getOneC_IROnR4009(
(Provision_c)arg)
)
;



;
		details[1] = arg;
		details[2] = "4012";
		details[3] = "";
	}
	return details;
  }
  
  /**
  * @seee IModelClassInspector#getReferentials(Object)
  * Returns the an array of Role Objects specifying the referenctial attibutes of
  * this model element
  * Role Name: <T_TPS.NameOnly>
  * Role Value: <Chain_result>
  * Role Type: "Referential"
  */
  public ObjectElement[] getReferentials(Object arg) {
     List<ObjectElement> referentials = new ArrayList<ObjectElement>();
        Object referential = Interface_c.getOneC_IOnR4012(
InterfaceReference_c.getOneC_IROnR4009(
(Provision_c)arg)
)

;
     referentials.add(new ObjectElement ("referential_Referenced_Interface", ObjectElement.REFERENTIAL_ATTRIBUTE_ELEMENT, referential, arg, false));
    return referentials.toArray(new ObjectElement [referentials.size()]);        
  }

  /**
  * @seee IModelClassInspector#getAttributes(Object)
  * Returns the an array of Role objects that give the attibutes of the model 
  * element it self e.g.
  * Role Name: "Name"
  * Role Value: metaModelElement.getName()
  * Role Type: "Primitive"
  */
  public ObjectElement[] getAttributes(Object arg) {
    ObjectElement attrSet[] = new ObjectElement[5];
      attrSet[0] = new ObjectElement("InformalName", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getInformalname"), arg, "getInformalname", true);
      attrSet[1] = new ObjectElement("Descrip", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getDescrip"), arg, "getDescrip", true);
    ObjectElement compAttrSet[] = new ObjectElement[2];    
    for (int i = 0; i < 2 ; i++) {
        compAttrSet[i] = attrSet[i];
    }
    return compAttrSet;
  }

    /**
     * Return configured image if none exists for the element type
     */
    public Image getImage(Object element) {
		Image image = CorePlugin.getImageFor(element, false);
		if(image != null) {
			return image;
		}
		return CorePlugin.getImageFor("Provision.gif");
	}
    }       

