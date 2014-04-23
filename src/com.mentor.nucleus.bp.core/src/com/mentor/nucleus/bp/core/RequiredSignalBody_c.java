package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.RequiredSignalBody_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

// No special imports
import java.util.*;
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
abstract class EV_REQUIRED_SIGNAL_BODY extends genericEvent_c {
	public abstract int getEvtcode();
}

public class RequiredSignalBody_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public RequiredSignalBody_c(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_id = IdAssigner.preprocessUUID(p_m_id);

		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}
	static public RequiredSignalBody_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(RequiredSignalBody_c.class);
		RequiredSignalBody_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			new_inst = (RequiredSignalBody_c) instances.get(key);
		}
		String contentPath = PersistenceUtil.resolveRelativePath(p_localPath,
				new Path(p_contentPath));
		if (modelRoot.isNewCompareRoot()) {
			// for comparisons we do not want to change
			// the content path
			contentPath = p_contentPath;
		}
		if (new_inst != null && !modelRoot.isCompareRoot()) {
			PersistableModelComponent pmc = new_inst.getPersistableComponent();
			if (pmc == null) {
				// dangling reference, redo this instance
				new_inst.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_id = IdAssigner.preprocessUUID(p_m_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new RequiredSignalBody_c(modelRoot, p_m_action_id,
					p_m_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public RequiredSignalBody_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_action_id, java.util.UUID p_m_id) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredSignalBody_c.class);
		RequiredSignalBody_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_action_id};
			source = (RequiredSignalBody_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_action_id = IdAssigner.preprocessUUID(p_m_action_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_id = IdAssigner.preprocessUUID(p_m_id);

				return source;
			}
		}
		// there is no instance matching the id
		RequiredSignalBody_c new_inst = new RequiredSignalBody_c(modelRoot,
				p_m_action_id, p_m_id);
		return new_inst;
	}
	public RequiredSignalBody_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_action_id = IdAssigner.NULL_UUID;
		m_id = IdAssigner.NULL_UUID;
		Object[] key = {m_action_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_action_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_action_id != p_newKey) {

			m_action_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof RequiredSignalBody_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof RequiredSignalBody_c)) {
			return false;
		}

		RequiredSignalBody_c me = (RequiredSignalBody_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getAction_id()) || IdAssigner.NULL_UUID
				.equals(((RequiredSignalBody_c) elem).getAction_id()))
				&& this != elem) {
			return false;
		}
		if (!getAction_id()
				.equals(((RequiredSignalBody_c) elem).getAction_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof RequiredSignalBody_c)) {
			return false;
		}

		RequiredSignalBody_c me = (RequiredSignalBody_c) elem;
		if (!getAction_idCachedValue().equals(
				((RequiredSignalBody_c) elem).getAction_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_action_id;
	private java.util.UUID m_id;

	// declare association references from this class

	// referring navigation

	RequiredSignal_c SpecifiesProcessingForRequiredSignal;
	public void relateAcrossR684To(RequiredSignal_c target) {
		relateAcrossR684To(target, true);
	}
	public void relateAcrossR684To(RequiredSignal_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == SpecifiesProcessingForRequiredSignal)
			return; // already related

		if (SpecifiesProcessingForRequiredSignal != target) {

			Object oldKey = getInstanceKey();

			if (SpecifiesProcessingForRequiredSignal != null) {

				SpecifiesProcessingForRequiredSignal
						.clearBackPointerR684To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"RequiredSignalBody_c.relateAcrossR684To(RequiredSignal_c target)",
									"Relate performed across R684 from Required Signal Body to Required Signal without unrelate of prior instance.");
				}
			}

			SpecifiesProcessingForRequiredSignal = target;
			if (IdAssigner.NULL_UUID.equals(target.getId())) {
				// do not update cached value
			} else {
				// update cached value
				m_id = target.getIdCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR684To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR684From(RequiredSignal_c target) {
		unrelateAcrossR684From(target, true);
	}
	public void unrelateAcrossR684From(RequiredSignal_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (SpecifiesProcessingForRequiredSignal == null)
			return; // already unrelated

		if (target != SpecifiesProcessingForRequiredSignal) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R684",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR684To(this);
		}

		if (SpecifiesProcessingForRequiredSignal != null) {

			m_id = SpecifiesProcessingForRequiredSignal.getId();
			if (IdAssigner.NULL_UUID.equals(m_id)) {
				m_id = SpecifiesProcessingForRequiredSignal.getIdCachedValue();
			}
			SpecifiesProcessingForRequiredSignal = null;
			target.removeRef();
		}
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR684(
			RequiredSignal_c[] targets) {
		return getOneACT_RSBOnR684(targets, null);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR684(
			RequiredSignal_c[] targets, ClassQueryInterface_c test) {
		RequiredSignalBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_RSBOnR684(targets[i], test);
			}
		}

		return ret_val;
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR684(
			RequiredSignal_c target) {
		return getOneACT_RSBOnR684(target, null);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR684(
			RequiredSignal_c target, boolean loadComponent) {
		return getOneACT_RSBOnR684(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR684(
			RequiredSignal_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_RSBOnR684(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR684(ModelRoot modelRoot,
			RequiredSignal_c target, ClassQueryInterface_c test) {
		return getOneACT_RSBOnR684(modelRoot, target, test, true);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR684(ModelRoot modelRoot,
			RequiredSignal_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneACT_RSBOnR684(modelRoot, target, test);
	}
	private static RequiredSignalBody_c find_getOneACT_RSBOnR684(
			ModelRoot modelRoot, RequiredSignal_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			RequiredSignalBody_c source = (RequiredSignalBody_c) target.backPointer_RequiredSignalBody_R684;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR684(
			RequiredSignal_c[] targets) {
		return getManyACT_RSBsOnR684(targets, null);
	}
	public static RequiredSignalBody_c[] getManyACT_RSBsOnR684(
			RequiredSignal_c[] targets, boolean loadComponent) {
		return getManyACT_RSBsOnR684(targets, null, loadComponent);
	}
	public static RequiredSignalBody_c[] getManyACT_RSBsOnR684(
			RequiredSignal_c[] targets, ClassQueryInterface_c test) {
		return getManyACT_RSBsOnR684(targets, test, true);
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR684(
			RequiredSignal_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new RequiredSignalBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(RequiredSignalBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			RequiredSignalBody_c source = (RequiredSignalBody_c) targets[i].backPointer_RequiredSignalBody_R684;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			RequiredSignalBody_c[] ret_set = new RequiredSignalBody_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new RequiredSignalBody_c[0];
		}
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR684(
			RequiredSignal_c target) {
		if (target != null) {
			RequiredSignal_c[] targetArray = new RequiredSignal_c[1];
			targetArray[0] = target;
			return getManyACT_RSBsOnR684(targetArray);
		} else {
			RequiredSignalBody_c[] result = new RequiredSignalBody_c[0];
			return result;
		}
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR684(
			RequiredSignal_c target, boolean loadComponent) {
		if (target != null) {
			RequiredSignal_c[] targetArray = new RequiredSignal_c[1];
			targetArray[0] = target;
			return getManyACT_RSBsOnR684(targetArray, loadComponent);
		} else {
			RequiredSignalBody_c[] result = new RequiredSignalBody_c[0];
			return result;
		}
	}

	// referring navigation

	Body_c IsSupertypeBody;
	public void relateAcrossR698To(Body_c target) {
		relateAcrossR698To(target, true);
	}
	public void relateAcrossR698To(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeBody)
			return; // already related

		if (IsSupertypeBody != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeBody != null) {

				IsSupertypeBody.clearBackPointerR698To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"RequiredSignalBody_c.relateAcrossR698To(Body_c target)",
									"Relate performed across R698 from Required Signal Body to Body without unrelate of prior instance.");
				}
			}

			IsSupertypeBody = target;
			m_action_id = target.getAction_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR698To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR698From(Body_c target) {
		unrelateAcrossR698From(target, true);
	}
	public void unrelateAcrossR698From(Body_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeBody == null)
			return; // already unrelated

		if (target != IsSupertypeBody) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R698",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR698To(this);
		}

		if (IsSupertypeBody != null) {

			m_action_id = IsSupertypeBody.getAction_id();
			IsSupertypeBody = null;
			target.removeRef();
		}
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR698(Body_c[] targets) {
		return getOneACT_RSBOnR698(targets, null);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR698(Body_c[] targets,
			ClassQueryInterface_c test) {
		RequiredSignalBody_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneACT_RSBOnR698(targets[i], test);
			}
		}

		return ret_val;
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR698(Body_c target) {
		return getOneACT_RSBOnR698(target, null);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR698(Body_c target,
			boolean loadComponent) {
		return getOneACT_RSBOnR698(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR698(Body_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneACT_RSBOnR698(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR698(ModelRoot modelRoot,
			Body_c target, ClassQueryInterface_c test) {
		return getOneACT_RSBOnR698(modelRoot, target, test, true);
	}

	public static RequiredSignalBody_c getOneACT_RSBOnR698(ModelRoot modelRoot,
			Body_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneACT_RSBOnR698(modelRoot, target, test);
	}
	private static RequiredSignalBody_c find_getOneACT_RSBOnR698(
			ModelRoot modelRoot, Body_c target, ClassQueryInterface_c test) {
		if (target != null) {
			RequiredSignalBody_c source = (RequiredSignalBody_c) target.backPointer_IsSubtypeRequiredSignalBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR698(Body_c[] targets) {
		return getManyACT_RSBsOnR698(targets, null);
	}
	public static RequiredSignalBody_c[] getManyACT_RSBsOnR698(
			Body_c[] targets, boolean loadComponent) {
		return getManyACT_RSBsOnR698(targets, null, loadComponent);
	}
	public static RequiredSignalBody_c[] getManyACT_RSBsOnR698(
			Body_c[] targets, ClassQueryInterface_c test) {
		return getManyACT_RSBsOnR698(targets, test, true);
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR698(
			Body_c[] targets, ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new RequiredSignalBody_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(RequiredSignalBody_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			RequiredSignalBody_c source = (RequiredSignalBody_c) targets[i].backPointer_IsSubtypeRequiredSignalBodyIsSubtype_R698;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			RequiredSignalBody_c[] ret_set = new RequiredSignalBody_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new RequiredSignalBody_c[0];
		}
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR698(Body_c target) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_RSBsOnR698(targetArray);
		} else {
			RequiredSignalBody_c[] result = new RequiredSignalBody_c[0];
			return result;
		}
	}

	public static RequiredSignalBody_c[] getManyACT_RSBsOnR698(Body_c target,
			boolean loadComponent) {
		if (target != null) {
			Body_c[] targetArray = new Body_c[1];
			targetArray[0] = target;
			return getManyACT_RSBsOnR698(targetArray, loadComponent);
		} else {
			RequiredSignalBody_c[] result = new RequiredSignalBody_c[0];
			return result;
		}
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		if (SpecifiesProcessingForRequiredSignal == null) {
			// R684
			RequiredSignal_c relInst56222 = (RequiredSignal_c) baseRoot
					.getInstanceList(RequiredSignal_c.class).get(
							new Object[]{m_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst56222 == null) {
				relInst56222 = (RequiredSignal_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(RequiredSignal_c.class)
						.get(new Object[]{m_id});
			}
			if (relInst56222 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst56222 = (RequiredSignal_c) roots[i].getInstanceList(
							RequiredSignal_c.class).get(new Object[]{m_id});
					if (relInst56222 != null)
						break;
				}
			}
			//synchronized
			if (relInst56222 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst56222) && !isProxy())) {
					relInst56222.relateAcrossR684To(this, notifyChanges);
				}
			}
		}

		// R698
		Body_c relInst56223 = (Body_c) baseRoot.getInstanceList(Body_c.class)
				.get(new Object[]{m_action_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst56223 == null) {
			relInst56223 = (Body_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Body_c.class)
					.get(new Object[]{m_action_id});
		}
		if (relInst56223 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst56223 = (Body_c) roots[i].getInstanceList(Body_c.class)
						.get(new Object[]{m_action_id});
				if (relInst56223 != null)
					break;
			}
		}
		//synchronized
		if (relInst56223 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst56223) && !isProxy())) {
				relInst56223.relateAcrossR698To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R684
		// SPR_RS
		inst = SpecifiesProcessingForRequiredSignal;
		unrelateAcrossR684From(SpecifiesProcessingForRequiredSignal,
				notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R698
		// ACT_ACT
		inst = IsSupertypeBody;
		unrelateAcrossR698From(IsSupertypeBody, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot, boolean notifyChanges, boolean searchAllRoots, boolean relateProxies)
  {
	InstanceList instances = modelRoot.getInstanceList(RequiredSignalBody_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final RequiredSignalBody_c inst = (RequiredSignalBody_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredSignalBody_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static RequiredSignalBody_c RequiredSignalBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		RequiredSignalBody_c result = findRequiredSignalBodyInstance(modelRoot,
				test, loadComponent);
		return result;
	}
	private static RequiredSignalBody_c findRequiredSignalBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredSignalBody_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				RequiredSignalBody_c x = (RequiredSignalBody_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static RequiredSignalBody_c RequiredSignalBodyInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return RequiredSignalBodyInstance(modelRoot, test, true);
	}

	public static RequiredSignalBody_c RequiredSignalBodyInstance(
			ModelRoot modelRoot) {
		return RequiredSignalBodyInstance(modelRoot, null, true);
	}

	public static RequiredSignalBody_c[] RequiredSignalBodyInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(RequiredSignalBody_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				RequiredSignalBody_c x = (RequiredSignalBody_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				RequiredSignalBody_c[] ret_set = new RequiredSignalBody_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new RequiredSignalBody_c[0];
			}
		}
	}
	public static RequiredSignalBody_c[] RequiredSignalBodyInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return RequiredSignalBodyInstances(modelRoot, test, true);
	}
	public static RequiredSignalBody_c[] RequiredSignalBodyInstances(
			ModelRoot modelRoot) {
		return RequiredSignalBodyInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Required Signal Body.dispose call: ";
		RequiredSignal_c testR684Inst = RequiredSignal_c.getOneSPR_RSOnR684(
				this, false);

		if (testR684Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "684 ";
		}
		Body_c testR698Inst10 = Body_c.getOneACT_ACTOnR698(this, false);

		if (testR698Inst10 != null) {
			delete_error = true;
			errorMsg = errorMsg + "698 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Required Signal Body",
						errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CorePlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("action_id")) {
			return true;
		}
		if (attributeName.equals("id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getAction_idLongBased() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getAction_id() {
		if (IsSupertypeBody != null) {
			return IsSupertypeBody.getAction_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeBody != null);

	}

	public java.util.UUID getAction_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_action_id))
			return m_action_id;
		else
			return getAction_id();
	}

	public void setAction_id(java.util.UUID newValue) {
		m_action_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getIdLongBased() {
		if (SpecifiesProcessingForRequiredSignal != null) {
			return SpecifiesProcessingForRequiredSignal.getIdLongBased();
		}
		return 0;
	}
	public java.util.UUID getId() {
		if (SpecifiesProcessingForRequiredSignal != null) {
			return SpecifiesProcessingForRequiredSignal.getId();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getIdCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_id))
			return m_id;
		else
			return getId();
	}

	public void setId(java.util.UUID newValue) {
		m_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Required Signal Body", //$NON-NLS-1$
						" Operation entered: Required Signal Body::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		RequiredSignalBody_c[] objs = RequiredSignalBody_c
				.RequiredSignalBodyInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Required Signal Body", //$NON-NLS-1$
				" Operation entered: Required Signal Body::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class RequiredSignalBody_c_test56225_c implements ClassQueryInterface_c {
			RequiredSignalBody_c_test56225_c(java.util.UUID p56226) {
				m_p56226 = p56226;
			}
			private java.util.UUID m_p56226;
			public boolean evaluate(Object candidate) {
				RequiredSignalBody_c selected = (RequiredSignalBody_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56226));
				return retval;
			}
		}

		RequiredSignalBody_c[] objs56224 = RequiredSignalBody_c
				.RequiredSignalBodyInstances(modelRoot,
						new RequiredSignalBody_c_test56225_c(getAction_id()));

		if (((objs56224.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Required Signal Body", //$NON-NLS-1$
								"Consistency: Object: Required Signal Body: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56224.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Signal Body: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56224.length), e);
			}
			retval = false;

		}

		if (((objs56224.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Required Signal Body", //$NON-NLS-1$
								"Consistency: Object: Required Signal Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56224.length)
										+ " Action_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Signal Body: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56224.length)
										+ " Action_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Required Signal Body is a subtype in association: rel.Numb = 698
		// The supertype class is: Body
		class Body_c_test56230_c implements ClassQueryInterface_c {
			Body_c_test56230_c(java.util.UUID p56231) {
				m_p56231 = p56231;
			}
			private java.util.UUID m_p56231;
			public boolean evaluate(Object candidate) {
				Body_c selected = (Body_c) candidate;
				boolean retval = false;
				retval = (selected.getAction_id().equals(m_p56231));
				return retval;
			}
		}

		Body_c[] objs56229 = Body_c.BodyInstances(modelRoot,
				new Body_c_test56230_c(getAction_id()));

		if (((objs56229.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Required Signal Body", //$NON-NLS-1$
								"Consistency: Object: Required Signal Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs56229.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Signal Body: Association: 698: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56229.length), e);
			}
			retval = false;

		}

		// Required Signal Body is a referring class in association: rel.Numb = 684
		// The participating class is: Required Signal
		class RequiredSignal_c_test56233_c implements ClassQueryInterface_c {
			RequiredSignal_c_test56233_c(java.util.UUID p56234) {
				m_p56234 = p56234;
			}
			private java.util.UUID m_p56234;
			public boolean evaluate(Object candidate) {
				RequiredSignal_c selected = (RequiredSignal_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p56234));
				return retval;
			}
		}

		RequiredSignal_c[] objs56232 = RequiredSignal_c
				.RequiredSignalInstances(modelRoot,
						new RequiredSignal_c_test56233_c(getId()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs56232.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Required Signal Body", //$NON-NLS-1$
								"Consistency: Object: Required Signal Body: Association: 684: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs56232.length)
										+ " Id: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Required Signal Body: Association: 684: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs56232.length)
										+ " Id: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Required Signal Body",
				" Operation entered: RequiredSignalBody::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		RequiredSignal_c v_act = RequiredSignal_c.getOneSPR_RSOnR684(this);

		if (((v_act != null))) {

			this.unrelateAcrossR684From(v_act);

		}

		delete();

	} // End dispose
	public java.util.UUID Getcontainingcomponentid() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Required Signal Body",
						" Operation entered: RequiredSignalBody::Getcontainingcomponentid");
		final ModelRoot modelRoot = getModelRoot();
		RequiredSignal_c v_requiredSig = RequiredSignal_c
				.getOneSPR_RSOnR684(this);

		return v_requiredSig.Getcomponentid();

	} // End getContainingComponentId
	public java.util.UUID Getcontainerid() {
		Ooaofooa.log.println(ILogger.OPERATION, "Required Signal Body",
				" Operation entered: RequiredSignalBody::Getcontainerid");
		final ModelRoot modelRoot = getModelRoot();
		RequiredSignal_c v_requiredSig = RequiredSignal_c
				.getOneSPR_RSOnR684(this);

		return v_requiredSig.Getcomponentid();

	} // End getContainerId
	public String Getpath() {
		Ooaofooa.log.println(ILogger.OPERATION, "Required Signal Body",
				" Operation entered: RequiredSignalBody::Getpath");
		final ModelRoot modelRoot = getModelRoot();
		RequiredSignal_c v_requiredSig = RequiredSignal_c
				.getOneSPR_RSOnR684(this);

		String v_requiredSigPath = "";

		String v_requiredSigName = "";

		if (((v_requiredSig != null))) {

			v_requiredSigName = v_requiredSig.getName();

			Component_c v_comp = Component_c
					.getOneC_COnR4010(Port_c.getOneC_POOnR4016(InterfaceReference_c.getOneC_IROnR4009(Requirement_c
							.getOneC_ROnR4500(RequiredExecutableProperty_c
									.getOneSPR_REPOnR4502(v_requiredSig)))));

			v_requiredSigPath = v_comp.Getpath(true, v_requiredSigName);

		}

		return v_requiredSigPath;

	} // End getPath

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Required Signal Body