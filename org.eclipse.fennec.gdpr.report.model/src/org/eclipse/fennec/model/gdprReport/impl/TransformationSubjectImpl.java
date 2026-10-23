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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.PackageSubject;
import org.eclipse.fennec.model.gdprReport.TransformationSubject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation Subject</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.TransformationSubjectImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.TransformationSubjectImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.TransformationSubjectImpl#getSourceFingerprint <em>Source Fingerprint</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.TransformationSubjectImpl#getSourcePackages <em>Source Packages</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.TransformationSubjectImpl#getTargetPackages <em>Target Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformationSubjectImpl extends SubjectImpl implements TransformationSubject {
	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected String qualifiedName = QUALIFIED_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getSourceFingerprint() <em>Source Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFingerprint()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_FINGERPRINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceFingerprint() <em>Source Fingerprint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFingerprint()
	 * @generated
	 * @ordered
	 */
	protected String sourceFingerprint = SOURCE_FINGERPRINT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourcePackages() <em>Source Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageSubject> sourcePackages;

	/**
	 * The cached value of the '{@link #getTargetPackages() <em>Target Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageSubject> targetPackages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationSubjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.TRANSFORMATION_SUBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getQualifiedName() {
		return qualifiedName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQualifiedName(String newQualifiedName) {
		String oldQualifiedName = qualifiedName;
		qualifiedName = newQualifiedName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.TRANSFORMATION_SUBJECT__QUALIFIED_NAME, oldQualifiedName, qualifiedName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.TRANSFORMATION_SUBJECT__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSourceFingerprint() {
		return sourceFingerprint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceFingerprint(String newSourceFingerprint) {
		String oldSourceFingerprint = sourceFingerprint;
		sourceFingerprint = newSourceFingerprint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_FINGERPRINT, oldSourceFingerprint, sourceFingerprint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageSubject> getSourcePackages() {
		if (sourcePackages == null) {
			sourcePackages = new EObjectContainmentEList<PackageSubject>(PackageSubject.class, this, GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_PACKAGES);
		}
		return sourcePackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PackageSubject> getTargetPackages() {
		if (targetPackages == null) {
			targetPackages = new EObjectContainmentEList<PackageSubject>(PackageSubject.class, this, GDPRReportPackage.TRANSFORMATION_SUBJECT__TARGET_PACKAGES);
		}
		return targetPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_PACKAGES:
				return ((InternalEList<?>)getSourcePackages()).basicRemove(otherEnd, msgs);
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__TARGET_PACKAGES:
				return ((InternalEList<?>)getTargetPackages()).basicRemove(otherEnd, msgs);
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
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__QUALIFIED_NAME:
				return getQualifiedName();
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__LANGUAGE:
				return getLanguage();
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_FINGERPRINT:
				return getSourceFingerprint();
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_PACKAGES:
				return getSourcePackages();
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__TARGET_PACKAGES:
				return getTargetPackages();
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
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_FINGERPRINT:
				setSourceFingerprint((String)newValue);
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_PACKAGES:
				getSourcePackages().clear();
				getSourcePackages().addAll((Collection<? extends PackageSubject>)newValue);
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__TARGET_PACKAGES:
				getTargetPackages().clear();
				getTargetPackages().addAll((Collection<? extends PackageSubject>)newValue);
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
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_FINGERPRINT:
				setSourceFingerprint(SOURCE_FINGERPRINT_EDEFAULT);
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_PACKAGES:
				getSourcePackages().clear();
				return;
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__TARGET_PACKAGES:
				getTargetPackages().clear();
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
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? qualifiedName != null : !QUALIFIED_NAME_EDEFAULT.equals(qualifiedName);
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_FINGERPRINT:
				return SOURCE_FINGERPRINT_EDEFAULT == null ? sourceFingerprint != null : !SOURCE_FINGERPRINT_EDEFAULT.equals(sourceFingerprint);
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__SOURCE_PACKAGES:
				return sourcePackages != null && !sourcePackages.isEmpty();
			case GDPRReportPackage.TRANSFORMATION_SUBJECT__TARGET_PACKAGES:
				return targetPackages != null && !targetPackages.isEmpty();
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
		result.append(" (qualifiedName: ");
		result.append(qualifiedName);
		result.append(", language: ");
		result.append(language);
		result.append(", sourceFingerprint: ");
		result.append(sourceFingerprint);
		result.append(')');
		return result.toString();
	}

} //TransformationSubjectImpl
