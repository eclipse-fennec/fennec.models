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
 * A representation of the model object '<em><b>Finding Resolution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The decision of a person, typically the data protection officer, on one finding. Under GDPR accountability (Art. 5(2)) a decision has to be traceable: who decided what, when and why - so all four are required.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getDecidedAt <em>Decided At</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFindingResolution()
 * @model
 * @generated
 */
@ProviderType
public interface FindingResolution extends EObject {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.gdprReport.ResolutionStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What was decided.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.ResolutionStatus
	 * @see #setStatus(ResolutionStatus)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFindingResolution_Status()
	 * @model required="true"
	 * @generated
	 */
	ResolutionStatus getStatus();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see org.eclipse.fennec.model.gdprReport.ResolutionStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ResolutionStatus value);

	/**
	 * Returns the value of the '<em><b>Justification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Why it was decided so, in the words of the person deciding. Required for every status: a resolution without a reason cannot be audited, and an accepted risk without one cannot be defended.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Justification</em>' attribute.
	 * @see #setJustification(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFindingResolution_Justification()
	 * @model required="true"
	 * @generated
	 */
	String getJustification();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getJustification <em>Justification</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Justification</em>' attribute.
	 * @see #getJustification()
	 * @generated
	 */
	void setJustification(String value);

	/**
	 * Returns the value of the '<em><b>Decided By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identity of the person who decided, in the same form as GdprReport.generatedBy for a human revision.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided By</em>' attribute.
	 * @see #setDecidedBy(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFindingResolution_DecidedBy()
	 * @model required="true"
	 * @generated
	 */
	String getDecidedBy();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getDecidedBy <em>Decided By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decided By</em>' attribute.
	 * @see #getDecidedBy()
	 * @generated
	 */
	void setDecidedBy(String value);

	/**
	 * Returns the value of the '<em><b>Decided At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When it was decided, as an ISO-8601 UTC instant like generatedAt, e.g. 2026-09-09T14:20:00Z. Kept on the decision rather than taken from the revision, because a decision carried unchanged into a later revision must keep the time it was actually taken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Decided At</em>' attribute.
	 * @see #setDecidedAt(String)
	 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFindingResolution_DecidedAt()
	 * @model required="true"
	 * @generated
	 */
	String getDecidedAt();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.gdprReport.FindingResolution#getDecidedAt <em>Decided At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decided At</em>' attribute.
	 * @see #getDecidedAt()
	 * @generated
	 */
	void setDecidedAt(String value);

} // FindingResolution
