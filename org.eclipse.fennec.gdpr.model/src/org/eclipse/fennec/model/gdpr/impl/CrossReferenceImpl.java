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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.gdpr.Citable;
import org.eclipse.fennec.model.gdpr.CrossReference;
import org.eclipse.fennec.model.gdpr.GDPRPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cross Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#getRawText <em>Raw Text</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#getTargetCitationId <em>Target Citation Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#isResolved <em>Resolved</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#isRelative <em>Relative</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#isExternal <em>External</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdpr.impl.CrossReferenceImpl#getInstrument <em>Instrument</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CrossReferenceImpl extends MinimalEObjectImpl.Container implements CrossReference {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Citable source;

	/**
	 * The default value of the '{@link #getRawText() <em>Raw Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawText()
	 * @generated
	 * @ordered
	 */
	protected static final String RAW_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRawText() <em>Raw Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawText()
	 * @generated
	 * @ordered
	 */
	protected String rawText = RAW_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetCitationId() <em>Target Citation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCitationId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_CITATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetCitationId() <em>Target Citation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCitationId()
	 * @generated
	 * @ordered
	 */
	protected String targetCitationId = TARGET_CITATION_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Citable target;

	/**
	 * The default value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolved() <em>Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean resolved = RESOLVED_EDEFAULT;

	/**
	 * The default value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RELATIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRelative() <em>Relative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRelative()
	 * @generated
	 * @ordered
	 */
	protected boolean relative = RELATIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExternal() <em>External</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExternal()
	 * @generated
	 * @ordered
	 */
	protected boolean external = EXTERNAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTRUMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstrument() <em>Instrument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstrument()
	 * @generated
	 * @ordered
	 */
	protected String instrument = INSTRUMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CrossReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRPackage.Literals.CROSS_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citable getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Citable newSource, NotificationChain msgs) {
		Citable oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__SOURCE, oldSource, newSource);
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
	public void setSource(Citable newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, GDPRPackage.CITABLE__CITES, Citable.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, GDPRPackage.CITABLE__CITES, Citable.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRawText() {
		return rawText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRawText(String newRawText) {
		String oldRawText = rawText;
		rawText = newRawText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__RAW_TEXT, oldRawText, rawText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetCitationId() {
		return targetCitationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetCitationId(String newTargetCitationId) {
		String oldTargetCitationId = targetCitationId;
		targetCitationId = newTargetCitationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__TARGET_CITATION_ID, oldTargetCitationId, targetCitationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citable getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Citable newTarget, NotificationChain msgs) {
		Citable oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__TARGET, oldTarget, newTarget);
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
	public void setTarget(Citable newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, GDPRPackage.CITABLE__CITED_BY, Citable.class, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, GDPRPackage.CITABLE__CITED_BY, Citable.class, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isResolved() {
		return resolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResolved(boolean newResolved) {
		boolean oldResolved = resolved;
		resolved = newResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__RESOLVED, oldResolved, resolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRelative() {
		return relative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelative(boolean newRelative) {
		boolean oldRelative = relative;
		relative = newRelative;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__RELATIVE, oldRelative, relative));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isExternal() {
		return external;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternal(boolean newExternal) {
		boolean oldExternal = external;
		external = newExternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__EXTERNAL, oldExternal, external));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInstrument() {
		return instrument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstrument(String newInstrument) {
		String oldInstrument = instrument;
		instrument = newInstrument;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRPackage.CROSS_REFERENCE__INSTRUMENT, oldInstrument, instrument));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRPackage.CROSS_REFERENCE__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, GDPRPackage.CITABLE__CITES, Citable.class, msgs);
				return basicSetSource((Citable)otherEnd, msgs);
			case GDPRPackage.CROSS_REFERENCE__TARGET:
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GDPRPackage.CITABLE__CITED_BY, Citable.class, msgs);
				return basicSetTarget((Citable)otherEnd, msgs);
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
			case GDPRPackage.CROSS_REFERENCE__SOURCE:
				return basicSetSource(null, msgs);
			case GDPRPackage.CROSS_REFERENCE__TARGET:
				return basicSetTarget(null, msgs);
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
			case GDPRPackage.CROSS_REFERENCE__SOURCE:
				return getSource();
			case GDPRPackage.CROSS_REFERENCE__RAW_TEXT:
				return getRawText();
			case GDPRPackage.CROSS_REFERENCE__TARGET_CITATION_ID:
				return getTargetCitationId();
			case GDPRPackage.CROSS_REFERENCE__TARGET:
				return getTarget();
			case GDPRPackage.CROSS_REFERENCE__RESOLVED:
				return isResolved();
			case GDPRPackage.CROSS_REFERENCE__RELATIVE:
				return isRelative();
			case GDPRPackage.CROSS_REFERENCE__EXTERNAL:
				return isExternal();
			case GDPRPackage.CROSS_REFERENCE__INSTRUMENT:
				return getInstrument();
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
			case GDPRPackage.CROSS_REFERENCE__SOURCE:
				setSource((Citable)newValue);
				return;
			case GDPRPackage.CROSS_REFERENCE__RAW_TEXT:
				setRawText((String)newValue);
				return;
			case GDPRPackage.CROSS_REFERENCE__TARGET_CITATION_ID:
				setTargetCitationId((String)newValue);
				return;
			case GDPRPackage.CROSS_REFERENCE__TARGET:
				setTarget((Citable)newValue);
				return;
			case GDPRPackage.CROSS_REFERENCE__RESOLVED:
				setResolved((Boolean)newValue);
				return;
			case GDPRPackage.CROSS_REFERENCE__RELATIVE:
				setRelative((Boolean)newValue);
				return;
			case GDPRPackage.CROSS_REFERENCE__EXTERNAL:
				setExternal((Boolean)newValue);
				return;
			case GDPRPackage.CROSS_REFERENCE__INSTRUMENT:
				setInstrument((String)newValue);
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
			case GDPRPackage.CROSS_REFERENCE__SOURCE:
				setSource((Citable)null);
				return;
			case GDPRPackage.CROSS_REFERENCE__RAW_TEXT:
				setRawText(RAW_TEXT_EDEFAULT);
				return;
			case GDPRPackage.CROSS_REFERENCE__TARGET_CITATION_ID:
				setTargetCitationId(TARGET_CITATION_ID_EDEFAULT);
				return;
			case GDPRPackage.CROSS_REFERENCE__TARGET:
				setTarget((Citable)null);
				return;
			case GDPRPackage.CROSS_REFERENCE__RESOLVED:
				setResolved(RESOLVED_EDEFAULT);
				return;
			case GDPRPackage.CROSS_REFERENCE__RELATIVE:
				setRelative(RELATIVE_EDEFAULT);
				return;
			case GDPRPackage.CROSS_REFERENCE__EXTERNAL:
				setExternal(EXTERNAL_EDEFAULT);
				return;
			case GDPRPackage.CROSS_REFERENCE__INSTRUMENT:
				setInstrument(INSTRUMENT_EDEFAULT);
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
			case GDPRPackage.CROSS_REFERENCE__SOURCE:
				return source != null;
			case GDPRPackage.CROSS_REFERENCE__RAW_TEXT:
				return RAW_TEXT_EDEFAULT == null ? rawText != null : !RAW_TEXT_EDEFAULT.equals(rawText);
			case GDPRPackage.CROSS_REFERENCE__TARGET_CITATION_ID:
				return TARGET_CITATION_ID_EDEFAULT == null ? targetCitationId != null : !TARGET_CITATION_ID_EDEFAULT.equals(targetCitationId);
			case GDPRPackage.CROSS_REFERENCE__TARGET:
				return target != null;
			case GDPRPackage.CROSS_REFERENCE__RESOLVED:
				return resolved != RESOLVED_EDEFAULT;
			case GDPRPackage.CROSS_REFERENCE__RELATIVE:
				return relative != RELATIVE_EDEFAULT;
			case GDPRPackage.CROSS_REFERENCE__EXTERNAL:
				return external != EXTERNAL_EDEFAULT;
			case GDPRPackage.CROSS_REFERENCE__INSTRUMENT:
				return INSTRUMENT_EDEFAULT == null ? instrument != null : !INSTRUMENT_EDEFAULT.equals(instrument);
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
		result.append(" (rawText: ");
		result.append(rawText);
		result.append(", targetCitationId: ");
		result.append(targetCitationId);
		result.append(", resolved: ");
		result.append(resolved);
		result.append(", relative: ");
		result.append(relative);
		result.append(", external: ");
		result.append(external);
		result.append(", instrument: ");
		result.append(instrument);
		result.append(')');
		return result.toString();
	}

} //CrossReferenceImpl
