package com.jwebmp.plugins.bootstrap.cards.parts;

import com.jwebmp.core.base.html.HeaderText;
import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap.options.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;
import jakarta.validation.constraints.NotNull;

/**
 * Subtitles are used by adding a .card-subtitle to an h* tag.
 * <p>
 * If the .card-title and the .card-subtitle items are placed in a .card-block item, the card title and subtitle are aligned nicely.
 * <p>
 * The multiple content types can be easily combined to create the card you need. See below for an example.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardSubtitle<J extends BSCardSubtitle<J>>
		extends HeaderText<J>
		implements BSCardChildren, IBSLayout<J>
{


	/**
	 * Subtitles are used by adding a .card-subtitle to an h* tag.
	 * <p>
	 * If the .card-title and the .card-subtitle items are placed in a .card-block item, the card title and subtitle are aligned nicely.
	 * <p>
	 * The multiple content types can be easily combined to create the card you need. See below for an example.
	 */
	public BSCardSubtitle()
	{
		this(HeaderTypes.H6, "");
	}

	/**
	 * Subtitles are used by adding a .card-subtitle to an h* tag.
	 * <p>
	 * If the .card-title and the .card-subtitle items are placed in a .card-block item, the card title and subtitle are aligned nicely.
	 * <p>
	 * The multiple content types can be easily combined to create the card you need. See below for an example.
	 *
	 * @param headerType
	 * @param text
	 */
	public BSCardSubtitle(HeaderTypes headerType, String text)
	{
		super(headerType, text);
		addClass(BSCardOptions.Card_Subtitle);
		addClass(BSTypographyOptions.Text_Muted);
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
}
