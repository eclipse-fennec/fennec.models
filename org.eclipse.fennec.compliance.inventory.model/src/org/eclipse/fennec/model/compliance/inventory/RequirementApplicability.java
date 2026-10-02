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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fennec.model.compliance.context.RequirementRef;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Applicability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Applicability and coverage of one requirement for the inventory: the row of a Statement of Applicability (ISO 27001), the result of the Grundschutz modelling, or the coverage view of a legal context.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#isApplicable <em>Applicable</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedAt <em>Decided At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability()
 * @model
 * @generated
 */
@ProviderType
public interface RequirementApplicability extends EObject {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(RequirementRef)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_Requirement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequirementRef getRequirement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(RequirementRef value);

	/**
	 * Returns the value of the '<em><b>Applicable</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether the requirement applies.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Applicable</em>' attribute.
	 * @see #setApplicable(boolean)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_Applicable()
	 * @model default="true"
	 * @generated
	 */
	boolean isApplicable();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#isApplicable <em>Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicable</em>' attribute.
	 * @see #isApplicable()
	 * @generated
	 */
	void setApplicable(boolean value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why it applies or not. Required when not applicable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_Justification()
	 * @model
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.ImplementationStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Implementation status. Derived from the measures when unset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ImplementationStatus
	 * @see #setStatus(ImplementationStatus)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_Status()
	 * @model
	 * @generated
	 */
	ImplementationStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ImplementationStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ImplementationStatus value);

	/**
	 * Returns the value of the '<em><b>Measures</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Measure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Measures that implement the requirement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measures</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_Measures()
	 * @model
	 * @generated
	 */
	EList<Measure> getMeasures();

	/**
	 * Returns the value of the '<em><b>Coverage</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.CoverageKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the requirement is covered.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Coverage</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.CoverageKind
	 * @see #setCoverage(CoverageKind)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_Coverage()
	 * @model
	 * @generated
	 */
	CoverageKind getCoverage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getCoverage <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coverage</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.CoverageKind
	 * @see #getCoverage()
	 * @generated
	 */
	void setCoverage(CoverageKind value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.RequirementRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * For DERIVED / CONFIRMED coverage: the requirements of other contexts the coverage was derived from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_DerivedFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementRef> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Assets</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Narrows the applicability to these assets, e.g. target objects in the Grundschutz modelling. Empty means the whole inventory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assets</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_Assets()
	 * @model
	 * @generated
	 */
	EList<Asset> getAssets();

	/**
	 * Returns the value of the '<em><b>Decided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who decided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided By</em>' attribute.
	 * @see #setDecidedBy(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_DecidedBy()
	 * @model
	 * @generated
	 */
	String getDecidedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedBy <em>Decided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decided By</em>' attribute.
	 * @see #getDecidedBy()
	 * @generated
	 */
	void setDecidedBy(String value);

	/**
	 * Returns the value of the '<em><b>Decided At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When, as ISO-8601 date-time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided At</em>' attribute.
	 * @see #setDecidedAt(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRequirementApplicability_DecidedAt()
	 * @model
	 * @generated
	 */
	String getDecidedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RequirementApplicability#getDecidedAt <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decided At</em>' attribute.
	 * @see #getDecidedAt()
	 * @generated
	 */
	void setDecidedAt(String value);

} // RequirementApplicability
