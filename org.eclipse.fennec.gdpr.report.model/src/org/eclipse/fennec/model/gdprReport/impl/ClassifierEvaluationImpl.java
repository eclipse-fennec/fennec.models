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

import org.eclipse.fennec.model.gdprReport.ClassifierEvaluation;
import org.eclipse.fennec.model.gdprReport.FeatureEvaluation;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.ClassifierEvaluationImpl#getUriFragment <em>Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.ClassifierEvaluationImpl#getFeatureEvaluation <em>Feature Evaluation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassifierEvaluationImpl extends EvaluationImpl implements ClassifierEvaluation {
	/**
	 * The default value of the '{@link #getUriFragment() <em>Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriFragment()
	 * @generated
	 * @ordered
	 */
	protected static final String URI_FRAGMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUriFragment() <em>Uri Fragment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUriFragment()
	 * @generated
	 * @ordered
	 */
	protected String uriFragment = URI_FRAGMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeatureEvaluation() <em>Feature Evaluation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureEvaluation()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEvaluation> featureEvaluation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.CLASSIFIER_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUriFragment() {
		return uriFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUriFragment(String newUriFragment) {
		String oldUriFragment = uriFragment;
		uriFragment = newUriFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT, oldUriFragment, uriFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureEvaluation> getFeatureEvaluation() {
		if (featureEvaluation == null) {
			featureEvaluation = new EObjectContainmentEList<FeatureEvaluation>(FeatureEvaluation.class, this, GDPRReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATION);
		}
		return featureEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATION:
				return ((InternalEList<?>)getFeatureEvaluation()).basicRemove(otherEnd, msgs);
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
			case GDPRReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				return getUriFragment();
			case GDPRReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATION:
				return getFeatureEvaluation();
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
			case GDPRReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				setUriFragment((String)newValue);
				return;
			case GDPRReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATION:
				getFeatureEvaluation().clear();
				getFeatureEvaluation().addAll((Collection<? extends FeatureEvaluation>)newValue);
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
			case GDPRReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				setUriFragment(URI_FRAGMENT_EDEFAULT);
				return;
			case GDPRReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATION:
				getFeatureEvaluation().clear();
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
			case GDPRReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				return URI_FRAGMENT_EDEFAULT == null ? uriFragment != null : !URI_FRAGMENT_EDEFAULT.equals(uriFragment);
			case GDPRReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATION:
				return featureEvaluation != null && !featureEvaluation.isEmpty();
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
		result.append(" (uriFragment: ");
		result.append(uriFragment);
		result.append(')');
		return result.toString();
	}

} //ClassifierEvaluationImpl
