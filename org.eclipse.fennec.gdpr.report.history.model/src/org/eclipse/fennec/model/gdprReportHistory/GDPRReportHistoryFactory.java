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
package org.eclipse.fennec.model.gdprReportHistory;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage
 * @generated
 */
@ProviderType
public interface GDPRReportHistoryFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GDPRReportHistoryFactory eINSTANCE = org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gdpr Report History</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gdpr Report History</em>'.
	 * @generated
	 */
	GdprReportHistory createGdprReportHistory();

	/**
	 * Returns a new object of class '<em>Report Revision</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Report Revision</em>'.
	 * @generated
	 */
	ReportRevision createReportRevision();

	/**
	 * Returns a new object of class '<em>Evaluation Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evaluation Row</em>'.
	 * @generated
	 */
	EvaluationRow createEvaluationRow();

	/**
	 * Returns a new object of class '<em>Change Row</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Row</em>'.
	 * @generated
	 */
	ChangeRow createChangeRow();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GDPRReportHistoryPackage getGDPRReportHistoryPackage();

} //GDPRReportHistoryFactory
