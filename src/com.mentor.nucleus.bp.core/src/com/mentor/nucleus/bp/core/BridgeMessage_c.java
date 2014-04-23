package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.BridgeMessage_c.java
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
abstract class EV_BRIDGE_MESSAGE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class BridgeMessage_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public BridgeMessage_c(ModelRoot modelRoot, java.util.UUID p_m_msg_id,
			java.util.UUID p_m_brg_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_brg_id = IdAssigner.preprocessUUID(p_m_brg_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_msg_id = IdAssigner.preprocessUUID(p_m_msg_id);

		Object[] key = {m_msg_id};
		addInstanceToMap(key);
	}
	static public BridgeMessage_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_msg_id, java.util.UUID p_m_brg_id,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(BridgeMessage_c.class);
		BridgeMessage_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_msg_id};
			new_inst = (BridgeMessage_c) instances.get(key);
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
				new_inst.m_brg_id = IdAssigner.preprocessUUID(p_m_brg_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_msg_id = IdAssigner.preprocessUUID(p_m_msg_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new BridgeMessage_c(modelRoot, p_m_msg_id, p_m_brg_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public BridgeMessage_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_msg_id, java.util.UUID p_m_brg_id) {
		InstanceList instances = modelRoot
				.getInstanceList(BridgeMessage_c.class);
		BridgeMessage_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_msg_id};
			source = (BridgeMessage_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_brg_id = IdAssigner.preprocessUUID(p_m_brg_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_msg_id = IdAssigner.preprocessUUID(p_m_msg_id);

				return source;
			}
		}
		// there is no instance matching the id
		BridgeMessage_c new_inst = new BridgeMessage_c(modelRoot, p_m_msg_id,
				p_m_brg_id);
		return new_inst;
	}
	public BridgeMessage_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_brg_id = IdAssigner.NULL_UUID;
		m_msg_id = IdAssigner.NULL_UUID;
		Object[] key = {m_msg_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_msg_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_msg_id != p_newKey) {

			m_msg_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof BridgeMessage_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof BridgeMessage_c)) {
			return false;
		}

		BridgeMessage_c me = (BridgeMessage_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getMsg_id()) || IdAssigner.NULL_UUID
				.equals(((BridgeMessage_c) elem).getMsg_id())) && this != elem) {
			return false;
		}
		if (!getMsg_id().equals(((BridgeMessage_c) elem).getMsg_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof BridgeMessage_c)) {
			return false;
		}

		BridgeMessage_c me = (BridgeMessage_c) elem;
		if (!getMsg_idCachedValue().equals(
				((BridgeMessage_c) elem).getMsg_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_brg_id;
	private java.util.UUID m_msg_id;

	// declare association references from this class

	// referring navigation

	SynchronousMessage_c IsSupertypeSynchronousMessage;
	public void relateAcrossR1020To(SynchronousMessage_c target) {
		relateAcrossR1020To(target, true);
	}
	public void relateAcrossR1020To(SynchronousMessage_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeSynchronousMessage)
			return; // already related

		if (IsSupertypeSynchronousMessage != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeSynchronousMessage != null) {

				IsSupertypeSynchronousMessage.clearBackPointerR1020To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"BridgeMessage_c.relateAcrossR1020To(SynchronousMessage_c target)",
									"Relate performed across R1020 from Bridge Message to Synchronous Message without unrelate of prior instance.");
				}
			}

			IsSupertypeSynchronousMessage = target;
			if (IdAssigner.NULL_UUID.equals(target.getMsg_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_msg_id = target.getMsg_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR1020To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "1020", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR1020From(SynchronousMessage_c target) {
		unrelateAcrossR1020From(target, true);
	}
	public void unrelateAcrossR1020From(SynchronousMessage_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeSynchronousMessage == null)
			return; // already unrelated

		if (target != IsSupertypeSynchronousMessage) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R1020",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR1020To(this);
		}

		if (IsSupertypeSynchronousMessage != null) {

			m_msg_id = IsSupertypeSynchronousMessage.getMsg_id();
			if (IdAssigner.NULL_UUID.equals(m_msg_id)) {
				m_msg_id = IsSupertypeSynchronousMessage.getMsg_idCachedValue();
			}
			IsSupertypeSynchronousMessage = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "1020", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static BridgeMessage_c getOneMSG_BOnR1020(
			SynchronousMessage_c[] targets) {
		return getOneMSG_BOnR1020(targets, null);
	}

	public static BridgeMessage_c getOneMSG_BOnR1020(
			SynchronousMessage_c[] targets, ClassQueryInterface_c test) {
		BridgeMessage_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneMSG_BOnR1020(targets[i], test);
			}
		}

		return ret_val;
	}

	public static BridgeMessage_c getOneMSG_BOnR1020(SynchronousMessage_c target) {
		return getOneMSG_BOnR1020(target, null);
	}

	public static BridgeMessage_c getOneMSG_BOnR1020(
			SynchronousMessage_c target, boolean loadComponent) {
		return getOneMSG_BOnR1020(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static BridgeMessage_c getOneMSG_BOnR1020(
			SynchronousMessage_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneMSG_BOnR1020(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static BridgeMessage_c getOneMSG_BOnR1020(ModelRoot modelRoot,
			SynchronousMessage_c target, ClassQueryInterface_c test) {
		return getOneMSG_BOnR1020(modelRoot, target, test, true);
	}

	public static BridgeMessage_c getOneMSG_BOnR1020(ModelRoot modelRoot,
			SynchronousMessage_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneMSG_BOnR1020(modelRoot, target, test);
	}
	private static BridgeMessage_c find_getOneMSG_BOnR1020(ModelRoot modelRoot,
			SynchronousMessage_c target, ClassQueryInterface_c test) {
		if (target != null) {
			BridgeMessage_c source = (BridgeMessage_c) target.backPointer_IsSubtypeBridgeMessageIsSubtype_R1020;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1020(
			SynchronousMessage_c[] targets) {
		return getManyMSG_BsOnR1020(targets, null);
	}
	public static BridgeMessage_c[] getManyMSG_BsOnR1020(
			SynchronousMessage_c[] targets, boolean loadComponent) {
		return getManyMSG_BsOnR1020(targets, null, loadComponent);
	}
	public static BridgeMessage_c[] getManyMSG_BsOnR1020(
			SynchronousMessage_c[] targets, ClassQueryInterface_c test) {
		return getManyMSG_BsOnR1020(targets, test, true);
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1020(
			SynchronousMessage_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new BridgeMessage_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(BridgeMessage_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			BridgeMessage_c source = (BridgeMessage_c) targets[i].backPointer_IsSubtypeBridgeMessageIsSubtype_R1020;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			BridgeMessage_c[] ret_set = new BridgeMessage_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new BridgeMessage_c[0];
		}
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1020(
			SynchronousMessage_c target) {
		if (target != null) {
			SynchronousMessage_c[] targetArray = new SynchronousMessage_c[1];
			targetArray[0] = target;
			return getManyMSG_BsOnR1020(targetArray);
		} else {
			BridgeMessage_c[] result = new BridgeMessage_c[0];
			return result;
		}
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1020(
			SynchronousMessage_c target, boolean loadComponent) {
		if (target != null) {
			SynchronousMessage_c[] targetArray = new SynchronousMessage_c[1];
			targetArray[0] = target;
			return getManyMSG_BsOnR1020(targetArray, loadComponent);
		} else {
			BridgeMessage_c[] result = new BridgeMessage_c[0];
			return result;
		}
	}

	// referring navigation

	Bridge_c IsInvocationOfBridge;
	public void relateAcrossR1012To(Bridge_c target) {
		relateAcrossR1012To(target, true);
	}
	public void relateAcrossR1012To(Bridge_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsInvocationOfBridge)
			return; // already related

		if (IsInvocationOfBridge != target) {

			Object oldKey = getInstanceKey();

			if (IsInvocationOfBridge != null) {
				UmlProblem.removeXtUMLProblem(this, IsInvocationOfBridge);

				IsInvocationOfBridge.clearBackPointerR1012To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"BridgeMessage_c.relateAcrossR1012To(Bridge_c target)",
									"Relate performed across R1012 from Bridge Message to Bridge without unrelate of prior instance.");
				}
			}

			IsInvocationOfBridge = target;
			m_brg_id = target.getBrg_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR1012To(this);
			target.addRef();
			UmlProblem.handleDanglingReference(this, target);
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "1012", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR1012From(Bridge_c target) {
		unrelateAcrossR1012From(target, true);
	}
	public void unrelateAcrossR1012From(Bridge_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsInvocationOfBridge == null)
			return; // already unrelated

		if (target != IsInvocationOfBridge) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R1012",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR1012To(this);
		}

		if (IsInvocationOfBridge != null) {

			m_brg_id = IsInvocationOfBridge.getBrg_id();
			IsInvocationOfBridge = null;
			target.removeRef();
			UmlProblem.removeXtUMLProblem(this, target);
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "1012", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static BridgeMessage_c getOneMSG_BOnR1012(Bridge_c[] targets) {
		return getOneMSG_BOnR1012(targets, null);
	}

	public static BridgeMessage_c getOneMSG_BOnR1012(Bridge_c[] targets,
			ClassQueryInterface_c test) {
		BridgeMessage_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneMSG_BOnR1012(targets[i], test);
			}
		}

		return ret_val;
	}

	public static BridgeMessage_c getOneMSG_BOnR1012(Bridge_c target) {
		return getOneMSG_BOnR1012(target, null);
	}

	public static BridgeMessage_c getOneMSG_BOnR1012(Bridge_c target,
			boolean loadComponent) {
		return getOneMSG_BOnR1012(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static BridgeMessage_c getOneMSG_BOnR1012(Bridge_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneMSG_BOnR1012(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static BridgeMessage_c getOneMSG_BOnR1012(ModelRoot modelRoot,
			Bridge_c target, ClassQueryInterface_c test) {
		return getOneMSG_BOnR1012(modelRoot, target, test, true);
	}

	public static BridgeMessage_c getOneMSG_BOnR1012(ModelRoot modelRoot,
			Bridge_c target, ClassQueryInterface_c test, boolean loadComponent) {
		BridgeMessage_c result = null;

		result = find_getOneMSG_BOnR1012(modelRoot, target, test);
		if (result == null && (loadComponent)) {
			// not a Containment Relation
			List comps = PersistenceManager.findAllComponents(modelRoot,
					BridgeMessage_c.class);
			for (int i = 0; i < comps.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) comps
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = find_getOneMSG_BOnR1012(modelRoot, target,
								test);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}

		return result;
	}
	private static BridgeMessage_c find_getOneMSG_BOnR1012(ModelRoot modelRoot,
			Bridge_c target, ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012) {
				for (int i = 0; i < target.backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012
						.size(); ++i) {
					BridgeMessage_c source = (BridgeMessage_c) target.backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012
							.get(i);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						return source;
					}
				}
			}
		}
		// not found
		return null;
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c[] targets) {
		return getManyMSG_BsOnR1012(targets, null);
	}
	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c[] targets,
			boolean loadComponent) {
		return getManyMSG_BsOnR1012(targets, null, loadComponent);
	}
	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c[] targets,
			ClassQueryInterface_c test) {
		return getManyMSG_BsOnR1012(targets, test, true);
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new BridgeMessage_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();
		if (loadComponent) {
			//not a Containment Relation
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					BridgeMessage_c.class);

		}

		InstanceList instances = modelRoot
				.getInstanceList(BridgeMessage_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012) {
				for (int j = 0; j < targets[i].backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012
						.size(); ++j) {
					BridgeMessage_c source = (BridgeMessage_c) targets[i].backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			BridgeMessage_c[] ret_set = new BridgeMessage_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new BridgeMessage_c[0];
		}
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c target) {
		return getManyMSG_BsOnR1012(target, null);
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c target,
			boolean loadComponent) {
		return getManyMSG_BsOnR1012(target, null, loadComponent);
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c target,
			ClassQueryInterface_c test) {
		return getManyMSG_BsOnR1012(target, test, true);
	}

	public static BridgeMessage_c[] getManyMSG_BsOnR1012(Bridge_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (target == null)
			return new BridgeMessage_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		if (loadComponent) {
			//not a Containment Relation
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					BridgeMessage_c.class);
		}
		Vector matches = new Vector();
		synchronized (target.backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012) {
			for (int i = 0; i < target.backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012
					.size(); ++i) {
				BridgeMessage_c source = (BridgeMessage_c) target.backPointer_IsInvokedByBridgeMessageIsInvokedBy_R1012
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			BridgeMessage_c[] ret_set = new BridgeMessage_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new BridgeMessage_c[0];
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

		// R1020
		SynchronousMessage_c relInst39660 = (SynchronousMessage_c) baseRoot
				.getInstanceList(SynchronousMessage_c.class).get(
						new Object[]{m_msg_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst39660 == null) {
			relInst39660 = (SynchronousMessage_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(SynchronousMessage_c.class)
					.get(new Object[]{m_msg_id});
		}
		if (relInst39660 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst39660 = (SynchronousMessage_c) roots[i].getInstanceList(
						SynchronousMessage_c.class).get(new Object[]{m_msg_id});
				if (relInst39660 != null)
					break;
			}
		}
		//synchronized
		if (relInst39660 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst39660) && !isProxy())) {
				relInst39660.relateAcrossR1020To(this, notifyChanges);
			}
		}

		if (IsInvocationOfBridge == null) {
			// R1012
			Bridge_c relInst39661 = (Bridge_c) baseRoot.getInstanceList(
					Bridge_c.class).get(new Object[]{m_brg_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst39661 == null) {
				relInst39661 = (Bridge_c) Ooaofooa.getDefaultInstance()
						.getInstanceList(Bridge_c.class)
						.get(new Object[]{m_brg_id});
			}
			if (relInst39661 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst39661 = (Bridge_c) roots[i].getInstanceList(
							Bridge_c.class).get(new Object[]{m_brg_id});
					if (relInst39661 != null)
						break;
				}
			}
			//synchronized
			if (relInst39661 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst39661) && !isProxy())) {
					relInst39661.relateAcrossR1012To(this, notifyChanges);
				}
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R1020
		// MSG_SM
		inst = IsSupertypeSynchronousMessage;
		unrelateAcrossR1020From(IsSupertypeSynchronousMessage, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R1012
		// S_BRG
		inst = IsInvocationOfBridge;
		unrelateAcrossR1012From(IsInvocationOfBridge, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(BridgeMessage_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final BridgeMessage_c inst = (BridgeMessage_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(BridgeMessage_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static BridgeMessage_c BridgeMessageInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		BridgeMessage_c result = findBridgeMessageInstance(modelRoot, test,
				loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					BridgeMessage_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findBridgeMessageInstance(modelRoot, test,
								loadComponent);
						if (result != null)
							return result;
					} catch (Exception e) {
						CorePlugin.logError("Error Loading component", e);
					}
				}
			}
		}
		if (result != null && loadComponent) {
			result.loadProxy();
		}
		return result;
	}
	private static BridgeMessage_c findBridgeMessageInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(BridgeMessage_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				BridgeMessage_c x = (BridgeMessage_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static BridgeMessage_c BridgeMessageInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return BridgeMessageInstance(modelRoot, test, true);
	}

	public static BridgeMessage_c BridgeMessageInstance(ModelRoot modelRoot) {
		return BridgeMessageInstance(modelRoot, null, true);
	}

	public static BridgeMessage_c[] BridgeMessageInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					BridgeMessage_c.class);
		}
		InstanceList instances = modelRoot
				.getInstanceList(BridgeMessage_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				BridgeMessage_c x = (BridgeMessage_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				BridgeMessage_c[] ret_set = new BridgeMessage_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new BridgeMessage_c[0];
			}
		}
	}
	public static BridgeMessage_c[] BridgeMessageInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return BridgeMessageInstances(modelRoot, test, true);
	}
	public static BridgeMessage_c[] BridgeMessageInstances(ModelRoot modelRoot) {
		return BridgeMessageInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Bridge Message.dispose call: ";
		SynchronousMessage_c testR1020Inst3 = SynchronousMessage_c
				.getOneMSG_SMOnR1020(this, false);

		if (testR1020Inst3 != null) {
			delete_error = true;
			errorMsg = errorMsg + "1020 ";
		}
		Bridge_c testR1012Inst = Bridge_c.getOneS_BRGOnR1012(this, false);

		if (testR1012Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "1012 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.DELETE, "Bridge Message", errorMsg);
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
		if (attributeName.equals("brg_id")) {
			return true;
		}
		if (attributeName.equals("msg_id")) {
			return true;
		}
		return false;
	}
	public String getCompUniqueID() {
		UUID tempID = null;
		long longID = 0L;
		StringBuffer result = new StringBuffer();

		tempID = getMsg_id();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getMsg_idCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		return result.toString();
	}
	// declare attribute accessors
	public long getBrg_idLongBased() {
		if (IsInvocationOfBridge != null) {
			return IsInvocationOfBridge.getBrg_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getBrg_id() {
		if (IsInvocationOfBridge != null) {
			return IsInvocationOfBridge.getBrg_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getBrg_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_brg_id))
			return m_brg_id;
		else
			return getBrg_id();
	}

	public void setBrg_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_brg_id)) {
				return;
			}
		} else if (m_brg_id != null) {
			if (m_brg_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Brg_id", m_brg_id, newValue, true);
		m_brg_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getMsg_idLongBased() {
		if (IsSupertypeSynchronousMessage != null) {
			return IsSupertypeSynchronousMessage.getMsg_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getMsg_id() {
		if (IsSupertypeSynchronousMessage != null) {
			return IsSupertypeSynchronousMessage.getMsg_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeSynchronousMessage != null);

	}

	public java.util.UUID getMsg_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_msg_id))
			return m_msg_id;
		else
			return getMsg_id();
	}

	public void setMsg_id(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_msg_id)) {
				return;
			}
		} else if (m_msg_id != null) {
			if (m_msg_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Msg_id", m_msg_id, newValue, true);
		m_msg_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Bridge Message", //$NON-NLS-1$
				" Operation entered: Bridge Message::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		BridgeMessage_c[] objs = BridgeMessage_c.BridgeMessageInstances(
				modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Bridge Message", //$NON-NLS-1$
				" Operation entered: Bridge Message::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class BridgeMessage_c_test39663_c implements ClassQueryInterface_c {
			BridgeMessage_c_test39663_c(java.util.UUID p39664) {
				m_p39664 = p39664;
			}
			private java.util.UUID m_p39664;
			public boolean evaluate(Object candidate) {
				BridgeMessage_c selected = (BridgeMessage_c) candidate;
				boolean retval = false;
				retval = (selected.getMsg_id().equals(m_p39664));
				return retval;
			}
		}

		BridgeMessage_c[] objs39662 = BridgeMessage_c.BridgeMessageInstances(
				modelRoot, new BridgeMessage_c_test39663_c(getMsg_id()));

		if (((objs39662.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Bridge Message", //$NON-NLS-1$
								"Consistency: Object: Bridge Message: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs39662.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Bridge Message: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs39662.length), e);
			}
			retval = false;

		}

		if (((objs39662.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Bridge Message", //$NON-NLS-1$
								"Consistency: Object: Bridge Message: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs39662.length)
										+ " Msg_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Bridge Message: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39662.length)
										+ " Msg_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Bridge Message is a referring class in association: rel.Numb = 1012
		// The participating class is: Bridge
		class Bridge_c_test39668_c implements ClassQueryInterface_c {
			Bridge_c_test39668_c(java.util.UUID p39669) {
				m_p39669 = p39669;
			}
			private java.util.UUID m_p39669;
			public boolean evaluate(Object candidate) {
				Bridge_c selected = (Bridge_c) candidate;
				boolean retval = false;
				retval = (selected.getBrg_id().equals(m_p39669));
				return retval;
			}
		}

		Bridge_c[] objs39667 = Bridge_c.BridgeInstances(modelRoot,
				new Bridge_c_test39668_c(getBrg_id()));

		if (((objs39667.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Bridge Message", //$NON-NLS-1$
								"Consistency: Object: Bridge Message: Association: 1012: Cardinality of a participant is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs39667.length)
										+ " Brg_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Bridge Message: Association: 1012: Cardinality of a participant is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39667.length)
										+ " Brg_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Bridge Message is a subtype in association: rel.Numb = 1020
		// The supertype class is: Synchronous Message
		class SynchronousMessage_c_test39671_c implements ClassQueryInterface_c {
			SynchronousMessage_c_test39671_c(java.util.UUID p39672) {
				m_p39672 = p39672;
			}
			private java.util.UUID m_p39672;
			public boolean evaluate(Object candidate) {
				SynchronousMessage_c selected = (SynchronousMessage_c) candidate;
				boolean retval = false;
				retval = (selected.getMsg_id().equals(m_p39672));
				return retval;
			}
		}

		SynchronousMessage_c[] objs39670 = SynchronousMessage_c
				.SynchronousMessageInstances(modelRoot,
						new SynchronousMessage_c_test39671_c(getMsg_id()));

		if (((objs39670.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Bridge Message", //$NON-NLS-1$
								"Consistency: Object: Bridge Message: Association: 1020: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs39670.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Bridge Message: Association: 1020: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs39670.length), e);
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Bridge Message",
				" Operation entered: BridgeMessage::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		Bridge_c v_brg = Bridge_c.getOneS_BRGOnR1012(this);

		if (((v_brg != null))) {

			this.unrelateAcrossR1012From(v_brg);

		}

		SynchronousMessage_c v_sm = SynchronousMessage_c
				.getOneMSG_SMOnR1020(this);

		if (((v_sm != null))) {

			this.unrelateAcrossR1020From(v_sm);

		}

		MessageArgument_c[] v_arguments = MessageArgument_c
				.getManyMSG_AsOnR1001(Message_c
						.getManyMSG_MsOnR1018(SynchronousMessage_c
								.getManyMSG_SMsOnR1020(this)));

		MessageArgument_c v_argument = null;
		for (int i36678 = 0; i36678 < v_arguments.length; i36678++) {
			v_argument = v_arguments[i36678];

			if (v_argument != null) {
				v_argument.Dispose();
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

		SynchronousMessage_c v_syncMessage = SynchronousMessage_c
				.getOneMSG_SMOnR1020(this);

		if (((v_syncMessage != null))) {

			this.unrelateAcrossR1020From(v_syncMessage);

		}

		if (delete()) {
			Ooaofooa.getDefaultInstance().fireModelElementDeleted(
					new BaseModelDelta(Modeleventnotification_c.DELTA_DELETE,
							this));
		}

	} // End dispose
	public String Get_name() {
		Ooaofooa.log.println(ILogger.OPERATION, "Bridge Message",
				" Operation entered: BridgeMessage::Get_name");
		final ModelRoot modelRoot = getModelRoot();
		Bridge_c v_brg = Bridge_c.getOneS_BRGOnR1012(this);

		return v_brg.getName();

	} // End get_name

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Bridge Message