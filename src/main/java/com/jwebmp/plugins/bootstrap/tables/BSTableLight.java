package com.jwebmp.plugins.bootstrap.tables;

import com.jwebmp.plugins.bootstrap.options.BSTableOptions;

/**
 * A dark themed table
 *
 * @param <J>
 */
public class BSTableLight<J extends BSTableLight<J>>
		extends BSTable<J>
{
	/**
	 * A dark themed table
	 */
	public BSTableLight()
	{
		addClass(BSTableOptions.Table_Light);
	}
}
