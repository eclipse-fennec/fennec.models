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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gdpr Report History</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Root of the derived review history of one subject. Exactly one instance per subject, rebuilt in full on every change rather than appended to, so that a replayed or missed event cannot corrupt it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectIdentifier <em>Subject Identifier</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectName <em>Subject Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRebuiltAt <em>Rebuilt At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRevisionCount <em>Revision Count</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getChanges <em>Changes</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getReportLanguage <em>Report Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectLanguage <em>Subject Language</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory()
 * @model
 * @generated
 */
@ProviderType
public interface GdprReportHistory extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Human readable title of the document, e.g. 'GDPR review history of clinic 1.0.0'.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Subject Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The subject identifier this history is about. This can be a nsURI for EPackages, a unique name for qvt compiled units and so on.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Identifier</em>' attribute.
	 * @see #setSubjectIdentifier(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_SubjectIdentifier()
	 * @model
	 * @generated
	 */
	String getSubjectIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectIdentifier <em>Subject Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Identifier</em>' attribute.
	 * @see #getSubjectIdentifier()
	 * @generated
	 */
	void setSubjectIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Subject Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the reviewed subject
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Name</em>' attribute.
	 * @see #setSubjectName(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_SubjectName()
	 * @model
	 * @generated
	 */
	String getSubjectName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectName <em>Subject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Name</em>' attribute.
	 * @see #getSubjectName()
	 * @generated
	 */
	void setSubjectName(String value);

	/**
	 * Returns the value of the '<em><b>Rebuilt At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When this derived object was last rebuilt, as an ISO-8601 instant. Not the time of the last review - that is on the revision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rebuilt At</em>' attribute.
	 * @see #setRebuiltAt(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_RebuiltAt()
	 * @model required="true"
	 * @generated
	 */
	String getRebuiltAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRebuiltAt <em>Rebuilt At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rebuilt At</em>' attribute.
	 * @see #getRebuiltAt()
	 * @generated
	 */
	void setRebuiltAt(String value);

	/**
	 * Returns the value of the '<em><b>Revision Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of revisions in this document. Redundant with the revisions list and kept because a summary sheet should not require counting rows.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revision Count</em>' attribute.
	 * @see #setRevisionCount(int)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_RevisionCount()
	 * @model
	 * @generated
	 */
	int getRevisionCount();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getRevisionCount <em>Revision Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revision Count</em>' attribute.
	 * @see #getRevisionCount()
	 * @generated
	 */
	void setRevisionCount(int value);

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReportHistory.ReportRevision}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * One entry per review run, oldest first. Renders as the first sheet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revisions</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_Revisions()
	 * @model containment="true"
	 * @generated
	 */
	EList<ReportRevision> getRevisions();

	/**
	 * Returns the value of the '<em><b>Evaluations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReportHistory.EvaluationRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The assessment itself, one row per evaluated classifier or feature per revision. Renders as the second sheet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evaluations</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_Evaluations()
	 * @model containment="true"
	 * @generated
	 */
	EList<EvaluationRow> getEvaluations();

	/**
	 * Returns the value of the '<em><b>Changes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.gdprReportHistory.ChangeRow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The diff, one row per field that actually differs from the preceding revision. Renders as the third sheet and is the reason this document exists: the change kind on an evaluation row says THAT something changed, these rows say WHAT.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changes</em>' containment reference list.
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_Changes()
	 * @model containment="true"
	 * @generated
	 */
	EList<ChangeRow> getChanges();

	/**
	 * Returns the value of the '<em><b>Report Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language of the gdpr report
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Report Language</em>' attribute.
	 * @see #setReportLanguage(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_ReportLanguage()
	 * @model
	 * @generated
	 */
	String getReportLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getReportLanguage <em>Report Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Language</em>' attribute.
	 * @see #getReportLanguage()
	 * @generated
	 */
	void setReportLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Subject Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The language of the report subject (e.g. when a qvt transformation qvto, etc)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Subject Language</em>' attribute.
	 * @see #setSubjectLanguage(String)
	 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getGdprReportHistory_SubjectLanguage()
	 * @model
	 * @generated
	 */
	String getSubjectLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory#getSubjectLanguage <em>Subject Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject Language</em>' attribute.
	 * @see #getSubjectLanguage()
	 * @generated
	 */
	void setSubjectLanguage(String value);

} // GdprReportHistory
