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
package za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.toolbars;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.groups.BSButtonGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.styles.BSButtonSuccess;

/**
 * @author GedMarc
 */
public class BSButtonToolbarTest
		extends BaseTestClass
{

	public BSButtonToolbarTest()
	{
	}

	@Test
	public void testToolbar()
	{
		BSButtonToolbar bbt = new BSButtonToolbar();
		bbt.setID("toolbar");
		System.out.println(bbt.toString(true));

		BSButtonGroup group = new BSButtonGroup();
		group.setID("group");
		bbt.add(group);
		System.out.println(bbt.toString(true));

		BSButtonSuccess bbs = new BSButtonSuccess();
		bbs.setID("button");

		System.out.println(bbt.toString(true));

	}
}