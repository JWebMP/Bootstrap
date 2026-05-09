package com.jwebmp.plugins.bootstrap.cards.parts;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.plugins.bootstrap.cards.BSCardChildren;
import com.jwebmp.plugins.bootstrap.cards.BSCardOptions;
import com.jwebmp.plugins.bootstrap.options.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;
import jakarta.validation.constraints.NotNull;

/**
 * In the same way, links are added and placed next to each other by adding .card-link to an a tag.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public class BSCardLink<J extends BSCardLink<J>>
		extends Link<J>
		implements BSCardChildren, IBSLayout<J>
{


	/**
	 * In the same way, links are added and placed next to each other by adding .card-link to a &lt;a&gt; tag.
	 */
	public BSCardLink()
	{
		addClass(BSCardOptions.Card_Link);
	}

	/**
	 * In the same way, links are added and placed next to each other by adding .card-link to a &lt;a&gt; tag.
	 *
	 * @param directToAddress
	 */
	public BSCardLink(String directToAddress)
	{
		super(directToAddress);
		addClass(BSCardOptions.Card_Link);
	}

	/**
	 * In the same way, links are added and placed next to each other by adding .card-link to a &lt;a&gt; tag.
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 */
	public BSCardLink(String directToAddress, String targetFrameName)
	{
		super(directToAddress, targetFrameName);
		addClass(BSCardOptions.Card_Link);
	}

	/**
	 * In the same way, links are added and placed next to each other by adding .card-link to a &lt;a&gt; tag.
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 * @param text
	 */
	public BSCardLink(String directToAddress, String targetFrameName, String text)
	{
		super(directToAddress, targetFrameName, text);
		addClass(BSCardOptions.Card_Link);
	}

	/**
	 * In the same way, links are added and placed next to each other by adding .card-link to a &lt;a&gt; tag.
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 * @param component
	 */
	public BSCardLink(String directToAddress, String targetFrameName, ComponentHierarchyBase component)
	{
		super(directToAddress, targetFrameName, component);
		addClass(BSCardOptions.Card_Link);
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
