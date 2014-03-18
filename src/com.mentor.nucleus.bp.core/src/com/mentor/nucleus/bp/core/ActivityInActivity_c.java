      
package com.mentor.nucleus.bp.core ;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.ActivityInActivity_c.java
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
abstract class EV_ACTIVITY_IN_ACTIVITY extends genericEvent_c 
{
  public abstract int getEvtcode() ;
}

public class ActivityInActivity_c extends NonRootModelElement implements IAdaptable, Cloneable
{
  // Public Constructors
  public ActivityInActivity_c(ModelRoot modelRoot,
       java.util.UUID         p_m_package_id)
  {
    super(modelRoot);
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       m_package_id = IdAssigner.preprocessUUID(p_m_package_id);
        
    Object [] key = {m_package_id};
    addInstanceToMap(key);
  }
  static public ActivityInActivity_c createProxy(ModelRoot modelRoot,
       java.util.UUID         p_m_package_id, String p_contentPath, IPath p_localPath)
  {
	  ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot, p_contentPath, p_localPath);
	  // if a model root was not resolved it is most likely
	  // due to a missing file of the proxy, defualt back to
	  // the original model root
	  if(resolvedModelRoot != null)
	  	modelRoot = resolvedModelRoot;
      InstanceList instances = modelRoot.getInstanceList(ActivityInActivity_c.class);
      ActivityInActivity_c new_inst = null;
      synchronized(instances) {
          Object[] key = {p_m_package_id};
          new_inst = (ActivityInActivity_c) instances.get(key) ;
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
       new_inst.m_package_id = IdAssigner.preprocessUUID(p_m_package_id);
        
		}
	}
	if ( new_inst == null ) {
		// there is no instance matching the id, create a proxy
		// if the resource doesn't exist then this will be a dangling reference
    	new_inst = new ActivityInActivity_c(modelRoot,
p_m_package_id
);
		new_inst.m_contentPath = contentPath;
	}
    return new_inst;
  }

  static public ActivityInActivity_c resolveInstance(ModelRoot modelRoot,
       java.util.UUID         p_m_package_id){
    InstanceList instances = modelRoot.getInstanceList(ActivityInActivity_c.class);
    ActivityInActivity_c source = null;
    synchronized(instances) {
        Object [] key = {
        p_m_package_id
            };
        source = (ActivityInActivity_c) instances.get(key);
        if (source != null && !modelRoot.isCompareRoot()) {
           source.convertFromProxy();
           source.batchUnrelate();
       //pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
       source.m_package_id = IdAssigner.preprocessUUID(p_m_package_id);
        
           return source ;
        }
      }
      // there is no instance matching the id
    ActivityInActivity_c new_inst = new ActivityInActivity_c(modelRoot,
p_m_package_id
);
    return new_inst;
  }
  public ActivityInActivity_c(ModelRoot modelRoot)
  {
    super(modelRoot);
     m_package_id = IdAssigner.NULL_UUID;   
    Object [] key = {m_package_id};
    addInstanceToMap(key);
  }

  public Object getInstanceKey() {
    Object [] key =  {m_package_id};
		return key;
  }
  
  public boolean setInstanceKey(UUID p_newKey){
  
  	boolean changed = false;
		// round p1
		// round p2
		// round p3
			// round p4
			// round p5
	if (m_package_id !=  p_newKey ){
	
		m_package_id = p_newKey; 	
		changed = true;
	}
  	return changed;
  }
  

  



  public boolean equals (Object elem) {
     if (!(elem instanceof ActivityInActivity_c)) {
         return false;
     }
	    // check that the model-roots are the same
    	if (((NonRootModelElement)elem).getModelRoot() != getModelRoot()) {
    		return false;
    	}
    	
     return identityEquals(elem);
  }
  
   public boolean identityEquals(Object elem) {
       if (!(elem instanceof ActivityInActivity_c)) {
           return false;
       }
       
       ActivityInActivity_c me = (ActivityInActivity_c)elem;
      // don't allow an empty id-value to produce a false positive result;
      // in this case, use whether the two instances are actually the same 
      // one in memory, instead
      if ((IdAssigner.NULL_UUID.equals(getPackage_id()) || IdAssigner.NULL_UUID.equals(((ActivityInActivity_c)elem).getPackage_id())) && this != elem) {
      	return false;
      }
      if (!getPackage_id().equals(((ActivityInActivity_c)elem).getPackage_id())) return false;
      return true;
    }

   public boolean cachedIdentityEquals(Object elem) {
       if (!(elem instanceof ActivityInActivity_c)) {
           return false;
       }
       
       ActivityInActivity_c me = (ActivityInActivity_c)elem;
      if (!getPackage_idCachedValue().equals(((ActivityInActivity_c)elem).getPackage_idCachedValue())) return false;
      return true;
    }


  // Attributes
  private java.util.UUID         m_package_id ;
      
