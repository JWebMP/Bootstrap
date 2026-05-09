package com.jwebmp.plugins.bootstrap.dropdown.parts;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.dropdown.options.*;

/**
 * Menu headers
 * <p>
 * Add a header to label sections of actions in any dropdown menu.
 *
 * @author GedMarc
 * @since 14 Jan 2017
 */
public class BSDropDownHeader<J extends BSDropDownHeader<J>>
		extends H6<J>
{
	/**
	 * Menu headers
	 * <p>
	 * Add a header to label sections of actions in any dropdown menu.
	 *
	 * @param text
	 */
	public BSDropDownHeader(String text)
	{
		this();
		setText(text);
	}

	public BSDropDownHeader()
	{
		dropdownConfig();
	}

	/**
	 * Sets tag to h6 and applies classes
	 */
	private void dropdownConfig()
	{
		addClass(BSDropDownOptions.Dropdown_Header);
	}
}
