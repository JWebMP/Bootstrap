package com.jwebmp.plugins.bootstrap4.tables;

import com.jwebmp.plugins.bootstrap4.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowSuccess<J extends BSTableRowSuccess<J>>
		extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 */
	public BSTableRowSuccess()
	{
		super(BSTableOptions.Table_Success);
	}
}
