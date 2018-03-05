package za.co.mmagon.jwebswing.plugins.bootstrap4.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSTableOptions;

/**
 * A dark themed table
 *
 * @param <J>
 */
public class BSTableDark<J extends BSTableDark<J>>
		extends BSTable<J>
{
	/**
	 * A dark themed table
	 */
	public BSTableDark()
	{
		addClass(BSTableOptions.Table_Dark);
	}
}
