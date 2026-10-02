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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;
import org.eclipse.fennec.model.compliance.corpus.DocumentClause;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentClauseImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentClauseImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.DocumentClauseImpl#getObligation <em>Obligation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentClauseImpl extends CitableImpl implements DocumentClause {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

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
	 * The default value of the '{@link #getObligation() <em>Obligation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligation()
	 * @generated
	 * @ordered
	 */
	protected static final String OBLIGATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObligation() <em>Obligation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObligation()
	 * @generated
	 * @ordered
	 */
	protected String obligation = OBLIGATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusPackage.Literals.DOCUMENT_CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.DOCUMENT_CLAUSE__LABEL, oldLabel, label));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.DOCUMENT_CLAUSE__TEXT, oldText, text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObligation() {
		return obligation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObligation(String newObligation) {
		String oldObligation = obligation;
		obligation = newObligation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.DOCUMENT_CLAUSE__OBLIGATION, oldObligation, obligation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorpusPackage.DOCUMENT_CLAUSE__LABEL:
				return getLabel();
			case CorpusPackage.DOCUMENT_CLAUSE__TEXT:
				return getText();
			case CorpusPackage.DOCUMENT_CLAUSE__OBLIGATION:
				return getObligation();
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
			case CorpusPackage.DOCUMENT_CLAUSE__LABEL:
				setLabel((String)newValue);
				return;
			case CorpusPackage.DOCUMENT_CLAUSE__TEXT:
				setText((String)newValue);
				return;
			case CorpusPackage.DOCUMENT_CLAUSE__OBLIGATION:
				setObligation((String)newValue);
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
			case CorpusPackage.DOCUMENT_CLAUSE__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CorpusPackage.DOCUMENT_CLAUSE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case CorpusPackage.DOCUMENT_CLAUSE__OBLIGATION:
				setObligation(OBLIGATION_EDEFAULT);
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
			case CorpusPackage.DOCUMENT_CLAUSE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CorpusPackage.DOCUMENT_CLAUSE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case CorpusPackage.DOCUMENT_CLAUSE__OBLIGATION:
				return OBLIGATION_EDEFAULT == null ? obligation != null : !OBLIGATION_EDEFAULT.equals(obligation);
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
		result.append(" (label: ");
		result.append(label);
		result.append(", text: ");
		result.append(text);
		result.append(", obligation: ");
		result.append(obligation);
		result.append(')');
		return result.toString();
	}

} //DocumentClauseImpl
