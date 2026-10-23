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
package org.eclipse.fennec.model.compliance.report;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Control Result</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Result of checking one requirement.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getControlResult()
 * @model
 * @generated
 */
@ProviderType
public enum ControlResult implements Enumerator {
	/**
	 * The '<em><b>NOT ASSESSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not checked yet.
	 * <!-- end-model-doc -->
	 * @see #NOT_ASSESSED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_ASSESSED(0, "NOT_ASSESSED", "NOT_ASSESSED"),

	/**
	 * The '<em><b>SATISFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Satisfied.
	 * <!-- end-model-doc -->
	 * @see #SATISFIED_VALUE
	 * @generated
	 * @ordered
	 */
	SATISFIED(1, "SATISFIED", "SATISFIED"),

	/**
	 * The '<em><b>PARTIALLY SATISFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partly satisfied.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_SATISFIED_VALUE
	 * @generated
	 * @ordered
	 */
	PARTIALLY_SATISFIED(2, "PARTIALLY_SATISFIED", "PARTIALLY_SATISFIED"),

	/**
	 * The '<em><b>NOT SATISFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not satisfied.
	 * <!-- end-model-doc -->
	 * @see #NOT_SATISFIED_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SATISFIED(3, "NOT_SATISFIED", "NOT_SATISFIED"),

	/**
	 * The '<em><b>NOT APPLICABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does not apply to the subject.
	 * <!-- end-model-doc -->
	 * @see #NOT_APPLICABLE_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_APPLICABLE(4, "NOT_APPLICABLE", "NOT_APPLICABLE");

	/**
	 * The '<em><b>NOT ASSESSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not checked yet.
	 * <!-- end-model-doc -->
	 * @see #NOT_ASSESSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_ASSESSED_VALUE = 0;

	/**
	 * The '<em><b>SATISFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Satisfied.
	 * <!-- end-model-doc -->
	 * @see #SATISFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SATISFIED_VALUE = 1;

	/**
	 * The '<em><b>PARTIALLY SATISFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Partly satisfied.
	 * <!-- end-model-doc -->
	 * @see #PARTIALLY_SATISFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PARTIALLY_SATISFIED_VALUE = 2;

	/**
	 * The '<em><b>NOT SATISFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not satisfied.
	 * <!-- end-model-doc -->
	 * @see #NOT_SATISFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SATISFIED_VALUE = 3;

	/**
	 * The '<em><b>NOT APPLICABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does not apply to the subject.
	 * <!-- end-model-doc -->
	 * @see #NOT_APPLICABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_APPLICABLE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Control Result</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ControlResult[] VALUES_ARRAY =
		new ControlResult[] {
			NOT_ASSESSED,
			SATISFIED,
			PARTIALLY_SATISFIED,
			NOT_SATISFIED,
			NOT_APPLICABLE,
		};

	/**
	 * A public read-only list of all the '<em><b>Control Result</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ControlResult> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Control Result</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlResult get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlResult result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Result</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlResult getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ControlResult result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Control Result</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ControlResult get(int value) {
		switch (value) {
			case NOT_ASSESSED_VALUE: return NOT_ASSESSED;
			case SATISFIED_VALUE: return SATISFIED;
			case PARTIALLY_SATISFIED_VALUE: return PARTIALLY_SATISFIED;
			case NOT_SATISFIED_VALUE: return NOT_SATISFIED;
			case NOT_APPLICABLE_VALUE: return NOT_APPLICABLE;
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
	private ControlResult(int value, String name, String literal) {
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
	
} //ControlResult
