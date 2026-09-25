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
package org.eclipse.fennec.model.gdprReportHistory.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdprReportHistory.ChangeRow;
import org.eclipse.fennec.model.gdprReportHistory.EvaluationRow;
import org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage;
import org.eclipse.fennec.model.gdprReportHistory.GdprReportHistory;
import org.eclipse.fennec.model.gdprReportHistory.ReportRevision;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gdpr Report History</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getSubjectIdentifier <em>Subject Identifier</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getSubjectName <em>Subject Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getRebuiltAt <em>Rebuilt At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getRevisionCount <em>Revision Count</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getEvaluations <em>Evaluations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getChanges <em>Changes</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getReportLanguage <em>Report Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.GdprReportHistoryImpl#getSubjectLanguage <em>Subject Language</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GdprReportHistoryImpl extends MinimalEObjectImpl.Container implements GdprReportHistory {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubjectIdentifier() <em>Subject Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectIdentifier() <em>Subject Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String subjectIdentifier = SUBJECT_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubjectName() <em>Subject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectName() <em>Subject Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectName()
	 * @generated
	 * @ordered
	 */
	protected String subjectName = SUBJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRebuiltAt() <em>Rebuilt At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebuiltAt()
	 * @generated
	 * @ordered
	 */
	protected static final String REBUILT_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRebuiltAt() <em>Rebuilt At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRebuiltAt()
	 * @generated
	 * @ordered
	 */
	protected String rebuiltAt = REBUILT_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevisionCount() <em>Revision Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionCount()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisionCount() <em>Revision Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionCount()
	 * @generated
	 * @ordered
	 */
	protected int revisionCount = REVISION_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReportRevision> revisions;

	/**
	 * The cached value of the '{@link #getEvaluations() <em>Evaluations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluations()
	 * @generated
	 * @ordered
	 */
	protected EList<EvaluationRow> evaluations;

	/**
	 * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanges()
	 * @generated
	 * @ordered
	 */
	protected EList<ChangeRow> changes;

	/**
	 * The default value of the '{@link #getReportLanguage() <em>Report Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String REPORT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReportLanguage() <em>Report Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportLanguage()
	 * @generated
	 * @ordered
	 */
	protected String reportLanguage = REPORT_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubjectLanguage() <em>Subject Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubjectLanguage() <em>Subject Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectLanguage()
	 * @generated
	 * @ordered
	 */
	protected String subjectLanguage = SUBJECT_LANGUAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GdprReportHistoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportHistoryPackage.Literals.GDPR_REPORT_HISTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectIdentifier() {
		return subjectIdentifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectIdentifier(String newSubjectIdentifier) {
		String oldSubjectIdentifier = subjectIdentifier;
		subjectIdentifier = newSubjectIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_IDENTIFIER, oldSubjectIdentifier, subjectIdentifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectName(String newSubjectName) {
		String oldSubjectName = subjectName;
		subjectName = newSubjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_NAME, oldSubjectName, subjectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRebuiltAt() {
		return rebuiltAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRebuiltAt(String newRebuiltAt) {
		String oldRebuiltAt = rebuiltAt;
		rebuiltAt = newRebuiltAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REBUILT_AT, oldRebuiltAt, rebuiltAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRevisionCount() {
		return revisionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionCount(int newRevisionCount) {
		int oldRevisionCount = revisionCount;
		revisionCount = newRevisionCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISION_COUNT, oldRevisionCount, revisionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReportRevision> getRevisions() {
		if (revisions == null) {
			revisions = new EObjectContainmentEList<ReportRevision>(ReportRevision.class, this, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISIONS);
		}
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EvaluationRow> getEvaluations() {
		if (evaluations == null) {
			evaluations = new EObjectContainmentEList<EvaluationRow>(EvaluationRow.class, this, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__EVALUATIONS);
		}
		return evaluations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChangeRow> getChanges() {
		if (changes == null) {
			changes = new EObjectContainmentEList<ChangeRow>(ChangeRow.class, this, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__CHANGES);
		}
		return changes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReportLanguage() {
		return reportLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReportLanguage(String newReportLanguage) {
		String oldReportLanguage = reportLanguage;
		reportLanguage = newReportLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REPORT_LANGUAGE, oldReportLanguage, reportLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSubjectLanguage() {
		return subjectLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectLanguage(String newSubjectLanguage) {
		String oldSubjectLanguage = subjectLanguage;
		subjectLanguage = newSubjectLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_LANGUAGE, oldSubjectLanguage, subjectLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISIONS:
				return ((InternalEList<?>)getRevisions()).basicRemove(otherEnd, msgs);
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__EVALUATIONS:
				return ((InternalEList<?>)getEvaluations()).basicRemove(otherEnd, msgs);
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__CHANGES:
				return ((InternalEList<?>)getChanges()).basicRemove(otherEnd, msgs);
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
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__NAME:
				return getName();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_IDENTIFIER:
				return getSubjectIdentifier();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_NAME:
				return getSubjectName();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REBUILT_AT:
				return getRebuiltAt();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISION_COUNT:
				return getRevisionCount();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISIONS:
				return getRevisions();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__EVALUATIONS:
				return getEvaluations();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__CHANGES:
				return getChanges();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REPORT_LANGUAGE:
				return getReportLanguage();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_LANGUAGE:
				return getSubjectLanguage();
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
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__NAME:
				setName((String)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_IDENTIFIER:
				setSubjectIdentifier((String)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_NAME:
				setSubjectName((String)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REBUILT_AT:
				setRebuiltAt((String)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISION_COUNT:
				setRevisionCount((Integer)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISIONS:
				getRevisions().clear();
				getRevisions().addAll((Collection<? extends ReportRevision>)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__EVALUATIONS:
				getEvaluations().clear();
				getEvaluations().addAll((Collection<? extends EvaluationRow>)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__CHANGES:
				getChanges().clear();
				getChanges().addAll((Collection<? extends ChangeRow>)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REPORT_LANGUAGE:
				setReportLanguage((String)newValue);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_LANGUAGE:
				setSubjectLanguage((String)newValue);
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
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_IDENTIFIER:
				setSubjectIdentifier(SUBJECT_IDENTIFIER_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_NAME:
				setSubjectName(SUBJECT_NAME_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REBUILT_AT:
				setRebuiltAt(REBUILT_AT_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISION_COUNT:
				setRevisionCount(REVISION_COUNT_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISIONS:
				getRevisions().clear();
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__EVALUATIONS:
				getEvaluations().clear();
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__CHANGES:
				getChanges().clear();
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REPORT_LANGUAGE:
				setReportLanguage(REPORT_LANGUAGE_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_LANGUAGE:
				setSubjectLanguage(SUBJECT_LANGUAGE_EDEFAULT);
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
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_IDENTIFIER:
				return SUBJECT_IDENTIFIER_EDEFAULT == null ? subjectIdentifier != null : !SUBJECT_IDENTIFIER_EDEFAULT.equals(subjectIdentifier);
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_NAME:
				return SUBJECT_NAME_EDEFAULT == null ? subjectName != null : !SUBJECT_NAME_EDEFAULT.equals(subjectName);
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REBUILT_AT:
				return REBUILT_AT_EDEFAULT == null ? rebuiltAt != null : !REBUILT_AT_EDEFAULT.equals(rebuiltAt);
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISION_COUNT:
				return revisionCount != REVISION_COUNT_EDEFAULT;
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REVISIONS:
				return revisions != null && !revisions.isEmpty();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__EVALUATIONS:
				return evaluations != null && !evaluations.isEmpty();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__CHANGES:
				return changes != null && !changes.isEmpty();
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__REPORT_LANGUAGE:
				return REPORT_LANGUAGE_EDEFAULT == null ? reportLanguage != null : !REPORT_LANGUAGE_EDEFAULT.equals(reportLanguage);
			case GDPRReportHistoryPackage.GDPR_REPORT_HISTORY__SUBJECT_LANGUAGE:
				return SUBJECT_LANGUAGE_EDEFAULT == null ? subjectLanguage != null : !SUBJECT_LANGUAGE_EDEFAULT.equals(subjectLanguage);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", subjectIdentifier: ");
		result.append(subjectIdentifier);
		result.append(", subjectName: ");
		result.append(subjectName);
		result.append(", rebuiltAt: ");
		result.append(rebuiltAt);
		result.append(", revisionCount: ");
		result.append(revisionCount);
		result.append(", reportLanguage: ");
		result.append(reportLanguage);
		result.append(", subjectLanguage: ");
		result.append(subjectLanguage);
		result.append(')');
		return result.toString();
	}

} //GdprReportHistoryImpl
