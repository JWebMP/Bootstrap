package za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.BSModalOptions;

/**
 * Modal
 * Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for lightboxes, user notifications, or completely custom content.
 *
 * @param <J>
 */
public class BSModalTitle<J extends BSModalTitle<J>>
		extends DivSimple<J>
{
	/**
	 * Constructs a new BS Modal Header
	 */
	public BSModalTitle()
	{
		addClass(BSModalOptions.Modal_Title);
	}

}

