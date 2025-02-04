/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.dr.dataRetrieval;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keys To Extract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.dr.dataRetrieval.KeysToExtract#getKey1 <em>Key1</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.dr.dataRetrieval.DataRetrievalPackage#getKeysToExtract()
 * @model
 * @generated
 */
public interface KeysToExtract extends EObject
{
  /**
   * Returns the value of the '<em><b>Key1</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.dr.dataRetrieval.Key}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key1</em>' containment reference list.
   * @see org.xtext.example.dr.dataRetrieval.DataRetrievalPackage#getKeysToExtract_Key1()
   * @model containment="true"
   * @generated
   */
  EList<Key> getKey1();

} // KeysToExtract
