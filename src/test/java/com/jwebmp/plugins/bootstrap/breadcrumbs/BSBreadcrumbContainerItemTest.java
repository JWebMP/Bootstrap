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
package com.jwebmp.plugins.bootstrap.breadcrumbs;

import org.junit.jupiter.api.Test;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * @author GedMarc
 */
public class BSBreadcrumbContainerItemTest
{

	public BSBreadcrumbContainerItemTest()
	{
	}

	@Test
	public void testGetCrumbLink()
	{
		BSBreadCrumbItem crumbs = new BSBreadCrumbItem();
		System.out.println(crumbs.toString(true));
	}

	@Test
	public void testSetCrumbLink()
	{
		BSBreadCrumbItem crumbs = new BSBreadCrumbItem(new BSBreadCrumbLink(STRING_HASH));
		System.out.println(crumbs.toString(true));

		crumbs.setActive(true);

		System.out.println(crumbs.toString(true));
	}

}
