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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage
 * @generated
 */
@ProviderType
public interface GDPRReportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GDPRReportFactory eINSTANCE = org.eclipse.fennec.model.gdprReport.impl.GDPRReportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gdpr Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gdpr Report</em>'.
	 * @generated
	 */
	GdprReport createGdprReport();

	/**
	 * Returns a new object of class '<em>Legal Corpus Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Legal Corpus Ref</em>'.
	 * @generated
	 */
	LegalCorpusRef createLegalCorpusRef();

	/**
	 * Returns a new object of class '<em>Classifier Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Classifier Evaluation</em>'.
	 * @generated
	 */
	ClassifierEvaluation createClassifierEvaluation();

	/**
	 * Returns a new object of class '<em>Feature Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature Evaluation</em>'.
	 * @generated
	 */
	FeatureEvaluation createFeatureEvaluation();

	/**
	 * Returns a new object of class '<em>Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding</em>'.
	 * @generated
	 */
	Finding createFinding();

	/**
	 * Returns a new object of class '<em>Combination Finding</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Combination Finding</em>'.
	 * @generated
	 */
	CombinationFinding createCombinationFinding();

	/**
	 * Returns a new object of class '<em>Evidence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evidence</em>'.
	 * @generated
	 */
	Evidence createEvidence();

	/**
	 * Returns a new object of class '<em>Gdpr Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gdpr Request Status</em>'.
	 * @generated
	 */
	GdprRequestStatus createGdprRequestStatus();

	/**
	 * Returns a new object of class '<em>Package Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Package Subject</em>'.
	 * @generated
	 */
	PackageSubject createPackageSubject();

	/**
	 * Returns a new object of class '<em>Transformation Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transformation Subject</em>'.
	 * @generated
	 */
	TransformationSubject createTransformationSubject();

	/**
	 * Returns a new object of class '<em>Flow Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Flow Evaluation</em>'.
	 * @generated
	 */
	FlowEvaluation createFlowEvaluation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GDPRReportPackage getGDPRReportPackage();

} //GDPRReportFactory
