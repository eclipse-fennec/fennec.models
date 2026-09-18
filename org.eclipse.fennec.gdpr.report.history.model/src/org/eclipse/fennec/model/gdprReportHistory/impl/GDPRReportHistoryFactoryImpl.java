/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.gdprReportHistory.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.model.gdprReportHistory.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GDPRReportHistoryFactoryImpl extends EFactoryImpl implements GDPRReportHistoryFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GDPRReportHistoryFactory init() {
		try {
			GDPRReportHistoryFactory theGDPRReportHistoryFactory = (GDPRReportHistoryFactory)EPackage.Registry.INSTANCE.getEFactory(GDPRReportHistoryPackage.eNS_URI);
			if (theGDPRReportHistoryFactory != null) {
				return theGDPRReportHistoryFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GDPRReportHistoryFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GDPRReportHistoryFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY: return createGdprReportHistory();
			case GDPRReportHistoryPackage.REPORT_REVISION: return createReportRevision();
			case GDPRReportHistoryPackage.EVALUATION_ROW: return createEvaluationRow();
			case GDPRReportHistoryPackage.CHANGE_ROW: return createChangeRow();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GDPRReportHistoryPackage.REVISION_ORIGIN:
				return createRevisionOriginFromString(eDataType, initialValue);
			case GDPRReportHistoryPackage.CHANGE_KIND:
				return createChangeKindFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GDPRReportHistoryPackage.REVISION_ORIGIN:
				return convertRevisionOriginToString(eDataType, instanceValue);
			case GDPRReportHistoryPackage.CHANGE_KIND:
				return convertChangeKindToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GdprReportHistory createGdprReportHistory() {
		GdprReportHistoryImpl gdprReportHistory = new GdprReportHistoryImpl();
		return gdprReportHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReportRevision createReportRevision() {
		ReportRevisionImpl reportRevision = new ReportRevisionImpl();
		return reportRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EvaluationRow createEvaluationRow() {
		EvaluationRowImpl evaluationRow = new EvaluationRowImpl();
		return evaluationRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeRow createChangeRow() {
		ChangeRowImpl changeRow = new ChangeRowImpl();
		return changeRow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionOrigin createRevisionOriginFromString(EDataType eDataType, String initialValue) {
		RevisionOrigin result = RevisionOrigin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRevisionOriginToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeKind createChangeKindFromString(EDataType eDataType, String initialValue) {
		ChangeKind result = ChangeKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GDPRReportHistoryPackage getGDPRReportHistoryPackage() {
		return (GDPRReportHistoryPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GDPRReportHistoryPackage getPackage() {
		return GDPRReportHistoryPackage.eINSTANCE;
	}

} //GDPRReportHistoryFactoryImpl
