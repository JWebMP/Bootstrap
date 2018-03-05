package za.co.mmagon.jwebswing.plugins.bootstrap4.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowPrimary<J extends BSTableRowPrimary<J>>
		extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 */
	public BSTableRowPrimary()
	{
		super(BSTableOptions.Table_Primary);
	}
}
