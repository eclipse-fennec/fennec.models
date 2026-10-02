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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Matrix Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One cell of the risk matrix.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getRisk <em>Risk</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMatrixCell()
 * @model
 * @generated
 */
@ProviderType
public interface RiskMatrixCell extends EObject {
	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level on the likelihood scale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Likelihood</em>' reference.
	 * @see #setLikelihood(RiskLevel)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMatrixCell_Likelihood()
	 * @model required="true"
	 * @generated
	 */
	RiskLevel getLikelihood();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getLikelihood <em>Likelihood</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' reference.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Level on the severity scale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' reference.
	 * @see #setSeverity(RiskLevel)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMatrixCell_Severity()
	 * @model required="true"
	 * @generated
	 */
	RiskLevel getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getSeverity <em>Severity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' reference.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(RiskLevel value);

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resulting level on the risk scale.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk</em>' reference.
	 * @see #setRisk(RiskLevel)
	 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRiskMatrixCell_Risk()
	 * @model required="true"
	 * @generated
	 */
	RiskLevel getRisk();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.inventory.RiskMatrixCell#getRisk <em>Risk</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' reference.
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(RiskLevel value);

} // RiskMatrixCell
