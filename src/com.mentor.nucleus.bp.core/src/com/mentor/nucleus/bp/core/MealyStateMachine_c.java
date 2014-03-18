      
package com.mentor.nucleus.bp.core ;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.MealyStateMachine_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.* ;
import java.lang.reflect.*;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import com.mentor.nucleus.bp.core.util.PersistenceUtil;
import org.eclipse.core.runtime.NullProgressMonitor;
import com.mentor.nucleus.bp.core.ui.marker.UmlProblem;
import com.mentor.nucleus.bp.core.common.*;      
abstract class EV_MEALY_STATE_MACHINE extends genericEvent_c 
{
  public abstract int getEvtcode() ;
}

public class MealyStateMachine_c extends NonRootModelElement implements IAdaptable, Cloneable
{
  // Public Constructors
  public MealyStateMachine_c(ModelRoot modelRoot,
       java.util.UUID         p_m_sm_id)
  {
    super(modelRoot);
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       m_sm_id = IdAssigner.preprocessUUID(p_m_sm_id);
        
    Object [] key = {m_sm_id};
    addInstanceToMap(key);
  }
  static public MealyStateMachine_c createProxy(ModelRoot modelRoot,
       java.util.UUID         p_m_sm_id, String p_contentPath, IPath p_localPath)
  {
	  ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot, p_contentPath, p_localPath);
	  // if a model root was not resolved it is most likely
	  // due to a missing file of the proxy, defualt back to
	  // the original model root
	  if(resolvedModelRoot != null)
	  	modelRoot = resolvedModelRoot;
      InstanceList instances = modelRoot.getInstanceList(MealyStateMachine_c.class);
      MealyStateMachine_c new_inst = null;
      synchronized(instances) {
          Object[] key = {p_m_sm_id};
          new_inst = (MealyStateMachine_c) instances.get(key) ;
        }
	String contentPath = PersistenceUtil.resolveRelativePath(
			p_localPath,
			new Path(p_contentPath));
	if(modelRoot.isNewCompareRoot()) {
	      // for comparisons we do not want to change
	      // the content path
	      contentPath = p_contentPath;
	}
	if ( new_inst != null && !modelRoot.isCompareRoot()) {
		PersistableModelComponent pmc = new_inst.getPersistableComponent();
		if (pmc == null) {
			// dangling reference, redo this instance
			new_inst.batchUnrelate();
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       new_inst.m_sm_id = IdAssigner.preprocessUUID(p_m_sm_id);
        
		}
	}
	if ( new_inst == null ) {
		// there is no instance matching the id, create a proxy
		// if the resource doesn't exist then this will be a dangling reference
    	new_inst = new MealyStateMachine_c(modelRoot,
p_m_sm_id
);
		new_inst.m_contentPath = contentPath;
	}
    return new_inst;
  }

  static public MealyStateMachine_c resolveInstance(ModelRoot modelRoot,
       java.util.UUID         p_m_sm_id){
    InstanceList instances = modelRoot.getInstanceList(MealyStateMachine_c.class);
    MealyStateMachine_c source = null;
    synchronized(instances) {
        Object [] key = {
        p_m_sm_id
            };
        source = (MealyStateMachine_c) instances.get(key);
        if (source != null && !modelRoot.isCompareRoot()) {
           source.convertFromProxy();
           source.batchUnrelate();
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       source.m_sm_id = IdAssigner.preprocessUUID(p_m_sm_id);
        
           return source ;
        }
      }
      // there is no instance matching the id
    MealyStateMachine_c new_inst = new MealyStateMachine_c(modelRoot,
p_m_sm_id
);
    return new_inst;
  }
  public MealyStateMachine_c(ModelRoot modelRoot)
  {
    super(modelRoot);
     m_sm_id = IdAssigner.NULL_UUID;   
    Object [] key = {m_sm_id};
    addInstanceToMap(key);
  }

  public Object getInstanceKey() {
    Object [] key =  {m_sm_id};
		return key;
  }
  
  public boolean setInstanceKey(UUID p_newKey){
  
  	boolean changed = false;
		// round p1
		// round p2
		// round p3
			// round p4
			// round p5
	if (m_sm_id !=  p_newKey ){
	
		m_sm_id = p_newKey; 	
		changed = true;
	}
  	return changed;
  }
  

  



  public boolean equals (Object elem) {
     if (!(elem instanceof MealyStateMachine_c)) {
         return false;
     }
	    // check that the model-roots are the same
    	if (((NonRootModelElement)elem).getModelRoot() != getModelRoot()) {
    		return false;
    	}
    	
     return identityEquals(elem);
  }
  
   public boolean identityEquals(Object elem) {
       if (!(elem instanceof MealyStateMachine_c)) {
           return false;
       }
       
       MealyStateMachine_c me = (MealyStateMachine_c)elem;
      // don't allow an empty id-value to produce a false positive result;
      // in this case, use whether the two instances are actually the same 
      // one in memory, instead
      if ((IdAssigner.NULL_UUID.equals(getSm_id()) || IdAssigner.NULL_UUID.equals(((MealyStateMachine_c)elem).getSm_id())) && this != elem) {
      	return false;
      }
      if (!getSm_id().equals(((MealyStateMachine_c)elem).getSm_id())) return false;
      return true;
    }

   public boolean cachedIdentityEquals(Object elem) {
       if (!(elem instanceof MealyStateMachine_c)) {
           return false;
       }
       
       MealyStateMachine_c me = (MealyStateMachine_c)elem;
      if (!getSm_idCachedValue().equals(((MealyStateMachine_c)elem).getSm_idCachedValue())) return false;
      return true;
    }


  // Attributes
  private java.util.UUID         m_sm_id ;
      
