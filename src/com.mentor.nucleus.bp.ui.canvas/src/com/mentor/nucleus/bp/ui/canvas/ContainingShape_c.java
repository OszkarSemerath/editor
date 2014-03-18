package com.mentor.nucleus.bp.ui.canvas;
//====================================================================
//
// File:      com.mentor.nucleus.bp.ui.canvas.ContainingShape_c.java
//
// WARNING: Do not edit this generated file
// Generated by ../MC-Java/java.arc, $Revision: 1.111 $
//
// (c) Copyright 2005-2014 by Mentor Graphics Corp.  All rights reserved.
//
//====================================================================

import com.mentor.nucleus.bp.core.*;
import org.eclipse.swt.graphics.GC;
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
import org.eclipse.swt.graphics.Color;
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_CONTAINING_SHAPE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class ContainingShape_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public ContainingShape_c(ModelRoot modelRoot, java.util.UUID p_m_elementid) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_elementid = IdAssigner.preprocessUUID(p_m_elementid);

		Object[] key = {m_elementid};
		addInstanceToMap(key);
	}
	static public ContainingShape_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_elementid, String p_contentPath,
			IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(ContainingShape_c.class);
		ContainingShape_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_elementid};
			new_inst = (ContainingShape_c) instances.get(key);
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
				new_inst.m_elementid = IdAssigner.preprocessUUID(p_m_elementid);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new ContainingShape_c(modelRoot, p_m_elementid);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public ContainingShape_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_elementid) {
		InstanceList instances = modelRoot
				.getInstanceList(ContainingShape_c.class);
		ContainingShape_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_elementid};
			source = (ContainingShape_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_elementid = IdAssigner.preprocessUUID(p_m_elementid);

				return source;
			}
		}
		// there is no instance matching the id
		ContainingShape_c new_inst = new ContainingShape_c(modelRoot,
				p_m_elementid);
		return new_inst;
	}
	public ContainingShape_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_elementid = IdAssigner.NULL_UUID;
		Object[] key = {m_elementid};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_elementid};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_elementid != p_newKey) {

			m_elementid = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof ContainingShape_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof ContainingShape_c)) {
			return false;
		}

		ContainingShape_c me = (ContainingShape_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getElementid()) || IdAssigner.NULL_UUID
				.equals(((ContainingShape_c) elem).getElementid()))
				&& this != elem) {
			return false;
		}
		if (!getElementid().equals(((ContainingShape_c) elem).getElementid()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof ContainingShape_c)) {
			return false;
		}

		ContainingShape_c me = (ContainingShape_c) elem;
		if (!getElementidCachedValue().equals(
				((ContainingShape_c) elem).getElementidCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_elementid;

	// declare association references from this class

	// referring navigation

	Shape_c IsSupertypeShape;
	public void relateAcrossR28To(Shape_c target) {
		relateAcrossR28To(target, true);
	}
	public void relateAcrossR28To(Shape_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeShape)
			return; // already related

		if (IsSupertypeShape != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeShape != null) {

				IsSupertypeShape.clearBackPointerR28To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofgraphics.log
							.println(
									ILogger.CONSISTENCY,
									"ContainingShape_c.relateAcrossR28To(Shape_c target)",
									"Relate performed across R28 from Containing Shape to Shape without unrelate of prior instance.");
				}
			}

			IsSupertypeShape = target;
			if (IdAssigner.NULL_UUID.equals(target.getElementid())) {
				// do not update cached value
			} else {
				// update cached value
				m_elementid = target.getElementidCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR28To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "28", "");
				Ooaofgraphics.getDefaultInstance()
						.fireModelElementRelationChanged(change);
			}
		}
	}
	public void unrelateAcrossR28From(Shape_c target) {
		unrelateAcrossR28From(target, true);
	}
	public void unrelateAcrossR28From(Shape_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeShape == null)
			return; // already unrelated

		if (target != IsSupertypeShape) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CanvasPlugin
					.logError(
							"Tried to unrelate from non-related instance across R28",
							e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR28To(this);
		}

		if (IsSupertypeShape != null) {

			m_elementid = IsSupertypeShape.getElementid();
			if (IdAssigner.NULL_UUID.equals(m_elementid)) {
				m_elementid = IsSupertypeShape.getElementidCachedValue();
			}
			IsSupertypeShape = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "28", "");
				Ooaofgraphics.getDefaultInstance()
						.fireModelElementRelationChanged(change);
			}
		}
	}

	public static ContainingShape_c getOneGD_CTROnR28(Shape_c[] targets) {
		return getOneGD_CTROnR28(targets, null);
	}

	public static ContainingShape_c getOneGD_CTROnR28(Shape_c[] targets,
			ClassQueryInterface_c test) {
		ContainingShape_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneGD_CTROnR28(targets[i], test);
			}
		}

		return ret_val;
	}

	public static ContainingShape_c getOneGD_CTROnR28(Shape_c target) {
		return getOneGD_CTROnR28(target, null);
	}

	public static ContainingShape_c getOneGD_CTROnR28(Shape_c target,
			boolean loadComponent) {
		return getOneGD_CTROnR28(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static ContainingShape_c getOneGD_CTROnR28(Shape_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneGD_CTROnR28(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static ContainingShape_c getOneGD_CTROnR28(ModelRoot modelRoot,
			Shape_c target, ClassQueryInterface_c test) {
		return getOneGD_CTROnR28(modelRoot, target, test, true);
	}

	public static ContainingShape_c getOneGD_CTROnR28(ModelRoot modelRoot,
			Shape_c target, ClassQueryInterface_c test, boolean loadComponent) {
		return find_getOneGD_CTROnR28(modelRoot, target, test);
	}
	private static ContainingShape_c find_getOneGD_CTROnR28(
			ModelRoot modelRoot, Shape_c target, ClassQueryInterface_c test) {
		if (target != null) {
			ContainingShape_c source = (ContainingShape_c) target.backPointer_IsSubtypeContainingShapeIsSubtype_R28;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static ContainingShape_c[] getManyGD_CTRsOnR28(Shape_c[] targets) {
		return getManyGD_CTRsOnR28(targets, null);
	}
	public static ContainingShape_c[] getManyGD_CTRsOnR28(Shape_c[] targets,
			boolean loadComponent) {
		return getManyGD_CTRsOnR28(targets, null, loadComponent);
	}
	public static ContainingShape_c[] getManyGD_CTRsOnR28(Shape_c[] targets,
			ClassQueryInterface_c test) {
		return getManyGD_CTRsOnR28(targets, test, true);
	}

	public static ContainingShape_c[] getManyGD_CTRsOnR28(Shape_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new ContainingShape_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(ContainingShape_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			ContainingShape_c source = (ContainingShape_c) targets[i].backPointer_IsSubtypeContainingShapeIsSubtype_R28;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			ContainingShape_c[] ret_set = new ContainingShape_c[matches.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new ContainingShape_c[0];
		}
	}

	public static ContainingShape_c[] getManyGD_CTRsOnR28(Shape_c target) {
		if (target != null) {
			Shape_c[] targetArray = new Shape_c[1];
			targetArray[0] = target;
			return getManyGD_CTRsOnR28(targetArray);
		} else {
			ContainingShape_c[] result = new ContainingShape_c[0];
			return result;
		}
	}

	public static ContainingShape_c[] getManyGD_CTRsOnR28(Shape_c target,
			boolean loadComponent) {
		if (target != null) {
			Shape_c[] targetArray = new Shape_c[1];
			targetArray[0] = target;
			return getManyGD_CTRsOnR28(targetArray, loadComponent);
		} else {
			ContainingShape_c[] result = new ContainingShape_c[0];
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

		// R28
		Shape_c relInst22347 = (Shape_c) baseRoot
				.getInstanceList(Shape_c.class).get(new Object[]{m_elementid});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst22347 == null) {
			relInst22347 = (Shape_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Shape_c.class)
					.get(new Object[]{m_elementid});
		}
		//synchronized
		if (relInst22347 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst22347) && !isProxy())) {
				relInst22347.relateAcrossR28To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R28
		// GD_SHP
		inst = IsSupertypeShape;
		unrelateAcrossR28From(IsSupertypeShape, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(ContainingShape_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final ContainingShape_c inst = (ContainingShape_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(ContainingShape_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static ContainingShape_c ContainingShapeInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		ContainingShape_c result = findContainingShapeInstance(modelRoot, test,
				loadComponent);
		return result;
	}
	private static ContainingShape_c findContainingShapeInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(ContainingShape_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ContainingShape_c x = (ContainingShape_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static ContainingShape_c ContainingShapeInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return ContainingShapeInstance(modelRoot, test, true);
	}

	public static ContainingShape_c ContainingShapeInstance(ModelRoot modelRoot) {
		return ContainingShapeInstance(modelRoot, null, true);
	}

	public static ContainingShape_c[] ContainingShapeInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(ContainingShape_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				ContainingShape_c x = (ContainingShape_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				ContainingShape_c[] ret_set = new ContainingShape_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new ContainingShape_c[0];
			}
		}
	}
	public static ContainingShape_c[] ContainingShapeInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return ContainingShapeInstances(modelRoot, test, true);
	}
	public static ContainingShape_c[] ContainingShapeInstances(
			ModelRoot modelRoot) {
		return ContainingShapeInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Containing Shape.dispose call: ";
		Shape_c testR28Inst2 = Shape_c.getOneGD_SHPOnR28(this, false);

		if (testR28Inst2 != null) {
			delete_error = true;
			errorMsg = errorMsg + "28 ";
		}
		if (delete_error == true) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log.println(ILogger.DELETE, "Containing Shape",
						errorMsg);
			} else {
				Exception e = new Exception();
				e.fillInStackTrace();
				CanvasPlugin.logError(errorMsg, e);
			}
		}
		return result;
	}

	// end declare instance pool

	// declare attribute accessors
	public boolean isUUID(String attributeName) {
		if (attributeName.equals("elementid")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getElementidLongBased() {
		if (IsSupertypeShape != null) {
			return IsSupertypeShape.getElementidLongBased();
		}
		return 0;
	}
	public java.util.UUID getElementid() {
		if (IsSupertypeShape != null) {
			return IsSupertypeShape.getElementid();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeShape != null);

	}

	public java.util.UUID getElementidCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_elementid))
			return m_elementid;
		else
			return getElementid();
	}

	public void setElementid(java.util.UUID newValue) {
		if (newValue != null) {
			if (newValue.equals(m_elementid)) {
				return;
			}
		} else if (m_elementid != null) {
			if (m_elementid.equals(newValue)) {
				return;
			}
		} else {
			return;
		}
		AttributeChangeModelDelta change = new AttributeChangeModelDelta(
				Modeleventnotification_c.DELTA_ATTRIBUTE_CHANGE, this,
				"Elementid", m_elementid, newValue, true);
		m_elementid = IdAssigner.preprocessUUID(newValue);
		Ooaofgraphics.getDefaultInstance().fireModelElementAttributeChanged(
				change);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log.println(ILogger.OPERATION, "Containing Shape", //$NON-NLS-1$
				" Operation entered: Containing Shape::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		ContainingShape_c[] objs = ContainingShape_c.ContainingShapeInstances(
				modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "Containing Shape", //$NON-NLS-1$
				" Operation entered: Containing Shape::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class ContainingShape_c_test22349_c implements ClassQueryInterface_c {
			ContainingShape_c_test22349_c(java.util.UUID p22350) {
				m_p22350 = p22350;
			}
			private java.util.UUID m_p22350;
			public boolean evaluate(Object candidate) {
				ContainingShape_c selected = (ContainingShape_c) candidate;
				boolean retval = false;
				retval = (selected.getElementid().equals(m_p22350));
				return retval;
			}
		}

		ContainingShape_c[] objs22348 = ContainingShape_c
				.ContainingShapeInstances(modelRoot,
						new ContainingShape_c_test22349_c(getElementid()));

		if (((objs22348.length) == 0)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(ILogger.CONSISTENCY,
								"Containing Shape", //$NON-NLS-1$
								"Consistency: Object: Containing Shape: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs22348.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin.logError(
						"Consistency: Object: Containing Shape: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs22348.length), e);
			}
			retval = false;

		}

		if (((objs22348.length) > 1)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(ILogger.CONSISTENCY,
								"Containing Shape", //$NON-NLS-1$
								"Consistency: Object: Containing Shape: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs22348.length)
										+ " elementId: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: Containing Shape: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs22348.length)
										+ " elementId: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Containing Shape is a subtype in association: rel.Numb = 28
		// The supertype class is: Shape
		class Shape_c_test22354_c implements ClassQueryInterface_c {
			Shape_c_test22354_c(java.util.UUID p22355) {
				m_p22355 = p22355;
			}
			private java.util.UUID m_p22355;
			public boolean evaluate(Object candidate) {
				Shape_c selected = (Shape_c) candidate;
				boolean retval = false;
				retval = (selected.getElementid().equals(m_p22355));
				return retval;
			}
		}

		Shape_c[] objs22353 = Shape_c.ShapeInstances(modelRoot,
				new Shape_c_test22354_c(getElementid()));

		if (((objs22353.length) != 1)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(ILogger.CONSISTENCY,
								"Containing Shape", //$NON-NLS-1$
								"Consistency: Object: Containing Shape: Association: 28: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs22353.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: Containing Shape: Association: 28: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs22353.length), e);
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Move(final int p_Xdelta, final int p_Ydelta) {
		Ooaofgraphics.log.println(ILogger.OPERATION, "Containing Shape",
				" Operation entered: ContainingShape::Move");
		final ModelRoot modelRoot = getModelRoot();
		Graphelement_c v_ge = Graphelement_c.getOneDIM_GEOnR301(Graphnode_c
				.getOneDIM_NDOnR19(Shape_c.getOneGD_SHPOnR28(this)));

		Diagramelement_c[] v_diag_elements = Diagramelement_c
				.getManyDIM_ELEsOnR307(v_ge);

		Diagramelement_c v_diag_element = null;
		for (int i21369 = 0; i21369 < v_diag_elements.length; i21369++) {
			v_diag_element = v_diag_elements[i21369];

			Shape_c v_containedShape = Shape_c.getOneGD_SHPOnR19(Graphnode_c
					.getOneDIM_NDOnR301(Graphelement_c
							.getOneDIM_GEOnR302(v_diag_element)));

			if (((v_containedShape != null))) {

				if (v_containedShape != null) {
					v_containedShape.Move(p_Xdelta, p_Ydelta);
				} else {
					Throwable t = new Throwable();
					t.fillInStackTrace();
					CorePlugin
							.logError(
									"Attempted to call an operation on a null instance.",
									t);
				}

			}

		}

	} // End move
	public boolean Isoveranypartof(final int p_X, final int p_Y) {
		Ooaofgraphics.log.println(ILogger.OPERATION, "Containing Shape",
				" Operation entered: ContainingShape::Isoveranypartof");
		final ModelRoot modelRoot = getModelRoot();
		Shape_c v_shape = Shape_c.getOneGD_SHPOnR28(this);

		Model_c v_canvas = Model_c.getOneGD_MDOnR1(GraphicalElement_c
				.getOneGD_GEOnR2(v_shape));

		Diagram_c v_diagram = Diagram_c.getOneDIM_DIAOnR18(v_canvas);

		Graphnode_c v_graphNode = Graphnode_c.getOneDIM_NDOnR19(v_shape);

		Graphelement_c v_graphElement = Graphelement_c
				.getOneDIM_GEOnR301(v_graphNode);

		float v_x = v_graphElement.getPositionx() - v_diagram.getViewportx();

		float v_y = v_graphElement.getPositiony() - v_diagram.getViewporty();

		float v_w = v_graphNode.getWidth();

		float v_h = v_graphNode.getHeight();

		if ((Gr_c.Scale(p_X) >= v_x && Gr_c.Scale(p_X) <= v_x + v_w)) {

			if ((Gr_c.Scale(p_Y) >= v_y && Gr_c.Scale(p_Y) <= v_y + v_h)) {

				return true;

			}

		}

		Connector_c[] v_connectors = Connector_c
				.getManyGD_CONsOnR20(Graphedge_c.getManyDIM_EDsOnR320(Graphconnector_c
						.getManyDIM_CONsOnR311(Graphelement_c
								.getManyDIM_GEsOnR301(Graphnode_c
										.getManyDIM_NDsOnR19(v_shape)))));

		Connector_c v_connector = null;
		for (int i21370 = 0; i21370 < v_connectors.length; i21370++) {
			v_connector = v_connectors[i21370];

			boolean v_result = v_connector.Isover(Gr_c.Scale(p_X),
					Gr_c.Scale(p_Y));

			if ((v_result)) {

				return true;

			}

		}

		v_connectors = Connector_c.getManyGD_CONsOnR20(Graphedge_c
				.getManyDIM_EDsOnR321(Graphconnector_c
						.getManyDIM_CONsOnR311(Graphelement_c
								.getManyDIM_GEsOnR301(Graphnode_c
										.getManyDIM_NDsOnR19(v_shape)))));

		for (int i21371 = 0; i21371 < v_connectors.length; i21371++) {
			v_connector = v_connectors[i21371];

			boolean v_result = v_connector.Isover(Gr_c.Scale(p_X),
					Gr_c.Scale(p_Y));

			if ((v_result)) {

				return true;

			}

		}

		return false;

	} // End isOverAnyPartOf
	public void Autoresize() {
		Ooaofgraphics.log.println(ILogger.OPERATION, "Containing Shape",
				" Operation entered: ContainingShape::Autoresize");
		final ModelRoot modelRoot = getModelRoot();
		Graphnode_c v_node = Graphnode_c.getOneDIM_NDOnR19(Shape_c
				.getOneGD_SHPOnR28(this));

		Graphelement_c v_graphEle = Graphelement_c.getOneDIM_GEOnR301(v_node);

		Diagramelement_c[] v_childEles = Diagramelement_c
				.getManyDIM_ELEsOnR307(v_graphEle);

		float v_X = v_graphEle.getPositionx();

		float v_Y = v_graphEle.getPositiony();

		float v_W = v_graphEle.getPositionx() + v_node.getWidth();

		float v_H = v_graphEle.getPositiony() + v_node.getHeight();

		int v_slack = 12;

		Diagramelement_c v_childEle = null;
		for (int i21372 = 0; i21372 < v_childEles.length; i21372++) {
			v_childEle = v_childEles[i21372];

			Graphelement_c v_dimEle = Graphelement_c
					.getOneDIM_GEOnR302(v_childEle);

			Graphnode_c v_childNode = Graphnode_c.getOneDIM_NDOnR301(v_dimEle);

			Graphedge_c v_childEdge = Graphedge_c.getOneDIM_EDOnR301(v_dimEle);

			ElementSpecification_c v_childSpec = ElementSpecification_c
					.getOneGD_ESOnR10(GraphicalElement_c
							.getOneGD_GEOnR23(v_dimEle));

			if ((!v_childSpec.getCauseautoresize())) {

				continue;

			}

			if (((v_childNode != null))) {

				if ((v_dimEle.getPositionx() < v_X)) {

					v_X = v_dimEle.getPositionx();

				}

				if ((v_dimEle.getPositiony() < v_Y)) {

					v_Y = v_dimEle.getPositiony();

				}

				if ((v_dimEle.getPositionx() + v_childNode.getWidth() > v_W)) {

					v_W = v_dimEle.getPositionx() + v_childNode.getWidth();

				}

				if ((v_dimEle.getPositiony() + v_childNode.getHeight() > v_H)) {

					v_H = v_dimEle.getPositiony() + v_childNode.getHeight();

				}

			}

			else if (((v_childEdge != null))) {

				Connector_c v_connector = Connector_c
						.getOneGD_CONOnR20(v_childEdge);

				LineSegment_c[] v_segments = LineSegment_c
						.getManyGD_LSsOnR6(v_connector);

				LineSegment_c v_segment = null;
				for (int i21373 = 0; i21373 < v_segments.length; i21373++) {
					v_segment = v_segments[i21373];

					Waypoint_c v_startWay = Waypoint_c
							.getOneDIM_WAYOnR21(v_segment);

					if ((v_startWay.getPositionx() < v_X)) {

						v_X = v_startWay.getPositionx();

					}

					if ((v_startWay.getPositiony() < v_Y)) {

						v_Y = v_startWay.getPositiony();

					}

					if ((v_startWay.getPositionx() > v_W)) {

						v_W = v_startWay.getPositionx();

					}

					if ((v_startWay.getPositiony() > v_H)) {

						v_H = v_startWay.getPositiony();

					}

					Waypoint_c v_endWay = Waypoint_c
							.getOneDIM_WAYOnR22(v_segment);

					if ((v_endWay.getPositionx() < v_X)) {

						v_X = v_endWay.getPositionx();

					}

					if ((v_endWay.getPositiony() < v_Y)) {

						v_Y = v_endWay.getPositiony();

					}

					if ((v_endWay.getPositionx() > v_W)) {

						v_W = v_endWay.getPositionx();

					}

					if ((v_endWay.getPositiony() > v_H)) {

						v_H = v_endWay.getPositiony();

					}

				}

			}

		}

		float v_originalX = v_graphEle.getPositionx();

		float v_originalY = v_graphEle.getPositiony();

		float v_originalH = v_node.getHeight();

		float v_originalW = v_node.getWidth();

		Shape_c v_shape = Shape_c.getOneGD_SHPOnR28(this);

		if ((v_X != v_originalX)) {

			if (v_graphEle != null) {
				v_graphEle.setPositionx(v_X - v_slack);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Attribute write attempted on null instance.", t);
			}

			if (v_node != null) {
				v_node.setWidth(v_node.getWidth() + v_originalX
						- v_graphEle.getPositionx());
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Attribute write attempted on null instance.", t);
			}

			if (v_shape != null) {
				v_shape.Moveconnectors(Vertex_c.NW, (int) (v_originalH),
						(int) (v_originalW), (int) (v_originalX),
						(int) (v_originalY),
						(int) (v_graphEle.getPositionx() - v_originalX), 0);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

		if ((v_Y != v_originalY)) {

			if (v_graphEle != null) {
				v_graphEle.setPositiony(v_Y - v_slack);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Attribute write attempted on null instance.", t);
			}

			if (v_node != null) {
				v_node.setHeight(v_node.getHeight() + v_originalY
						- v_graphEle.getPositiony());
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Attribute write attempted on null instance.", t);
			}

			if (v_shape != null) {
				v_shape.Moveconnectors(Vertex_c.NW, (int) (v_originalH),
						(int) (v_originalW), (int) (v_originalX),
						(int) (v_originalY), 0,
						(int) (v_graphEle.getPositiony() - v_originalY));
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

		if ((v_W != v_originalX + v_originalW)) {

			if (v_node != null) {
				v_node.setWidth(v_W - v_graphEle.getPositionx() + v_slack);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Attribute write attempted on null instance.", t);
			}

			if (v_shape != null) {
				v_shape.Moveconnectors(Vertex_c.SE, (int) (v_originalH),
						(int) (v_originalW), (int) (v_originalX),
						(int) (v_originalY),
						(int) (v_node.getWidth() - v_originalW), 0);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

		if ((v_H != v_originalY + v_originalH)) {

			if (v_node != null) {
				v_node.setHeight(v_H - v_graphEle.getPositiony() + v_slack);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin.logError(
						"Attribute write attempted on null instance.", t);
			}

			if (v_shape != null) {
				v_shape.Moveconnectors(Vertex_c.SE, (int) (v_originalH),
						(int) (v_originalW), (int) (v_originalX),
						(int) (v_originalY), 0,
						(int) (v_node.getHeight() - v_originalH));
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

	} // End autoResize
	public boolean Shapesizeintersectsinnerelements(final float p_X1,
			final float p_X2, final float p_Y1, final float p_Y2) {
		Ooaofgraphics.log
				.println(ILogger.OPERATION, "Containing Shape",
						" Operation entered: ContainingShape::Shapesizeintersectsinnerelements");
		final ModelRoot modelRoot = getModelRoot();
		Graphnode_c v_node = Graphnode_c.getOneDIM_NDOnR19(Shape_c
				.getOneGD_SHPOnR28(this));

		Graphelement_c v_graphEle = Graphelement_c.getOneDIM_GEOnR301(v_node);

		Diagramelement_c[] v_childEles = Diagramelement_c
				.getManyDIM_ELEsOnR307(v_graphEle);

		float v_X = p_X1;

		float v_Y = p_Y1;

		float v_W = p_X2;

		float v_H = p_Y2;

		Diagramelement_c v_childEle = null;
		for (int i21374 = 0; i21374 < v_childEles.length; i21374++) {
			v_childEle = v_childEles[i21374];

			Graphelement_c v_dimEle = Graphelement_c
					.getOneDIM_GEOnR302(v_childEle);

			Graphnode_c v_childNode = Graphnode_c.getOneDIM_NDOnR301(v_dimEle);

			Graphedge_c v_childEdge = Graphedge_c.getOneDIM_EDOnR301(v_dimEle);

			ElementSpecification_c v_childSpec = ElementSpecification_c
					.getOneGD_ESOnR10(GraphicalElement_c
							.getOneGD_GEOnR23(v_dimEle));

			if ((!v_childSpec.getCauseautoresize())) {

				continue;

			}

			if (((v_childNode != null))) {

				if ((v_dimEle.getPositionx() < v_X)) {

					return true;

				}

				if ((v_dimEle.getPositiony() < v_Y)) {

					return true;

				}

				if ((v_dimEle.getPositionx() + v_childNode.getWidth() > v_W)) {

					return true;

				}

				if ((v_dimEle.getPositiony() + v_childNode.getHeight() > v_H)) {

					return true;

				}

			}

			else if (((v_childEdge != null))) {

				Connector_c v_connector = Connector_c
						.getOneGD_CONOnR20(v_childEdge);

				LineSegment_c[] v_segments = LineSegment_c
						.getManyGD_LSsOnR6(v_connector);

				LineSegment_c v_segment = null;
				for (int i21375 = 0; i21375 < v_segments.length; i21375++) {
					v_segment = v_segments[i21375];

					Waypoint_c v_startWay = Waypoint_c
							.getOneDIM_WAYOnR21(v_segment);

					if ((v_startWay.getPositionx() < v_X)) {

						return true;

					}

					if ((v_startWay.getPositiony() < v_Y)) {

						return true;

					}

					if ((v_startWay.getPositionx() > v_W)) {

						return true;

					}

					if ((v_startWay.getPositiony() > v_H)) {

						return true;

					}

					Waypoint_c v_endWay = Waypoint_c
							.getOneDIM_WAYOnR22(v_segment);

					if ((v_endWay.getPositionx() < v_X)) {

						return true;

					}

					if ((v_endWay.getPositiony() < v_Y)) {

						return true;

					}

					if ((v_endWay.getPositionx() > v_W)) {

						return true;

					}

					if ((v_endWay.getPositiony() > v_H)) {

						return true;

					}

				}

			}

		}

		return false;

	} // End shapeSizeIntersectsInnerElements

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Containing Shape
