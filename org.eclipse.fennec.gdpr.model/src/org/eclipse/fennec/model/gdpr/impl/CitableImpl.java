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
package org.eclipse.fennec.model.gdpr.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdpr.Citable;
import org.eclipse.fennec.model.gdpr.CrossReference;
import org.eclipse.fennec.model.gdpr.GDPRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Citable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CitableImpl#getCitationId <em>Citation Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CitableImpl#getCites <em>Cites</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CitableImpl#getCitedBy <em>Cited By</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CitableImpl extends MinimalEObjectImpl.Container implements Citable {
	/**
	 * The default value of the '{@link #getCitationId() <em>Citation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationId()
	 * @generated
	 * @ordered
	 */
	protected static final String CITATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCitationId() <em>Citation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitationId()
	 * @generated
	 * @ordered
	 */
	protected String citationId = CITATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCites() <em>Cites</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCites()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossReference> cites;

	/**
	 * The cached value of the '{@link #getCitedBy() <em>Cited By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<CrossReference> citedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CitableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRPackage.Literals.CITABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCitationId() {
		return citationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCitationId(String newCitationId) {
		String oldCitationId = citationId;
		citationId = newCitationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CITABLE__CITATION_ID, oldCitationId, citationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossReference> getCites() {
		if (cites == null) {
			cites = new EObjectWithInverseResolvingEList<CrossReference>(CrossReference.class, this, GDPRPackage.CITABLE__CITES, GDPRPackage.CROSS_REFERENCE__SOURCE);
		}
		return cites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CrossReference> getCitedBy() {
		if (citedBy == null) {
			citedBy = new EObjectWithInverseResolvingEList<CrossReference>(CrossReference.class, this, GDPRPackage.CITABLE__CITED_BY, GDPRPackage.CROSS_REFERENCE__TARGET);
		}
		return citedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRPackage.CITABLE__CITES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCites()).basicAdd(otherEnd, msgs);
			case GDPRPackage.CITABLE__CITED_BY:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCitedBy()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRPackage.CITABLE__CITES:
				return ((InternalEList<?>)getCites()).basicRemove(otherEnd, msgs);
			case GDPRPackage.CITABLE__CITED_BY:
				return ((InternalEList<?>)getCitedBy()).basicRemove(otherEnd, msgs);
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
			case GDPRPackage.CITABLE__CITATION_ID:
				return getCitationId();
			case GDPRPackage.CITABLE__CITES:
				return getCites();
			case GDPRPackage.CITABLE__CITED_BY:
				return getCitedBy();
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
			case GDPRPackage.CITABLE__CITATION_ID:
				setCitationId((String)newValue);
				return;
			case GDPRPackage.CITABLE__CITES:
				getCites().clear();
				getCites().addAll((Collection<? extends CrossReference>)newValue);
				return;
			case GDPRPackage.CITABLE__CITED_BY:
				getCitedBy().clear();
				getCitedBy().addAll((Collection<? extends CrossReference>)newValue);
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
			case GDPRPackage.CITABLE__CITATION_ID:
				setCitationId(CITATION_ID_EDEFAULT);
				return;
			case GDPRPackage.CITABLE__CITES:
				getCites().clear();
				return;
			case GDPRPackage.CITABLE__CITED_BY:
				getCitedBy().clear();
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
			case GDPRPackage.CITABLE__CITATION_ID:
				return CITATION_ID_EDEFAULT == null ? citationId != null : !CITATION_ID_EDEFAULT.equals(citationId);
			case GDPRPackage.CITABLE__CITES:
				return cites != null && !cites.isEmpty();
			case GDPRPackage.CITABLE__CITED_BY:
				return citedBy != null && !citedBy.isEmpty();
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
		result.append(" (citationId: ");
		result.append(citationId);
		result.append(')');
		return result.toString();
	}

} //CitableImpl
