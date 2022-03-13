package com.jwebmp.plugins.bootstrap.tables;

import com.jwebmp.plugins.bootstrap.options.BSTableOptions;

/**
 * A dark themed table
 *
 * @param <J>
 */
public class BSTableDark<J extends BSTableDark<J>>
		extends BSTable<J>
{
	/**
	 * A dark themed table
	 */
	public BSTableDark()
	{
		addClass(BSTableOptions.Table_Dark);
	}
}
