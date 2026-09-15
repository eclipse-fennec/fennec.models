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
 * A representation of the literals of the enumeration '<em><b>Data Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * What kind of data a feature holds, in GDPR terms. Choose the most specific value the evidence supports.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.gdprReport.GDPRReportPackage#getDataCategory()
 * @model
 * @generated
 */
@ProviderType
public enum DataCategory implements Enumerator {
	/**
	 * The '<em><b>NOT PERSONAL DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Examined and does not relate to an identified or identifiable natural person, e.g. a currency code or a machine setting.
	 * <!-- end-model-doc -->
	 * @see #NOT_PERSONAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_PERSONAL_DATA(0, "NOT_PERSONAL_DATA", "NOT_PERSONAL_DATA"),

	/**
	 * The '<em><b>PERSONAL DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relates to an identifiable person but does not fit a more specific category.
	 * <!-- end-model-doc -->
	 * @see #PERSONAL_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL_DATA(1, "PERSONAL_DATA", "PERSONAL_DATA"),

	/**
	 * The '<em><b>DIRECT IDENTIFIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a person on its own, e.g. full name, e-mail address, national identification number.
	 * <!-- end-model-doc -->
	 * @see #DIRECT_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	DIRECT_IDENTIFIER(2, "DIRECT_IDENTIFIER", "DIRECT_IDENTIFIER"),

	/**
	 * The '<em><b>QUASI IDENTIFIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does not identify anyone alone but contributes to singling a person out when combined with others, e.g. postal code, date of birth, job title.
	 * <!-- end-model-doc -->
	 * @see #QUASI_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	QUASI_IDENTIFIER(3, "QUASI_IDENTIFIER", "QUASI_IDENTIFIER"),

	/**
	 * The '<em><b>ONLINE IDENTIFIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier supplied by a device, application or protocol, e.g. an IP address, a cookie identifier or an RFID tag.
	 * <!-- end-model-doc -->
	 * @see #ONLINE_IDENTIFIER_VALUE
	 * @generated
	 * @ordered
	 */
	ONLINE_IDENTIFIER(4, "ONLINE_IDENTIFIER", "ONLINE_IDENTIFIER"),

	/**
	 * The '<em><b>LOCATION DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data about where a person is or has been. Repeated location values form a movement profile.
	 * <!-- end-model-doc -->
	 * @see #LOCATION_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION_DATA(5, "LOCATION_DATA", "LOCATION_DATA"),

	/**
	 * The '<em><b>SPECIAL CATEGORY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data of the kinds enumerated in Article 9(1): racial or ethnic origin, political opinions, religious or philosophical beliefs, trade union membership, genetic data, biometric data processed for unique identification, health, sex life or sexual orientation.
	 * <!-- end-model-doc -->
	 * @see #SPECIAL_CATEGORY_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_CATEGORY(6, "SPECIAL_CATEGORY", "SPECIAL_CATEGORY"),

	/**
	 * The '<em><b>CRIMINAL CONVICTION DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data on criminal convictions and offences. Governed by Article 10, not Article 9; do not label it SPECIAL_CATEGORY.
	 * <!-- end-model-doc -->
	 * @see #CRIMINAL_CONVICTION_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CRIMINAL_CONVICTION_DATA(7, "CRIMINAL_CONVICTION_DATA", "CRIMINAL_CONVICTION_DATA"),

	/**
	 * The '<em><b>CHILD DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data relating to children, which attracts the additional conditions of Article 8.
	 * <!-- end-model-doc -->
	 * @see #CHILD_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD_DATA(8, "CHILD_DATA", "CHILD_DATA"),

	/**
	 * The '<em><b>PSEUDONYMISED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data whose direct identifiers were replaced but which can still be attributed to a person with additional information. Still personal data, and still in scope.
	 * <!-- end-model-doc -->
	 * @see #PSEUDONYMISED_VALUE
	 * @generated
	 * @ordered
	 */
	PSEUDONYMISED(9, "PSEUDONYMISED", "PSEUDONYMISED"),

	/**
	 * The '<em><b>ANONYMOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data that no longer relates to an identifiable person, and therefore outside the Regulation. Use only when re-identification is not reasonably likely; a hashed or tokenised value is normally PSEUDONYMISED, not this.
	 * <!-- end-model-doc -->
	 * @see #ANONYMOUS_VALUE
	 * @generated
	 * @ordered
	 */
	ANONYMOUS(10, "ANONYMOUS", "ANONYMOUS");

