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
package org.eclipse.fennec.model.units;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dimension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An SI dimension as the exponents of the seven base quantities, e.g. Pressure = length^-1 mass^1 time^-2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.units.Dimension#getLength <em>Length</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.Dimension#getMass <em>Mass</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.Dimension#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.Dimension#getElectricCurrent <em>Electric Current</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.Dimension#getThermodynamicTemperature <em>Thermodynamic Temperature</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.Dimension#getAmountOfSubstance <em>Amount Of Substance</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.Dimension#getLuminousIntensity <em>Luminous Intensity</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension()
 * @model
 * @generated
 */
@ProviderType
public interface Dimension extends EObject {
	/**
	 * Returns the value of the '<em><b>Length</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent of length (L).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Length</em>' attribute.
	 * @see #setLength(int)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension_Length()
	 * @model default="0"
	 * @generated
	 */
	int getLength();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.Dimension#getLength <em>Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Length</em>' attribute.
	 * @see #getLength()
	 * @generated
	 */
	void setLength(int value);

	/**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent of mass (M).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see #setMass(int)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension_Mass()
	 * @model default="0"
	 * @generated
	 */
	int getMass();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.Dimension#getMass <em>Mass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mass</em>' attribute.
	 * @see #getMass()
	 * @generated
	 */
	void setMass(int value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent of time (T).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(int)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension_Time()
	 * @model default="0"
	 * @generated
	 */
	int getTime();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.Dimension#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(int value);

	/**
	 * Returns the value of the '<em><b>Electric Current</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent of electric current (I).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Electric Current</em>' attribute.
	 * @see #setElectricCurrent(int)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension_ElectricCurrent()
	 * @model default="0"
	 * @generated
	 */
	int getElectricCurrent();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.Dimension#getElectricCurrent <em>Electric Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Electric Current</em>' attribute.
	 * @see #getElectricCurrent()
	 * @generated
	 */
	void setElectricCurrent(int value);

	/**
	 * Returns the value of the '<em><b>Thermodynamic Temperature</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent of thermodynamic temperature (Θ).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thermodynamic Temperature</em>' attribute.
	 * @see #setThermodynamicTemperature(int)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension_ThermodynamicTemperature()
	 * @model default="0"
	 * @generated
	 */
	int getThermodynamicTemperature();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.Dimension#getThermodynamicTemperature <em>Thermodynamic Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thermodynamic Temperature</em>' attribute.
	 * @see #getThermodynamicTemperature()
	 * @generated
	 */
	void setThermodynamicTemperature(int value);

	/**
	 * Returns the value of the '<em><b>Amount Of Substance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent of amount of substance (N).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount Of Substance</em>' attribute.
	 * @see #setAmountOfSubstance(int)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension_AmountOfSubstance()
	 * @model default="0"
	 * @generated
	 */
	int getAmountOfSubstance();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.Dimension#getAmountOfSubstance <em>Amount Of Substance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Of Substance</em>' attribute.
	 * @see #getAmountOfSubstance()
	 * @generated
	 */
	void setAmountOfSubstance(int value);

	/**
	 * Returns the value of the '<em><b>Luminous Intensity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exponent of luminous intensity (J).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Luminous Intensity</em>' attribute.
	 * @see #setLuminousIntensity(int)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getDimension_LuminousIntensity()
	 * @model default="0"
	 * @generated
	 */
	int getLuminousIntensity();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.Dimension#getLuminousIntensity <em>Luminous Intensity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Luminous Intensity</em>' attribute.
	 * @see #getLuminousIntensity()
	 * @generated
	 */
	void setLuminousIntensity(int value);

} // Dimension
