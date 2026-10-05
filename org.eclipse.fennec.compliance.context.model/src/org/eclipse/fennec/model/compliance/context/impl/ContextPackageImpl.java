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
package org.eclipse.fennec.model.compliance.context.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.fennec.model.compliance.context.Category;
import org.eclipse.fennec.model.compliance.context.CategoryRef;
import org.eclipse.fennec.model.compliance.context.ComplianceContext;
import org.eclipse.fennec.model.compliance.context.ContextFactory;
import org.eclipse.fennec.model.compliance.context.ContextKind;
import org.eclipse.fennec.model.compliance.context.ContextPackage;
import org.eclipse.fennec.model.compliance.context.ContextRef;
import org.eclipse.fennec.model.compliance.context.Crosswalk;
import org.eclipse.fennec.model.compliance.context.MappingRelationship;
import org.eclipse.fennec.model.compliance.context.Origin;
import org.eclipse.fennec.model.compliance.context.Requirement;
import org.eclipse.fennec.model.compliance.context.RequirementGroup;
import org.eclipse.fennec.model.compliance.context.RequirementMapping;
import org.eclipse.fennec.model.compliance.context.RequirementRef;
import org.eclipse.fennec.model.compliance.context.Role;
import org.eclipse.fennec.model.compliance.context.Taxonomy;