// declare association references from this class
  
  
    
// referring navigation

Activity_c Activity ;
public void relateAcrossR1109To(Activity_c target)
{
	relateAcrossR1109To(target, true);
}
public void relateAcrossR1109To(Activity_c target, boolean notifyChanges)
{
	if (target == null) return;
	
	if (target == Activity) return;  // already related

    if ( Activity != target ) {
    
    Object oldKey = getInstanceKey();

    if (Activity != null) {
    
        Activity.clearBackPointerR1109To(this);
        
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) {   //$NON-NLS-1$
		Ooaofooa.log.println(ILogger.CONSISTENCY, 
			"ActivityInActivity_c.relateAcrossR1109To(Activity_c target)", 
			"Relate performed across R1109 from Activity In Activity to Activity without unrelate of prior instance.");  
		}
    }
                
    	Activity = target ;
        if(IdAssigner.NULL_UUID.equals(target.getPackage_id()))
        {
            // do not update cached value
        } else {
          // update cached value
          m_package_id = target.getPackage_idCachedValue();
        }
      updateInstanceKey(oldKey, getInstanceKey());
	    target.setBackPointerR1109To(this);
        target.addRef();
      if(notifyChanges) {
	    	RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(Modeleventnotification_c.DELTA_ELEMENT_RELATED, this, target, "1109", "");
        Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(change);
      }
    }
}
public void unrelateAcrossR1109From(Activity_c target)
{
	unrelateAcrossR1109From(target, true);
}
public void unrelateAcrossR1109From(Activity_c target, boolean notifyChanges)
{
	if (target == null) return;
	
	if (Activity == null) return;  // already unrelated
	
	if (target != Activity) {
		Exception e = new Exception();
		e.fillInStackTrace();
		CorePlugin.logError("Tried to unrelate from non-related instance across R1109", e);
		return;
	}

    if (target != null) {
        target.clearBackPointerR1109To(this);
    }
    

      if(Activity != null) {
      
        m_package_id = Activity.getPackage_id();
        if(IdAssigner.NULL_UUID.equals(m_package_id))
        {
          m_package_id = Activity.getPackage_idCachedValue();
        }       
        Activity = null ;
        target.removeRef();
      if(notifyChanges) { 
        RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this, target, "1109", "");
        Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(change);
      }
    }
}

  
    
      
public static ActivityInActivity_c getOneA_AIAOnR1109(Activity_c [] targets)
{
    return getOneA_AIAOnR1109(targets, null);
}

public static ActivityInActivity_c getOneA_AIAOnR1109(Activity_c [] targets, ClassQueryInterface_c test)
{
    ActivityInActivity_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           ret_val = getOneA_AIAOnR1109(targets[i], test);
        }
    }

    return ret_val;
}

public static ActivityInActivity_c getOneA_AIAOnR1109(Activity_c target)
{
  return getOneA_AIAOnR1109(target, null);
}

public static ActivityInActivity_c getOneA_AIAOnR1109(Activity_c target, boolean loadComponent)
{
    return getOneA_AIAOnR1109(target.getModelRoot(), target, null, loadComponent);
}

