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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdpr.Footnote;
import org.eclipse.fennec.model.gdpr.GDPRPackage;
import org.eclipse.fennec.model.gdpr.LegalUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl#getSourceRef <em>Source Ref</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.LegalUnitImpl#getFootnotes <em>Footnotes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class LegalUnitImpl extends CitableImpl implements LegalUnit {
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
	 * The default value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected String modifiedBy = MODIFIED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFootnotes() <em>Footnotes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFootnotes()
	 * @generated
	 * @ordered
	 */
	protected EList<Footnote> footnotes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRPackage.Literals.LEGAL_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.LEGAL_UNIT__TEXT, oldText, text));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.LEGAL_UNIT__SOURCE_REF, oldSourceRef, sourceRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setModifiedBy(String newModifiedBy) {
		String oldModifiedBy = modifiedBy;
		modifiedBy = newModifiedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.LEGAL_UNIT__MODIFIED_BY, oldModifiedBy, modifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Footnote> getFootnotes() {
		if (footnotes == null) {
			footnotes = new EObjectContainmentEList<Footnote>(Footnote.class, this, GDPRPackage.LEGAL_UNIT__FOOTNOTES);
		}
		return footnotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRPackage.LEGAL_UNIT__FOOTNOTES:
				return ((InternalEList<?>)getFootnotes()).basicRemove(otherEnd, msgs);
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
			case GDPRPackage.LEGAL_UNIT__TEXT:
				return getText();
			case GDPRPackage.LEGAL_UNIT__SOURCE_REF:
				return getSourceRef();
			case GDPRPackage.LEGAL_UNIT__MODIFIED_BY:
				return getModifiedBy();
			case GDPRPackage.LEGAL_UNIT__FOOTNOTES:
				return getFootnotes();
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
			case GDPRPackage.LEGAL_UNIT__TEXT:
				setText((String)newValue);
				return;
			case GDPRPackage.LEGAL_UNIT__SOURCE_REF:
				setSourceRef((String)newValue);
				return;
			case GDPRPackage.LEGAL_UNIT__MODIFIED_BY:
				setModifiedBy((String)newValue);
				return;
			case GDPRPackage.LEGAL_UNIT__FOOTNOTES:
				getFootnotes().clear();
				getFootnotes().addAll((Collection<? extends Footnote>)newValue);
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
			case GDPRPackage.LEGAL_UNIT__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case GDPRPackage.LEGAL_UNIT__SOURCE_REF:
				setSourceRef(SOURCE_REF_EDEFAULT);
				return;
			case GDPRPackage.LEGAL_UNIT__MODIFIED_BY:
				setModifiedBy(MODIFIED_BY_EDEFAULT);
				return;
			case GDPRPackage.LEGAL_UNIT__FOOTNOTES:
				getFootnotes().clear();
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
			case GDPRPackage.LEGAL_UNIT__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case GDPRPackage.LEGAL_UNIT__SOURCE_REF:
				return SOURCE_REF_EDEFAULT == null ? sourceRef != null : !SOURCE_REF_EDEFAULT.equals(sourceRef);
			case GDPRPackage.LEGAL_UNIT__MODIFIED_BY:
				return MODIFIED_BY_EDEFAULT == null ? modifiedBy != null : !MODIFIED_BY_EDEFAULT.equals(modifiedBy);
			case GDPRPackage.LEGAL_UNIT__FOOTNOTES:
				return footnotes != null && !footnotes.isEmpty();
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
		result.append(" (text: ");
		result.append(text);
		result.append(", sourceRef: ");
		result.append(sourceRef);
		result.append(", modifiedBy: ");
		result.append(modifiedBy);
		result.append(')');
		return result.toString();
	}

} //LegalUnitImpl