import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContextPackageImpl extends EPackageImpl implements ContextPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complianceContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taxonomyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass crosswalkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementMappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contextKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum originEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mappingRelationshipEEnum = null;

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
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ContextPackageImpl() {
		super(eNS_URI, ContextFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ContextPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ContextPackage init() {
		if (isInited) return (ContextPackage)EPackage.Registry.INSTANCE.getEPackage(ContextPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredContextPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ContextPackageImpl theContextPackage = registeredContextPackage instanceof ContextPackageImpl ? (ContextPackageImpl)registeredContextPackage : new ContextPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		CorpusPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theContextPackage.createPackageContents();

		// Initialize created meta-data
		theContextPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theContextPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ContextPackage.eNS_URI, theContextPackage);
		return theContextPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComplianceContext() {
		return complianceContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Id() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Name() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Version() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Description() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Kind() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Jurisdiction() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_ReferenceLanguage() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Licence() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComplianceContext_Attribution() {
		return (EAttribute)complianceContextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceContext_Corpora() {
		return (EReference)complianceContextEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceContext_RequirementGroups() {
		return (EReference)complianceContextEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceContext_Requirements() {
		return (EReference)complianceContextEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceContext_Taxonomies() {
		return (EReference)complianceContextEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComplianceContext_Roles() {
		return (EReference)complianceContextEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementGroup() {
		return requirementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementGroup_Id() {
		return (EAttribute)requirementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementGroup_Title() {
		return (EAttribute)requirementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementGroup_Description() {
		return (EAttribute)requirementGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementGroup_Groups() {
		return (EReference)requirementGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirementGroup_Requirements() {
		return (EReference)requirementGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Id() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Title() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Statement() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Guidance() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Level() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Cites() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_AppliesTo() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRequirement_Properties() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_ValidFrom() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_ValidUntil() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_Origin() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_ConfirmedBy() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirement_ConfirmedAt() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaxonomy() {
		return taxonomyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaxonomy_Id() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaxonomy_Name() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaxonomy_Description() {
		return (EAttribute)taxonomyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTaxonomy_Categories() {
		return (EReference)taxonomyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Id() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Name() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Description() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_Kind() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategory_Cites() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategory_Properties() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_ValidFrom() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategory_ValidUntil() {
		return (EAttribute)categoryEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCategory_Children() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRole() {
		return roleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Id() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Name() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRole_Description() {
		return (EAttribute)roleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCrosswalk() {
		return crosswalkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrosswalk_Id() {
		return (EAttribute)crosswalkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrosswalk_Name() {
		return (EAttribute)crosswalkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrosswalk_Version() {
		return (EAttribute)crosswalkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrosswalk_Description() {
		return (EAttribute)crosswalkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrosswalk_Licence() {
		return (EAttribute)crosswalkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCrosswalk_Attribution() {
		return (EAttribute)crosswalkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrosswalk_Source() {
		return (EReference)crosswalkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrosswalk_Target() {
		return (EReference)crosswalkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCrosswalk_Mappings() {
		return (EReference)crosswalkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementMapping() {
		return requirementMappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementMapping_SourceRequirementId() {
		return (EAttribute)requirementMappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementMapping_TargetRequirementId() {
		return (EAttribute)requirementMappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementMapping_Relationship() {
		return (EAttribute)requirementMappingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementMapping_Remarks() {
		return (EAttribute)requirementMappingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementMapping_Origin() {
		return (EAttribute)requirementMappingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementMapping_ConfirmedBy() {
		return (EAttribute)requirementMappingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementMapping_ConfirmedAt() {
		return (EAttribute)requirementMappingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextRef() {
		return contextRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextRef_ContextId() {
		return (EAttribute)contextRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContextRef_ContextVersion() {
		return (EAttribute)contextRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRequirementRef() {
		return requirementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRequirementRef_RequirementId() {
		return (EAttribute)requirementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCategoryRef() {
		return categoryRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategoryRef_TaxonomyId() {
		return (EAttribute)categoryRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCategoryRef_CategoryId() {
		return (EAttribute)categoryRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getContextKind() {
		return contextKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOrigin() {
		return originEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getMappingRelationship() {
		return mappingRelationshipEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextFactory getContextFactory() {
		return (ContextFactory)getEFactoryInstance();
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
		complianceContextEClass = createEClass(COMPLIANCE_CONTEXT);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__ID);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__NAME);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__VERSION);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__DESCRIPTION);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__KIND);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__JURISDICTION);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__REFERENCE_LANGUAGE);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__LICENCE);
		createEAttribute(complianceContextEClass, COMPLIANCE_CONTEXT__ATTRIBUTION);
		createEReference(complianceContextEClass, COMPLIANCE_CONTEXT__CORPORA);
		createEReference(complianceContextEClass, COMPLIANCE_CONTEXT__REQUIREMENT_GROUPS);
		createEReference(complianceContextEClass, COMPLIANCE_CONTEXT__REQUIREMENTS);
		createEReference(complianceContextEClass, COMPLIANCE_CONTEXT__TAXONOMIES);
		createEReference(complianceContextEClass, COMPLIANCE_CONTEXT__ROLES);

		requirementGroupEClass = createEClass(REQUIREMENT_GROUP);
		createEAttribute(requirementGroupEClass, REQUIREMENT_GROUP__ID);
		createEAttribute(requirementGroupEClass, REQUIREMENT_GROUP__TITLE);
		createEAttribute(requirementGroupEClass, REQUIREMENT_GROUP__DESCRIPTION);
		createEReference(requirementGroupEClass, REQUIREMENT_GROUP__GROUPS);
		createEReference(requirementGroupEClass, REQUIREMENT_GROUP__REQUIREMENTS);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__ID);
		createEAttribute(requirementEClass, REQUIREMENT__TITLE);
		createEAttribute(requirementEClass, REQUIREMENT__STATEMENT);
		createEAttribute(requirementEClass, REQUIREMENT__GUIDANCE);
		createEAttribute(requirementEClass, REQUIREMENT__LEVEL);
		createEReference(requirementEClass, REQUIREMENT__CITES);
		createEReference(requirementEClass, REQUIREMENT__APPLIES_TO);
		createEReference(requirementEClass, REQUIREMENT__PROPERTIES);
		createEAttribute(requirementEClass, REQUIREMENT__VALID_FROM);
		createEAttribute(requirementEClass, REQUIREMENT__VALID_UNTIL);
		createEAttribute(requirementEClass, REQUIREMENT__ORIGIN);
		createEAttribute(requirementEClass, REQUIREMENT__CONFIRMED_BY);
		createEAttribute(requirementEClass, REQUIREMENT__CONFIRMED_AT);

		taxonomyEClass = createEClass(TAXONOMY);
		createEAttribute(taxonomyEClass, TAXONOMY__ID);
		createEAttribute(taxonomyEClass, TAXONOMY__NAME);
		createEAttribute(taxonomyEClass, TAXONOMY__DESCRIPTION);
		createEReference(taxonomyEClass, TAXONOMY__CATEGORIES);

		categoryEClass = createEClass(CATEGORY);
		createEAttribute(categoryEClass, CATEGORY__ID);
		createEAttribute(categoryEClass, CATEGORY__NAME);
		createEAttribute(categoryEClass, CATEGORY__DESCRIPTION);
		createEAttribute(categoryEClass, CATEGORY__KIND);
		createEReference(categoryEClass, CATEGORY__CITES);
		createEReference(categoryEClass, CATEGORY__PROPERTIES);
		createEAttribute(categoryEClass, CATEGORY__VALID_FROM);
		createEAttribute(categoryEClass, CATEGORY__VALID_UNTIL);
		createEReference(categoryEClass, CATEGORY__CHILDREN);

		roleEClass = createEClass(ROLE);
		createEAttribute(roleEClass, ROLE__ID);
		createEAttribute(roleEClass, ROLE__NAME);
		createEAttribute(roleEClass, ROLE__DESCRIPTION);

		crosswalkEClass = createEClass(CROSSWALK);
		createEAttribute(crosswalkEClass, CROSSWALK__ID);
		createEAttribute(crosswalkEClass, CROSSWALK__NAME);
		createEAttribute(crosswalkEClass, CROSSWALK__VERSION);
		createEAttribute(crosswalkEClass, CROSSWALK__DESCRIPTION);
		createEAttribute(crosswalkEClass, CROSSWALK__LICENCE);
		createEAttribute(crosswalkEClass, CROSSWALK__ATTRIBUTION);
		createEReference(crosswalkEClass, CROSSWALK__SOURCE);
		createEReference(crosswalkEClass, CROSSWALK__TARGET);
		createEReference(crosswalkEClass, CROSSWALK__MAPPINGS);

		requirementMappingEClass = createEClass(REQUIREMENT_MAPPING);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__RELATIONSHIP);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__REMARKS);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__ORIGIN);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__CONFIRMED_BY);
		createEAttribute(requirementMappingEClass, REQUIREMENT_MAPPING__CONFIRMED_AT);

		contextRefEClass = createEClass(CONTEXT_REF);
		createEAttribute(contextRefEClass, CONTEXT_REF__CONTEXT_ID);
		createEAttribute(contextRefEClass, CONTEXT_REF__CONTEXT_VERSION);

		requirementRefEClass = createEClass(REQUIREMENT_REF);
		createEAttribute(requirementRefEClass, REQUIREMENT_REF__REQUIREMENT_ID);

		categoryRefEClass = createEClass(CATEGORY_REF);
		createEAttribute(categoryRefEClass, CATEGORY_REF__TAXONOMY_ID);
		createEAttribute(categoryRefEClass, CATEGORY_REF__CATEGORY_ID);

		// Create enums
		contextKindEEnum = createEEnum(CONTEXT_KIND);
		originEEnum = createEEnum(ORIGIN);
		mappingRelationshipEEnum = createEEnum(MAPPING_RELATIONSHIP);
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
		CorpusPackage theCorpusPackage = (CorpusPackage)EPackage.Registry.INSTANCE.getEPackage(CorpusPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementRefEClass.getESuperTypes().add(this.getContextRef());
		categoryRefEClass.getESuperTypes().add(this.getContextRef());

		// Initialize classes, features, and operations; add parameters
		initEClass(complianceContextEClass, ComplianceContext.class, "ComplianceContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComplianceContext_Id(), ecorePackage.getEString(), "id", null, 1, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_Name(), ecorePackage.getEString(), "name", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_Version(), ecorePackage.getEString(), "version", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_Description(), ecorePackage.getEString(), "description", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_Kind(), this.getContextKind(), "kind", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_Jurisdiction(), ecorePackage.getEString(), "jurisdiction", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_ReferenceLanguage(), ecorePackage.getEString(), "referenceLanguage", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_Licence(), ecorePackage.getEString(), "licence", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComplianceContext_Attribution(), ecorePackage.getEString(), "attribution", null, 0, 1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceContext_Corpora(), theCorpusPackage.getCorpus(), null, "corpora", null, 0, -1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceContext_RequirementGroups(), this.getRequirementGroup(), null, "requirementGroups", null, 0, -1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceContext_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceContext_Taxonomies(), this.getTaxonomy(), null, "taxonomies", null, 0, -1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComplianceContext_Roles(), this.getRole(), null, "roles", null, 0, -1, ComplianceContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementGroupEClass, RequirementGroup.class, "RequirementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementGroup_Id(), ecorePackage.getEString(), "id", null, 1, 1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementGroup_Title(), ecorePackage.getEString(), "title", null, 0, 1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementGroup_Description(), ecorePackage.getEString(), "description", null, 0, 1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementGroup_Groups(), this.getRequirementGroup(), null, "groups", null, 0, -1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementGroup_Requirements(), this.getRequirement(), null, "requirements", null, 0, -1, RequirementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Id(), ecorePackage.getEString(), "id", null, 1, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Title(), ecorePackage.getEString(), "title", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Statement(), ecorePackage.getEString(), "statement", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Guidance(), ecorePackage.getEString(), "guidance", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Level(), ecorePackage.getEString(), "level", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Cites(), theCorpusPackage.getCitable(), null, "cites", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_AppliesTo(), this.getCategory(), null, "appliesTo", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Properties(), theCorpusPackage.getProperty(), null, "properties", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ValidFrom(), ecorePackage.getEString(), "validFrom", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ValidUntil(), ecorePackage.getEString(), "validUntil", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Origin(), this.getOrigin(), "origin", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ConfirmedBy(), ecorePackage.getEString(), "confirmedBy", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ConfirmedAt(), ecorePackage.getEString(), "confirmedAt", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taxonomyEClass, Taxonomy.class, "Taxonomy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaxonomy_Id(), ecorePackage.getEString(), "id", null, 1, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Name(), ecorePackage.getEString(), "name", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTaxonomy_Description(), ecorePackage.getEString(), "description", null, 0, 1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTaxonomy_Categories(), this.getCategory(), null, "categories", null, 0, -1, Taxonomy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategory_Id(), ecorePackage.getEString(), "id", null, 1, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_Name(), ecorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_Description(), ecorePackage.getEString(), "description", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_Kind(), ecorePackage.getEString(), "kind", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Cites(), theCorpusPackage.getCitable(), null, "cites", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Properties(), theCorpusPackage.getProperty(), null, "properties", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_ValidFrom(), ecorePackage.getEString(), "validFrom", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategory_ValidUntil(), ecorePackage.getEString(), "validUntil", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCategory_Children(), this.getCategory(), null, "children", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(roleEClass, Role.class, "Role", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRole_Id(), ecorePackage.getEString(), "id", null, 1, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Name(), ecorePackage.getEString(), "name", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRole_Description(), ecorePackage.getEString(), "description", null, 0, 1, Role.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(crosswalkEClass, Crosswalk.class, "Crosswalk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrosswalk_Id(), ecorePackage.getEString(), "id", null, 1, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrosswalk_Name(), ecorePackage.getEString(), "name", null, 0, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrosswalk_Version(), ecorePackage.getEString(), "version", null, 0, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrosswalk_Description(), ecorePackage.getEString(), "description", null, 0, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrosswalk_Licence(), ecorePackage.getEString(), "licence", null, 0, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrosswalk_Attribution(), ecorePackage.getEString(), "attribution", null, 0, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrosswalk_Source(), this.getContextRef(), null, "source", null, 1, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrosswalk_Target(), this.getContextRef(), null, "target", null, 1, 1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCrosswalk_Mappings(), this.getRequirementMapping(), null, "mappings", null, 0, -1, Crosswalk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementMappingEClass, RequirementMapping.class, "RequirementMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementMapping_SourceRequirementId(), ecorePackage.getEString(), "sourceRequirementId", null, 1, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementMapping_TargetRequirementId(), ecorePackage.getEString(), "targetRequirementId", null, 1, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementMapping_Relationship(), this.getMappingRelationship(), "relationship", null, 1, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementMapping_Remarks(), ecorePackage.getEString(), "remarks", null, 0, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementMapping_Origin(), this.getOrigin(), "origin", null, 0, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementMapping_ConfirmedBy(), ecorePackage.getEString(), "confirmedBy", null, 0, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementMapping_ConfirmedAt(), ecorePackage.getEString(), "confirmedAt", null, 0, 1, RequirementMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contextRefEClass, ContextRef.class, "ContextRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContextRef_ContextId(), ecorePackage.getEString(), "contextId", null, 1, 1, ContextRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContextRef_ContextVersion(), ecorePackage.getEString(), "contextVersion", null, 0, 1, ContextRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementRefEClass, RequirementRef.class, "RequirementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementRef_RequirementId(), ecorePackage.getEString(), "requirementId", null, 1, 1, RequirementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(categoryRefEClass, CategoryRef.class, "CategoryRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCategoryRef_TaxonomyId(), ecorePackage.getEString(), "taxonomyId", null, 1, 1, CategoryRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCategoryRef_CategoryId(), ecorePackage.getEString(), "categoryId", null, 1, 1, CategoryRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(contextKindEEnum, ContextKind.class, "ContextKind");
		addEEnumLiteral(contextKindEEnum, ContextKind.REGULATION);
		addEEnumLiteral(contextKindEEnum, ContextKind.STANDARD);
		addEEnumLiteral(contextKindEEnum, ContextKind.TECHNICAL_GUIDELINE);
		addEEnumLiteral(contextKindEEnum, ContextKind.MINIMUM_STANDARD);
		addEEnumLiteral(contextKindEEnum, ContextKind.OTHER);

		initEEnum(originEEnum, Origin.class, "Origin");
		addEEnumLiteral(originEEnum, Origin.SOURCE);
		addEEnumLiteral(originEEnum, Origin.AI_AGENT);
		addEEnumLiteral(originEEnum, Origin.HUMAN);

		initEEnum(mappingRelationshipEEnum, MappingRelationship.class, "MappingRelationship");
		addEEnumLiteral(mappingRelationshipEEnum, MappingRelationship.EQUIVALENT);
		addEEnumLiteral(mappingRelationshipEEnum, MappingRelationship.SUBSET);
		addEEnumLiteral(mappingRelationshipEEnum, MappingRelationship.SUPERSET);
		addEEnumLiteral(mappingRelationshipEEnum, MappingRelationship.INTERSECTS);
		addEEnumLiteral(mappingRelationshipEEnum, MappingRelationship.NO_RELATIONSHIP);

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
			   "documentation", "A compliance context (GDPR, Grundschutz++, ISO 27001, CRA, AI Act, KRITIS, BSI TR, ...): the corpora it cites, the requirements derived from them, its taxonomies and roles. Also the crosswalks between contexts and the by-id references other models use to point into a context."
		   });
		addAnnotation
		  (contextKindEEnum,
		   source,
		   new String[] {
			   "documentation", "What kind of regime a context represents."
		   });
		addAnnotation
		  (contextKindEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Binding law, e.g. GDPR, CRA, AI Act, KRITIS."
		   });
		addAnnotation
		  (contextKindEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "A standard or certification scheme, e.g. ISO/IEC 27001, BSI IT-Grundschutz."
		   });
		addAnnotation
		  (contextKindEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "A technical guideline, e.g. a BSI TR."
		   });
		addAnnotation
		  (contextKindEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "A minimum standard binding for an administration, e.g. under \u00a7 44 BSIG."
		   });
		addAnnotation
		  (contextKindEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Anything else."
		   });
		addAnnotation
		  (originEEnum,
		   source,
		   new String[] {
			   "documentation", "Where a curated element comes from."
		   });
		addAnnotation
		  (originEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Taken unchanged from a machine-readable source, e.g. an OSCAL catalog or mapping."
		   });
		addAnnotation
		  (originEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "Derived by an agent. Counts only after a person confirmed it."
		   });
		addAnnotation
		  (originEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "Written by a person."
		   });
		addAnnotation
		  (complianceContextEClass,
		   source,
		   new String[] {
			   "documentation", "One version of one compliance context. Stored as its own XMI in a model.atlas registry; reports and inventories refer to it by id and version."
		   });
		addAnnotation
		  (getComplianceContext_Id(),
		   source,
		   new String[] {
			   "documentation", "Stable identifier, e.g. gdpr, grundschutz-plusplus, iso27001, bsi-tr-03183."
		   });
		addAnnotation
		  (getComplianceContext_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getComplianceContext_Version(),
		   source,
		   new String[] {
			   "documentation", "Version of the context. A new consolidation of a corpus is a new version."
		   });
		addAnnotation
		  (getComplianceContext_Description(),
		   source,
		   new String[] {
			   "documentation", "What the context covers."
		   });
		addAnnotation
		  (getComplianceContext_Kind(),
		   source,
		   new String[] {
			   "documentation", "What kind of regime this is."
		   });
		addAnnotation
		  (getComplianceContext_Jurisdiction(),
		   source,
		   new String[] {
			   "documentation", "Where the context applies, e.g. EU, DE."
		   });
		addAnnotation
		  (getComplianceContext_ReferenceLanguage(),
		   source,
		   new String[] {
			   "documentation", "Language of the corpus versions that requirements and categories cite, e.g. EN. Other language versions of the same work resolve the same citationIds for display."
		   });
		addAnnotation
		  (getComplianceContext_Licence(),
		   source,
		   new String[] {
			   "documentation", "Licence of the context data. For a context without corpus (ISO 27001), states why."
		   });
		addAnnotation
		  (getComplianceContext_Attribution(),
		   source,
		   new String[] {
			   "documentation", "The attribution the licences of the context and its corpora require."
		   });
		addAnnotation
		  (getComplianceContext_Corpora(),
		   source,
		   new String[] {
			   "documentation", "The texts this context cites. Empty when the text may not be redistributed; the requirements then carry our own titles and paraphrases."
		   });
		addAnnotation
		  (getComplianceContext_RequirementGroups(),
		   source,
		   new String[] {
			   "documentation", "Structure of the requirements, e.g. the practices of Grundschutz++ or the chapters of a TR."
		   });
		addAnnotation
		  (getComplianceContext_Requirements(),
		   source,
		   new String[] {
			   "documentation", "Requirements not held by a group."
		   });
		addAnnotation
		  (getComplianceContext_Taxonomies(),
		   source,
		   new String[] {
			   "documentation", "Classifications of this context: data categories, lawful bases, target object types, risk classes, mechanisms."
		   });
		addAnnotation
		  (getComplianceContext_Roles(),
		   source,
		   new String[] {
			   "documentation", "Roles the context names, e.g. data protection officer, CISO."
		   });
		addAnnotation
		  (requirementGroupEClass,
		   source,
		   new String[] {
			   "documentation", "A group of requirements."
		   });
		addAnnotation
		  (getRequirementGroup_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier of the group, unique within the context."
		   });
		addAnnotation
		  (getRequirementGroup_Title(),
		   source,
		   new String[] {
			   "documentation", "Title of the group."
		   });
		addAnnotation
		  (getRequirementGroup_Description(),
		   source,
		   new String[] {
			   "documentation", "Description of the group."
		   });
		addAnnotation
		  (getRequirementGroup_Groups(),
		   source,
		   new String[] {
			   "documentation", "Nested groups."
		   });
		addAnnotation
		  (getRequirementGroup_Requirements(),
		   source,
		   new String[] {
			   "documentation", "Requirements of the group."
		   });
		addAnnotation
		  (requirementEClass,
		   source,
		   new String[] {
			   "documentation", "One requirement of a context: what an inventory has to satisfy. For an OSCAL catalog it maps 1:1 to a control; for legal texts and technical documents it is derived and confirmed by a person. Measures, applicability and findings refer to it by context id and requirement id."
		   });
		addAnnotation
		  (getRequirement_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the context, e.g. KONF.1.1, A.5.1, GDPR-32-1-a. EMF ID, so references to it inside the context XMI are written by id."
		   });
		addAnnotation
		  (getRequirement_Title(),
		   source,
		   new String[] {
			   "documentation", "Short title. For copyrighted sources (ISO 27001) our own title."
		   });
		addAnnotation
		  (getRequirement_Statement(),
		   source,
		   new String[] {
			   "documentation", "What is required. For copyrighted sources a paraphrase or empty."
		   });
		addAnnotation
		  (getRequirement_Guidance(),
		   source,
		   new String[] {
			   "documentation", "How the requirement is usually met."
		   });
		addAnnotation
		  (getRequirement_Level(),
		   source,
		   new String[] {
			   "documentation", "Level or obligation, e.g. normal-SdT / erhoeht (Grundschutz++), MUSS / SOLL (TR)."
		   });
		addAnnotation
		  (getRequirement_Cites(),
		   source,
		   new String[] {
			   "documentation", "The corpus units this requirement is based on. Empty for a context without corpus."
		   });
		addAnnotation
		  (getRequirement_AppliesTo(),
		   source,
		   new String[] {
			   "documentation", "The categories (e.g. BSI target object types) the requirement applies to."
		   });
		addAnnotation
		  (getRequirement_Properties(),
		   source,
		   new String[] {
			   "documentation", "Further properties, e.g. effort level."
		   });
		addAnnotation
		  (getRequirement_ValidFrom(),
		   source,
		   new String[] {
			   "documentation", "Start of validity as ISO-8601 date, if the requirement is time bound."
		   });
		addAnnotation
		  (getRequirement_ValidUntil(),
		   source,
		   new String[] {
			   "documentation", "End of validity as ISO-8601 date or year, e.g. 2031 for a mechanism of TR-02102. A measure relying on it becomes a finding after that date."
		   });
		addAnnotation
		  (getRequirement_Origin(),
		   source,
		   new String[] {
			   "documentation", "Where the requirement comes from."
		   });
		addAnnotation
		  (getRequirement_ConfirmedBy(),
		   source,
		   new String[] {
			   "documentation", "Who confirmed a derived requirement."
		   });
		addAnnotation
		  (getRequirement_ConfirmedAt(),
		   source,
		   new String[] {
			   "documentation", "When it was confirmed, as ISO-8601 date-time."
		   });
		addAnnotation
		  (taxonomyEClass,
		   source,
		   new String[] {
			   "documentation", "A classification of the context, as data so it can evolve without regenerating code."
		   });
		addAnnotation
		  (getTaxonomy_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the context, e.g. data-category, lawful-basis, target-object-type."
		   });
		addAnnotation
		  (getTaxonomy_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getTaxonomy_Description(),
		   source,
		   new String[] {
			   "documentation", "What is classified."
		   });
		addAnnotation
		  (getTaxonomy_Categories(),
		   source,
		   new String[] {
			   "documentation", "Top-level categories."
		   });
		addAnnotation
		  (categoryEClass,
		   source,
		   new String[] {
			   "documentation", "One category of a taxonomy, possibly with subcategories."
		   });
		addAnnotation
		  (getCategory_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the taxonomy, e.g. SPECIAL_CATEGORY, ART6_1_A or the BSI UUID of a target object type."
		   });
		addAnnotation
		  (getCategory_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getCategory_Description(),
		   source,
		   new String[] {
			   "documentation", "What the category means."
		   });
		addAnnotation
		  (getCategory_Kind(),
		   source,
		   new String[] {
			   "documentation", "Optional kind, e.g. Technisch / Organisatorisch for BSI target object types."
		   });
		addAnnotation
		  (getCategory_Cites(),
		   source,
		   new String[] {
			   "documentation", "The corpus units that define the category, e.g. Art.6(1)(a) for a lawful basis."
		   });
		addAnnotation
		  (getCategory_Properties(),
		   source,
		   new String[] {
			   "documentation", "Structured attributes, e.g. key length for a TR-02102 mechanism."
		   });
		addAnnotation
		  (getCategory_ValidFrom(),
		   source,
		   new String[] {
			   "documentation", "Start of validity as ISO-8601 date."
		   });
		addAnnotation
		  (getCategory_ValidUntil(),
		   source,
		   new String[] {
			   "documentation", "End of validity as ISO-8601 date or year."
		   });
		addAnnotation
		  (getCategory_Children(),
		   source,
		   new String[] {
			   "documentation", "Subcategories."
		   });
		addAnnotation
		  (roleEClass,
		   source,
		   new String[] {
			   "documentation", "A role named by the context."
		   });
		addAnnotation
		  (getRole_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier, unique within the context."
		   });
		addAnnotation
		  (getRole_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getRole_Description(),
		   source,
		   new String[] {
			   "documentation", "Responsibilities of the role."
		   });
		addAnnotation
		  (mappingRelationshipEEnum,
		   source,
		   new String[] {
			   "documentation", "How the source requirement relates to the target requirement, following the OSCAL mapping model and NIST IR 8477. Read as: source RELATIONSHIP target."
		   });
		addAnnotation
		  (mappingRelationshipEEnum.getELiterals().get(0),
		   source,
		   new String[] {
			   "documentation", "Source and target require the same. Satisfying the source covers the target."
		   });
		addAnnotation
		  (mappingRelationshipEEnum.getELiterals().get(1),
		   source,
		   new String[] {
			   "documentation", "The source requires less than the target. Satisfying the source covers the target at most partly."
		   });
		addAnnotation
		  (mappingRelationshipEEnum.getELiterals().get(2),
		   source,
		   new String[] {
			   "documentation", "The source requires more than the target. Satisfying the source covers the target."
		   });
		addAnnotation
		  (mappingRelationshipEEnum.getELiterals().get(3),
		   source,
		   new String[] {
			   "documentation", "Source and target overlap. Satisfying the source covers the target at most partly."
		   });
		addAnnotation
		  (mappingRelationshipEEnum.getELiterals().get(4),
		   source,
		   new String[] {
			   "documentation", "Source and target are unrelated; recorded so the absence is explicit."
		   });
		addAnnotation
		  (crosswalkEClass,
		   source,
		   new String[] {
			   "documentation", "A mapping from the requirements of one context to another, e.g. ISO 27001 Annex A to Grundschutz++. Stored as its own XMI; imported from an OSCAL mapping-collection where one exists."
		   });
		addAnnotation
		  (getCrosswalk_Id(),
		   source,
		   new String[] {
			   "documentation", "Identifier of the crosswalk."
		   });
		addAnnotation
		  (getCrosswalk_Name(),
		   source,
		   new String[] {
			   "documentation", "Display name."
		   });
		addAnnotation
		  (getCrosswalk_Version(),
		   source,
		   new String[] {
			   "documentation", "Version of the crosswalk."
		   });
		addAnnotation
		  (getCrosswalk_Description(),
		   source,
		   new String[] {
			   "documentation", "Scope and method of the mapping."
		   });
		addAnnotation
		  (getCrosswalk_Licence(),
		   source,
		   new String[] {
			   "documentation", "Licence of the mapping data."
		   });
		addAnnotation
		  (getCrosswalk_Attribution(),
		   source,
		   new String[] {
			   "documentation", "Attribution the licence requires."
		   });
		addAnnotation
		  (getCrosswalk_Source(),
		   source,
		   new String[] {
			   "documentation", "The context the mappings start from."
		   });
		addAnnotation
		  (getCrosswalk_Target(),
		   source,
		   new String[] {
			   "documentation", "The context the mappings point to."
		   });
		addAnnotation
		  (getCrosswalk_Mappings(),
		   source,
		   new String[] {
			   "documentation", "The mappings."
		   });
		addAnnotation
		  (requirementMappingEClass,
		   source,
		   new String[] {
			   "documentation", "One mapping between a requirement of the source context and one of the target context. Coverage derived through it counts automatically only for EQUIVALENT and SUPERSET."
		   });
		addAnnotation
		  (getRequirementMapping_SourceRequirementId(),
		   source,
		   new String[] {
			   "documentation", "Requirement id in the source context."
		   });
		addAnnotation
		  (getRequirementMapping_TargetRequirementId(),
		   source,
		   new String[] {
			   "documentation", "Requirement id in the target context."
		   });
		addAnnotation
		  (getRequirementMapping_Relationship(),
		   source,
		   new String[] {
			   "documentation", "How source relates to target."
		   });
		addAnnotation
		  (getRequirementMapping_Remarks(),
		   source,
		   new String[] {
			   "documentation", "Explanation, e.g. which aspect of the target is not covered."
		   });
		addAnnotation
		  (getRequirementMapping_Origin(),
		   source,
		   new String[] {
			   "documentation", "Where the mapping comes from."
		   });
		addAnnotation
		  (getRequirementMapping_ConfirmedBy(),
		   source,
		   new String[] {
			   "documentation", "Who confirmed a derived mapping."
		   });
		addAnnotation
		  (getRequirementMapping_ConfirmedAt(),
		   source,
		   new String[] {
			   "documentation", "When it was confirmed, as ISO-8601 date-time."
		   });
		addAnnotation
		  (contextRefEClass,
		   source,
		   new String[] {
			   "documentation", "Points at a context by id and version, without an EMF reference, so that the referring model survives a new version of the context."
		   });
		addAnnotation
		  (getContextRef_ContextId(),
		   source,
		   new String[] {
			   "documentation", "Id of the context."
		   });
		addAnnotation
		  (getContextRef_ContextVersion(),
		   source,
		   new String[] {
			   "documentation", "Version of the context. Unset means the current version."
		   });
		addAnnotation
		  (requirementRefEClass,
		   source,
		   new String[] {
			   "documentation", "Points at a requirement of a context by id."
		   });
		addAnnotation
		  (getRequirementRef_RequirementId(),
		   source,
		   new String[] {
			   "documentation", "Id of the requirement within the context."
		   });
		addAnnotation
		  (categoryRefEClass,
		   source,
		   new String[] {
			   "documentation", "Points at a category of a context taxonomy by id."
		   });
		addAnnotation
		  (getCategoryRef_TaxonomyId(),
		   source,
		   new String[] {
			   "documentation", "Id of the taxonomy within the context."
		   });
		addAnnotation
		  (getCategoryRef_CategoryId(),
		   source,
		   new String[] {
			   "documentation", "Id of the category within the taxonomy."
		   });
	}

} //ContextPackageImpl
