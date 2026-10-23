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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protection Need Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One assessment of the protection need of an asset.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedBy <em>Assessed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedAt <em>Assessed At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment()
 * @model
 * @generated
 */
@ProviderType
public interface ProtectionNeedAssessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Confidentiality</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.ProtectionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Need for confidentiality.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Confidentiality</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @see #setConfidentiality(ProtectionLevel)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_Confidentiality()
	 * @model
	 * @generated
	 */
	ProtectionLevel getConfidentiality();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getConfidentiality <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confidentiality</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @see #getConfidentiality()
	 * @generated
	 */
	void setConfidentiality(ProtectionLevel value);

	/**
	 * Returns the value of the '<em><b>Integrity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.ProtectionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Need for integrity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Integrity</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @see #setIntegrity(ProtectionLevel)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_Integrity()
	 * @model
	 * @generated
	 */
	ProtectionLevel getIntegrity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getIntegrity <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integrity</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @see #getIntegrity()
	 * @generated
	 */
	void setIntegrity(ProtectionLevel value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.ProtectionLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Need for availability.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Availability</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @see #setAvailability(ProtectionLevel)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_Availability()
	 * @model
	 * @generated
	 */
	ProtectionLevel getAvailability();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAvailability <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionLevel
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(ProtectionLevel value);

	/**
	 * Returns the value of the '<em><b>Derivation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the levels were determined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derivation</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation
	 * @see #setDerivation(ProtectionNeedDerivation)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_Derivation()
	 * @model
	 * @generated
	 */
	ProtectionNeedDerivation getDerivation();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getDerivation <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Derivation</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation
	 * @see #getDerivation()
	 * @generated
	 */
	void setDerivation(ProtectionNeedDerivation value);

	/**
	 * Returns the value of the '<em><b>Derived From</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.Asset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assets the levels were inherited from.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Derived From</em>' reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_DerivedFrom()
	 * @model
	 * @generated
	 */
	EList<Asset> getDerivedFrom();

	/**
	 * Returns the value of the '<em><b>Rationale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why these levels.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rationale</em>' attribute.
	 * @see #setRationale(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_Rationale()
	 * @model
	 * @generated
	 */
	String getRationale();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getRationale <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rationale</em>' attribute.
	 * @see #getRationale()
	 * @generated
	 */
	void setRationale(String value);

	/**
	 * Returns the value of the '<em><b>Assessed By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Who assessed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessed By</em>' attribute.
	 * @see #setAssessedBy(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_AssessedBy()
	 * @model
	 * @generated
	 */
	String getAssessedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedBy <em>Assessed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessed By</em>' attribute.
	 * @see #getAssessedBy()
	 * @generated
	 */
	void setAssessedBy(String value);

	/**
	 * Returns the value of the '<em><b>Assessed At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When, as ISO-8601 date-time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assessed At</em>' attribute.
	 * @see #setAssessedAt(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedAssessment_AssessedAt()
	 * @model
	 * @generated
	 */
	String getAssessedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment#getAssessedAt <em>Assessed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assessed At</em>' attribute.
	 * @see #getAssessedAt()
	 * @generated
	 */
	void setAssessedAt(String value);

} // ProtectionNeedAssessment
