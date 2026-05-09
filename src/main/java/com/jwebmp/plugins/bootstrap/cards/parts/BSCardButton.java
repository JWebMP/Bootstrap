package com.jwebmp.plugins.bootstrap.cards.parts;

import com.jwebmp.core.base.html.attributes.LinkAttributes;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap.cards.parts.interfaces.IBSCardButton;
import com.jwebmp.plugins.bootstrap.options.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;

import jakarta.validation.constraints.NotNull;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSCardButton<J extends BSCardButton<J>>
		extends BSButton<J>
		implements BSCardChildren, IBSCardButton<J>
{
	/**
	 * Constructs a new card button (a link behaving as a button)
	 */
	public BSCardButton()
	{
		setTag("a");
		addAttribute(LinkAttributes.HRef.toString(), STRING_HASH);
	}

	/**
	 * Constructs a new card button (a link behaving as a button)
	 *
	 * @param text
	 */
	public BSCardButton(String text)
	{
		super(text);
		setTag("a");
		addAttribute(LinkAttributes.HRef.toString(), StaticStrings.STRING_HASH);
	}

	/**
	 * Sets the style with button options
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	@Override	@SuppressWarnings("unchecked")
	public J setStyle(BSButtonOptions buttonOptions)
	{
		addClass(buttonOptions);
		return (J) this;
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
