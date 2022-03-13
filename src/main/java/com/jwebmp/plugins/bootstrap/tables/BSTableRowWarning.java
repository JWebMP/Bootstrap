package com.jwebmp.plugins.bootstrap.tables;

import com.jwebmp.plugins.bootstrap.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowWarning<J extends BSTableRowWarning<J>>
		extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 */
	public BSTableRowWarning()
	{
		super(BSTableOptions.Table_Warning);
	}
}
