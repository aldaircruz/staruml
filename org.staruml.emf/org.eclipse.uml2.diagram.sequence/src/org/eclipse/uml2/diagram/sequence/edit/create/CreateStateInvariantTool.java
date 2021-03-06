package org.eclipse.uml2.diagram.sequence.edit.create;

import org.eclipse.gef.Request;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.edit.parts.StateInvariantEditPart;
import org.eclipse.uml2.diagram.sequence.part.UMLVisualIDRegistry;


public class CreateStateInvariantTool extends AbstractCreateSDElementTool {
	protected Request createTargetRequest() {
		return new CreateStateInvariantRequest(getPreferencesHint());
	}
	
	protected boolean shouldSelect(View view){
		return StateInvariantEditPart.VISUAL_ID == UMLVisualIDRegistry.getVisualID(view);
	}	
}
