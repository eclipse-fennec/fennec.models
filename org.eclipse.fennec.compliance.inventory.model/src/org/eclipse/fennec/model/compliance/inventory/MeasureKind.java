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
package org.eclipse.fennec.model.compliance.inventory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Measure Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Kind of measure.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getMeasureKind()
 * @model
 * @generated
 */
@ProviderType
public enum MeasureKind implements Enumerator {
	/**
	 * The '<em><b>TECHNICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technical measure.
	 * <!-- end-model-doc -->
	 * @see #TECHNICAL_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL(0, "TECHNICAL", "TECHNICAL"),

	/**
	 * The '<em><b>ORGANISATIONAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organisational measure.
	 * <!-- end-model-doc -->
	 * @see #ORGANISATIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	ORGANISATIONAL(1, "ORGANISATIONAL", "ORGANISATIONAL");

	/**
	 * The '<em><b>TECHNICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technical measure.
	 * <!-- end-model-doc -->
	 * @see #TECHNICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_VALUE = 0;

	/**
	 * The '<em><b>ORGANISATIONAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organisational measure.
	 * <!-- end-model-doc -->
	 * @see #ORGANISATIONAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ORGANISATIONAL_VALUE = 1;

	/**
	 * An array of all the '<em><b>Measure Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasureKind[] VALUES_ARRAY =
		new MeasureKind[] {
			TECHNICAL,
			ORGANISATIONAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Measure Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasureKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measure Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasureKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measure Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MeasureKind get(int value) {
		switch (value) {
			case TECHNICAL_VALUE: return TECHNICAL;
			case ORGANISATIONAL_VALUE: return ORGANISATIONAL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MeasureKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MeasureKind
