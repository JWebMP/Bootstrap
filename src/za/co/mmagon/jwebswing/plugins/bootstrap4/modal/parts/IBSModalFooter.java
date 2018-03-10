package za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts;

import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;

@FunctionalInterface
public interface IBSModalFooter<J extends BSModalFooter<J>>
{
	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	BSButton<?> addDismissButton();
}
