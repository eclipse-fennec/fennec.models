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


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.fennec.emf.osgi.annotation.provide.EPackage;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Units of measurement of Eclipse Fennec, shared by every consumer (streaming / SensorThings, OGC features, model metadata, domain models).
 * 
 * A Unit is identified by its UCUM code. The bundle ships a catalog of common units (SI, environmental, DWD) at https://eclipse.org/fennec/units; a unit is referenced as https://eclipse.org/fennec/units#<code>, e.g. #Cel. UCUM is a grammar, so the catalog is incomplete by design: a composite unit is given by its code alone.
 * 
 * The model holds no conversion data. Conversion and dimension checks belong to the consumer (JSR 385 / Indriya with systems-ucum).
 * <!-- end-model-doc -->
 * @see org.eclipse.fennec.model.units.UnitsFactory
 * @model kind="package"
 * @generated
 */
@ProviderType
@EPackage(uri = UnitsPackage.eNS_URI, fingerprint = "fp1:51553ea3c16bbd874b392dfd63aed77a6b578620b62df997938b888db7f70504", genModel = "/model/units.genmodel", genModelSourceLocations = {"model/units.genmodel","org.eclipse.fennec.units.model/model/units.genmodel"}, ecore = "/model/units.ecore", ecoreSourceLocations = "/model/units.ecore")
public interface UnitsPackage extends org.eclipse.emf.ecore.EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "units";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://eclipse.org/fennec/units/1.0.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "units";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UnitsPackage eINSTANCE = org.eclipse.fennec.model.units.impl.UnitsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.units.impl.UnitCatalogImpl <em>Unit Catalog</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.units.impl.UnitCatalogImpl
	 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getUnitCatalog()
	 * @generated
	 */
	int UNIT_CATALOG = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CATALOG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity Kinds</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CATALOG__QUANTITY_KINDS = 1;

	/**
	 * The feature id for the '<em><b>Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CATALOG__UNITS = 2;

	/**
	 * The number of structural features of the '<em>Unit Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CATALOG_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Unit Catalog</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_CATALOG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.units.impl.UnitImpl <em>Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.units.impl.UnitImpl
	 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getUnit()
	 * @generated
	 */
	int UNIT = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__SYMBOL = 2;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__DEFINITION = 3;

	/**
	 * The feature id for the '<em><b>Quantity Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT__QUANTITY_KIND = 4;

	/**
	 * The number of structural features of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.units.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.units.impl.QuantityKindImpl
	 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getQuantityKind()
	 * @generated
	 */
	int QUANTITY_KIND = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__NAME = 0;

	/**
	 * The feature id for the '<em><b>Definition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__DEFINITION = 1;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND__DIMENSION = 2;

	/**
	 * The number of structural features of the '<em>Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Quantity Kind</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTITY_KIND_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.fennec.model.units.impl.DimensionImpl <em>Dimension</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.fennec.model.units.impl.DimensionImpl
	 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getDimension()
	 * @generated
	 */
	int DIMENSION = 3;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__MASS = 1;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__TIME = 2;

	/**
	 * The feature id for the '<em><b>Electric Current</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__ELECTRIC_CURRENT = 3;

	/**
	 * The feature id for the '<em><b>Thermodynamic Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__THERMODYNAMIC_TEMPERATURE = 4;

	/**
	 * The feature id for the '<em><b>Amount Of Substance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__AMOUNT_OF_SUBSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Luminous Intensity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION__LUMINOUS_INTENSITY = 6;

	/**
	 * The number of structural features of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Dimension</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIMENSION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.units.UnitCatalog <em>Unit Catalog</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit Catalog</em>'.
	 * @see org.eclipse.fennec.model.units.UnitCatalog
	 * @generated
	 */
	EClass getUnitCatalog();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.UnitCatalog#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.units.UnitCatalog#getName()
	 * @see #getUnitCatalog()
	 * @generated
	 */
	EAttribute getUnitCatalog_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.units.UnitCatalog#getQuantityKinds <em>Quantity Kinds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity Kinds</em>'.
	 * @see org.eclipse.fennec.model.units.UnitCatalog#getQuantityKinds()
	 * @see #getUnitCatalog()
	 * @generated
	 */
	EReference getUnitCatalog_QuantityKinds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.fennec.model.units.UnitCatalog#getUnits <em>Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Units</em>'.
	 * @see org.eclipse.fennec.model.units.UnitCatalog#getUnits()
	 * @see #getUnitCatalog()
	 * @generated
	 */
	EReference getUnitCatalog_Units();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.units.Unit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unit</em>'.
	 * @see org.eclipse.fennec.model.units.Unit
	 * @generated
	 */
	EClass getUnit();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Unit#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see org.eclipse.fennec.model.units.Unit#getCode()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Code();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Unit#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.units.Unit#getName()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Unit#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.eclipse.fennec.model.units.Unit#getSymbol()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Unit#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see org.eclipse.fennec.model.units.Unit#getDefinition()
	 * @see #getUnit()
	 * @generated
	 */
	EAttribute getUnit_Definition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.fennec.model.units.Unit#getQuantityKind <em>Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quantity Kind</em>'.
	 * @see org.eclipse.fennec.model.units.Unit#getQuantityKind()
	 * @see #getUnit()
	 * @generated
	 */
	EReference getUnit_QuantityKind();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.units.QuantityKind <em>Quantity Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantity Kind</em>'.
	 * @see org.eclipse.fennec.model.units.QuantityKind
	 * @generated
	 */
	EClass getQuantityKind();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.QuantityKind#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.fennec.model.units.QuantityKind#getName()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EAttribute getQuantityKind_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.QuantityKind#getDefinition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Definition</em>'.
	 * @see org.eclipse.fennec.model.units.QuantityKind#getDefinition()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EAttribute getQuantityKind_Definition();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.fennec.model.units.QuantityKind#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dimension</em>'.
	 * @see org.eclipse.fennec.model.units.QuantityKind#getDimension()
	 * @see #getQuantityKind()
	 * @generated
	 */
	EReference getQuantityKind_Dimension();

	/**
	 * Returns the meta object for class '{@link org.eclipse.fennec.model.units.Dimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dimension</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension
	 * @generated
	 */
	EClass getDimension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Dimension#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension#getLength()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Length();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Dimension#getMass <em>Mass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mass</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension#getMass()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Mass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Dimension#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension#getTime()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Dimension#getElectricCurrent <em>Electric Current</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Electric Current</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension#getElectricCurrent()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_ElectricCurrent();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Dimension#getThermodynamicTemperature <em>Thermodynamic Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thermodynamic Temperature</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension#getThermodynamicTemperature()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_ThermodynamicTemperature();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Dimension#getAmountOfSubstance <em>Amount Of Substance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Of Substance</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension#getAmountOfSubstance()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_AmountOfSubstance();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.fennec.model.units.Dimension#getLuminousIntensity <em>Luminous Intensity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Luminous Intensity</em>'.
	 * @see org.eclipse.fennec.model.units.Dimension#getLuminousIntensity()
	 * @see #getDimension()
	 * @generated
	 */
	EAttribute getDimension_LuminousIntensity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UnitsFactory getUnitsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.units.impl.UnitCatalogImpl <em>Unit Catalog</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.units.impl.UnitCatalogImpl
		 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getUnitCatalog()
		 * @generated
		 */
		EClass UNIT_CATALOG = eINSTANCE.getUnitCatalog();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT_CATALOG__NAME = eINSTANCE.getUnitCatalog_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity Kinds</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CATALOG__QUANTITY_KINDS = eINSTANCE.getUnitCatalog_QuantityKinds();

		/**
		 * The meta object literal for the '<em><b>Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT_CATALOG__UNITS = eINSTANCE.getUnitCatalog_Units();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.units.impl.UnitImpl <em>Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.units.impl.UnitImpl
		 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getUnit()
		 * @generated
		 */
		EClass UNIT = eINSTANCE.getUnit();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__CODE = eINSTANCE.getUnit_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__NAME = eINSTANCE.getUnit_Name();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__SYMBOL = eINSTANCE.getUnit_Symbol();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNIT__DEFINITION = eINSTANCE.getUnit_Definition();

		/**
		 * The meta object literal for the '<em><b>Quantity Kind</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNIT__QUANTITY_KIND = eINSTANCE.getUnit_QuantityKind();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.units.impl.QuantityKindImpl <em>Quantity Kind</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.units.impl.QuantityKindImpl
		 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getQuantityKind()
		 * @generated
		 */
		EClass QUANTITY_KIND = eINSTANCE.getQuantityKind();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_KIND__NAME = eINSTANCE.getQuantityKind_Name();

		/**
		 * The meta object literal for the '<em><b>Definition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTITY_KIND__DEFINITION = eINSTANCE.getQuantityKind_Definition();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTITY_KIND__DIMENSION = eINSTANCE.getQuantityKind_Dimension();

		/**
		 * The meta object literal for the '{@link org.eclipse.fennec.model.units.impl.DimensionImpl <em>Dimension</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.fennec.model.units.impl.DimensionImpl
		 * @see org.eclipse.fennec.model.units.impl.UnitsPackageImpl#getDimension()
		 * @generated
		 */
		EClass DIMENSION = eINSTANCE.getDimension();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__LENGTH = eINSTANCE.getDimension_Length();

		/**
		 * The meta object literal for the '<em><b>Mass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__MASS = eINSTANCE.getDimension_Mass();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__TIME = eINSTANCE.getDimension_Time();

		/**
		 * The meta object literal for the '<em><b>Electric Current</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__ELECTRIC_CURRENT = eINSTANCE.getDimension_ElectricCurrent();

		/**
		 * The meta object literal for the '<em><b>Thermodynamic Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__THERMODYNAMIC_TEMPERATURE = eINSTANCE.getDimension_ThermodynamicTemperature();

		/**
		 * The meta object literal for the '<em><b>Amount Of Substance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__AMOUNT_OF_SUBSTANCE = eINSTANCE.getDimension_AmountOfSubstance();

		/**
		 * The meta object literal for the '<em><b>Luminous Intensity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIMENSION__LUMINOUS_INTENSITY = eINSTANCE.getDimension_LuminousIntensity();

	}

} //UnitsPackage
