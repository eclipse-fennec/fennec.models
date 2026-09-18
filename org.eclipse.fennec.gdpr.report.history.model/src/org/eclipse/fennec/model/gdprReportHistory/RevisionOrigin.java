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
package org.eclipse.fennec.model.gdprReportHistory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Revision Origin</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Where a revision came from. A vocabulary this model owns, unlike the categories copied from the report.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getRevisionOrigin()
 * @model
 * @generated
 */
@ProviderType
public enum RevisionOrigin implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stored report did not say. Recorded rather than guessed: attributing a verdict to the wrong author is worse than admitting the record is incomplete.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>AI AGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Produced by a GDPR review run.
	 * <!-- end-model-doc -->
	 * @see #AI_AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	AI_AGENT(1, "AI_AGENT", "AI_AGENT"),

	/**
	 * The '<em><b>HUMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person corrected an earlier revision.
	 * <!-- end-model-doc -->
	 * @see #HUMAN_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN(2, "HUMAN", "HUMAN");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The stored report did not say. Recorded rather than guessed: attributing a verdict to the wrong author is worse than admitting the record is incomplete.
	 * <!-- end-model-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>AI AGENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Produced by a GDPR review run.
	 * <!-- end-model-doc -->
	 * @see #AI_AGENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AI_AGENT_VALUE = 1;

	/**
	 * The '<em><b>HUMAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A person corrected an earlier revision.
	 * <!-- end-model-doc -->
	 * @see #HUMAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Revision Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RevisionOrigin[] VALUES_ARRAY =
		new RevisionOrigin[] {
			UNKNOWN,
			AI_AGENT,
			HUMAN,
		};

	/**
	 * A public read-only list of all the '<em><b>Revision Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RevisionOrigin> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Revision Origin</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RevisionOrigin get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RevisionOrigin result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Revision Origin</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RevisionOrigin getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RevisionOrigin result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Revision Origin</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RevisionOrigin get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case AI_AGENT_VALUE: return AI_AGENT;
			case HUMAN_VALUE: return HUMAN;
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
	private RevisionOrigin(int value, String name, String literal) {
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
	
} //RevisionOrigin
