package com.jwebmp.plugins.bootstrap.select;

import com.jwebmp.core.base.html.Select;

import static com.jwebmp.plugins.bootstrap.select.BSSelectSizes.*;

/**
 * Custom Select Menu
 * To create a custom select menu, add the .custom-select class to the <select> element:
 *
 * Custom Select Menu Size
 * Use the .custom-select-sm class to create a small select menu and the .custom-select-lg class for a large one:
 *
 *
 * @param <J>
 */
public class BSSelect<J extends BSSelect<J>>
		extends Select<J>
{
	private BSSelectSizes size;

	public BSSelect()
	{
		this(Normal);
	}

	public BSSelect(BSSelectSizes size)
	{
		this.size = size;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			addClass(size);
		}
		super.preConfigure();
	}

	/**
	 * Getter for property 'size'.
	 *
	 * @return Value for property 'size'.
	 */
	public BSSelectSizes getSize()
	{
		return size;
	}

	/**
	 * Setter for property 'size'.
	 *
	 * @param size
	 * 		Value to set for property 'size'.
	 */
	public BSSelect<J> setSize(BSSelectSizes size)
	{
		this.size = size;
		return this;
	}
}
