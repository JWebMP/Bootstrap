package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.interfaces;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardBlockQuote;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardBlockQuoteFooter;

import javax.validation.constraints.NotNull;
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
