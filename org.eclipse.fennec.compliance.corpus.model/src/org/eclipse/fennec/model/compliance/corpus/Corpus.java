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
package org.eclipse.fennec.model.compliance.corpus;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corpus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract supertype of every normative text. One instance holds one version of one text.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getWorkId <em>Work Id</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getVersion <em>Version</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getLicence <em>Licence</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getAttribution <em>Attribution</em>}</li>
 *   <li>{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getCrossReferences <em>Cross References</em>}</li>
 * </ul>
 *
 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus()
 * @model abstract="true"
 * @generated
 */
@ProviderType
public interface Corpus extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of this rendering: workId plus language, e.g. 02016R0679-20160504-DE. Unique within a context, so one context can carry several language versions of the same text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Work Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Identifier of the text independent of language: the CELEX number for an EU act (02016R0679-20160504 for a consolidation), the catalog UUID for an OSCAL catalog, the document number for a technical document (TR-03183-2). All language versions share it, and their units share the citationIds, so the same citation resolves in the version of the reader's language.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Work Id</em>' attribute.
	 * @see #setWorkId(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_WorkId()
	 * @model
	 * @generated
	 */
	String getWorkId();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getWorkId <em>Work Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Work Id</em>' attribute.
	 * @see #getWorkId()
	 * @generated
	 */
	void setWorkId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Official title of the text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Language of this rendering, e.g. EN or DE. Citation identifiers are language independent.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Language</em>' attribute.
	 * @see #setLanguage(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_Language()
	 * @model
	 * @generated
	 */
	String getLanguage();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getLanguage <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Language</em>' attribute.
	 * @see #getLanguage()
	 * @generated
	 */
	void setLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version of the text: consolidation date (yyyyMMdd) for a legal act, metadata version for an OSCAL catalog, document version or date for a technical document.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Where the text was obtained, as a URI.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Licence</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Licence of the text, as SPDX identifier where one exists, e.g. CC-BY-SA-4.0. States why the text is missing when it may not be redistributed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Licence</em>' attribute.
	 * @see #setLicence(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_Licence()
	 * @model
	 * @generated
	 */
	String getLicence();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getLicence <em>Licence</em>}' attribute.
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
	 * The attribution the licence requires, to be shown wherever the text is shown.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribution</em>' attribute.
	 * @see #setAttribution(String)
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_Attribution()
	 * @model
	 * @generated
	 */
	String getAttribution();

	/**
	 * Sets the value of the '{@link org.eclipse.fennec.model.compliance.corpus.Corpus#getAttribution <em>Attribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribution</em>' attribute.
	 * @see #getAttribution()
	 * @generated
	 */
	void setAttribution(String value);

	/**
	 * Returns the value of the '<em><b>Cross References</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.fennec.model.compliance.corpus.CrossReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Every citation found in the text, one entry per occurrence.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cross References</em>' containment reference list.
	 * @see org.eclipse.fennec.model.compliance.corpus.CorpusPackage#getCorpus_CrossReferences()
	 * @model containment="true"
	 * @generated
	 */
	EList<CrossReference> getCrossReferences();

} // Corpus
