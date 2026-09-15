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
import org.eclipse.fennec.model.gdprReport.GdprRequestStatus;
import org.eclipse.fennec.model.gdprReport.RequestStatusType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gdpr Request Status</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getModelFingerprint <em>Model Fingerprint</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getBatchId <em>Batch Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getCustomId <em>Custom Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getReportId <em>Report Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getSubmittedAt <em>Submitted At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getEndedAt <em>Ended At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getContinuationCount <em>Continuation Count</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.GdprRequestStatusImpl#getOutputTokens <em>Output Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GdprRequestStatusImpl extends MinimalEObjectImpl.Container implements GdprRequestStatus {
	/**
	 * The default value of the '{@link #getModelFingerprint() <em>Model Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFingerprint()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_FINGERPRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModelFingerprint() <em>Model Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelFingerprint()
	 * @generated
	 * @ordered
	 */
	protected String modelFingerprint = MODEL_FINGERPRINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNsURI() <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNsURI()
	 * @generated
	 * @ordered
	 */
	protected String nsURI = NS_URI_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatchId() <em>Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchId()
	 * @generated
	 * @ordered
	 */
	protected static final String BATCH_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBatchId() <em>Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatchId()
	 * @generated
	 * @ordered
	 */
	protected String batchId = BATCH_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomId()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomId() <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomId()
	 * @generated
	 * @ordered
	 */
	protected String customId = CUSTOM_ID_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final RequestStatusType STATUS_EDEFAULT = RequestStatusType.SUBMITTED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected RequestStatusType status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubmittedAt() <em>Submitted At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBMITTED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubmittedAt() <em>Submitted At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmittedAt()
	 * @generated
	 * @ordered
	 */
	protected String submittedAt = SUBMITTED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndedAt() <em>Ended At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndedAt() <em>Ended At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndedAt()
	 * @generated
	 * @ordered
	 */
	protected String endedAt = ENDED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getContinuationCount() <em>Continuation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationCount()
	 * @generated
	 * @ordered
	 */
	protected static final int CONTINUATION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getContinuationCount() <em>Continuation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinuationCount()
	 * @generated
	 * @ordered
	 */
	protected int continuationCount = CONTINUATION_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputTokens() <em>Output Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTokens()
	 * @generated
	 * @ordered
	 */
	protected static final int OUTPUT_TOKENS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOutputTokens() <em>Output Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputTokens()
	 * @generated
	 * @ordered
	 */
	protected int outputTokens = OUTPUT_TOKENS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GdprRequestStatusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.GDPR_REQUEST_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModelFingerprint() {
		return modelFingerprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModelFingerprint(String newModelFingerprint) {
		String oldModelFingerprint = modelFingerprint;
		modelFingerprint = newModelFingerprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__MODEL_FINGERPRINT, oldModelFingerprint, modelFingerprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNsURI() {
		return nsURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNsURI(String newNsURI) {
		String oldNsURI = nsURI;
		nsURI = newNsURI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__NS_URI, oldNsURI, nsURI));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBatchId() {
		return batchId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBatchId(String newBatchId) {
		String oldBatchId = batchId;
		batchId = newBatchId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__BATCH_ID, oldBatchId, batchId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCustomId() {
		return customId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCustomId(String newCustomId) {
		String oldCustomId = customId;
		customId = newCustomId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__CUSTOM_ID, oldCustomId, customId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__REPORT_ID, oldReportId, reportId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequestStatusType getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(RequestStatusType newStatus) {
		RequestStatusType oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubmittedAt() {
		return submittedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubmittedAt(String newSubmittedAt) {
		String oldSubmittedAt = submittedAt;
		submittedAt = newSubmittedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__SUBMITTED_AT, oldSubmittedAt, submittedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEndedAt() {
		return endedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndedAt(String newEndedAt) {
		String oldEndedAt = endedAt;
		endedAt = newEndedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__ENDED_AT, oldEndedAt, endedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getContinuationCount() {
		return continuationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinuationCount(int newContinuationCount) {
		int oldContinuationCount = continuationCount;
		continuationCount = newContinuationCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__CONTINUATION_COUNT, oldContinuationCount, continuationCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getOutputTokens() {
		return outputTokens;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutputTokens(int newOutputTokens) {
		int oldOutputTokens = outputTokens;
		outputTokens = newOutputTokens;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.GDPR_REQUEST_STATUS__OUTPUT_TOKENS, oldOutputTokens, outputTokens));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MODEL_FINGERPRINT:
				return getModelFingerprint();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__NS_URI:
				return getNsURI();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__BATCH_ID:
				return getBatchId();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CUSTOM_ID:
				return getCustomId();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__REPORT_ID:
				return getReportId();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__STATUS:
				return getStatus();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__SUBMITTED_AT:
				return getSubmittedAt();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__ENDED_AT:
				return getEndedAt();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MESSAGE:
				return getMessage();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CONTINUATION_COUNT:
				return getContinuationCount();
			case GDPRReportPackage.GDPR_REQUEST_STATUS__OUTPUT_TOKENS:
				return getOutputTokens();
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
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MODEL_FINGERPRINT:
				setModelFingerprint((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__NS_URI:
				setNsURI((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__BATCH_ID:
				setBatchId((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CUSTOM_ID:
				setCustomId((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__REPORT_ID:
				setReportId((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__STATUS:
				setStatus((RequestStatusType)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__SUBMITTED_AT:
				setSubmittedAt((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__ENDED_AT:
				setEndedAt((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MESSAGE:
				setMessage((String)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CONTINUATION_COUNT:
				setContinuationCount((Integer)newValue);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__OUTPUT_TOKENS:
				setOutputTokens((Integer)newValue);
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
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MODEL_FINGERPRINT:
				setModelFingerprint(MODEL_FINGERPRINT_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__NS_URI:
				setNsURI(NS_URI_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__BATCH_ID:
				setBatchId(BATCH_ID_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CUSTOM_ID:
				setCustomId(CUSTOM_ID_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__REPORT_ID:
				setReportId(REPORT_ID_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__SUBMITTED_AT:
				setSubmittedAt(SUBMITTED_AT_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__ENDED_AT:
				setEndedAt(ENDED_AT_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CONTINUATION_COUNT:
				setContinuationCount(CONTINUATION_COUNT_EDEFAULT);
				return;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__OUTPUT_TOKENS:
				setOutputTokens(OUTPUT_TOKENS_EDEFAULT);
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
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MODEL_FINGERPRINT:
				return MODEL_FINGERPRINT_EDEFAULT == null ? modelFingerprint != null : !MODEL_FINGERPRINT_EDEFAULT.equals(modelFingerprint);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__NS_URI:
				return NS_URI_EDEFAULT == null ? nsURI != null : !NS_URI_EDEFAULT.equals(nsURI);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__BATCH_ID:
				return BATCH_ID_EDEFAULT == null ? batchId != null : !BATCH_ID_EDEFAULT.equals(batchId);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CUSTOM_ID:
				return CUSTOM_ID_EDEFAULT == null ? customId != null : !CUSTOM_ID_EDEFAULT.equals(customId);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__REPORT_ID:
				return REPORT_ID_EDEFAULT == null ? reportId != null : !REPORT_ID_EDEFAULT.equals(reportId);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__STATUS:
				return status != STATUS_EDEFAULT;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__SUBMITTED_AT:
				return SUBMITTED_AT_EDEFAULT == null ? submittedAt != null : !SUBMITTED_AT_EDEFAULT.equals(submittedAt);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__ENDED_AT:
				return ENDED_AT_EDEFAULT == null ? endedAt != null : !ENDED_AT_EDEFAULT.equals(endedAt);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case GDPRReportPackage.GDPR_REQUEST_STATUS__CONTINUATION_COUNT:
				return continuationCount != CONTINUATION_COUNT_EDEFAULT;
			case GDPRReportPackage.GDPR_REQUEST_STATUS__OUTPUT_TOKENS:
				return outputTokens != OUTPUT_TOKENS_EDEFAULT;
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
		result.append(" (modelFingerprint: ");
		result.append(modelFingerprint);
		result.append(", nsURI: ");
		result.append(nsURI);
		result.append(", batchId: ");
		result.append(batchId);
		result.append(", customId: ");
		result.append(customId);
		result.append(", reportId: ");
		result.append(reportId);
		result.append(", status: ");
		result.append(status);
		result.append(", submittedAt: ");
		result.append(submittedAt);
		result.append(", endedAt: ");
		result.append(endedAt);
		result.append(", message: ");
		result.append(message);
		result.append(", continuationCount: ");
		result.append(continuationCount);
		result.append(", outputTokens: ");
		result.append(outputTokens);
		result.append(')');
		return result.toString();
	}

} //GdprRequestStatusImpl
