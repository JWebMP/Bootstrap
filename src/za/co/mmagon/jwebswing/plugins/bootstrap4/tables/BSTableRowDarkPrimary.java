package za.co.mmagon.jwebswing.plugins.bootstrap4.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSBackgroundOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowDarkPrimary<J extends BSTableRowDarkPrimary<J>>
		extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 */
	public BSTableRowDarkPrimary()
	{
		super(BSBackgroundOptions.Bg_Primary);
	}
}
