package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.NameMatch_c.java
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
abstract class EV_NAME_MATCH extends genericEvent_c {
	public abstract int getEvtcode();
}

public class NameMatch_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public NameMatch_c(ModelRoot modelRoot, java.util.UUID p_m_id,
			int p_m_unnamed_attribute) {
		super(modelRoot);
		m_unnamed_attribute = p_m_unnamed_attribute;
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_id = IdAssigner.preprocessUUID(p_m_id);

		Object[] key = {m_id};
		addInstanceToMap(key);
	}
	static public NameMatch_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_id, int p_m_unnamed_attribute,
			String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot.getInstanceList(NameMatch_c.class);
		NameMatch_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			new_inst = (NameMatch_c) instances.get(key);
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
				new_inst.m_unnamed_attribute = p_m_unnamed_attribute;
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				new_inst.m_id = IdAssigner.preprocessUUID(p_m_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new NameMatch_c(modelRoot, p_m_id, p_m_unnamed_attribute);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public NameMatch_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_id, int p_m_unnamed_attribute) {
		InstanceList instances = modelRoot.getInstanceList(NameMatch_c.class);
		NameMatch_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_id};
			source = (NameMatch_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				source.m_unnamed_attribute = p_m_unnamed_attribute;
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_id = IdAssigner.preprocessUUID(p_m_id);

				return source;
			}
		}
		// there is no instance matching the id
		NameMatch_c new_inst = new NameMatch_c(modelRoot, p_m_id,
				p_m_unnamed_attribute);
		return new_inst;
	}
	public NameMatch_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_id = IdAssigner.NULL_UUID;
		Object[] key = {m_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_id != p_newKey) {

			m_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof NameMatch_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof NameMatch_c)) {
			return false;
		}

		NameMatch_c me = (NameMatch_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getId()) || IdAssigner.NULL_UUID
				.equals(((NameMatch_c) elem).getId())) && this != elem) {
			return false;
		}
		if (!getId().equals(((NameMatch_c) elem).getId()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof NameMatch_c)) {
			return false;
		}

		NameMatch_c me = (NameMatch_c) elem;
		if (!getIdCachedValue().equals(((NameMatch_c) elem).getIdCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private int m_unnamed_attribute;
	private java.util.UUID m_id;

	// declare association references from this class

	// referring navigation

	Match_c IsSupertypeMatch;
	public void relateAcrossR9801To(Match_c target) {
		relateAcrossR9801To(target, true);
	}
	public void relateAcrossR9801To(Match_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeMatch)
			return; // already related

		if (IsSupertypeMatch != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeMatch != null) {

				IsSupertypeMatch.clearBackPointerR9801To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"NameMatch_c.relateAcrossR9801To(Match_c target)",
									"Relate performed across R9801 from Name Match to Match without unrelate of prior instance.");
				}
			}

			IsSupertypeMatch = target;
			m_id = target.getId();
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR9801To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "9801", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}
	public void unrelateAcrossR9801From(Match_c target) {
		unrelateAcrossR9801From(target, true);
	}
	public void unrelateAcrossR9801From(Match_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeMatch == null)
			return; // already unrelated

		if (target != IsSupertypeMatch) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R9801",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR9801To(this);
		}

		if (IsSupertypeMatch != null) {

			m_id = IsSupertypeMatch.getId();
			IsSupertypeMatch = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "9801", "");
				Ooaofooa.getDefaultInstance().fireModelElementRelationChanged(
						change);
			}
		}
	}

	public static NameMatch_c getOneSR_NMOnR9801(Match_c[] targets) {
		return getOneSR_NMOnR9801(targets, null);
	}

	public static NameMatch_c getOneSR_NMOnR9801(Match_c[] targets,
			ClassQueryInterface_c test) {
		NameMatch_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneSR_NMOnR9801(targets[i], test);
			}
		}

		return ret_val;
	}

	public static NameMatch_c getOneSR_NMOnR9801(Match_c target) {
		return getOneSR_NMOnR9801(target, null);
	}

	public static NameMatch_c getOneSR_NMOnR9801(Match_c target,
			boolean loadComponent) {
		return getOneSR_NMOnR9801(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static NameMatch_c getOneSR_NMOnR9801(Match_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneSR_NMOnR9801(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static NameMatch_c getOneSR_NMOnR9801(ModelRoot modelRoot,
			Match_c target, ClassQueryInterface_c test) {
		return getOneSR_NMOnR9801(modelRoot, target, test, true);
	}

	public static NameMatch_c getOneSR_NMOnR9801(ModelRoot modelRoot,
			Match_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneSR_NMOnR9801(modelRoot, target, test);
	}
	private static NameMatch_c find_getOneSR_NMOnR9801(ModelRoot modelRoot,
			Match_c target, ClassQueryInterface_c test) {
		if (target != null) {
			NameMatch_c source = (NameMatch_c) target.backPointer_IsSubtypeNameMatchIsSubtype_R9801;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static NameMatch_c[] getManySR_NMsOnR9801(Match_c[] targets) {
		return getManySR_NMsOnR9801(targets, null);
	}
	public static NameMatch_c[] getManySR_NMsOnR9801(Match_c[] targets,
			boolean loadComponent) {
		return getManySR_NMsOnR9801(targets, null, loadComponent);
	}
	public static NameMatch_c[] getManySR_NMsOnR9801(Match_c[] targets,
			ClassQueryInterface_c test) {
		return getManySR_NMsOnR9801(targets, test, true);
	}

	public static NameMatch_c[] getManySR_NMsOnR9801(Match_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new NameMatch_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot.getInstanceList(NameMatch_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			NameMatch_c source = (NameMatch_c) targets[i].backPointer_IsSubtypeNameMatchIsSubtype_R9801;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			NameMatch_c[] ret_set = new NameMatch_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new NameMatch_c[0];
		}
	}

	public static NameMatch_c[] getManySR_NMsOnR9801(Match_c target) {
		if (target != null) {
			Match_c[] targetArray = new Match_c[1];
			targetArray[0] = target;
			return getManySR_NMsOnR9801(targetArray);
		} else {
			NameMatch_c[] result = new NameMatch_c[0];
			return result;
		}
	}

	public static NameMatch_c[] getManySR_NMsOnR9801(Match_c target,
			boolean loadComponent) {
		if (target != null) {
			Match_c[] targetArray = new Match_c[1];
			targetArray[0] = target;
			return getManySR_NMsOnR9801(targetArray, loadComponent);
		} else {
			NameMatch_c[] result = new NameMatch_c[0];
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

		// R9801
		Match_c relInst38938 = (Match_c) baseRoot
				.getInstanceList(Match_c.class).get(new Object[]{m_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst38938 == null) {
			relInst38938 = (Match_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Match_c.class).get(new Object[]{m_id});
		}
		if (relInst38938 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst38938 = (Match_c) roots[i]
						.getInstanceList(Match_c.class).get(new Object[]{m_id});
				if (relInst38938 != null)
					break;
			}
		}
		//synchronized
		if (relInst38938 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst38938) && !isProxy())) {
				relInst38938.relateAcrossR9801To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R9801
		// SR_M
		inst = IsSupertypeMatch;
		unrelateAcrossR9801From(IsSupertypeMatch, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(NameMatch_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final NameMatch_c inst = (NameMatch_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot.getInstanceList(NameMatch_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static NameMatch_c NameMatchInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		NameMatch_c result = findNameMatchInstance(modelRoot, test,
				loadComponent);
		if (result == null && loadComponent) {
			List pmcs = PersistenceManager.findAllComponents(modelRoot,
					NameMatch_c.class);
			for (int i = 0; i < pmcs.size(); i++) {
				PersistableModelComponent component = (PersistableModelComponent) pmcs
						.get(i);
				if (!component.isLoaded()) {
					try {
						component.load(new NullProgressMonitor());
						result = findNameMatchInstance(modelRoot, test,
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
	private static NameMatch_c findNameMatchInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		InstanceList instances = modelRoot.getInstanceList(NameMatch_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				NameMatch_c x = (NameMatch_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						return x;
				}
			}
		}
		return null;
	}
	public static NameMatch_c NameMatchInstance(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return NameMatchInstance(modelRoot, test, true);
	}

	public static NameMatch_c NameMatchInstance(ModelRoot modelRoot) {
		return NameMatchInstance(modelRoot, null, true);
	}

	public static NameMatch_c[] NameMatchInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (loadComponent) {
			PersistenceManager.ensureAllInstancesLoaded(modelRoot,
					NameMatch_c.class);
		}
		InstanceList instances = modelRoot.getInstanceList(NameMatch_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				NameMatch_c x = (NameMatch_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					if (x.ensureLoaded(loadComponent))
						matches.add(x);
				}
			}
			if (matches.size() > 0) {
				NameMatch_c[] ret_set = new NameMatch_c[matches.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new NameMatch_c[0];
			}
		}
	}
	public static NameMatch_c[] NameMatchInstances(ModelRoot modelRoot,
			ClassQueryInterface_c test) {
		return NameMatchInstances(modelRoot, test, true);
	}
	public static NameMatch_c[] NameMatchInstances(ModelRoot modelRoot) {
		return NameMatchInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Name Match.dispose call: ";
		Match_c testR9801Inst1 = Match_c.getOneSR_MOnR9801(this, false);

		if (testR9801Inst1 != null) {
			delete_error = true;
			errorMsg = errorMsg + "9801 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Name Match", errorMsg);
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
		if (attributeName.equals("id")) {
			return true;
		}
		return false;
	}
	public String getCompUniqueID() {
		UUID tempID = null;
		long longID = 0L;
		StringBuffer result = new StringBuffer();

		tempID = getId();

		if (IdAssigner.NULL_UUID.equals(tempID))
			tempID = getIdCachedValue();
		result.append(Long.toHexString(tempID.getMostSignificantBits()));
		result.append(Long.toHexString(tempID.getLeastSignificantBits()));
		return result.toString();
	}
	// declare attribute accessors
	public int getUnnamedAttribute() {
		return m_unnamed_attribute;
	}

	public void setUnnamedAttribute(int newValue) {
		if (m_unnamed_attribute == newValue) {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"UnnamedAttribute", new Integer(m_unnamed_attribute),
				new Integer(newValue), true);

		m_unnamed_attribute = newValue;
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	public long getIdLongBased() {
		if (IsSupertypeMatch != null) {
			return IsSupertypeMatch.getIdLongBased();
		}
		return 0;
	}
	public java.util.UUID getId() {
		if (IsSupertypeMatch != null) {
			return IsSupertypeMatch.getId();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeMatch != null);

	}

	public java.util.UUID getIdCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_id))
			return m_id;
		else
			return getId();
	}

	public void setId(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_id)) {
				return;
			}
		} else if (m_id != null) {
			if (m_id.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Id",
				m_id, newValue, true);
		m_id = IdAssigner.preprocessUUID(newValue);
		Ooaofooa.getDefaultInstance().fireModelElementAttributeChanged(change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Name Match", //$NON-NLS-1$
				" Operation entered: Name Match::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		NameMatch_c[] objs = NameMatch_c.NameMatchInstances(modelRoot, null,
				false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Name Match", //$NON-NLS-1$
				" Operation entered: Name Match::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class NameMatch_c_test38940_c implements ClassQueryInterface_c {
			NameMatch_c_test38940_c(java.util.UUID p38941) {
				m_p38941 = p38941;
			}
			private java.util.UUID m_p38941;
			public boolean evaluate(Object candidate) {
				NameMatch_c selected = (NameMatch_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p38941));
				return retval;
			}
		}

		NameMatch_c[] objs38939 = NameMatch_c.NameMatchInstances(modelRoot,
				new NameMatch_c_test38940_c(getId()));

		if (((objs38939.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Name Match", //$NON-NLS-1$
								"Consistency: Object: Name Match: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs38939.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin.logError(
						"Consistency: Object: Name Match: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs38939.length), e);
			}
			retval = false;

		}

		if (((objs38939.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Name Match", //$NON-NLS-1$
								"Consistency: Object: Name Match: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs38939.length)
										+ " Id: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Name Match: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs38939.length)
										+ " Id: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Name Match is a subtype in association: rel.Numb = 9801
		// The supertype class is: Match
		class Match_c_test38945_c implements ClassQueryInterface_c {
			Match_c_test38945_c(java.util.UUID p38946) {
				m_p38946 = p38946;
			}
			private java.util.UUID m_p38946;
			public boolean evaluate(Object candidate) {
				Match_c selected = (Match_c) candidate;
				boolean retval = false;
				retval = (selected.getId().equals(m_p38946));
				return retval;
			}
		}

		Match_c[] objs38944 = Match_c.MatchInstances(modelRoot,
				new Match_c_test38945_c(getId()));

		if (((objs38944.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(ILogger.CONSISTENCY,
								"Name Match", //$NON-NLS-1$
								"Consistency: Object: Name Match: Association: 9801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs38944.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Name Match: Association: 9801: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs38944.length), e);
			}
			retval = false;

		}

		return retval;
	}

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Name Match