// declare association references from this class
  
  
    
// referring navigation

StateMachine_c IsSupertypeStateMachine ;
public void relateAcrossR510To(StateMachine_c target)
{
	relateAcrossR510To(target, true);
}
public void relateAcrossR510To(StateMachine_c target, boolean notifyChanges)
{
	if (target == null) return;
	
	if (target == IsSupertypeStateMachine) return;  // already related

    if ( IsSupertypeStateMachine != target ) {
    
    Object oldKey = getInstanceKey();

    if (IsSupertypeStateMachine != null) {
    
        IsSupertypeStateMachine.clearBackPointerR510To(this);
        
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) {   //$NON-NLS-1$
		Ooaofooa.log.println(ILogger.CONSISTENCY, 
			"MealyStateMachine_c.relateAcrossR510To(StateMachine_c target)", 
			"Relate performed across R510 from Mealy State Machine to State Machine without unrelate of prior instance.");  
		}
    }
                
    	IsSupertypeStateMachine = target ;
        m_sm_id = target.getSm_id();
      updateInstanceKey(oldKey, getInstanceKey());
	    target.setBackPointerR510To(this);
        target.addRef();
      if(notifyChanges) {
	    	RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(Modeleventnotification_c.DELTA_ELEMENT_RELATED, this, target, "510", "");
        Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(change);
      }
    }
}
public void unrelateAcrossR510From(StateMachine_c target)
{
	unrelateAcrossR510From(target, true);
}
public void unrelateAcrossR510From(StateMachine_c target, boolean notifyChanges)
{
	if (target == null) return;
	
	if (IsSupertypeStateMachine == null) return;  // already unrelated
	
	if (target != IsSupertypeStateMachine) {
		Exception e = new Exception();
		e.fillInStackTrace();
		CorePlugin.logError("Tried to unrelate from non-related instance across R510", e);
		return;
	}

    if (target != null) {
        target.clearBackPointerR510To(this);
    }
    

      if(IsSupertypeStateMachine != null) {
      
        m_sm_id = IsSupertypeStateMachine.getSm_id();
        IsSupertypeStateMachine = null ;
        target.removeRef();
      if(notifyChanges) { 
        RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this, target, "510", "");
        Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(change);
      }
    }
}

  
    
      
public static MealyStateMachine_c getOneSM_MEALYOnR510(StateMachine_c [] targets)
{
    return getOneSM_MEALYOnR510(targets, null);
}

public static MealyStateMachine_c getOneSM_MEALYOnR510(StateMachine_c [] targets, ClassQueryInterface_c test)
{
    MealyStateMachine_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           ret_val = getOneSM_MEALYOnR510(targets[i], test);
        }
    }

    return ret_val;
}

public static MealyStateMachine_c getOneSM_MEALYOnR510(StateMachine_c target)
{
  return getOneSM_MEALYOnR510(target, null);
}

public static MealyStateMachine_c getOneSM_MEALYOnR510(StateMachine_c target, boolean loadComponent)
{
    return getOneSM_MEALYOnR510(target.getModelRoot(), target, null, loadComponent);
}

