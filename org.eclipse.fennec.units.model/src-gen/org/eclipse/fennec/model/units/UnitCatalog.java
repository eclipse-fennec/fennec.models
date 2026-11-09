/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.model.units;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unit Catalog</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A catalog of units and quantity kinds, the root of a catalog resource.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.units.UnitCatalog#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.UnitCatalog#getQuantityKinds <em>Quantity Kinds</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.units.UnitCatalog#getUnits <em>Units</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.units.UnitsPackage#getUnitCatalog()
 * @model
 * @generated
 */
@ProviderType
public interface UnitCatalog extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The catalog's name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getUnitCatalog_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.units.UnitCatalog#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity Kinds</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.units.QuantityKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The quantity kinds of the catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Quantity Kinds</em>' containment reference list.
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getUnitCatalog_QuantityKinds()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuantityKind> getQuantityKinds();

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.units.Unit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The units of the catalog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' containment reference list.
	 * @see org.eclipse.fennec.model.units.UnitsPackage#getUnitCatalog_Units()
	 * @model containment="true"
	 * @generated
	 */
	EList<Unit> getUnits();

} // UnitCatalog
