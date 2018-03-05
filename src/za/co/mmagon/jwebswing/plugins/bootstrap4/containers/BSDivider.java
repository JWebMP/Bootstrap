package za.co.mmagon.jwebswing.plugins.bootstrap4.containers;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSColumnOptions;

/**
 * Constructs a new divider for columns in a singualr row
 *
 * @param <J>
 */
public class BSDivider<J extends BSDivider<J>>
		extends DivSimple<J>
{
	/**
	 * Constructs a new divider for columns in a singualr row
	 */
	public BSDivider()
	{
		addClass(BSColumnOptions.W_100);
	}

}
