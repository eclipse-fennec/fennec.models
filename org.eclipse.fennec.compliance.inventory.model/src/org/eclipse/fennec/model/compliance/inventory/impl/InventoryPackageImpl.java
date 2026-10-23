/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.compliance.inventory.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.compliance.context.ContextPackage;

import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;

import org.eclipse.fennec.model.compliance.inventory.Aspect;
import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.AssetRelation;
import org.eclipse.fennec.model.compliance.inventory.AssetRelationKind;
import org.eclipse.fennec.model.compliance.inventory.CoverageKind;
import org.eclipse.fennec.model.compliance.inventory.ImplementationStatus;
import org.eclipse.fennec.model.compliance.inventory.Inventory;
import org.eclipse.fennec.model.compliance.inventory.InventoryFactory;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.Measure;
import org.eclipse.fennec.model.compliance.inventory.MeasureKind;
import org.eclipse.fennec.model.compliance.inventory.ProcessingActivity;
import org.eclipse.fennec.model.compliance.inventory.ProtectionLevel;
import org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment;
import org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation;
import org.eclipse.fennec.model.compliance.inventory.RequirementApplicability;
import org.eclipse.fennec.model.compliance.inventory.RetentionAction;
import org.eclipse.fennec.model.compliance.inventory.RetentionRule;
import org.eclipse.fennec.model.compliance.inventory.RetentionTrigger;
import org.eclipse.fennec.model.compliance.inventory.RiskLevel;
import org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell;
import org.eclipse.fennec.model.compliance.inventory.RiskMethodology;
import org.eclipse.fennec.model.compliance.inventory.RiskScale;
import org.eclipse.fennec.model.compliance.inventory.SourceKind;
import org.eclipse.fennec.model.compliance.inventory.SourceRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class InventoryPackageImpl extends EPackageImpl implements InventoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aspectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assetRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass protectionNeedAssessmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass measureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementApplicabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processingActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retentionRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskMethodologyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskScaleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskLevelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass riskMatrixCellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum assetRelationKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protectionLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum protectionNeedDerivationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measureKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum implementationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum retentionTriggerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum retentionActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InventoryPackageImpl() {
		super(eNS_URI, InventoryFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link InventoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InventoryPackage init() {
		if (isInited) return (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredInventoryPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		InventoryPackageImpl theInventoryPackage = registeredInventoryPackage instanceof InventoryPackageImpl ? (InventoryPackageImpl)registeredInventoryPackage : new InventoryPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ContextPackage.eINSTANCE.eClass();
		CorpusPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInventoryPackage.createPackageContents();

		// Initialize created meta-data
		theInventoryPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInventoryPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InventoryPackage.eNS_URI, theInventoryPackage);
		return theInventoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Id() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Name() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Description() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Scope() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInventory_Owner() {
		return (EAttribute)inventoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_Contexts() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_Assets() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_Measures() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_Applicabilities() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_ProcessingActivities() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_RiskMethodologies() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInventory_Aspects() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAspect() {
		return aspectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAsset() {
		return assetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Id() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Name() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Description() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAsset_Owner() {
		return (EAttribute)assetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Categories() {
		return (EReference)assetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_ProtectionNeeds() {
		return (EReference)assetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Relations() {
		return (EReference)assetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Sources() {
		return (EReference)assetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAsset_Aspects() {
		return (EReference)assetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssetRelation() {
		return assetRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetRelation_Kind() {
		return (EAttribute)assetRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssetRelation_Target() {
		return (EReference)assetRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAssetRelation_Rationale() {
		return (EAttribute)assetRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProtectionNeedAssessment() {
		return protectionNeedAssessmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionNeedAssessment_Confidentiality() {
		return (EAttribute)protectionNeedAssessmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionNeedAssessment_Integrity() {
		return (EAttribute)protectionNeedAssessmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionNeedAssessment_Availability() {
		return (EAttribute)protectionNeedAssessmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionNeedAssessment_Derivation() {
		return (EAttribute)protectionNeedAssessmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProtectionNeedAssessment_DerivedFrom() {
		return (EReference)protectionNeedAssessmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionNeedAssessment_Rationale() {
		return (EAttribute)protectionNeedAssessmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionNeedAssessment_AssessedBy() {
		return (EAttribute)protectionNeedAssessmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProtectionNeedAssessment_AssessedAt() {
		return (EAttribute)protectionNeedAssessmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMeasure() {
		return measureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_Id() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_Title() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_Description() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_Kind() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Categories() {
		return (EReference)measureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Satisfies() {
		return (EReference)measureEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_AppliesTo() {
		return (EReference)measureEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_Status() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_Responsible() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_ReviewedAt() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMeasure_DueDate() {
		return (EAttribute)measureEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Evidence() {
		return (EReference)measureEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMeasure_Aspects() {
		return (EReference)measureEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementApplicability() {
		return requirementApplicabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementApplicability_Requirement() {
		return (EReference)requirementApplicabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementApplicability_Applicable() {
		return (EAttribute)requirementApplicabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementApplicability_Justification() {
		return (EAttribute)requirementApplicabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementApplicability_Status() {
		return (EAttribute)requirementApplicabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementApplicability_Measures() {
		return (EReference)requirementApplicabilityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementApplicability_Coverage() {
		return (EAttribute)requirementApplicabilityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementApplicability_DerivedFrom() {
		return (EReference)requirementApplicabilityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementApplicability_Assets() {
		return (EReference)requirementApplicabilityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementApplicability_DecidedBy() {
		return (EAttribute)requirementApplicabilityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementApplicability_DecidedAt() {
		return (EAttribute)requirementApplicabilityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessingActivity() {
		return processingActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_Id() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_Name() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_Purpose() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_Controller() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingActivity_LawfulBases() {
		return (EReference)processingActivityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingActivity_DataCategories() {
		return (EReference)processingActivityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_DataSubjects() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_Recipients() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_ThirdCountryTransfers() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProcessingActivity_Retention() {
		return (EAttribute)processingActivityEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingActivity_RetentionRules() {
		return (EReference)processingActivityEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingActivity_Models() {
		return (EReference)processingActivityEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingActivity_Assets() {
		return (EReference)processingActivityEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingActivity_Measures() {
		return (EReference)processingActivityEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessingActivity_Aspects() {
		return (EReference)processingActivityEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRetentionRule() {
		return retentionRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetentionRule_Id() {
		return (EAttribute)retentionRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetentionRule_DataCategories() {
		return (EReference)retentionRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetentionRule_Period() {
		return (EAttribute)retentionRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetentionRule_Trigger() {
		return (EAttribute)retentionRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetentionRule_TriggerDescription() {
		return (EAttribute)retentionRuleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetentionRule_Action() {
		return (EAttribute)retentionRuleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetentionRule_LegalReference() {
		return (EAttribute)retentionRuleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRetentionRule_Justification() {
		return (EAttribute)retentionRuleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetentionRule_Assets() {
		return (EReference)retentionRuleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRetentionRule_EnforcedBy() {
		return (EReference)retentionRuleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSourceRef() {
		return sourceRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceRef_Kind() {
		return (EAttribute)sourceRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceRef_Format() {
		return (EAttribute)sourceRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceRef_Uri() {
		return (EAttribute)sourceRefEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceRef_Fingerprint() {
		return (EAttribute)sourceRefEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSourceRef_Name() {
		return (EAttribute)sourceRefEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskMethodology() {
		return riskMethodologyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskMethodology_Id() {
		return (EAttribute)riskMethodologyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskMethodology_Name() {
		return (EAttribute)riskMethodologyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskMethodology_Description() {
		return (EAttribute)riskMethodologyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskMethodology_Likelihood() {
		return (EReference)riskMethodologyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskMethodology_Severity() {
		return (EReference)riskMethodologyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskMethodology_Risk() {
		return (EReference)riskMethodologyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskMethodology_Matrix() {
		return (EReference)riskMethodologyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskScale() {
		return riskScaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskScale_Name() {
		return (EAttribute)riskScaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskScale_Levels() {
		return (EReference)riskScaleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskLevel() {
		return riskLevelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLevel_Id() {
		return (EAttribute)riskLevelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLevel_Name() {
		return (EAttribute)riskLevelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLevel_Rank() {
		return (EAttribute)riskLevelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRiskLevel_Description() {
		return (EAttribute)riskLevelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRiskMatrixCell() {
		return riskMatrixCellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskMatrixCell_Likelihood() {
		return (EReference)riskMatrixCellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskMatrixCell_Severity() {
		return (EReference)riskMatrixCellEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRiskMatrixCell_Risk() {
		return (EReference)riskMatrixCellEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAssetRelationKind() {
		return assetRelationKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProtectionLevel() {
		return protectionLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProtectionNeedDerivation() {
		return protectionNeedDerivationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMeasureKind() {
		return measureKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getImplementationStatus() {
		return implementationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCoverageKind() {
		return coverageKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRetentionTrigger() {
		return retentionTriggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getRetentionAction() {
		return retentionActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSourceKind() {
		return sourceKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InventoryFactory getInventoryFactory() {
		return (InventoryFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		inventoryEClass = createEClass(INVENTORY);
		createEAttribute(inventoryEClass, INVENTORY__ID);
		createEAttribute(inventoryEClass, INVENTORY__NAME);
		createEAttribute(inventoryEClass, INVENTORY__DESCRIPTION);
		createEAttribute(inventoryEClass, INVENTORY__SCOPE);
		createEAttribute(inventoryEClass, INVENTORY__OWNER);
		createEReference(inventoryEClass, INVENTORY__CONTEXTS);
		createEReference(inventoryEClass, INVENTORY__ASSETS);
		createEReference(inventoryEClass, INVENTORY__MEASURES);
		createEReference(inventoryEClass, INVENTORY__APPLICABILITIES);
		createEReference(inventoryEClass, INVENTORY__PROCESSING_ACTIVITIES);
		createEReference(inventoryEClass, INVENTORY__RISK_METHODOLOGIES);
		createEReference(inventoryEClass, INVENTORY__ASPECTS);

		aspectEClass = createEClass(ASPECT);

		assetEClass = createEClass(ASSET);
		createEAttribute(assetEClass, ASSET__ID);
		createEAttribute(assetEClass, ASSET__NAME);
		createEAttribute(assetEClass, ASSET__DESCRIPTION);
		createEAttribute(assetEClass, ASSET__OWNER);
		createEReference(assetEClass, ASSET__CATEGORIES);
		createEReference(assetEClass, ASSET__PROTECTION_NEEDS);
		createEReference(assetEClass, ASSET__RELATIONS);
		createEReference(assetEClass, ASSET__SOURCES);
		createEReference(assetEClass, ASSET__ASPECTS);

		assetRelationEClass = createEClass(ASSET_RELATION);
		createEAttribute(assetRelationEClass, ASSET_RELATION__KIND);
		createEReference(assetRelationEClass, ASSET_RELATION__TARGET);
		createEAttribute(assetRelationEClass, ASSET_RELATION__RATIONALE);

		protectionNeedAssessmentEClass = createEClass(PROTECTION_NEED_ASSESSMENT);
		createEAttribute(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY);
		createEAttribute(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__INTEGRITY);
		createEAttribute(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__AVAILABILITY);
		createEAttribute(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__DERIVATION);
		createEReference(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__DERIVED_FROM);
		createEAttribute(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__RATIONALE);
		createEAttribute(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__ASSESSED_BY);
		createEAttribute(protectionNeedAssessmentEClass, PROTECTION_NEED_ASSESSMENT__ASSESSED_AT);

		measureEClass = createEClass(MEASURE);
		createEAttribute(measureEClass, MEASURE__ID);
		createEAttribute(measureEClass, MEASURE__TITLE);
		createEAttribute(measureEClass, MEASURE__DESCRIPTION);
		createEAttribute(measureEClass, MEASURE__KIND);
		createEReference(measureEClass, MEASURE__CATEGORIES);
		createEReference(measureEClass, MEASURE__SATISFIES);
		createEReference(measureEClass, MEASURE__APPLIES_TO);
		createEAttribute(measureEClass, MEASURE__STATUS);
		createEAttribute(measureEClass, MEASURE__RESPONSIBLE);
		createEAttribute(measureEClass, MEASURE__REVIEWED_AT);
		createEAttribute(measureEClass, MEASURE__DUE_DATE);
		createEReference(measureEClass, MEASURE__EVIDENCE);
		createEReference(measureEClass, MEASURE__ASPECTS);

		requirementApplicabilityEClass = createEClass(REQUIREMENT_APPLICABILITY);
		createEReference(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__REQUIREMENT);
		createEAttribute(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__APPLICABLE);
		createEAttribute(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__JUSTIFICATION);
		createEAttribute(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__STATUS);
		createEReference(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__MEASURES);
		createEAttribute(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__COVERAGE);
		createEReference(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__DERIVED_FROM);
		createEReference(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__ASSETS);
		createEAttribute(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__DECIDED_BY);
		createEAttribute(requirementApplicabilityEClass, REQUIREMENT_APPLICABILITY__DECIDED_AT);

		processingActivityEClass = createEClass(PROCESSING_ACTIVITY);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__ID);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__NAME);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__PURPOSE);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__CONTROLLER);
		createEReference(processingActivityEClass, PROCESSING_ACTIVITY__LAWFUL_BASES);
		createEReference(processingActivityEClass, PROCESSING_ACTIVITY__DATA_CATEGORIES);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__DATA_SUBJECTS);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__RECIPIENTS);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS);
		createEAttribute(processingActivityEClass, PROCESSING_ACTIVITY__RETENTION);
		createEReference(processingActivityEClass, PROCESSING_ACTIVITY__RETENTION_RULES);
		createEReference(processingActivityEClass, PROCESSING_ACTIVITY__MODELS);
		createEReference(processingActivityEClass, PROCESSING_ACTIVITY__ASSETS);
		createEReference(processingActivityEClass, PROCESSING_ACTIVITY__MEASURES);
		createEReference(processingActivityEClass, PROCESSING_ACTIVITY__ASPECTS);

		retentionRuleEClass = createEClass(RETENTION_RULE);
		createEAttribute(retentionRuleEClass, RETENTION_RULE__ID);
		createEReference(retentionRuleEClass, RETENTION_RULE__DATA_CATEGORIES);
		createEAttribute(retentionRuleEClass, RETENTION_RULE__PERIOD);
		createEAttribute(retentionRuleEClass, RETENTION_RULE__TRIGGER);
		createEAttribute(retentionRuleEClass, RETENTION_RULE__TRIGGER_DESCRIPTION);
		createEAttribute(retentionRuleEClass, RETENTION_RULE__ACTION);
		createEAttribute(retentionRuleEClass, RETENTION_RULE__LEGAL_REFERENCE);
		createEAttribute(retentionRuleEClass, RETENTION_RULE__JUSTIFICATION);
		createEReference(retentionRuleEClass, RETENTION_RULE__ASSETS);
		createEReference(retentionRuleEClass, RETENTION_RULE__ENFORCED_BY);

		sourceRefEClass = createEClass(SOURCE_REF);
		createEAttribute(sourceRefEClass, SOURCE_REF__KIND);
		createEAttribute(sourceRefEClass, SOURCE_REF__FORMAT);
		createEAttribute(sourceRefEClass, SOURCE_REF__URI);
		createEAttribute(sourceRefEClass, SOURCE_REF__FINGERPRINT);
		createEAttribute(sourceRefEClass, SOURCE_REF__NAME);

		riskMethodologyEClass = createEClass(RISK_METHODOLOGY);
		createEAttribute(riskMethodologyEClass, RISK_METHODOLOGY__ID);
		createEAttribute(riskMethodologyEClass, RISK_METHODOLOGY__NAME);
		createEAttribute(riskMethodologyEClass, RISK_METHODOLOGY__DESCRIPTION);
		createEReference(riskMethodologyEClass, RISK_METHODOLOGY__LIKELIHOOD);
		createEReference(riskMethodologyEClass, RISK_METHODOLOGY__SEVERITY);
		createEReference(riskMethodologyEClass, RISK_METHODOLOGY__RISK);
		createEReference(riskMethodologyEClass, RISK_METHODOLOGY__MATRIX);

		riskScaleEClass = createEClass(RISK_SCALE);
		createEAttribute(riskScaleEClass, RISK_SCALE__NAME);
		createEReference(riskScaleEClass, RISK_SCALE__LEVELS);

		riskLevelEClass = createEClass(RISK_LEVEL);
		createEAttribute(riskLevelEClass, RISK_LEVEL__ID);
		createEAttribute(riskLevelEClass, RISK_LEVEL__NAME);
		createEAttribute(riskLevelEClass, RISK_LEVEL__RANK);
		createEAttribute(riskLevelEClass, RISK_LEVEL__DESCRIPTION);

		riskMatrixCellEClass = createEClass(RISK_MATRIX_CELL);
		createEReference(riskMatrixCellEClass, RISK_MATRIX_CELL__LIKELIHOOD);
		createEReference(riskMatrixCellEClass, RISK_MATRIX_CELL__SEVERITY);
		createEReference(riskMatrixCellEClass, RISK_MATRIX_CELL__RISK);

		// Create enums
		assetRelationKindEEnum = createEEnum(ASSET_RELATION_KIND);
		protectionLevelEEnum = createEEnum(PROTECTION_LEVEL);
		protectionNeedDerivationEEnum = createEEnum(PROTECTION_NEED_DERIVATION);
		measureKindEEnum = createEEnum(MEASURE_KIND);
		implementationStatusEEnum = createEEnum(IMPLEMENTATION_STATUS);
		coverageKindEEnum = createEEnum(COVERAGE_KIND);
		retentionTriggerEEnum = createEEnum(RETENTION_TRIGGER);
		retentionActionEEnum = createEEnum(RETENTION_ACTION);
		sourceKindEEnum = createEEnum(SOURCE_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ContextPackage theContextPackage = (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInventory_Id(), ecorePackage.getEString(), "id", null, 1, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_Description(), ecorePackage.getEString(), "description", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_Scope(), ecorePackage.getEString(), "scope", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInventory_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_Contexts(), theContextPackage.getContextRef(), null, "contexts", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_Assets(), this.getAsset(), null, "assets", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_Measures(), this.getMeasure(), null, "measures", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_Applicabilities(), this.getRequirementApplicability(), null, "applicabilities", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_ProcessingActivities(), this.getProcessingActivity(), null, "processingActivities", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_RiskMethodologies(), this.getRiskMethodology(), null, "riskMethodologies", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInventory_Aspects(), this.getAspect(), null, "aspects", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(aspectEClass, Aspect.class, "Aspect", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(assetEClass, Asset.class, "Asset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsset_Id(), ecorePackage.getEString(), "id", null, 1, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Name(), ecorePackage.getEString(), "name", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Description(), ecorePackage.getEString(), "description", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsset_Owner(), ecorePackage.getEString(), "owner", null, 0, 1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Categories(), theContextPackage.getCategoryRef(), null, "categories", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_ProtectionNeeds(), this.getProtectionNeedAssessment(), null, "protectionNeeds", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Relations(), this.getAssetRelation(), null, "relations", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Sources(), this.getSourceRef(), null, "sources", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAsset_Aspects(), this.getAspect(), null, "aspects", null, 0, -1, Asset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assetRelationEClass, AssetRelation.class, "AssetRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAssetRelation_Kind(), this.getAssetRelationKind(), "kind", null, 1, 1, AssetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssetRelation_Target(), this.getAsset(), null, "target", null, 1, 1, AssetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssetRelation_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, AssetRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(protectionNeedAssessmentEClass, ProtectionNeedAssessment.class, "ProtectionNeedAssessment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProtectionNeedAssessment_Confidentiality(), this.getProtectionLevel(), "confidentiality", null, 0, 1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionNeedAssessment_Integrity(), this.getProtectionLevel(), "integrity", null, 0, 1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionNeedAssessment_Availability(), this.getProtectionLevel(), "availability", null, 0, 1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionNeedAssessment_Derivation(), this.getProtectionNeedDerivation(), "derivation", null, 0, 1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProtectionNeedAssessment_DerivedFrom(), this.getAsset(), null, "derivedFrom", null, 0, -1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionNeedAssessment_Rationale(), ecorePackage.getEString(), "rationale", null, 0, 1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionNeedAssessment_AssessedBy(), ecorePackage.getEString(), "assessedBy", null, 0, 1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProtectionNeedAssessment_AssessedAt(), ecorePackage.getEString(), "assessedAt", null, 0, 1, ProtectionNeedAssessment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(measureEClass, Measure.class, "Measure", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMeasure_Id(), ecorePackage.getEString(), "id", null, 1, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Title(), ecorePackage.getEString(), "title", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Description(), ecorePackage.getEString(), "description", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Kind(), this.getMeasureKind(), "kind", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Categories(), theContextPackage.getCategoryRef(), null, "categories", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Satisfies(), theContextPackage.getRequirementRef(), null, "satisfies", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_AppliesTo(), this.getAsset(), null, "appliesTo", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Status(), this.getImplementationStatus(), "status", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_Responsible(), ecorePackage.getEString(), "responsible", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_ReviewedAt(), ecorePackage.getEString(), "reviewedAt", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMeasure_DueDate(), ecorePackage.getEString(), "dueDate", null, 0, 1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Evidence(), this.getSourceRef(), null, "evidence", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMeasure_Aspects(), this.getAspect(), null, "aspects", null, 0, -1, Measure.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementApplicabilityEClass, RequirementApplicability.class, "RequirementApplicability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementApplicability_Requirement(), theContextPackage.getRequirementRef(), null, "requirement", null, 1, 1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementApplicability_Applicable(), ecorePackage.getEBoolean(), "applicable", "true", 0, 1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementApplicability_Justification(), ecorePackage.getEString(), "justification", null, 0, 1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementApplicability_Status(), this.getImplementationStatus(), "status", null, 0, 1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementApplicability_Measures(), this.getMeasure(), null, "measures", null, 0, -1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementApplicability_Coverage(), this.getCoverageKind(), "coverage", null, 0, 1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementApplicability_DerivedFrom(), theContextPackage.getRequirementRef(), null, "derivedFrom", null, 0, -1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementApplicability_Assets(), this.getAsset(), null, "assets", null, 0, -1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementApplicability_DecidedBy(), ecorePackage.getEString(), "decidedBy", null, 0, 1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementApplicability_DecidedAt(), ecorePackage.getEString(), "decidedAt", null, 0, 1, RequirementApplicability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(processingActivityEClass, ProcessingActivity.class, "ProcessingActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcessingActivity_Id(), ecorePackage.getEString(), "id", null, 1, 1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingActivity_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingActivity_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingActivity_Controller(), ecorePackage.getEString(), "controller", null, 0, 1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingActivity_LawfulBases(), theContextPackage.getCategoryRef(), null, "lawfulBases", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingActivity_DataCategories(), theContextPackage.getCategoryRef(), null, "dataCategories", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingActivity_DataSubjects(), ecorePackage.getEString(), "dataSubjects", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingActivity_Recipients(), ecorePackage.getEString(), "recipients", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingActivity_ThirdCountryTransfers(), ecorePackage.getEString(), "thirdCountryTransfers", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProcessingActivity_Retention(), ecorePackage.getEString(), "retention", null, 0, 1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingActivity_RetentionRules(), this.getRetentionRule(), null, "retentionRules", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingActivity_Models(), this.getSourceRef(), null, "models", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingActivity_Assets(), this.getAsset(), null, "assets", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingActivity_Measures(), this.getMeasure(), null, "measures", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessingActivity_Aspects(), this.getAspect(), null, "aspects", null, 0, -1, ProcessingActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(retentionRuleEClass, RetentionRule.class, "RetentionRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRetentionRule_Id(), ecorePackage.getEString(), "id", null, 1, 1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetentionRule_DataCategories(), theContextPackage.getCategoryRef(), null, "dataCategories", null, 0, -1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetentionRule_Period(), ecorePackage.getEString(), "period", null, 0, 1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetentionRule_Trigger(), this.getRetentionTrigger(), "trigger", null, 1, 1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetentionRule_TriggerDescription(), ecorePackage.getEString(), "triggerDescription", null, 0, 1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetentionRule_Action(), this.getRetentionAction(), "action", null, 1, 1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetentionRule_LegalReference(), ecorePackage.getEString(), "legalReference", null, 0, 1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRetentionRule_Justification(), ecorePackage.getEString(), "justification", null, 0, 1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetentionRule_Assets(), this.getAsset(), null, "assets", null, 0, -1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRetentionRule_EnforcedBy(), this.getMeasure(), null, "enforcedBy", null, 0, -1, RetentionRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceRefEClass, SourceRef.class, "SourceRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSourceRef_Kind(), this.getSourceKind(), "kind", null, 1, 1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceRef_Format(), ecorePackage.getEString(), "format", null, 0, 1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceRef_Uri(), ecorePackage.getEString(), "uri", null, 1, 1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceRef_Fingerprint(), ecorePackage.getEString(), "fingerprint", null, 0, 1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSourceRef_Name(), ecorePackage.getEString(), "name", null, 0, 1, SourceRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskMethodologyEClass, RiskMethodology.class, "RiskMethodology", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskMethodology_Id(), ecorePackage.getEString(), "id", null, 1, 1, RiskMethodology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskMethodology_Name(), ecorePackage.getEString(), "name", null, 0, 1, RiskMethodology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskMethodology_Description(), ecorePackage.getEString(), "description", null, 0, 1, RiskMethodology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMethodology_Likelihood(), this.getRiskScale(), null, "likelihood", null, 1, 1, RiskMethodology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMethodology_Severity(), this.getRiskScale(), null, "severity", null, 1, 1, RiskMethodology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMethodology_Risk(), this.getRiskScale(), null, "risk", null, 1, 1, RiskMethodology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMethodology_Matrix(), this.getRiskMatrixCell(), null, "matrix", null, 0, -1, RiskMethodology.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskScaleEClass, RiskScale.class, "RiskScale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskScale_Name(), ecorePackage.getEString(), "name", null, 0, 1, RiskScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskScale_Levels(), this.getRiskLevel(), null, "levels", null, 0, -1, RiskScale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskLevelEClass, RiskLevel.class, "RiskLevel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRiskLevel_Id(), ecorePackage.getEString(), "id", null, 1, 1, RiskLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskLevel_Name(), ecorePackage.getEString(), "name", null, 0, 1, RiskLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskLevel_Rank(), ecorePackage.getEInt(), "rank", null, 0, 1, RiskLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRiskLevel_Description(), ecorePackage.getEString(), "description", null, 0, 1, RiskLevel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(riskMatrixCellEClass, RiskMatrixCell.class, "RiskMatrixCell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRiskMatrixCell_Likelihood(), this.getRiskLevel(), null, "likelihood", null, 1, 1, RiskMatrixCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMatrixCell_Severity(), this.getRiskLevel(), null, "severity", null, 1, 1, RiskMatrixCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRiskMatrixCell_Risk(), this.getRiskLevel(), null, "risk", null, 1, 1, RiskMatrixCell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(assetRelationKindEEnum, AssetRelationKind.class, "AssetRelationKind");
		addEEnumLiteral(assetRelationKindEEnum, AssetRelationKind.DEPENDS_ON);
		addEEnumLiteral(assetRelationKindEEnum, AssetRelationKind.RUNS_ON);
		addEEnumLiteral(assetRelationKindEEnum, AssetRelationKind.CONNECTS_TO);
		addEEnumLiteral(assetRelationKindEEnum, AssetRelationKind.PART_OF);

		initEEnum(protectionLevelEEnum, ProtectionLevel.class, "ProtectionLevel");
		addEEnumLiteral(protectionLevelEEnum, ProtectionLevel.NORMAL);
		addEEnumLiteral(protectionLevelEEnum, ProtectionLevel.HIGH);
		addEEnumLiteral(protectionLevelEEnum, ProtectionLevel.VERY_HIGH);

		initEEnum(protectionNeedDerivationEEnum, ProtectionNeedDerivation.class, "ProtectionNeedDerivation");
		addEEnumLiteral(protectionNeedDerivationEEnum, ProtectionNeedDerivation.ASSESSED);
		addEEnumLiteral(protectionNeedDerivationEEnum, ProtectionNeedDerivation.MAXIMUM_PRINCIPLE);
		addEEnumLiteral(protectionNeedDerivationEEnum, ProtectionNeedDerivation.CUMULATION);
		addEEnumLiteral(protectionNeedDerivationEEnum, ProtectionNeedDerivation.DISTRIBUTION);

		initEEnum(measureKindEEnum, MeasureKind.class, "MeasureKind");
		addEEnumLiteral(measureKindEEnum, MeasureKind.TECHNICAL);
		addEEnumLiteral(measureKindEEnum, MeasureKind.ORGANISATIONAL);

		initEEnum(implementationStatusEEnum, ImplementationStatus.class, "ImplementationStatus");
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.PLANNED);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.PARTIAL);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.IMPLEMENTED);
		addEEnumLiteral(implementationStatusEEnum, ImplementationStatus.NOT_IMPLEMENTED);

		initEEnum(coverageKindEEnum, CoverageKind.class, "CoverageKind");
		addEEnumLiteral(coverageKindEEnum, CoverageKind.DIRECT);
		addEEnumLiteral(coverageKindEEnum, CoverageKind.DERIVED);
		addEEnumLiteral(coverageKindEEnum, CoverageKind.CONFIRMED);

		initEEnum(retentionTriggerEEnum, RetentionTrigger.class, "RetentionTrigger");
		addEEnumLiteral(retentionTriggerEEnum, RetentionTrigger.COLLECTION);
		addEEnumLiteral(retentionTriggerEEnum, RetentionTrigger.END_OF_PURPOSE);
		addEEnumLiteral(retentionTriggerEEnum, RetentionTrigger.END_OF_CONTRACT);
		addEEnumLiteral(retentionTriggerEEnum, RetentionTrigger.ACCOUNT_DELETION);
		addEEnumLiteral(retentionTriggerEEnum, RetentionTrigger.END_OF_CALENDAR_YEAR);
		addEEnumLiteral(retentionTriggerEEnum, RetentionTrigger.EVENT);
		addEEnumLiteral(retentionTriggerEEnum, RetentionTrigger.INDEFINITE);

		initEEnum(retentionActionEEnum, RetentionAction.class, "RetentionAction");
		addEEnumLiteral(retentionActionEEnum, RetentionAction.DELETE);
		addEEnumLiteral(retentionActionEEnum, RetentionAction.ANONYMISE);
		addEEnumLiteral(retentionActionEEnum, RetentionAction.PSEUDONYMISE);
		addEEnumLiteral(retentionActionEEnum, RetentionAction.RESTRICT);
		addEEnumLiteral(retentionActionEEnum, RetentionAction.ARCHIVE);

		initEEnum(sourceKindEEnum, SourceKind.class, "SourceKind");
		addEEnumLiteral(sourceKindEEnum, SourceKind.SERVICE_SPEC);
		addEEnumLiteral(sourceKindEEnum, SourceKind.DEPLOYMENT);
		addEEnumLiteral(sourceKindEEnum, SourceKind.EPACKAGE);
		addEEnumLiteral(sourceKindEEnum, SourceKind.TRANSFORMATION);
		addEEnumLiteral(sourceKindEEnum, SourceKind.REPORT);
		addEEnumLiteral(sourceKindEEnum, SourceKind.DOCUMENT);
		addEEnumLiteral(sourceKindEEnum, SourceKind.DATASET);
		addEEnumLiteral(sourceKindEEnum, SourceKind.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "The shared compliance facts of an information domain (Informationsverbund): assets, protection needs, measures (TOMs), applicability of requirements, processing activities and the risk methodology. Independent of any context; requirements and categories are referred to by id."
		   });
		addAnnotation
		  (inventoryEClass,
		   source,
		   new String[] {
			   "documentation", "One information domain (Informationsverbund) and its compliance facts."
		   });
		addAnnotation
		  (getInventory_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier of the inventory."
		   });
		addAnnotation
		  (getInventory_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getInventory_Description(),
		   source,
		   new String[] {
			   "documentation", "What the inventory covers."
		   });
		addAnnotation
		  (getInventory_Scope(),
		   source,
		   new String[] {
			   "documentation", "Scope statement as used in an ISMS or SoA."
		   });
		addAnnotation
		  (getInventory_Owner(),
		   source,
		   new String[] {
			   "documentation", "Responsible role or person."
		   });
		addAnnotation
		  (getInventory_Contexts(),
		   source,
		   new String[] {
			   "documentation", "The contexts the inventory is assessed against."
		   });
		addAnnotation
		  (getInventory_Assets(),
		   source,
		   new String[] {
			   "documentation", "The assets."
		   });
		addAnnotation
		  (getInventory_Measures(),
		   source,
		   new String[] {
			   "documentation", "The measures (TOMs)."
		   });
		addAnnotation
		  (getInventory_Applicabilities(),
		   source,
		   new String[] {
			   "documentation", "Applicability and coverage per requirement."
		   });
		addAnnotation
		  (getInventory_ProcessingActivities(),
		   source,
		   new String[] {
			   "documentation", "The record of processing activities."
		   });
		addAnnotation
		  (getInventory_RiskMethodologies(),
		   source,
		   new String[] {
			   "documentation", "Risk methodologies used by findings of this inventory."
		   });
		addAnnotation
		  (getInventory_Aspects(),
		   source,
		   new String[] {
			   "documentation", "Context-specific extensions."
		   });
		addAnnotation
		  (aspectEClass,
		   source,
		   new String[] {
			   "documentation", "Abstract supertype of context-specific extensions (AI Act, CRA, KRITIS, GDPR, ...), contributed by separate packages and attached by composition."
		   });
		addAnnotation
		  (assetRelationKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How one asset relates to another; used to inherit protection needs."
		   });
		addAnnotation
		  (assetRelationKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The asset needs the target to work."
		   });
		addAnnotation
		  (assetRelationKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The asset runs on the target, e.g. a container on a host."
		   });
		addAnnotation
		  (assetRelationKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The asset communicates with the target."
		   });
		addAnnotation
		  (assetRelationKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The asset is part of the target."
		   });
		addAnnotation
		  (assetEClass,
		   source,
		   new String[] {
			   "documentation", "Something to protect: a host, a container, a network, a volume, an application, a data set. Generated from deployment and service specifications where possible, then curated."
		   });
		addAnnotation
		  (getAsset_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures and processing activities, so references are written by id and survive reordering."
		   });
		addAnnotation
		  (getAsset_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getAsset_Description(),
		   source,
		   new String[] {
			   "documentation", "Description."
		   });
		addAnnotation
		  (getAsset_Owner(),
		   source,
		   new String[] {
			   "documentation", "Responsible role or person."
		   });
		addAnnotation
		  (getAsset_Categories(),
		   source,
		   new String[] {
			   "documentation", "Classification, e.g. the BSI target object type."
		   });
		addAnnotation
		  (getAsset_ProtectionNeeds(),
		   source,
		   new String[] {
			   "documentation", "Protection need assessments, oldest first. The last one is current."
		   });
		addAnnotation
		  (getAsset_Relations(),
		   source,
		   new String[] {
			   "documentation", "Relations to other assets."
		   });
		addAnnotation
		  (getAsset_Sources(),
		   source,
		   new String[] {
			   "documentation", "Where the asset is defined."
		   });
		addAnnotation
		  (getAsset_Aspects(),
		   source,
		   new String[] {
			   "documentation", "Context-specific extensions."
		   });
		addAnnotation
		  (assetRelationEClass,
		   source,
		   new String[] {
			   "documentation", "A typed relation from the owning asset to another asset."
		   });
		addAnnotation
		  (getAssetRelation_Kind(),
		   source,
		   new String[] {
			   "documentation", "Kind of relation."
		   });
		addAnnotation
		  (getAssetRelation_Target(),
		   source,
		   new String[] {
			   "documentation", "The related asset."
		   });
		addAnnotation
		  (getAssetRelation_Rationale(),
		   source,
		   new String[] {
			   "documentation", "Why the relation exists."
		   });
		addAnnotation
		  (protectionLevelEEnum,
		   source,
		   new String[] {
			   "documentation", "Protection need level (BSI 200-2)."
		   });
		addAnnotation
		  (protectionLevelEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Damage would be limited and manageable."
		   });
		addAnnotation
		  (protectionLevelEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Damage could be considerable."
		   });
		addAnnotation
		  (protectionLevelEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Damage could be existentially threatening or catastrophic."
		   });
		addAnnotation
		  (protectionNeedDerivationEEnum,
		   source,
		   new String[] {
			   "documentation", "How a protection need was determined."
		   });
		addAnnotation
		  (protectionNeedDerivationEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Assessed directly."
		   });
		addAnnotation
		  (protectionNeedDerivationEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Inherited as the maximum of the assets it supports."
		   });
		addAnnotation
		  (protectionNeedDerivationEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Raised because many assets of lower need add up."
		   });
		addAnnotation
		  (protectionNeedDerivationEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Lowered because the load is distributed, e.g. redundancy."
		   });
		addAnnotation
		  (protectionNeedAssessmentEClass,
		   source,
		   new String[] {
			   "documentation", "One assessment of the protection need of an asset."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_Confidentiality(),
		   source,
		   new String[] {
			   "documentation", "Need for confidentiality."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_Integrity(),
		   source,
		   new String[] {
			   "documentation", "Need for integrity."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_Availability(),
		   source,
		   new String[] {
			   "documentation", "Need for availability."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_Derivation(),
		   source,
		   new String[] {
			   "documentation", "How the levels were determined."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_DerivedFrom(),
		   source,
		   new String[] {
			   "documentation", "Assets the levels were inherited from."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_Rationale(),
		   source,
		   new String[] {
			   "documentation", "Why these levels."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_AssessedBy(),
		   source,
		   new String[] {
			   "documentation", "Who assessed."
		   });
		addAnnotation
		  (getProtectionNeedAssessment_AssessedAt(),
		   source,
		   new String[] {
			   "documentation", "When, as ISO-8601 date-time."
		   });
		addAnnotation
		  (measureKindEEnum,
		   source,
		   new String[] {
			   "documentation", "Kind of measure."
		   });
		addAnnotation
		  (measureKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Technical measure."
		   });
		addAnnotation
		  (measureKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Organisational measure."
		   });
		addAnnotation
		  (implementationStatusEEnum,
		   source,
		   new String[] {
			   "documentation", "Implementation status of a measure or a requirement."
		   });
		addAnnotation
		  (implementationStatusEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Planned, not started."
		   });
		addAnnotation
		  (implementationStatusEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Partly implemented."
		   });
		addAnnotation
		  (implementationStatusEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Implemented."
		   });
		addAnnotation
		  (implementationStatusEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Not implemented and not planned."
		   });
		addAnnotation
		  (measureEClass,
		   source,
		   new String[] {
			   "documentation", "A technical or organisational measure (TOM). One measure can satisfy requirements of several contexts at once; applicability is not a property of the measure but of the requirement (RequirementApplicability)."
		   });
		addAnnotation
		  (getMeasure_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures and processing activities, so references are written by id and survive reordering."
		   });
		addAnnotation
		  (getMeasure_Title(),
		   source,
		   new String[] {
			   "documentation", "Title."
		   });
		addAnnotation
		  (getMeasure_Description(),
		   source,
		   new String[] {
			   "documentation", "What is done."
		   });
		addAnnotation
		  (getMeasure_Kind(),
		   source,
		   new String[] {
			   "documentation", "Technical or organisational."
		   });
		addAnnotation
		  (getMeasure_Categories(),
		   source,
		   new String[] {
			   "documentation", "Classification, e.g. the GDPR Art. 32 aspects."
		   });
		addAnnotation
		  (getMeasure_Satisfies(),
		   source,
		   new String[] {
			   "documentation", "Requirements the measure satisfies directly."
		   });
		addAnnotation
		  (getMeasure_AppliesTo(),
		   source,
		   new String[] {
			   "documentation", "Assets the measure protects."
		   });
		addAnnotation
		  (getMeasure_Status(),
		   source,
		   new String[] {
			   "documentation", "Implementation status."
		   });
		addAnnotation
		  (getMeasure_Responsible(),
		   source,
		   new String[] {
			   "documentation", "Responsible role or person."
		   });
		addAnnotation
		  (getMeasure_ReviewedAt(),
		   source,
		   new String[] {
			   "documentation", "Last review, as ISO-8601 date."
		   });
		addAnnotation
		  (getMeasure_DueDate(),
		   source,
		   new String[] {
			   "documentation", "Planned completion, as ISO-8601 date."
		   });
		addAnnotation
		  (getMeasure_Evidence(),
		   source,
		   new String[] {
			   "documentation", "Evidence of implementation."
		   });
		addAnnotation
		  (getMeasure_Aspects(),
		   source,
		   new String[] {
			   "documentation", "Context-specific extensions."
		   });
		addAnnotation
		  (coverageKindEEnum,
		   source,
		   new String[] {
			   "documentation", "How a requirement is covered by measures."
		   });
		addAnnotation
		  (coverageKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A measure satisfies the requirement directly."
		   });
		addAnnotation
		  (coverageKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Covered through a crosswalk (EQUIVALENT or SUPERSET) from a requirement of another context, not yet confirmed."
		   });
		addAnnotation
		  (coverageKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Derived coverage a person has confirmed."
		   });
		addAnnotation
		  (requirementApplicabilityEClass,
		   source,
		   new String[] {
			   "documentation", "Applicability and coverage of one requirement for the inventory: the row of a Statement of Applicability (ISO 27001), the result of the Grundschutz modelling, or the coverage view of a legal context."
		   });
		addAnnotation
		  (getRequirementApplicability_Requirement(),
		   source,
		   new String[] {
			   "documentation", "The requirement."
		   });
		addAnnotation
		  (getRequirementApplicability_Applicable(),
		   source,
		   new String[] {
			   "documentation", "Whether the requirement applies."
		   });
		addAnnotation
		  (getRequirementApplicability_Justification(),
		   source,
		   new String[] {
			   "documentation", "Why it applies or not. Required when not applicable."
		   });
		addAnnotation
		  (getRequirementApplicability_Status(),
		   source,
		   new String[] {
			   "documentation", "Implementation status. Derived from the measures when unset."
		   });
		addAnnotation
		  (getRequirementApplicability_Measures(),
		   source,
		   new String[] {
			   "documentation", "Measures that implement the requirement."
		   });
		addAnnotation
		  (getRequirementApplicability_Coverage(),
		   source,
		   new String[] {
			   "documentation", "How the requirement is covered."
		   });
		addAnnotation
		  (getRequirementApplicability_DerivedFrom(),
		   source,
		   new String[] {
			   "documentation", "For DERIVED / CONFIRMED coverage: the requirements of other contexts the coverage was derived from."
		   });
		addAnnotation
		  (getRequirementApplicability_Assets(),
		   source,
		   new String[] {
			   "documentation", "Narrows the applicability to these assets, e.g. target objects in the Grundschutz modelling. Empty means the whole inventory."
		   });
		addAnnotation
		  (getRequirementApplicability_DecidedBy(),
		   source,
		   new String[] {
			   "documentation", "Who decided."
		   });
		addAnnotation
		  (getRequirementApplicability_DecidedAt(),
		   source,
		   new String[] {
			   "documentation", "When, as ISO-8601 date-time."
		   });
		addAnnotation
		  (processingActivityEClass,
		   source,
		   new String[] {
			   "documentation", "One record of processing activities (GDPR Art. 30)."
		   });
		addAnnotation
		  (getProcessingActivity_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures and processing activities, so references are written by id and survive reordering."
		   });
		addAnnotation
		  (getProcessingActivity_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getProcessingActivity_Purpose(),
		   source,
		   new String[] {
			   "documentation", "Purpose of the processing (Art. 5(1)(b))."
		   });
		addAnnotation
		  (getProcessingActivity_Controller(),
		   source,
		   new String[] {
			   "documentation", "Controller, joint controllers or processor."
		   });
		addAnnotation
		  (getProcessingActivity_LawfulBases(),
		   source,
		   new String[] {
			   "documentation", "Lawful bases, from the lawful-basis taxonomy of the GDPR context."
		   });
		addAnnotation
		  (getProcessingActivity_DataCategories(),
		   source,
		   new String[] {
			   "documentation", "Categories of personal data."
		   });
		addAnnotation
		  (getProcessingActivity_DataSubjects(),
		   source,
		   new String[] {
			   "documentation", "Categories of data subjects."
		   });
		addAnnotation
		  (getProcessingActivity_Recipients(),
		   source,
		   new String[] {
			   "documentation", "Categories of recipients."
		   });
		addAnnotation
		  (getProcessingActivity_ThirdCountryTransfers(),
		   source,
		   new String[] {
			   "documentation", "Transfers to third countries and the safeguards."
		   });
		addAnnotation
		  (getProcessingActivity_Retention(),
		   source,
		   new String[] {
			   "documentation", "Retention periods as a human-readable summary. The checkable form is retentionRules."
		   });
		addAnnotation
		  (getProcessingActivity_RetentionRules(),
		   source,
		   new String[] {
			   "documentation", "Structured retention rules, one per group of data categories with the same period."
		   });
		addAnnotation
		  (getProcessingActivity_Models(),
		   source,
		   new String[] {
			   "documentation", "The EPackages and transformations whose reviews belong to the activity."
		   });
		addAnnotation
		  (getProcessingActivity_Assets(),
		   source,
		   new String[] {
			   "documentation", "Assets involved."
		   });
		addAnnotation
		  (getProcessingActivity_Measures(),
		   source,
		   new String[] {
			   "documentation", "Measures protecting the processing."
		   });
		addAnnotation
		  (getProcessingActivity_Aspects(),
		   source,
		   new String[] {
			   "documentation", "Context-specific extensions, e.g. a DPIA."
		   });
		addAnnotation
		  (retentionRuleEClass,
		   source,
		   new String[] {
			   "documentation", "One retention rule of a processing activity: how long which data is kept, when the period starts, what happens at its end, and which measure enforces it. Makes storage limitation (GDPR Art. 5(1)(e)) and erasure (Art. 17) checkable."
		   });
		addAnnotation
		  (getRetentionRule_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the inventory. EMF ID: unique within the whole inventory resource, also across assets, measures, processing activities and other retention rules; a prefix such as ret: avoids collisions."
		   });
		addAnnotation
		  (getRetentionRule_DataCategories(),
		   source,
		   new String[] {
			   "documentation", "Which data the rule covers, from the data-category taxonomy of the GDPR context. Empty means all data of the processing activity."
		   });
		addAnnotation
		  (getRetentionRule_Period(),
		   source,
		   new String[] {
			   "documentation", "Retention period as an ISO 8601 duration, e.g. P30D, P24M, P10Y; maps to java.time.Period or Duration. Empty only with trigger INDEFINITE. The format is checked by validation, not by the model."
		   });
		addAnnotation
		  (getRetentionRule_Trigger(),
		   source,
		   new String[] {
			   "documentation", "When the period starts."
		   });
		addAnnotation
		  (getRetentionRule_TriggerDescription(),
		   source,
		   new String[] {
			   "documentation", "The concrete event that starts the period, for trigger EVENT."
		   });
		addAnnotation
		  (getRetentionRule_Action(),
		   source,
		   new String[] {
			   "documentation", "What happens to the data when the period ends."
		   });
		addAnnotation
		  (getRetentionRule_LegalReference(),
		   source,
		   new String[] {
			   "documentation", "Legal basis for the period, e.g. \"\u00a7 257 HGB\", \"\u00a7 147 AO\", \"Art. 17(3)(b) GDPR\". Free text, because these laws are not contexts."
		   });
		addAnnotation
		  (getRetentionRule_Justification(),
		   source,
		   new String[] {
			   "documentation", "Why the period is necessary. Required in practice for trigger INDEFINITE."
		   });
		addAnnotation
		  (getRetentionRule_Assets(),
		   source,
		   new String[] {
			   "documentation", "Where the data covered by the rule is stored."
		   });
		addAnnotation
		  (getRetentionRule_EnforcedBy(),
		   source,
		   new String[] {
			   "documentation", "The measures (TOMs) that implement the action, e.g. a deletion job. A rule without one is reported as a finding."
		   });
		addAnnotation
		  (retentionTriggerEEnum,
		   source,
		   new String[] {
			   "documentation", "When the retention period of a rule starts."
		   });
		addAnnotation
		  (retentionTriggerEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The period starts when the data is collected."
		   });
		addAnnotation
		  (retentionTriggerEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The period starts when the purpose of the processing is fulfilled."
		   });
		addAnnotation
		  (retentionTriggerEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The period starts when the contract with the data subject ends."
		   });
		addAnnotation
		  (retentionTriggerEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "The period starts when the account of the data subject is deleted."
		   });
		addAnnotation
		  (retentionTriggerEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "The period starts at the end of the calendar year in which the data was created, as for statutory retention under HGB and AO."
		   });
		addAnnotation
		  (retentionTriggerEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "The period starts with another event, described in triggerDescription."
		   });
		addAnnotation
		  (retentionTriggerEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "The data is kept without a time limit. Requires a justification."
		   });
		addAnnotation
		  (retentionActionEEnum,
		   source,
		   new String[] {
			   "documentation", "What happens to the data when the retention period ends."
		   });
		addAnnotation
		  (retentionActionEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "The data is deleted (Art. 17)."
		   });
		addAnnotation
		  (retentionActionEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The data is anonymised, so it is no longer personal data."
		   });
		addAnnotation
		  (retentionActionEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The data is pseudonymised (Art. 4(5))."
		   });
		addAnnotation
		  (retentionActionEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Processing is restricted (Art. 18)."
		   });
		addAnnotation
		  (retentionActionEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "The data is moved to an archive with restricted access."
		   });
		addAnnotation
		  (sourceKindEEnum,
		   source,
		   new String[] {
			   "documentation", "What a SourceRef points at."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "A service specification."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A deployment or service binding."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "An EPackage, by nsURI."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "A transformation unit."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "A compliance report."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(5),
		   source,
		   new String[] {
			   "documentation", "A document, e.g. a policy."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(6),
		   source,
		   new String[] {
			   "documentation", "A data set, e.g. a DCAT dataset."
		   });
		addAnnotation
		  (sourceKindEEnum.getELiterals().get(7),
		   source,
		   new String[] {
			   "documentation", "Anything else."
		   });
		addAnnotation
		  (sourceRefEClass,
		   source,
		   new String[] {
			   "documentation", "Loose reference to a defining or evidencing artifact, without a dependency on its model. A changed fingerprint shows that the source changed."
		   });
		addAnnotation
		  (getSourceRef_Kind(),
		   source,
		   new String[] {
			   "documentation", "What role the artifact plays."
		   });
		addAnnotation
		  (getSourceRef_Format(),
		   source,
		   new String[] {
			   "documentation", "Technical format of the artifact, free text so that the model stays independent of a runtime or tool. Common values: quadlet, compose, kubernetes, helm, terraform, xmi, ecore, json, yaml, pdf."
		   });
		addAnnotation
		  (getSourceRef_Uri(),
		   source,
		   new String[] {
			   "documentation", "URI of the artifact, e.g. the nsURI of an EPackage."
		   });
		addAnnotation
		  (getSourceRef_Fingerprint(),
		   source,
		   new String[] {
			   "documentation", "Fingerprint of the revision referenced."
		   });
		addAnnotation
		  (getSourceRef_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (riskMethodologyEClass,
		   source,
		   new String[] {
			   "documentation", "Scales and matrix used to assess risks, e.g. BSI 200-3 (four levels each). Findings refer to it by id and to its levels by id."
		   });
		addAnnotation
		  (getRiskMethodology_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the inventory."
		   });
		addAnnotation
		  (getRiskMethodology_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getRiskMethodology_Description(),
		   source,
		   new String[] {
			   "documentation", "Description."
		   });
		addAnnotation
		  (getRiskMethodology_Likelihood(),
		   source,
		   new String[] {
			   "documentation", "Scale for the likelihood (frequency)."
		   });
		addAnnotation
		  (getRiskMethodology_Severity(),
		   source,
		   new String[] {
			   "documentation", "Scale for the severity (impact)."
		   });
		addAnnotation
		  (getRiskMethodology_Risk(),
		   source,
		   new String[] {
			   "documentation", "Scale for the resulting risk."
		   });
		addAnnotation
		  (getRiskMethodology_Matrix(),
		   source,
		   new String[] {
			   "documentation", "Which risk level a combination of likelihood and severity yields."
		   });
		addAnnotation
		  (riskScaleEClass,
		   source,
		   new String[] {
			   "documentation", "An ordered scale."
		   });
		addAnnotation
		  (getRiskScale_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getRiskScale_Levels(),
		   source,
		   new String[] {
			   "documentation", "Levels, lowest first."
		   });
		addAnnotation
		  (riskLevelEClass,
		   source,
		   new String[] {
			   "documentation", "One level of a scale."
		   });
		addAnnotation
		  (getRiskLevel_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the methodology."
		   });
		addAnnotation
		  (getRiskLevel_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getRiskLevel_Rank(),
		   source,
		   new String[] {
			   "documentation", "Position on the scale, 1 is lowest."
		   });
		addAnnotation
		  (getRiskLevel_Description(),
		   source,
		   new String[] {
			   "documentation", "What the level means."
		   });
		addAnnotation
		  (riskMatrixCellEClass,
		   source,
		   new String[] {
			   "documentation", "One cell of the risk matrix."
		   });
		addAnnotation
		  (getRiskMatrixCell_Likelihood(),
		   source,
		   new String[] {
			   "documentation", "Level on the likelihood scale."
		   });
		addAnnotation
		  (getRiskMatrixCell_Severity(),
		   source,
		   new String[] {
			   "documentation", "Level on the severity scale."
		   });
		addAnnotation
		  (getRiskMatrixCell_Risk(),
		   source,
		   new String[] {
			   "documentation", "Resulting level on the risk scale."
		   });
	}

} //InventoryPackageImpl
