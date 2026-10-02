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
package org.eclipse.fennec.model.compliance.context;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.fennec.model.compliance.corpus.Corpus;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Compliance Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * One version of one compliance context. Stored as its own XMI in a model.atlas registry; reports and inventories refer to it by id and version.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getJurisdiction <em>Jurisdiction</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getReferenceLanguage <em>Reference Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getCorpora <em>Corpora</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getRequirementGroups <em>Requirement Groups</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getTaxonomies <em>Taxonomies</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext()
 * @model
 * @generated
 */
@ProviderType
public interface ComplianceContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stable identifier, e.g. gdpr, grundschutz-plusplus, iso27001, bsi-tr-03183.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Display name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of the context. A new consolidation of a corpus is a new version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What the context covers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.fennec.model.compliance.context.ContextKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * What kind of regime this is.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.context.ContextKind
	 * @see #setKind(ContextKind)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Kind()
	 * @model
	 * @generated
	 */
	ContextKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.fennec.model.compliance.context.ContextKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(ContextKind value);

	/**
	 * Returns the value of the '<em><b>Jurisdiction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the context applies, e.g. EU, DE.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jurisdiction</em>' attribute.
	 * @see #setJurisdiction(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Jurisdiction()
	 * @model
	 * @generated
	 */
	String getJurisdiction();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getJurisdiction <em>Jurisdiction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jurisdiction</em>' attribute.
	 * @see #getJurisdiction()
	 * @generated
	 */
	void setJurisdiction(String value);

	/**
	 * Returns the value of the '<em><b>Reference Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language of the corpus versions that requirements and categories cite, e.g. EN. Other language versions of the same work resolve the same citationIds for display.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Language</em>' attribute.
	 * @see #setReferenceLanguage(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_ReferenceLanguage()
	 * @model
	 * @generated
	 */
	String getReferenceLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getReferenceLanguage <em>Reference Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Language</em>' attribute.
	 * @see #getReferenceLanguage()
	 * @generated
	 */
	void setReferenceLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence of the context data. For a context without corpus (ISO 27001), states why.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licence</em>' attribute.
	 * @see #setLicence(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Licence()
	 * @model
	 * @generated
	 */
	String getLicence();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getLicence <em>Licence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Licence</em>' attribute.
	 * @see #getLicence()
	 * @generated
	 */
	void setLicence(String value);

	/**
	 * Returns the value of the '<em><b>Attribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The attribution the licences of the context and its corpora require.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribution</em>' attribute.
	 * @see #setAttribution(String)
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Attribution()
	 * @model
	 * @generated
	 */
	String getAttribution();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.context.ComplianceContext#getAttribution <em>Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribution</em>' attribute.
	 * @see #getAttribution()
	 * @generated
	 */
	void setAttribution(String value);

	/**
	 * Returns the value of the '<em><b>Corpora</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.Corpus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The texts this context cites. Empty when the text may not be redistributed; the requirements then carry our own titles and paraphrases.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corpora</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Corpora()
	 * @model containment="true"
	 * @generated
	 */
	EList<Corpus> getCorpora();

	/**
	 * Returns the value of the '<em><b>Requirement Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.RequirementGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Structure of the requirements, e.g. the practices of Grundschutz++ or the chapters of a TR.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirement Groups</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_RequirementGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementGroup> getRequirementGroups();

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements not held by a group.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Requirements</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Requirements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirements();

	/**
	 * Returns the value of the '<em><b>Taxonomies</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.Taxonomy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Classifications of this context: data categories, lawful bases, target object types, risk classes, mechanisms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taxonomies</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Taxonomies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Taxonomy> getTaxonomies();

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.context.Role}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Roles the context names, e.g. data protection officer, CISO.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.context.ContextPackage#getComplianceContext_Roles()
	 * @model containment="true"
	 * @generated
	 */
	EList<Role> getRoles();

} // ComplianceContext
