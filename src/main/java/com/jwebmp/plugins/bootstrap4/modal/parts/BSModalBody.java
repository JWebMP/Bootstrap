package com.jwebmp.plugins.bootstrap4.modal.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap4.modal.BSModalOptions;

/**
 * Modal
 * Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for lightboxes, user notifications, or completely custom content.
 *
 * @param <J>
 */
public class BSModalBody<J extends BSModalBody<J>>
		extends DivSimple<J>
{
	/**
	 * Constructs a new BS Modal Header
	 */
	public BSModalBody()
	{
		addClass(BSModalOptions.Modal_Body);
	}

}

