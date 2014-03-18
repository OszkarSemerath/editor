package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/RequiredSignalInspector.java
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
// class RequiredSignal_c from the traversal mechanisms that it provides to
// model diff.
//
import com.mentor.nucleus.bp.core.*;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;
import java.util.*;

/**
 * This file adapts the meta-model entity; 'RequiredSignal_c' to provide 
 * support of traversing to its children and parents.
 * <p>
 * Do not edit this class, it was created using the Mentor Graphics
 * MC-Java code generator product.
 * </p>
 */
public class RequiredSignalInspector extends BaseModelClassInspector {

  private String parentAssoc;
  
  public RequiredSignalInspector(MetadataSortingManager sortingManager){
    super(sortingManager);
  }

  /**
   * @see IModelClassInspector#getParent(Object)
   * Returns the parent(s) of this node
   */
  public Object getParent(Object arg) {
    Requirement_c result1 = Requirement_c.getOneC_ROnR4500(RequiredExecutableProperty_c.getOneSPR_REPOnR4502((RequiredSignal_c)arg));
     if (result1 != null) {
        return result1;
    }               
    ImportedRequirement_c result2 = ImportedRequirement_c.getOneCL_IROnR4703(ImportedReference_c.getOneCL_IIROnR4701(InterfaceReference_c.getOneC_IROnR4009(Requirement_c.getOneC_ROnR4500(RequiredExecutableProperty_c.getOneSPR_REPOnR4502((RequiredSignal_c)arg)))));
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
    PropertyParameter_c [] v_parameters = 
PropertyParameter_c.getManyC_PPsOnR4006(
ExecutableProperty_c.getManyC_EPsOnR4500(
RequiredExecutableProperty_c.getManySPR_REPsOnR4502(
(RequiredSignal_c)arg)
)
)
;



    sort(v_parameters);
    List<ObjectElement> result = new ArrayList<ObjectElement> ();
    for (int i = 0 ; i < v_parameters.length ; i++) {   
        result.add(new ObjectElement("v_parameters", ObjectElement.RELATION_ROLE_ELEMENT, v_parameters[i], arg, false));
    }
    return result.toArray(new ObjectElement[result.size()]);
  }
  /**
   * @see IModelClassInspector#hasChildren(Object)
   * Returns true if this node has any children
   */
  public boolean hasChildRelations(Object arg) {
    PropertyParameter_c [] v_parameters = 
PropertyParameter_c.getManyC_PPsOnR4006(
ExecutableProperty_c.getManyC_EPsOnR4500(
RequiredExecutableProperty_c.getManySPR_REPsOnR4502(
(RequiredSignal_c)arg)
)
)
;



    if (v_parameters.length > 0) return true;
    return false;
  }
  
  public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
  	Object[] details = new Object[4];
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
    ObjectElement attrSet[] = new ObjectElement[6];
      attrSet[0] = new ObjectElement("Name", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getName"), arg, "getName", true);
      attrSet[0].setDerived();
      attrSet[1] = new ObjectElement("Descrip", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getDescrip"), arg, "getDescrip", true);
      attrSet[1].setDerived();
      attrSet[2] = new ObjectElement("Action_Semantics", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getAction_semantics"), arg, "getAction_semantics", true);
      attrSet[2].setDerived();
      attrSet[3] = new ObjectElement("Suc_Pars", ObjectElement.ATTRIBUTE_ELEMENT,  invokeMethod(arg, "getSuc_pars"), arg, "getSuc_pars", true);
    ObjectElement compAttrSet[] = new ObjectElement[4];    
    for (int i = 0; i < 4 ; i++) {
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
		return CorePlugin.getImageFor("RequiredSignal.gif");
	}
    }       

