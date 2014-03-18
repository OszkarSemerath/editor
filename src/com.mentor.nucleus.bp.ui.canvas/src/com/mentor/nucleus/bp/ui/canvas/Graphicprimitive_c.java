package com.mentor.nucleus.bp.ui.canvas;
//====================================================================
//
// File:      com.mentor.nucleus.bp.ui.canvas.Graphicprimitive_c.java
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
import com.mentor.nucleus.bp.core.common.*;
abstract class EV_GRAPHICPRIMITIVE extends genericEvent_c {
	public abstract int getEvtcode();
}

public class Graphicprimitive_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public Graphicprimitive_c(ModelRoot modelRoot, java.util.UUID p_m_elementid) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_elementid = IdAssigner.preprocessUUID(p_m_elementid);

		Object[] key = {m_elementid};
		addInstanceToMap(key);
	}
	static public Graphicprimitive_c createProxy(ModelRoot modelRoot,
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
				.getInstanceList(Graphicprimitive_c.class);
		Graphicprimitive_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_elementid};
			new_inst = (Graphicprimitive_c) instances.get(key);
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
			new_inst = new Graphicprimitive_c(modelRoot, p_m_elementid);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public Graphicprimitive_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_elementid) {
		InstanceList instances = modelRoot
				.getInstanceList(Graphicprimitive_c.class);
		Graphicprimitive_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_elementid};
			source = (Graphicprimitive_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_elementid = IdAssigner.preprocessUUID(p_m_elementid);

				return source;
			}
		}
		// there is no instance matching the id
		Graphicprimitive_c new_inst = new Graphicprimitive_c(modelRoot,
				p_m_elementid);
		return new_inst;
	}
	public Graphicprimitive_c(ModelRoot modelRoot) {
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
		if (!(elem instanceof Graphicprimitive_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof Graphicprimitive_c)) {
			return false;
		}

		Graphicprimitive_c me = (Graphicprimitive_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getElementid()) || IdAssigner.NULL_UUID
				.equals(((Graphicprimitive_c) elem).getElementid()))
				&& this != elem) {
			return false;
		}
		if (!getElementid().equals(((Graphicprimitive_c) elem).getElementid()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof Graphicprimitive_c)) {
			return false;
		}

		Graphicprimitive_c me = (Graphicprimitive_c) elem;
		if (!getElementidCachedValue().equals(
				((Graphicprimitive_c) elem).getElementidCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_elementid;

	// declare association references from this class

	// referring navigation

	Leafelement_c IsSupertypeLeafelement;
	public void relateAcrossR305To(Leafelement_c target) {
		relateAcrossR305To(target, true);
	}
	public void relateAcrossR305To(Leafelement_c target, boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeLeafelement)
			return; // already related

		if (IsSupertypeLeafelement != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeLeafelement != null) {

				IsSupertypeLeafelement.clearBackPointerR305To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofgraphics.log
							.println(
									ILogger.CONSISTENCY,
									"Graphicprimitive_c.relateAcrossR305To(Leafelement_c target)",
									"Relate performed across R305 from GraphicPrimitive to LeafElement without unrelate of prior instance.");
				}
			}

			IsSupertypeLeafelement = target;
			if (IdAssigner.NULL_UUID.equals(target.getElementid())) {
				// do not update cached value
			} else {
				// update cached value
				m_elementid = target.getElementidCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR305To(this);
			target.addRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_RELATED, this,
						target, "305", "");
				Ooaofgraphics.getDefaultInstance()
						.fireModelElementRelationChanged(change);
			}
		}
	}
	public void unrelateAcrossR305From(Leafelement_c target) {
		unrelateAcrossR305From(target, true);
	}
	public void unrelateAcrossR305From(Leafelement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeLeafelement == null)
			return; // already unrelated

		if (target != IsSupertypeLeafelement) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CanvasPlugin.logError(
					"Tried to unrelate from non-related instance across R305",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR305To(this);
		}

		if (IsSupertypeLeafelement != null) {

			m_elementid = IsSupertypeLeafelement.getElementid();
			if (IdAssigner.NULL_UUID.equals(m_elementid)) {
				m_elementid = IsSupertypeLeafelement.getElementidCachedValue();
			}
			IsSupertypeLeafelement = null;
			target.removeRef();
			if (notifyChanges) {
				RelationshipChangeModelDelta change = new RelationshipChangeModelDelta(
						Modeleventnotification_c.DELTA_ELEMENT_UNRELATED, this,
						target, "305", "");
				Ooaofgraphics.getDefaultInstance()
						.fireModelElementRelationChanged(change);
			}
		}
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR305(Leafelement_c[] targets) {
		return getOneDIM_GRPOnR305(targets, null);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR305(
			Leafelement_c[] targets, ClassQueryInterface_c test) {
		Graphicprimitive_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneDIM_GRPOnR305(targets[i], test);
			}
		}

		return ret_val;
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR305(Leafelement_c target) {
		return getOneDIM_GRPOnR305(target, null);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR305(Leafelement_c target,
			boolean loadComponent) {
		return getOneDIM_GRPOnR305(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR305(Leafelement_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			return getOneDIM_GRPOnR305(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR305(ModelRoot modelRoot,
			Leafelement_c target, ClassQueryInterface_c test) {
		return getOneDIM_GRPOnR305(modelRoot, target, test, true);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR305(ModelRoot modelRoot,
			Leafelement_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneDIM_GRPOnR305(modelRoot, target, test);
	}
	private static Graphicprimitive_c find_getOneDIM_GRPOnR305(
			ModelRoot modelRoot, Leafelement_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			Graphicprimitive_c source = (Graphicprimitive_c) target.backPointer_IsSubtypeGraphicprimitiveIsSubtype_R305;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR305(
			Leafelement_c[] targets) {
		return getManyDIM_GRPsOnR305(targets, null);
	}
	public static Graphicprimitive_c[] getManyDIM_GRPsOnR305(
			Leafelement_c[] targets, boolean loadComponent) {
		return getManyDIM_GRPsOnR305(targets, null, loadComponent);
	}
	public static Graphicprimitive_c[] getManyDIM_GRPsOnR305(
			Leafelement_c[] targets, ClassQueryInterface_c test) {
		return getManyDIM_GRPsOnR305(targets, test, true);
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR305(
			Leafelement_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new Graphicprimitive_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(Graphicprimitive_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			Graphicprimitive_c source = (Graphicprimitive_c) targets[i].backPointer_IsSubtypeGraphicprimitiveIsSubtype_R305;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			Graphicprimitive_c[] ret_set = new Graphicprimitive_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new Graphicprimitive_c[0];
		}
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR305(
			Leafelement_c target) {
		if (target != null) {
			Leafelement_c[] targetArray = new Leafelement_c[1];
			targetArray[0] = target;
			return getManyDIM_GRPsOnR305(targetArray);
		} else {
			Graphicprimitive_c[] result = new Graphicprimitive_c[0];
			return result;
		}
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR305(
			Leafelement_c target, boolean loadComponent) {
		if (target != null) {
			Leafelement_c[] targetArray = new Leafelement_c[1];
			targetArray[0] = target;
			return getManyDIM_GRPsOnR305(targetArray, loadComponent);
		} else {
			Graphicprimitive_c[] result = new Graphicprimitive_c[0];
			return result;
		}
	}

	// declare associations referring to this class

	// referred to navigation

	Polyline_c backPointer_IsSubtypePolylineIsSubtype_R306;

	public void setPolylineOrderInChildListR306(Polyline_c target, int index) {
		unrelateAcrossR306From(target);
		Polyline_c[] elements = Polyline_c.getManyDIM_PLNsOnR306(this);
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (count >= index) {
				unrelateAcrossR306From((Polyline_c) elements[i]);
			}
			count++;
		}
		relateAcrossR306To(target);
		count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (count >= index) {
				relateAcrossR306To((Polyline_c) elements[i]);
			}
			count++;
		}
	}

	public void relateAcrossR306To(Polyline_c target) {
		if (target != null) {
			target.relateAcrossR306To(this, true);
		}
	}

	public void relateAcrossR306To(Polyline_c target, boolean notifyChanges) {
		if (target != null) {
			target.relateAcrossR306To(this, notifyChanges);
		}
	}

	public void setBackPointerR306To(Polyline_c target) {
		backPointer_IsSubtypePolylineIsSubtype_R306 = target;
	}

	public void unrelateAcrossR306From(Polyline_c target) {
		if (target != null) {
			target.unrelateAcrossR306From(this, true);
		}
	}

	public void unrelateAcrossR306From(Polyline_c target, boolean notifyChanges) {
		if (target != null) {
			target.unrelateAcrossR306From(this, notifyChanges);
		}
	}

	public void clearBackPointerR306To(Polyline_c target) {
		if (target == backPointer_IsSubtypePolylineIsSubtype_R306) {
			backPointer_IsSubtypePolylineIsSubtype_R306 = null;
		}
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Polyline_c[] targets) {
		return getOneDIM_GRPOnR306(targets, null);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Polyline_c[] targets,
			ClassQueryInterface_c test) {
		return getOneDIM_GRPOnR306(targets, test, true);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Polyline_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {
		Graphicprimitive_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				if (test != null) {
					Graphicprimitive_c candidate_val = getOneDIM_GRPOnR306(
							targets[i], true);
					if (candidate_val != null && test.evaluate(candidate_val)) {
						ret_val = candidate_val;
						break;
					}
				} else {
					ret_val = getOneDIM_GRPOnR306(targets[i], loadComponent);
					if (ret_val != null) {
						break;
					}
				}
			}
		}
		return ret_val;
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Polyline_c target) {
		return getOneDIM_GRPOnR306(target, true);
	}
	public static Graphicprimitive_c getOneDIM_GRPOnR306(Polyline_c target,
			boolean loadComponent) {
		if (target != null) {
			if (loadComponent) {
				target.loadProxy();
			}
			return target.IsSupertypeGraphicprimitive;
		} else {
			return null;
		}
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(
			Polyline_c[] targets, ClassQueryInterface_c test) {
		return getManyDIM_GRPsOnR306(targets, test, true);
	}

	public static Graphicprimitive_c [] getManyDIM_GRPsOnR306(Polyline_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new Graphicprimitive_c[0];
  
  
  LinkedHashSet<Graphicprimitive_c> elementsSet = new LinkedHashSet<Graphicprimitive_c>();
  for (int i = 0; i < targets.length; i++) {
	if(loadComponent && targets[i] != null && targets[i].IsSupertypeGraphicprimitive == null)
	  targets[i].loadProxy();
    Graphicprimitive_c associate = targets[i].IsSupertypeGraphicprimitive;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
            }
    }
  }

  Graphicprimitive_c[] result = new Graphicprimitive_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}
	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(
			Polyline_c[] targets) {
		return getManyDIM_GRPsOnR306(targets, null);
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Polyline_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (target != null) {
			Polyline_c[] targetArray = new Polyline_c[1];
			targetArray[0] = target;
			return getManyDIM_GRPsOnR306(targetArray, test, loadComponent);
		} else {
			Graphicprimitive_c[] result = new Graphicprimitive_c[0];
			return result;
		}

	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Polyline_c target,
			ClassQueryInterface_c test) {
		return getManyDIM_GRPsOnR306(target, null, true);
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Polyline_c target) {
		return getManyDIM_GRPsOnR306(target, null, true);
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Polyline_c target,
			boolean loadComponent) {
		return getManyDIM_GRPsOnR306(target, null, loadComponent);
	}

	// referred to navigation

	Ellipse_c backPointer_IsSubtypeEllipseIsSubtype_R306;

	public void setEllipseOrderInChildListR306(Ellipse_c target, int index) {
		unrelateAcrossR306From(target);
		Ellipse_c[] elements = Ellipse_c.getManyDIM_ELPsOnR306(this);
		int count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (count >= index) {
				unrelateAcrossR306From((Ellipse_c) elements[i]);
			}
			count++;
		}
		relateAcrossR306To(target);
		count = 0;
		for (int i = 0; i < elements.length; i++) {
			if (count >= index) {
				relateAcrossR306To((Ellipse_c) elements[i]);
			}
			count++;
		}
	}

	public void relateAcrossR306To(Ellipse_c target) {
		if (target != null) {
			target.relateAcrossR306To(this, true);
		}
	}

	public void relateAcrossR306To(Ellipse_c target, boolean notifyChanges) {
		if (target != null) {
			target.relateAcrossR306To(this, notifyChanges);
		}
	}

	public void setBackPointerR306To(Ellipse_c target) {
		backPointer_IsSubtypeEllipseIsSubtype_R306 = target;
	}

	public void unrelateAcrossR306From(Ellipse_c target) {
		if (target != null) {
			target.unrelateAcrossR306From(this, true);
		}
	}

	public void unrelateAcrossR306From(Ellipse_c target, boolean notifyChanges) {
		if (target != null) {
			target.unrelateAcrossR306From(this, notifyChanges);
		}
	}

	public void clearBackPointerR306To(Ellipse_c target) {
		if (target == backPointer_IsSubtypeEllipseIsSubtype_R306) {
			backPointer_IsSubtypeEllipseIsSubtype_R306 = null;
		}
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Ellipse_c[] targets) {
		return getOneDIM_GRPOnR306(targets, null);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Ellipse_c[] targets,
			ClassQueryInterface_c test) {
		return getOneDIM_GRPOnR306(targets, test, true);
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Ellipse_c[] targets,
			ClassQueryInterface_c test, boolean loadComponent) {
		Graphicprimitive_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				if (test != null) {
					Graphicprimitive_c candidate_val = getOneDIM_GRPOnR306(
							targets[i], true);
					if (candidate_val != null && test.evaluate(candidate_val)) {
						ret_val = candidate_val;
						break;
					}
				} else {
					ret_val = getOneDIM_GRPOnR306(targets[i], loadComponent);
					if (ret_val != null) {
						break;
					}
				}
			}
		}
		return ret_val;
	}

	public static Graphicprimitive_c getOneDIM_GRPOnR306(Ellipse_c target) {
		return getOneDIM_GRPOnR306(target, true);
	}
	public static Graphicprimitive_c getOneDIM_GRPOnR306(Ellipse_c target,
			boolean loadComponent) {
		if (target != null) {
			if (loadComponent) {
				target.loadProxy();
			}
			return target.IsSupertypeGraphicprimitive;
		} else {
			return null;
		}
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(
			Ellipse_c[] targets, ClassQueryInterface_c test) {
		return getManyDIM_GRPsOnR306(targets, test, true);
	}

	public static Graphicprimitive_c [] getManyDIM_GRPsOnR306(Ellipse_c [] targets,
    ClassQueryInterface_c test, boolean loadComponent)
{
  if(targets == null || targets.length == 0 || targets[0] == null)
    return new Graphicprimitive_c[0];
  
  
  LinkedHashSet<Graphicprimitive_c> elementsSet = new LinkedHashSet<Graphicprimitive_c>();
  for (int i = 0; i < targets.length; i++) {
	if(loadComponent && targets[i] != null && targets[i].IsSupertypeGraphicprimitive == null)
	  targets[i].loadProxy();
    Graphicprimitive_c associate = targets[i].IsSupertypeGraphicprimitive;
    if (targets[i] != null && associate != null
    	&& (test == null || test.evaluate(associate))) {
        	if (elementsSet.add(associate)){ 
            }
    }
  }

  Graphicprimitive_c[] result = new Graphicprimitive_c[elementsSet.size()];
  elementsSet.toArray(result);
  return result;
}
	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Ellipse_c[] targets) {
		return getManyDIM_GRPsOnR306(targets, null);
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Ellipse_c target,
			ClassQueryInterface_c test, boolean loadComponent) {
		if (target != null) {
			Ellipse_c[] targetArray = new Ellipse_c[1];
			targetArray[0] = target;
			return getManyDIM_GRPsOnR306(targetArray, test, loadComponent);
		} else {
			Graphicprimitive_c[] result = new Graphicprimitive_c[0];
			return result;
		}

	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Ellipse_c target,
			ClassQueryInterface_c test) {
		return getManyDIM_GRPsOnR306(target, null, true);
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Ellipse_c target) {
		return getManyDIM_GRPsOnR306(target, null, true);
	}

	public static Graphicprimitive_c[] getManyDIM_GRPsOnR306(Ellipse_c target,
			boolean loadComponent) {
		return getManyDIM_GRPsOnR306(target, null, loadComponent);
	}

	public void batchRelate(ModelRoot modelRoot, boolean notifyChanges,
			boolean searchAllRoots) {
		batchRelate(modelRoot, false, notifyChanges, searchAllRoots);
	}

	public void batchRelate(ModelRoot modelRoot, boolean relateProxies,
			boolean notifyChanges, boolean searchAllRoots) {
		InstanceList instances = null;
		ModelRoot baseRoot = modelRoot;

		// R305
		Leafelement_c relInst21787 = (Leafelement_c) baseRoot.getInstanceList(
				Leafelement_c.class).get(new Object[]{m_elementid});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst21787 == null) {
			relInst21787 = (Leafelement_c) Ooaofooa.getDefaultInstance()
					.getInstanceList(Leafelement_c.class)
					.get(new Object[]{m_elementid});
		}
		//synchronized
		if (relInst21787 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst21787) && !isProxy())) {
				relInst21787.relateAcrossR305To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R305
		// DIM_LEL
		inst = IsSupertypeLeafelement;
		unrelateAcrossR305From(IsSupertypeLeafelement, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(Graphicprimitive_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final Graphicprimitive_c inst = (Graphicprimitive_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(Graphicprimitive_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static Graphicprimitive_c GraphicprimitiveInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		Graphicprimitive_c result = findGraphicprimitiveInstance(modelRoot,
				test, loadComponent);
		return result;
	}
	private static Graphicprimitive_c findGraphicprimitiveInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(Graphicprimitive_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				Graphicprimitive_c x = (Graphicprimitive_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static Graphicprimitive_c GraphicprimitiveInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return GraphicprimitiveInstance(modelRoot, test, true);
	}

	public static Graphicprimitive_c GraphicprimitiveInstance(
			ModelRoot modelRoot) {
		return GraphicprimitiveInstance(modelRoot, null, true);
	}

	public static Graphicprimitive_c[] GraphicprimitiveInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(Graphicprimitive_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				Graphicprimitive_c x = (Graphicprimitive_c) instances.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				Graphicprimitive_c[] ret_set = new Graphicprimitive_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new Graphicprimitive_c[0];
			}
		}
	}
	public static Graphicprimitive_c[] GraphicprimitiveInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return GraphicprimitiveInstances(modelRoot, test, true);
	}
	public static Graphicprimitive_c[] GraphicprimitiveInstances(
			ModelRoot modelRoot) {
		return GraphicprimitiveInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the GraphicPrimitive.dispose call: ";
		Leafelement_c testR305Inst3 = Leafelement_c.getOneDIM_LELOnR305(this,
				false);

		if (testR305Inst3 != null) {
			delete_error = true;
			errorMsg = errorMsg + "305 ";
		}
		Polyline_c testR306Inst1 = Polyline_c.getOneDIM_PLNOnR306(this, false);

		if (testR306Inst1 != null) {
			delete_error = true;
			errorMsg = errorMsg + "306 ";
		}
		Ellipse_c testR306Inst2 = Ellipse_c.getOneDIM_ELPOnR306(this, false);

		if (testR306Inst2 != null) {
			delete_error = true;
			errorMsg = errorMsg + "306 ";
		}
		if (delete_error == true) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log.println(ILogger.DELETE, "GraphicPrimitive",
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
		if (IsSupertypeLeafelement != null) {
			return IsSupertypeLeafelement.getElementidLongBased();
		}
		return 0;
	}
	public java.util.UUID getElementid() {
		if (IsSupertypeLeafelement != null) {
			return IsSupertypeLeafelement.getElementid();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeLeafelement != null);

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
		Ooaofooa.log.println(ILogger.OPERATION, "GraphicPrimitive", //$NON-NLS-1$
				" Operation entered: GraphicPrimitive::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		Graphicprimitive_c[] objs = Graphicprimitive_c
				.GraphicprimitiveInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log.println(ILogger.OPERATION, "GraphicPrimitive", //$NON-NLS-1$
				" Operation entered: GraphicPrimitive::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class Graphicprimitive_c_test21789_c implements ClassQueryInterface_c {
			Graphicprimitive_c_test21789_c(java.util.UUID p21790) {
				m_p21790 = p21790;
			}
			private java.util.UUID m_p21790;
			public boolean evaluate(Object candidate) {
				Graphicprimitive_c selected = (Graphicprimitive_c) candidate;
				boolean retval = false;
				retval = (selected.getElementid().equals(m_p21790));
				return retval;
			}
		}

		Graphicprimitive_c[] objs21788 = Graphicprimitive_c
				.GraphicprimitiveInstances(modelRoot,
						new Graphicprimitive_c_test21789_c(getElementid()));

		if (((objs21788.length) == 0)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(ILogger.CONSISTENCY,
								"GraphicPrimitive", //$NON-NLS-1$
								"Consistency: Object: GraphicPrimitive: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs21788.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin.logError(
						"Consistency: Object: GraphicPrimitive: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
								+ "Actual Value: " //$NON-NLS-1$
								+ Integer.toString(objs21788.length), e);
			}
			retval = false;

		}

		if (((objs21788.length) > 1)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(ILogger.CONSISTENCY,
								"GraphicPrimitive", //$NON-NLS-1$
								"Consistency: Object: GraphicPrimitive: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs21788.length)
										+ " elementId: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: GraphicPrimitive: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs21788.length)
										+ " elementId: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// GraphicPrimitive is a subtype in association: rel.Numb = 305
		// The supertype class is: LeafElement
		class Leafelement_c_test21794_c implements ClassQueryInterface_c {
			Leafelement_c_test21794_c(java.util.UUID p21795) {
				m_p21795 = p21795;
			}
			private java.util.UUID m_p21795;
			public boolean evaluate(Object candidate) {
				Leafelement_c selected = (Leafelement_c) candidate;
				boolean retval = false;
				retval = (selected.getElementid().equals(m_p21795));
				return retval;
			}
		}

		Leafelement_c[] objs21793 = Leafelement_c.LeafelementInstances(
				modelRoot, new Leafelement_c_test21794_c(getElementid()));

		if (((objs21793.length) != 1)) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(ILogger.CONSISTENCY,
								"GraphicPrimitive", //$NON-NLS-1$
								"Consistency: Object: GraphicPrimitive: Association: 305: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs21793.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: GraphicPrimitive: Association: 305: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs21793.length), e);
			}
			retval = false;

		}

		// Supertype: rel.Numb = 306
		int objs21796 = 0;
		// Subtype Object: PolyLine
		class Polyline_c_test21797_c implements ClassQueryInterface_c {
			Polyline_c_test21797_c(java.util.UUID p21798) {
				m_p21798 = p21798;
			}
			private java.util.UUID m_p21798;
			public boolean evaluate(Object candidate) {
				Polyline_c selected = (Polyline_c) candidate;
				boolean retval = false;
				retval = (selected.getElementid().equals(m_p21798));
				return retval;
			}
		}

		Polyline_c[] objs21799 = Polyline_c.PolylineInstances(modelRoot,
				new Polyline_c_test21797_c(getElementid()));

		objs21796 = objs21796 + objs21799.length;
		// Subtype Object: Ellipse
		class Ellipse_c_test21800_c implements ClassQueryInterface_c {
			Ellipse_c_test21800_c(java.util.UUID p21801) {
				m_p21801 = p21801;
			}
			private java.util.UUID m_p21801;
			public boolean evaluate(Object candidate) {
				Ellipse_c selected = (Ellipse_c) candidate;
				boolean retval = false;
				retval = (selected.getElementid().equals(m_p21801));
				return retval;
			}
		}

		Ellipse_c[] objs21802 = Ellipse_c.EllipseInstances(modelRoot,
				new Ellipse_c_test21800_c(getElementid()));

		objs21796 = objs21796 + objs21802.length;
		if (objs21796 != 1) {

			if (CanvasPlugin.getDefault().isDebugging()) {
				Ooaofgraphics.log
						.println(ILogger.CONSISTENCY,
								"GraphicPrimitive", //$NON-NLS-1$
								"Consistency: Object: GraphicPrimitive: Association: 306: Cardinality of subtype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs21796)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CanvasPlugin
						.logError(
								"Consistency: Object: GraphicPrimitive: Association: 306: Cardinality of subtype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs21796), e);
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofgraphics.log.println(ILogger.OPERATION, "GraphicPrimitive",
				" Operation entered: Graphicprimitive::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		Leafelement_c v_le = Leafelement_c.getOneDIM_LELOnR305(this);

		if (((v_le != null))) {

			if (v_le != null) {
				v_le.Dispose();
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

		else {

			Polyline_c v_pl = Polyline_c.getOneDIM_PLNOnR306(this);

			if (((v_pl != null))) {

				this.unrelateAcrossR306From(v_pl);

				if (v_pl != null) {
					v_pl.Dispose();
				} else {
					Throwable t = new Throwable();
					t.fillInStackTrace();
					CorePlugin
							.logError(
									"Attempted to call an operation on a null instance.",
									t);
				}

			}

			Ellipse_c v_elp = Ellipse_c.getOneDIM_ELPOnR306(this);

			if (((v_elp != null))) {

				this.unrelateAcrossR306From(v_elp);

				if (v_elp != null) {
					v_elp.Dispose();
				} else {
					Throwable t = new Throwable();
					t.fillInStackTrace();
					CorePlugin
							.logError(
									"Attempted to call an operation on a null instance.",
									t);
				}

			}

			if (delete()) {
				Ooaofgraphics.getDefaultInstance().fireModelElementDeleted(
						new BaseModelDelta(
								Modeleventnotification_c.DELTA_DELETE, this));
			}

		}

	} // End dispose

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end GraphicPrimitive
