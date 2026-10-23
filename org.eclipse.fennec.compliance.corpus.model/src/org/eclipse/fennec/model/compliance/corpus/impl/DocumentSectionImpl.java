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
import org.eclipse.fennec.model.compliance.corpus.DocumentClause;
import org.eclipse.fennec.model.compliance.corpus.DocumentSection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl#getHeading <em>Heading</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentSectionImpl#getClauses <em>Clauses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentSectionImpl extends CitableImpl implements DocumentSection {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected String number = NUMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected static final String HEADING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeading() <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeading()
	 * @generated
	 * @ordered
	 */
	protected String heading = HEADING_EDEFAULT;

	/**
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	 * The cached value of the '{@link #getClauses() <em>Clauses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClauses()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentClause> clauses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusPackage.Literals.DOCUMENT_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		String oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.DOCUMENT_SECTION__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHeading() {
		return heading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeading(String newHeading) {
		String oldHeading = heading;
		heading = newHeading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.DOCUMENT_SECTION__HEADING, oldHeading, heading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.DOCUMENT_SECTION__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentSection> getSections() {
		if (sections == null) {
			sections = new EObjectContainmentEList<DocumentSection>(DocumentSection.class, this, CorpusPackage.DOCUMENT_SECTION__SECTIONS);
		}
		return sections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentClause> getClauses() {
		if (clauses == null) {
			clauses = new EObjectContainmentEList<DocumentClause>(DocumentClause.class, this, CorpusPackage.DOCUMENT_SECTION__CLAUSES);
		}
		return clauses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusPackage.DOCUMENT_SECTION__SECTIONS:
				return ((InternalEList<?>)getSections()).basicRemove(otherEnd, msgs);
			case CorpusPackage.DOCUMENT_SECTION__CLAUSES:
				return ((InternalEList<?>)getClauses()).basicRemove(otherEnd, msgs);
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
			case CorpusPackage.DOCUMENT_SECTION__NUMBER:
				return getNumber();
			case CorpusPackage.DOCUMENT_SECTION__HEADING:
				return getHeading();
			case CorpusPackage.DOCUMENT_SECTION__TEXT:
				return getText();
			case CorpusPackage.DOCUMENT_SECTION__SECTIONS:
				return getSections();
			case CorpusPackage.DOCUMENT_SECTION__CLAUSES:
				return getClauses();
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
			case CorpusPackage.DOCUMENT_SECTION__NUMBER:
				setNumber((String)newValue);
				return;
			case CorpusPackage.DOCUMENT_SECTION__HEADING:
				setHeading((String)newValue);
				return;
			case CorpusPackage.DOCUMENT_SECTION__TEXT:
				setText((String)newValue);
				return;
			case CorpusPackage.DOCUMENT_SECTION__SECTIONS:
				getSections().clear();
				getSections().addAll((Collection<? extends DocumentSection>)newValue);
				return;
			case CorpusPackage.DOCUMENT_SECTION__CLAUSES:
				getClauses().clear();
				getClauses().addAll((Collection<? extends DocumentClause>)newValue);
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
			case CorpusPackage.DOCUMENT_SECTION__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case CorpusPackage.DOCUMENT_SECTION__HEADING:
				setHeading(HEADING_EDEFAULT);
				return;
			case CorpusPackage.DOCUMENT_SECTION__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case CorpusPackage.DOCUMENT_SECTION__SECTIONS:
				getSections().clear();
				return;
			case CorpusPackage.DOCUMENT_SECTION__CLAUSES:
				getClauses().clear();
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
			case CorpusPackage.DOCUMENT_SECTION__NUMBER:
				return NUMBER_EDEFAULT == null ? number != null : !NUMBER_EDEFAULT.equals(number);
			case CorpusPackage.DOCUMENT_SECTION__HEADING:
				return HEADING_EDEFAULT == null ? heading != null : !HEADING_EDEFAULT.equals(heading);
			case CorpusPackage.DOCUMENT_SECTION__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case CorpusPackage.DOCUMENT_SECTION__SECTIONS:
				return sections != null && !sections.isEmpty();
			case CorpusPackage.DOCUMENT_SECTION__CLAUSES:
				return clauses != null && !clauses.isEmpty();
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
		result.append(" (number: ");
		result.append(number);
		result.append(", heading: ");
		result.append(heading);
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //DocumentSectionImpl
