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

import org.eclipse.fennec.model.gdprReport.Evidence;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvidenceImpl#getCitationId <em>Citation Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvidenceImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvidenceImpl#isVerbatim <em>Verbatim</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvidenceImpl#getRelevance <em>Relevance</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.EvidenceImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends MinimalEObjectImpl.Container implements Evidence {
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
	 * The default value of the '{@link #getQuote() <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuote()
	 * @generated
	 * @ordered
	 */
	protected static final String QUOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQuote() <em>Quote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuote()
	 * @generated
	 * @ordered
	 */
	protected String quote = QUOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerbatim() <em>Verbatim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbatim()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERBATIM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVerbatim() <em>Verbatim</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerbatim()
	 * @generated
	 * @ordered
	 */
	protected boolean verbatim = VERBATIM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevance() <em>Relevance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevance()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEVANCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelevance() <em>Relevance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevance()
	 * @generated
	 * @ordered
	 */
	protected String relevance = RELEVANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceRef() <em>Source Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRef()
	 * @generated
	 * @ordered
	 */
	protected String sourceRef = SOURCE_REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvidenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.EVIDENCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.EVIDENCE__CITATION_ID, oldCitationId, citationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQuote() {
		return quote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuote(String newQuote) {
		String oldQuote = quote;
		quote = newQuote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.EVIDENCE__QUOTE, oldQuote, quote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isVerbatim() {
		return verbatim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerbatim(boolean newVerbatim) {
		boolean oldVerbatim = verbatim;
		verbatim = newVerbatim;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.EVIDENCE__VERBATIM, oldVerbatim, verbatim));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelevance() {
		return relevance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevance(String newRelevance) {
		String oldRelevance = relevance;
		relevance = newRelevance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.EVIDENCE__RELEVANCE, oldRelevance, relevance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceRef() {
		return sourceRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceRef(String newSourceRef) {
		String oldSourceRef = sourceRef;
		sourceRef = newSourceRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.EVIDENCE__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportPackage.EVIDENCE__CITATION_ID:
				return getCitationId();
			case GDPRReportPackage.EVIDENCE__QUOTE:
				return getQuote();
			case GDPRReportPackage.EVIDENCE__VERBATIM:
				return isVerbatim();
			case GDPRReportPackage.EVIDENCE__RELEVANCE:
				return getRelevance();
			case GDPRReportPackage.EVIDENCE__SOURCE_REF:
				return getSourceRef();
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
			case GDPRReportPackage.EVIDENCE__CITATION_ID:
				setCitationId((String)newValue);
				return;
			case GDPRReportPackage.EVIDENCE__QUOTE:
				setQuote((String)newValue);
				return;
			case GDPRReportPackage.EVIDENCE__VERBATIM:
				setVerbatim((Boolean)newValue);
				return;
			case GDPRReportPackage.EVIDENCE__RELEVANCE:
				setRelevance((String)newValue);
				return;
			case GDPRReportPackage.EVIDENCE__SOURCE_REF:
				setSourceRef((String)newValue);
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
			case GDPRReportPackage.EVIDENCE__CITATION_ID:
				setCitationId(CITATION_ID_EDEFAULT);
				return;
			case GDPRReportPackage.EVIDENCE__QUOTE:
				setQuote(QUOTE_EDEFAULT);
				return;
			case GDPRReportPackage.EVIDENCE__VERBATIM:
				setVerbatim(VERBATIM_EDEFAULT);
				return;
			case GDPRReportPackage.EVIDENCE__RELEVANCE:
				setRelevance(RELEVANCE_EDEFAULT);
				return;
			case GDPRReportPackage.EVIDENCE__SOURCE_REF:
				setSourceRef(SOURCE_REF_EDEFAULT);
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
			case GDPRReportPackage.EVIDENCE__CITATION_ID:
				return CITATION_ID_EDEFAULT == null ? citationId != null : !CITATION_ID_EDEFAULT.equals(citationId);
			case GDPRReportPackage.EVIDENCE__QUOTE:
				return QUOTE_EDEFAULT == null ? quote != null : !QUOTE_EDEFAULT.equals(quote);
			case GDPRReportPackage.EVIDENCE__VERBATIM:
				return verbatim != VERBATIM_EDEFAULT;
			case GDPRReportPackage.EVIDENCE__RELEVANCE:
				return RELEVANCE_EDEFAULT == null ? relevance != null : !RELEVANCE_EDEFAULT.equals(relevance);
			case GDPRReportPackage.EVIDENCE__SOURCE_REF:
				return SOURCE_REF_EDEFAULT == null ? sourceRef != null : !SOURCE_REF_EDEFAULT.equals(sourceRef);
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
		result.append(", quote: ");
		result.append(quote);
		result.append(", verbatim: ");
		result.append(verbatim);
		result.append(", relevance: ");
		result.append(relevance);
		result.append(", sourceRef: ");
		result.append(sourceRef);
		result.append(')');
		return result.toString();
	}

} //EvidenceImpl
