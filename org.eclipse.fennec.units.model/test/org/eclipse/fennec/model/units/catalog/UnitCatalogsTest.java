/**
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
package org.eclipse.fennec.model.units.catalog;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.fennec.model.units.Dimension;
import org.eclipse.fennec.model.units.QuantityKind;
import org.eclipse.fennec.model.units.Unit;
import org.eclipse.fennec.model.units.UnitCatalog;
import org.eclipse.fennec.model.units.UnitsPackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitCatalogsTest {

	private ResourceSet resourceSet;

	@BeforeEach
	void setUp() {
		resourceSet = new ResourceSetImpl();
		resourceSet.getPackageRegistry().put(UnitsPackage.eNS_URI, UnitsPackage.eINSTANCE);
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XMIResourceFactoryImpl());
	}

	@Test
	void catalogIsConsistent() {
		UnitCatalog catalog = UnitCatalogs.load(resourceSet);
		assertFalse(catalog.getUnits().isEmpty());
		Set<String> codes = new HashSet<>();
		for (Unit unit : catalog.getUnits()) {
			assertTrue(codes.add(unit.getCode()), "duplicate code " + unit.getCode());
			assertNotNull(unit.getName(), unit.getCode());
			assertNotNull(unit.getSymbol(), unit.getCode());
			QuantityKind kind = unit.getQuantityKind();
			assertNotNull(kind, unit.getCode());
			assertFalse(kind.eIsProxy(), unit.getCode());
			assertNotNull(kind.getDimension(), kind.getName());
		}
		assertTrue(EcoreUtil.UnresolvedProxyCrossReferencer.find(catalog).isEmpty());
	}

	@Test
	void unitResolvesByCatalogUri() {
		UnitCatalogs.register(resourceSet);
		EObject cel = resourceSet.getEObject(URI.createURI("https://eclipse.org/fennec/units#Cel"), true);
		Unit unit = assertInstanceOf(Unit.class, cel);
		assertEquals("°C", unit.getSymbol());
		assertEquals("http://qudt.org/vocab/unit/DEG_C", unit.getDefinition());
		Dimension dimension = unit.getQuantityKind().getDimension();
		assertEquals(1, dimension.getThermodynamicTemperature());
		assertEquals(0, dimension.getLength());
	}

	@Test
	void unitsWithSpecialCharacters() {
		assertEquals("percent", UnitCatalogs.findUnit(resourceSet, "%").orElseThrow().getName());
		assertEquals("parts per million", UnitCatalogs.findUnit(resourceSet, "[ppm]").orElseThrow().getName());
		assertEquals("µS/cm", UnitCatalogs.findUnit(resourceSet, "uS/cm").orElseThrow().getSymbol());
		assertTrue(UnitCatalogs.findUnit(resourceSet, "kg.m/s2").isEmpty());
	}

	@Test
	void dwdUnitsAreListed() {
		for (String code : new String[] { "K", "deg", "m/s", "kg/m2", "%", "kJ/m2", "m", "Pa", "s", "1" }) {
			assertTrue(UnitCatalogs.findUnit(resourceSet, code).isPresent(), code);
		}
	}

	@Test
	void annotationReferenceResolves() {
		UnitCatalogs.register(resourceSet);
		EPackage domain = EcoreFactory.eINSTANCE.createEPackage();
		EClass measurement = EcoreFactory.eINSTANCE.createEClass();
		EAttribute temperature = EcoreFactory.eINSTANCE.createEAttribute();
		temperature.setName("temperature");
		temperature.setEType(EcorePackage.Literals.EDOUBLE);
		measurement.getEStructuralFeatures().add(temperature);
		domain.getEClassifiers().add(measurement);
		Resource resource = resourceSet.createResource(URI.createURI("test://domain.ecore"));
		resource.getContents().add(domain);

		EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
		annotation.setSource(UnitCatalogs.ANNOTATION_SOURCE);
		EObject proxy = EcoreUtil.create(UnitsPackage.Literals.UNIT);
		((InternalEObject) proxy).eSetProxyURI(UnitCatalogs.unitUri("hPa"));
		annotation.getReferences().add(proxy);
		temperature.getEAnnotations().add(annotation);

		Unit unit = assertInstanceOf(Unit.class, annotation.getReferences().get(0));
		assertFalse(unit.eIsProxy());
		assertEquals("hectopascal", unit.getName());
	}
}
