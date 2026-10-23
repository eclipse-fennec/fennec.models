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
package org.eclipse.fennec.model.compliance.report.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.compliance.report.Evidence;
import org.eclipse.fennec.model.compliance.report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evidence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.EvidenceImpl#getContextId <em>Context Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.EvidenceImpl#getCorpusId <em>Corpus Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.EvidenceImpl#getCitationId <em>Citation Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.EvidenceImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.EvidenceImpl#isVerbatim <em>Verbatim</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.EvidenceImpl#getRelevance <em>Relevance</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.EvidenceImpl#getSourceRef <em>Source Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvidenceImpl extends MinimalEObjectImpl.Container implements Evidence {
	/**
	 * The default value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTEXT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContextId() <em>Context Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContextId()
	 * @generated
	 * @ordered
	 */
	protected String contextId = CONTEXT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCorpusId() <em>Corpus Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpusId()
	 * @generated
	 * @ordered
	 */
	protected static final String CORPUS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorpusId() <em>Corpus Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorpusId()
	 * @generated
	 * @ordered
	 */
	protected String corpusId = CORPUS_ID_EDEFAULT;

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
		return ReportPackage.Literals.EVIDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContextId() {
		return contextId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContextId(String newContextId) {
		String oldContextId = contextId;
		contextId = newContextId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EVIDENCE__CONTEXT_ID, oldContextId, contextId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCorpusId() {
		return corpusId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCorpusId(String newCorpusId) {
		String oldCorpusId = corpusId;
		corpusId = newCorpusId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EVIDENCE__CORPUS_ID, oldCorpusId, corpusId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EVIDENCE__CITATION_ID, oldCitationId, citationId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EVIDENCE__QUOTE, oldQuote, quote));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EVIDENCE__VERBATIM, oldVerbatim, verbatim));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EVIDENCE__RELEVANCE, oldRelevance, relevance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.EVIDENCE__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReportPackage.EVIDENCE__CONTEXT_ID:
				return getContextId();
			case ReportPackage.EVIDENCE__CORPUS_ID:
				return getCorpusId();
			case ReportPackage.EVIDENCE__CITATION_ID:
				return getCitationId();
			case ReportPackage.EVIDENCE__QUOTE:
				return getQuote();
			case ReportPackage.EVIDENCE__VERBATIM:
				return isVerbatim();
			case ReportPackage.EVIDENCE__RELEVANCE:
				return getRelevance();
			case ReportPackage.EVIDENCE__SOURCE_REF:
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
			case ReportPackage.EVIDENCE__CONTEXT_ID:
				setContextId((String)newValue);
				return;
			case ReportPackage.EVIDENCE__CORPUS_ID:
				setCorpusId((String)newValue);
				return;
			case ReportPackage.EVIDENCE__CITATION_ID:
				setCitationId((String)newValue);
				return;
			case ReportPackage.EVIDENCE__QUOTE:
				setQuote((String)newValue);
				return;
			case ReportPackage.EVIDENCE__VERBATIM:
				setVerbatim((Boolean)newValue);
				return;
			case ReportPackage.EVIDENCE__RELEVANCE:
				setRelevance((String)newValue);
				return;
			case ReportPackage.EVIDENCE__SOURCE_REF:
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
			case ReportPackage.EVIDENCE__CONTEXT_ID:
				setContextId(CONTEXT_ID_EDEFAULT);
				return;
			case ReportPackage.EVIDENCE__CORPUS_ID:
				setCorpusId(CORPUS_ID_EDEFAULT);
				return;
			case ReportPackage.EVIDENCE__CITATION_ID:
				setCitationId(CITATION_ID_EDEFAULT);
				return;
			case ReportPackage.EVIDENCE__QUOTE:
				setQuote(QUOTE_EDEFAULT);
				return;
			case ReportPackage.EVIDENCE__VERBATIM:
				setVerbatim(VERBATIM_EDEFAULT);
				return;
			case ReportPackage.EVIDENCE__RELEVANCE:
				setRelevance(RELEVANCE_EDEFAULT);
				return;
			case ReportPackage.EVIDENCE__SOURCE_REF:
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
			case ReportPackage.EVIDENCE__CONTEXT_ID:
				return CONTEXT_ID_EDEFAULT == null ? contextId != null : !CONTEXT_ID_EDEFAULT.equals(contextId);
			case ReportPackage.EVIDENCE__CORPUS_ID:
				return CORPUS_ID_EDEFAULT == null ? corpusId != null : !CORPUS_ID_EDEFAULT.equals(corpusId);
			case ReportPackage.EVIDENCE__CITATION_ID:
				return CITATION_ID_EDEFAULT == null ? citationId != null : !CITATION_ID_EDEFAULT.equals(citationId);
			case ReportPackage.EVIDENCE__QUOTE:
				return QUOTE_EDEFAULT == null ? quote != null : !QUOTE_EDEFAULT.equals(quote);
			case ReportPackage.EVIDENCE__VERBATIM:
				return verbatim != VERBATIM_EDEFAULT;
			case ReportPackage.EVIDENCE__RELEVANCE:
				return RELEVANCE_EDEFAULT == null ? relevance != null : !RELEVANCE_EDEFAULT.equals(relevance);
			case ReportPackage.EVIDENCE__SOURCE_REF:
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
		result.append(" (contextId: ");
		result.append(contextId);
		result.append(", corpusId: ");
		result.append(corpusId);
		result.append(", citationId: ");
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
