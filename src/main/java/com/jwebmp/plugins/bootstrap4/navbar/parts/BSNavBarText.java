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
package com.jwebmp.plugins.bootstrap4.navbar.parts;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.plugins.bootstrap4.navbar.enumerations.BSNavBarOptions;
import com.jwebmp.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;

/**
 * Text
 * <p>
 * Navbars may contain bits of text with the help of .navbar-text. This class adjusts vertical alignment and horizontal spacing for strings
 * of text.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSNavBarText
		extends Span<GlobalChildren, NoAttributes,BSNavBarText>
		implements BSNavBarChildren
{
	/**
	 * Text
	 * <p>
	 * Navbars may contain bits of text with the help of .navbar-text. This class adjusts vertical alignment and horizontal spacing for
	 * strings of text.
	 */
	public BSNavBarText()
	{
		addClass(BSNavBarOptions.Text);

	}

	public BSNavBarText(String text)
	{
		super(text);
		addClass(BSNavBarOptions.Text);

	}
}
