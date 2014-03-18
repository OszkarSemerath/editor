package com.mentor.nucleus.bp.core.test.consistency;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.test.consistency.Singleparticipanttest_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

import com.mentor.nucleus.bp.core.*;
import com.mentor.nucleus.bp.core.test.CoreTestPlugin;
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
abstract class EV_SINGLEPARTICIPANTTEST extends genericEvent_c {
	public abstract int getEvtcode();
}

public class Singleparticipanttest_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public Singleparticipanttest_c(ModelRoot modelRoot, int p_m_sptid) {
		super(modelRoot);
		m_sptid = p_m_sptid;

		Object[] key = {new UUID(0, new Long(m_sptid))};
		addInstanceToMap(key);
	}
	static public Singleparticipanttest_c createProxy(ModelRoot modelRoot,
			int p_m_sptid, String p_contentPath, IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(Singleparticipanttest_c.class);
		Singleparticipanttest_c new_inst = null;
		synchronized (instances) {
			Object[] key = {new UUID(0, new Long(p_m_sptid))};
			new_inst = (Singleparticipanttest_c) instances.get(key);
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
				new_inst.m_sptid = p_m_sptid;

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new Singleparticipanttest_c(modelRoot, p_m_sptid);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public Singleparticipanttest_c resolveInstance(ModelRoot modelRoot,
			int p_m_sptid) {
		InstanceList instances = modelRoot
				.getInstanceList(Singleparticipanttest_c.class);
		Singleparticipanttest_c source = null;
		synchronized (instances) {
			Object[] key = {new UUID(0, new Long(p_m_sptid))};
			source = (Singleparticipanttest_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				source.m_sptid = p_m_sptid;

				return source;
			}
		}
		// there is no instance matching the id
		Singleparticipanttest_c new_inst = new Singleparticipanttest_c(
				modelRoot, p_m_sptid);
		return new_inst;
	}
	public Singleparticipanttest_c(ModelRoot modelRoot) {
		super(modelRoot);
		Object[] key = {new UUID(0, new Long(m_sptid))};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {new UUID(0, new Long(m_sptid))};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p6
		// round p7
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof Singleparticipanttest_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof Singleparticipanttest_c)) {
			return false;
		}

		Singleparticipanttest_c me = (Singleparticipanttest_c) elem;
		if (getSptid() != ((Singleparticipanttest_c) elem).getSptid())
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof Singleparticipanttest_c)) {
			return false;
		}

		Singleparticipanttest_c me = (Singleparticipanttest_c) elem;
		if (getSptid() != ((Singleparticipanttest_c) elem).getSptid())
			return false;
		return true;
	}

	// Attributes
	private int m_sptid;

	// declare associations referring to this class

	// referred to navigation

	Singleformalizertest_c backPointer_Singleformalizertest_R1;

	public void setSingleformalizertestOrderInChildListR1(
			Singleformalizertest_c target, int index) {
		unrelateAcrossR1From(target);
		Singleformalizertest_c[] elements = Singleformalizertest_c
				.getManyCST_SFTsOnR1(this);
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (count >= index) {
				unrelateAcrossR1From((Singleformalizertest_c) elements[i]);
			}
			count++;
		}
		relateAcrossR1To(target);
		count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (count >= index) {
				relateAcrossR1To((Singleformalizertest_c) elements[i]);
			}
			count++;
		}
	}

	public void relateAcrossR1To(Singleformalizertest_c target) {
		if (target != null) {
			target.relateAcrossR1To(this, true);
		}
	}

	public void relateAcrossR1To(Singleformalizertest_c target,
			boolean notifyChanges) {
		if (target != null) {
			target.relateAcrossR1To(this, notifyChanges);
		}
	}

	public void setBackPointerR1To(Singleformalizertest_c target) {
		backPointer_Singleformalizertest_R1 = target;
	}

	public void unrelateAcrossR1From(Singleformalizertest_c target) {
		if (target != null) {
			target.unrelateAcrossR1From(this, true);
		}
	}

	public void unrelateAcrossR1From(Singleformalizertest_c target,
			boolean notifyChanges) {
		if (target != null) {
			target.unrelateAcrossR1From(this, notifyChanges);
		}
	}

	public void clearBackPointerR1To(Singleformalizertest_c target) {
		if (target == backPointer_Singleformalizertest_R1) {
			backPointer_Singleformalizertest_R1 = null;
		}
	}

	public static Singleparticipanttest_c getOneCST_SPTOnR1(
			Singleformalizertest_c[] targets) {
		return getOneCST_SPTOnR1(targets, null);
	}

	public static Singleparticipanttest_c getOneCST_SPTOnR1(
			Singleformalizertest_c[] targets, ClassQueryInterface_c test) {
		return getOneCST_SPTOnR1(targets, test, true);
	}

	public static Singleparticipanttest_c getOneCST_SPTOnR1(
			Singleformalizertest_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {
		Singleparticipanttest_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				if (test != null) {
					Singleparticipanttest_c candidate_val = getOneCST_SPTOnR1(
							targets[i], true);
					if (candidate_val != null && test.evaluate(candidate_val)) {
						ret_val = candidate_val;
						break;
					}
				} else {
					ret_val = getOneCST_SPTOnR1(targets[i], loadComponent);
					if (ret_val != null) {
						break;
					}
				}
			}
		}
		return ret_val;
	}

	public static Singleparticipanttest_c getOneCST_SPTOnR1(
			Singleformalizertest_c target) {
		return getOneCST_SPTOnR1(target, true);
	}
	public static Singleparticipanttest_c getOneCST_SPTOnR1(
			Singleformalizertest_c target, boolean loadComponent) {
		if (target != null) {
			if (loadComponent) {
				target.loadProxy();
			}
			return target.Singleparticipanttest;
		} else {
			return null;
		}
	}

	public static Singleparticipanttest_c[] getManyCST_SPTsOnR1(
			Singleformalizertest_c[] targets, ClassQueryInterface_c test) {
		return getManyCST_SPTsOnR1(targets, test, true);
	}

	public static Singleparticipanttest_c [] getManyCST_SPTsOnR1(Singleformalizertest_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new Singleparticipanttest_c[0];
  
  
  LinkedHashSet<Singleparticipanttest_c> elementsSet = new LinkedHashSet<Singleparticipanttest_c>();
  for (int i = 0; i < targets.length; i++) {
	if(loadComponent && targets[i] != null && targets[i].Singleparticipanttest == null)
	  targets[i].loadProxy();
    Singleparticipanttest_c associate = targets[i].Singleparticipanttest;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
            }
    }
  }

  Singleparticipanttest_c[] result = new Singleparticipanttest_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}
	public static Singleparticipanttest_c[] getManyCST_SPTsOnR1(
			Singleformalizertest_c[] targets) {
		return getManyCST_SPTsOnR1(targets, null);
	}

	public static Singleparticipanttest_c[] getManyCST_SPTsOnR1(
			Singleformalizertest_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		if (target != null) {
			Singleformalizertest_c[] targetArray = new Singleformalizertest_c[1];
			targetArray[0] = target;
			return getManyCST_SPTsOnR1(targetArray, test, loadComponent);
		} else {
			Singleparticipanttest_c[] result = new Singleparticipanttest_c[0];
			return result;
		}

	}

	public static Singleparticipanttest_c[] getManyCST_SPTsOnR1(
			Singleformalizertest_c target, ClassQueryInterface_c test) {
		return getManyCST_SPTsOnR1(target, null, true);
	}

	public static Singleparticipanttest_c[] getManyCST_SPTsOnR1(
			Singleformalizertest_c target) {
		return getManyCST_SPTsOnR1(target, null, true);
	}

	public static Singleparticipanttest_c[] getManyCST_SPTsOnR1(
			Singleformalizertest_c target, boolean loadComponent) {
		return getManyCST_SPTsOnR1(target, null, loadComponent);
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
	}
	public void batchUnrelate(boolean notifyChanges) {
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots) {
		batchRelateAll(modelRoot, notifyChanges, searchAllRoots, false);
	}
	public static void batchRelateAll(ModelRoot modelRoot,
			boolean notifyChanges, boolean searchAllRoots, boolean relateProxies) {

		// class has no referential attributes

	}

	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(Singleparticipanttest_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static Singleparticipanttest_c SingleparticipanttestInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		Singleparticipanttest_c result = findSingleparticipanttestInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static Singleparticipanttest_c findSingleparticipanttestInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(Singleparticipanttest_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				Singleparticipanttest_c x = (Singleparticipanttest_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static Singleparticipanttest_c SingleparticipanttestInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return SingleparticipanttestInstance(modelRoot, test, true);
	}

	public static Singleparticipanttest_c SingleparticipanttestInstance(
			ModelRoot modelRoot) {
		return SingleparticipanttestInstance(modelRoot, null, true);
	}

	public static Singleparticipanttest_c[] SingleparticipanttestInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(Singleparticipanttest_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				Singleparticipanttest_c x = (Singleparticipanttest_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				Singleparticipanttest_c[] ret_set = new Singleparticipanttest_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new Singleparticipanttest_c[0];
			}
		}
	}
	public static Singleparticipanttest_c[] SingleparticipanttestInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return SingleparticipanttestInstances(modelRoot, test, true);
	}
	public static Singleparticipanttest_c[] SingleparticipanttestInstances(
			ModelRoot modelRoot) {
		return SingleparticipanttestInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the singleParticipantTest.dispose call: ";
		Singleformalizertest_c testR1Inst = Singleformalizertest_c
				.getOneCST_SFTOnR1(this, false);

		if (testR1Inst != null) {
			delete_error = true;
			errorMsg = errorMsg + "1 ";
		}
		if (delete_error == true) {

			if (CoreTestPlugin.getDefault().isDebugging()) {
				Consistency.log.println(ILogger.DELETE,
						"singleParticipantTest", errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CoreTestPlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		return false;
	}
	// declare attribute accessors
	public int getSptid() {
		return m_sptid;
	}

	public void setSptid(int newValue) {
		if (m_sptid == newValue) {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this, "Sptid",
				new Integer(m_sptid), new Integer(newValue), true);

		m_sptid = newValue;
		Consistency.getDefaultInstance().fireModelElementAttributeChanged(
				change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "singleParticipantTest", //$NON-NLS-1$
						" Operation entered: singleParticipantTest::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		Singleparticipanttest_c[] objs = Singleparticipanttest_c
				.SingleparticipanttestInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "singleParticipantTest", //$NON-NLS-1$
				" Operation entered: singleParticipantTest::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class Singleparticipanttest_c_test47_c implements ClassQueryInterface_c {
			Singleparticipanttest_c_test47_c(int p48) {
				m_p48 = p48;
			}
			private int m_p48;
			public boolean evaluate(Object candidate) {
				Singleparticipanttest_c selected = (Singleparticipanttest_c) candidate;
				boolean retval = false;
				retval = (selected.getSptid() == (m_p48));
				return retval;
			}
		}

		Singleparticipanttest_c[] objs46 = Singleparticipanttest_c
				.SingleparticipanttestInstances(modelRoot,
						new Singleparticipanttest_c_test47_c(getSptid()));

		if (((objs46.length) == 0)) {

			if (CoreTestPlugin.getDefault().isDebugging()) {
				Consistency.log
						.println(ILogger.CONSISTENCY,
								"singleParticipantTest", //$NON-NLS-1$
								"Consistency: Object: singleParticipantTest: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs46.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CoreTestPlugin
						.logError(
								"Consistency: Object: singleParticipantTest: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs46.length), e);
			}
			retval = false;

		}

		if (((objs46.length) > 1)) {

			if (CoreTestPlugin.getDefault().isDebugging()) {
				Consistency.log
						.println(ILogger.CONSISTENCY,
								"singleParticipantTest", //$NON-NLS-1$
								"Consistency: Object: singleParticipantTest: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs46.length)
										+ " sptID: " + Integer.toString(getSptid())); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CoreTestPlugin
						.logError(
								"Consistency: Object: singleParticipantTest: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs46.length)
										+ " sptID: " + Integer.toString(getSptid()), e); //$NON-NLS-1$
			}
			retval = false;

		}

		// singleParticipantTest is a participating class in association: rel.Numb = 1
		// Object: singleFormalizerTest
		class Singleformalizertest_c_test52_c implements ClassQueryInterface_c {
			Singleformalizertest_c_test52_c(int p53) {
				m_p53 = p53;
			}
			private int m_p53;
			public boolean evaluate(Object candidate) {
				Singleformalizertest_c selected = (Singleformalizertest_c) candidate;
				boolean retval = false;
				retval = (selected.getSptid() == (m_p53));
				return retval;
			}
		}

		Singleformalizertest_c[] objs51 = Singleformalizertest_c
				.SingleformalizertestInstances(modelRoot,
						new Singleformalizertest_c_test52_c(getSptid()));

		if (((objs51.length) != 1)) {

			if (CoreTestPlugin.getDefault().isDebugging()) {
				Consistency.log
						.println(ILogger.CONSISTENCY,
								"singleParticipantTest", //$NON-NLS-1$
								"Consistency: Object: singleParticipantTest: Association: 1: Cardinality of a formalizer is not equal to one. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs51.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CoreTestPlugin
						.logError(
								"Consistency: Object: singleParticipantTest: Association: 1: Cardinality of a formalizer is not equal to one. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs51.length), e);
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
} // end singleParticipantTest
