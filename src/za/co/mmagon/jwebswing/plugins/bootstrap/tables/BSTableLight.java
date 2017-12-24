package za.co.mmagon.jwebswing.plugins.bootstrap.tables;

import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSTableOptions;

/**
 * A dark themed table
 *
 * @param <J>
 */
public class BSTableLight<J extends BSTableLight<J>> extends BSTable<J>
{
	/**
	 * A dark themed table
	 */
	public BSTableLight()
	{
		addClass(BSTableOptions.Table_Light);
	}
}
