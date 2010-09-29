package org.eclipse.uml2.diagram.clazz.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.common.ui.URIEditorInput;

/**
 * @generated
 */
public class UMLUriEditorInputTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args, Object expectedValue) {
		if (false == receiver instanceof URIEditorInput) {
			return false;
		}
		URIEditorInput editorInput = (URIEditorInput) receiver;
		return "umlclass".equals(editorInput.getURI().fileExtension()) //$NON-NLS-1$
				|| "umlclass_diagram".equals(editorInput.getURI().fileExtension()) //$NON-NLS-1$
		;
	}

}
