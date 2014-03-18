	
package com.mentor.nucleus.bp.core.inspector;
//======================================================================
//
// File: com/mentor/nucleus/bp/core/inspector/ModelInspector.java
//
// WARNING:      Do not edit this generated file
// Generated by: arc/create_model_inspector.arc
// Version:      $Revision$
//
// (c) Copyright 2004-2014 by Mentor Graphics Corp.  All rights reserved.
//
//======================================================================
import java.util.HashMap;

import org.eclipse.swt.graphics.Image;

import com.mentor.nucleus.bp.core.ClassStateMachine_c;
import com.mentor.nucleus.bp.core.InstanceStateMachine_c;
import com.mentor.nucleus.bp.core.StateMachine_c;
import com.mentor.nucleus.bp.core.inspector.*;
import com.mentor.nucleus.bp.core.sorter.MetadataSortingManager;

public class ModelInspector implements IModelClassInspector, IModelInspectorRegistry {

	private HashMap adaptersMap;
	private MetadataSortingManager sortingManager;
	
	public ModelInspector(){
	    this(null);
	}
	
	public ModelInspector(MetadataSortingManager aSortingManager){
		adaptersMap = new HashMap();
		sortingManager = aSortingManager;
		initializeMap();
	}

	/* 
	* @see IModelInspectorRegistry#getInspector(Class)
	*/	
	public IModelClassInspector getInspector(Class modelClass) {
		return ((IModelClassInspector)adaptersMap.get(modelClass.getName()));
	}
	
