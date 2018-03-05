package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardHeader;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardHeaderNav;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSCardHeader<J extends BSCardHeader<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>, IBSLayout<J>
{
	/**
	 * Adds a new tabbed header navigation item
	 *
	 * @return
	 */
	BSCardHeaderNav<?> addTabHeader();

	/**
	 * Adds a new tab header with a non null list of string headers
	 *
	 * @param headers
	 *
	 * @return
	 */
	BSCardHeaderNav<?> addTabHeader(@NotNull String[] headers);
}