public static MealyStateMachine_c getOneSM_MEALYOnR510(StateMachine_c target, ClassQueryInterface_c test)
{
  if (target != null) {
    return getOneSM_MEALYOnR510(target.getModelRoot(), target, test);
  }
  return null;
}

public static MealyStateMachine_c getOneSM_MEALYOnR510(ModelRoot modelRoot, StateMachine_c target, ClassQueryInterface_c test)
{
	return getOneSM_MEALYOnR510(modelRoot, target, test, true);
}

public static MealyStateMachine_c getOneSM_MEALYOnR510(ModelRoot modelRoot, StateMachine_c target, ClassQueryInterface_c test, boolean loadComponent)
{
   return find_getOneSM_MEALYOnR510(modelRoot,target,test);
}
private static MealyStateMachine_c find_getOneSM_MEALYOnR510(ModelRoot modelRoot, StateMachine_c target, ClassQueryInterface_c test)
{
  if (target != null) {
    MealyStateMachine_c source = (MealyStateMachine_c)target.backPointer_IsSubtypeMealyStateMachineIsSubtype_R510;
    if (source != null && (test == null || test.evaluate(source))) {
      return source;
    }
  }
  // not found
  return null ;
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR510(StateMachine_c [] targets)
{
  return getManySM_MEALYsOnR510(targets, null);
}
public static MealyStateMachine_c [] getManySM_MEALYsOnR510(StateMachine_c [] targets, boolean loadComponent)
{
  return getManySM_MEALYsOnR510(targets, null, loadComponent);
}
public static MealyStateMachine_c [] getManySM_MEALYsOnR510(StateMachine_c [] targets, ClassQueryInterface_c test)
{
	return getManySM_MEALYsOnR510(targets, test, true);
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR510(StateMachine_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{

  if(targets == null || targets.length == 0 || targets[0] == null)
  	return new MealyStateMachine_c[0];

  ModelRoot modelRoot = targets[0].getModelRoot();
 
   InstanceList instances = modelRoot.getInstanceList(MealyStateMachine_c.class);

  Vector matches = new Vector();
  for (int i = 0 ; i < targets.length ; i++) {
      MealyStateMachine_c source = (MealyStateMachine_c)targets[i].backPointer_IsSubtypeMealyStateMachineIsSubtype_R510;
      if (source != null && (test == null || test.evaluate(source))) {
        matches.add(source);
      }
  }
  if (matches.size() > 0) {
	MealyStateMachine_c[] ret_set = new MealyStateMachine_c[matches.size()];
	matches.copyInto(ret_set);
	return ret_set;
  } else {
	return new MealyStateMachine_c[0];
  }
  }

public static MealyStateMachine_c [] getManySM_MEALYsOnR510(StateMachine_c target)
{
  if (target != null) {
    StateMachine_c [] targetArray = new StateMachine_c[1];
    targetArray[0] = target;
    return getManySM_MEALYsOnR510(targetArray);
  } else {
    MealyStateMachine_c [] result = new MealyStateMachine_c [0] ;
  return result ;
}
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR510(StateMachine_c target, boolean loadComponent)
{
  if (target != null) {
    StateMachine_c [] targetArray = new StateMachine_c[1];
    targetArray[0] = target;
    return getManySM_MEALYsOnR510(targetArray, loadComponent);
  } else {
    MealyStateMachine_c [] result = new MealyStateMachine_c [0] ;
  return result ;
}
}




// declare associations referring to this class

    
  
  
// referred to navigation

ArrayList<MealyActionHome_c> backPointer_MealyActionHome_R512 = new ArrayList<MealyActionHome_c>();

public void setMealyActionHomeOrderInChildListR512(MealyActionHome_c target, int index) {
	unrelateAcrossR512From(target);
	MealyActionHome_c[] elements = MealyActionHome_c.getManySM_MEAHsOnR512(this);
	int count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			unrelateAcrossR512From((MealyActionHome_c) elements[i]); 
		}
		count++;
	}
	relateAcrossR512To(target);
	count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			relateAcrossR512To((MealyActionHome_c) elements[i]);
		}
		count++;
	}
}

public void relateAcrossR512To(MealyActionHome_c target)
{
  if (target != null) {
    target.relateAcrossR512To(this, true) ;
  }
}

