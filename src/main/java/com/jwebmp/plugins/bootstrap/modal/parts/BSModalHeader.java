package com.jwebmp.plugins.bootstrap.modal.parts;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap.close.BSCloseIcon;
import com.jwebmp.plugins.bootstrap.modal.BSModalChildren;
import com.jwebmp.plugins.bootstrap.modal.BSModalOptions;

/**
 * Modal
 * Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for lightboxes, user notifications, or completely custom content.
 *
 * @param <J>
 */
public class BSModalHeader<J extends BSModalHeader<J>>
		extends DivSimple<J>
		implements IBSModalHeader<J>, BSModalChildren
{
	/**
	 * Constructs a new BS Modal Header
	 */
	public BSModalHeader()
	{
		addClass(BSModalOptions.Modal_Header);
	}
	
	/**
	 * A more compact view
	 *
	 * @return
	 */
	public IBSModalHeader<J> asMe()
	{
		return this;
	}
	
	/**
	 * Adds a new title to the header
	 *
	 * @param title
	 * @return
	 */
	@Override
	public BSModalTitle<?> addTitle(String title)
	{
		BSModalTitle<?> modalTitle = new BSModalTitle<>();
		modalTitle.setText(title);
		add(modalTitle);
		return modalTitle;
	}
	
	public Button<?, ?, ?, ?, ?> addDismissIcon()
	{
		var button = createDismissIcon();
		add(button);
		return button;
	}
	
	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	public Button<?, ?, ?, ?, ?> createDismissIcon()
	{
		Button<?, ?, ?, ?, ?> button = new Button<>();
		button.addClass("btn-close");
		button.addAttribute("aria-label", "Close");
		button.addAttribute("(click)", "modal.dismiss('Cross Click')");
		return button;
	}
	
}

