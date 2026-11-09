/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.units.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.fennec.model.units.Dimension;
import org.eclipse.fennec.model.units.UnitsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.units.impl.DimensionImpl#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.impl.DimensionImpl#getMass <em>Mass</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.impl.DimensionImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.impl.DimensionImpl#getElectricCurrent <em>Electric Current</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.impl.DimensionImpl#getThermodynamicTemperature <em>Thermodynamic Temperature</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.impl.DimensionImpl#getAmountOfSubstance <em>Amount Of Substance</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.impl.DimensionImpl#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DimensionImpl extends MinimalEObjectImpl.Container implements Dimension {
	/**
	 * The default value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected static final int LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLength() <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLength()
	 * @generated
	 * @ordered
	 */
	protected int length = LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected static final int MASS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMass() <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMass()
	 * @generated
	 * @ordered
	 */
	protected int mass = MASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final int TIME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected int time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getElectricCurrent() <em>Electric Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final int ELECTRIC_CURRENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getElectricCurrent() <em>Electric Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElectricCurrent()
	 * @generated
	 * @ordered
	 */
	protected int electricCurrent = ELECTRIC_CURRENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getThermodynamicTemperature() <em>Thermodynamic Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final int THERMODYNAMIC_TEMPERATURE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getThermodynamicTemperature() <em>Thermodynamic Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThermodynamicTemperature()
	 * @generated
	 * @ordered
	 */
	protected int thermodynamicTemperature = THERMODYNAMIC_TEMPERATURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAmountOfSubstance() <em>Amount Of Substance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstance()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_OF_SUBSTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmountOfSubstance() <em>Amount Of Substance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfSubstance()
	 * @generated
	 * @ordered
	 */
	protected int amountOfSubstance = AMOUNT_OF_SUBSTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLuminousIntensity() <em>Luminous Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensity()
	 * @generated
	 * @ordered
	 */
	protected static final int LUMINOUS_INTENSITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLuminousIntensity() <em>Luminous Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLuminousIntensity()
	 * @generated
	 * @ordered
	 */
	protected int luminousIntensity = LUMINOUS_INTENSITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DimensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UnitsPackage.Literals.DIMENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLength() {
		return length;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLength(int newLength) {
		int oldLength = length;
		length = newLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.DIMENSION__LENGTH, oldLength, length));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMass() {
		return mass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMass(int newMass) {
		int oldMass = mass;
		mass = newMass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.DIMENSION__MASS, oldMass, mass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTime(int newTime) {
		int oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.DIMENSION__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getElectricCurrent() {
		return electricCurrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElectricCurrent(int newElectricCurrent) {
		int oldElectricCurrent = electricCurrent;
		electricCurrent = newElectricCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.DIMENSION__ELECTRIC_CURRENT, oldElectricCurrent, electricCurrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getThermodynamicTemperature() {
		return thermodynamicTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setThermodynamicTemperature(int newThermodynamicTemperature) {
		int oldThermodynamicTemperature = thermodynamicTemperature;
		thermodynamicTemperature = newThermodynamicTemperature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.DIMENSION__THERMODYNAMIC_TEMPERATURE, oldThermodynamicTemperature, thermodynamicTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAmountOfSubstance() {
		return amountOfSubstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmountOfSubstance(int newAmountOfSubstance) {
		int oldAmountOfSubstance = amountOfSubstance;
		amountOfSubstance = newAmountOfSubstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.DIMENSION__AMOUNT_OF_SUBSTANCE, oldAmountOfSubstance, amountOfSubstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getLuminousIntensity() {
		return luminousIntensity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLuminousIntensity(int newLuminousIntensity) {
		int oldLuminousIntensity = luminousIntensity;
		luminousIntensity = newLuminousIntensity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UnitsPackage.DIMENSION__LUMINOUS_INTENSITY, oldLuminousIntensity, luminousIntensity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UnitsPackage.DIMENSION__LENGTH:
				return getLength();
			case UnitsPackage.DIMENSION__MASS:
				return getMass();
			case UnitsPackage.DIMENSION__TIME:
				return getTime();
			case UnitsPackage.DIMENSION__ELECTRIC_CURRENT:
				return getElectricCurrent();
			case UnitsPackage.DIMENSION__THERMODYNAMIC_TEMPERATURE:
				return getThermodynamicTemperature();
			case UnitsPackage.DIMENSION__AMOUNT_OF_SUBSTANCE:
				return getAmountOfSubstance();
			case UnitsPackage.DIMENSION__LUMINOUS_INTENSITY:
				return getLuminousIntensity();
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
			case UnitsPackage.DIMENSION__LENGTH:
				setLength((Integer)newValue);
				return;
			case UnitsPackage.DIMENSION__MASS:
				setMass((Integer)newValue);
				return;
			case UnitsPackage.DIMENSION__TIME:
				setTime((Integer)newValue);
				return;
			case UnitsPackage.DIMENSION__ELECTRIC_CURRENT:
				setElectricCurrent((Integer)newValue);
				return;
			case UnitsPackage.DIMENSION__THERMODYNAMIC_TEMPERATURE:
				setThermodynamicTemperature((Integer)newValue);
				return;
			case UnitsPackage.DIMENSION__AMOUNT_OF_SUBSTANCE:
				setAmountOfSubstance((Integer)newValue);
				return;
			case UnitsPackage.DIMENSION__LUMINOUS_INTENSITY:
				setLuminousIntensity((Integer)newValue);
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
			case UnitsPackage.DIMENSION__LENGTH:
				setLength(LENGTH_EDEFAULT);
				return;
			case UnitsPackage.DIMENSION__MASS:
				setMass(MASS_EDEFAULT);
				return;
			case UnitsPackage.DIMENSION__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case UnitsPackage.DIMENSION__ELECTRIC_CURRENT:
				setElectricCurrent(ELECTRIC_CURRENT_EDEFAULT);
				return;
			case UnitsPackage.DIMENSION__THERMODYNAMIC_TEMPERATURE:
				setThermodynamicTemperature(THERMODYNAMIC_TEMPERATURE_EDEFAULT);
				return;
			case UnitsPackage.DIMENSION__AMOUNT_OF_SUBSTANCE:
				setAmountOfSubstance(AMOUNT_OF_SUBSTANCE_EDEFAULT);
				return;
			case UnitsPackage.DIMENSION__LUMINOUS_INTENSITY:
				setLuminousIntensity(LUMINOUS_INTENSITY_EDEFAULT);
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
			case UnitsPackage.DIMENSION__LENGTH:
				return length != LENGTH_EDEFAULT;
			case UnitsPackage.DIMENSION__MASS:
				return mass != MASS_EDEFAULT;
			case UnitsPackage.DIMENSION__TIME:
				return time != TIME_EDEFAULT;
			case UnitsPackage.DIMENSION__ELECTRIC_CURRENT:
				return electricCurrent != ELECTRIC_CURRENT_EDEFAULT;
			case UnitsPackage.DIMENSION__THERMODYNAMIC_TEMPERATURE:
				return thermodynamicTemperature != THERMODYNAMIC_TEMPERATURE_EDEFAULT;
			case UnitsPackage.DIMENSION__AMOUNT_OF_SUBSTANCE:
				return amountOfSubstance != AMOUNT_OF_SUBSTANCE_EDEFAULT;
			case UnitsPackage.DIMENSION__LUMINOUS_INTENSITY:
				return luminousIntensity != LUMINOUS_INTENSITY_EDEFAULT;
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
		result.append(" (length: ");
		result.append(length);
		result.append(", mass: ");
		result.append(mass);
		result.append(", time: ");
		result.append(time);
		result.append(", electricCurrent: ");
		result.append(electricCurrent);
		result.append(", thermodynamicTemperature: ");
		result.append(thermodynamicTemperature);
		result.append(", amountOfSubstance: ");
		result.append(amountOfSubstance);
		result.append(", luminousIntensity: ");
		result.append(luminousIntensity);
		result.append(')');
		return result.toString();
	}

} //DimensionImpl
