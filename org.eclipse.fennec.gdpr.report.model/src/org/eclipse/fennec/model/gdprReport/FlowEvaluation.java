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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Flow Evaluation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The result of examining one path along which a transformation moves a value: one source feature reaching one target feature, in one mapping. A metamodel review asks what a field holds; a transformation review asks where what it holds ends up, so the unit of evaluation is the pair rather than the field. Several sources reaching the same target field are several FlowEvaluations, tied together by one CombinationFinding.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getSourceNsURI <em>Source Ns URI</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getTargetNsURI <em>Target Ns URI</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getTargetFeature <em>Target Feature</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getFlowKind <em>Flow Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation()
 * @model
 * @generated
 */
@ProviderType
public interface FlowEvaluation extends Evaluation {
	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the mapping or helper the assignment sits in, e.g. toContact. A transformation has no line numbers to quote once compiled, so this is the coarsest address a developer can act on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mapping</em>' attribute.
	 * @see #setMapping(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_Mapping()
	 * @model
	 * @generated
	 */
	String getMapping();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getMapping <em>Mapping</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' attribute.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(String value);

	/**
	 * Returns the value of the '<em><b>Source Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nsURI of the metamodel the source feature belongs to. Two source models can carry the same fragment, so the fragment alone does not identify a feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Ns URI</em>' attribute.
	 * @see #setSourceNsURI(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_SourceNsURI()
	 * @model
	 * @generated
	 */
	String getSourceNsURI();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getSourceNsURI <em>Source Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Ns URI</em>' attribute.
	 * @see #getSourceNsURI()
	 * @generated
	 */
	void setSourceNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Source Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment of the feature that is read, e.g. //Patient/diagnosis. It matches the uriFragment of a FeatureEvaluation in that metamodel's own review, which is how a finding here inherits its category and its evidence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source Feature</em>' attribute.
	 * @see #setSourceFeature(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_SourceFeature()
	 * @model
	 * @generated
	 */
	String getSourceFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getSourceFeature <em>Source Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Feature</em>' attribute.
	 * @see #getSourceFeature()
	 * @generated
	 */
	void setSourceFeature(String value);

	/**
	 * Returns the value of the '<em><b>Target Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * nsURI of the metamodel the target feature belongs to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Ns URI</em>' attribute.
	 * @see #setTargetNsURI(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_TargetNsURI()
	 * @model
	 * @generated
	 */
	String getTargetNsURI();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getTargetNsURI <em>Target Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Ns URI</em>' attribute.
	 * @see #getTargetNsURI()
	 * @generated
	 */
	void setTargetNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Target Feature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMF fragment of the feature that is written, e.g. //Contact/comment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Target Feature</em>' attribute.
	 * @see #setTargetFeature(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_TargetFeature()
	 * @model
	 * @generated
	 */
	String getTargetFeature();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getTargetFeature <em>Target Feature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Feature</em>' attribute.
	 * @see #getTargetFeature()
	 * @generated
	 */
	void setTargetFeature(String value);

	/**
	 * Returns the value of the '<em><b>Flow Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.FlowKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the value travels. It is part of the assessment, not decoration: a value copied into a typed field keeps its classification, while the same value concatenated into free text does not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flow Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.FlowKind
	 * @see #setFlowKind(FlowKind)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_FlowKind()
	 * @model
	 * @generated
	 */
	FlowKind getFlowKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getFlowKind <em>Flow Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.FlowKind
	 * @see #getFlowKind()
	 * @generated
	 */
	void setFlowKind(FlowKind value);

	/**
	 * Returns the value of the '<em><b>Relevance Level</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.RelevanceLevelType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Highest relevance among this flow's findings. Set NONE when the flow was examined and nothing was found; that is different from leaving it unset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RelevanceLevelType
	 * @see #setRelevanceLevel(RelevanceLevelType)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_RelevanceLevel()
	 * @model
	 * @generated
	 */
	RelevanceLevelType getRelevanceLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getRelevanceLevel <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relevance Level</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RelevanceLevelType
	 * @see #getRelevanceLevel()
	 * @generated
	 */
	void setRelevanceLevel(RelevanceLevelType value);

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why this value is carried into the target model. A purpose stated for the source field does not answer it: the transformation is a new processing, and this field is where a human answers for it. Always entered by a human.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' attribute.
	 * @see #setPurpose(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowEvaluation_Purpose()
	 * @model
	 * @generated
	 */
	String getPurpose();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FlowEvaluation#getPurpose <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' attribute.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(String value);

} // FlowEvaluation
