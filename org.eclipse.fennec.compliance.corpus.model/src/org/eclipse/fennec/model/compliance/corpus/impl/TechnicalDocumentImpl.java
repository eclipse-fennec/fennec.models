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
package org.eclipse.fennec.model.compliance.corpus.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;
import org.eclipse.fennec.model.compliance.corpus.DocumentSection;
import org.eclipse.fennec.model.compliance.corpus.TechnicalDocument;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Technical Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl#getDocumentNumber <em>Document Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.TechnicalDocumentImpl#getSections <em>Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TechnicalDocumentImpl extends CorpusImpl implements TechnicalDocument {
	/**
	 * The default value of the '{@link #getDocumentNumber() <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentNumber() <em>Document Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentNumber()
	 * @generated
	 * @ordered
	 */
	protected String documentNumber = DOCUMENT_NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected static final String PART_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPart()
	 * @generated
	 * @ordered
	 */
	protected String part = PART_EDEFAULT;

	/**
	 * The default value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLISHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected String publisher = PUBLISHER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSections() <em>Sections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSections()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentSection> sections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnicalDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusPackage.Literals.TECHNICAL_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDocumentNumber() {
		return documentNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDocumentNumber(String newDocumentNumber) {
		String oldDocumentNumber = documentNumber;
		documentNumber = newDocumentNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.TECHNICAL_DOCUMENT__DOCUMENT_NUMBER, oldDocumentNumber, documentNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPart() {
		return part;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPart(String newPart) {
		String oldPart = part;
		part = newPart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.TECHNICAL_DOCUMENT__PART, oldPart, part));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublisher(String newPublisher) {
		String oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.TECHNICAL_DOCUMENT__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<DocumentSection>(DocumentSection.class, this, CorpusPackage.TECHNICAL_DOCUMENT__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusPackage.TECHNICAL_DOCUMENT__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
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
			case CorpusPackage.TECHNICAL_DOCUMENT__DOCUMENT_NUMBER:
				return getDocumentNumber();
			case CorpusPackage.TECHNICAL_DOCUMENT__PART:
				return getPart();
			case CorpusPackage.TECHNICAL_DOCUMENT__PUBLISHER:
				return getPublisher();
			case CorpusPackage.TECHNICAL_DOCUMENT__SECTIONS:
				return getSections();
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
			case CorpusPackage.TECHNICAL_DOCUMENT__DOCUMENT_NUMBER:
				setDocumentNumber((String)newValue);
				return;
			case CorpusPackage.TECHNICAL_DOCUMENT__PART:
				setPart((String)newValue);
				return;
			case CorpusPackage.TECHNICAL_DOCUMENT__PUBLISHER:
				setPublisher((String)newValue);
				return;
			case CorpusPackage.TECHNICAL_DOCUMENT__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends DocumentSection>)newValue);
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
			case CorpusPackage.TECHNICAL_DOCUMENT__DOCUMENT_NUMBER:
				setDocumentNumber(DOCUMENT_NUMBER_EDEFAULT);
				return;
			case CorpusPackage.TECHNICAL_DOCUMENT__PART:
				setPart(PART_EDEFAULT);
				return;
			case CorpusPackage.TECHNICAL_DOCUMENT__PUBLISHER:
				setPublisher(PUBLISHER_EDEFAULT);
				return;
			case CorpusPackage.TECHNICAL_DOCUMENT__SECTIONS:
				getSections().clear();
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
			case CorpusPackage.TECHNICAL_DOCUMENT__DOCUMENT_NUMBER:
				return DOCUMENT_NUMBER_EDEFAULT == null ? documentNumber != null : !DOCUMENT_NUMBER_EDEFAULT.equals(documentNumber);
			case CorpusPackage.TECHNICAL_DOCUMENT__PART:
				return PART_EDEFAULT == null ? part != null : !PART_EDEFAULT.equals(part);
			case CorpusPackage.TECHNICAL_DOCUMENT__PUBLISHER:
				return PUBLISHER_EDEFAULT == null ? publisher != null : !PUBLISHER_EDEFAULT.equals(publisher);
			case CorpusPackage.TECHNICAL_DOCUMENT__SECTIONS:
				return sections != null && !sections.isEmpty();
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
		result.append(" (documentNumber: ");
		result.append(documentNumber);
		result.append(", part: ");
		result.append(part);
		result.append(", publisher: ");
		result.append(publisher);
		result.append(')');
		return result.toString();
	}

} //TechnicalDocumentImpl
