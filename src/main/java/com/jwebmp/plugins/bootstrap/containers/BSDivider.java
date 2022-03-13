package com.jwebmp.plugins.bootstrap.containers;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.options.BSColumnOptions;

/**
 * Constructs a new divider for columns in a singualr row
 *
 * @param <J>
 */
public class BSDivider<J extends BSDivider<J>>
		extends DivSimple<J>
{
	/**
	 * Constructs a new divider for columns in a singualr row
	 */
	public BSDivider()
	{
		addClass(BSColumnOptions.W_100);
	}

}
