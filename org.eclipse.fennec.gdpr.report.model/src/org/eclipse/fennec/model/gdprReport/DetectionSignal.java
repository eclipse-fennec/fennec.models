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
 * A representation of the literals of the enumeration '<em><b>Detection Signal</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * What in the model led to a finding. Recording it lets a reviewer weigh the finding without repeating the analysis.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getDetectionSignal()
 * @model
 * @generated
 */
@ProviderType
public enum DetectionSignal implements Enumerator {
	/**
	 * The '<em><b>FEATURE NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature's own name, e.g. email, religion, ipAddress.
	 * <!-- end-model-doc -->
	 * @see #FEATURE_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_NAME(0, "FEATURE_NAME", "FEATURE_NAME"),

	/**
	 * The '<em><b>FEATURE TYPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature's type, e.g. a date on a birth field or a byte array under a face field.
	 * <!-- end-model-doc -->
	 * @see #FEATURE_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_TYPE(1, "FEATURE_TYPE", "FEATURE_TYPE"),

	/**
	 * The '<em><b>MULTIPLICITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature is repeated, so values accumulate into a history or profile.
	 * <!-- end-model-doc -->
	 * @see #MULTIPLICITY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY(2, "MULTIPLICITY", "MULTIPLICITY"),

	/**
	 * The '<em><b>ENUM LITERALS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The literals of an EEnum reveal the content regardless of the feature's name. Often decisive where the name is deliberately bland; put the literals in signalValues.
	 * <!-- end-model-doc -->
	 * @see #ENUM_LITERALS_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_LITERALS(3, "ENUM_LITERALS", "ENUM_LITERALS"),

	/**
	 * The '<em><b>OWNING CLASSIFIER NAME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owning classifier gives the feature its meaning: name on Company is not personal data, name on Patient is.
	 * <!-- end-model-doc -->
	 * @see #OWNING_CLASSIFIER_NAME_VALUE
	 * @generated
	 * @ordered
	 */
	OWNING_CLASSIFIER_NAME(4, "OWNING_CLASSIFIER_NAME", "OWNING_CLASSIFIER_NAME"),

	/**
	 * The '<em><b>DOCUMENTATION ANNOTATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A documentation or genmodel annotation states a purpose the names do not reveal. Quote the phrase in signalValues.
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION_ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	DOCUMENTATION_ANNOTATION(5, "DOCUMENTATION_ANNOTATION", "DOCUMENTATION_ANNOTATION"),

	/**
	 * The '<em><b>CONTAINMENT CONTEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the feature sits in the containment hierarchy, e.g. contained by a class that is itself sensitive.
	 * <!-- end-model-doc -->
	 * @see #CONTAINMENT_CONTEXT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINMENT_CONTEXT(6, "CONTAINMENT_CONTEXT", "CONTAINMENT_CONTEXT"),

	/**
	 * The '<em><b>FEATURE COMBINATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The finding arises from several features together rather than any one of them. Expect this on a CombinationFinding.
	 * <!-- end-model-doc -->
	 * @see #FEATURE_COMBINATION_VALUE
	 * @generated
	 * @ordered
	 */
	FEATURE_COMBINATION(7, "FEATURE_COMBINATION", "FEATURE_COMBINATION"),

