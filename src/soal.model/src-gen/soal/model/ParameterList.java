/**
 */
package soal.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Parameter List</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link soal.model.ParameterList#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see soal.model.SoalModelPackage#getParameterList()
 * @model
 * @generated
 */
public interface ParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference
	 * list. The list contents are of type {@link soal.model.Parameter}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see soal.model.SoalModelPackage#getParameterList_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // ParameterList
