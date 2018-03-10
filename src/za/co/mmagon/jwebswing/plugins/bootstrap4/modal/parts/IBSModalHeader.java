package za.co.mmagon.jwebswing.plugins.bootstrap4.modal.parts;

import za.co.mmagon.jwebswing.plugins.bootstrap4.close.BSCloseIcon;

public interface IBSModalHeader<J extends BSModalHeader<J>>
{
	/**
	 * Adds a new title to the header
	 *
	 * @param title
	 *
	 * @return
	 */
	BSModalTitle<?> addTitle(String title);

	/**
	 * Adds the dismiss button to the modal
	 *
	 * @return
	 */
	BSCloseIcon<?> addDissmissIcon();
}
