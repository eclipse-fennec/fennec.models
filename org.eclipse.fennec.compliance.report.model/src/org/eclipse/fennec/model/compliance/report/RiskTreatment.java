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
 * A representation of the literals of the enumeration '<em><b>Risk Treatment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Risk treatment options of ISO 27005 / ISO 31000.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.report.ReportPackage#getRiskTreatment()
 * @model
 * @generated
 */
@ProviderType
public enum RiskTreatment implements Enumerator {
	/**
	 * The '<em><b>ACCEPT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk is accepted.
	 * <!-- end-model-doc -->
	 * @see #ACCEPT_VALUE
	 * @generated
	 * @ordered
	 */
	ACCEPT(0, "ACCEPT", "ACCEPT"),

	/**
	 * The '<em><b>MITIGATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk is reduced by measures or a change of the subject.
	 * <!-- end-model-doc -->
	 * @see #MITIGATE_VALUE
	 * @generated
	 * @ordered
	 */
	MITIGATE(1, "MITIGATE", "MITIGATE"),

	/**
	 * The '<em><b>AVOID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cause is removed, e.g. the processing or the field is dropped.
	 * <!-- end-model-doc -->
	 * @see #AVOID_VALUE
	 * @generated
	 * @ordered
	 */
	AVOID(2, "AVOID", "AVOID"),

	/**
	 * The '<em><b>TRANSFER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Someone else bears or decides the risk.
	 * <!-- end-model-doc -->
	 * @see #TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER(3, "TRANSFER", "TRANSFER");

	/**
	 * The '<em><b>ACCEPT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk is accepted.
	 * <!-- end-model-doc -->
	 * @see #ACCEPT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCEPT_VALUE = 0;

	/**
	 * The '<em><b>MITIGATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The risk is reduced by measures or a change of the subject.
	 * <!-- end-model-doc -->
	 * @see #MITIGATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MITIGATE_VALUE = 1;

	/**
	 * The '<em><b>AVOID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The cause is removed, e.g. the processing or the field is dropped.
	 * <!-- end-model-doc -->
	 * @see #AVOID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AVOID_VALUE = 2;

	/**
	 * The '<em><b>TRANSFER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Someone else bears or decides the risk.
	 * <!-- end-model-doc -->
	 * @see #TRANSFER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Risk Treatment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RiskTreatment[] VALUES_ARRAY =
		new RiskTreatment[] {
			ACCEPT,
			MITIGATE,
			AVOID,
			TRANSFER,
		};

	/**
	 * A public read-only list of all the '<em><b>Risk Treatment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RiskTreatment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Risk Treatment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskTreatment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskTreatment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Treatment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskTreatment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RiskTreatment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Risk Treatment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RiskTreatment get(int value) {
		switch (value) {
			case ACCEPT_VALUE: return ACCEPT;
			case MITIGATE_VALUE: return MITIGATE;
			case AVOID_VALUE: return AVOID;
			case TRANSFER_VALUE: return TRANSFER;
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
	private RiskTreatment(int value, String name, String literal) {
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
	
} //RiskTreatment
