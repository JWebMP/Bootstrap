/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap.toggle;

import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.guicedee.guicedinjection.json.StaticStrings;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

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