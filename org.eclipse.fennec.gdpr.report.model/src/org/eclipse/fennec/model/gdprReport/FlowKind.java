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
 * A representation of the literals of the enumeration '<em><b>Flow Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How a transformation moves a value from a source feature to a target feature. Choose the most specific value the compiled unit supports.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getFlowKind()
 * @model
 * @generated
 */
@ProviderType
public enum FlowKind implements Enumerator {
	/**
	 * The '<em><b>DIRECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source feature is assigned to the target feature unchanged. The target holds the same data and inherits the source's classification.
	 * <!-- end-model-doc -->
	 * @see #DIRECT_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT(0, "DIRECT", "DIRECT"),

	/**
	 * The '<em><b>EXPRESSION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is computed from the source feature, but from that feature alone, e.g. trimmed, cased or reformatted. Still the same data unless the expression is shown to remove the link to the person.
	 * <!-- end-model-doc -->
	 * @see #EXPRESSION_VALUE
	 * @generated
	 * @ordered
	 */
	EXPRESSION(1, "EXPRESSION", "EXPRESSION"),

	/**
	 * The '<em><b>CONCATENATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is joined with others into one string. The target field can no longer be classified, minimised or erased per source field, which is usually the point of the finding rather than a detail of it.
	 * <!-- end-model-doc -->
	 * @see #CONCATENATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONCATENATION(2, "CONCATENATION", "CONCATENATION"),

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is folded over a collection, e.g. counted, summed or joined across many objects. The result may say less about one person - or more, if the fold is a profile.
	 * <!-- end-model-doc -->
	 * @see #AGGREGATION_VALUE
	 * @generated
	 * @ordered
	 */
	AGGREGATION(3, "AGGREGATION", "AGGREGATION"),

	/**
	 * The '<em><b>OPAQUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value passes through something the analyser does not follow: a blackbox operation, an imported library, a late resolution or an intermediate property. Record the flow as opaque rather than dropping it - silence would be read as 'nothing happens here'.
	 * <!-- end-model-doc -->
	 * @see #OPAQUE_VALUE
	 * @generated
	 * @ordered
	 */
	OPAQUE(4, "OPAQUE", "OPAQUE");

	/**
	 * The '<em><b>DIRECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source feature is assigned to the target feature unchanged. The target holds the same data and inherits the source's classification.
	 * <!-- end-model-doc -->
	 * @see #DIRECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_VALUE = 0;

	/**
	 * The '<em><b>EXPRESSION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is computed from the source feature, but from that feature alone, e.g. trimmed, cased or reformatted. Still the same data unless the expression is shown to remove the link to the person.
	 * <!-- end-model-doc -->
	 * @see #EXPRESSION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXPRESSION_VALUE = 1;

	/**
	 * The '<em><b>CONCATENATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is joined with others into one string. The target field can no longer be classified, minimised or erased per source field, which is usually the point of the finding rather than a detail of it.
	 * <!-- end-model-doc -->
	 * @see #CONCATENATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONCATENATION_VALUE = 2;

	/**
	 * The '<em><b>AGGREGATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value is folded over a collection, e.g. counted, summed or joined across many objects. The result may say less about one person - or more, if the fold is a profile.
	 * <!-- end-model-doc -->
	 * @see #AGGREGATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGGREGATION_VALUE = 3;

	/**
	 * The '<em><b>OPAQUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value passes through something the analyser does not follow: a blackbox operation, an imported library, a late resolution or an intermediate property. Record the flow as opaque rather than dropping it - silence would be read as 'nothing happens here'.
	 * <!-- end-model-doc -->
	 * @see #OPAQUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPAQUE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Flow Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FlowKind[] VALUES_ARRAY =
		new FlowKind[] {
			DIRECT,
			EXPRESSION,
			CONCATENATION,
			AGGREGATION,
			OPAQUE,
		};

	/**
	 * A public read-only list of all the '<em><b>Flow Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FlowKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Flow Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlowKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flow Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FlowKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Flow Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FlowKind get(int value) {
		switch (value) {
			case DIRECT_VALUE: return DIRECT;
			case EXPRESSION_VALUE: return EXPRESSION;
			case CONCATENATION_VALUE: return CONCATENATION;
			case AGGREGATION_VALUE: return AGGREGATION;
			case OPAQUE_VALUE: return OPAQUE;
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
	private FlowKind(int value, String name, String literal) {
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
	
} //FlowKind
