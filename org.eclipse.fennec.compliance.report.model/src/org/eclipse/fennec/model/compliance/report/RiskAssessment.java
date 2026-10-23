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
package org.eclipse.fennec.model.compliance.report;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Risk Assessment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Likelihood times severity gives the risk level, on the scales of a risk methodology of the inventory. The risk level is stated, not derived, so a person can deviate from the matrix.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getMethodologyId <em>Methodology Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getSeverity <em>Severity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getRiskLevel <em>Risk Level</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getRiskAssessment()
 * @model
 * @generated
 */
@ProviderType
public interface RiskAssessment extends EObject {
	/**
	 * Returns the value of the '<em><b>Methodology Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the risk methodology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Methodology Id</em>' attribute.
	 * @see #setMethodologyId(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getRiskAssessment_MethodologyId()
	 * @model required="true"
	 * @generated
	 */
	String getMethodologyId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getMethodologyId <em>Methodology Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Methodology Id</em>' attribute.
	 * @see #getMethodologyId()
	 * @generated
	 */
	void setMethodologyId(String value);

	/**
	 * Returns the value of the '<em><b>Likelihood</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the likelihood level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Likelihood</em>' attribute.
	 * @see #setLikelihood(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getRiskAssessment_Likelihood()
	 * @model
	 * @generated
	 */
	String getLikelihood();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getLikelihood <em>Likelihood</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Likelihood</em>' attribute.
	 * @see #getLikelihood()
	 * @generated
	 */
	void setLikelihood(String value);

	/**
	 * Returns the value of the '<em><b>Severity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the severity level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Severity</em>' attribute.
	 * @see #setSeverity(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getRiskAssessment_Severity()
	 * @model
	 * @generated
	 */
	String getSeverity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getSeverity <em>Severity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Severity</em>' attribute.
	 * @see #getSeverity()
	 * @generated
	 */
	void setSeverity(String value);

	/**
	 * Returns the value of the '<em><b>Risk Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Id of the resulting risk level.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Risk Level</em>' attribute.
	 * @see #setRiskLevel(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getRiskAssessment_RiskLevel()
	 * @model
	 * @generated
	 */
	String getRiskLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.RiskAssessment#getRiskLevel <em>Risk Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk Level</em>' attribute.
	 * @see #getRiskLevel()
	 * @generated
	 */
	void setRiskLevel(String value);

} // RiskAssessment