	/**
	 * The '<em><b>NOT PERSONAL DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Examined and does not relate to an identified or identifiable natural person, e.g. a currency code or a machine setting.
	 * <!-- end-model-doc -->
	 * @see #NOT_PERSONAL_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_PERSONAL_DATA_VALUE = 0;

	/**
	 * The '<em><b>PERSONAL DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relates to an identifiable person but does not fit a more specific category.
	 * <!-- end-model-doc -->
	 * @see #PERSONAL_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_DATA_VALUE = 1;

	/**
	 * The '<em><b>DIRECT IDENTIFIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifies a person on its own, e.g. full name, e-mail address, national identification number.
	 * <!-- end-model-doc -->
	 * @see #DIRECT_IDENTIFIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIRECT_IDENTIFIER_VALUE = 2;

	/**
	 * The '<em><b>QUASI IDENTIFIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Does not identify anyone alone but contributes to singling a person out when combined with others, e.g. postal code, date of birth, job title.
	 * <!-- end-model-doc -->
	 * @see #QUASI_IDENTIFIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int QUASI_IDENTIFIER_VALUE = 3;

	/**
	 * The '<em><b>ONLINE IDENTIFIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An identifier supplied by a device, application or protocol, e.g. an IP address, a cookie identifier or an RFID tag.
	 * <!-- end-model-doc -->
	 * @see #ONLINE_IDENTIFIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ONLINE_IDENTIFIER_VALUE = 4;

	/**
	 * The '<em><b>LOCATION DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data about where a person is or has been. Repeated location values form a movement profile.
	 * <!-- end-model-doc -->
	 * @see #LOCATION_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_DATA_VALUE = 5;

	/**
	 * The '<em><b>SPECIAL CATEGORY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data of the kinds enumerated in Article 9(1): racial or ethnic origin, political opinions, religious or philosophical beliefs, trade union membership, genetic data, biometric data processed for unique identification, health, sex life or sexual orientation.
	 * <!-- end-model-doc -->
	 * @see #SPECIAL_CATEGORY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_CATEGORY_VALUE = 6;

	/**
	 * The '<em><b>CRIMINAL CONVICTION DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data on criminal convictions and offences. Governed by Article 10, not Article 9; do not label it SPECIAL_CATEGORY.
	 * <!-- end-model-doc -->
	 * @see #CRIMINAL_CONVICTION_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CRIMINAL_CONVICTION_DATA_VALUE = 7;

	/**
	 * The '<em><b>CHILD DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data relating to children, which attracts the additional conditions of Article 8.
	 * <!-- end-model-doc -->
	 * @see #CHILD_DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_DATA_VALUE = 8;

	/**
	 * The '<em><b>PSEUDONYMISED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data whose direct identifiers were replaced but which can still be attributed to a person with additional information. Still personal data, and still in scope.
	 * <!-- end-model-doc -->
	 * @see #PSEUDONYMISED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PSEUDONYMISED_VALUE = 9;

	/**
	 * The '<em><b>ANONYMOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Data that no longer relates to an identifiable person, and therefore outside the Regulation. Use only when re-identification is not reasonably likely; a hashed or tokenised value is normally PSEUDONYMISED, not this.
	 * <!-- end-model-doc -->
	 * @see #ANONYMOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ANONYMOUS_VALUE = 10;

	/**
	 * An array of all the '<em><b>Data Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataCategory[] VALUES_ARRAY =
		new DataCategory[] {
			NOT_PERSONAL_DATA,
			PERSONAL_DATA,
			DIRECT_IDENTIFIER,
			QUASI_IDENTIFIER,
			ONLINE_IDENTIFIER,
			LOCATION_DATA,
			SPECIAL_CATEGORY,
			CRIMINAL_CONVICTION_DATA,
			CHILD_DATA,
			PSEUDONYMISED,
			ANONYMOUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataCategory get(int value) {
		switch (value) {
			case NOT_PERSONAL_DATA_VALUE: return NOT_PERSONAL_DATA;
			case PERSONAL_DATA_VALUE: return PERSONAL_DATA;
			case DIRECT_IDENTIFIER_VALUE: return DIRECT_IDENTIFIER;
			case QUASI_IDENTIFIER_VALUE: return QUASI_IDENTIFIER;
			case ONLINE_IDENTIFIER_VALUE: return ONLINE_IDENTIFIER;
			case LOCATION_DATA_VALUE: return LOCATION_DATA;
			case SPECIAL_CATEGORY_VALUE: return SPECIAL_CATEGORY;
			case CRIMINAL_CONVICTION_DATA_VALUE: return CRIMINAL_CONVICTION_DATA;
			case CHILD_DATA_VALUE: return CHILD_DATA;
			case PSEUDONYMISED_VALUE: return PSEUDONYMISED;
			case ANONYMOUS_VALUE: return ANONYMOUS;
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
	private DataCategory(int value, String name, String literal) {
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
	
} //DataCategory
