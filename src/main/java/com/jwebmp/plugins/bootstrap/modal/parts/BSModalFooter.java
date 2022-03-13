package com.jwebmp.plugins.bootstrap.modal.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.modal.BSModalOptions;

/**
 * Modal
 * Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for lightboxes, user notifications, or completely custom content.
 *
 * @param <J>
 */
public class BSModalFooter<J extends BSModalFooter<J>>
		extends DivSimple<J>
		implements IBSModalFooter<J>
{
	/**
	 * Constructs a new BS Modal Header
	 */
	public BSModalFooter()
	{
		addClass(BSModalOptions.Modal_Footer);
	}

	/**
	 * The neater view
	 *
	 * @return
	 */
	public IBSModalFooter<J> asMe()
	{
		return this;
	}

	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	@Override
	public BSButton<?> addDismissButton()
	{
		BSButton<?> button = new BSButton<>();
		button.setText("Close");
		button.addAttribute("data-dismiss", "modal");
		add(button);
		return button;
	}
}

