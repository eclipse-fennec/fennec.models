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
 * A representation of the literals of the enumeration '<em><b>Retention Trigger</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * When the retention period of a rule starts.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.inventory.InventoryPackage#getRetentionTrigger()
 * @model
 * @generated
 */
@ProviderType
public enum RetentionTrigger implements Enumerator {
	/**
	 * The '<em><b>COLLECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the data is collected.
	 * <!-- end-model-doc -->
	 * @see #COLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTION(0, "COLLECTION", "COLLECTION"),

	/**
	 * The '<em><b>END OF PURPOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the purpose of the processing is fulfilled.
	 * <!-- end-model-doc -->
	 * @see #END_OF_PURPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	END_OF_PURPOSE(1, "END_OF_PURPOSE", "END_OF_PURPOSE"),

	/**
	 * The '<em><b>END OF CONTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the contract with the data subject ends.
	 * <!-- end-model-doc -->
	 * @see #END_OF_CONTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	END_OF_CONTRACT(2, "END_OF_CONTRACT", "END_OF_CONTRACT"),

	/**
	 * The '<em><b>ACCOUNT DELETION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the account of the data subject is deleted.
	 * <!-- end-model-doc -->
	 * @see #ACCOUNT_DELETION_VALUE
	 * @generated
	 * @ordered
	 */
	ACCOUNT_DELETION(3, "ACCOUNT_DELETION", "ACCOUNT_DELETION"),

	/**
	 * The '<em><b>END OF CALENDAR YEAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts at the end of the calendar year in which the data was created, as for statutory retention under HGB and AO.
	 * <!-- end-model-doc -->
	 * @see #END_OF_CALENDAR_YEAR_VALUE
	 * @generated
	 * @ordered
	 */
	END_OF_CALENDAR_YEAR(4, "END_OF_CALENDAR_YEAR", "END_OF_CALENDAR_YEAR"),

	/**
	 * The '<em><b>EVENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts with another event, described in triggerDescription.
	 * <!-- end-model-doc -->
	 * @see #EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	EVENT(5, "EVENT", "EVENT"),

	/**
	 * The '<em><b>INDEFINITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is kept without a time limit. Requires a justification.
	 * <!-- end-model-doc -->
	 * @see #INDEFINITE_VALUE
	 * @generated
	 * @ordered
	 */
	INDEFINITE(6, "INDEFINITE", "INDEFINITE");

	/**
	 * The '<em><b>COLLECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the data is collected.
	 * <!-- end-model-doc -->
	 * @see #COLLECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTION_VALUE = 0;

	/**
	 * The '<em><b>END OF PURPOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the purpose of the processing is fulfilled.
	 * <!-- end-model-doc -->
	 * @see #END_OF_PURPOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_OF_PURPOSE_VALUE = 1;

	/**
	 * The '<em><b>END OF CONTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the contract with the data subject ends.
	 * <!-- end-model-doc -->
	 * @see #END_OF_CONTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_OF_CONTRACT_VALUE = 2;

	/**
	 * The '<em><b>ACCOUNT DELETION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts when the account of the data subject is deleted.
	 * <!-- end-model-doc -->
	 * @see #ACCOUNT_DELETION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ACCOUNT_DELETION_VALUE = 3;

	/**
	 * The '<em><b>END OF CALENDAR YEAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts at the end of the calendar year in which the data was created, as for statutory retention under HGB and AO.
	 * <!-- end-model-doc -->
	 * @see #END_OF_CALENDAR_YEAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_OF_CALENDAR_YEAR_VALUE = 4;

	/**
	 * The '<em><b>EVENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The period starts with another event, described in triggerDescription.
	 * <!-- end-model-doc -->
	 * @see #EVENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EVENT_VALUE = 5;

	/**
	 * The '<em><b>INDEFINITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The data is kept without a time limit. Requires a justification.
	 * <!-- end-model-doc -->
	 * @see #INDEFINITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDEFINITE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Retention Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RetentionTrigger[] VALUES_ARRAY =
		new RetentionTrigger[] {
			COLLECTION,
			END_OF_PURPOSE,
			END_OF_CONTRACT,
			ACCOUNT_DELETION,
			END_OF_CALENDAR_YEAR,
			EVENT,
			INDEFINITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Retention Trigger</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RetentionTrigger> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Retention Trigger</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionTrigger get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionTrigger result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Trigger</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionTrigger getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RetentionTrigger result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Retention Trigger</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static RetentionTrigger get(int value) {
		switch (value) {
			case COLLECTION_VALUE: return COLLECTION;
			case END_OF_PURPOSE_VALUE: return END_OF_PURPOSE;
			case END_OF_CONTRACT_VALUE: return END_OF_CONTRACT;
			case ACCOUNT_DELETION_VALUE: return ACCOUNT_DELETION;
			case END_OF_CALENDAR_YEAR_VALUE: return END_OF_CALENDAR_YEAR;
			case EVENT_VALUE: return EVENT;
			case INDEFINITE_VALUE: return INDEFINITE;
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
	private RetentionTrigger(int value, String name, String literal) {
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
	
} //RetentionTrigger
