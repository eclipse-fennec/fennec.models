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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.gdprReport.CombinationFinding;
import org.eclipse.fennec.model.gdprReport.FeatureEvaluation;
import org.eclipse.fennec.model.gdprReport.Finding;
import org.eclipse.fennec.model.gdprReport.GDPRReportPackage;
import org.eclipse.fennec.model.gdprReport.RelevanceLevelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Evaluation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getUriFragment <em>Uri Fragment</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getTypeName <em>Type Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#isMany <em>Many</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getRelevanceLevel <em>Relevance Level</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getFindings <em>Findings</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getPartOfCombinations <em>Part Of Combinations</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.gdprReport.impl.FeatureEvaluationImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureEvaluationImpl extends MinimalEObjectImpl.Container implements FeatureEvaluation {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTypeName() <em>Type Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeName()
	 * @generated
	 * @ordered
	 */
	protected String typeName = TYPE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MANY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMany()
	 * @generated
	 * @ordered
	 */
	protected boolean many = MANY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected static final RelevanceLevelType RELEVANCE_LEVEL_EDEFAULT = RelevanceLevelType.NONE;

	/**
	 * The cached value of the '{@link #getRelevanceLevel() <em>Relevance Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelevanceLevel()
	 * @generated
	 * @ordered
	 */
	protected RelevanceLevelType relevanceLevel = RELEVANCE_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFindings() <em>Findings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindings()
	 * @generated
	 * @ordered
	 */
	protected EList<Finding> findings;

	/**
	 * The cached value of the '{@link #getPartOfCombinations() <em>Part Of Combinations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartOfCombinations()
	 * @generated
	 * @ordered
	 */
	protected EList<CombinationFinding> partOfCombinations;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureEvaluationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GDPRReportPackage.Literals.FEATURE_EVALUATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FEATURE_EVALUATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FEATURE_EVALUATION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FEATURE_EVALUATION__URI_FRAGMENT, oldUriFragment, uriFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTypeName() {
		return typeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTypeName(String newTypeName) {
		String oldTypeName = typeName;
		typeName = newTypeName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FEATURE_EVALUATION__TYPE_NAME, oldTypeName, typeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isMany() {
		return many;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMany(boolean newMany) {
		boolean oldMany = many;
		many = newMany;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FEATURE_EVALUATION__MANY, oldMany, many));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RelevanceLevelType getRelevanceLevel() {
		return relevanceLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelevanceLevel(RelevanceLevelType newRelevanceLevel) {
		RelevanceLevelType oldRelevanceLevel = relevanceLevel;
		relevanceLevel = newRelevanceLevel == null ? RELEVANCE_LEVEL_EDEFAULT : newRelevanceLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FEATURE_EVALUATION__RELEVANCE_LEVEL, oldRelevanceLevel, relevanceLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Finding> getFindings() {
		if (findings == null) {
			findings = new EObjectContainmentEList<Finding>(Finding.class, this, GDPRReportPackage.FEATURE_EVALUATION__FINDINGS);
		}
		return findings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CombinationFinding> getPartOfCombinations() {
		if (partOfCombinations == null) {
			partOfCombinations = new EObjectWithInverseResolvingEList.ManyInverse<CombinationFinding>(CombinationFinding.class, this, GDPRReportPackage.FEATURE_EVALUATION__PART_OF_COMBINATIONS, GDPRReportPackage.COMBINATION_FINDING__FEATURES);
		}
		return partOfCombinations;
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
			eNotify(new ENotificationImpl(this, Notification.SET, GDPRReportPackage.FEATURE_EVALUATION__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GDPRReportPackage.FEATURE_EVALUATION__PART_OF_COMBINATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPartOfCombinations()).basicAdd(otherEnd, msgs);
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
			case GDPRReportPackage.FEATURE_EVALUATION__FINDINGS:
				return ((InternalEList<?>)getFindings()).basicRemove(otherEnd, msgs);
			case GDPRReportPackage.FEATURE_EVALUATION__PART_OF_COMBINATIONS:
				return ((InternalEList<?>)getPartOfCombinations()).basicRemove(otherEnd, msgs);
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
			case GDPRReportPackage.FEATURE_EVALUATION__ID:
				return getId();
			case GDPRReportPackage.FEATURE_EVALUATION__NAME:
				return getName();
			case GDPRReportPackage.FEATURE_EVALUATION__URI_FRAGMENT:
				return getUriFragment();
			case GDPRReportPackage.FEATURE_EVALUATION__TYPE_NAME:
				return getTypeName();
			case GDPRReportPackage.FEATURE_EVALUATION__MANY:
				return isMany();
			case GDPRReportPackage.FEATURE_EVALUATION__RELEVANCE_LEVEL:
				return getRelevanceLevel();
			case GDPRReportPackage.FEATURE_EVALUATION__FINDINGS:
				return getFindings();
			case GDPRReportPackage.FEATURE_EVALUATION__PART_OF_COMBINATIONS:
				return getPartOfCombinations();
			case GDPRReportPackage.FEATURE_EVALUATION__PURPOSE:
				return getPurpose();
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
			case GDPRReportPackage.FEATURE_EVALUATION__ID:
				setId((String)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__NAME:
				setName((String)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__URI_FRAGMENT:
				setUriFragment((String)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__TYPE_NAME:
				setTypeName((String)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__MANY:
				setMany((Boolean)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__RELEVANCE_LEVEL:
				setRelevanceLevel((RelevanceLevelType)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__FINDINGS:
				getFindings().clear();
				getFindings().addAll((Collection<? extends Finding>)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__PART_OF_COMBINATIONS:
				getPartOfCombinations().clear();
				getPartOfCombinations().addAll((Collection<? extends CombinationFinding>)newValue);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__PURPOSE:
				setPurpose((String)newValue);
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
			case GDPRReportPackage.FEATURE_EVALUATION__ID:
				setId(ID_EDEFAULT);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__URI_FRAGMENT:
				setUriFragment(URI_FRAGMENT_EDEFAULT);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__TYPE_NAME:
				setTypeName(TYPE_NAME_EDEFAULT);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__MANY:
				setMany(MANY_EDEFAULT);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__RELEVANCE_LEVEL:
				setRelevanceLevel(RELEVANCE_LEVEL_EDEFAULT);
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__FINDINGS:
				getFindings().clear();
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__PART_OF_COMBINATIONS:
				getPartOfCombinations().clear();
				return;
			case GDPRReportPackage.FEATURE_EVALUATION__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
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
			case GDPRReportPackage.FEATURE_EVALUATION__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case GDPRReportPackage.FEATURE_EVALUATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GDPRReportPackage.FEATURE_EVALUATION__URI_FRAGMENT:
				return URI_FRAGMENT_EDEFAULT == null ? uriFragment != null : !URI_FRAGMENT_EDEFAULT.equals(uriFragment);
			case GDPRReportPackage.FEATURE_EVALUATION__TYPE_NAME:
				return TYPE_NAME_EDEFAULT == null ? typeName != null : !TYPE_NAME_EDEFAULT.equals(typeName);
			case GDPRReportPackage.FEATURE_EVALUATION__MANY:
				return many != MANY_EDEFAULT;
			case GDPRReportPackage.FEATURE_EVALUATION__RELEVANCE_LEVEL:
				return relevanceLevel != RELEVANCE_LEVEL_EDEFAULT;
			case GDPRReportPackage.FEATURE_EVALUATION__FINDINGS:
				return findings != null && !findings.isEmpty();
			case GDPRReportPackage.FEATURE_EVALUATION__PART_OF_COMBINATIONS:
				return partOfCombinations != null && !partOfCombinations.isEmpty();
			case GDPRReportPackage.FEATURE_EVALUATION__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
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
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", uriFragment: ");
		result.append(uriFragment);
		result.append(", typeName: ");
		result.append(typeName);
		result.append(", many: ");
		result.append(many);
		result.append(", relevanceLevel: ");
		result.append(relevanceLevel);
		result.append(", purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //FeatureEvaluationImpl
