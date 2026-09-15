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
package org.eclipse.fennec.model.gdprReport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Combination Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How the features in a CombinationFinding interact to create risk.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getCombinationKind()
 * @model
 * @generated
 */
@ProviderType
public enum CombinationKind implements Enumerator {
	/**
	 * The '<em><b>QUASI IDENTIFIER SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Together the features are likely to single out an individual, even though none identifies anyone alone, e.g. street plus house number plus date of birth.
	 * <!-- end-model-doc -->
	 * @see #QUASI_IDENTIFIER_SET_VALUE
	 * @generated
	 * @ordered
	 */
	QUASI_IDENTIFIER_SET(0, "QUASI_IDENTIFIER_SET", "QUASI_IDENTIFIER_SET"),

	/**
	 * The '<em><b>LINKAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features allow records to be joined to another dataset, re-identifying people indirectly.
	 * <!-- end-model-doc -->
	 * @see #LINKAGE_VALUE
	 * @generated
	 * @ordered
	 */
	LINKAGE(1, "LINKAGE", "LINKAGE"),

	/**
	 * The '<em><b>PROFILING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features together allow personal aspects to be evaluated or predicted, e.g. behaviour, reliability, movements or performance at work.
	 * <!-- end-model-doc -->
	 * @see #PROFILING_VALUE
	 * @generated
	 * @ordered
	 */
	PROFILING(2, "PROFILING", "PROFILING"),

	/**
	 * The '<em><b>SPECIAL CATEGORY INFERENCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features are innocuous individually but together permit a special category to be inferred, e.g. a diet code plus a clinic name implying religion or health.
	 * <!-- end-model-doc -->
	 * @see #SPECIAL_CATEGORY_INFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_CATEGORY_INFERENCE(3, "SPECIAL_CATEGORY_INFERENCE", "SPECIAL_CATEGORY_INFERENCE");

	/**
	 * The '<em><b>QUASI IDENTIFIER SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Together the features are likely to single out an individual, even though none identifies anyone alone, e.g. street plus house number plus date of birth.
	 * <!-- end-model-doc -->
	 * @see #QUASI_IDENTIFIER_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUASI_IDENTIFIER_SET_VALUE = 0;

	/**
	 * The '<em><b>LINKAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features allow records to be joined to another dataset, re-identifying people indirectly.
	 * <!-- end-model-doc -->
	 * @see #LINKAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINKAGE_VALUE = 1;

	/**
	 * The '<em><b>PROFILING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features together allow personal aspects to be evaluated or predicted, e.g. behaviour, reliability, movements or performance at work.
	 * <!-- end-model-doc -->
	 * @see #PROFILING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROFILING_VALUE = 2;

	/**
	 * The '<em><b>SPECIAL CATEGORY INFERENCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The features are innocuous individually but together permit a special category to be inferred, e.g. a diet code plus a clinic name implying religion or health.
	 * <!-- end-model-doc -->
	 * @see #SPECIAL_CATEGORY_INFERENCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_CATEGORY_INFERENCE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Combination Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CombinationKind[] VALUES_ARRAY =
		new CombinationKind[] {
			QUASI_IDENTIFIER_SET,
			LINKAGE,
			PROFILING,
			SPECIAL_CATEGORY_INFERENCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Combination Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CombinationKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Combination Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombinationKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CombinationKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Combination Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombinationKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CombinationKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Combination Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CombinationKind get(int value) {
		switch (value) {
			case QUASI_IDENTIFIER_SET_VALUE: return QUASI_IDENTIFIER_SET;
			case LINKAGE_VALUE: return LINKAGE;
			case PROFILING_VALUE: return PROFILING;
			case SPECIAL_CATEGORY_INFERENCE_VALUE: return SPECIAL_CATEGORY_INFERENCE;
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
	private CombinationKind(int value, String name, String literal) {
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
	
} //CombinationKind
