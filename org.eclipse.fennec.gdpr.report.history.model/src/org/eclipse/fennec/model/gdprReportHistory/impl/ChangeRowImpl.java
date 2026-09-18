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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.gdprReportHistory.ChangeKind;
import org.eclipse.fennec.model.gdprReportHistory.ChangeRow;
import org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Row</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getRevisionNumber <em>Revision Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getChangedAt <em>Changed At</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getChangedBy <em>Changed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getClassifierId <em>Classifier Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getFeatureId <em>Feature Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getField <em>Field</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getChangeKind <em>Change Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getOldValue <em>Old Value</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReportHistory.impl.ChangeRowImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeRowImpl extends MinimalEObjectImpl.Container implements ChangeRow {
	/**
	 * The default value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int REVISION_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRevisionNumber() <em>Revision Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisionNumber()
	 * @generated
	 * @ordered
	 */
	protected int revisionNumber = REVISION_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedAt() <em>Changed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedAt() <em>Changed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedAt()
	 * @generated
	 * @ordered
	 */
	protected String changedAt = CHANGED_AT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangedBy() <em>Changed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CHANGED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChangedBy() <em>Changed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangedBy()
	 * @generated
	 * @ordered
	 */
	protected String changedBy = CHANGED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassifierId() <em>Classifier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierId()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSIFIER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassifierId() <em>Classifier Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassifierId()
	 * @generated
	 * @ordered
	 */
	protected String classifierId = CLASSIFIER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getFeatureId() <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureId()
	 * @generated
	 * @ordered
	 */
	protected static final String FEATURE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFeatureId() <em>Feature Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureId()
	 * @generated
	 * @ordered
	 */
	protected String featureId = FEATURE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected static final String FIELD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected String field = FIELD_EDEFAULT;

	/**
	 * The default value of the '{@link #getChangeKind() <em>Change Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeKind()
	 * @generated
	 * @ordered
	 */
	protected static final ChangeKind CHANGE_KIND_EDEFAULT = ChangeKind.UNCHANGED;

	/**
	 * The cached value of the '{@link #getChangeKind() <em>Change Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeKind()
	 * @generated
	 * @ordered
	 */
	protected ChangeKind changeKind = CHANGE_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getOldValue() <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected static final String OLD_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOldValue() <em>Old Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOldValue()
	 * @generated
	 * @ordered
	 */
	protected String oldValue = OLD_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected String newValue = NEW_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeRowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportHistoryPackage.Literals.CHANGE_ROW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRevisionNumber() {
		return revisionNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRevisionNumber(int newRevisionNumber) {
		int oldRevisionNumber = revisionNumber;
		revisionNumber = newRevisionNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__REVISION_NUMBER, oldRevisionNumber, revisionNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedAt() {
		return changedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedAt(String newChangedAt) {
		String oldChangedAt = changedAt;
		changedAt = newChangedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_AT, oldChangedAt, changedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getChangedBy() {
		return changedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangedBy(String newChangedBy) {
		String oldChangedBy = changedBy;
		changedBy = newChangedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_BY, oldChangedBy, changedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassifierId() {
		return classifierId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassifierId(String newClassifierId) {
		String oldClassifierId = classifierId;
		classifierId = newClassifierId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__CLASSIFIER_ID, oldClassifierId, classifierId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFeatureId() {
		return featureId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureId(String newFeatureId) {
		String oldFeatureId = featureId;
		featureId = newFeatureId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__FEATURE_ID, oldFeatureId, featureId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getField() {
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setField(String newField) {
		String oldField = field;
		field = newField;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__FIELD, oldField, field));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChangeKind getChangeKind() {
		return changeKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setChangeKind(ChangeKind newChangeKind) {
		ChangeKind oldChangeKind = changeKind;
		changeKind = newChangeKind == null ? CHANGE_KIND_EDEFAULT : newChangeKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__CHANGE_KIND, oldChangeKind, changeKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOldValue() {
		return oldValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOldValue(String newOldValue) {
		String oldOldValue = oldValue;
		oldValue = newOldValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__OLD_VALUE, oldOldValue, oldValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNewValue() {
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNewValue(String newNewValue) {
		String oldNewValue = newValue;
		newValue = newNewValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportHistoryPackage.CHANGE_ROW__NEW_VALUE, oldNewValue, newValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportHistoryPackage.CHANGE_ROW__REVISION_NUMBER:
				return getRevisionNumber();
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_AT:
				return getChangedAt();
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_BY:
				return getChangedBy();
			case GDPRReportHistoryPackage.CHANGE_ROW__CLASSIFIER_ID:
				return getClassifierId();
			case GDPRReportHistoryPackage.CHANGE_ROW__FEATURE_ID:
				return getFeatureId();
			case GDPRReportHistoryPackage.CHANGE_ROW__FIELD:
				return getField();
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGE_KIND:
				return getChangeKind();
			case GDPRReportHistoryPackage.CHANGE_ROW__OLD_VALUE:
				return getOldValue();
			case GDPRReportHistoryPackage.CHANGE_ROW__NEW_VALUE:
				return getNewValue();
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
			case GDPRReportHistoryPackage.CHANGE_ROW__REVISION_NUMBER:
				setRevisionNumber((Integer)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_AT:
				setChangedAt((String)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_BY:
				setChangedBy((String)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CLASSIFIER_ID:
				setClassifierId((String)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__FEATURE_ID:
				setFeatureId((String)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__FIELD:
				setField((String)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGE_KIND:
				setChangeKind((ChangeKind)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__OLD_VALUE:
				setOldValue((String)newValue);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__NEW_VALUE:
				setNewValue((String)newValue);
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
			case GDPRReportHistoryPackage.CHANGE_ROW__REVISION_NUMBER:
				setRevisionNumber(REVISION_NUMBER_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_AT:
				setChangedAt(CHANGED_AT_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_BY:
				setChangedBy(CHANGED_BY_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CLASSIFIER_ID:
				setClassifierId(CLASSIFIER_ID_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__FEATURE_ID:
				setFeatureId(FEATURE_ID_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__FIELD:
				setField(FIELD_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGE_KIND:
				setChangeKind(CHANGE_KIND_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__OLD_VALUE:
				setOldValue(OLD_VALUE_EDEFAULT);
				return;
			case GDPRReportHistoryPackage.CHANGE_ROW__NEW_VALUE:
				setNewValue(NEW_VALUE_EDEFAULT);
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
			case GDPRReportHistoryPackage.CHANGE_ROW__REVISION_NUMBER:
				return revisionNumber != REVISION_NUMBER_EDEFAULT;
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_AT:
				return CHANGED_AT_EDEFAULT == null ? changedAt != null : !CHANGED_AT_EDEFAULT.equals(changedAt);
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGED_BY:
				return CHANGED_BY_EDEFAULT == null ? changedBy != null : !CHANGED_BY_EDEFAULT.equals(changedBy);
			case GDPRReportHistoryPackage.CHANGE_ROW__CLASSIFIER_ID:
				return CLASSIFIER_ID_EDEFAULT == null ? classifierId != null : !CLASSIFIER_ID_EDEFAULT.equals(classifierId);
			case GDPRReportHistoryPackage.CHANGE_ROW__FEATURE_ID:
				return FEATURE_ID_EDEFAULT == null ? featureId != null : !FEATURE_ID_EDEFAULT.equals(featureId);
			case GDPRReportHistoryPackage.CHANGE_ROW__FIELD:
				return FIELD_EDEFAULT == null ? field != null : !FIELD_EDEFAULT.equals(field);
			case GDPRReportHistoryPackage.CHANGE_ROW__CHANGE_KIND:
				return changeKind != CHANGE_KIND_EDEFAULT;
			case GDPRReportHistoryPackage.CHANGE_ROW__OLD_VALUE:
				return OLD_VALUE_EDEFAULT == null ? oldValue != null : !OLD_VALUE_EDEFAULT.equals(oldValue);
			case GDPRReportHistoryPackage.CHANGE_ROW__NEW_VALUE:
				return NEW_VALUE_EDEFAULT == null ? newValue != null : !NEW_VALUE_EDEFAULT.equals(newValue);
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
		result.append(" (revisionNumber: ");
		result.append(revisionNumber);
		result.append(", changedAt: ");
		result.append(changedAt);
		result.append(", changedBy: ");
		result.append(changedBy);
		result.append(", classifierId: ");
		result.append(classifierId);
		result.append(", featureId: ");
		result.append(featureId);
		result.append(", field: ");
		result.append(field);
		result.append(", changeKind: ");
		result.append(changeKind);
		result.append(", oldValue: ");
		result.append(oldValue);
		result.append(", newValue: ");
		result.append(newValue);
		result.append(')');
		return result.toString();
	}

} //ChangeRowImpl
