package com.jwebmp.plugins.bootstrap.listgroup;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 */
public enum BSListGroupAttributes
		implements AttributeDefinitions
{
	Visibility;

	private boolean isKeyword;

	/**
	 * The component attributes
	 */
	BSListGroupAttributes()
	{
	}

	/**
	 * If the attribute is a keyword
	 *
	 * @return
	 */
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
