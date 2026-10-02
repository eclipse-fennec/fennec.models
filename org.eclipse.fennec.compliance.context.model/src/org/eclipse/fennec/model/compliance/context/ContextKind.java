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
package org.eclipse.fennec.model.compliance.context;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * What kind of regime a context represents.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getContextKind()
 * @model
 * @generated
 */
@ProviderType
public enum ContextKind implements Enumerator {
	/**
	 * The '<em><b>REGULATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binding law, e.g. GDPR, CRA, AI Act, KRITIS.
	 * <!-- end-model-doc -->
	 * @see #REGULATION_VALUE
	 * @generated
	 * @ordered
	 */
	REGULATION(0, "REGULATION", "REGULATION"),

	/**
	 * The '<em><b>STANDARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A standard or certification scheme, e.g. ISO/IEC 27001, BSI IT-Grundschutz.
	 * <!-- end-model-doc -->
	 * @see #STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD(1, "STANDARD", "STANDARD"),

	/**
	 * The '<em><b>TECHNICAL GUIDELINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A technical guideline, e.g. a BSI TR.
	 * <!-- end-model-doc -->
	 * @see #TECHNICAL_GUIDELINE_VALUE
	 * @generated
	 * @ordered
	 */
	TECHNICAL_GUIDELINE(2, "TECHNICAL_GUIDELINE", "TECHNICAL_GUIDELINE"),

	/**
	 * The '<em><b>MINIMUM STANDARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A minimum standard binding for an administration, e.g. under § 44 BSIG.
	 * <!-- end-model-doc -->
	 * @see #MINIMUM_STANDARD_VALUE
	 * @generated
	 * @ordered
	 */
	MINIMUM_STANDARD(3, "MINIMUM_STANDARD", "MINIMUM_STANDARD"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anything else.
	 * <!-- end-model-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(4, "OTHER", "OTHER");

	/**
	 * The '<em><b>REGULATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binding law, e.g. GDPR, CRA, AI Act, KRITIS.
	 * <!-- end-model-doc -->
	 * @see #REGULATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGULATION_VALUE = 0;

	/**
	 * The '<em><b>STANDARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A standard or certification scheme, e.g. ISO/IEC 27001, BSI IT-Grundschutz.
	 * <!-- end-model-doc -->
	 * @see #STANDARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_VALUE = 1;

	/**
	 * The '<em><b>TECHNICAL GUIDELINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A technical guideline, e.g. a BSI TR.
	 * <!-- end-model-doc -->
	 * @see #TECHNICAL_GUIDELINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TECHNICAL_GUIDELINE_VALUE = 2;

	/**
	 * The '<em><b>MINIMUM STANDARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A minimum standard binding for an administration, e.g. under § 44 BSIG.
	 * <!-- end-model-doc -->
	 * @see #MINIMUM_STANDARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MINIMUM_STANDARD_VALUE = 3;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anything else.
	 * <!-- end-model-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 4;

	/**
	 * An array of all the '<em><b>Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContextKind[] VALUES_ARRAY =
		new ContextKind[] {
			REGULATION,
			STANDARD,
			TECHNICAL_GUIDELINE,
			MINIMUM_STANDARD,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContextKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContextKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContextKind get(int value) {
		switch (value) {
			case REGULATION_VALUE: return REGULATION;
			case STANDARD_VALUE: return STANDARD;
			case TECHNICAL_GUIDELINE_VALUE: return TECHNICAL_GUIDELINE;
			case MINIMUM_STANDARD_VALUE: return MINIMUM_STANDARD;
			case OTHER_VALUE: return OTHER;
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
	private ContextKind(int value, String name, String literal) {
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
	
} //ContextKind
