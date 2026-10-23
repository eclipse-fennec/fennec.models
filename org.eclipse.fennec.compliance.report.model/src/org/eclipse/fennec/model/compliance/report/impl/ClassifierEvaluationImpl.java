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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.context.CategoryRef;

import org.eclipse.fennec.model.compliance.report.ClassifierEvaluation;
import org.eclipse.fennec.model.compliance.report.FeatureEvaluation;
import org.eclipse.fennec.model.compliance.report.ReportPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classifier Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.ClassifierEvaluationImpl#getUriFragment <em>Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.ClassifierEvaluationImpl#getFeatureEvaluations <em>Feature Evaluations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.ClassifierEvaluationImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.report.impl.ClassifierEvaluationImpl#getLawfulBases <em>Lawful Bases</em>}</li>
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
	 * The cached value of the '{@link #getFeatureEvaluations() <em>Feature Evaluations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureEvaluations()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureEvaluation> featureEvaluations;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLawfulBases() <em>Lawful Bases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLawfulBases()
	 * @generated
	 * @ordered
	 */
	protected EList<CategoryRef> lawfulBases;

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
		return ReportPackage.Literals.CLASSIFIER_EVALUATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT, oldUriFragment, uriFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FeatureEvaluation> getFeatureEvaluations() {
		if (featureEvaluations == null) {
			featureEvaluations = new EObjectContainmentEList<FeatureEvaluation>(FeatureEvaluation.class, this, ReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATIONS);
		}
		return featureEvaluations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReportPackage.CLASSIFIER_EVALUATION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CategoryRef> getLawfulBases() {
		if (lawfulBases == null) {
			lawfulBases = new EObjectContainmentEList<CategoryRef>(CategoryRef.class, this, ReportPackage.CLASSIFIER_EVALUATION__LAWFUL_BASES);
		}
		return lawfulBases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATIONS:
				return ((InternalEList<?>)getFeatureEvaluations()).basicRemove(otherEnd, msgs);
			case ReportPackage.CLASSIFIER_EVALUATION__LAWFUL_BASES:
				return ((InternalEList<?>)getLawfulBases()).basicRemove(otherEnd, msgs);
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
			case ReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				return getUriFragment();
			case ReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATIONS:
				return getFeatureEvaluations();
			case ReportPackage.CLASSIFIER_EVALUATION__PURPOSE:
				return getPurpose();
			case ReportPackage.CLASSIFIER_EVALUATION__LAWFUL_BASES:
				return getLawfulBases();
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
			case ReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				setUriFragment((String)newValue);
				return;
			case ReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATIONS:
				getFeatureEvaluations().clear();
				getFeatureEvaluations().addAll((Collection<? extends FeatureEvaluation>)newValue);
				return;
			case ReportPackage.CLASSIFIER_EVALUATION__PURPOSE:
				setPurpose((String)newValue);
				return;
			case ReportPackage.CLASSIFIER_EVALUATION__LAWFUL_BASES:
				getLawfulBases().clear();
				getLawfulBases().addAll((Collection<? extends CategoryRef>)newValue);
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
			case ReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				setUriFragment(URI_FRAGMENT_EDEFAULT);
				return;
			case ReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATIONS:
				getFeatureEvaluations().clear();
				return;
			case ReportPackage.CLASSIFIER_EVALUATION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
				return;
			case ReportPackage.CLASSIFIER_EVALUATION__LAWFUL_BASES:
				getLawfulBases().clear();
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
			case ReportPackage.CLASSIFIER_EVALUATION__URI_FRAGMENT:
				return URI_FRAGMENT_EDEFAULT == null ? uriFragment != null : !URI_FRAGMENT_EDEFAULT.equals(uriFragment);
			case ReportPackage.CLASSIFIER_EVALUATION__FEATURE_EVALUATIONS:
				return featureEvaluations != null && !featureEvaluations.isEmpty();
			case ReportPackage.CLASSIFIER_EVALUATION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
			case ReportPackage.CLASSIFIER_EVALUATION__LAWFUL_BASES:
				return lawfulBases != null && !lawfulBases.isEmpty();
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
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //ClassifierEvaluationImpl
