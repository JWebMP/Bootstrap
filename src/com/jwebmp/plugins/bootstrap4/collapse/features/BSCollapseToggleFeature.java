/*
 * Copyright (C) 2017 Marc Magon
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

package com.jwebmp.plugins.bootstrap4.collapse.features;

import com.jwebmp.Feature;
import com.jwebmp.base.ComponentHierarchyBase;
import com.jwebmp.htmlbuilder.javascript.JavaScriptPart;

/**
 * @param <J>
 */
public class BSCollapseToggleFeature<J extends BSCollapseToggleFeature<J>>
		extends Feature<JavaScriptPart, J>
{
	public BSCollapseToggleFeature(ComponentHierarchyBase component)
	{
		super("BSCollapseToggleFeature", component);
	}

	@Override
	protected void assignFunctionsToComponent()
	{
		addQuery(getComponent().getJQueryID() + "collapse('toggle');" + getNewLine());
	}

}
