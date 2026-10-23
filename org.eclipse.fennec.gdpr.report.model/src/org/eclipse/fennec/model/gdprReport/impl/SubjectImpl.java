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
package org.eclipse.fennec.model.gdprReport.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.Subject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.SubjectImpl#getSubjectFingerprint <em>Subject Fingerprint</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.SubjectImpl#getReportId <em>Report Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SubjectImpl extends MinimalEObjectImpl.Container implements Subject {
	/**
	 * The default value of the '{@link #getSubjectFingerprint() <em>Subject Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectFingerprint()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_FINGERPRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectFingerprint() <em>Subject Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectFingerprint()
	 * @generated
	 * @ordered
	 */
	protected String subjectFingerprint = SUBJECT_FINGERPRINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReportId() <em>Report Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportId()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportId() <em>Report Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportId()
	 * @generated
	 * @ordered
	 */
	protected String reportId = REPORT_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectFingerprint() {
		return subjectFingerprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectFingerprint(String newSubjectFingerprint) {
		String oldSubjectFingerprint = subjectFingerprint;
		subjectFingerprint = newSubjectFingerprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.SUBJECT__SUBJECT_FINGERPRINT, oldSubjectFingerprint, subjectFingerprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReportId() {
		return reportId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportId(String newReportId) {
		String oldReportId = reportId;
		reportId = newReportId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.SUBJECT__REPORT_ID, oldReportId, reportId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportPackage.SUBJECT__SUBJECT_FINGERPRINT:
				return getSubjectFingerprint();
			case GDPRReportPackage.SUBJECT__REPORT_ID:
				return getReportId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GDPRReportPackage.SUBJECT__SUBJECT_FINGERPRINT:
				setSubjectFingerprint((String)newValue);
				return;
			case GDPRReportPackage.SUBJECT__REPORT_ID:
				setReportId((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GDPRReportPackage.SUBJECT__SUBJECT_FINGERPRINT:
				setSubjectFingerprint(SUBJECT_FINGERPRINT_EDEFAULT);
				return;
			case GDPRReportPackage.SUBJECT__REPORT_ID:
				setReportId(REPORT_ID_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GDPRReportPackage.SUBJECT__SUBJECT_FINGERPRINT:
				return SUBJECT_FINGERPRINT_EDEFAULT == null ? subjectFingerprint != null : !SUBJECT_FINGERPRINT_EDEFAULT.equals(subjectFingerprint);
			case GDPRReportPackage.SUBJECT__REPORT_ID:
				return REPORT_ID_EDEFAULT == null ? reportId != null : !REPORT_ID_EDEFAULT.equals(reportId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (subjectFingerprint: ");
		result.append(subjectFingerprint);
		result.append(", reportId: ");
		result.append(reportId);
		result.append(')');
		return result.toString();
	}

} //SubjectImpl
