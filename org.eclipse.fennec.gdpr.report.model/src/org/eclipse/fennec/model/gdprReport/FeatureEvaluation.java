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
 * A representation of the model object '<em><b>Feature Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The result of examining one structural feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getUriFragment <em>Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getPartOfCombinations <em>Part Of Combinations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation()
 * @model
 * @generated
 */
@ProviderType
public interface FeatureEvaluation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Required and unique within the report. CombinationFinding points here, so it must be stable across reruns. Use classifier.feature, e.g. 'Patient.street'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getId <em>Id</em>}' attribute.
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
	 * Feature name exactly as it appears in the reviewed model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Uri Fragment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment addressing the feature, e.g. //Patient/street.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uri Fragment</em>' attribute.
	 * @see #setUriFragment(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_UriFragment()
	 * @model
	 * @generated
	 */
	String getUriFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getUriFragment <em>Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uri Fragment</em>' attribute.
	 * @see #getUriFragment()
	 * @generated
	 */
	void setUriFragment(String value);

	/**
	 * Returns the value of the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the feature's EType as written in the model, e.g. EString, EDate, Denomination. The type is itself a signal: a date on a birth field, or a byte array under a face field.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Name</em>' attribute.
	 * @see #setTypeName(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_TypeName()
	 * @model
	 * @generated
	 */
	String getTypeName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getTypeName <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Name</em>' attribute.
	 * @see #getTypeName()
	 * @generated
	 */
	void setTypeName(String value);

	/**
	 * Returns the value of the '<em><b>Many</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True when the feature's upperBound is not 1. A repeated feature can form a history or profile even when a single value would be harmless.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Many</em>' attribute.
	 * @see #setMany(boolean)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_Many()
	 * @model
	 * @generated
	 */
	boolean isMany();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#isMany <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Many</em>' attribute.
	 * @see #isMany()
	 * @generated
	 */
	void setMany(boolean value);

	/**
	 * Returns the value of the '<em><b>Relevance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.RelevanceLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Highest relevance among this feature's findings. Set NONE when the feature was examined and nothing was found; that is different from leaving it unset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RelevanceLevelType
	 * @see #setRelevanceLevel(RelevanceLevelType)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_RelevanceLevel()
	 * @model
	 * @generated
	 */
	RelevanceLevelType getRelevanceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getRelevanceLevel <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RelevanceLevelType
	 * @see #getRelevanceLevel()
	 * @generated
	 */
	void setRelevanceLevel(RelevanceLevelType value);

	/**
	 * Returns the value of the '<em><b>Findings</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.Finding}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Findings about this feature on its own. Findings that need other features belong in a CombinationFinding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Findings</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_Findings()
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
	 * Derived: EMF maintains this from CombinationFinding.features. Do not set it directly; add the feature to the combination instead.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Part Of Combinations</em>' reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFeatureEvaluation_PartOfCombinations()
	 * @see org.eclipse.fennec.model.gdprReport.CombinationFinding#getFeatures
	 * @model opposite="features" transient="true" derived="true"
	 * @generated
	 */
	EList<CombinationFinding> getPartOfCombinations();

} // FeatureEvaluation
