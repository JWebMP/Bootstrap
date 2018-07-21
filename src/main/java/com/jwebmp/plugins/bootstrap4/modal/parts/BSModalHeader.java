package com.jwebmp.plugins.bootstrap4.modal.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap4.close.BSCloseIcon;
import com.jwebmp.plugins.bootstrap4.modal.BSModalOptions;

/**
 * Modal
 * Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for lightboxes, user notifications, or completely custom content.
 *
 * @param <J>
 */
public class BSModalHeader<J extends BSModalHeader<J>>
		extends DivSimple<J>
		implements IBSModalHeader<J>
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
	 *
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

	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	@Override
	public BSCloseIcon<?> addDissmissIcon()
	{
		BSCloseIcon icon = new BSCloseIcon<>().setDismissModel();
		add(icon);
		return icon;
	}

}

