package com.jwebmp.plugins.bootstrap.cards;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Cards
 * <p>
 * A card is a flexible and extensible content container. It includes options for headers and footers, a wide variety of content, contextual
 * background colors, and powerful display options.
 * <p>
 * If you’re familiar with Bootstrap 3, cards replace our old panels, wells, and thumbnails. Similar functionality to those components is
 * available as modifier classes for cards.
 *
 * @author GedMarc
 */
public enum BSCardAttributes
		implements AttributeDefinitions
{
	Visibility;

	private boolean isKeyword;

	BSCardAttributes()
	{
	}

	@Override
	public boolean isKeyword()
	{
		return isKeyword;
	}

	/**
	 * Returns the attribute name replacing all underscores with dashes and all dollar signs to empty
	 *
	 * @return
	 */
	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH)
		             .replace("$", "");
	}
}
