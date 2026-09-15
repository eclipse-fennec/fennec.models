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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combination Finding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A finding that only arises when two or more features are present together, typically because they allow an individual to be singled out even though no single feature identifies anyone.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.CombinationFinding#getCombinationKind <em>Combination Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.CombinationFinding#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getCombinationFinding()
 * @model
 * @generated
 */
@ProviderType
public interface CombinationFinding extends Finding {
	/**
	 * Returns the value of the '<em><b>Combination Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.CombinationKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the features interact to create the risk.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Combination Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.CombinationKind
	 * @see #setCombinationKind(CombinationKind)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getCombinationFinding_CombinationKind()
	 * @model
	 * @generated
	 */
	CombinationKind getCombinationKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.CombinationFinding#getCombinationKind <em>Combination Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combination Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.CombinationKind
	 * @see #getCombinationKind()
	 * @generated
	 */
	void setCombinationKind(CombinationKind value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getPartOfCombinations <em>Part Of Combinations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features that together create the risk. At least two, and they may belong to different classifiers. Reference existing FeatureEvaluation entries rather than creating new ones. resolveProxies is false because a combination only ever points at FeatureEvaluations inside its own report: EMF requires the opposite of a transient reference to be transient too unless it is not proxy resolving, and partOfCombinations has to stay transient because it is derived.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Features</em>' reference list.
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getCombinationFinding_Features()
	 * @see org.eclipse.fennec.model.gdprReport.FeatureEvaluation#getPartOfCombinations
	 * @model opposite="partOfCombinations" resolveProxies="false" lower="2"
	 * @generated
	 */
	EList<FeatureEvaluation> getFeatures();

} // CombinationFinding
