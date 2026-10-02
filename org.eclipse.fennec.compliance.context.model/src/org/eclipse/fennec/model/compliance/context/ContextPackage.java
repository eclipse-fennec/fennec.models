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
package org.eclipse.fennec.model.compliance.context;


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
 * A compliance context (GDPR, Grundschutz++, ISO 27001, CRA, AI Act, KRITIS, BSI TR, ...): the corpora it cites, the requirements derived from them, its taxonomies and roles. Also the crosswalks between contexts and the by-id references other models use to point into a context.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.context.ContextFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = ContextPackage.eNS_URI, fingerprint = "fp1:e625817f27082f644ce317171372102b1f1d6a68a54e236651d7cb2e12bb1e1a", genModel = "/model/context.genmodel", genModelSourceLocations = {"model/context.genmodel","org.eclipse.fennec.compliance.context.model/model/context.genmodel"}, ecore = "/model/context.ecore", ecoreSourceLocations = "/model/context.ecore")
public interface ContextPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "context";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.eclipse/fennec/compliance/context/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "context";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ContextPackage eINSTANCE = org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl <em>Compliance Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getComplianceContext()
	 * @generated
	 */
	int COMPLIANCE_CONTEXT = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__KIND = 4;

	/**
	 * The feature id for the '<em><b>Jurisdiction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__JURISDICTION = 5;

	/**
	 * The feature id for the '<em><b>Reference Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__LICENCE = 7;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__ATTRIBUTION = 8;

	/**
	 * The feature id for the '<em><b>Corpora</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__CORPORA = 9;

	/**
	 * The feature id for the '<em><b>Requirement Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS = 10;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__REQUIREMENTS = 11;

	/**
	 * The feature id for the '<em><b>Taxonomies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__TAXONOMIES = 12;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT__ROLES = 13;

	/**
	 * The number of structural features of the '<em>Compliance Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT_FEATURE_COUNT = 14;

	/**
	 * The number of operations of the '<em>Compliance Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLIANCE_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementGroupImpl <em>Requirement Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementGroupImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirementGroup()
	 * @generated
	 */
	int REQUIREMENT_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Groups</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__GROUPS = 3;

	/**
	 * The feature id for the '<em><b>Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP__REQUIREMENTS = 4;

	/**
	 * The number of structural features of the '<em>Requirement Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Requirement Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATEMENT = 2;

	/**
	 * The feature id for the '<em><b>Guidance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__GUIDANCE = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CITES = 5;

	/**
	 * The feature id for the '<em><b>Applies To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__APPLIES_TO = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROPERTIES = 7;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALID_FROM = 8;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__VALID_UNTIL = 9;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ORIGIN = 10;

	/**
	 * The feature id for the '<em><b>Confirmed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONFIRMED_BY = 11;

	/**
	 * The feature id for the '<em><b>Confirmed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONFIRMED_AT = 12;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.TaxonomyImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY__CATEGORIES = 3;

	/**
	 * The number of structural features of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Taxonomy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAXONOMY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.CategoryImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__KIND = 3;

	/**
	 * The feature id for the '<em><b>Cites</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CITES = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Valid From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VALID_FROM = 6;

	/**
	 * The feature id for the '<em><b>Valid Until</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__VALID_UNTIL = 7;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CHILDREN = 8;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.RoleImpl <em>Role</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.RoleImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRole()
	 * @generated
	 */
	int ROLE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Role</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl <em>Crosswalk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getCrosswalk()
	 * @generated
	 */
	int CROSSWALK = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__LICENCE = 4;

	/**
	 * The feature id for the '<em><b>Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__ATTRIBUTION = 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__SOURCE = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__TARGET = 7;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK__MAPPINGS = 8;

	/**
	 * The number of structural features of the '<em>Crosswalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Crosswalk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CROSSWALK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl <em>Requirement Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirementMapping()
	 * @generated
	 */
	int REQUIREMENT_MAPPING = 7;

	/**
	 * The feature id for the '<em><b>Source Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID = 0;

	/**
	 * The feature id for the '<em><b>Target Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID = 1;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Remarks</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__REMARKS = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__ORIGIN = 4;

	/**
	 * The feature id for the '<em><b>Confirmed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__CONFIRMED_BY = 5;

	/**
	 * The feature id for the '<em><b>Confirmed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING__CONFIRMED_AT = 6;

	/**
	 * The number of structural features of the '<em>Requirement Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Requirement Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.ContextRefImpl <em>Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextRefImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getContextRef()
	 * @generated
	 */
	int CONTEXT_REF = 8;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REF__CONTEXT_ID = 0;

	/**
	 * The feature id for the '<em><b>Context Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REF__CONTEXT_VERSION = 1;

	/**
	 * The number of structural features of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REF_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_REF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementRefImpl <em>Requirement Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementRefImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirementRef()
	 * @generated
	 */
	int REQUIREMENT_REF = 9;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REF__CONTEXT_ID = CONTEXT_REF__CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Context Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REF__CONTEXT_VERSION = CONTEXT_REF__CONTEXT_VERSION;

	/**
	 * The feature id for the '<em><b>Requirement Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REF__REQUIREMENT_ID = CONTEXT_REF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REF_FEATURE_COUNT = CONTEXT_REF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Requirement Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_REF_OPERATION_COUNT = CONTEXT_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.impl.CategoryRefImpl <em>Category Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.impl.CategoryRefImpl
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getCategoryRef()
	 * @generated
	 */
	int CATEGORY_REF = 10;

	/**
	 * The feature id for the '<em><b>Context Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_REF__CONTEXT_ID = CONTEXT_REF__CONTEXT_ID;

	/**
	 * The feature id for the '<em><b>Context Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_REF__CONTEXT_VERSION = CONTEXT_REF__CONTEXT_VERSION;

	/**
	 * The feature id for the '<em><b>Taxonomy Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_REF__TAXONOMY_ID = CONTEXT_REF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Category Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_REF__CATEGORY_ID = CONTEXT_REF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Category Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_REF_FEATURE_COUNT = CONTEXT_REF_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Category Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_REF_OPERATION_COUNT = CONTEXT_REF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.ContextKind <em>Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.ContextKind
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getContextKind()
	 * @generated
	 */
	int CONTEXT_KIND = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.Origin <em>Origin</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.Origin
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getOrigin()
	 * @generated
	 */
	int ORIGIN = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.compliance.context.MappingRelationship <em>Mapping Relationship</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.compliance.context.MappingRelationship
	 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getMappingRelationship()
	 * @generated
	 */
	int MAPPING_RELATIONSHIP = 13;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext <em>Compliance Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compliance Context</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext
	 * @generated
	 */
	EClass getComplianceContext();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getId()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getName()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getVersion()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getDescription()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getKind()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Kind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getJurisdiction <em>Jurisdiction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jurisdiction</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getJurisdiction()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Jurisdiction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getReferenceLanguage <em>Reference Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Language</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getReferenceLanguage()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_ReferenceLanguage();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getLicence <em>Licence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licence</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getLicence()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Licence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getAttribution <em>Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribution</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getAttribution()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EAttribute getComplianceContext_Attribution();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getCorpora <em>Corpora</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Corpora</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getCorpora()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EReference getComplianceContext_Corpora();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getRequirementGroups <em>Requirement Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Groups</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getRequirementGroups()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EReference getComplianceContext_RequirementGroups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getRequirements()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EReference getComplianceContext_Requirements();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getTaxonomies <em>Taxonomies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Taxonomies</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getTaxonomies()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EReference getComplianceContext_Taxonomies();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Roles</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ComplianceContext#getRoles()
	 * @see #getComplianceContext()
	 * @generated
	 */
	EReference getComplianceContext_Roles();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup <em>Requirement Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Group</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementGroup
	 * @generated
	 */
	EClass getRequirementGroup();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementGroup#getId()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementGroup#getTitle()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementGroup#getDescription()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EAttribute getRequirementGroup_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getGroups <em>Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Groups</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementGroup#getGroups()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Groups();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.RequirementGroup#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirements</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementGroup#getRequirements()
	 * @see #getRequirementGroup()
	 * @generated
	 */
	EReference getRequirementGroup_Requirements();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getId()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getTitle()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getStatement()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Statement();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getGuidance <em>Guidance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guidance</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getGuidance()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Guidance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getLevel()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Level();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.context.Requirement#getCites <em>Cites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cites</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getCites()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Cites();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.context.Requirement#getAppliesTo <em>Applies To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Applies To</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getAppliesTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_AppliesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.Requirement#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getProperties()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getValidFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getValidUntil()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ValidUntil();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getOrigin()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedBy <em>Confirmed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmed By</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ConfirmedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedAt <em>Confirmed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmed At</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Requirement#getConfirmedAt()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ConfirmedAt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Taxonomy</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Taxonomy
	 * @generated
	 */
	EClass getTaxonomy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Taxonomy#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Taxonomy#getId()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Taxonomy#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Taxonomy#getName()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Taxonomy#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Taxonomy#getDescription()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EAttribute getTaxonomy_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.Taxonomy#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Taxonomy#getCategories()
	 * @see #getTaxonomy()
	 * @generated
	 */
	EReference getTaxonomy_Categories();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Category#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getId()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Category#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getName()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Category#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getDescription()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Category#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getKind()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_Kind();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.fennec.model.compliance.context.Category#getCites <em>Cites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Cites</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getCites()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Cites();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.Category#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getProperties()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Properties();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Category#getValidFrom <em>Valid From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid From</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getValidFrom()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_ValidFrom();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Category#getValidUntil <em>Valid Until</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid Until</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getValidUntil()
	 * @see #getCategory()
	 * @generated
	 */
	EAttribute getCategory_ValidUntil();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.Category#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Category#getChildren()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Children();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.Role <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Role</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Role
	 * @generated
	 */
	EClass getRole();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Role#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Role#getId()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Role#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Role#getName()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Role#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Role#getDescription()
	 * @see #getRole()
	 * @generated
	 */
	EAttribute getRole_Description();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.Crosswalk <em>Crosswalk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crosswalk</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk
	 * @generated
	 */
	EClass getCrosswalk();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getId()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EAttribute getCrosswalk_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getName()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EAttribute getCrosswalk_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getVersion()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EAttribute getCrosswalk_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getDescription()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EAttribute getCrosswalk_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getLicence <em>Licence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Licence</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getLicence()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EAttribute getCrosswalk_Licence();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getAttribution <em>Attribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribution</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getAttribution()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EAttribute getCrosswalk_Attribution();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getSource()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EReference getCrosswalk_Source();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getTarget()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EReference getCrosswalk_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.compliance.context.Crosswalk#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mappings</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Crosswalk#getMappings()
	 * @see #getCrosswalk()
	 * @generated
	 */
	EReference getCrosswalk_Mappings();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping <em>Requirement Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Mapping</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping
	 * @generated
	 */
	EClass getRequirementMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getSourceRequirementId <em>Source Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Requirement Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping#getSourceRequirementId()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_SourceRequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getTargetRequirementId <em>Target Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Requirement Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping#getTargetRequirementId()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_TargetRequirementId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relationship</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping#getRelationship()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_Relationship();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getRemarks <em>Remarks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remarks</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping#getRemarks()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_Remarks();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping#getOrigin()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_Origin();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedBy <em>Confirmed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmed By</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedBy()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_ConfirmedBy();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedAt <em>Confirmed At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confirmed At</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementMapping#getConfirmedAt()
	 * @see #getRequirementMapping()
	 * @generated
	 */
	EAttribute getRequirementMapping_ConfirmedAt();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.ContextRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ContextRef
	 * @generated
	 */
	EClass getContextRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ContextRef#getContextId <em>Context Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ContextRef#getContextId()
	 * @see #getContextRef()
	 * @generated
	 */
	EAttribute getContextRef_ContextId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.ContextRef#getContextVersion <em>Context Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Context Version</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ContextRef#getContextVersion()
	 * @see #getContextRef()
	 * @generated
	 */
	EAttribute getContextRef_ContextVersion();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.RequirementRef <em>Requirement Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Ref</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementRef
	 * @generated
	 */
	EClass getRequirementRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.RequirementRef#getRequirementId <em>Requirement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requirement Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.RequirementRef#getRequirementId()
	 * @see #getRequirementRef()
	 * @generated
	 */
	EAttribute getRequirementRef_RequirementId();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.compliance.context.CategoryRef <em>Category Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category Ref</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.CategoryRef
	 * @generated
	 */
	EClass getCategoryRef();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.CategoryRef#getTaxonomyId <em>Taxonomy Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxonomy Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.CategoryRef#getTaxonomyId()
	 * @see #getCategoryRef()
	 * @generated
	 */
	EAttribute getCategoryRef_TaxonomyId();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.compliance.context.CategoryRef#getCategoryId <em>Category Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category Id</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.CategoryRef#getCategoryId()
	 * @see #getCategoryRef()
	 * @generated
	 */
	EAttribute getCategoryRef_CategoryId();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.context.ContextKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Kind</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.ContextKind
	 * @generated
	 */
	EEnum getContextKind();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.context.Origin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Origin</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.Origin
	 * @generated
	 */
	EEnum getOrigin();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.fennec.model.compliance.context.MappingRelationship <em>Mapping Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mapping Relationship</em>'.
	 * @see org.eclipse.fennec.model.compliance.context.MappingRelationship
	 * @generated
	 */
	EEnum getMappingRelationship();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ContextFactory getContextFactory();

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
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl <em>Compliance Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.ComplianceContextImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getComplianceContext()
		 * @generated
		 */
		EClass COMPLIANCE_CONTEXT = eINSTANCE.getComplianceContext();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__ID = eINSTANCE.getComplianceContext_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__NAME = eINSTANCE.getComplianceContext_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__VERSION = eINSTANCE.getComplianceContext_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__DESCRIPTION = eINSTANCE.getComplianceContext_Description();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__KIND = eINSTANCE.getComplianceContext_Kind();

		/**
		 * The meta object literal for the '<em><b>Jurisdiction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__JURISDICTION = eINSTANCE.getComplianceContext_Jurisdiction();

		/**
		 * The meta object literal for the '<em><b>Reference Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE = eINSTANCE.getComplianceContext_ReferenceLanguage();

		/**
		 * The meta object literal for the '<em><b>Licence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__LICENCE = eINSTANCE.getComplianceContext_Licence();

		/**
		 * The meta object literal for the '<em><b>Attribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPLIANCE_CONTEXT__ATTRIBUTION = eINSTANCE.getComplianceContext_Attribution();

		/**
		 * The meta object literal for the '<em><b>Corpora</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_CONTEXT__CORPORA = eINSTANCE.getComplianceContext_Corpora();

		/**
		 * The meta object literal for the '<em><b>Requirement Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS = eINSTANCE.getComplianceContext_RequirementGroups();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_CONTEXT__REQUIREMENTS = eINSTANCE.getComplianceContext_Requirements();

		/**
		 * The meta object literal for the '<em><b>Taxonomies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_CONTEXT__TAXONOMIES = eINSTANCE.getComplianceContext_Taxonomies();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLIANCE_CONTEXT__ROLES = eINSTANCE.getComplianceContext_Roles();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementGroupImpl <em>Requirement Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementGroupImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirementGroup()
		 * @generated
		 */
		EClass REQUIREMENT_GROUP = eINSTANCE.getRequirementGroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__ID = eINSTANCE.getRequirementGroup_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__TITLE = eINSTANCE.getRequirementGroup_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_GROUP__DESCRIPTION = eINSTANCE.getRequirementGroup_Description();

		/**
		 * The meta object literal for the '<em><b>Groups</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__GROUPS = eINSTANCE.getRequirementGroup_Groups();

		/**
		 * The meta object literal for the '<em><b>Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_GROUP__REQUIREMENTS = eINSTANCE.getRequirementGroup_Requirements();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TITLE = eINSTANCE.getRequirement_Title();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATEMENT = eINSTANCE.getRequirement_Statement();

		/**
		 * The meta object literal for the '<em><b>Guidance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__GUIDANCE = eINSTANCE.getRequirement_Guidance();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__LEVEL = eINSTANCE.getRequirement_Level();

		/**
		 * The meta object literal for the '<em><b>Cites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CITES = eINSTANCE.getRequirement_Cites();

		/**
		 * The meta object literal for the '<em><b>Applies To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__APPLIES_TO = eINSTANCE.getRequirement_AppliesTo();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PROPERTIES = eINSTANCE.getRequirement_Properties();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VALID_FROM = eINSTANCE.getRequirement_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__VALID_UNTIL = eINSTANCE.getRequirement_ValidUntil();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ORIGIN = eINSTANCE.getRequirement_Origin();

		/**
		 * The meta object literal for the '<em><b>Confirmed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CONFIRMED_BY = eINSTANCE.getRequirement_ConfirmedBy();

		/**
		 * The meta object literal for the '<em><b>Confirmed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CONFIRMED_AT = eINSTANCE.getRequirement_ConfirmedAt();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.TaxonomyImpl <em>Taxonomy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.TaxonomyImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getTaxonomy()
		 * @generated
		 */
		EClass TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__ID = eINSTANCE.getTaxonomy_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__NAME = eINSTANCE.getTaxonomy_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAXONOMY__DESCRIPTION = eINSTANCE.getTaxonomy_Description();

		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAXONOMY__CATEGORIES = eINSTANCE.getTaxonomy_Categories();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.CategoryImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__ID = eINSTANCE.getCategory_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__DESCRIPTION = eINSTANCE.getCategory_Description();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__KIND = eINSTANCE.getCategory_Kind();

		/**
		 * The meta object literal for the '<em><b>Cites</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CITES = eINSTANCE.getCategory_Cites();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__PROPERTIES = eINSTANCE.getCategory_Properties();

		/**
		 * The meta object literal for the '<em><b>Valid From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__VALID_FROM = eINSTANCE.getCategory_ValidFrom();

		/**
		 * The meta object literal for the '<em><b>Valid Until</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY__VALID_UNTIL = eINSTANCE.getCategory_ValidUntil();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__CHILDREN = eINSTANCE.getCategory_Children();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.RoleImpl <em>Role</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.RoleImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRole()
		 * @generated
		 */
		EClass ROLE = eINSTANCE.getRole();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__ID = eINSTANCE.getRole_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__NAME = eINSTANCE.getRole_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROLE__DESCRIPTION = eINSTANCE.getRole_Description();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl <em>Crosswalk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.CrosswalkImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getCrosswalk()
		 * @generated
		 */
		EClass CROSSWALK = eINSTANCE.getCrosswalk();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSWALK__ID = eINSTANCE.getCrosswalk_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSWALK__NAME = eINSTANCE.getCrosswalk_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSWALK__VERSION = eINSTANCE.getCrosswalk_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSWALK__DESCRIPTION = eINSTANCE.getCrosswalk_Description();

		/**
		 * The meta object literal for the '<em><b>Licence</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSWALK__LICENCE = eINSTANCE.getCrosswalk_Licence();

		/**
		 * The meta object literal for the '<em><b>Attribution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CROSSWALK__ATTRIBUTION = eINSTANCE.getCrosswalk_Attribution();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSWALK__SOURCE = eINSTANCE.getCrosswalk_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSWALK__TARGET = eINSTANCE.getCrosswalk_Target();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CROSSWALK__MAPPINGS = eINSTANCE.getCrosswalk_Mappings();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl <em>Requirement Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirementMapping()
		 * @generated
		 */
		EClass REQUIREMENT_MAPPING = eINSTANCE.getRequirementMapping();

		/**
		 * The meta object literal for the '<em><b>Source Requirement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID = eINSTANCE.getRequirementMapping_SourceRequirementId();

		/**
		 * The meta object literal for the '<em><b>Target Requirement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID = eINSTANCE.getRequirementMapping_TargetRequirementId();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__RELATIONSHIP = eINSTANCE.getRequirementMapping_Relationship();

		/**
		 * The meta object literal for the '<em><b>Remarks</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__REMARKS = eINSTANCE.getRequirementMapping_Remarks();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__ORIGIN = eINSTANCE.getRequirementMapping_Origin();

		/**
		 * The meta object literal for the '<em><b>Confirmed By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__CONFIRMED_BY = eINSTANCE.getRequirementMapping_ConfirmedBy();

		/**
		 * The meta object literal for the '<em><b>Confirmed At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_MAPPING__CONFIRMED_AT = eINSTANCE.getRequirementMapping_ConfirmedAt();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.ContextRefImpl <em>Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextRefImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getContextRef()
		 * @generated
		 */
		EClass CONTEXT_REF = eINSTANCE.getContextRef();

		/**
		 * The meta object literal for the '<em><b>Context Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_REF__CONTEXT_ID = eINSTANCE.getContextRef_ContextId();

		/**
		 * The meta object literal for the '<em><b>Context Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTEXT_REF__CONTEXT_VERSION = eINSTANCE.getContextRef_ContextVersion();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.RequirementRefImpl <em>Requirement Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.RequirementRefImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getRequirementRef()
		 * @generated
		 */
		EClass REQUIREMENT_REF = eINSTANCE.getRequirementRef();

		/**
		 * The meta object literal for the '<em><b>Requirement Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_REF__REQUIREMENT_ID = eINSTANCE.getRequirementRef_RequirementId();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.impl.CategoryRefImpl <em>Category Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.impl.CategoryRefImpl
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getCategoryRef()
		 * @generated
		 */
		EClass CATEGORY_REF = eINSTANCE.getCategoryRef();

		/**
		 * The meta object literal for the '<em><b>Taxonomy Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_REF__TAXONOMY_ID = eINSTANCE.getCategoryRef_TaxonomyId();

		/**
		 * The meta object literal for the '<em><b>Category Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CATEGORY_REF__CATEGORY_ID = eINSTANCE.getCategoryRef_CategoryId();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.ContextKind <em>Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.ContextKind
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getContextKind()
		 * @generated
		 */
		EEnum CONTEXT_KIND = eINSTANCE.getContextKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.Origin <em>Origin</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.Origin
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getOrigin()
		 * @generated
		 */
		EEnum ORIGIN = eINSTANCE.getOrigin();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.compliance.context.MappingRelationship <em>Mapping Relationship</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.compliance.context.MappingRelationship
		 * @see org.eclipse.fennec.model.compliance.context.impl.ContextPackageImpl#getMappingRelationship()
		 * @generated
		 */
		EEnum MAPPING_RELATIONSHIP = eINSTANCE.getMappingRelationship();

	}

} //ContextPackage
