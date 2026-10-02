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
 * A representation of the model object '<em><b>Risk Methodology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Scales and matrix used to assess risks, e.g. BSI 200-3 (four levels each). Findings refer to it by id and to its levels by id.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getRisk <em>Risk</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology()
 * @model
 * @generated
 */
@ProviderType
public interface RiskMethodology extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier, unique within the inventory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Description.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scale for the likelihood (frequency).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Likelihood</em>' containment reference.
	 * @see #setLikelihood(RiskScale)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology_Likelihood()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RiskScale getLikelihood();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getLikelihood <em>Likelihood</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' containment reference.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(RiskScale value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scale for the severity (impact).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' containment reference.
	 * @see #setSeverity(RiskScale)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology_Severity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RiskScale getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getSeverity <em>Severity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' containment reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(RiskScale value);

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Scale for the resulting risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk</em>' containment reference.
	 * @see #setRisk(RiskScale)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology_Risk()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RiskScale getRisk();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMethodology#getRisk <em>Risk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' containment reference.
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(RiskScale value);

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Which risk level a combination of likelihood and severity yields.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMethodology_Matrix()
	 * @model containment="true"
	 * @generated
	 */
	EList<RiskMatrixCell> getMatrix();

} // RiskMethodology
