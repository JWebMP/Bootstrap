package za.co.mmagon.jwebswing.plugins.bootstrap.tables;

import za.co.mmagon.jwebswing.base.html.TableRow;
import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSBackgroundOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap.options.BSTableOptions;

/**
 * A pre-defined row context
 *
 * @param <J>
 */
public abstract class BSTableRow<J extends BSTableRow<J>> extends TableRow<J>
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