	/**
	 * The '<em><b>TRANSFORMATION FLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The finding arises from what a transformation does with the feature rather than from the feature itself: the compiled unit was read, and the value was followed to where it is written. Expect this on a FlowEvaluation.
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMATION_FLOW_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFORMATION_FLOW(8, "TRANSFORMATION_FLOW", "TRANSFORMATION_FLOW");

	/**
	 * The '<em><b>FEATURE NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature's own name, e.g. email, religion, ipAddress.
	 * <!-- end-model-doc -->
	 * @see #FEATURE_NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_NAME_VALUE = 0;

	/**
	 * The '<em><b>FEATURE TYPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature's type, e.g. a date on a birth field or a byte array under a face field.
	 * <!-- end-model-doc -->
	 * @see #FEATURE_TYPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_TYPE_VALUE = 1;

	/**
	 * The '<em><b>MULTIPLICITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature is repeated, so values accumulate into a history or profile.
	 * <!-- end-model-doc -->
	 * @see #MULTIPLICITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_VALUE = 2;

	/**
	 * The '<em><b>ENUM LITERALS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The literals of an EEnum reveal the content regardless of the feature's name. Often decisive where the name is deliberately bland; put the literals in signalValues.
	 * <!-- end-model-doc -->
	 * @see #ENUM_LITERALS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_LITERALS_VALUE = 3;

	/**
	 * The '<em><b>OWNING CLASSIFIER NAME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The owning classifier gives the feature its meaning: name on Company is not personal data, name on Patient is.
	 * <!-- end-model-doc -->
	 * @see #OWNING_CLASSIFIER_NAME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OWNING_CLASSIFIER_NAME_VALUE = 4;

	/**
	 * The '<em><b>DOCUMENTATION ANNOTATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A documentation or genmodel annotation states a purpose the names do not reveal. Quote the phrase in signalValues.
	 * <!-- end-model-doc -->
	 * @see #DOCUMENTATION_ANNOTATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCUMENTATION_ANNOTATION_VALUE = 5;

	/**
	 * The '<em><b>CONTAINMENT CONTEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the feature sits in the containment hierarchy, e.g. contained by a class that is itself sensitive.
	 * <!-- end-model-doc -->
	 * @see #CONTAINMENT_CONTEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINMENT_CONTEXT_VALUE = 6;

	/**
	 * The '<em><b>FEATURE COMBINATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The finding arises from several features together rather than any one of them. Expect this on a CombinationFinding.
	 * <!-- end-model-doc -->
	 * @see #FEATURE_COMBINATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FEATURE_COMBINATION_VALUE = 7;

	/**
	 * The '<em><b>TRANSFORMATION FLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The finding arises from what a transformation does with the feature rather than from the feature itself: the compiled unit was read, and the value was followed to where it is written. Expect this on a FlowEvaluation.
	 * <!-- end-model-doc -->
	 * @see #TRANSFORMATION_FLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFORMATION_FLOW_VALUE = 8;

	/**
	 * An array of all the '<em><b>Detection Signal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DetectionSignal[] VALUES_ARRAY =
		new DetectionSignal[] {
			FEATURE_NAME,
			FEATURE_TYPE,
			MULTIPLICITY,
			ENUM_LITERALS,
			OWNING_CLASSIFIER_NAME,
			DOCUMENTATION_ANNOTATION,
			CONTAINMENT_CONTEXT,
			FEATURE_COMBINATION,
			TRANSFORMATION_FLOW,
		};

	/**
	 * A public read-only list of all the '<em><b>Detection Signal</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DetectionSignal> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Detection Signal</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DetectionSignal get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DetectionSignal result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Detection Signal</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DetectionSignal getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DetectionSignal result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Detection Signal</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DetectionSignal get(int value) {
		switch (value) {
			case FEATURE_NAME_VALUE: return FEATURE_NAME;
			case FEATURE_TYPE_VALUE: return FEATURE_TYPE;
			case MULTIPLICITY_VALUE: return MULTIPLICITY;
			case ENUM_LITERALS_VALUE: return ENUM_LITERALS;
			case OWNING_CLASSIFIER_NAME_VALUE: return OWNING_CLASSIFIER_NAME;
			case DOCUMENTATION_ANNOTATION_VALUE: return DOCUMENTATION_ANNOTATION;
			case CONTAINMENT_CONTEXT_VALUE: return CONTAINMENT_CONTEXT;
			case FEATURE_COMBINATION_VALUE: return FEATURE_COMBINATION;
			case TRANSFORMATION_FLOW_VALUE: return TRANSFORMATION_FLOW;
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
	private DetectionSignal(int value, String name, String literal) {
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
	
} //DetectionSignal
