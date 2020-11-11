package com.jwebmp.plugins.bootstrap4.cards.parts.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardBlockQuote;
import com.jwebmp.plugins.bootstrap4.cards.parts.BSCardBlockQuoteFooter;

import jakarta.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSCardBlockQuote<J extends BSCardBlockQuote<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Adds a footer to the block quote
	 *
	 * @param footer
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	BSCardBlockQuoteFooter<?> addFooter(String footer);
}
