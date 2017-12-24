package za.co.mmagon.jwebswing.plugins.bootstrap.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSBackgroundOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowDarkInfo<J extends BSTableRowDarkInfo<J>> extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 *
	 * @param tableRowClass
	 */
	public BSTableRowDarkInfo()
	{
		super(BSBackgroundOptions.Bg_Info);
	}
}
