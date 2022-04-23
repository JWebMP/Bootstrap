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
package com.jwebmp.plugins.bootstrap.navs.parts;

import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.children.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;

/**
 * A navigation link item
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSNavContent<J extends BSNavContent<J>>
		extends Link<J>
		implements BSNavsChildren, ListItemChildren
{
	/**
	 * A navigation link contents
	 */
	public BSNavContent()
	{
		setTag("ng-template");
		addAttribute("ngbNavContent", "");
	}
	
	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
