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
 * A representation of the literals of the enumeration '<em><b>Change Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How something differs from the preceding revision.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage#getChangeKind()
 * @model
 * @generated
 */
@ProviderType
public enum ChangeKind implements Enumerator {
	/**
	 * The '<em><b>UNCHANGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identical to the preceding revision, or there is no preceding revision.
	 * <!-- end-model-doc -->
	 * @see #UNCHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	UNCHANGED(0, "UNCHANGED", "UNCHANGED"),

	/**
	 * The '<em><b>ADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not present in the preceding revision.
	 * <!-- end-model-doc -->
	 * @see #ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	ADDED(1, "ADDED", "ADDED"),

	/**
	 * The '<em><b>MODIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Present before with at least one differing field.
	 * <!-- end-model-doc -->
	 * @see #MODIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIED(2, "MODIFIED", "MODIFIED"),

	/**
	 * The '<em><b>REMOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Present in the preceding revision and gone in this one.
	 * <!-- end-model-doc -->
	 * @see #REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	REMOVED(3, "REMOVED", "REMOVED");

	/**
	 * The '<em><b>UNCHANGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identical to the preceding revision, or there is no preceding revision.
	 * <!-- end-model-doc -->
	 * @see #UNCHANGED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNCHANGED_VALUE = 0;

	/**
	 * The '<em><b>ADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Not present in the preceding revision.
	 * <!-- end-model-doc -->
	 * @see #ADDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADDED_VALUE = 1;

	/**
	 * The '<em><b>MODIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Present before with at least one differing field.
	 * <!-- end-model-doc -->
	 * @see #MODIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIED_VALUE = 2;

	/**
	 * The '<em><b>REMOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Present in the preceding revision and gone in this one.
	 * <!-- end-model-doc -->
	 * @see #REMOVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REMOVED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Change Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeKind[] VALUES_ARRAY =
		new ChangeKind[] {
			UNCHANGED,
			ADDED,
			MODIFIED,
			REMOVED,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChangeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ChangeKind get(int value) {
		switch (value) {
			case UNCHANGED_VALUE: return UNCHANGED;
			case ADDED_VALUE: return ADDED;
			case MODIFIED_VALUE: return MODIFIED;
			case REMOVED_VALUE: return REMOVED;
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
	private ChangeKind(int value, String name, String literal) {
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
	
} //ChangeKind
