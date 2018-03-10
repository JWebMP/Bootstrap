package za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.modal.BSModalOptions;

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
		button.addAttribute("data-toggle", "modal");
		add(button);
		return button;
	}
}

