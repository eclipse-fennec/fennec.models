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
package org.eclipse.fennec.model.compliance.deployment;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Container Runtime</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * How the container is run on its host.
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.compliance.deployment.DeploymentPackage#getContainerRuntime()
 * @model
 * @generated
 */
@ProviderType
public enum ContainerRuntime implements Enumerator {
	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(0, "OTHER", "OTHER"),

	/**
	 * The '<em><b>PODMAN QUADLET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PODMAN_QUADLET_VALUE
	 * @generated
	 * @ordered
	 */
	PODMAN_QUADLET(1, "PODMAN_QUADLET", "PODMAN_QUADLET"),

	/**
	 * The '<em><b>DOCKER COMPOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_COMPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	DOCKER_COMPOSE(2, "DOCKER_COMPOSE", "DOCKER_COMPOSE"),

	/**
	 * The '<em><b>KUBERNETES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUBERNETES_VALUE
	 * @generated
	 * @ordered
	 */
	KUBERNETES(3, "KUBERNETES", "KUBERNETES");

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 0;

	/**
	 * The '<em><b>PODMAN QUADLET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PODMAN_QUADLET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PODMAN_QUADLET_VALUE = 1;

	/**
	 * The '<em><b>DOCKER COMPOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOCKER_COMPOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOCKER_COMPOSE_VALUE = 2;

	/**
	 * The '<em><b>KUBERNETES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KUBERNETES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KUBERNETES_VALUE = 3;

	/**
	 * An array of all the '<em><b>Container Runtime</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ContainerRuntime[] VALUES_ARRAY =
		new ContainerRuntime[] {
			OTHER,
			PODMAN_QUADLET,
			DOCKER_COMPOSE,
			KUBERNETES,
		};

	/**
	 * A public read-only list of all the '<em><b>Container Runtime</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ContainerRuntime> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Container Runtime</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainerRuntime get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainerRuntime result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Container Runtime</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainerRuntime getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ContainerRuntime result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Container Runtime</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ContainerRuntime get(int value) {
		switch (value) {
			case OTHER_VALUE: return OTHER;
			case PODMAN_QUADLET_VALUE: return PODMAN_QUADLET;
			case DOCKER_COMPOSE_VALUE: return DOCKER_COMPOSE;
			case KUBERNETES_VALUE: return KUBERNETES;
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
	private ContainerRuntime(int value, String name, String literal) {
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
	
} //ContainerRuntime
