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
package org.eclipse.fennec.model.gdprReportHistory.configuration;

import java.util.Hashtable;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource.Factory;

import org.eclipse.fennec.emf.osgi.configurator.EPackageConfigurator;

import org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryFactory;
import org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage;

import org.eclipse.fennec.model.gdprReportHistory.impl.GDPRReportHistoryPackageImpl;

import org.eclipse.fennec.model.gdprReportHistory.util.GDPRReportHistoryResourceFactoryImpl;

import org.osgi.annotation.bundle.Capability;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleException;
import org.osgi.framework.ServiceRegistration;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import org.osgi.service.condition.Condition;
/**
 * The <b>PackageConfiguration</b> for the model.
 * The package will be registered into a OSGi base model registry.
 * 
 * @generated
 */
@Component(name = "GDPRReportHistoryConfigurator")
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.eclipse.fennec.model.gdprReportHistory.util.GDPRReportHistoryResourceFactoryImpl, org.eclipse.emf.ecore.resource.Resource$Factory\"" , "uses:=\"org.eclipse.emf.ecore.resource,org.eclipse.fennec.model.gdprReportHistory.util\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryFactory, org.eclipse.emf.ecore.EFactory\"" , "uses:=\"org.eclipse.emf.ecore,org.eclipse.fennec.model.gdprReportHistory\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.eclipse.fennec.model.gdprReportHistory.GDPRReportHistoryPackage, org.eclipse.emf.ecore.EPackage\"" , "uses:=\"org.eclipse.emf.ecore,org.eclipse.fennec.model.gdprReportHistory\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.eclipse.fennec.emf.osgi.configurator.EPackageConfigurator\"" , "uses:=\"org.eclipse.emf.ecore,org.eclipse.fennec.model.gdprReportHistory\"" })
@Capability( namespace = "osgi.service", attribute = { "objectClass:List<String>=\"org.osgi.service.condition.Condition\"" , "uses:=org.osgi.service.condition" })
public class GDPRReportHistoryConfigurationComponent {
	
	private ServiceRegistration<?> packageRegistration = null;
	private ServiceRegistration<EPackageConfigurator> ePackageConfiguratorRegistration = null;
	private ServiceRegistration<?> eFactoryRegistration = null;
	private ServiceRegistration<?> conditionRegistration = null;
	private ServiceRegistration<?> resourceFactoryRegistration = null;

	/**
	 * Activates the Configuration Component.
	 *
	 * @generated
	 */
	@Activate
	public void activate(BundleContext ctx) {
	
		checkEMFEcore(ctx);
		GDPRReportHistoryPackage ePackage = GDPRReportHistoryPackageImpl.eINSTANCE;
		
		if(!EPackage.Registry.INSTANCE.containsKey(GDPRReportHistoryPackage.eNS_URI)){
			EPackage.Registry.INSTANCE.put(GDPRReportHistoryPackage.eNS_URI, ePackage);
		}
		
		GDPRReportHistoryEPackageConfigurator packageConfigurator = registerEPackageConfiguratorService(ePackage, ctx);
		registerResourceFactoryService(ctx);
		registerEPackageService(ePackage, packageConfigurator, ctx);
		registerEFactoryService(ePackage, packageConfigurator, ctx);
		registerConditionService(packageConfigurator, ctx);
	}
	
	/**
	 * We have to make sure that org.eclipse.emf.ecore is started, so we don't run 
	 * into start order issues due to the use of static access in EMF 
	 * @param ctx the {@link BundleContext} to use
	 */
	private void checkEMFEcore(BundleContext ctx) {
		Bundle[] bundles = ctx.getBundles();
		
		for(Bundle bundle : bundles) {
			if("org.eclipse.emf.ecore".equals(bundle.getSymbolicName())) {
				try {
					bundle.start();
				} catch (BundleException e) {
					System.getLogger(getClass().getName()).log(System.Logger.Level.ERROR, "Could not start Bundle org.eclipse.emf.ecore, something seems seriously wrong", e);
				}
				break;
			}
		}
	}
	
	/**
	 * Registers the GDPRReportHistoryEPackageConfigurator as a service.
	 *
	 * @generated
	 */
	private GDPRReportHistoryEPackageConfigurator registerEPackageConfiguratorService(GDPRReportHistoryPackage ePackage, BundleContext ctx){
		GDPRReportHistoryEPackageConfigurator packageConfigurator = new GDPRReportHistoryEPackageConfigurator(ePackage);
		// register the EPackageConfigurator
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		ePackageConfiguratorRegistration = ctx.registerService(EPackageConfigurator.class, packageConfigurator, properties);

		return packageConfigurator;
	}

	/**
	 * Registers the GDPRReportHistoryResourceFactoryImpl as a service.
	 *
	 * @generated
	 */
	private void registerResourceFactoryService(BundleContext ctx){
		GDPRReportHistoryResourceFactoryImpl factory = new GDPRReportHistoryResourceFactoryImpl();
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(factory.getServiceProperties());
		String[] serviceClasses = new String[] {GDPRReportHistoryResourceFactoryImpl.class.getName(), Factory.class.getName()};
		resourceFactoryRegistration = ctx.registerService(serviceClasses, factory, properties);
	}

	/**
	 * Registers the GDPRReportHistoryPackage as a service.
	 *
	 * @generated
	 */
	private void registerEPackageService(GDPRReportHistoryPackage ePackage, GDPRReportHistoryEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {GDPRReportHistoryPackage.class.getName(), EPackage.class.getName()};
		packageRegistration = ctx.registerService(serviceClasses, ePackage, properties);
	}

	/**
	 * Registers the GDPRReportHistoryFactory as a service.
	 *
	 * @generated
	 */
	private void registerEFactoryService(GDPRReportHistoryPackage ePackage, GDPRReportHistoryEPackageConfigurator packageConfigurator, BundleContext ctx){
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		String[] serviceClasses = new String[] {GDPRReportHistoryFactory.class.getName(), EFactory.class.getName()};
		eFactoryRegistration = ctx.registerService(serviceClasses, ePackage.getGDPRReportHistoryFactory(), properties);
	}

	private void registerConditionService(GDPRReportHistoryEPackageConfigurator packageConfigurator, BundleContext ctx){
		// register the EPackage
		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.putAll(packageConfigurator.getServiceProperties());
		properties.put(Condition.CONDITION_ID, GDPRReportHistoryPackage.eNS_URI);
		conditionRegistration = ctx.registerService(Condition.class, Condition.INSTANCE, properties);
	}

	/**
	 * Deactivates and unregisters everything.
	 *
	 * @generated
	 */
	@Deactivate
	public void deactivate() {
		conditionRegistration.unregister();
		eFactoryRegistration.unregister();
		packageRegistration.unregister();
		resourceFactoryRegistration.unregister();

		ePackageConfiguratorRegistration.unregister();
		EPackage.Registry.INSTANCE.remove(GDPRReportHistoryPackage.eNS_URI);
	}
}
