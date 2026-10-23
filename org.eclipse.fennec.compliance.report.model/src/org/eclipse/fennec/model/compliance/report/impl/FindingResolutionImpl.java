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
package org.eclipse.fennec.model.compliance.report.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.fennec.model.compliance.report.FindingResolution;
import org.eclipse.fennec.model.compliance.report.ReportPackage;
import org.eclipse.fennec.model.compliance.report.ReviewStatus;
import org.eclipse.fennec.model.compliance.report.RiskAssessment;
import org.eclipse.fennec.model.compliance.report.RiskTreatment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finding Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getTreatment <em>Treatment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getRiskAssessment <em>Risk Assessment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getMeasureIds <em>Measure Ids</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getTreatmentNote <em>Treatment Note</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getDelegatedTo <em>Delegated To</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getDueDate <em>Due Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.FindingResolutionImpl#getDecidedAt <em>Decided At</em>}</li>
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
	protected static final ReviewStatus STATUS_EDEFAULT = ReviewStatus.OPEN;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ReviewStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTreatment() <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected static final RiskTreatment TREATMENT_EDEFAULT = RiskTreatment.ACCEPT;

	/**
	 * The cached value of the '{@link #getTreatment() <em>Treatment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatment()
	 * @generated
	 * @ordered
	 */
	protected RiskTreatment treatment = TREATMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRiskAssessment() <em>Risk Assessment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskAssessment()
	 * @generated
	 * @ordered
	 */
	protected RiskAssessment riskAssessment;

	/**
	 * The cached value of the '{@link #getMeasureIds() <em>Measure Ids</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasureIds()
	 * @generated
	 * @ordered
	 */
	protected EList<String> measureIds;

	/**
	 * The default value of the '{@link #getTreatmentNote() <em>Treatment Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentNote()
	 * @generated
	 * @ordered
	 */
	protected static final String TREATMENT_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTreatmentNote() <em>Treatment Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreatmentNote()
	 * @generated
	 * @ordered
	 */
	protected String treatmentNote = TREATMENT_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelegatedTo() <em>Delegated To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedTo()
	 * @generated
	 * @ordered
	 */
	protected static final String DELEGATED_TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDelegatedTo() <em>Delegated To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelegatedTo()
	 * @generated
	 * @ordered
	 */
	protected String delegatedTo = DELEGATED_TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected static final String DUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDueDate() <em>Due Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDueDate()
	 * @generated
	 * @ordered
	 */
	protected String dueDate = DUE_DATE_EDEFAULT;

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
		return ReportPackage.Literals.FINDING_RESOLUTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReviewStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ReviewStatus newStatus) {
		ReviewStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskTreatment getTreatment() {
		return treatment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreatment(RiskTreatment newTreatment) {
		RiskTreatment oldTreatment = treatment;
		treatment = newTreatment == null ? TREATMENT_EDEFAULT : newTreatment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__TREATMENT, oldTreatment, treatment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RiskAssessment getRiskAssessment() {
		return riskAssessment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRiskAssessment(RiskAssessment newRiskAssessment, NotificationChain msgs) {
		RiskAssessment oldRiskAssessment = riskAssessment;
		riskAssessment = newRiskAssessment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT, oldRiskAssessment, newRiskAssessment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRiskAssessment(RiskAssessment newRiskAssessment) {
		if (newRiskAssessment != riskAssessment) {
			NotificationChain msgs = null;
			if (riskAssessment != null)
				msgs = ((InternalEObject)riskAssessment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT, null, msgs);
			if (newRiskAssessment != null)
				msgs = ((InternalEObject)newRiskAssessment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT, null, msgs);
			msgs = basicSetRiskAssessment(newRiskAssessment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT, newRiskAssessment, newRiskAssessment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getMeasureIds() {
		if (measureIds == null) {
			measureIds = new EDataTypeUniqueEList<String>(String.class, this, ReportPackage.FINDING_RESOLUTION__MEASURE_IDS);
		}
		return measureIds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTreatmentNote() {
		return treatmentNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTreatmentNote(String newTreatmentNote) {
		String oldTreatmentNote = treatmentNote;
		treatmentNote = newTreatmentNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__TREATMENT_NOTE, oldTreatmentNote, treatmentNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDelegatedTo() {
		return delegatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDelegatedTo(String newDelegatedTo) {
		String oldDelegatedTo = delegatedTo;
		delegatedTo = newDelegatedTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__DELEGATED_TO, oldDelegatedTo, delegatedTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDueDate() {
		return dueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDueDate(String newDueDate) {
		String oldDueDate = dueDate;
		dueDate = newDueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__DUE_DATE, oldDueDate, dueDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__JUSTIFICATION, oldJustification, justification));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__DECIDED_BY, oldDecidedBy, decidedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.FINDING_RESOLUTION__DECIDED_AT, oldDecidedAt, decidedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT:
				return basicSetRiskAssessment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.FINDING_RESOLUTION__STATUS:
				return getStatus();
			case ReportPackage.FINDING_RESOLUTION__TREATMENT:
				return getTreatment();
			case ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT:
				return getRiskAssessment();
			case ReportPackage.FINDING_RESOLUTION__MEASURE_IDS:
				return getMeasureIds();
			case ReportPackage.FINDING_RESOLUTION__TREATMENT_NOTE:
				return getTreatmentNote();
			case ReportPackage.FINDING_RESOLUTION__DELEGATED_TO:
				return getDelegatedTo();
			case ReportPackage.FINDING_RESOLUTION__DUE_DATE:
				return getDueDate();
			case ReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				return getJustification();
			case ReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				return getDecidedBy();
			case ReportPackage.FINDING_RESOLUTION__DECIDED_AT:
				return getDecidedAt();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ReportPackage.FINDING_RESOLUTION__STATUS:
				setStatus((ReviewStatus)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__TREATMENT:
				setTreatment((RiskTreatment)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__MEASURE_IDS:
				getMeasureIds().clear();
				getMeasureIds().addAll((Collection<? extends String>)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__TREATMENT_NOTE:
				setTreatmentNote((String)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__DELEGATED_TO:
				setDelegatedTo((String)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__DUE_DATE:
				setDueDate((String)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				setJustification((String)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				setDecidedBy((String)newValue);
				return;
			case ReportPackage.FINDING_RESOLUTION__DECIDED_AT:
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
			case ReportPackage.FINDING_RESOLUTION__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ReportPackage.FINDING_RESOLUTION__TREATMENT:
				setTreatment(TREATMENT_EDEFAULT);
				return;
			case ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT:
				setRiskAssessment((RiskAssessment)null);
				return;
			case ReportPackage.FINDING_RESOLUTION__MEASURE_IDS:
				getMeasureIds().clear();
				return;
			case ReportPackage.FINDING_RESOLUTION__TREATMENT_NOTE:
				setTreatmentNote(TREATMENT_NOTE_EDEFAULT);
				return;
			case ReportPackage.FINDING_RESOLUTION__DELEGATED_TO:
				setDelegatedTo(DELEGATED_TO_EDEFAULT);
				return;
			case ReportPackage.FINDING_RESOLUTION__DUE_DATE:
				setDueDate(DUE_DATE_EDEFAULT);
				return;
			case ReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
				return;
			case ReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				setDecidedBy(DECIDED_BY_EDEFAULT);
				return;
			case ReportPackage.FINDING_RESOLUTION__DECIDED_AT:
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
			case ReportPackage.FINDING_RESOLUTION__STATUS:
				return status != STATUS_EDEFAULT;
			case ReportPackage.FINDING_RESOLUTION__TREATMENT:
				return treatment != TREATMENT_EDEFAULT;
			case ReportPackage.FINDING_RESOLUTION__RISK_ASSESSMENT:
				return riskAssessment != null;
			case ReportPackage.FINDING_RESOLUTION__MEASURE_IDS:
				return measureIds != null && !measureIds.isEmpty();
			case ReportPackage.FINDING_RESOLUTION__TREATMENT_NOTE:
				return TREATMENT_NOTE_EDEFAULT == null ? treatmentNote != null : !TREATMENT_NOTE_EDEFAULT.equals(treatmentNote);
			case ReportPackage.FINDING_RESOLUTION__DELEGATED_TO:
				return DELEGATED_TO_EDEFAULT == null ? delegatedTo != null : !DELEGATED_TO_EDEFAULT.equals(delegatedTo);
			case ReportPackage.FINDING_RESOLUTION__DUE_DATE:
				return DUE_DATE_EDEFAULT == null ? dueDate != null : !DUE_DATE_EDEFAULT.equals(dueDate);
			case ReportPackage.FINDING_RESOLUTION__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? justification != null : !JUSTIFICATION_EDEFAULT.equals(justification);
			case ReportPackage.FINDING_RESOLUTION__DECIDED_BY:
				return DECIDED_BY_EDEFAULT == null ? decidedBy != null : !DECIDED_BY_EDEFAULT.equals(decidedBy);
			case ReportPackage.FINDING_RESOLUTION__DECIDED_AT:
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
		result.append(", treatment: ");
		result.append(treatment);
		result.append(", measureIds: ");
		result.append(measureIds);
		result.append(", treatmentNote: ");
		result.append(treatmentNote);
		result.append(", delegatedTo: ");
		result.append(delegatedTo);
		result.append(", dueDate: ");
		result.append(dueDate);
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
