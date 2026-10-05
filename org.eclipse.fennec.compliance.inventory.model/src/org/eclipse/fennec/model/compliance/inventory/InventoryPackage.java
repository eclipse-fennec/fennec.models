/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.compliance.inventory;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The shared compliance facts of an information domain (Informationsverbund): assets, protection needs, measures (TOMs), applicability of requirements, processing activities and the risk methodology. Independent of any context; requirements and categories are referred to by id.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = InventoryPackage.eNS_URI, fingerprint = "fp1:8498e5f1573230603dde2a0f1f38a46efccfb14af28e19eaf75857a02a3112d2", genModel = "/model/inventory.genmodel", genModelSourceLocations = {"model/inventory.genmodel","org.eclipse.fennec.compliance.inventory.model/model/inventory.genmodel"}, ecore = "/model/inventory.ecore", ecoreSourceLocations = "/model/inventory.ecore")
public interface InventoryPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inventory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.eclipse/fennec/compliance/inventory/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inventory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InventoryPackage eINSTANCE = org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__SCOPE = 3;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__OWNER = 4;

	/**
	 * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__CONTEXTS = 5;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ASSETS = 6;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__MEASURES = 7;

	/**
	 * The feature id for the '<em><b>Applicabilities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__APPLICABILITIES = 8;

	/**
	 * The feature id for the '<em><b>Processing Activities</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__PROCESSING_ACTIVITIES = 9;

	/**
	 * The feature id for the '<em><b>Risk Methodologies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__RISK_METHODOLOGIES = 10;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ASPECTS = 11;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.AspectImpl <em>Aspect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.AspectImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAspect()
	 * @generated
	 */
	int ASPECT = 1;

	/**
	 * The number of structural features of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Aspect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASPECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl <em>Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAsset()
	 * @generated
	 */
	int ASSET = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__OWNER = 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__CATEGORIES = 4;

	/**
	 * The feature id for the '<em><b>Protection Needs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__PROTECTION_NEEDS = 5;

	/**
	 * The feature id for the '<em><b>Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__RELATIONS = 6;

	/**
	 * The feature id for the '<em><b>Sources</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__SOURCES = 7;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET__ASPECTS = 8;

	/**
	 * The number of structural features of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetRelationImpl <em>Asset Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.AssetRelationImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAssetRelation()
	 * @generated
	 */
	int ASSET_RELATION = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_RELATION__KIND = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_RELATION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_RELATION__RATIONALE = 2;

	/**
	 * The number of structural features of the '<em>Asset Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_RELATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Asset Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSET_RELATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl <em>Protection Need Assessment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProtectionNeedAssessment()
	 * @generated
	 */
	int PROTECTION_NEED_ASSESSMENT = 4;

	/**
	 * The feature id for the '<em><b>Confidentiality</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY = 0;

	/**
	 * The feature id for the '<em><b>Integrity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__INTEGRITY = 1;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__AVAILABILITY = 2;

	/**
	 * The feature id for the '<em><b>Derivation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__DERIVATION = 3;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__DERIVED_FROM = 4;

	/**
	 * The feature id for the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__RATIONALE = 5;

	/**
	 * The feature id for the '<em><b>Assessed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__ASSESSED_BY = 6;

	/**
	 * The feature id for the '<em><b>Assessed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT__ASSESSED_AT = 7;

	/**
	 * The number of structural features of the '<em>Protection Need Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Protection Need Assessment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROTECTION_NEED_ASSESSMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl <em>Measure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getMeasure()
	 * @generated
	 */
	int MEASURE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__KIND = 3;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__CATEGORIES = 4;

	/**
	 * The feature id for the '<em><b>Satisfies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__SATISFIES = 5;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__APPLIES_TO = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__STATUS = 7;

	/**
	 * The feature id for the '<em><b>Responsible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__RESPONSIBLE = 8;

	/**
	 * The feature id for the '<em><b>Reviewed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__REVIEWED_AT = 9;

	/**
	 * The feature id for the '<em><b>Due Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__DUE_DATE = 10;

	/**
	 * The feature id for the '<em><b>Evidence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__EVIDENCE = 11;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE__ASPECTS = 12;

	/**
	 * The number of structural features of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Measure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEASURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl <em>Requirement Applicability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRequirementApplicability()
	 * @generated
	 */
	int REQUIREMENT_APPLICABILITY = 6;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__REQUIREMENT = 0;

	/**
	 * The feature id for the '<em><b>Applicable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__APPLICABLE = 1;

	/**
	 * The feature id for the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__JUSTIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__STATUS = 3;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__MEASURES = 4;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__COVERAGE = 5;

	/**
	 * The feature id for the '<em><b>Derived From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__DERIVED_FROM = 6;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__ASSETS = 7;

	/**
	 * The feature id for the '<em><b>Decided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__DECIDED_BY = 8;

	/**
	 * The feature id for the '<em><b>Decided At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY__DECIDED_AT = 9;

	/**
	 * The number of structural features of the '<em>Requirement Applicability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>Requirement Applicability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_APPLICABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl <em>Processing Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProcessingActivity()
	 * @generated
	 */
	int PROCESSING_ACTIVITY = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__PURPOSE = 2;

	/**
	 * The feature id for the '<em><b>Controller</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__CONTROLLER = 3;

	/**
	 * The feature id for the '<em><b>Lawful Bases</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__LAWFUL_BASES = 4;

	/**
	 * The feature id for the '<em><b>Data Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__DATA_CATEGORIES = 5;

	/**
	 * The feature id for the '<em><b>Data Subjects</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__DATA_SUBJECTS = 6;

	/**
	 * The feature id for the '<em><b>Recipients</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__RECIPIENTS = 7;

	/**
	 * The feature id for the '<em><b>Third Country Transfers</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS = 8;

	/**
	 * The feature id for the '<em><b>Retention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__RETENTION = 9;

	/**
	 * The feature id for the '<em><b>Models</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__MODELS = 10;

	/**
	 * The feature id for the '<em><b>Assets</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__ASSETS = 11;

	/**
	 * The feature id for the '<em><b>Measures</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__MEASURES = 12;

	/**
	 * The feature id for the '<em><b>Aspects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY__ASPECTS = 13;

	/**
	 * The number of structural features of the '<em>Processing Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Processing Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSING_ACTIVITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.SourceRefImpl <em>Source Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.SourceRefImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getSourceRef()
	 * @generated
	 */
	int SOURCE_REF = 8;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__KIND = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__URI = 2;

	/**
	 * The feature id for the '<em><b>Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__FINGERPRINT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF__NAME = 4;

	/**
	 * The number of structural features of the '<em>Source Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Source Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl <em>Risk Methodology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskMethodology()
	 * @generated
	 */
	int RISK_METHODOLOGY = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY__LIKELIHOOD = 3;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY__SEVERITY = 4;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY__RISK = 5;

	/**
	 * The feature id for the '<em><b>Matrix</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY__MATRIX = 6;

	/**
	 * The number of structural features of the '<em>Risk Methodology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Risk Methodology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_METHODOLOGY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskScaleImpl <em>Risk Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskScaleImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskScale()
	 * @generated
	 */
	int RISK_SCALE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_SCALE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_SCALE__LEVELS = 1;

	/**
	 * The number of structural features of the '<em>Risk Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_SCALE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Risk Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_SCALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskLevelImpl <em>Risk Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskLevelImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskLevel()
	 * @generated
	 */
	int RISK_LEVEL = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Rank</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__RANK = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Risk Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Risk Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMatrixCellImpl <em>Risk Matrix Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskMatrixCellImpl
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskMatrixCell()
	 * @generated
	 */
	int RISK_MATRIX_CELL = 12;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX_CELL__LIKELIHOOD = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX_CELL__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX_CELL__RISK = 2;

	/**
	 * The number of structural features of the '<em>Risk Matrix Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX_CELL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Risk Matrix Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RISK_MATRIX_CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelationKind <em>Asset Relation Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelationKind
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAssetRelationKind()
	 * @generated
	 */
	int ASSET_RELATION_KIND = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionLevel <em>Protection Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProtectionLevel()
	 * @generated
	 */
	int PROTECTION_LEVEL = 14;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation <em>Protection Need Derivation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProtectionNeedDerivation()
	 * @generated
	 */
	int PROTECTION_NEED_DERIVATION = 15;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.MeasureKind <em>Measure Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.MeasureKind
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getMeasureKind()
	 * @generated
	 */
	int MEASURE_KIND = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.ImplementationStatus <em>Implementation Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.ImplementationStatus
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getImplementationStatus()
	 * @generated
	 */
	int IMPLEMENTATION_STATUS = 17;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.CoverageKind <em>Coverage Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.CoverageKind
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getCoverageKind()
	 * @generated
	 */
	int COVERAGE_KIND = 18;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.inventory.SourceKind <em>Source Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceKind
	 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getSourceKind()
	 * @generated
	 */
	int SOURCE_KIND = 19;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getId()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getName()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getDescription()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getScope()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getOwner()
	 * @see #getInventory()
	 * @generated
	 */
	EAttribute getInventory_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getContexts <em>Contexts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contexts</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getContexts()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_Contexts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assets</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getAssets()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_Assets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measures</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getMeasures()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_Measures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getApplicabilities <em>Applicabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applicabilities</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getApplicabilities()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_Applicabilities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getProcessingActivities <em>Processing Activities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processing Activities</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getProcessingActivities()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_ProcessingActivities();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getRiskMethodologies <em>Risk Methodologies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Risk Methodologies</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getRiskMethodologies()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_RiskMethodologies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Inventory#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Inventory#getAspects()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_Aspects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.Aspect <em>Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aspect</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Aspect
	 * @generated
	 */
	EClass getAspect();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.Asset <em>Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset
	 * @generated
	 */
	EClass getAsset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getId()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getName()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getDescription()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getOwner <em>Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getOwner()
	 * @see #getAsset()
	 * @generated
	 */
	EAttribute getAsset_Owner();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getCategories()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getProtectionNeeds <em>Protection Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protection Needs</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getProtectionNeeds()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_ProtectionNeeds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getRelations <em>Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relations</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getRelations()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Relations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getSources <em>Sources</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sources</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getSources()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Sources();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Asset#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Asset#getAspects()
	 * @see #getAsset()
	 * @generated
	 */
	EReference getAsset_Aspects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation <em>Asset Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Asset Relation</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelation
	 * @generated
	 */
	EClass getAssetRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelation#getKind()
	 * @see #getAssetRelation()
	 * @generated
	 */
	EAttribute getAssetRelation_Kind();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelation#getTarget()
	 * @see #getAssetRelation()
	 * @generated
	 */
	EReference getAssetRelation_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelation#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelation#getRationale()
	 * @see #getAssetRelation()
	 * @generated
	 */
	EAttribute getAssetRelation_Rationale();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment <em>Protection Need Assessment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protection Need Assessment</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment
	 * @generated
	 */
	EClass getProtectionNeedAssessment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getConfidentiality <em>Confidentiality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confidentiality</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getConfidentiality()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EAttribute getProtectionNeedAssessment_Confidentiality();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getIntegrity <em>Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integrity</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getIntegrity()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EAttribute getProtectionNeedAssessment_Integrity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAvailability()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EAttribute getProtectionNeedAssessment_Availability();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getDerivation <em>Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Derivation</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getDerivation()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EAttribute getProtectionNeedAssessment_Derivation();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Derived From</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getDerivedFrom()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EReference getProtectionNeedAssessment_DerivedFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getRationale <em>Rationale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rationale</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getRationale()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EAttribute getProtectionNeedAssessment_Rationale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedBy <em>Assessed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessed By</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedBy()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EAttribute getProtectionNeedAssessment_AssessedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedAt <em>Assessed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assessed At</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedAt()
	 * @see #getProtectionNeedAssessment()
	 * @generated
	 */
	EAttribute getProtectionNeedAssessment_AssessedAt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.Measure <em>Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Measure</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure
	 * @generated
	 */
	EClass getMeasure();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getId()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getTitle()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getDescription()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getKind()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getCategories()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Categories();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getSatisfies <em>Satisfies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Satisfies</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getSatisfies()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Satisfies();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getAppliesTo()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_AppliesTo();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getStatus()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Status();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getResponsible <em>Responsible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Responsible</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getResponsible()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_Responsible();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getReviewedAt <em>Reviewed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reviewed At</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getReviewedAt()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_ReviewedAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getDueDate <em>Due Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due Date</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getDueDate()
	 * @see #getMeasure()
	 * @generated
	 */
	EAttribute getMeasure_DueDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getEvidence <em>Evidence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Evidence</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getEvidence()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Evidence();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.Measure#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.Measure#getAspects()
	 * @see #getMeasure()
	 * @generated
	 */
	EReference getMeasure_Aspects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability <em>Requirement Applicability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Applicability</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability
	 * @generated
	 */
	EClass getRequirementApplicability();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Requirement</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getRequirement()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EReference getRequirementApplicability_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#isApplicable <em>Applicable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Applicable</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#isApplicable()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EAttribute getRequirementApplicability_Applicable();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getJustification <em>Justification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justification</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getJustification()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EAttribute getRequirementApplicability_Justification();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getStatus()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EAttribute getRequirementApplicability_Status();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measures</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getMeasures()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EReference getRequirementApplicability_Measures();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getCoverage()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EAttribute getRequirementApplicability_Coverage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDerivedFrom <em>Derived From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Derived From</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDerivedFrom()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EReference getRequirementApplicability_DerivedFrom();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getAssets()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EReference getRequirementApplicability_Assets();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedBy <em>Decided By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decided By</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedBy()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EAttribute getRequirementApplicability_DecidedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedAt <em>Decided At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decided At</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedAt()
	 * @see #getRequirementApplicability()
	 * @generated
	 */
	EAttribute getRequirementApplicability_DecidedAt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity <em>Processing Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processing Activity</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity
	 * @generated
	 */
	EClass getProcessingActivity();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getId()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getName()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getPurpose()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getController <em>Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Controller</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getController()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_Controller();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getLawfulBases <em>Lawful Bases</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lawful Bases</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getLawfulBases()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EReference getProcessingActivity_LawfulBases();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getDataCategories <em>Data Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data Categories</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getDataCategories()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EReference getProcessingActivity_DataCategories();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getDataSubjects <em>Data Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Data Subjects</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getDataSubjects()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_DataSubjects();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRecipients <em>Recipients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Recipients</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRecipients()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_Recipients();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getThirdCountryTransfers <em>Third Country Transfers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Third Country Transfers</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getThirdCountryTransfers()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_ThirdCountryTransfers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRetention <em>Retention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retention</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getRetention()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EAttribute getProcessingActivity_Retention();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getModels <em>Models</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Models</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getModels()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EReference getProcessingActivity_Models();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getAssets <em>Assets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Assets</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getAssets()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EReference getProcessingActivity_Assets();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getMeasures <em>Measures</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Measures</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getMeasures()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EReference getProcessingActivity_Measures();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getAspects <em>Aspects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Aspects</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProcessingActivity#getAspects()
	 * @see #getProcessingActivity()
	 * @generated
	 */
	EReference getProcessingActivity_Aspects();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.SourceRef <em>Source Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source Ref</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceRef
	 * @generated
	 */
	EClass getSourceRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.SourceRef#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceRef#getKind()
	 * @see #getSourceRef()
	 * @generated
	 */
	EAttribute getSourceRef_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.SourceRef#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceRef#getFormat()
	 * @see #getSourceRef()
	 * @generated
	 */
	EAttribute getSourceRef_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.SourceRef#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceRef#getUri()
	 * @see #getSourceRef()
	 * @generated
	 */
	EAttribute getSourceRef_Uri();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.SourceRef#getFingerprint <em>Fingerprint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fingerprint</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceRef#getFingerprint()
	 * @see #getSourceRef()
	 * @generated
	 */
	EAttribute getSourceRef_Fingerprint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.SourceRef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceRef#getName()
	 * @see #getSourceRef()
	 * @generated
	 */
	EAttribute getSourceRef_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology <em>Risk Methodology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Methodology</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology
	 * @generated
	 */
	EClass getRiskMethodology();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getId()
	 * @see #getRiskMethodology()
	 * @generated
	 */
	EAttribute getRiskMethodology_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getName()
	 * @see #getRiskMethodology()
	 * @generated
	 */
	EAttribute getRiskMethodology_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getDescription()
	 * @see #getRiskMethodology()
	 * @generated
	 */
	EAttribute getRiskMethodology_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Likelihood</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getLikelihood()
	 * @see #getRiskMethodology()
	 * @generated
	 */
	EReference getRiskMethodology_Likelihood();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Severity</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getSeverity()
	 * @see #getRiskMethodology()
	 * @generated
	 */
	EReference getRiskMethodology_Severity();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Risk</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getRisk()
	 * @see #getRiskMethodology()
	 * @generated
	 */
	EReference getRiskMethodology_Risk();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getMatrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matrix</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getMatrix()
	 * @see #getRiskMethodology()
	 * @generated
	 */
	EReference getRiskMethodology_Matrix();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.RiskScale <em>Risk Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Scale</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskScale
	 * @generated
	 */
	EClass getRiskScale();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskScale#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskScale#getName()
	 * @see #getRiskScale()
	 * @generated
	 */
	EAttribute getRiskScale_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.inventory.RiskScale#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Levels</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskScale#getLevels()
	 * @see #getRiskScale()
	 * @generated
	 */
	EReference getRiskScale_Levels();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.RiskLevel <em>Risk Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Level</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskLevel
	 * @generated
	 */
	EClass getRiskLevel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskLevel#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskLevel#getId()
	 * @see #getRiskLevel()
	 * @generated
	 */
	EAttribute getRiskLevel_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskLevel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskLevel#getName()
	 * @see #getRiskLevel()
	 * @generated
	 */
	EAttribute getRiskLevel_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskLevel#getRank <em>Rank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rank</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskLevel#getRank()
	 * @see #getRiskLevel()
	 * @generated
	 */
	EAttribute getRiskLevel_Rank();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.inventory.RiskLevel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskLevel#getDescription()
	 * @see #getRiskLevel()
	 * @generated
	 */
	EAttribute getRiskLevel_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell <em>Risk Matrix Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Risk Matrix Cell</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell
	 * @generated
	 */
	EClass getRiskMatrixCell();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Likelihood</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getLikelihood()
	 * @see #getRiskMatrixCell()
	 * @generated
	 */
	EReference getRiskMatrixCell_Likelihood();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Severity</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getSeverity()
	 * @see #getRiskMatrixCell()
	 * @generated
	 */
	EReference getRiskMatrixCell_Severity();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Risk</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getRisk()
	 * @see #getRiskMatrixCell()
	 * @generated
	 */
	EReference getRiskMatrixCell_Risk();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelationKind <em>Asset Relation Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Asset Relation Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelationKind
	 * @generated
	 */
	EEnum getAssetRelationKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionLevel <em>Protection Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protection Level</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @generated
	 */
	EEnum getProtectionLevel();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation <em>Protection Need Derivation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Protection Need Derivation</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation
	 * @generated
	 */
	EEnum getProtectionNeedDerivation();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.inventory.MeasureKind <em>Measure Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Measure Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.MeasureKind
	 * @generated
	 */
	EEnum getMeasureKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.inventory.ImplementationStatus <em>Implementation Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Implementation Status</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.ImplementationStatus
	 * @generated
	 */
	EEnum getImplementationStatus();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.inventory.CoverageKind <em>Coverage Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Coverage Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.CoverageKind
	 * @generated
	 */
	EEnum getCoverageKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.inventory.SourceKind <em>Source Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.inventory.SourceKind
	 * @generated
	 */
	EEnum getSourceKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InventoryFactory getInventoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__ID = eINSTANCE.getInventory_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__NAME = eINSTANCE.getInventory_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__DESCRIPTION = eINSTANCE.getInventory_Description();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__SCOPE = eINSTANCE.getInventory_Scope();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INVENTORY__OWNER = eINSTANCE.getInventory_Owner();

		/**
		 * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__CONTEXTS = eINSTANCE.getInventory_Contexts();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__ASSETS = eINSTANCE.getInventory_Assets();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__MEASURES = eINSTANCE.getInventory_Measures();

		/**
		 * The meta object literal for the '<em><b>Applicabilities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__APPLICABILITIES = eINSTANCE.getInventory_Applicabilities();

		/**
		 * The meta object literal for the '<em><b>Processing Activities</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__PROCESSING_ACTIVITIES = eINSTANCE.getInventory_ProcessingActivities();

		/**
		 * The meta object literal for the '<em><b>Risk Methodologies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__RISK_METHODOLOGIES = eINSTANCE.getInventory_RiskMethodologies();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__ASPECTS = eINSTANCE.getInventory_Aspects();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.AspectImpl <em>Aspect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.AspectImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAspect()
		 * @generated
		 */
		EClass ASPECT = eINSTANCE.getAspect();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl <em>Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.AssetImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAsset()
		 * @generated
		 */
		EClass ASSET = eINSTANCE.getAsset();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__ID = eINSTANCE.getAsset_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__NAME = eINSTANCE.getAsset_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__DESCRIPTION = eINSTANCE.getAsset_Description();

		/**
		 * The meta object literal for the '<em><b>Owner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET__OWNER = eINSTANCE.getAsset_Owner();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__CATEGORIES = eINSTANCE.getAsset_Categories();

		/**
		 * The meta object literal for the '<em><b>Protection Needs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__PROTECTION_NEEDS = eINSTANCE.getAsset_ProtectionNeeds();

		/**
		 * The meta object literal for the '<em><b>Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__RELATIONS = eINSTANCE.getAsset_Relations();

		/**
		 * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__SOURCES = eINSTANCE.getAsset_Sources();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET__ASPECTS = eINSTANCE.getAsset_Aspects();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.AssetRelationImpl <em>Asset Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.AssetRelationImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAssetRelation()
		 * @generated
		 */
		EClass ASSET_RELATION = eINSTANCE.getAssetRelation();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_RELATION__KIND = eINSTANCE.getAssetRelation_Kind();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSET_RELATION__TARGET = eINSTANCE.getAssetRelation_Target();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSET_RELATION__RATIONALE = eINSTANCE.getAssetRelation_Rationale();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl <em>Protection Need Assessment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProtectionNeedAssessment()
		 * @generated
		 */
		EClass PROTECTION_NEED_ASSESSMENT = eINSTANCE.getProtectionNeedAssessment();

		/**
		 * The meta object literal for the '<em><b>Confidentiality</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY = eINSTANCE.getProtectionNeedAssessment_Confidentiality();

		/**
		 * The meta object literal for the '<em><b>Integrity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_NEED_ASSESSMENT__INTEGRITY = eINSTANCE.getProtectionNeedAssessment_Integrity();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_NEED_ASSESSMENT__AVAILABILITY = eINSTANCE.getProtectionNeedAssessment_Availability();

		/**
		 * The meta object literal for the '<em><b>Derivation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_NEED_ASSESSMENT__DERIVATION = eINSTANCE.getProtectionNeedAssessment_Derivation();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROTECTION_NEED_ASSESSMENT__DERIVED_FROM = eINSTANCE.getProtectionNeedAssessment_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_NEED_ASSESSMENT__RATIONALE = eINSTANCE.getProtectionNeedAssessment_Rationale();

		/**
		 * The meta object literal for the '<em><b>Assessed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_NEED_ASSESSMENT__ASSESSED_BY = eINSTANCE.getProtectionNeedAssessment_AssessedBy();

		/**
		 * The meta object literal for the '<em><b>Assessed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROTECTION_NEED_ASSESSMENT__ASSESSED_AT = eINSTANCE.getProtectionNeedAssessment_AssessedAt();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl <em>Measure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.MeasureImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getMeasure()
		 * @generated
		 */
		EClass MEASURE = eINSTANCE.getMeasure();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__ID = eINSTANCE.getMeasure_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__TITLE = eINSTANCE.getMeasure_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__DESCRIPTION = eINSTANCE.getMeasure_Description();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__KIND = eINSTANCE.getMeasure_Kind();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__CATEGORIES = eINSTANCE.getMeasure_Categories();

		/**
		 * The meta object literal for the '<em><b>Satisfies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__SATISFIES = eINSTANCE.getMeasure_Satisfies();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__APPLIES_TO = eINSTANCE.getMeasure_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__STATUS = eINSTANCE.getMeasure_Status();

		/**
		 * The meta object literal for the '<em><b>Responsible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__RESPONSIBLE = eINSTANCE.getMeasure_Responsible();

		/**
		 * The meta object literal for the '<em><b>Reviewed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__REVIEWED_AT = eINSTANCE.getMeasure_ReviewedAt();

		/**
		 * The meta object literal for the '<em><b>Due Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MEASURE__DUE_DATE = eINSTANCE.getMeasure_DueDate();

		/**
		 * The meta object literal for the '<em><b>Evidence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__EVIDENCE = eINSTANCE.getMeasure_Evidence();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEASURE__ASPECTS = eINSTANCE.getMeasure_Aspects();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl <em>Requirement Applicability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRequirementApplicability()
		 * @generated
		 */
		EClass REQUIREMENT_APPLICABILITY = eINSTANCE.getRequirementApplicability();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_APPLICABILITY__REQUIREMENT = eINSTANCE.getRequirementApplicability_Requirement();

		/**
		 * The meta object literal for the '<em><b>Applicable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_APPLICABILITY__APPLICABLE = eINSTANCE.getRequirementApplicability_Applicable();

		/**
		 * The meta object literal for the '<em><b>Justification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_APPLICABILITY__JUSTIFICATION = eINSTANCE.getRequirementApplicability_Justification();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_APPLICABILITY__STATUS = eINSTANCE.getRequirementApplicability_Status();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_APPLICABILITY__MEASURES = eINSTANCE.getRequirementApplicability_Measures();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_APPLICABILITY__COVERAGE = eINSTANCE.getRequirementApplicability_Coverage();

		/**
		 * The meta object literal for the '<em><b>Derived From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_APPLICABILITY__DERIVED_FROM = eINSTANCE.getRequirementApplicability_DerivedFrom();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_APPLICABILITY__ASSETS = eINSTANCE.getRequirementApplicability_Assets();

		/**
		 * The meta object literal for the '<em><b>Decided By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_APPLICABILITY__DECIDED_BY = eINSTANCE.getRequirementApplicability_DecidedBy();

		/**
		 * The meta object literal for the '<em><b>Decided At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_APPLICABILITY__DECIDED_AT = eINSTANCE.getRequirementApplicability_DecidedAt();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl <em>Processing Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.ProcessingActivityImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProcessingActivity()
		 * @generated
		 */
		EClass PROCESSING_ACTIVITY = eINSTANCE.getProcessingActivity();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__ID = eINSTANCE.getProcessingActivity_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__NAME = eINSTANCE.getProcessingActivity_Name();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__PURPOSE = eINSTANCE.getProcessingActivity_Purpose();

		/**
		 * The meta object literal for the '<em><b>Controller</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__CONTROLLER = eINSTANCE.getProcessingActivity_Controller();

		/**
		 * The meta object literal for the '<em><b>Lawful Bases</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ACTIVITY__LAWFUL_BASES = eINSTANCE.getProcessingActivity_LawfulBases();

		/**
		 * The meta object literal for the '<em><b>Data Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ACTIVITY__DATA_CATEGORIES = eINSTANCE.getProcessingActivity_DataCategories();

		/**
		 * The meta object literal for the '<em><b>Data Subjects</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__DATA_SUBJECTS = eINSTANCE.getProcessingActivity_DataSubjects();

		/**
		 * The meta object literal for the '<em><b>Recipients</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__RECIPIENTS = eINSTANCE.getProcessingActivity_Recipients();

		/**
		 * The meta object literal for the '<em><b>Third Country Transfers</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__THIRD_COUNTRY_TRANSFERS = eINSTANCE.getProcessingActivity_ThirdCountryTransfers();

		/**
		 * The meta object literal for the '<em><b>Retention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROCESSING_ACTIVITY__RETENTION = eINSTANCE.getProcessingActivity_Retention();

		/**
		 * The meta object literal for the '<em><b>Models</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ACTIVITY__MODELS = eINSTANCE.getProcessingActivity_Models();

		/**
		 * The meta object literal for the '<em><b>Assets</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ACTIVITY__ASSETS = eINSTANCE.getProcessingActivity_Assets();

		/**
		 * The meta object literal for the '<em><b>Measures</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ACTIVITY__MEASURES = eINSTANCE.getProcessingActivity_Measures();

		/**
		 * The meta object literal for the '<em><b>Aspects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSING_ACTIVITY__ASPECTS = eINSTANCE.getProcessingActivity_Aspects();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.SourceRefImpl <em>Source Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.SourceRefImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getSourceRef()
		 * @generated
		 */
		EClass SOURCE_REF = eINSTANCE.getSourceRef();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REF__KIND = eINSTANCE.getSourceRef_Kind();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REF__FORMAT = eINSTANCE.getSourceRef_Format();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REF__URI = eINSTANCE.getSourceRef_Uri();

		/**
		 * The meta object literal for the '<em><b>Fingerprint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REF__FINGERPRINT = eINSTANCE.getSourceRef_Fingerprint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE_REF__NAME = eINSTANCE.getSourceRef_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl <em>Risk Methodology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskMethodologyImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskMethodology()
		 * @generated
		 */
		EClass RISK_METHODOLOGY = eINSTANCE.getRiskMethodology();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_METHODOLOGY__ID = eINSTANCE.getRiskMethodology_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_METHODOLOGY__NAME = eINSTANCE.getRiskMethodology_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_METHODOLOGY__DESCRIPTION = eINSTANCE.getRiskMethodology_Description();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_METHODOLOGY__LIKELIHOOD = eINSTANCE.getRiskMethodology_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_METHODOLOGY__SEVERITY = eINSTANCE.getRiskMethodology_Severity();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_METHODOLOGY__RISK = eINSTANCE.getRiskMethodology_Risk();

		/**
		 * The meta object literal for the '<em><b>Matrix</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_METHODOLOGY__MATRIX = eINSTANCE.getRiskMethodology_Matrix();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskScaleImpl <em>Risk Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskScaleImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskScale()
		 * @generated
		 */
		EClass RISK_SCALE = eINSTANCE.getRiskScale();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_SCALE__NAME = eINSTANCE.getRiskScale_Name();

		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_SCALE__LEVELS = eINSTANCE.getRiskScale_Levels();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskLevelImpl <em>Risk Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskLevelImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskLevel()
		 * @generated
		 */
		EClass RISK_LEVEL = eINSTANCE.getRiskLevel();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_LEVEL__ID = eINSTANCE.getRiskLevel_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_LEVEL__NAME = eINSTANCE.getRiskLevel_Name();

		/**
		 * The meta object literal for the '<em><b>Rank</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_LEVEL__RANK = eINSTANCE.getRiskLevel_Rank();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RISK_LEVEL__DESCRIPTION = eINSTANCE.getRiskLevel_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.impl.RiskMatrixCellImpl <em>Risk Matrix Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.RiskMatrixCellImpl
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getRiskMatrixCell()
		 * @generated
		 */
		EClass RISK_MATRIX_CELL = eINSTANCE.getRiskMatrixCell();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_MATRIX_CELL__LIKELIHOOD = eINSTANCE.getRiskMatrixCell_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_MATRIX_CELL__SEVERITY = eINSTANCE.getRiskMatrixCell_Severity();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RISK_MATRIX_CELL__RISK = eINSTANCE.getRiskMatrixCell_Risk();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.AssetRelationKind <em>Asset Relation Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.AssetRelationKind
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getAssetRelationKind()
		 * @generated
		 */
		EEnum ASSET_RELATION_KIND = eINSTANCE.getAssetRelationKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionLevel <em>Protection Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProtectionLevel()
		 * @generated
		 */
		EEnum PROTECTION_LEVEL = eINSTANCE.getProtectionLevel();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation <em>Protection Need Derivation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getProtectionNeedDerivation()
		 * @generated
		 */
		EEnum PROTECTION_NEED_DERIVATION = eINSTANCE.getProtectionNeedDerivation();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.MeasureKind <em>Measure Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.MeasureKind
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getMeasureKind()
		 * @generated
		 */
		EEnum MEASURE_KIND = eINSTANCE.getMeasureKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.ImplementationStatus <em>Implementation Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.ImplementationStatus
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getImplementationStatus()
		 * @generated
		 */
		EEnum IMPLEMENTATION_STATUS = eINSTANCE.getImplementationStatus();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.CoverageKind <em>Coverage Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.CoverageKind
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getCoverageKind()
		 * @generated
		 */
		EEnum COVERAGE_KIND = eINSTANCE.getCoverageKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.inventory.SourceKind <em>Source Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.inventory.SourceKind
		 * @see org.eclipse.fennec.model.compliance.inventory.impl.InventoryPackageImpl#getSourceKind()
		 * @generated
		 */
		EEnum SOURCE_KIND = eINSTANCE.getSourceKind();

	}

} //InventoryPackage
