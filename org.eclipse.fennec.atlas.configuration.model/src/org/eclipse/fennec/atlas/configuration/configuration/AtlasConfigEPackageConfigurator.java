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
package org.eclipse.fennec.atlas.configuration.configuration;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.fennec.atlas.configuration.AtlasConfigPackage;

import org.eclipse.fennec.emf.osgi.configurator.EPackageConfigurator;

import org.eclipse.fennec.emf.osgi.constants.EMFNamespaces;

/**
 * <!-- begin-user-doc -->
 * The <b>EPackageConfiguration</b> and <b>ResourceFactoryConfigurator</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Configuration building blocks shared by the Fennec atlases (Data Atlas, Model Atlas, Event Atlas, ...).
 * 
 * The atlas-specific configuration models reference or extend these types instead of defining their own, so that e.g. a data source or a data input looks the same in every atlas:
 * - DataSource (JdbcDataSource, MongoDataSource, MqttDataSource): where the data lives and how to connect to it.
 * - DataInput (FileDataInput, MqttDataInput, MongoDataInput): what streams EObjects into an atlas. Inputs receiving serialized payloads (PayloadDataInput) carry a CodecConfiguration saying how the EMF codec reads them.
 * - DataProvider and DataService: the common base of anything an atlas provides data through, and of the endpoints it publishes; atlas-specific subtypes add their own features (transformations, exports, ...).
 * 
 * Inputs that need further models live in their own modules (e.g. JPADataInput in org.eclipse.fennec.atlas.configuration.jpa.model), so this model stays free of dependencies.
 * <!-- end-model-doc -->
 * @see EPackageConfigurator
 * @generated
 */
public class AtlasConfigEPackageConfigurator implements EPackageConfigurator {
	
	/**
	 * The fingerprint of this model version, computed from the <code>.ecore</code> at build
	 * time. It identifies the model content, not the artifact - see the <code>emf.fingerprint</code>
	 * service property.
	 * @generated
	 */
	public static final String FINGERPRINT = "fp1:73dce0f622ea460cd0cefc14c14606370937e5c3d1a9e7870df13213feda2ec8";

	private AtlasConfigPackage ePackage;

	protected AtlasConfigEPackageConfigurator(AtlasConfigPackage ePackage){
		this.ePackage = ePackage;
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.emf.osgi.EPackageRegistryConfigurator#configureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void configureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.put(AtlasConfigPackage.eNS_URI, ePackage);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.eclipse.fennec.emf.osgi.EPackageRegistryConfigurator#unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry)
	 * @generated
	 */
	@Override
	public void unconfigureEPackage(org.eclipse.emf.ecore.EPackage.Registry registry) {
		registry.remove(AtlasConfigPackage.eNS_URI);
	}
	
	/**
	 * A method providing the Properties the services around this Model should be registered with.
	 * @generated
	 */
	public Map<String, Object> getServiceProperties() {
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put(EMFNamespaces.EMF_NAME, AtlasConfigPackage.eNAME);
		properties.put(EMFNamespaces.EMF_MODEL_NSURI, AtlasConfigPackage.eNS_URI);
		properties.put(EMFNamespaces.EMF_MODEL_REGISTRATION, EMFNamespaces.MODEL_REGISTRATION_PROVIDED);
		properties.put(EMFNamespaces.EMF_MODEL_FILE_EXT, "atlasconfig");
		properties.put(EMFNamespaces.EMF_MODEL_VERSION, "1.0");
		properties.put(EMFNamespaces.EMF_MODEL_FINGERPRINT, FINGERPRINT);
		return properties;
	}
}