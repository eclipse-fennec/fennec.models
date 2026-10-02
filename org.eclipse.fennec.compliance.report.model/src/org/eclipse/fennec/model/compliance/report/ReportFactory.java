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

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage
 * @generated
 */
@ProviderType
public interface ReportFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ReportFactory eINSTANCE = org.eclipse.fennec.model.compliance.report.impl.ReportFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Compliance Report</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Report</em>'.
	 * @generated
	 */
	ComplianceReport createComplianceReport();

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
	 * Returns a new object of class '<em>Compliance Request Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compliance Request Status</em>'.
	 * @generated
	 */
	ComplianceRequestStatus createComplianceRequestStatus();

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
	 * Returns a new object of class '<em>Finding Resolution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finding Resolution</em>'.
	 * @generated
	 */
	FindingResolution createFindingResolution();

	/**
	 * Returns a new object of class '<em>Asset Subject</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Asset Subject</em>'.
	 * @generated
	 */
	AssetSubject createAssetSubject();

	/**
	 * Returns a new object of class '<em>Control Evaluation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Control Evaluation</em>'.
	 * @generated
	 */
	ControlEvaluation createControlEvaluation();

	/**
	 * Returns a new object of class '<em>Risk Assessment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Risk Assessment</em>'.
	 * @generated
	 */
	RiskAssessment createRiskAssessment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ReportPackage getReportPackage();

} //ReportFactory
