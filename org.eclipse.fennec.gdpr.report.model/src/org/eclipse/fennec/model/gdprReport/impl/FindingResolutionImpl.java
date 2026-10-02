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

import org.eclipse.fennec.model.gdprReport.FindingResolution;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.ResolutionStatus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingResolutionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingResolutionImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingResolutionImpl#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FindingResolutionImpl#getDecidedAt <em>Decided At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingResolutionImpl extends MinimalEObjectImpl.Container implements FindingResolution {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ResolutionStatus STATUS_EDEFAULT = ResolutionStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ResolutionStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected static final String JUSTIFICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustification() <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustification()
	 * @generated
	 * @ordered
	 */
	protected String justification = JUSTIFICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecidedBy() <em>Decided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIDED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecidedBy() <em>Decided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedBy()
	 * @generated
	 * @ordered
	 */
	protected String decidedBy = DECIDED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDecidedAt() <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String DECIDED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDecidedAt() <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecidedAt()
	 * @generated
	 * @ordered
	 */
	protected String decidedAt = DECIDED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingResolutionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.FINDING_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResolutionStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ResolutionStatus newStatus) {
		ResolutionStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING_RESOLUTION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJustification() {
		return justification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJustification(String newJustification) {
		String oldJustification = justification;
		justification = newJustification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING_RESOLUTION__JUSTIFICATION, oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecidedBy() {
		return decidedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecidedBy(String newDecidedBy) {
		String oldDecidedBy = decidedBy;
		decidedBy = newDecidedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING_RESOLUTION__DECIDED_BY, oldDecidedBy, decidedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDecidedAt() {
		return decidedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecidedAt(String newDecidedAt) {
		String oldDecidedAt = decidedAt;
		decidedAt = newDecidedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FINDING_RESOLUTION__DECIDED_AT, oldDecidedAt, decidedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportPackage.FINDING_RESOLUTION__STATUS:
				return getStatus();
			case GDPRReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				return getJustification();
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				return getDecidedBy();
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_AT:
				return getDecidedAt();
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
			case GDPRReportPackage.FINDING_RESOLUTION__STATUS:
				setStatus((ResolutionStatus)newValue);
				return;
			case GDPRReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				setJustification((String)newValue);
				return;
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				setDecidedBy((String)newValue);
				return;
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_AT:
				setDecidedAt((String)newValue);
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
			case GDPRReportPackage.FINDING_RESOLUTION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				setDecidedBy(DECIDED_BY_EDEFAULT);
				return;
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_AT:
				setDecidedAt(DECIDED_AT_EDEFAULT);
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
			case GDPRReportPackage.FINDING_RESOLUTION__STATUS:
				return status != STATUS_EDEFAULT;
			case GDPRReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? justification != null : !JUSTIFICATION_EDEFAULT.equals(justification);
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				return DECIDED_BY_EDEFAULT == null ? decidedBy != null : !DECIDED_BY_EDEFAULT.equals(decidedBy);
			case GDPRReportPackage.FINDING_RESOLUTION__DECIDED_AT:
				return DECIDED_AT_EDEFAULT == null ? decidedAt != null : !DECIDED_AT_EDEFAULT.equals(decidedAt);
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
		result.append(" (status: ");
		result.append(status);
		result.append(", justification: ");
		result.append(justification);
		result.append(", decidedBy: ");
		result.append(decidedBy);
		result.append(", decidedAt: ");
		result.append(decidedAt);
		result.append(')');
		return result.toString();
	}

} //FindingResolutionImpl
