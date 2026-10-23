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

import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.LegalCorpusRef;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Corpus Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.LegalCorpusRefImpl#getCelex <em>Celex</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.LegalCorpusRefImpl#getConsolidatedDate <em>Consolidated Date</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.LegalCorpusRefImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.LegalCorpusRefImpl#getFormexSchema <em>Formex Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LegalCorpusRefImpl extends MinimalEObjectImpl.Container implements LegalCorpusRef {
	/**
	 * The default value of the '{@link #getCelex() <em>Celex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCelex()
	 * @generated
	 * @ordered
	 */
	protected static final String CELEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCelex() <em>Celex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCelex()
	 * @generated
	 * @ordered
	 */
	protected String celex = CELEX_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsolidatedDate() <em>Consolidated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolidatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSOLIDATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConsolidatedDate() <em>Consolidated Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolidatedDate()
	 * @generated
	 * @ordered
	 */
	protected String consolidatedDate = CONSOLIDATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormexSchema() <em>Formex Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormexSchema()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMEX_SCHEMA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormexSchema() <em>Formex Schema</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormexSchema()
	 * @generated
	 * @ordered
	 */
	protected String formexSchema = FORMEX_SCHEMA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalCorpusRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.LEGAL_CORPUS_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCelex() {
		return celex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCelex(String newCelex) {
		String oldCelex = celex;
		celex = newCelex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.LEGAL_CORPUS_REF__CELEX, oldCelex, celex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConsolidatedDate() {
		return consolidatedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConsolidatedDate(String newConsolidatedDate) {
		String oldConsolidatedDate = consolidatedDate;
		consolidatedDate = newConsolidatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.LEGAL_CORPUS_REF__CONSOLIDATED_DATE, oldConsolidatedDate, consolidatedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLanguage(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.LEGAL_CORPUS_REF__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormexSchema() {
		return formexSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormexSchema(String newFormexSchema) {
		String oldFormexSchema = formexSchema;
		formexSchema = newFormexSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.LEGAL_CORPUS_REF__FORMEX_SCHEMA, oldFormexSchema, formexSchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GDPRReportPackage.LEGAL_CORPUS_REF__CELEX:
				return getCelex();
			case GDPRReportPackage.LEGAL_CORPUS_REF__CONSOLIDATED_DATE:
				return getConsolidatedDate();
			case GDPRReportPackage.LEGAL_CORPUS_REF__LANGUAGE:
				return getLanguage();
			case GDPRReportPackage.LEGAL_CORPUS_REF__FORMEX_SCHEMA:
				return getFormexSchema();
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
			case GDPRReportPackage.LEGAL_CORPUS_REF__CELEX:
				setCelex((String)newValue);
				return;
			case GDPRReportPackage.LEGAL_CORPUS_REF__CONSOLIDATED_DATE:
				setConsolidatedDate((String)newValue);
				return;
			case GDPRReportPackage.LEGAL_CORPUS_REF__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case GDPRReportPackage.LEGAL_CORPUS_REF__FORMEX_SCHEMA:
				setFormexSchema((String)newValue);
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
			case GDPRReportPackage.LEGAL_CORPUS_REF__CELEX:
				setCelex(CELEX_EDEFAULT);
				return;
			case GDPRReportPackage.LEGAL_CORPUS_REF__CONSOLIDATED_DATE:
				setConsolidatedDate(CONSOLIDATED_DATE_EDEFAULT);
				return;
			case GDPRReportPackage.LEGAL_CORPUS_REF__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GDPRReportPackage.LEGAL_CORPUS_REF__FORMEX_SCHEMA:
				setFormexSchema(FORMEX_SCHEMA_EDEFAULT);
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
			case GDPRReportPackage.LEGAL_CORPUS_REF__CELEX:
				return CELEX_EDEFAULT == null ? celex != null : !CELEX_EDEFAULT.equals(celex);
			case GDPRReportPackage.LEGAL_CORPUS_REF__CONSOLIDATED_DATE:
				return CONSOLIDATED_DATE_EDEFAULT == null ? consolidatedDate != null : !CONSOLIDATED_DATE_EDEFAULT.equals(consolidatedDate);
			case GDPRReportPackage.LEGAL_CORPUS_REF__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case GDPRReportPackage.LEGAL_CORPUS_REF__FORMEX_SCHEMA:
				return FORMEX_SCHEMA_EDEFAULT == null ? formexSchema != null : !FORMEX_SCHEMA_EDEFAULT.equals(formexSchema);
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
		result.append(" (celex: ");
		result.append(celex);
		result.append(", consolidatedDate: ");
		result.append(consolidatedDate);
		result.append(", language: ");
		result.append(language);
		result.append(", formexSchema: ");
		result.append(formexSchema);
		result.append(')');
		return result.toString();
	}

} //LegalCorpusRefImpl
