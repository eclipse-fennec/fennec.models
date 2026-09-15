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

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gdpr Request Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The record of one review request for one model revision: that it was asked for, what is carrying it out, and how it ended. It exists from the moment the request is accepted, which a GdprReport does not - a report is only written when a review succeeds, so a run that is still going or that failed leaves no report at all. Anything deciding whether to ask for a review has to consult this rather than the report, or a run already in flight is paid for twice and a run that failed is re-tried on every trigger forever. One instance per reviewed model revision, keyed by modelFingerprint.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getModelFingerprint <em>Model Fingerprint</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getNsURI <em>Ns URI</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getBatchId <em>Batch Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getCustomId <em>Custom Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getReportId <em>Report Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getSubmittedAt <em>Submitted At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getEndedAt <em>Ended At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getMessage <em>Message</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getContinuationCount <em>Continuation Count</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getOutputTokens <em>Output Tokens</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus()
 * @model
 * @generated
 */
@ProviderType
public interface GdprRequestStatus extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Fingerprint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The revision of the model under review, in the same form SubjectModel records it. This is the identity of the record: the review is of content, not of a location, so the same bytes reached by any route are the same review and must not be paid for again.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Fingerprint</em>' attribute.
	 * @see #setModelFingerprint(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_ModelFingerprint()
	 * @model
	 * @generated
	 */
	String getModelFingerprint();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getModelFingerprint <em>Model Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Fingerprint</em>' attribute.
	 * @see #getModelFingerprint()
	 * @generated
	 */
	void setModelFingerprint(String value);

	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Namespace URI of the reviewed model, so a record is legible without resolving the fingerprint first. Not the identity - a namespace can hold more than one revision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_NsURI()
	 * @model
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

	/**
	 * Returns the value of the '<em><b>Batch Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The provider-side identifier of the work. It is the only handle on a run that outlives the process that started it: without it a restart cannot tell a finished review from one still running, and cannot collect either.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Batch Id</em>' attribute.
	 * @see #setBatchId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_BatchId()
	 * @model
	 * @generated
	 */
	String getBatchId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getBatchId <em>Batch Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Batch Id</em>' attribute.
	 * @see #getBatchId()
	 * @generated
	 */
	void setBatchId(String value);

	/**
	 * Returns the value of the '<em><b>Custom Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The identifier of this request within the batch. Required to read the outcome back - a result is selected by it, and so is the check for whether the turn was left paused.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Id</em>' attribute.
	 * @see #setCustomId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_CustomId()
	 * @model
	 * @generated
	 */
	String getCustomId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getCustomId <em>Custom Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Id</em>' attribute.
	 * @see #getCustomId()
	 * @generated
	 */
	void setCustomId(String value);

	/**
	 * Returns the value of the '<em><b>Report Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The id the GdprReport is stored under once the review succeeds. Empty until then, and stays empty for a run that never produced one.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Id</em>' attribute.
	 * @see #setReportId(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_ReportId()
	 * @model
	 * @generated
	 */
	String getReportId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getReportId <em>Report Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Id</em>' attribute.
	 * @see #getReportId()
	 * @generated
	 */
	void setReportId(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.RequestStatusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How the request stands. Written as SUBMITTED when the work is accepted and updated once when it ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RequestStatusType
	 * @see #setStatus(RequestStatusType)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_Status()
	 * @model
	 * @generated
	 */
	RequestStatusType getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.RequestStatusType
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(RequestStatusType value);

	/**
	 * Returns the value of the '<em><b>Submitted At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the request was accepted, as an ISO-8601 UTC instant, e.g. 2026-09-09T14:20:00Z.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Submitted At</em>' attribute.
	 * @see #setSubmittedAt(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_SubmittedAt()
	 * @model
	 * @generated
	 */
	String getSubmittedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getSubmittedAt <em>Submitted At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Submitted At</em>' attribute.
	 * @see #getSubmittedAt()
	 * @generated
	 */
	void setSubmittedAt(String value);

	/**
	 * Returns the value of the '<em><b>Ended At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When it reached a terminal status, in the same form. Empty while it is still running, which together with submittedAt is how a record abandoned by a dead process is recognised.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ended At</em>' attribute.
	 * @see #setEndedAt(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_EndedAt()
	 * @model
	 * @generated
	 */
	String getEndedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getEndedAt <em>Ended At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ended At</em>' attribute.
	 * @see #getEndedAt()
	 * @generated
	 */
	void setEndedAt(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What to tell whoever reads the outcome: the reason for a failure, or what was recorded before a run was given up on. Meant to be read by a person deciding what to do next.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Continuation Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * How many times the run had to be resumed after the provider stopped it at its iteration budget. Zero is the ordinary case. A number close to the configured ceiling says the model is at the edge of what one run can review, which is worth knowing before the ceiling is reached and work is lost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Continuation Count</em>' attribute.
	 * @see #setContinuationCount(int)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_ContinuationCount()
	 * @model
	 * @generated
	 */
	int getContinuationCount();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getContinuationCount <em>Continuation Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Continuation Count</em>' attribute.
	 * @see #getContinuationCount()
	 * @generated
	 */
	void setContinuationCount(int value);

	/**
	 * Returns the value of the '<em><b>Output Tokens</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tokens generated across the run, where the provider reports them. The only record of what an individual review cost.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Tokens</em>' attribute.
	 * @see #setOutputTokens(int)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprRequestStatus_OutputTokens()
	 * @model
	 * @generated
	 */
	int getOutputTokens();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.GdprRequestStatus#getOutputTokens <em>Output Tokens</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Tokens</em>' attribute.
	 * @see #getOutputTokens()
	 * @generated
	 */
	void setOutputTokens(int value);

} // GdprRequestStatus
