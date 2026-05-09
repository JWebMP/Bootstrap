package com.jwebmp.plugins.bootstrap.breadcrumbs;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * @author GedMarc
 */
enum BSBreadcrumbsAttributes
		implements AttributeDefinitions
{
	Visibility;

	private boolean isKeyword;

	BSBreadcrumbsAttributes()
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
		             .replace(CHAR_UNDERSCORE, CHAR_DASH)
		             .replace("$", STRING_EMPTY);
	}
}
