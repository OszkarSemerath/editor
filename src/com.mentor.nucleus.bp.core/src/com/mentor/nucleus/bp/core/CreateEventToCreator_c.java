package com.mentor.nucleus.bp.core;
//====================================================================
//
// File:      com.mentor.nucleus.bp.core.CreateEventToCreator_c.java
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
abstract class EV_CREATE_EVENT_TO_CREATOR extends genericEvent_c {
	public abstract int getEvtcode();
}

public class CreateEventToCreator_c extends NonRootModelElement
		implements
			IAdaptable,
			Cloneable {
	// Public Constructors
	public CreateEventToCreator_c(ModelRoot modelRoot,
			java.util.UUID p_m_statement_id) {
		super(modelRoot);
		//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
		m_statement_id = IdAssigner.preprocessUUID(p_m_statement_id);

		Object[] key = {m_statement_id};
		addInstanceToMap(key);
	}
	static public CreateEventToCreator_c createProxy(ModelRoot modelRoot,
			java.util.UUID p_m_statement_id, String p_contentPath,
			IPath p_localPath) {
		ModelRoot resolvedModelRoot = ModelRoot.findModelRoot(modelRoot,
				p_contentPath, p_localPath);
		// if a model root was not resolved it is most likely
		// due to a missing file of the proxy, defualt back to
		// the original model root
		if (resolvedModelRoot != null)
			modelRoot = resolvedModelRoot;
		InstanceList instances = modelRoot
				.getInstanceList(CreateEventToCreator_c.class);
		CreateEventToCreator_c new_inst = null;
		synchronized (instances) {
			Object[] key = {p_m_statement_id};
			new_inst = (CreateEventToCreator_c) instances.get(key);
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
				new_inst.m_statement_id = IdAssigner
						.preprocessUUID(p_m_statement_id);

			}
		}
		if (new_inst == null) {
			// there is no instance matching the id, create a proxy
			// if the resource doesn't exist then this will be a dangling reference
			new_inst = new CreateEventToCreator_c(modelRoot, p_m_statement_id);
			new_inst.m_contentPath = contentPath;
		}
		return new_inst;
	}

	static public CreateEventToCreator_c resolveInstance(ModelRoot modelRoot,
			java.util.UUID p_m_statement_id) {
		InstanceList instances = modelRoot
				.getInstanceList(CreateEventToCreator_c.class);
		CreateEventToCreator_c source = null;
		synchronized (instances) {
			Object[] key = {p_m_statement_id};
			source = (CreateEventToCreator_c) instances.get(key);
			if (source != null && !modelRoot.isCompareRoot()) {
				source.convertFromProxy();
				source.batchUnrelate();
				//pre-process the uuid so that we re-use null uuid instance rather then creating a new one.           
				source.m_statement_id = IdAssigner
						.preprocessUUID(p_m_statement_id);

				return source;
			}
		}
		// there is no instance matching the id
		CreateEventToCreator_c new_inst = new CreateEventToCreator_c(modelRoot,
				p_m_statement_id);
		return new_inst;
	}
	public CreateEventToCreator_c(ModelRoot modelRoot) {
		super(modelRoot);
		m_statement_id = IdAssigner.NULL_UUID;
		Object[] key = {m_statement_id};
		addInstanceToMap(key);
	}

	public Object getInstanceKey() {
		Object[] key = {m_statement_id};
		return key;
	}

	public boolean setInstanceKey(UUID p_newKey) {

		boolean changed = false;
		// round p1
		// round p2
		// round p3
		// round p4
		// round p5
		if (m_statement_id != p_newKey) {

			m_statement_id = p_newKey;
			changed = true;
		}
		return changed;
	}

	public boolean equals(Object elem) {
		if (!(elem instanceof CreateEventToCreator_c)) {
			return false;
		}
		// check that the model-roots are the same
		if (((NonRootModelElement) elem).getModelRoot() != getModelRoot()) {
			return false;
		}

		return identityEquals(elem);
	}

	public boolean identityEquals(Object elem) {
		if (!(elem instanceof CreateEventToCreator_c)) {
			return false;
		}

		CreateEventToCreator_c me = (CreateEventToCreator_c) elem;
		// don't allow an empty id-value to produce a false positive result;
		// in this case, use whether the two instances are actually the same 
		// one in memory, instead
		if ((IdAssigner.NULL_UUID.equals(getStatement_id()) || IdAssigner.NULL_UUID
				.equals(((CreateEventToCreator_c) elem).getStatement_id()))
				&& this != elem) {
			return false;
		}
		if (!getStatement_id().equals(
				((CreateEventToCreator_c) elem).getStatement_id()))
			return false;
		return true;
	}

	public boolean cachedIdentityEquals(Object elem) {
		if (!(elem instanceof CreateEventToCreator_c)) {
			return false;
		}

		CreateEventToCreator_c me = (CreateEventToCreator_c) elem;
		if (!getStatement_idCachedValue().equals(
				((CreateEventToCreator_c) elem).getStatement_idCachedValue()))
			return false;
		return true;
	}

	// Attributes
	private java.util.UUID m_statement_id;

	// declare association references from this class

	// referring navigation

	CreateSmEventStatement_c IsSupertypeCreateSmEventStatement;
	public void relateAcrossR704To(CreateSmEventStatement_c target) {
		relateAcrossR704To(target, true);
	}
	public void relateAcrossR704To(CreateSmEventStatement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (target == IsSupertypeCreateSmEventStatement)
			return; // already related

		if (IsSupertypeCreateSmEventStatement != target) {

			Object oldKey = getInstanceKey();

			if (IsSupertypeCreateSmEventStatement != null) {

				IsSupertypeCreateSmEventStatement.clearBackPointerR704To(this);

				if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == true) { //$NON-NLS-1$
					Ooaofooa.log
							.println(
									ILogger.CONSISTENCY,
									"CreateEventToCreator_c.relateAcrossR704To(CreateSmEventStatement_c target)",
									"Relate performed across R704 from Create Event to Creator to Create SM Event Statement without unrelate of prior instance.");
				}
			}

			IsSupertypeCreateSmEventStatement = target;
			if (IdAssigner.NULL_UUID.equals(target.getStatement_id())) {
				// do not update cached value
			} else {
				// update cached value
				m_statement_id = target.getStatement_idCachedValue();
			}
			updateInstanceKey(oldKey, getInstanceKey());
			target.setBackPointerR704To(this);
			target.addRef();
		}
	}
	public void unrelateAcrossR704From(CreateSmEventStatement_c target) {
		unrelateAcrossR704From(target, true);
	}
	public void unrelateAcrossR704From(CreateSmEventStatement_c target,
			boolean notifyChanges) {
		if (target == null)
			return;

		if (IsSupertypeCreateSmEventStatement == null)
			return; // already unrelated

		if (target != IsSupertypeCreateSmEventStatement) {
			Exception e = new Exception();
			e.fillInStackTrace();
			CorePlugin.logError(
					"Tried to unrelate from non-related instance across R704",
					e);
			return;
		}

		if (target != null) {
			target.clearBackPointerR704To(this);
		}

		if (IsSupertypeCreateSmEventStatement != null) {

			m_statement_id = IsSupertypeCreateSmEventStatement
					.getStatement_id();
			if (IdAssigner.NULL_UUID.equals(m_statement_id)) {
				m_statement_id = IsSupertypeCreateSmEventStatement
						.getStatement_idCachedValue();
			}
			IsSupertypeCreateSmEventStatement = null;
			target.removeRef();
		}
	}

	public static CreateEventToCreator_c getOneE_CECOnR704(
			CreateSmEventStatement_c[] targets) {
		return getOneE_CECOnR704(targets, null);
	}

	public static CreateEventToCreator_c getOneE_CECOnR704(
			CreateSmEventStatement_c[] targets, ClassQueryInterface_c test) {
		CreateEventToCreator_c ret_val = null;
		if (targets != null) {
			for (int i = 0; i < targets.length && ret_val == null; ++i) {
				ret_val = getOneE_CECOnR704(targets[i], test);
			}
		}

		return ret_val;
	}

	public static CreateEventToCreator_c getOneE_CECOnR704(
			CreateSmEventStatement_c target) {
		return getOneE_CECOnR704(target, null);
	}

	public static CreateEventToCreator_c getOneE_CECOnR704(
			CreateSmEventStatement_c target, boolean loadComponent) {
		return getOneE_CECOnR704(target.getModelRoot(), target, null,
				loadComponent);
	}

	public static CreateEventToCreator_c getOneE_CECOnR704(
			CreateSmEventStatement_c target, ClassQueryInterface_c test) {
		if (target != null) {
			return getOneE_CECOnR704(target.getModelRoot(), target, test);
		}
		return null;
	}

	public static CreateEventToCreator_c getOneE_CECOnR704(ModelRoot modelRoot,
			CreateSmEventStatement_c target, ClassQueryInterface_c test) {
		return getOneE_CECOnR704(modelRoot, target, test, true);
	}

	public static CreateEventToCreator_c getOneE_CECOnR704(ModelRoot modelRoot,
			CreateSmEventStatement_c target, ClassQueryInterface_c test,
			boolean loadComponent) {
		return find_getOneE_CECOnR704(modelRoot, target, test);
	}
	private static CreateEventToCreator_c find_getOneE_CECOnR704(
			ModelRoot modelRoot, CreateSmEventStatement_c target,
			ClassQueryInterface_c test) {
		if (target != null) {
			CreateEventToCreator_c source = (CreateEventToCreator_c) target.backPointer_IsSubtypeCreateEventToCreatorIsSubtype_R704;
			if (source != null && (test == null || test.evaluate(source))) {
				return source;
			}
		}
		// not found
		return null;
	}

	public static CreateEventToCreator_c[] getManyE_CECsOnR704(
			CreateSmEventStatement_c[] targets) {
		return getManyE_CECsOnR704(targets, null);
	}
	public static CreateEventToCreator_c[] getManyE_CECsOnR704(
			CreateSmEventStatement_c[] targets, boolean loadComponent) {
		return getManyE_CECsOnR704(targets, null, loadComponent);
	}
	public static CreateEventToCreator_c[] getManyE_CECsOnR704(
			CreateSmEventStatement_c[] targets, ClassQueryInterface_c test) {
		return getManyE_CECsOnR704(targets, test, true);
	}

	public static CreateEventToCreator_c[] getManyE_CECsOnR704(
			CreateSmEventStatement_c[] targets, ClassQueryInterface_c test,
			boolean loadComponent) {

		if (targets == null || targets.length == 0 || targets[0] == null)
			return new CreateEventToCreator_c[0];

		ModelRoot modelRoot = targets[0].getModelRoot();

		InstanceList instances = modelRoot
				.getInstanceList(CreateEventToCreator_c.class);

		Vector matches = new Vector();
		for (int i = 0; i < targets.length; i++) {
			CreateEventToCreator_c source = (CreateEventToCreator_c) targets[i].backPointer_IsSubtypeCreateEventToCreatorIsSubtype_R704;
			if (source != null && (test == null || test.evaluate(source))) {
				matches.add(source);
			}
		}
		if (matches.size() > 0) {
			CreateEventToCreator_c[] ret_set = new CreateEventToCreator_c[matches
					.size()];
			matches.copyInto(ret_set);
			return ret_set;
		} else {
			return new CreateEventToCreator_c[0];
		}
	}

	public static CreateEventToCreator_c[] getManyE_CECsOnR704(
			CreateSmEventStatement_c target) {
		if (target != null) {
			CreateSmEventStatement_c[] targetArray = new CreateSmEventStatement_c[1];
			targetArray[0] = target;
			return getManyE_CECsOnR704(targetArray);
		} else {
			CreateEventToCreator_c[] result = new CreateEventToCreator_c[0];
			return result;
		}
	}

	public static CreateEventToCreator_c[] getManyE_CECsOnR704(
			CreateSmEventStatement_c target, boolean loadComponent) {
		if (target != null) {
			CreateSmEventStatement_c[] targetArray = new CreateSmEventStatement_c[1];
			targetArray[0] = target;
			return getManyE_CECsOnR704(targetArray, loadComponent);
		} else {
			CreateEventToCreator_c[] result = new CreateEventToCreator_c[0];
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

		// R704
		CreateSmEventStatement_c relInst54614 = (CreateSmEventStatement_c) baseRoot
				.getInstanceList(CreateSmEventStatement_c.class).get(
						new Object[]{m_statement_id});
		// if there was no local element, check for any global elements
		// failing that proceed to check other model roots
		if (relInst54614 == null) {
			relInst54614 = (CreateSmEventStatement_c) Ooaofooa
					.getDefaultInstance()
					.getInstanceList(CreateSmEventStatement_c.class)
					.get(new Object[]{m_statement_id});
		}
		if (relInst54614 == null && searchAllRoots && !baseRoot.isCompareRoot()) {
			Ooaofooa[] roots = Ooaofooa.getInstances();
			for (int i = 0; i < roots.length; i++) {
				if (roots[i].isCompareRoot()) {
					// never use elements from any compare root
					continue;
				}
				relInst54614 = (CreateSmEventStatement_c) roots[i]
						.getInstanceList(CreateSmEventStatement_c.class).get(
								new Object[]{m_statement_id});
				if (relInst54614 != null)
					break;
			}
		}
		//synchronized
		if (relInst54614 != null) {
			if (relateProxies || !isProxy()
					|| (inSameComponent(this, relInst54614) && !isProxy())) {
				relInst54614.relateAcrossR704To(this, notifyChanges);
			}
		}

	}
	public void batchUnrelate(boolean notifyChanges) {
		NonRootModelElement inst = null;
		// R704
		// E_CSME
		inst = IsSupertypeCreateSmEventStatement;
		unrelateAcrossR704From(IsSupertypeCreateSmEventStatement, notifyChanges);
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
	InstanceList instances = modelRoot.getInstanceList(CreateEventToCreator_c.class);
    synchronized(instances) {
        Iterator<NonRootModelElement> cursor = instances.iterator() ;
    	while (cursor.hasNext())
	    {
            final CreateEventToCreator_c inst = (CreateEventToCreator_c)cursor.next() ;
	        inst.batchRelate(modelRoot, relateProxies, notifyChanges, searchAllRoots );
	    }
	}
  }
	public static void clearInstances(ModelRoot modelRoot) {
		InstanceList instances = modelRoot
				.getInstanceList(CreateEventToCreator_c.class);
		synchronized (instances) {
			for (int i = instances.size() - 1; i >= 0; i--) {
				((NonRootModelElement) instances.get(i)).delete_unchecked();
			}

		}
	}

	public static CreateEventToCreator_c CreateEventToCreatorInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		CreateEventToCreator_c result = findCreateEventToCreatorInstance(
				modelRoot, test, loadComponent);
		return result;
	}
	private static CreateEventToCreator_c findCreateEventToCreatorInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(CreateEventToCreator_c.class);
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				CreateEventToCreator_c x = (CreateEventToCreator_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					return x;
				}
			}
		}
		return null;
	}
	public static CreateEventToCreator_c CreateEventToCreatorInstance(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return CreateEventToCreatorInstance(modelRoot, test, true);
	}

	public static CreateEventToCreator_c CreateEventToCreatorInstance(
			ModelRoot modelRoot) {
		return CreateEventToCreatorInstance(modelRoot, null, true);
	}

	public static CreateEventToCreator_c[] CreateEventToCreatorInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test,
			boolean loadComponent) {
		InstanceList instances = modelRoot
				.getInstanceList(CreateEventToCreator_c.class);
		Vector matches = new Vector();
		synchronized (instances) {
			for (int i = 0; i < instances.size(); ++i) {
				CreateEventToCreator_c x = (CreateEventToCreator_c) instances
						.get(i);
				if (test == null || test.evaluate(x)) {
					matches.add(x);
				}
			}
			if (matches.size() > 0) {
				CreateEventToCreator_c[] ret_set = new CreateEventToCreator_c[matches
						.size()];
				matches.copyInto(ret_set);
				return ret_set;
			} else {
				return new CreateEventToCreator_c[0];
			}
		}
	}
	public static CreateEventToCreator_c[] CreateEventToCreatorInstances(
			ModelRoot modelRoot, ClassQueryInterface_c test) {
		return CreateEventToCreatorInstances(modelRoot, test, true);
	}
	public static CreateEventToCreator_c[] CreateEventToCreatorInstances(
			ModelRoot modelRoot) {
		return CreateEventToCreatorInstances(modelRoot, null, true);
	}

	public boolean delete() {
		boolean result = super.delete();
		boolean delete_error = false;
		String errorMsg = "The following relationships were not torn down by the Create Event to Creator.dispose call: ";
		CreateSmEventStatement_c testR704Inst3 = CreateSmEventStatement_c
				.getOneE_CSMEOnR704(this, false);

		if (testR704Inst3 != null) {
			delete_error = true;
			errorMsg = errorMsg + "704 ";
		}
		if (delete_error == true) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log.println(ILogger.DELETE, "Create Event to Creator",
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
		if (attributeName.equals("statement_id")) {
			return true;
		}
		return false;
	}
	// declare attribute accessors
	public long getStatement_idLongBased() {
		if (IsSupertypeCreateSmEventStatement != null) {
			return IsSupertypeCreateSmEventStatement.getStatement_idLongBased();
		}
		return 0;
	}
	public java.util.UUID getStatement_id() {
		if (IsSupertypeCreateSmEventStatement != null) {
			return IsSupertypeCreateSmEventStatement.getStatement_id();
		}
		return IdAssigner.NULL_UUID;
	}

	public boolean hasSuperType() {
		return (IsSupertypeCreateSmEventStatement != null);

	}

	public java.util.UUID getStatement_idCachedValue() {
		if (!IdAssigner.NULL_UUID.equals(m_statement_id))
			return m_statement_id;
		else
			return getStatement_id();
	}

	public void setStatement_id(java.util.UUID newValue) {
		m_statement_id = IdAssigner.preprocessUUID(newValue);
	}
	// end declare accessors
	public static void checkClassConsistency(ModelRoot modelRoot) {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Create Event to Creator", //$NON-NLS-1$
						" Operation entered: Create Event to Creator::checkClassConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return;
		}
		CreateEventToCreator_c[] objs = CreateEventToCreator_c
				.CreateEventToCreatorInstances(modelRoot, null, false);

		for (int i = 0; i < objs.length; i++) {
			objs[i].checkConsistency();
		}
	}
	public boolean checkConsistency() {
		Ooaofooa.log
				.println(ILogger.OPERATION, "Create Event to Creator", //$NON-NLS-1$
						" Operation entered: Create Event to Creator::checkConsistency"); //$NON-NLS-1$
		if (Boolean.valueOf(System.getenv("PTC_MCC_ENABLED")) == false) { //$NON-NLS-1$
			return true;
		}
		ModelRoot modelRoot = getModelRoot();
		boolean retval = true;
		class CreateEventToCreator_c_test54616_c
				implements
					ClassQueryInterface_c {
			CreateEventToCreator_c_test54616_c(java.util.UUID p54617) {
				m_p54617 = p54617;
			}
			private java.util.UUID m_p54617;
			public boolean evaluate(Object candidate) {
				CreateEventToCreator_c selected = (CreateEventToCreator_c) candidate;
				boolean retval = false;
				retval = (selected.getStatement_id().equals(m_p54617));
				return retval;
			}
		}

		CreateEventToCreator_c[] objs54615 = CreateEventToCreator_c
				.CreateEventToCreatorInstances(modelRoot,
						new CreateEventToCreator_c_test54616_c(
								getStatement_id()));

		if (((objs54615.length) == 0)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Create Event to Creator", //$NON-NLS-1$
								"Consistency: Object: Create Event to Creator: Cardinality of an identifier is zero. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs54615.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Create Event to Creator: Cardinality of an identifier is zero. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs54615.length), e);
			}
			retval = false;

		}

		if (((objs54615.length) > 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Create Event to Creator", //$NON-NLS-1$
								"Consistency: Object: Create Event to Creator: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$
										+ "Actual Value: " //$NON-NLS-1$ 
										+ Integer.toString(objs54615.length)
										+ " Statement_ID: " + "Not Printable"); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Create Event to Creator: Cardinality of an identifier is greater than 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs54615.length)
										+ " Statement_ID: " + "Not Printable", e); //$NON-NLS-1$
			}
			retval = false;

		}

		// Create Event to Creator is a subtype in association: rel.Numb = 704
		// The supertype class is: Create SM Event Statement
		class CreateSmEventStatement_c_test54621_c
				implements
					ClassQueryInterface_c {
			CreateSmEventStatement_c_test54621_c(java.util.UUID p54622) {
				m_p54622 = p54622;
			}
			private java.util.UUID m_p54622;
			public boolean evaluate(Object candidate) {
				CreateSmEventStatement_c selected = (CreateSmEventStatement_c) candidate;
				boolean retval = false;
				retval = (selected.getStatement_id().equals(m_p54622));
				return retval;
			}
		}

		CreateSmEventStatement_c[] objs54620 = CreateSmEventStatement_c
				.CreateSmEventStatementInstances(modelRoot,
						new CreateSmEventStatement_c_test54621_c(
								getStatement_id()));

		if (((objs54620.length) != 1)) {

			if (CorePlugin.getDefault().isDebugging()) {
				Ooaofooa.log
						.println(
								ILogger.CONSISTENCY,
								"Create Event to Creator", //$NON-NLS-1$
								"Consistency: Object: Create Event to Creator: Association: 704: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$
										+ "Actual Value: " + Integer.toString(objs54620.length)); //$NON-NLS-1$
			} else {
				Exception e = new Exception();
				CorePlugin
						.logError(
								"Consistency: Object: Create Event to Creator: Association: 704: Cardinality of a supertype is not equal to 1. " //$NON-NLS-1$ 
										+ "Actual Value: " //$NON-NLS-1$
										+ Integer.toString(objs54620.length), e);
			}
			retval = false;

		}

		return retval;
	}

	// declare transform functions
	public void Dispose() {
		Ooaofooa.log.println(ILogger.OPERATION, "Create Event to Creator",
				" Operation entered: CreateEventToCreator::Dispose");
		final ModelRoot modelRoot = getModelRoot();
		delete();

	} // End dispose
	public void Execute(final java.util.UUID p_Stack_frame_id) {
		Ooaofooa.log.println(ILogger.OPERATION, "Create Event to Creator",
				" Operation entered: CreateEventToCreator::Execute");
		final ModelRoot modelRoot = getModelRoot();
		StateMachineEvent_c v_evt = StateMachineEvent_c
				.getOneSM_EVTOnR706(CreateSmEventStatement_c
						.getOneE_CSMEOnR704(this));

		PendingEvent_c v_evtInst = new PendingEvent_c(modelRoot);
		Ooaofooa.getDefaultInstance().fireModelElementCreated(
				new BaseModelDelta(Modeleventnotification_c.DELTA_NEW,
						v_evtInst));

		if (v_evt != null) {
			v_evt.relateAcrossR2906To(v_evtInst);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Relate attempted on null left hand instance.",
					t);
		}

		if (v_evtInst != null) {
			v_evtInst.setIscreation(true);
		} else {
			Throwable t = new Throwable();
			t.fillInStackTrace();
			CorePlugin.logError("Attribute write attempted on null instance.",
					t);
		}

		EventSpecificationStatement_c v_evt_spec_stmt = EventSpecificationStatement_c
				.getOneE_ESSOnR701(CreateEventStatement_c
						.getOneE_CESOnR702(CreateSmEventStatement_c
								.getOneE_CSMEOnR704(this)));

		boolean v_valueComputationComplete = v_evt_spec_stmt.Hookupeventdata(
				v_evtInst.getEvent_id(), p_Stack_frame_id);

		if ((v_valueComputationComplete)) {

			CreateEventStatement_c v_createEvtStmt = CreateEventStatement_c
					.getOneE_CESOnR702(CreateSmEventStatement_c
							.getOneE_CSMEOnR704(this));

			if (v_createEvtStmt != null) {
				v_createEvtStmt.Hookupevtinsttohandle(v_evtInst.getEvent_id(),
						p_Stack_frame_id);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

			if (v_evt_spec_stmt != null) {
				v_evt_spec_stmt.Relatetooriginatinginst(
						v_evtInst.getEvent_id(), p_Stack_frame_id);
			} else {
				Throwable t = new Throwable();
				t.fillInStackTrace();
				CorePlugin
						.logError(
								"Attempted to call an operation on a null instance.",
								t);
			}

		}

	} // End execute

	// end transform functions

	public Object getAdapter(Class adapter) {
		Object superAdapter = super.getAdapter(adapter);
		if (superAdapter != null) {
			return superAdapter;
		}
		return null;
	}
} // end Create Event to Creator
