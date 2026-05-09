package com.jwebmp.plugins.bootstrap.cards.parts.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.cards.parts.BSCardHeader;
import com.jwebmp.plugins.bootstrap.cards.parts.BSCardHeaderNav;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;

import jakarta.validation.constraints.NotNull;
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
