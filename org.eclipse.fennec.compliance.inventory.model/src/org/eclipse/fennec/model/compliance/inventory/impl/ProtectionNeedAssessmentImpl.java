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
package org.eclipse.fennec.model.compliance.inventory.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.ProtectionLevel;
import org.eclipse.fennec.model.compliance.inventory.ProtectionNeedAssessment;
import org.eclipse.fennec.model.compliance.inventory.ProtectionNeedDerivation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protection Need Assessment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getConfidentiality <em>Confidentiality</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getIntegrity <em>Integrity</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getDerivation <em>Derivation</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getAssessedBy <em>Assessed By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.ProtectionNeedAssessmentImpl#getAssessedAt <em>Assessed At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProtectionNeedAssessmentImpl extends MinimalEObjectImpl.Container implements ProtectionNeedAssessment {
	/**
	 * The default value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected static final ProtectionLevel CONFIDENTIALITY_EDEFAULT = ProtectionLevel.NORMAL;

	/**
	 * The cached value of the '{@link #getConfidentiality() <em>Confidentiality</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentiality()
	 * @generated
	 * @ordered
	 */
	protected ProtectionLevel confidentiality = CONFIDENTIALITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected static final ProtectionLevel INTEGRITY_EDEFAULT = ProtectionLevel.NORMAL;

	/**
	 * The cached value of the '{@link #getIntegrity() <em>Integrity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrity()
	 * @generated
	 * @ordered
	 */
	protected ProtectionLevel integrity = INTEGRITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected static final ProtectionLevel AVAILABILITY_EDEFAULT = ProtectionLevel.NORMAL;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected ProtectionLevel availability = AVAILABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDerivation() <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected static final ProtectionNeedDerivation DERIVATION_EDEFAULT = ProtectionNeedDerivation.ASSESSED;

	/**
	 * The cached value of the '{@link #getDerivation() <em>Derivation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivation()
	 * @generated
	 * @ordered
	 */
	protected ProtectionNeedDerivation derivation = DERIVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> derivedFrom;

	/**
	 * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected static final String RATIONALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRationale()
	 * @generated
	 * @ordered
	 */
	protected String rationale = RATIONALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssessedBy() <em>Assessed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessedBy() <em>Assessed By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessedBy()
	 * @generated
	 * @ordered
	 */
	protected String assessedBy = ASSESSED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssessedAt() <em>Assessed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessedAt()
	 * @generated
	 * @ordered
	 */
	protected static final String ASSESSED_AT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAssessedAt() <em>Assessed At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssessedAt()
	 * @generated
	 * @ordered
	 */
	protected String assessedAt = ASSESSED_AT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtectionNeedAssessmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.PROTECTION_NEED_ASSESSMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtectionLevel getConfidentiality() {
		return confidentiality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConfidentiality(ProtectionLevel newConfidentiality) {
		ProtectionLevel oldConfidentiality = confidentiality;
		confidentiality = newConfidentiality == null ? CONFIDENTIALITY_EDEFAULT : newConfidentiality;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY, oldConfidentiality, confidentiality));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtectionLevel getIntegrity() {
		return integrity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntegrity(ProtectionLevel newIntegrity) {
		ProtectionLevel oldIntegrity = integrity;
		integrity = newIntegrity == null ? INTEGRITY_EDEFAULT : newIntegrity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROTECTION_NEED_ASSESSMENT__INTEGRITY, oldIntegrity, integrity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtectionLevel getAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAvailability(ProtectionLevel newAvailability) {
		ProtectionLevel oldAvailability = availability;
		availability = newAvailability == null ? AVAILABILITY_EDEFAULT : newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROTECTION_NEED_ASSESSMENT__AVAILABILITY, oldAvailability, availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProtectionNeedDerivation getDerivation() {
		return derivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDerivation(ProtectionNeedDerivation newDerivation) {
		ProtectionNeedDerivation oldDerivation = derivation;
		derivation = newDerivation == null ? DERIVATION_EDEFAULT : newDerivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVATION, oldDerivation, derivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectResolvingEList<Asset>(Asset.class, this, InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRationale() {
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRationale(String newRationale) {
		String oldRationale = rationale;
		rationale = newRationale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROTECTION_NEED_ASSESSMENT__RATIONALE, oldRationale, rationale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssessedBy() {
		return assessedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessedBy(String newAssessedBy) {
		String oldAssessedBy = assessedBy;
		assessedBy = newAssessedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_BY, oldAssessedBy, assessedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAssessedAt() {
		return assessedAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAssessedAt(String newAssessedAt) {
		String oldAssessedAt = assessedAt;
		assessedAt = newAssessedAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_AT, oldAssessedAt, assessedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY:
				return getConfidentiality();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__INTEGRITY:
				return getIntegrity();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__AVAILABILITY:
				return getAvailability();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVATION:
				return getDerivation();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVED_FROM:
				return getDerivedFrom();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__RATIONALE:
				return getRationale();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_BY:
				return getAssessedBy();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_AT:
				return getAssessedAt();
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
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY:
				setConfidentiality((ProtectionLevel)newValue);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__INTEGRITY:
				setIntegrity((ProtectionLevel)newValue);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__AVAILABILITY:
				setAvailability((ProtectionLevel)newValue);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVATION:
				setDerivation((ProtectionNeedDerivation)newValue);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends Asset>)newValue);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__RATIONALE:
				setRationale((String)newValue);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_BY:
				setAssessedBy((String)newValue);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_AT:
				setAssessedAt((String)newValue);
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
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY:
				setConfidentiality(CONFIDENTIALITY_EDEFAULT);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__INTEGRITY:
				setIntegrity(INTEGRITY_EDEFAULT);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__AVAILABILITY:
				setAvailability(AVAILABILITY_EDEFAULT);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVATION:
				setDerivation(DERIVATION_EDEFAULT);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__RATIONALE:
				setRationale(RATIONALE_EDEFAULT);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_BY:
				setAssessedBy(ASSESSED_BY_EDEFAULT);
				return;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_AT:
				setAssessedAt(ASSESSED_AT_EDEFAULT);
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
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__CONFIDENTIALITY:
				return confidentiality != CONFIDENTIALITY_EDEFAULT;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__INTEGRITY:
				return integrity != INTEGRITY_EDEFAULT;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__AVAILABILITY:
				return availability != AVAILABILITY_EDEFAULT;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVATION:
				return derivation != DERIVATION_EDEFAULT;
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__RATIONALE:
				return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_BY:
				return ASSESSED_BY_EDEFAULT == null ? assessedBy != null : !ASSESSED_BY_EDEFAULT.equals(assessedBy);
			case InventoryPackage.PROTECTION_NEED_ASSESSMENT__ASSESSED_AT:
				return ASSESSED_AT_EDEFAULT == null ? assessedAt != null : !ASSESSED_AT_EDEFAULT.equals(assessedAt);
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
		result.append(" (confidentiality: ");
		result.append(confidentiality);
		result.append(", integrity: ");
		result.append(integrity);
		result.append(", availability: ");
		result.append(availability);
		result.append(", derivation: ");
		result.append(derivation);
		result.append(", rationale: ");
		result.append(rationale);
		result.append(", assessedBy: ");
		result.append(assessedBy);
		result.append(", assessedAt: ");
		result.append(assessedAt);
		result.append(')');
		return result.toString();
	}

} //ProtectionNeedAssessmentImpl
