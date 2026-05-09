package com.jwebmp.plugins.bootstrap.modal.parts;

import com.jwebmp.plugins.bootstrap.close.BSCloseIcon;

public interface IBSModalHeader<J extends BSModalHeader<J>>
{
	BSModalTitle<?> addTitle();
	
	/**
	 * Adds a new title to the header
	 *
	 * @param title
	 *
	 * @return
	 */
	BSModalTitle<?> addTitle(String title);
	
}
