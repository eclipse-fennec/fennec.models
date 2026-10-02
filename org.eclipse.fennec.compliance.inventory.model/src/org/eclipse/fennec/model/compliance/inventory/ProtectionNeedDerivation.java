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
 * A representation of the literals of the enumeration '<em><b>Protection Need Derivation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How a protection need was determined.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getProtectionNeedDerivation()
 * @model
 * @generated
 */
@ProviderType
public enum ProtectionNeedDerivation implements Enumerator {
	/**
	 * The '<em><b>ASSESSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessed directly.
	 * <!-- end-model-doc -->
	 * @see #ASSESSED_VALUE
	 * @generated
	 * @ordered
	 */
	ASSESSED(0, "ASSESSED", "ASSESSED"),

	/**
	 * The '<em><b>MAXIMUM PRINCIPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inherited as the maximum of the assets it supports.
	 * <!-- end-model-doc -->
	 * @see #MAXIMUM_PRINCIPLE_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_PRINCIPLE(1, "MAXIMUM_PRINCIPLE", "MAXIMUM_PRINCIPLE"),

	/**
	 * The '<em><b>CUMULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Raised because many assets of lower need add up.
	 * <!-- end-model-doc -->
	 * @see #CUMULATION_VALUE
	 * @generated
	 * @ordered
	 */
	CUMULATION(2, "CUMULATION", "CUMULATION"),

	/**
	 * The '<em><b>DISTRIBUTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lowered because the load is distributed, e.g. redundancy.
	 * <!-- end-model-doc -->
	 * @see #DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION(3, "DISTRIBUTION", "DISTRIBUTION");

	/**
	 * The '<em><b>ASSESSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Assessed directly.
	 * <!-- end-model-doc -->
	 * @see #ASSESSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ASSESSED_VALUE = 0;

	/**
	 * The '<em><b>MAXIMUM PRINCIPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inherited as the maximum of the assets it supports.
	 * <!-- end-model-doc -->
	 * @see #MAXIMUM_PRINCIPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_PRINCIPLE_VALUE = 1;

	/**
	 * The '<em><b>CUMULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Raised because many assets of lower need add up.
	 * <!-- end-model-doc -->
	 * @see #CUMULATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUMULATION_VALUE = 2;

	/**
	 * The '<em><b>DISTRIBUTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lowered because the load is distributed, e.g. redundancy.
	 * <!-- end-model-doc -->
	 * @see #DISTRIBUTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_VALUE = 3;

	/**
	 * An array of all the '<em><b>Protection Need Derivation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProtectionNeedDerivation[] VALUES_ARRAY =
		new ProtectionNeedDerivation[] {
			ASSESSED,
			MAXIMUM_PRINCIPLE,
			CUMULATION,
			DISTRIBUTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Protection Need Derivation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProtectionNeedDerivation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Protection Need Derivation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionNeedDerivation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtectionNeedDerivation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protection Need Derivation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionNeedDerivation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProtectionNeedDerivation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Protection Need Derivation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProtectionNeedDerivation get(int value) {
		switch (value) {
			case ASSESSED_VALUE: return ASSESSED;
			case MAXIMUM_PRINCIPLE_VALUE: return MAXIMUM_PRINCIPLE;
			case CUMULATION_VALUE: return CUMULATION;
			case DISTRIBUTION_VALUE: return DISTRIBUTION;
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
	private ProtectionNeedDerivation(int value, String name, String literal) {
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
	
} //ProtectionNeedDerivation
