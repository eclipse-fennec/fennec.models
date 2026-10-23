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
package org.eclipse.fennec.model.compliance.inventory;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Retention Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * What happens to the data when the retention period ends.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionAction()
 * @model
 * @generated
 */
@ProviderType
public enum RetentionAction implements Enumerator {
	/**
	 * The '<em><b>DELETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is deleted (Art. 17).
	 * <!-- end-model-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(0, "DELETE", "DELETE"),

	/**
	 * The '<em><b>ANONYMISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is anonymised, so it is no longer personal data.
	 * <!-- end-model-doc -->
	 * @see #ANONYMISE_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMISE(1, "ANONYMISE", "ANONYMISE"),

	/**
	 * The '<em><b>PSEUDONYMISE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is pseudonymised (Art. 4(5)).
	 * <!-- end-model-doc -->
	 * @see #PSEUDONYMISE_VALUE
	 * @generated
	 * @ordered
	 */
	PSEUDONYMISE(2, "PSEUDONYMISE", "PSEUDONYMISE"),

	/**
	 * The '<em><b>RESTRICT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing is restricted (Art. 18).
	 * <!-- end-model-doc -->
	 * @see #RESTRICT_VALUE
	 * @generated
	 * @ordered
	 */
	RESTRICT(3, "RESTRICT", "RESTRICT"),

	/**
	 * The '<em><b>ARCHIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is moved to an archive with restricted access.
	 * <!-- end-model-doc -->
	 * @see #ARCHIVE_VALUE
	 * @generated
	 * @ordered
	 */
	ARCHIVE(4, "ARCHIVE", "ARCHIVE");

	/**
	 * The '<em><b>DELETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is deleted (Art. 17).
	 * <!-- end-model-doc -->
	 * @see #DELETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 0;

	/**
	 * The '<em><b>ANONYMISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is anonymised, so it is no longer personal data.
	 * <!-- end-model-doc -->
	 * @see #ANONYMISE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMISE_VALUE = 1;

	/**
	 * The '<em><b>PSEUDONYMISE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is pseudonymised (Art. 4(5)).
	 * <!-- end-model-doc -->
	 * @see #PSEUDONYMISE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PSEUDONYMISE_VALUE = 2;

	/**
	 * The '<em><b>RESTRICT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Processing is restricted (Art. 18).
	 * <!-- end-model-doc -->
	 * @see #RESTRICT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RESTRICT_VALUE = 3;

	/**
	 * The '<em><b>ARCHIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is moved to an archive with restricted access.
	 * <!-- end-model-doc -->
	 * @see #ARCHIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARCHIVE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Retention Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RetentionAction[] VALUES_ARRAY =
		new RetentionAction[] {
			DELETE,
			ANONYMISE,
			PSEUDONYMISE,
			RESTRICT,
			ARCHIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>Retention Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RetentionAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Retention Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionAction get(int value) {
		switch (value) {
			case DELETE_VALUE: return DELETE;
			case ANONYMISE_VALUE: return ANONYMISE;
			case PSEUDONYMISE_VALUE: return PSEUDONYMISE;
			case RESTRICT_VALUE: return RESTRICT;
			case ARCHIVE_VALUE: return ARCHIVE;
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
	private RetentionAction(int value, String name, String literal) {
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
	
} //RetentionAction
