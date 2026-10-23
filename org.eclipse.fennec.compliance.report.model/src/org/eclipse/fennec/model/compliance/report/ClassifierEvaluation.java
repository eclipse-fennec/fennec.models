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

import org.eclipse.fennec.model.compliance.context.CategoryRef;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The result of examining one classifier (EClass or EEnum) of the reviewed model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.ClassifierEvaluation#getUriFragment <em>Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.ClassifierEvaluation#getFeatureEvaluations <em>Feature Evaluations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.ClassifierEvaluation#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.ClassifierEvaluation#getLawfulBases <em>Lawful Bases</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getClassifierEvaluation()
 * @model
 * @generated
 */
@ProviderType
public interface ClassifierEvaluation extends Evaluation {
	/**
	 * Returns the value of the '<em><b>Uri Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment addressing the classifier in its own resource, e.g. //Patient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri Fragment</em>' attribute.
	 * @see #setUriFragment(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getClassifierEvaluation_UriFragment()
	 * @model
	 * @generated
	 */
	String getUriFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.ClassifierEvaluation#getUriFragment <em>Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Fragment</em>' attribute.
	 * @see #getUriFragment()
	 * @generated
	 */
	void setUriFragment(String value);

	/**
	 * Returns the value of the '<em><b>Feature Evaluations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.report.FeatureEvaluation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One entry per structural feature examined, including features where nothing was found.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Evaluations</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getClassifierEvaluation_FeatureEvaluations()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureEvaluation> getFeatureEvaluations();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Purpose of processing of the classifier as a whole. Its features inherit it.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getClassifierEvaluation_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.report.ClassifierEvaluation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

	/**
	 * Returns the value of the '<em><b>Lawful Bases</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.CategoryRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lawful bases of the processing, from the lawful-basis taxonomy. Its features inherit them.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lawful Bases</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getClassifierEvaluation_LawfulBases()
	 * @model containment="true"
	 * @generated
	 */
	EList<CategoryRef> getLawfulBases();

} // ClassifierEvaluation
