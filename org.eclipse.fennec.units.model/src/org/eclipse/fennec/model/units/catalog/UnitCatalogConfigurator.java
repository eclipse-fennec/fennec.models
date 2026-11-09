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

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.fennec.emf.osgi.annotation.ConfiguratorType;
import org.eclipse.fennec.emf.osgi.annotation.provide.EMFConfigurator;
import org.eclipse.fennec.emf.osgi.configurator.ResourceSetConfigurator;
import org.osgi.service.component.annotations.Component;

/**
 * Maps the logical URI of the unit catalog onto the catalog resource in this bundle, for every
 * resource set made by the Fennec EMF resource set factory, so that references such as
 * {@code https://eclipse.org/fennec/units#Cel} resolve.
 */
@Component(name = "UnitCatalogConfigurator", service = ResourceSetConfigurator.class)
@EMFConfigurator(configuratorType = ConfiguratorType.RESOURCE_SET, configuratorName = "unitCatalog")
public class UnitCatalogConfigurator implements ResourceSetConfigurator {

	@Override
	public void configureResourceSet(ResourceSet resourceSet) {
		UnitCatalogs.register(resourceSet);
	}
}
