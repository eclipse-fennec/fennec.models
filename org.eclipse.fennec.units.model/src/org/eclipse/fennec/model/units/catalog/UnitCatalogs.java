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

import java.net.URL;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.fennec.model.units.Unit;
import org.eclipse.fennec.model.units.UnitCatalog;

/**
 * Access to the unit catalog shipped with this bundle.
 * <p>
 * The catalog has the logical URI {@link #CATALOG_URI}; a unit is referenced as
 * {@code https://eclipse.org/fennec/units#<UCUM code>}, e.g. {@code #Cel}. To resolve such
 * references, the logical URI must be mapped onto the catalog resource in the bundle:
 * {@link #register(ResourceSet)} does it for one resource set, {@link #registerGlobally()} for
 * {@link URIConverter#URI_MAP}. In OSGi the {@link UnitCatalogConfigurator} does it for every
 * resource set made by the Fennec EMF resource set factory.
 * <p>
 * A unit annotation on a domain model feature has the source {@link #ANNOTATION_SOURCE}. It
 * references a catalog unit, or gives the UCUM code in the detail {@link #DETAIL_CODE};
 * {@link #DETAIL_NAME}, {@link #DETAIL_SYMBOL} and {@link #DETAIL_DEFINITION} override what is
 * derived from the reference or the code.
 */
public final class UnitCatalogs {

	/** The logical URI of the catalog. */
	public static final String CATALOG_URI = "https://eclipse.org/fennec/units";
	/** The source of a unit annotation on a domain model element. */
	public static final String ANNOTATION_SOURCE = "https://eclipse.org/fennec/unit";
	/** Annotation detail: the UCUM code. */
	public static final String DETAIL_CODE = "code";
	/** Annotation detail: the name, overriding the derived one. */
	public static final String DETAIL_NAME = "name";
	/** Annotation detail: the symbol, overriding the derived one. */
	public static final String DETAIL_SYMBOL = "symbol";
	/** Annotation detail: the definition URI, overriding the derived one. */
	public static final String DETAIL_DEFINITION = "definition";

	/** The catalog resource, next to this class. */
	static final String CATALOG_PATH = "unit-catalog.xmi";

	private UnitCatalogs() {
	}

	/**
	 * @return the logical URI of the catalog
	 */
	public static URI catalogUri() {
		return URI.createURI(CATALOG_URI);
	}

	/**
	 * @param code the UCUM code
	 * @return the URI of the catalog unit with this code (it may not be listed in the catalog)
	 */
	public static URI unitUri(String code) {
		return catalogUri().appendFragment(code);
	}

	/**
	 * @return the physical location of the catalog resource in this bundle
	 * @throws IllegalStateException if the bundle does not contain the catalog
	 */
	public static URI catalogLocation() {
		URL url = UnitCatalogs.class.getResource(CATALOG_PATH);
		if (url == null) {
			throw new IllegalStateException("The unit catalog " + CATALOG_PATH + " is missing");
		}
		return URI.createURI(url.toString());
	}

	/**
	 * Maps the logical catalog URI onto the catalog resource.
	 * @param uriMap the URI map to add the mapping to
	 */
	public static void register(Map<URI, URI> uriMap) {
		uriMap.put(catalogUri(), catalogLocation());
	}

	/**
	 * Maps the logical catalog URI onto the catalog resource for one resource set.
	 * @param resourceSet the resource set
	 */
	public static void register(ResourceSet resourceSet) {
		register(resourceSet.getURIConverter().getURIMap());
	}

	/**
	 * Maps the logical catalog URI onto the catalog resource in {@link URIConverter#URI_MAP}, for
	 * every resource set with a default URI converter.
	 */
	public static void registerGlobally() {
		register(URIConverter.URI_MAP);
	}

	/**
	 * Loads the catalog into the resource set, registering the URI mapping if needed.
	 * @param resourceSet the resource set
	 * @return the catalog
	 */
	public static UnitCatalog load(ResourceSet resourceSet) {
		if (!resourceSet.getURIConverter().getURIMap().containsKey(catalogUri())
				&& !URIConverter.URI_MAP.containsKey(catalogUri())) {
			register(resourceSet);
		}
		Resource resource = resourceSet.getResource(catalogUri(), true);
		return (UnitCatalog) resource.getContents().get(0);
	}

	/**
	 * @param resourceSet the resource set
	 * @param code the UCUM code
	 * @return the catalog unit with this code, empty if the catalog does not list it
	 */
	public static Optional<Unit> findUnit(ResourceSet resourceSet, String code) {
		load(resourceSet);
		EObject unit = resourceSet.getEObject(unitUri(code), true);
		return unit instanceof Unit u ? Optional.of(u) : Optional.empty();
	}
}
