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
 * A representation of the literals of the enumeration '<em><b>Gdpr Report Origin</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * What formed the judgements a report carries. It is not provenance trivia: a finding weighs differently depending on whether a person, an agent or a program arrived at it, and a report that cannot say which cannot be weighed at all.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getGdprReportOrigin()
 * @model
 * @generated
 */
@ProviderType
public enum GdprReportOrigin implements Enumerator {
	/**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"),

	/**
	 * The '<em><b>AI AGENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AI_AGENT_VALUE
	 * @generated
	 * @ordered
	 */
	AI_AGENT(1, "AI_AGENT", "AI_AGENT"),

	/**
	 * The '<em><b>HUMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HUMAN_VALUE
	 * @generated
	 * @ordered
	 */
	HUMAN(2, "HUMAN", "HUMAN"),

	/**
	 * The '<em><b>STATIC ANALYSIS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived by a program from artefacts that were already reviewed - no agent and no person formed the judgement. A static analysis quotes no law of its own: its evidence is carried over from the review it rests on, so a finding here is only ever as good as that review.
	 * <!-- end-model-doc -->
	 * @see #STATIC_ANALYSIS_VALUE
	 * @generated
	 * @ordered
	 */
	STATIC_ANALYSIS(3, "STATIC_ANALYSIS", "STATIC_ANALYSIS");

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * @see #HUMAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HUMAN_VALUE = 2;

	/**
	 * The '<em><b>STATIC ANALYSIS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Derived by a program from artefacts that were already reviewed - no agent and no person formed the judgement. A static analysis quotes no law of its own: its evidence is carried over from the review it rests on, so a finding here is only ever as good as that review.
	 * <!-- end-model-doc -->
	 * @see #STATIC_ANALYSIS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATIC_ANALYSIS_VALUE = 3;

	/**
	 * An array of all the '<em><b>Gdpr Report Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GdprReportOrigin[] VALUES_ARRAY =
		new GdprReportOrigin[] {
			UNKNOWN,
			AI_AGENT,
			HUMAN,
			STATIC_ANALYSIS,
		};

	/**
	 * A public read-only list of all the '<em><b>Gdpr Report Origin</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GdprReportOrigin> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Gdpr Report Origin</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GdprReportOrigin get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GdprReportOrigin result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gdpr Report Origin</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GdprReportOrigin getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GdprReportOrigin result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Gdpr Report Origin</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GdprReportOrigin get(int value) {
		switch (value) {
			case UNKNOWN_VALUE: return UNKNOWN;
			case AI_AGENT_VALUE: return AI_AGENT;
			case HUMAN_VALUE: return HUMAN;
			case STATIC_ANALYSIS_VALUE: return STATIC_ANALYSIS;
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
	private GdprReportOrigin(int value, String name, String literal) {
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
	
} //GdprReportOrigin