public void relateAcrossR512To(MealyActionHome_c target, boolean notifyChanges)
{
  if (target != null) {
    target.relateAcrossR512To(this, notifyChanges) ;
  }
}

public void setBackPointerR512To(MealyActionHome_c target)
{
  	synchronized (backPointer_MealyActionHome_R512) {
		backPointer_MealyActionHome_R512.add(target);
	}
}

public void unrelateAcrossR512From(MealyActionHome_c target)
{
  if (target != null) {
    target.unrelateAcrossR512From(this, true) ;
  }
}

public void unrelateAcrossR512From(MealyActionHome_c target, boolean notifyChanges)
{
  if (target != null) {
    target.unrelateAcrossR512From(this, notifyChanges) ;
  }
}

public void clearBackPointerR512To(MealyActionHome_c target)
{
  synchronized (backPointer_MealyActionHome_R512) {
	    backPointer_MealyActionHome_R512.remove(target);
	}
}

public static MealyStateMachine_c getOneSM_MEALYOnR512(MealyActionHome_c [] targets)
{
    return getOneSM_MEALYOnR512(targets, null);
}

public static MealyStateMachine_c getOneSM_MEALYOnR512(MealyActionHome_c [] targets, ClassQueryInterface_c test)
{
    return getOneSM_MEALYOnR512(targets, test, true);
}

public static MealyStateMachine_c getOneSM_MEALYOnR512(MealyActionHome_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{
    MealyStateMachine_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           if (test != null) {
             MealyStateMachine_c candidate_val = getOneSM_MEALYOnR512(targets[i],true);
             if ( candidate_val != null && test.evaluate(candidate_val) )
             {
               ret_val = candidate_val;
               break;
             }
           }
           else {
             ret_val = getOneSM_MEALYOnR512(targets[i], loadComponent);
             if (ret_val != null) {
               break;
             }
           }
        }
    }
    return ret_val;
}

