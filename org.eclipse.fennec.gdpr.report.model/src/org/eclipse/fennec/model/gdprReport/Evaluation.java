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
package org.eclipse.fennec.model.gdprReport;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One thing that was examined, together with what was found on it. What that thing is depends on the review: a metamodel review examines classifiers and their features, a transformation review examines the paths along which values travel. Record an entry even when nothing was found, so a reader can tell 'examined and clean' from 'never examined'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evaluation#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evaluation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evaluation#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.Evaluation#getPartOfCombinations <em>Part Of Combinations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvaluation()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Evaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required and unique within the report. CombinationFinding points here, so it must be stable across reruns. For a classifier or a feature use classifier.feature, e.g. 'Patient.street'. For a flow use mapping:source->target, e.g. 'toContact:Patient.diagnosis->Contact.comment', which is derivable from the compiled unit and therefore the same on every rerun.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvaluation_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Evaluation#getId <em>Id</em>}' attribute.
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
	 * Name of what was examined, exactly as it appears in the reviewed artefact: a classifier or feature name in a metamodel review, a readable label for the path in a transformation review.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvaluation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.Evaluation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Findings about this one evaluation on its own - the classifier rather than any of its features, the feature itself, or this single flow. Findings that only arise from several evaluations together belong in a CombinationFinding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvaluation_Findings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Finding> getFindings();

	/**
	 * Returns the value of the '<em><b>Part Of Combinations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.CombinationFinding}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdprReport.CombinationFinding#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived: EMF maintains this from CombinationFinding.features. Do not set it directly; add the evaluation to the combination instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of Combinations</em>' reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getEvaluation_PartOfCombinations()
	 * @see org.eclipse.fennec.model.gdprReport.CombinationFinding#getFeatures
	 * @model opposite="features" transient="true" derived="true"
	 * @generated
	 */
	EList<CombinationFinding> getPartOfCombinations();

} // Evaluation
