/**
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.eclipse.fennec.atlas.configuration.qvto.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.fennec.atlas.configuration.qvto.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AtlasConfigQvtoFactoryImpl extends EFactoryImpl implements AtlasConfigQvtoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AtlasConfigQvtoFactory init() {
		try {
			AtlasConfigQvtoFactory theAtlasConfigQvtoFactory = (AtlasConfigQvtoFactory)EPackage.Registry.INSTANCE.getEFactory(AtlasConfigQvtoPackage.eNS_URI);
			if (theAtlasConfigQvtoFactory != null) {
				return theAtlasConfigQvtoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AtlasConfigQvtoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtlasConfigQvtoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AtlasConfigQvtoPackage.QVTO_DATA_TRANSFORMATION: return createQvtoDataTransformation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public QvtoDataTransformation createQvtoDataTransformation() {
		QvtoDataTransformationImpl qvtoDataTransformation = new QvtoDataTransformationImpl();
		return qvtoDataTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AtlasConfigQvtoPackage getAtlasConfigQvtoPackage() {
		return (AtlasConfigQvtoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AtlasConfigQvtoPackage getPackage() {
		return AtlasConfigQvtoPackage.eINSTANCE;
	}

} //AtlasConfigQvtoFactoryImpl
