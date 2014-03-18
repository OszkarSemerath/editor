package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.SymbolicConstantValue_c.java
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
abstract class EV_SYMBOLIC_CONSTANT_VALUE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class SymbolicConstantValue_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public SymbolicConstantValue_c(ModelRoot modelRoot,
			java.util.UUID p_m_value_id, java.util.UUID p_m_const_id,
			java.util.UUID p_m_dt_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_const_id = IdAssigner.preprocessUUID(p_m_const_id);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

		Object[] key = {m_value_id};
		addInstanceToMap(key);
	}
	static public SymbolicConstantValue_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_value_id, java.util.UUID p_m_const_id,
			java.util.UUID p_m_dt_id, String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(SymbolicConstantValue_c.class);
		SymbolicConstantValue_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_value_id};
			new_inst = (SymbolicConstantValue_c) instances.get(key);
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
				new_inst.m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_const_id = IdAssigner.preprocessUUID(p_m_const_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new SymbolicConstantValue_c(modelRoot, p_m_value_id,
					p_m_const_id, p_m_dt_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public SymbolicConstantValue_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_value_id, java.util.UUID p_m_const_id,
			java.util.UUID p_m_dt_id) {
		InstanceList instances = modelRoot
				.getInstanceList(SymbolicConstantValue_c.class);
		SymbolicConstantValue_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_value_id};
			source = (SymbolicConstantValue_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_value_id = IdAssigner.preprocessUUID(p_m_value_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_const_id = IdAssigner.preprocessUUID(p_m_const_id);
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_dt_id = IdAssigner.preprocessUUID(p_m_dt_id);

				return source;
			}
		}
		// there is no instance matching the id
		SymbolicConstantValue_c new_inst = new SymbolicConstantValue_c(
				modelRoot, p_m_value_id, p_m_const_id, p_m_dt_id);
		return new_inst;
	}
	public SymbolicConstantValue_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_value_id = IdAssigner.NULL_UUID;
		m_const_id = IdAssigner.NULL_UUID;
		m_dt_id = IdAssigner.NULL_UUID;
		Object[] key = {m_value_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_value_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_value_id != p_newKey) {

			m_value_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof SymbolicConstantValue_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof SymbolicConstantValue_c)) {
			return false;
		}

		SymbolicConstantValue_c me = (SymbolicConstantValue_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getValue_id()) || IdAssigner.NULL_UUID
				.equals(((SymbolicConstantValue_c) elem).getValue_id()))
				&& this != elem) {
			return false;
		}
		if (!getValue_id().equals(
				((SymbolicConstantValue_c) elem).getValue_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof SymbolicConstantValue_c)) {
			return false;
		}

		SymbolicConstantValue_c me = (SymbolicConstantValue_c) elem;
		if (!getValue_idCachedValue().equals(
				((SymbolicConstantValue_c) elem).getValue_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_value_id;
	private java.util.UUID m_const_id;
	private java.util.UUID m_dt_id;

	// declare association references from this class

	// referring navigation

	Value_c IsSupertypeValue;
	public void relateAcrossR801To(Value_c target) {
		relateAcrossR801To(target, true);
	}
	public void relateAcrossR801To(Value_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeValue)
			return; // already related

		if (IsSupertypeValue != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeValue != null) {

				IsSupertypeValue.clearBackPointerR801To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"SymbolicConstantValue_c.relateAcrossR801To(Value_c target)",
									"Relate performed across R801 from Symbolic Constant Value to Value without unrelate of prior instance.");
				}
			}

			IsSupertypeValue = target;
			m_value_id = target.getValue_id();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR801To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR801From(Value_c target) {
		unrelateAcrossR801From(target, true);
	}
	public void unrelateAcrossR801From(Value_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeValue == null)
			return; // already unrelated

		if (target != IsSupertypeValue) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R801",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR801To(this);
		}

		if (IsSupertypeValue != null) {

			m_value_id = IsSupertypeValue.getValue_id();
			IsSupertypeValue = null;
			target.removeRef();
		}
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR801(Value_c[] targets) {
		return getOneV_SCVOnR801(targets, null);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR801(Value_c[] targets,
			ClassQueryInterface_c test) {
		SymbolicConstantValue_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_SCVOnR801(targets[i], test);
			}
		}

		return ret_val;
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR801(Value_c target) {
		return getOneV_SCVOnR801(target, null);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR801(Value_c target,
			boolean loadComponent) {
		return getOneV_SCVOnR801(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR801(Value_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_SCVOnR801(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR801(
			ModelRoot modelRoot, Value_c target, ClassQueryInterface_c test) {
		return getOneV_SCVOnR801(modelRoot, target, test, true);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR801(
			ModelRoot modelRoot, Value_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneV_SCVOnR801(modelRoot, target, test);
	}
	private static SymbolicConstantValue_c find_getOneV_SCVOnR801(
			ModelRoot modelRoot, Value_c target, ClassQueryInterface_c test) {
		if (target != null) {
			SymbolicConstantValue_c source = (SymbolicConstantValue_c) target.backPointer_IsSubtypeSymbolicConstantValueIsSubtype_R801;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR801(
			Value_c[] targets) {
		return getManyV_SCVsOnR801(targets, null);
	}
	public static SymbolicConstantValue_c[] getManyV_SCVsOnR801(
			Value_c[] targets, boolean loadComponent) {
		return getManyV_SCVsOnR801(targets, null, loadComponent);
	}
	public static SymbolicConstantValue_c[] getManyV_SCVsOnR801(
			Value_c[] targets, ClassQueryInterface_c test) {
		return getManyV_SCVsOnR801(targets, test, true);
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR801(
			Value_c[] targets, ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new SymbolicConstantValue_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(SymbolicConstantValue_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			SymbolicConstantValue_c source = (SymbolicConstantValue_c) targets[i].backPointer_IsSubtypeSymbolicConstantValueIsSubtype_R801;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			SymbolicConstantValue_c[] ret_set = new SymbolicConstantValue_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new SymbolicConstantValue_c[0];
		}
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR801(Value_c target) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_SCVsOnR801(targetArray);
		} else {
			SymbolicConstantValue_c[] result = new SymbolicConstantValue_c[0];
			return result;
		}
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR801(Value_c target,
			boolean loadComponent) {
		if (target != null) {
			Value_c[] targetArray = new Value_c[1];
			targetArray[0] = target;
			return getManyV_SCVsOnR801(targetArray, loadComponent);
		} else {
			SymbolicConstantValue_c[] result = new SymbolicConstantValue_c[0];
			return result;
		}
	}

	// referring navigation

	SymbolicConstant_c SymbolicConstant;
	public void relateAcrossR850To(SymbolicConstant_c target) {
		relateAcrossR850To(target, true);
	}
	public void relateAcrossR850To(SymbolicConstant_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == SymbolicConstant)
			return; // already related

		if (SymbolicConstant != target) {

			Object oldKey = getInstanceKey();

			if (SymbolicConstant != null) {

				SymbolicConstant.clearBackPointerR850To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"SymbolicConstantValue_c.relateAcrossR850To(SymbolicConstant_c target)",
									"Relate performed across R850 from Symbolic Constant Value to Symbolic Constant without unrelate of prior instance.");
				}
			}

			SymbolicConstant = target;
			m_const_id = target.getConst_id();
			if (IdAssigner.NULL_UUID.equals(target.getDt_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_dt_id = target.getDt_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR850To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR850From(SymbolicConstant_c target) {
		unrelateAcrossR850From(target, true);
	}
	public void unrelateAcrossR850From(SymbolicConstant_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (SymbolicConstant == null)
			return; // already unrelated

		if (target != SymbolicConstant) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R850",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR850To(this);
		}

		if (SymbolicConstant != null) {

			m_const_id = SymbolicConstant.getConst_id();
			m_dt_id = SymbolicConstant.getDt_id();
			if (IdAssigner.NULL_UUID.equals(m_dt_id)) {
				m_dt_id = SymbolicConstant.getDt_idCachedValue();
			}
			SymbolicConstant = null;
			target.removeRef();
		}
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR850(
			SymbolicConstant_c[] targets) {
		return getOneV_SCVOnR850(targets, null);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR850(
			SymbolicConstant_c[] targets, ClassQueryInterface_c test) {
		SymbolicConstantValue_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneV_SCVOnR850(targets[i], test);
			}
		}

		return ret_val;
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR850(
			SymbolicConstant_c target) {
		return getOneV_SCVOnR850(target, null);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR850(
			SymbolicConstant_c target, boolean loadComponent) {
		return getOneV_SCVOnR850(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR850(
			SymbolicConstant_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneV_SCVOnR850(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR850(
			ModelRoot modelRoot, SymbolicConstant_c target,
			ClassQueryInterface_c test) {
		return getOneV_SCVOnR850(modelRoot, target, test, true);
	}

	public static SymbolicConstantValue_c getOneV_SCVOnR850(
			ModelRoot modelRoot, SymbolicConstant_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneV_SCVOnR850(modelRoot, target, test);
	}
	private static SymbolicConstantValue_c find_getOneV_SCVOnR850(
			ModelRoot modelRoot, SymbolicConstant_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			synchronized (target.backPointer_SymbolicConstantValue_R850) {
				for (int i = 0; i < target.backPointer_SymbolicConstantValue_R850
						.size(); ++i) {
					SymbolicConstantValue_c source = (SymbolicConstantValue_c) target.backPointer_SymbolicConstantValue_R850
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

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c[] targets) {
		return getManyV_SCVsOnR850(targets, null);
	}
	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c[] targets, boolean loadComponent) {
		return getManyV_SCVsOnR850(targets, null, loadComponent);
	}
	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c[] targets, ClassQueryInterface_c test) {
		return getManyV_SCVsOnR850(targets, test, true);
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new SymbolicConstantValue_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(SymbolicConstantValue_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			synchronized (targets[i].backPointer_SymbolicConstantValue_R850) {
				for (int j = 0; j < targets[i].backPointer_SymbolicConstantValue_R850
						.size(); ++j) {
					SymbolicConstantValue_c source = (SymbolicConstantValue_c) targets[i].backPointer_SymbolicConstantValue_R850
							.get(j);
					if (source != null
							&& (test == null || test.evaluate(source))) {
						matches.add(source);
					}
				}
			}
		}
		if (matches.size() > 0) {
			SymbolicConstantValue_c[] ret_set = new SymbolicConstantValue_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new SymbolicConstantValue_c[0];
		}
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c target) {
		return getManyV_SCVsOnR850(target, null);
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c target, boolean loadComponent) {
		return getManyV_SCVsOnR850(target, null, loadComponent);
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c target, ClassQueryInterface_c test) {
		return getManyV_SCVsOnR850(target, test, true);
	}

	public static SymbolicConstantValue_c[] getManyV_SCVsOnR850(
			SymbolicConstant_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (target == null)
			return new SymbolicConstantValue_c[0];

		ModelRoot modelRoot = target.getModelRoot();
		Vector matches = new Vector();
		synchronized (target.backPointer_SymbolicConstantValue_R850) {
			for (int i = 0; i < target.backPointer_SymbolicConstantValue_R850
					.size(); ++i) {
				SymbolicConstantValue_c source = (SymbolicConstantValue_c) target.backPointer_SymbolicConstantValue_R850
						.get(i);
				if (source != null && (test == null || test.evaluate(source))) {

					matches.add(source);
				}
			}
		}

		if (matches.size() > 0) {
			SymbolicConstantValue_c[] ret_set = new SymbolicConstantValue_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new SymbolicConstantValue_c[0];
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

		// R801
		Value_c relInst37429 = (Value_c) baseRoot
				.getInstanceList(Value_c.class).get(new Object[]{m_value_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst37429 == null) {
			relInst37429 = (Value_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Value_c.class)
					.get(new Object[]{m_value_id});
		}
		if (relInst37429 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst37429 = (Value_c) roots[i]
						.getInstanceList(Value_c.class).get(
								new Object[]{m_value_id});
				if (relInst37429 != null)
					break;
			}
		}
		//synchronized
		if (relInst37429 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst37429) && !isProxy())) {
				relInst37429.relateAcrossR801To(this, notifyChanges);
			}
		}

		if (SymbolicConstant == null) {
			// R850
			SymbolicConstant_c relInst37430 = (SymbolicConstant_c) baseRoot
					.getInstanceList(SymbolicConstant_c.class).get(
							new Object[]{m_const_id, m_dt_id});
			// if there was no local element, check for any global elements
			// failing that proceed to check other model roots
			if (relInst37430 == null) {
				relInst37430 = (SymbolicConstant_c) Ooaofooa
						.getDefaultInstance()
						.getInstanceList(SymbolicConstant_c.class)
						.get(new Object[]{m_const_id, m_dt_id});
			}
			if (relInst37430 == null && searchAllRoots
					&& !baseRoot.isCompareRoot()) {
				Ooaofooa[] roots = Ooaofooa.getInstances();
				for (int i = 0; i < roots.length; i++) {
					if (roots[i].isCompareRoot()) {
						// never use elements from any compare root
						continue;
					}
					relInst37430 = (SymbolicConstant_c) roots[i]
							.getInstanceList(SymbolicConstant_c.class).get(
									new Object[]{m_const_id, m_dt_id});
					if (relInst37430 != null)
						break;
				}
			}
			//synchronized
			if (relInst37430 != null) {
				if (relateProxies || !isProxy()
						|| (inSameComponent(this, relInst37430) && !isProxy())) {
					relInst37430.relateAcrossR850To(this, notifyChanges);
				}
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R801
		// V_VAL
		inst = IsSupertypeValue;
		unrelateAcrossR801From(IsSupertypeValue, notifyChanges);
		if (inst != null) {
			inst.removeRef();
		}
		// R850
		// CNST_SYC
		inst = SymbolicConstant;
		unrelateAcrossR850From(SymbolicConstant, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(SymbolicConstantValue_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final SymbolicConstantValue_c inst = (SymbolicConstantValue_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(SymbolicConstantValue_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static SymbolicConstantValue_c SymbolicConstantValueInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		SymbolicConstantValue_c result = findSymbolicConstantValueInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static SymbolicConstantValue_c findSymbolicConstantValueInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(SymbolicConstantValue_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				SymbolicConstantValue_c x = (SymbolicConstantValue_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static SymbolicConstantValue_c SymbolicConstantValueInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return SymbolicConstantValueInstance(modelRoot, test, true);
	}

	public static SymbolicConstantValue_c SymbolicConstantValueInstance(
			ModelRoot modelRoot) {
		return SymbolicConstantValueInstance(modelRoot, null, true);
	}

	public static SymbolicConstantValue_c[] SymbolicConstantValueInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(SymbolicConstantValue_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				SymbolicConstantValue_c x = (SymbolicConstantValue_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				SymbolicConstantValue_c[] ret_set = new SymbolicConstantValue_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new SymbolicConstantValue_c[0];
			}
		}
	}
	public static SymbolicConstantValue_c[] SymbolicConstantValueInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return SymbolicConstantValueInstances(modelRoot, test, true);
	}
	public static SymbolicConstantValue_c[] SymbolicConstantValueInstances(
			ModelRoot modelRoot) {
		return SymbolicConstantValueInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Symbolic Constant Value.dispose call: ";
		Value_c testR801Inst22 = Value_c.getOneV_VALOnR801(this, false);

		if (testR801Inst22 != null) {
			delete_error = true;
			errorMsg = errorMsg + "801 ";
		}
		SymbolicConstant_c testR850Inst = SymbolicConstant_c
				.getOneCNST_SYCOnR850(this, false);

		if (testR850Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "850 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Symbolic Constant Value",
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
		if (attributeName.equals("value_id")) {
			return true;
		}
		if (attributeName.equals("const_id")) {
			return true;
		}
		if (attributeName.equals("dt_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getValue_idLongBased() {
		if (IsSupertypeValue != null) {
			return IsSupertypeValue.getValue_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getValue_id() {
		if (IsSupertypeValue != null) {
			return IsSupertypeValue.getValue_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeValue != null);

	}

	public java.util.UUID getValue_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_value_id))
			return m_value_id;
		else
			return getValue_id();
	}

	public void setValue_id(java.util.UUID newValue) {
		m_value_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getConst_idLongBased() {
		if (SymbolicConstant != null) {
			return SymbolicConstant.getConst_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getConst_id() {
		if (SymbolicConstant != null) {
			return SymbolicConstant.getConst_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getConst_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_const_id))
			return m_const_id;
		else
			return getConst_id();
	}

	public void setConst_id(java.util.UUID newValue) {
		m_const_id = IdAssigner.preprocessUUID(newValue);
	}
	public long getDt_idLongBased() {
		if (SymbolicConstant != null) {
			return SymbolicConstant.getDt_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getDt_id() {
		if (SymbolicConstant != null) {
			return SymbolicConstant.getDt_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public java.util.UUID getDt_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_dt_id))
			return m_dt_id;
		else
			return getDt_id();
	}

	public void setDt_id(java.util.UUID newValue) {
		m_dt_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Symbolic Constant Value", //$NON-NLS-1$
						" Operation entered: Symbolic Constant Value::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		SymbolicConstantValue_c[] objs = SymbolicConstantValue_c
				.SymbolicConstantValueInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Symbolic Constant Value", //$NON-NLS-1$
						" Operation entered: Symbolic Constant Value::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class SymbolicConstantValue_c_test37432_c
				implements
					ClassQueryInterface_c {
			SymbolicConstantValue_c_test37432_c(java.util.UUID p37433) {
				m_p37433 = p37433;
			}
			private java.util.UUID m_p37433;
			public boolean evaluate(Object candidate) {
				SymbolicConstantValue_c selected = (SymbolicConstantValue_c) candidate;
				boolean retval = false;
				retval = (selected.getValue_id().equals(m_p37433));
				return retval;
			}
		}

		SymbolicConstantValue_c[] objs37431 = SymbolicConstantValue_c
				.SymbolicConstantValueInstances(modelRoot,
						new SymbolicConstantValue_c_test37432_c(getValue_id()));

		if (((objs37431.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Symbolic Constant Value", //$NON-NLS-1$
								"Consistency: Object: Symbolic Constant Value: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37431.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Symbolic Constant Value: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37431.length), e);
			}
			retval = false;

		}

		if (((objs37431.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Symbolic Constant Value", //$NON-NLS-1$
								"Consistency: Object: Symbolic Constant Value: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37431.length)
										+ " Value_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Symbolic Constant Value: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37431.length)
										+ " Value_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Symbolic Constant Value is a subtype in association: rel.Numb = 801
		// The supertype class is: Value
		class Value_c_test37437_c implements ClassQueryInterface_c {
			Value_c_test37437_c(java.util.UUID p37438) {
				m_p37438 = p37438;
			}
			private java.util.UUID m_p37438;
			public boolean evaluate(Object candidate) {
				Value_c selected = (Value_c) candidate;
				boolean retval = false;
				retval = (selected.getValue_id().equals(m_p37438));
				return retval;
			}
		}

		Value_c[] objs37436 = Value_c.ValueInstances(modelRoot,
				new Value_c_test37437_c(getValue_id()));

		if (((objs37436.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Symbolic Constant Value", //$NON-NLS-1$
								"Consistency: Object: Symbolic Constant Value: Association: 801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs37436.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Symbolic Constant Value: Association: 801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37436.length), e);
			}
			retval = false;

		}

		// Symbolic Constant Value is a referring class in association: rel.Numb = 850
		// The participating class is: Symbolic Constant
		class SymbolicConstant_c_test37440_c implements ClassQueryInterface_c {
			SymbolicConstant_c_test37440_c(java.util.UUID p37441,
					java.util.UUID p37442) {
				m_p37441 = p37441;
				m_p37442 = p37442;
			}
			private java.util.UUID m_p37441;
			private java.util.UUID m_p37442;
			public boolean evaluate(Object candidate) {
				SymbolicConstant_c selected = (SymbolicConstant_c) candidate;
				boolean retval = false;
				retval = (selected.getConst_id().equals(m_p37441))
						& (selected.getDt_id().equals(m_p37442));
				return retval;
			}
		}

		SymbolicConstant_c[] objs37439 = SymbolicConstant_c
				.SymbolicConstantInstances(modelRoot,
						new SymbolicConstant_c_test37440_c(getConst_id(),
								getDt_id()));

		// The participant is unconditional
		// The multiplicity of the participant is one
		if (((objs37439.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Symbolic Constant Value", //$NON-NLS-1$
								"Consistency: Object: Symbolic Constant Value: Association: 850: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs37439.length)
										+ " Const_ID: " + "Not Printable" + " DT_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Symbolic Constant Value: Association: 850: Cardinality of a participant is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs37439.length)
										+ " Const_ID: " + "Not Printable" + " DT_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Symbolic Constant Value",
				" Operation entered: SymbolicConstantValue::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		SymbolicConstant_c v_syc = SymbolicConstant_c
				.getOneCNST_SYCOnR850(this);

		if (((v_syc != null))) {

			this.unrelateAcrossR850From(v_syc);

		}

		delete();

	} // End dispose

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Symbolic Constant Value