public static ActivityInActivity_c getOneA_AIAOnR1109(Activity_c target, ClassQueryInterface_c test)
{
  if (target != null) {
    return getOneA_AIAOnR1109(target.getModelRoot(), target, test);
  }
  return null;
}

public static ActivityInActivity_c getOneA_AIAOnR1109(ModelRoot modelRoot, Activity_c target, ClassQueryInterface_c test)
{
	return getOneA_AIAOnR1109(modelRoot, target, test, true);
}

public static ActivityInActivity_c getOneA_AIAOnR1109(ModelRoot modelRoot, Activity_c target, ClassQueryInterface_c test, boolean loadComponent)
{
   return find_getOneA_AIAOnR1109(modelRoot,target,test);
}
private static ActivityInActivity_c find_getOneA_AIAOnR1109(ModelRoot modelRoot, Activity_c target, ClassQueryInterface_c test)
{
  if (target != null) {
    ActivityInActivity_c source = (ActivityInActivity_c)target.backPointer_IsParentViaActivityInActivityIsParentVia_R1109;
    if (source != null && (test == null || test.evaluate(source))) {
      return source;
    }
  }
  // not found
  return null ;
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1109(Activity_c [] targets)
{
  return getManyA_AIAsOnR1109(targets, null);
}
public static ActivityInActivity_c [] getManyA_AIAsOnR1109(Activity_c [] targets, boolean loadComponent)
{
  return getManyA_AIAsOnR1109(targets, null, loadComponent);
}
public static ActivityInActivity_c [] getManyA_AIAsOnR1109(Activity_c [] targets, ClassQueryInterface_c test)
{
	return getManyA_AIAsOnR1109(targets, test, true);
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1109(Activity_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{

  if(targets == null || targets.length == 0 || targets[0] == null)
  	return new ActivityInActivity_c[0];

  ModelRoot modelRoot = targets[0].getModelRoot();
 
   InstanceList instances = modelRoot.getInstanceList(ActivityInActivity_c.class);

  Vector matches = new Vector();
  for (int i = 0 ; i < targets.length ; i++) {
      ActivityInActivity_c source = (ActivityInActivity_c)targets[i].backPointer_IsParentViaActivityInActivityIsParentVia_R1109;
      if (source != null && (test == null || test.evaluate(source))) {
        matches.add(source);
      }
  }
  if (matches.size() > 0) {
	ActivityInActivity_c[] ret_set = new ActivityInActivity_c[matches.size()];
	matches.copyInto(ret_set);
	return ret_set;
  } else {
	return new ActivityInActivity_c[0];
  }
  }

public static ActivityInActivity_c [] getManyA_AIAsOnR1109(Activity_c target)
{
  if (target != null) {
    Activity_c [] targetArray = new Activity_c[1];
    targetArray[0] = target;
    return getManyA_AIAsOnR1109(targetArray);
  } else {
    ActivityInActivity_c [] result = new ActivityInActivity_c [0] ;
  return result ;
}
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1109(Activity_c target, boolean loadComponent)
{
  if (target != null) {
    Activity_c [] targetArray = new Activity_c[1];
    targetArray[0] = target;
    return getManyA_AIAsOnR1109(targetArray, loadComponent);
  } else {
    ActivityInActivity_c [] result = new ActivityInActivity_c [0] ;
  return result ;
}
}




// declare associations referring to this class

    
  
  
// referred to navigation

ArrayList<Activity_c> backPointer_HasChildrenActivityHasChildren_R1110 = new ArrayList<Activity_c>();

public void setActivityOrderInChildListR1110(Activity_c target, int index) {
	unrelateAcrossR1110From(target);
	Activity_c[] elements = Activity_c.getManyA_AsOnR1110(this);
	int count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			unrelateAcrossR1110From((Activity_c) elements[i]); 
		}
		count++;
	}
	relateAcrossR1110To(target);
	count = 0;
	for(int i = 0; i < elements.length; i++) {
		if(count >= index) {
			relateAcrossR1110To((Activity_c) elements[i]);
		}
		count++;
	}
}

public void relateAcrossR1110To(Activity_c target)
{
  if (target != null) {
    target.relateAcrossR1110To(this, true) ;
  }
}

public void relateAcrossR1110To(Activity_c target, boolean notifyChanges)
{
  if (target != null) {
    target.relateAcrossR1110To(this, notifyChanges) ;
  }
}

public void setBackPointerR1110To(Activity_c target)
{
  	synchronized (backPointer_HasChildrenActivityHasChildren_R1110) {
		backPointer_HasChildrenActivityHasChildren_R1110.add(target);
	}
}

public void unrelateAcrossR1110From(Activity_c target)
{
  if (target != null) {
    target.unrelateAcrossR1110From(this, true) ;
  }
}

public void unrelateAcrossR1110From(Activity_c target, boolean notifyChanges)
{
  if (target != null) {
    target.unrelateAcrossR1110From(this, notifyChanges) ;
  }
}

public void clearBackPointerR1110To(Activity_c target)
{
  synchronized (backPointer_HasChildrenActivityHasChildren_R1110) {
	    backPointer_HasChildrenActivityHasChildren_R1110.remove(target);
	}
}

public static ActivityInActivity_c getOneA_AIAOnR1110(Activity_c [] targets)
{
    return getOneA_AIAOnR1110(targets, null);
}

public static ActivityInActivity_c getOneA_AIAOnR1110(Activity_c [] targets, ClassQueryInterface_c test)
{
    return getOneA_AIAOnR1110(targets, test, true);
}

public static ActivityInActivity_c getOneA_AIAOnR1110(Activity_c [] targets, ClassQueryInterface_c test, boolean loadComponent)
{
    ActivityInActivity_c ret_val = null;
    if (targets != null)
    {
        for (int i = 0; i < targets.length && ret_val == null; ++i )
        {
           if (test != null) {
             ActivityInActivity_c candidate_val = getOneA_AIAOnR1110(targets[i],true);
             if ( candidate_val != null && test.evaluate(candidate_val) )
             {
               ret_val = candidate_val;
               break;
             }
           }
           else {
             ret_val = getOneA_AIAOnR1110(targets[i], loadComponent);
             if (ret_val != null) {
               break;
             }
           }
        }
    }
    return ret_val;
}

public static ActivityInActivity_c getOneA_AIAOnR1110(Activity_c target)
{
	return getOneA_AIAOnR1110(target, true);
}
public static ActivityInActivity_c getOneA_AIAOnR1110(Activity_c target, boolean loadComponent)
{
  if (target != null) {
	if(loadComponent){
	     target.loadProxy();
	    if(target.ActivityInActivity != null){
		target.ActivityInActivity.loadProxy();
	}
	}
    return target.ActivityInActivity ;
  } else {
    return null;
  }
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1110(Activity_c [] targets,
    ClassQueryInterface_c test)
{
	return getManyA_AIAsOnR1110(targets, test, true);
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1110(Activity_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new ActivityInActivity_c[0];
  
  
  LinkedHashSet<ActivityInActivity_c> elementsSet = new LinkedHashSet<ActivityInActivity_c>();
  for (int i = 0; i < targets.length; i++) {
	if(loadComponent && targets[i] != null && targets[i].ActivityInActivity == null)
	  targets[i].loadProxy();
    ActivityInActivity_c associate = targets[i].ActivityInActivity;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
                if(loadComponent){
                   associate.loadProxy();
                }
            }
    }
  }

  ActivityInActivity_c[] result = new ActivityInActivity_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1110(Activity_c [] targets)
{
  return getManyA_AIAsOnR1110(targets, null);
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1110(Activity_c target,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if (target != null) {
    Activity_c [] targetArray = new Activity_c[1];
    targetArray[0] = target;
    return getManyA_AIAsOnR1110(targetArray, test, loadComponent);
  } else {
    ActivityInActivity_c [] result = new ActivityInActivity_c [0] ;
    return result ;
  }
  
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1110(Activity_c target,
    ClassQueryInterface_c test)
{
    return getManyA_AIAsOnR1110(target, null, true);
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1110(Activity_c target)
{
    return getManyA_AIAsOnR1110(target, null, true);
}

public static ActivityInActivity_c [] getManyA_AIAsOnR1110(Activity_c target, boolean loadComponent)
{
    return getManyA_AIAsOnR1110(target, null, loadComponent);
}


      
  public void batchRelate(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots)
  {
      batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
  }
  
  public void batchRelate(ModelRoot modelRoot, boolean relateProxies, boolean notifyChanges, boolean searchAllRoots)
  {
        InstanceList instances=null;
        ModelRoot baseRoot = modelRoot;

	if (Activity == null) {          
      // R1109
      Activity_c relInst57027 = (Activity_c) baseRoot.getInstanceList(Activity_c.class).get(new Object[] {m_package_id});
            // if there was no local element, check for any global elements
            // failing that proceed to check other model roots
      		if (relInst57027 == null) {
      			relInst57027 = (Activity_c) Ooaofooa.getDefaultInstance().getInstanceList(Activity_c.class).get(new Object[] {m_package_id});
      		}
			if (relInst57027 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
				    if(roots[i].isCompareRoot()) {
				         // never use elements from any compare root
				         continue;
				    }
					relInst57027 = (Activity_c) roots[i].getInstanceList(Activity_c.class).get(new Object[] {m_package_id});
					if (relInst57027 != null)
						break;
				}
			}
			//synchronized
      if ( relInst57027 != null )
      {
          if (relateProxies || !isProxy() || (inSameComponent(this, relInst57027) && !isProxy())) {
	      relInst57027.relateAcrossR1109To(this, notifyChanges);
	  }
	  }
	}
	          
	}
  public void batchUnrelate(boolean notifyChanges)
  {
		NonRootModelElement inst=null;
      // R1109
      // A_A
		  inst=Activity;
			unrelateAcrossR1109From(Activity, notifyChanges);
          if ( inst != null ) {
			   inst.removeRef();
	      }
	}
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
  }	  
  public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(ActivityInActivity_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final ActivityInActivity_c inst = (ActivityInActivity_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }

  public static void clearInstances(ModelRoot modelRoot)
  {
    InstanceList instances = modelRoot.getInstanceList(ActivityInActivity_c.class);
    synchronized(instances) {
       for(int i=instances.size()-1; i>=0; i--){
              ((NonRootModelElement)instances.get(i)).delete_unchecked();
       }
    
    }
  }

  public static ActivityInActivity_c ActivityInActivityInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {
  		ActivityInActivity_c result=findActivityInActivityInstance(modelRoot,test,loadComponent);
  		if(result==null && loadComponent){
     List pmcs =  PersistenceManager.findAllComponents(modelRoot,ActivityInActivity_c.class);
		for (int i = 0; i < pmcs.size(); i++) {
			PersistableModelComponent component = (PersistableModelComponent) pmcs
				.get(i);
			if (!component.isLoaded()) {
				try {
					component.load(new NullProgressMonitor());
					 result=findActivityInActivityInstance(modelRoot,test,loadComponent);
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
private static ActivityInActivity_c findActivityInActivityInstance(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
{
	InstanceList instances = modelRoot.getInstanceList(ActivityInActivity_c.class);
		synchronized (instances) {
            for (int i = 0; i < instances.size(); ++i) {
				ActivityInActivity_c x = (ActivityInActivity_c) instances.get(i);
				if (test==null || test.evaluate(x)){
					if(x.ensureLoaded(loadComponent))
					return x;
			}
		}
		}
			return null;
}
  public static ActivityInActivity_c ActivityInActivityInstance(ModelRoot modelRoot, ClassQueryInterface_c test){
     return ActivityInActivityInstance(modelRoot,test,true);
  }
  
  public static ActivityInActivity_c ActivityInActivityInstance(ModelRoot modelRoot)
  {
	 return ActivityInActivityInstance(modelRoot,null,true);
  }

  public static ActivityInActivity_c [] ActivityInActivityInstances(ModelRoot modelRoot, ClassQueryInterface_c test, boolean loadComponent)
  {	
            if(loadComponent){
  			   PersistenceManager.ensureAllInstancesLoaded(modelRoot, ActivityInActivity_c.class);
  			}
		    InstanceList instances = modelRoot.getInstanceList(ActivityInActivity_c.class);
			Vector matches = new Vector();
			synchronized (instances) {
                for (int i = 0; i < instances.size(); ++i) {
					ActivityInActivity_c x = (ActivityInActivity_c) instances.get(i);
					if (test==null ||test.evaluate(x)){
						if(x.ensureLoaded(loadComponent))
						matches.add(x);
			    }
				}
			if (matches.size() > 0) {
				ActivityInActivity_c[] ret_set = new ActivityInActivity_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new ActivityInActivity_c[0];
			}		
		} 
  }
  public static ActivityInActivity_c [] ActivityInActivityInstances(ModelRoot modelRoot, ClassQueryInterface_c test){
    return  ActivityInActivityInstances(modelRoot,test,true);
  }
  public static ActivityInActivity_c [] ActivityInActivityInstances(ModelRoot modelRoot)
  {
	return ActivityInActivityInstances(modelRoot,null,true);
  }

  public boolean delete()
  {
    boolean result = super.delete();
	boolean delete_error = false;
	String errorMsg = "The following relationships were not torn down by the Activity In Activity.dispose call: ";
	Activity_c testR1109Inst = Activity_c.getOneA_AOnR1109(this, false);

	if ( testR1109Inst != null )
	{
   	delete_error = true;	        
	errorMsg = errorMsg + "1109 ";
	}
	Activity_c testR1110Inst = Activity_c.getOneA_AOnR1110(this, false);

	if ( testR1110Inst != null )
	{
	delete_error = true;
	errorMsg = errorMsg + "1110 ";	
	}
	if(delete_error == true) {

		if(CorePlugin.getDefault().isDebugging()) {
			Ooaofooa.log.println(ILogger.DELETE, "Activity In Activity", errorMsg);
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
      if(attributeName.equals("package_id")){
         return true;
      }
      return false;      
  }      
 public String getCompUniqueID(){
    UUID tempID=null;
    long longID=0L;
    StringBuffer result= new StringBuffer();
    
    tempID= getPackage_id();
    
        if(IdAssigner.NULL_UUID.equals(tempID))
	      tempID=getPackage_idCachedValue(); 
	      result.append(Long.toHexString(tempID.getMostSignificantBits()));
          result.append(Long.toHexString(tempID.getLeastSignificantBits()));
    return result.toString();
 }
  // declare attribute accessors
  public long getPackage_idLongBased()
  {
    if ( Activity != null )
    {
      return Activity.getPackage_idLongBased();
    }
    return 0;  
  }          
  public java.util.UUID getPackage_id()
  {
    if ( Activity != null )
    {
      return Activity.getPackage_id();
    }
    return IdAssigner.NULL_UUID;
  }


  public java.util.UUID getPackage_idCachedValue()
  {
    if ( !IdAssigner.NULL_UUID.equals(m_package_id) )
      return m_package_id;
    else
      return getPackage_id();
  }
  
  public void setPackage_id(java.util.UUID newValue)
  {
	if(newValue != null){
	    if(newValue.equals(m_package_id)){
	        return;
	    }
	}else if(m_package_id != null){
	    if(m_package_id.equals(newValue)){
	        return;
	    }
	}else{
	    return;
	}
	AttributeChangeModelDelta change = new AttributeChangeModelDelta(Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Package_id", m_package_id, newValue,true); 
   m_package_id = IdAssigner.preprocessUUID(newValue);
    Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
  }
  // end declare accessors
  public static void checkClassConsistency (ModelRoot modelRoot) {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Activity In Activity", //$NON-NLS-1$
	  " Operation entered: Activity In Activity::checkClassConsistency"); //$NON-NLS-1$
     if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
       return;
     }
     ActivityInActivity_c [] objs = ActivityInActivity_c.ActivityInActivityInstances(modelRoot,null,false); 
     
     for ( int i = 0; i < objs.length; i++) {
       objs[i].checkConsistency();
     }  
  } 
  public boolean checkConsistency () {
    Ooaofooa.log.println(
	  ILogger.OPERATION,
	  "Activity In Activity", //$NON-NLS-1$
	  " Operation entered: Activity In Activity::checkConsistency");  //$NON-NLS-1$
    if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) {  //$NON-NLS-1$
      return true;
    }
	ModelRoot modelRoot = getModelRoot();
    boolean      retval = true;
    class ActivityInActivity_c_test57029_c implements ClassQueryInterface_c
    {
	  ActivityInActivity_c_test57029_c( java.util.UUID            p57030 ) {
	  m_p57030 = p57030;
	  }
	  private java.util.UUID             m_p57030; 
	  public boolean evaluate (Object candidate)
	  {
	      ActivityInActivity_c selected = (ActivityInActivity_c) candidate;
	      boolean retval = false;
	      retval = (selected.getPackage_id().equals(m_p57030));
	      return retval;
	  }
    }

    ActivityInActivity_c [] objs57028 = 
    ActivityInActivity_c.ActivityInActivityInstances(modelRoot, new ActivityInActivity_c_test57029_c(getPackage_id())) ;

    if ( (  (objs57028.length) == 0) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Activity In Activity", //$NON-NLS-1$
           "Consistency: Object: Activity In Activity: Cardinality of an identifier is zero. " //$NON-NLS-1$
           + "Actual Value: " + Integer.toString( objs57028.length ) ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Activity In Activity: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs57028.length )  , e); 
      }
      retval = false;

    }

    if ( (  (objs57028.length) > 1) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Activity In Activity", //$NON-NLS-1$
           "Consistency: Object: Activity In Activity: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
           + "Actual Value: " //$NON-NLS-1$ 
           + Integer.toString( objs57028.length )  + " Package_ID: " + "Not Printable" ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Activity In Activity: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs57028.length )  + " Package_ID: " + "Not Printable" , e); //$NON-NLS-1$
      }
      retval = false;

    }

          // Activity In Activity is a referring class in association: rel.Numb = 1109
          // The participating class is: Activity
    class Activity_c_test57034_c implements ClassQueryInterface_c
    {
	  Activity_c_test57034_c( java.util.UUID            p57035 ) {
	  m_p57035 = p57035;
	  }
	  private java.util.UUID             m_p57035; 
	  public boolean evaluate (Object candidate)
	  {
	      Activity_c selected = (Activity_c) candidate;
	      boolean retval = false;
	      retval = (selected.getPackage_id().equals(m_p57035));
	      return retval;
	  }
    }

    Activity_c [] objs57033 = 
    Activity_c.ActivityInstances(modelRoot, new Activity_c_test57034_c(getPackage_id())) ;

          // The participant is unconditional
          // The multiplicity of the participant is one
    if ( (  (objs57033.length) != 1) )
    {

      if (CorePlugin.getDefault().isDebugging()){
          Ooaofooa.log.println(ILogger.CONSISTENCY, "Activity In Activity", //$NON-NLS-1$
           "Consistency: Object: Activity In Activity: Association: 1109: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
           + "Actual Value: " //$NON-NLS-1$ 
           + Integer.toString( objs57033.length )  + " Package_ID: " + "Not Printable" ); //$NON-NLS-1$
      }
      else {
          Exception e = new Exception();
          CorePlugin.logError("Consistency: Object: Activity In Activity: Association: 1109: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
          + "Actual Value: " //$NON-NLS-1$
          + Integer.toString( objs57033.length )  + " Package_ID: " + "Not Printable" , e); //$NON-NLS-1$
      }
      retval = false;

    }

          // Activity In Activity is a participating class in association: rel.Numb = 1110
             // Object: Activity
    return retval;
  }



  public Object getAdapter(Class adapter) {
    Object superAdapter = super.getAdapter(adapter);
    if(superAdapter != null) {
    	return superAdapter;
    }
	  return null;
  }
} // end Activity In Activity