public static MealyStateMachine_c getOneSM_MEALYOnR512(MealyActionHome_c target)
{
	return getOneSM_MEALYOnR512(target, true);
}
public static MealyStateMachine_c getOneSM_MEALYOnR512(MealyActionHome_c target, boolean loadComponent)
{
  if (target != null) {
	if(loadComponent){
	     target.loadProxy();
	}
    return target.MealyStateMachine ;
  } else {
    return null;
  }
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR512(MealyActionHome_c [] targets,
    ClassQueryInterface_c test)
{
	return getManySM_MEALYsOnR512(targets, test, true);
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR512(MealyActionHome_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new MealyStateMachine_c[0];
  
  
  LinkedHashSet<MealyStateMachine_c> elementsSet = new LinkedHashSet<MealyStateMachine_c>();
  for (int i = 0; i < targets.length; i++) {
	if(loadComponent && targets[i] != null && targets[i].MealyStateMachine == null)
	  targets[i].loadProxy();
    MealyStateMachine_c associate = targets[i].MealyStateMachine;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
            }
    }
  }

  MealyStateMachine_c[] result = new MealyStateMachine_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR512(MealyActionHome_c [] targets)
{
  return getManySM_MEALYsOnR512(targets, null);
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR512(MealyActionHome_c target,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if (target != null) {
    MealyActionHome_c [] targetArray = new MealyActionHome_c[1];
    targetArray[0] = target;
    return getManySM_MEALYsOnR512(targetArray, test, loadComponent);
  } else {
    MealyStateMachine_c [] result = new MealyStateMachine_c [0] ;
    return result ;
  }
  
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR512(MealyActionHome_c target,
    ClassQueryInterface_c test)
{
    return getManySM_MEALYsOnR512(target, null, true);
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR512(MealyActionHome_c target)
{
    return getManySM_MEALYsOnR512(target, null, true);
}

public static MealyStateMachine_c [] getManySM_MEALYsOnR512(MealyActionHome_c target, boolean loadComponent)
{
    return getManySM_MEALYsOnR512(target, null, loadComponent);
}

public static MealyStateMachine_c getOneSM_MEALYOnR512(Transition_c target)
{
  return MealyStateMachine_c.getOneSM_MEALYOnR512(MealyActionHome_c.getOneSM_MEAHOnR512(target)) ;
}

public static MealyStateMachine_c getOneSM_MEALYOnR512(Transition_c target,
    ClassQueryInterface_c test)
{
  return MealyStateMachine_c.getOneSM_MEALYOnR512(MealyActionHome_c.getManySM_MEAHsOnR512(target), test) ;
}



      
  public void batchRelate(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots)
  {
      batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
  }
  
  public void batchRelate(ModelRoot modelRoot, boolean relateProxies, boolean notifyChanges, boolean searchAllRoots)
  {
        InstanceList instances=null;
        ModelRoot baseRoot = modelRoot;

      // R510
      StateMachine_c relInst38570 = (StateMachine_c) baseRoot.getInstanceList(StateMachine_c.class).get(new Object[] {m_sm_id});
            // if there was no local element, check for any global elements
            // failing that proceed to check other model roots
      		if (relInst38570 == null) {
      			relInst38570 = (StateMachine_c) Ooaofooa.getDefaultInstance().getInstanceList(StateMachine_c.class).get(new Object[] {m_sm_id});
      		}
			if (relInst38570 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
				    if(roots[i].isCompareRoot()) {
				         // never use elements from any compare root
				         continue;
				    }
					relInst38570 = (StateMachine_c) roots[i].getInstanceList(StateMachine_c.class).get(new Object[] {m_sm_id});
					if (relInst38570 != null)
						break;
				}
			}
			//synchronized
      if ( relInst38570 != null )
      {
          if (relateProxies || !isProxy() || (inSameComponent(this, relInst38570) && !isProxy())) {
	      relInst38570.relateAcrossR510To(this, notifyChanges);
	  }
	  }
	          
	}
  public void batchUnrelate(boolean notifyChanges)
  {
		NonRootModelElement inst=null;
      // R510
      // SM_SM
		  inst=IsSupertypeStateMachine;
			unrelateAcrossR510From(IsSupertypeStateMachine, notifyChanges);
          if ( inst != null ) {
			   inst.removeRef();
	      }
	}
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
  }	  
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(MealyStateMachine_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final MealyStateMachine_c inst = (MealyStateMachine_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }

  public static void clearInstances(ModelRoot modelRoot)
  {
    InstanceList instances = modelRoot.getInstanceList(MealyStateMachine_c.class);
    synchronized(instances) {
       for(int i=instances.size()-1; i>=0; i--){
              ((NonRootModelElement)instances.get(i)).delete_unchecked();
       }
    
    }
  }

  public static MealyStateMachine_c MealyStateMachineInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {
  		MealyStateMachine_c result=findMealyStateMachineInstance(modelRoot,test,loadComponent);
  		if(result==null && loadComponent){
     List pmcs =  PersistenceManager.findAllComponents(modelRoot,MealyStateMachine_c.class);
		for (int i = 0; i < pmcs.size(); i++) {
			PersistableModelComponent component = (PersistableModelComponent) pmcs
				.get(i);
			if (!component.isLoaded()) {
				try {
					component.load(new NullProgressMonitor());
					 result=findMealyStateMachineInstance(modelRoot,test,loadComponent);
					 if(result!=null) return result;
				} catch (Exception e) {
					CorePlugin.logError("Error Loading component", e);
				}
			}
		}
	    }
	    if(result!=null && loadComponent){
    	    result.loadProxy();
	    }
	  return result;  
  }
private static MealyStateMachine_c findMealyStateMachineInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
{
	InstanceList instances = modelRoot.getInstanceList(MealyStateMachine_c.class);
		synchronized (instances) {
            for (int i = 0; i < instances.size(); ++i) {
				MealyStateMachine_c x = (MealyStateMachine_c) instances.get(i);
				if (test==null || test.evaluate(x)){
					if(x.ensureLoaded(loadComponent))
					return x;
			}
		}
		}
			return null;
}
  public static MealyStateMachine_c MealyStateMachineInstance(ModelRoot modelRoot, ClassQueryInterface_c test){
     return MealyStateMachineInstance(modelRoot,test,true);
  }
  
  public static MealyStateMachine_c MealyStateMachineInstance(ModelRoot modelRoot)
  {
	 return MealyStateMachineInstance(modelRoot,null,true);
  }

  public static MealyStateMachine_c [] MealyStateMachineInstances(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {	
            if(loadComponent){
  			   PersistenceManager.ensureAllInstancesLoaded(modelRoot, MealyStateMachine_c.class);
  			}
		    InstanceList instances = modelRoot.getInstanceList(MealyStateMachine_c.class);
			Vector matches = new Vector();
			synchronized (instances) {
                for (int i = 0; i < instances.size(); ++i) {
					MealyStateMachine_c x = (MealyStateMachine_c) instances.get(i);
					if (test==null ||test.evaluate(x)){
						if(x.ensureLoaded(loadComponent))
						matches.add(x);
			    }
				}
			if (matches.size() > 0) {
				MealyStateMachine_c[] ret_set = new MealyStateMachine_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new MealyStateMachine_c[0];
			}		
		} 
  }
  public static MealyStateMachine_c [] MealyStateMachineInstances(ModelRoot modelRoot, ClassQueryInterface_c test){
    return  MealyStateMachineInstances(modelRoot,test,true);
  }
  public static MealyStateMachine_c [] MealyStateMachineInstances(ModelRoot modelRoot)
  {
	return MealyStateMachineInstances(modelRoot,null,true);
  }

  public boolean delete()
  {
    boolean result = super.delete();
	boolean delete_error = false;
	String errorMsg = "The following relationships were not torn down by the Mealy State Machine.dispose call: ";
	MealyActionHome_c testR512Inst = MealyActionHome_c.getOneSM_MEAHOnR512(this, false);

	if ( testR512Inst != null )
	{
   	delete_error = true;	        
	errorMsg = errorMsg + "512 ";
	}
	StateMachine_c testR510Inst1 = StateMachine_c.getOneSM_SMOnR510(this, false);

	if ( testR510Inst1 != null )
	{
	delete_error = true;	        
	errorMsg = errorMsg + "510 ";
	}
	if(delete_error == true) {

		if(CorePlugin.getDefault().isDebugging()) {
			Ooaofooa.log.println(ILogger.DELETE, "Mealy State Machine", errorMsg);
		}
		else {
			Exception e = new Exception();
            e.fillInStackTrace();
			CorePlugin.logError(errorMsg, e);
		}
	}
	return result;
  }

  // end declare instance pool

  // declare attribute accessors
  public boolean isUUID(String attributeName){
      if(attributeName.equals("sm_id")){
         return true;
      }
      return false;      
  }      
 public String getCompUniqueID(){
    UUID tempID=null;
    long longID=0L;
    StringBuffer result= new StringBuffer();
    
    tempID= getSm_id();
    
        if(IdAssigner.NULL_UUID.equals(tempID))
	      tempID=getSm_idCachedValue(); 
	      result.append(Long.toHexString(tempID.getMostSignificantBits()));
          result.append(Long.toHexString(tempID.getLeastSignificantBits()));
    return result.toString();
 }
  // declare attribute accessors
  public long getSm_idLongBased()
  {
    if ( IsSupertypeStateMachine != null )
    {
      return IsSupertypeStateMachine.getSm_idLongBased();
    }
    return 0;  
  }          
  public java.util.UUID getSm_id()
  {
    if ( IsSupertypeStateMachine != null )
    {
      return IsSupertypeStateMachine.getSm_id();
    }
    return IdAssigner.NULL_UUID;
  }

 public boolean hasSuperType(){
 	return  ( IsSupertypeStateMachine != null );
 
 }                  

  public java.util.UUID getSm_idCachedValue()
  {
    if ( !IdAssigner.NULL_UUID.equals(m_sm_id) )
      return m_sm_id;
    else
      return getSm_id();
  }
  
  public void setSm_id(java.util.UUID newValue)
  {
	if(newValue != null){
	    if(newValue.equals(m_sm_id)){
	        return;
	    }
	}else if(m_sm_id != null){
	    if(m_sm_id.equals(newValue)){
	        return;
	    }
	}else{
	    return;
	}
	AttributeChangeModelDelta change = new AttributeChangeModelDelta(Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Sm_id", m_sm_id, newValue,true); 
   m_sm_id = IdAssigner.preprocessUUID(newValue);
    Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
  }
  // end declare accessors
  public static void checkClassConsistency (ModelRoot modelRoot) {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Mealy State Machine", //$NON-NLS-1$
	  " Operation entered: Mealy State Machine::checkClassConsistency"); //$NON-NLS-1$
     if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
       return;
     }
     MealyStateMachine_c [] objs = MealyStateMachine_c.MealyStateMachineInstances(modelRoot,null,false); 
     
     for ( int i = 0; i < objs.length; i++) {
       objs[i].checkConsistency();
     }  
  } 
  public boolean checkConsistency () {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Mealy State Machine", //$NON-NLS-1$
	  " Operation entered: Mealy State Machine::checkConsistency");  //$NON-NLS-1$
    if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
      return true;
    }
	ModelRoot modelRoot = getModelRoot();
    boolean      retval = true;
    class MealyStateMachine_c_test38572_c implements ClassQueryInterface_c
    {
	  MealyStateMachine_c_test38572_c( java.util.UUID            p38573 ) {
	  m_p38573 = p38573;
	  }
	  private java.util.UUID             m_p38573; 
	  public boolean evaluate (Object candidate)
	  {
	      MealyStateMachine_c selected = (MealyStateMachine_c) candidate;
	      boolean retval = false;
	      retval = (selected.getSm_id().equals(m_p38573));
	      return retval;
	  }
    }

    MealyStateMachine_c [] objs38571 = 
    MealyStateMachine_c.MealyStateMachineInstances(modelRoot, new MealyStateMachine_c_test38572_c(getSm_id())) ;

    if ( (  (objs38571.length) == 0) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Mealy State Machine", //$NON-NLS-1$
           "Consistency: Object: Mealy State Machine: Cardinality of an identifier is zero. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs38571.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Mealy State Machine: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs38571.length )  , e); 
      }
      retval = false;

    }

    if ( (  (objs38571.length) > 1) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Mealy State Machine", //$NON-NLS-1$
           "Consistency: Object: Mealy State Machine: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
           + "Actual Value: " //$NON-NLS-1$ 
           + Integer.toString( objs38571.length )  + " SM_ID: " + "Not Printable" ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Mealy State Machine: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs38571.length )  + " SM_ID: " + "Not Printable" , e); //$NON-NLS-1$
      }
      retval = false;

    }

          // Mealy State Machine is a subtype in association: rel.Numb = 510
          // The supertype class is: State Machine
    class StateMachine_c_test38577_c implements ClassQueryInterface_c
    {
	  StateMachine_c_test38577_c( java.util.UUID            p38578 ) {
	  m_p38578 = p38578;
	  }
	  private java.util.UUID             m_p38578; 
	  public boolean evaluate (Object candidate)
	  {
	      StateMachine_c selected = (StateMachine_c) candidate;
	      boolean retval = false;
	      retval = (selected.getSm_id().equals(m_p38578));
	      return retval;
	  }
    }

    StateMachine_c [] objs38576 = 
    StateMachine_c.StateMachineInstances(modelRoot, new StateMachine_c_test38577_c(getSm_id())) ;

    if ( (  (objs38576.length) != 1) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Mealy State Machine", //$NON-NLS-1$
           "Consistency: Object: Mealy State Machine: Association: 510: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs38576.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Mealy State Machine: Association: 510: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs38576.length )  , e); 
      }
      retval = false;

    }

          // Associated One Side: rel.Numb = 512
            // Link Object: Mealy Action Home
            // Other Side Class: Transition
    class MealyActionHome_c_test38581_c implements ClassQueryInterface_c
    {
	  MealyActionHome_c_test38581_c( java.util.UUID            p38582 ) {
	  m_p38582 = p38582;
	  }
	  private java.util.UUID             m_p38582; 
	  public boolean evaluate (Object candidate)
	  {
	      MealyActionHome_c selected = (MealyActionHome_c) candidate;
	      boolean retval = false;
	      retval = (selected.getSm_id().equals(m_p38582));
	      return retval;
	  }
    }

    MealyActionHome_c [] objs38583 = 
    MealyActionHome_c.MealyActionHomeInstances(modelRoot, new MealyActionHome_c_test38581_c(getSm_id())) ;

    if ( (  (objs38583.length) == 0) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Mealy State Machine", //$NON-NLS-1$
           "Consistency: Object: Mealy State Machine: Association: 512: Cardinality of a link is equal to zero. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs38583.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Mealy State Machine: Association: 512: Cardinality of a link is equal to zero. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs38583.length )  , e); 
      }
      retval = false;

    }


    return retval;
  }



  public Object getAdapter(Class adapter) {
    Object superAdapter = super.getAdapter(adapter);
    if(superAdapter != null) {
    	return superAdapter;
    }
	  return null;
  }
} // end Mealy State Machine
