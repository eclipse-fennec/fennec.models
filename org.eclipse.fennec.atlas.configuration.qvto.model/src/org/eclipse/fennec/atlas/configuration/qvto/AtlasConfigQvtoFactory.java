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
package org.eclipse.fennec.atlas.configuration.qvto;

import org.eclipse.emf.ecore.EFactory;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.fennec.atlas.configuration.qvto.AtlasConfigQvtoPackage
 * @generated
 */
@ProviderType
public interface AtlasConfigQvtoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AtlasConfigQvtoFactory eINSTANCE = org.eclipse.fennec.atlas.configuration.qvto.impl.AtlasConfigQvtoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Qvto Data Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Qvto Data Transformation</em>'.
	 * @generated
	 */
	QvtoDataTransformation createQvtoDataTransformation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AtlasConfigQvtoPackage getAtlasConfigQvtoPackage();

} //AtlasConfigQvtoFactory
