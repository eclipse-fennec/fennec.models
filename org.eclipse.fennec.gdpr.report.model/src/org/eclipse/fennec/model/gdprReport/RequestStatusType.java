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
 * A representation of the literals of the enumeration '<em><b>Request Status Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How a review request ended, or that it has not. Only SUBMITTED is not terminal.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getRequestStatusType()
 * @model
 * @generated
 */
@ProviderType
public enum RequestStatusType implements Enumerator {
	/**
	 * The '<em><b>SUBMITTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accepted and being carried out. A second request for the same model revision must not be made while a record is in this state.
	 * <!-- end-model-doc -->
	 * @see #SUBMITTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMITTED(0, "SUBMITTED", "SUBMITTED"),

	/**
	 * The '<em><b>COMPLETED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The review finished and its report was stored. reportId names it.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETED(1, "COMPLETED", "COMPLETED"),

	/**
	 * The '<em><b>FAILED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The review did not finish. message says why. Nothing is retried automatically: a review costs money, and a model that fails for a structural reason would otherwise be re-tried on every trigger.
	 * <!-- end-model-doc -->
	 * @see #FAILED_VALUE
	 * @generated
	 * @ordered
	 */
	FAILED(2, "FAILED", "FAILED"),

	/**
	 * The '<em><b>EXHAUSTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The run was still unfinished after the allowed number of continuations and was given up on. Whatever it had recorded was never sealed, so there is no report; raising the ceiling or reviewing a smaller model is the way forward.
	 * <!-- end-model-doc -->
	 * @see #EXHAUSTED_VALUE
	 * @generated
	 * @ordered
	 */
	EXHAUSTED(3, "EXHAUSTED", "EXHAUSTED");

	/**
	 * The '<em><b>SUBMITTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Accepted and being carried out. A second request for the same model revision must not be made while a record is in this state.
	 * <!-- end-model-doc -->
	 * @see #SUBMITTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBMITTED_VALUE = 0;

	/**
	 * The '<em><b>COMPLETED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The review finished and its report was stored. reportId names it.
	 * <!-- end-model-doc -->
	 * @see #COMPLETED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETED_VALUE = 1;

	/**
	 * The '<em><b>FAILED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The review did not finish. message says why. Nothing is retried automatically: a review costs money, and a model that fails for a structural reason would otherwise be re-tried on every trigger.
	 * <!-- end-model-doc -->
	 * @see #FAILED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FAILED_VALUE = 2;

	/**
	 * The '<em><b>EXHAUSTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The run was still unfinished after the allowed number of continuations and was given up on. Whatever it had recorded was never sealed, so there is no report; raising the ceiling or reviewing a smaller model is the way forward.
	 * <!-- end-model-doc -->
	 * @see #EXHAUSTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXHAUSTED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Request Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequestStatusType[] VALUES_ARRAY =
		new RequestStatusType[] {
			SUBMITTED,
			COMPLETED,
			FAILED,
			EXHAUSTED,
		};

	/**
	 * A public read-only list of all the '<em><b>Request Status Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequestStatusType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Request Status Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestStatusType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestStatusType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Status Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestStatusType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestStatusType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Status Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RequestStatusType get(int value) {
		switch (value) {
			case SUBMITTED_VALUE: return SUBMITTED;
			case COMPLETED_VALUE: return COMPLETED;
			case FAILED_VALUE: return FAILED;
			case EXHAUSTED_VALUE: return EXHAUSTED;
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
	private RequestStatusType(int value, String name, String literal) {
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
	
} //RequestStatusType
