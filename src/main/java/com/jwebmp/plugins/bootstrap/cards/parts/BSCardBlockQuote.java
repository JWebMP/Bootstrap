package com.jwebmp.plugins.bootstrap.cards.parts;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap.cards.parts.interfaces.IBSCardBlockQuote;
import com.jwebmp.plugins.bootstrap.options.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;
import jakarta.validation.constraints.NotNull;

/**
 * Block quote format for inside a bootstrap card
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardBlockQuote<J extends BSCardBlockQuote<J>>
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements BSCardChildren, IBSCardBlockQuote<J>, IBSLayout<J>
{


	/**
	 * Block quote format for inside a bootstrap card
	 */
	public BSCardBlockQuote()
	{
		addClass(BSCardOptions.BlockQuote);
		setTag("blockquote");
	}

	/**
	 * Adds a footer to the block quote
	 *
	 * @param footer
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSCardBlockQuoteFooter<?> addFooter(String footer)
	{
		BSCardBlockQuoteFooter<?> footer1 = new BSCardBlockQuoteFooter<>();
		footer1.setText(footer);
		add(footer1);
		return footer1;
	}

	/**
	 * Returns as me
	 *
	 * @return
	 */
	public IBSCardBlockQuote<J> asMe()
	{
		return this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBackground(BSBackgroundOptions backgroundOptions)
	{
		addClass(backgroundOptions);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addForeground(BSColoursOptions coloursOptions)
	{
		addClass(coloursOptions);
		return (J) this;
	}

	/**
	 * Sets the margins (without checking for previous applied)
	 *
	 * @param margin
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addMargin(BSMarginOptions margin)
	{
		addClass(margin);
		return (J) this;
	}

	/**
	 * Applies the padding to the card
	 *
	 * @param padding
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addPadding(BSPaddingOptions padding)
	{
		addClass(padding);
		return (J) this;
	}

	/**
	 * Sets the border to the correct structure
	 *
	 * @param border
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBorder(BSBorderOptions border)
	{
		addClass(border);
		return (J) this;
	}

	/**
	 * Returns the Bootstrap layout options
	 *
	 * @return
	 */
	@Override
	public IBSLayout<J> asLayout()
	{
		return this;
	}
}