	/*
	*  This function is required to be called every before using the inspectors.
	*  It adds an adapter object for each object in the meta model
	*/
	private void initializeMap(){
		adaptersMap.put("com.mentor.nucleus.bp.core.SystemModel_c", new SystemModelInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Domain_c", new DomainInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Subsystem_c", new SubsystemInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ModelClass_c", new ModelClassInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.FunctionPackage_c", new FunctionPackageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Function_c", new FunctionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.FunctionParameter_c", new FunctionParameterInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Operation_c", new OperationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.OperationParameter_c", new OperationParameterInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InstanceStateMachine_c", new InstanceStateMachineInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassStateMachine_c", new ClassStateMachineInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.StateMachineState_c", new StateMachineStateInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.StateMachineEvent_c", new StateMachineEventInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.StateMachineEventDataItem_c", new StateMachineEventDataItemInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Attribute_c", new AttributeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.DataType_c", new DataTypeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Enumerator_c", new EnumeratorInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ExternalEntity_c", new ExternalEntityInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Bridge_c", new BridgeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.BridgeParameter_c", new BridgeParameterInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Association_c", new AssociationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ImportedClass_c", new ImportedClassInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassIdentifierAttribute_c", new ClassIdentifierAttributeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.DerivedBaseAttribute_c", new DerivedBaseAttributeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.AttributeReferenceInClass_c", new AttributeReferenceInClassInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsSimpleParticipant_c", new ClassAsSimpleParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsSimpleFormalizer_c", new ClassAsSimpleFormalizerInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsAssociatedOneSide_c", new ClassAsAssociatedOneSideInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsAssociatedOtherSide_c", new ClassAsAssociatedOtherSideInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsLink_c", new ClassAsLinkInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsSupertype_c", new ClassAsSupertypeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsSubtype_c", new ClassAsSubtypeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsDerivedOneSide_c", new ClassAsDerivedOneSideInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassAsDerivedOtherSide_c", new ClassAsDerivedOtherSideInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Action_c", new ActionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.EventIgnored_c", new EventIgnoredInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.CantHappen_c", new CantHappenInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.StateEventMatrixEntry_c", new StateEventMatrixEntryInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.DataTypePackage_c", new DataTypePackageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ExternalEntityPackage_c", new ExternalEntityPackageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.UserDataType_c", new UserDataTypeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.CoreDataType_c", new CoreDataTypeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.EnumerationDataType_c", new EnumerationDataTypeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.DerivedAssociation_c", new DerivedAssociationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ReferentialAttribute_c", new ReferentialAttributeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.NonLocalEvent_c", new NonLocalEventInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ExternalEntityEventData_c", new ExternalEntityEventDataInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Sequence_c", new SequenceInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassInstanceParticipant_c", new ClassInstanceParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InstanceAttributeValue_c", new InstanceAttributeValueInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ExternalEntityParticipant_c", new ExternalEntityParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.FunctionPackageParticipant_c", new FunctionPackageParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.PackageParticipant_c", new PackageParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassParticipant_c", new ClassParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Lifespan_c", new LifespanInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ClassParticipantAttribute_c", new ClassParticipantAttributeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.TimingMark_c", new TimingMarkInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.TimeSpan_c", new TimeSpanInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.SynchronousMessage_c", new SynchronousMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.AsynchronousMessage_c", new AsynchronousMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.MessageArgument_c", new MessageArgumentInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.MessageArgument_c", new MessageArgumentInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InstanceAttributeValue_c", new InstanceAttributeValueInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ActorParticipant_c", new ActorParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ReturnMessage_c", new ReturnMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Communication_c", new CommunicationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.CommunicationLink_c", new CommunicationLinkInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.UseCaseDiagram_c", new UseCaseDiagramInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.UseCaseParticipant_c", new UseCaseParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.BinaryAssociation_c", new BinaryAssociationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Generalization_c", new GeneralizationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Include_c", new IncludeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Extend_c", new ExtendInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Activity_c", new ActivityInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ForkJoinNode_c", new ForkJoinNodeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InitialNode_c", new InitialNodeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ActivityEdge_c", new ActivityEdgeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ActivityFinalNode_c", new ActivityFinalNodeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.FlowFinalNode_c", new FlowFinalNodeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ActivityDiagramAction_c", new ActivityDiagramActionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.DecisionMergeNode_c", new DecisionMergeNodeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ObjectNode_c", new ObjectNodeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.AcceptEventAction_c", new AcceptEventActionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.SendSignal_c", new SendSignalInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ActivityPartition_c", new ActivityPartitionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.AcceptTimeEventAction_c", new AcceptTimeEventActionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ComponentPackage_c", new ComponentPackageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Component_c", new ComponentInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ComponentReference_c", new ComponentReferenceInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Provision_c", new ProvisionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Requirement_c", new RequirementInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InterfacePackage_c", new InterfacePackageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Interface_c", new InterfaceInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InterfaceSignal_c", new InterfaceSignalInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InterfaceOperation_c", new InterfaceOperationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.PropertyParameter_c", new PropertyParameterInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.RequiredOperation_c", new RequiredOperationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.RequiredSignal_c", new RequiredSignalInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ProvidedOperation_c", new ProvidedOperationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ProvidedSignal_c", new ProvidedSignalInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Instance_c", new InstanceInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.AttributeValue_c", new AttributeValueInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.PendingEvent_c", new PendingEventInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.StructuredDataType_c", new StructuredDataTypeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.StructureMember_c", new StructureMemberInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Port_c", new PortInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ImportedProvision_c", new ImportedProvisionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ImportedRequirement_c", new ImportedRequirementInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Transition_c", new TransitionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ComponentInstance_c", new ComponentInstanceInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ComponentParticipant_c", new ComponentParticipantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Package_c", new PackageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.LinkParticipation_c", new LinkParticipationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ConstantSpecification_c", new ConstantSpecificationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.LiteralSymbolicConstant_c", new LiteralSymbolicConstantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.SymbolicConstant_c", new SymbolicConstantInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Satisfaction_c", new SatisfactionInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.NewBaseAttribute_c", new NewBaseAttributeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.PolymorphicEvent_c", new PolymorphicEventInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.ReferredToIdentifierAttribute_c", new ReferredToIdentifierAttributeInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.Delegation_c", new DelegationInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.SemEvent_c", new SemEventInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InformalSynchronousMessage_c", new InformalSynchronousMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InformalAsynchronousMessage_c", new InformalAsynchronousMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.FunctionMessage_c", new FunctionMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.BridgeMessage_c", new BridgeMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.OperationMessage_c", new OperationMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InterfaceOperationMessage_c", new InterfaceOperationMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.EventMessage_c", new EventMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.SignalMessage_c", new SignalMessageInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.InformalArgument_c", new InformalArgumentInspector(sortingManager) );
		adaptersMap.put("com.mentor.nucleus.bp.core.CreationTransition_c", new CreationTransitionInspector(sortingManager) );
	}
	
	
	/* 
	 * @see IModelClassInspector#getParent(Object)
	 */
	public Object getParent(Object arg) {
		if(arg instanceof ObjectElement) {
			return ((ObjectElement) arg).getParent();
		}
		if(arg instanceof StateMachine_c) {
			InstanceStateMachine_c ism = InstanceStateMachine_c.getOneSM_ISMOnR517((StateMachine_c) arg);
			if(ism != null) {
				arg = ism;
				return getInspector(arg.getClass()).getParent(arg);
			}
			ClassStateMachine_c csm = ClassStateMachine_c.getOneSM_ASMOnR517((StateMachine_c) arg);
			if(csm != null) {
				arg = csm;
				return getInspector(arg.getClass()).getParent(arg);
			}
		}
		if(getInspector(arg.getClass()) == null) {
		     return null;
		}
		return getInspector(arg.getClass()).getParent(arg);
		
	}
	
	/* 
	 * @see IModelClassInspector#getChildRelations(Object)
	 */
	public ObjectElement[] getChildRelations(Object arg) {
		return getInspector(arg.getClass()).getChildRelations(arg);		
	}

	/* 
	 * @see IModelClassInspector#hasChildRelations(Object)
	 */
	public boolean hasChildRelations(Object arg) {
		return getInspector(arg.getClass()).hasChildRelations(arg);
	}
	
	/*
	* @see IModelClassInspector#getReferentials(Object)
	*/
	public ObjectElement[] getReferentials(Object arg) {
		return getInspector(arg.getClass()).getReferentials(arg);
	}
	
	/*
	* @see IModelClassInspector#getAttributes(Object)
	*/	
	public ObjectElement[] getAttributes(Object arg) {
		return getInspector(arg.getClass()).getAttributes(arg);
	}
	
	/*
	 * @see IMOdelClassInspector#getReferentialDetails(Class<?> referentialClass, Object arg)
	 */
	public Object[] getReferentialDetails(Class<?> referentialClass, Object arg) {
		return getInspector(arg.getClass()).getReferentialDetails(referentialClass, arg);
	}
	
	/*
	 * @see IMOdelClassInspector#getImage(Object)
	 */
	public Image getImage(Object arg) {
		return getInspector(arg.getClass()).getImage(arg);
	}
}

