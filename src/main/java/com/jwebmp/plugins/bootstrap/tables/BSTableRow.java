package com.jwebmp.plugins.bootstrap.tables;

import com.jwebmp.core.base.html.TableRow;
import com.jwebmp.plugins.bootstrap.options.BSBackgroundOptions;
import com.jwebmp.plugins.bootstrap.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public class BSTableRow<J extends BSTableRow<J>>
		extends TableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRow(BSTableOptions tableRowClass)
	{
		addClass(tableRowClass);
	}

	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRow(BSBackgroundOptions tableRowClass)
	{
		addClass(tableRowClass);
	}
}
