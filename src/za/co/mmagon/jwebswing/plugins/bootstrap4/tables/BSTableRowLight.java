package za.co.mmagon.jwebswing.plugins.bootstrap4.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRowLight<J extends BSTableRowLight<J>>
		extends BSTableRow<J>
{
	/**
	 * Creates a table row class with the given context
	 */
	public BSTableRowLight()
	{
		super(BSTableOptions.Table_Light);
	}
}
