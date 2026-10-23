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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.fennec.model.compliance.corpus.ControlParameter;
import org.eclipse.fennec.model.compliance.corpus.CorpusPackage;
import org.eclipse.fennec.model.compliance.corpus.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl#getParameterId <em>Parameter Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl#getGuideline <em>Guideline</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.impl.ControlParameterImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlParameterImpl extends MinimalEObjectImpl.Container implements ControlParameter {
	/**
	 * The default value of the '{@link #getParameterId() <em>Parameter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterId() <em>Parameter Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterId()
	 * @generated
	 * @ordered
	 */
	protected String parameterId = PARAMETER_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<String> values;

	/**
	 * The default value of the '{@link #getGuideline() <em>Guideline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideline()
	 * @generated
	 * @ordered
	 */
	protected static final String GUIDELINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuideline() <em>Guideline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideline()
	 * @generated
	 * @ordered
	 */
	protected String guideline = GUIDELINE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ControlParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorpusPackage.Literals.CONTROL_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParameterId() {
		return parameterId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParameterId(String newParameterId) {
		String oldParameterId = parameterId;
		parameterId = newParameterId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CONTROL_PARAMETER__PARAMETER_ID, oldParameterId, parameterId));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CONTROL_PARAMETER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<String>(String.class, this, CorpusPackage.CONTROL_PARAMETER__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGuideline() {
		return guideline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGuideline(String newGuideline) {
		String oldGuideline = guideline;
		guideline = newGuideline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorpusPackage.CONTROL_PARAMETER__GUIDELINE, oldGuideline, guideline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, CorpusPackage.CONTROL_PARAMETER__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorpusPackage.CONTROL_PARAMETER__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case CorpusPackage.CONTROL_PARAMETER__PARAMETER_ID:
				return getParameterId();
			case CorpusPackage.CONTROL_PARAMETER__LABEL:
				return getLabel();
			case CorpusPackage.CONTROL_PARAMETER__VALUES:
				return getValues();
			case CorpusPackage.CONTROL_PARAMETER__GUIDELINE:
				return getGuideline();
			case CorpusPackage.CONTROL_PARAMETER__PROPERTIES:
				return getProperties();
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
			case CorpusPackage.CONTROL_PARAMETER__PARAMETER_ID:
				setParameterId((String)newValue);
				return;
			case CorpusPackage.CONTROL_PARAMETER__LABEL:
				setLabel((String)newValue);
				return;
			case CorpusPackage.CONTROL_PARAMETER__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends String>)newValue);
				return;
			case CorpusPackage.CONTROL_PARAMETER__GUIDELINE:
				setGuideline((String)newValue);
				return;
			case CorpusPackage.CONTROL_PARAMETER__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
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
			case CorpusPackage.CONTROL_PARAMETER__PARAMETER_ID:
				setParameterId(PARAMETER_ID_EDEFAULT);
				return;
			case CorpusPackage.CONTROL_PARAMETER__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case CorpusPackage.CONTROL_PARAMETER__VALUES:
				getValues().clear();
				return;
			case CorpusPackage.CONTROL_PARAMETER__GUIDELINE:
				setGuideline(GUIDELINE_EDEFAULT);
				return;
			case CorpusPackage.CONTROL_PARAMETER__PROPERTIES:
				getProperties().clear();
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
			case CorpusPackage.CONTROL_PARAMETER__PARAMETER_ID:
				return PARAMETER_ID_EDEFAULT == null ? parameterId != null : !PARAMETER_ID_EDEFAULT.equals(parameterId);
			case CorpusPackage.CONTROL_PARAMETER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case CorpusPackage.CONTROL_PARAMETER__VALUES:
				return values != null && !values.isEmpty();
			case CorpusPackage.CONTROL_PARAMETER__GUIDELINE:
				return GUIDELINE_EDEFAULT == null ? guideline != null : !GUIDELINE_EDEFAULT.equals(guideline);
			case CorpusPackage.CONTROL_PARAMETER__PROPERTIES:
				return properties != null && !properties.isEmpty();
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
		result.append(" (parameterId: ");
		result.append(parameterId);
		result.append(", label: ");
		result.append(label);
		result.append(", values: ");
		result.append(values);
		result.append(", guideline: ");
		result.append(guideline);
		result.append(')');
		return result.toString();
	}

} //ControlParameterImpl
