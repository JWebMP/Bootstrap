package za.co.mmagon.jwebswing.plugins.bootstrap.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowWarning<J extends BSTableRowWarning<J>> extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRowWarning()
	{
		super(BSTableOptions.Table_Warning);
	}
}
