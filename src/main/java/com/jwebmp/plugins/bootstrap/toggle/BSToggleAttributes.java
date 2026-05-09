package com.jwebmp.plugins.bootstrap.toggle;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 */
public enum BSToggleAttributes
		implements AttributeDefinitions
{
	Data_Toggle,
	Data_Target,
	Visibility;

	private boolean isKeyword;

	BSToggleAttributes()
	{
	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

	@Override
	public boolean isKeyword()
	{
		return isKeyword;
	}
}
