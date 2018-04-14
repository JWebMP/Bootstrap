package com.jwebmp.plugins.bootstrap4.tables;

import com.jwebmp.plugins.bootstrap4.options.BSBackgroundOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowDarkSuccess<J extends BSTableRowDarkSuccess<J>>
		extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 */
	public BSTableRowDarkSuccess()
	{
		super(BSBackgroundOptions.Bg_Success);
	}
}
