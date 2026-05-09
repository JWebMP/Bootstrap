package com.jwebmp.plugins.bootstrap.containers;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSAlignmentCapable;

import static com.jwebmp.plugins.bootstrap.options.BSColumnOptions.*;

/**
 * Shortcut for writing column Div's and spans for bootstrap
 *
 * @author GedMarc
 * @version 1.0
 * @since Oct 10, 2016
 */
public class BSColumn<J extends BSColumn<J>>
		extends DivSimple<J>
	implements IBSAlignmentCapable<J>,BSRowChildren
{


	/**
	 * Supply a list of column options for this div
	 *
	 * @param columnOptions
	 */
	public BSColumn(IBSComponentOptions... columnOptions)
	{
		addClass(Col);
		if (columnOptions != null)
		{
			for (IBSComponentOptions columnOption : columnOptions)
			{
				if (!("W_100".equalsIgnoreCase(columnOption.name()) || "col".equalsIgnoreCase(columnOption.name())))
				{
					removeClass(Col);
				}
				addClass(columnOption.toString());
			}
		}
	}

	/**
	 * Constructs a new instance with the given column options
	 *
	 * @param columnOptions
	 *
	 * @return
	 */
	public static BSColumn<?> newInstance(IBSComponentOptions... columnOptions)
	{
		return new BSColumn(columnOptions);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return false;
	}
}
