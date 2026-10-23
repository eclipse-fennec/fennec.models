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
 * A representation of the literals of the enumeration '<em><b>Mapping Relationship</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How the source requirement relates to the target requirement, following the OSCAL mapping model and NIST IR 8477. Read as: source RELATIONSHIP target.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getMappingRelationship()
 * @model
 * @generated
 */
@ProviderType
public enum MappingRelationship implements Enumerator {
	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source and target require the same. Satisfying the source covers the target.
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT_VALUE
	 * @generated
	 * @ordered
	 */
	EQUIVALENT(0, "EQUIVALENT", "EQUIVALENT"),

	/**
	 * The '<em><b>SUBSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source requires less than the target. Satisfying the source covers the target at most partly.
	 * <!-- end-model-doc -->
	 * @see #SUBSET_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSET(1, "SUBSET", "SUBSET"),

	/**
	 * The '<em><b>SUPERSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source requires more than the target. Satisfying the source covers the target.
	 * <!-- end-model-doc -->
	 * @see #SUPERSET_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERSET(2, "SUPERSET", "SUPERSET"),

	/**
	 * The '<em><b>INTERSECTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source and target overlap. Satisfying the source covers the target at most partly.
	 * <!-- end-model-doc -->
	 * @see #INTERSECTS_VALUE
	 * @generated
	 * @ordered
	 */
	INTERSECTS(3, "INTERSECTS", "INTERSECTS"),

	/**
	 * The '<em><b>NO RELATIONSHIP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source and target are unrelated; recorded so the absence is explicit.
	 * <!-- end-model-doc -->
	 * @see #NO_RELATIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	NO_RELATIONSHIP(4, "NO_RELATIONSHIP", "NO_RELATIONSHIP");

	/**
	 * The '<em><b>EQUIVALENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source and target require the same. Satisfying the source covers the target.
	 * <!-- end-model-doc -->
	 * @see #EQUIVALENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EQUIVALENT_VALUE = 0;

	/**
	 * The '<em><b>SUBSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source requires less than the target. Satisfying the source covers the target at most partly.
	 * <!-- end-model-doc -->
	 * @see #SUBSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUBSET_VALUE = 1;

	/**
	 * The '<em><b>SUPERSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source requires more than the target. Satisfying the source covers the target.
	 * <!-- end-model-doc -->
	 * @see #SUPERSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPERSET_VALUE = 2;

	/**
	 * The '<em><b>INTERSECTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source and target overlap. Satisfying the source covers the target at most partly.
	 * <!-- end-model-doc -->
	 * @see #INTERSECTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INTERSECTS_VALUE = 3;

	/**
	 * The '<em><b>NO RELATIONSHIP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Source and target are unrelated; recorded so the absence is explicit.
	 * <!-- end-model-doc -->
	 * @see #NO_RELATIONSHIP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_RELATIONSHIP_VALUE = 4;

	/**
	 * An array of all the '<em><b>Mapping Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MappingRelationship[] VALUES_ARRAY =
		new MappingRelationship[] {
			EQUIVALENT,
			SUBSET,
			SUPERSET,
			INTERSECTS,
			NO_RELATIONSHIP,
		};

	/**
	 * A public read-only list of all the '<em><b>Mapping Relationship</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MappingRelationship> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Mapping Relationship</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MappingRelationship get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MappingRelationship result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mapping Relationship</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MappingRelationship getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MappingRelationship result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Mapping Relationship</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MappingRelationship get(int value) {
		switch (value) {
			case EQUIVALENT_VALUE: return EQUIVALENT;
			case SUBSET_VALUE: return SUBSET;
			case SUPERSET_VALUE: return SUPERSET;
			case INTERSECTS_VALUE: return INTERSECTS;
			case NO_RELATIONSHIP_VALUE: return NO_RELATIONSHIP;
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
	private MappingRelationship(int value, String name, String literal) {
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
	
} //MappingRelationship
