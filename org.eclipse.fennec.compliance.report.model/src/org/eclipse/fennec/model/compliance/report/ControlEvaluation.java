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

import org.eclipse.emf.common.util.EList;

import org.eclipse.fennec.model.compliance.context.RequirementRef;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Evaluation of one requirement for the subject, for control-based contexts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.ControlEvaluation#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.ControlEvaluation#getResult <em>Result</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.ControlEvaluation#getMeasureIds <em>Measure Ids</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getControlEvaluation()
 * @model
 * @generated
 */
@ProviderType
public interface ControlEvaluation extends Evaluation {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The requirement checked.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference.
	 * @see #setRequirement(RequirementRef)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getControlEvaluation_Requirement()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RequirementRef getRequirement();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.ControlEvaluation#getRequirement <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' containment reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(RequirementRef value);

	/**
	 * Returns the value of the '<em><b>Result</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.report.ControlResult}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Result of the check.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Result</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.ControlResult
	 * @see #setResult(ControlResult)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getControlEvaluation_Result()
	 * @model
	 * @generated
	 */
	ControlResult getResult();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.ControlEvaluation#getResult <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.report.ControlResult
	 * @see #getResult()
	 * @generated
	 */
	void setResult(ControlResult value);

	/**
	 * Returns the value of the '<em><b>Measure Ids</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ids of the inventory measures the check relied on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Measure Ids</em>' attribute list.
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getControlEvaluation_MeasureIds()
	 * @model
	 * @generated
	 */
	EList<String> getMeasureIds();

} // ControlEvaluation
