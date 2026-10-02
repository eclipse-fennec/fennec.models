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
package org.eclipse.fennec.model.compliance.context.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.context.ContextPackage;
import org.eclipse.fennec.model.compliance.context.MappingRelationship;
import org.eclipse.fennec.model.compliance.context.Origin;
import org.eclipse.fennec.model.compliance.context.RequirementMapping;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl#getSourceRequirementId <em>Source Requirement Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl#getTargetRequirementId <em>Target Requirement Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl#getConfirmedBy <em>Confirmed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.impl.RequirementMappingImpl#getConfirmedAt <em>Confirmed At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementMappingImpl extends MinimalEObjectImpl.Container implements RequirementMapping {
	/**
	 * The default value of the '{@link #getSourceRequirementId() <em>Source Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRequirementId()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRequirementId() <em>Source Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRequirementId()
	 * @generated
	 * @ordered
	 */
	protected String sourceRequirementId = SOURCE_REQUIREMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetRequirementId() <em>Target Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRequirementId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_REQUIREMENT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetRequirementId() <em>Target Requirement Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRequirementId()
	 * @generated
	 * @ordered
	 */
	protected String targetRequirementId = TARGET_REQUIREMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final MappingRelationship RELATIONSHIP_EDEFAULT = MappingRelationship.EQUIVALENT;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected MappingRelationship relationship = RELATIONSHIP_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Origin ORIGIN_EDEFAULT = Origin.SOURCE;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Origin origin = ORIGIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfirmedBy() <em>Confirmed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRMED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmedBy() <em>Confirmed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedBy()
	 * @generated
	 * @ordered
	 */
	protected String confirmedBy = CONFIRMED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getConfirmedAt() <em>Confirmed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String CONFIRMED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConfirmedAt() <em>Confirmed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmedAt()
	 * @generated
	 * @ordered
	 */
	protected String confirmedAt = CONFIRMED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ContextPackage.Literals.REQUIREMENT_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceRequirementId() {
		return sourceRequirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRequirementId(String newSourceRequirementId) {
		String oldSourceRequirementId = sourceRequirementId;
		sourceRequirementId = newSourceRequirementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID, oldSourceRequirementId, sourceRequirementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetRequirementId() {
		return targetRequirementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetRequirementId(String newTargetRequirementId) {
		String oldTargetRequirementId = targetRequirementId;
		targetRequirementId = newTargetRequirementId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID, oldTargetRequirementId, targetRequirementId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MappingRelationship getRelationship() {
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelationship(MappingRelationship newRelationship) {
		MappingRelationship oldRelationship = relationship;
		relationship = newRelationship == null ? RELATIONSHIP_EDEFAULT : newRelationship;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT_MAPPING__RELATIONSHIP, oldRelationship, relationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT_MAPPING__REMARKS, oldRemarks, remarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Origin getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrigin(Origin newOrigin) {
		Origin oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT_MAPPING__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmedBy() {
		return confirmedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmedBy(String newConfirmedBy) {
		String oldConfirmedBy = confirmedBy;
		confirmedBy = newConfirmedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_BY, oldConfirmedBy, confirmedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConfirmedAt() {
		return confirmedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfirmedAt(String newConfirmedAt) {
		String oldConfirmedAt = confirmedAt;
		confirmedAt = newConfirmedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_AT, oldConfirmedAt, confirmedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ContextPackage.REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID:
				return getSourceRequirementId();
			case ContextPackage.REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID:
				return getTargetRequirementId();
			case ContextPackage.REQUIREMENT_MAPPING__RELATIONSHIP:
				return getRelationship();
			case ContextPackage.REQUIREMENT_MAPPING__REMARKS:
				return getRemarks();
			case ContextPackage.REQUIREMENT_MAPPING__ORIGIN:
				return getOrigin();
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_BY:
				return getConfirmedBy();
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_AT:
				return getConfirmedAt();
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
			case ContextPackage.REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID:
				setSourceRequirementId((String)newValue);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID:
				setTargetRequirementId((String)newValue);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__RELATIONSHIP:
				setRelationship((MappingRelationship)newValue);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__REMARKS:
				setRemarks((String)newValue);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__ORIGIN:
				setOrigin((Origin)newValue);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_BY:
				setConfirmedBy((String)newValue);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_AT:
				setConfirmedAt((String)newValue);
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
			case ContextPackage.REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID:
				setSourceRequirementId(SOURCE_REQUIREMENT_ID_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID:
				setTargetRequirementId(TARGET_REQUIREMENT_ID_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__RELATIONSHIP:
				setRelationship(RELATIONSHIP_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_BY:
				setConfirmedBy(CONFIRMED_BY_EDEFAULT);
				return;
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_AT:
				setConfirmedAt(CONFIRMED_AT_EDEFAULT);
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
			case ContextPackage.REQUIREMENT_MAPPING__SOURCE_REQUIREMENT_ID:
				return SOURCE_REQUIREMENT_ID_EDEFAULT == null ? sourceRequirementId != null : !SOURCE_REQUIREMENT_ID_EDEFAULT.equals(sourceRequirementId);
			case ContextPackage.REQUIREMENT_MAPPING__TARGET_REQUIREMENT_ID:
				return TARGET_REQUIREMENT_ID_EDEFAULT == null ? targetRequirementId != null : !TARGET_REQUIREMENT_ID_EDEFAULT.equals(targetRequirementId);
			case ContextPackage.REQUIREMENT_MAPPING__RELATIONSHIP:
				return relationship != RELATIONSHIP_EDEFAULT;
			case ContextPackage.REQUIREMENT_MAPPING__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case ContextPackage.REQUIREMENT_MAPPING__ORIGIN:
				return origin != ORIGIN_EDEFAULT;
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_BY:
				return CONFIRMED_BY_EDEFAULT == null ? confirmedBy != null : !CONFIRMED_BY_EDEFAULT.equals(confirmedBy);
			case ContextPackage.REQUIREMENT_MAPPING__CONFIRMED_AT:
				return CONFIRMED_AT_EDEFAULT == null ? confirmedAt != null : !CONFIRMED_AT_EDEFAULT.equals(confirmedAt);
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
		result.append(" (sourceRequirementId: ");
		result.append(sourceRequirementId);
		result.append(", targetRequirementId: ");
		result.append(targetRequirementId);
		result.append(", relationship: ");
		result.append(relationship);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", origin: ");
		result.append(origin);
		result.append(", confirmedBy: ");
		result.append(confirmedBy);
		result.append(", confirmedAt: ");
		result.append(confirmedAt);
		result.append(')');
		return result.toString();
	}

} //RequirementMappingImpl
