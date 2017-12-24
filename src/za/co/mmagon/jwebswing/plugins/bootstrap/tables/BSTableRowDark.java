package za.co.mmagon.jwebswing.plugins.bootstrap.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowDark<J extends BSTableRowDark<J>> extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRowDark()
	{
		super(BSTableOptions.Table_Light);
	}
}
