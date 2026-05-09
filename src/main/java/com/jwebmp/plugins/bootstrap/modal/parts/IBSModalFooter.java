package com.jwebmp.plugins.bootstrap.modal.parts;

import com.jwebmp.plugins.bootstrap.buttons.BSButton;

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
