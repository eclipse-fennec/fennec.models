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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.context.RequirementRef;

import org.eclipse.fennec.model.compliance.inventory.Asset;
import org.eclipse.fennec.model.compliance.inventory.CoverageKind;
import org.eclipse.fennec.model.compliance.inventory.ImplementationStatus;
import org.eclipse.fennec.model.compliance.inventory.InventoryPackage;
import org.eclipse.fennec.model.compliance.inventory.Measure;
import org.eclipse.fennec.model.compliance.inventory.RequirementApplicability;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Applicability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#isApplicable <em>Applicable</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getJustification <em>Justification</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getMeasures <em>Measures</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getCoverage <em>Coverage</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getDerivedFrom <em>Derived From</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getAssets <em>Assets</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getDecidedBy <em>Decided By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.inventory.impl.RequirementApplicabilityImpl#getDecidedAt <em>Decided At</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementApplicabilityImpl extends MinimalEObjectImpl.Container implements RequirementApplicability {
	/**
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected RequirementRef requirement;

	/**
	 * The default value of the '{@link #isApplicable() <em>Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean APPLICABLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isApplicable() <em>Applicable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isApplicable()
	 * @generated
	 * @ordered
	 */
	protected boolean applicable = APPLICABLE_EDEFAULT;

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
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ImplementationStatus STATUS_EDEFAULT = ImplementationStatus.PLANNED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ImplementationStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMeasures() <em>Measures</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasures()
	 * @generated
	 * @ordered
	 */
	protected EList<Measure> measures;

	/**
	 * The default value of the '{@link #getCoverage() <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected static final CoverageKind COVERAGE_EDEFAULT = CoverageKind.DIRECT;

	/**
	 * The cached value of the '{@link #getCoverage() <em>Coverage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoverage()
	 * @generated
	 * @ordered
	 */
	protected CoverageKind coverage = COVERAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDerivedFrom() <em>Derived From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDerivedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementRef> derivedFrom;

	/**
	 * The cached value of the '{@link #getAssets() <em>Assets</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssets()
	 * @generated
	 * @ordered
	 */
	protected EList<Asset> assets;

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
	protected RequirementApplicabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.REQUIREMENT_APPLICABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementRef getRequirement() {
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequirement(RequirementRef newRequirement, NotificationChain msgs) {
		RequirementRef oldRequirement = requirement;
		requirement = newRequirement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT, oldRequirement, newRequirement);
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
	public void setRequirement(RequirementRef newRequirement) {
		if (newRequirement != requirement) {
			NotificationChain msgs = null;
			if (requirement != null)
				msgs = ((InternalEObject)requirement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT, null, msgs);
			if (newRequirement != null)
				msgs = ((InternalEObject)newRequirement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT, null, msgs);
			msgs = basicSetRequirement(newRequirement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT, newRequirement, newRequirement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isApplicable() {
		return applicable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setApplicable(boolean newApplicable) {
		boolean oldApplicable = applicable;
		applicable = newApplicable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__APPLICABLE, oldApplicable, applicable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__JUSTIFICATION, oldJustification, justification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatus(ImplementationStatus newStatus) {
		ImplementationStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Measure> getMeasures() {
		if (measures == null) {
			measures = new EObjectResolvingEList<Measure>(Measure.class, this, InventoryPackage.REQUIREMENT_APPLICABILITY__MEASURES);
		}
		return measures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CoverageKind getCoverage() {
		return coverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCoverage(CoverageKind newCoverage) {
		CoverageKind oldCoverage = coverage;
		coverage = newCoverage == null ? COVERAGE_EDEFAULT : newCoverage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__COVERAGE, oldCoverage, coverage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RequirementRef> getDerivedFrom() {
		if (derivedFrom == null) {
			derivedFrom = new EObjectContainmentEList<RequirementRef>(RequirementRef.class, this, InventoryPackage.REQUIREMENT_APPLICABILITY__DERIVED_FROM);
		}
		return derivedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Asset> getAssets() {
		if (assets == null) {
			assets = new EObjectResolvingEList<Asset>(Asset.class, this, InventoryPackage.REQUIREMENT_APPLICABILITY__ASSETS);
		}
		return assets;
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_BY, oldDecidedBy, decidedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_AT, oldDecidedAt, decidedAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT:
				return basicSetRequirement(null, msgs);
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DERIVED_FROM:
				return ((InternalEList<?>)getDerivedFrom()).basicRemove(otherEnd, msgs);
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
			case InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT:
				return getRequirement();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__APPLICABLE:
				return isApplicable();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__JUSTIFICATION:
				return getJustification();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__STATUS:
				return getStatus();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__MEASURES:
				return getMeasures();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__COVERAGE:
				return getCoverage();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DERIVED_FROM:
				return getDerivedFrom();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__ASSETS:
				return getAssets();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_BY:
				return getDecidedBy();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_AT:
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
			case InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT:
				setRequirement((RequirementRef)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__APPLICABLE:
				setApplicable((Boolean)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__JUSTIFICATION:
				setJustification((String)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__STATUS:
				setStatus((ImplementationStatus)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__MEASURES:
				getMeasures().clear();
				getMeasures().addAll((Collection<? extends Measure>)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__COVERAGE:
				setCoverage((CoverageKind)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DERIVED_FROM:
				getDerivedFrom().clear();
				getDerivedFrom().addAll((Collection<? extends RequirementRef>)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__ASSETS:
				getAssets().clear();
				getAssets().addAll((Collection<? extends Asset>)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_BY:
				setDecidedBy((String)newValue);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_AT:
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
			case InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT:
				setRequirement((RequirementRef)null);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__APPLICABLE:
				setApplicable(APPLICABLE_EDEFAULT);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__JUSTIFICATION:
				setJustification(JUSTIFICATION_EDEFAULT);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__MEASURES:
				getMeasures().clear();
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__COVERAGE:
				setCoverage(COVERAGE_EDEFAULT);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DERIVED_FROM:
				getDerivedFrom().clear();
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__ASSETS:
				getAssets().clear();
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_BY:
				setDecidedBy(DECIDED_BY_EDEFAULT);
				return;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_AT:
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
			case InventoryPackage.REQUIREMENT_APPLICABILITY__REQUIREMENT:
				return requirement != null;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__APPLICABLE:
				return applicable != APPLICABLE_EDEFAULT;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__JUSTIFICATION:
				return JUSTIFICATION_EDEFAULT == null ? justification != null : !JUSTIFICATION_EDEFAULT.equals(justification);
			case InventoryPackage.REQUIREMENT_APPLICABILITY__STATUS:
				return status != STATUS_EDEFAULT;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__MEASURES:
				return measures != null && !measures.isEmpty();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__COVERAGE:
				return coverage != COVERAGE_EDEFAULT;
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DERIVED_FROM:
				return derivedFrom != null && !derivedFrom.isEmpty();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__ASSETS:
				return assets != null && !assets.isEmpty();
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_BY:
				return DECIDED_BY_EDEFAULT == null ? decidedBy != null : !DECIDED_BY_EDEFAULT.equals(decidedBy);
			case InventoryPackage.REQUIREMENT_APPLICABILITY__DECIDED_AT:
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
		result.append(" (applicable: ");
		result.append(applicable);
		result.append(", justification: ");
		result.append(justification);
		result.append(", status: ");
		result.append(status);
		result.append(", coverage: ");
		result.append(coverage);
		result.append(", decidedBy: ");
		result.append(decidedBy);
		result.append(", decidedAt: ");
		result.append(decidedAt);
		result.append(')');
		return result.toString();
	}

} //RequirementApplicabilityImpl
