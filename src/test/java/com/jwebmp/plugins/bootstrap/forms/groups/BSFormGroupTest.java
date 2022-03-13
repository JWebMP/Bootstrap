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

package com.jwebmp.plugins.bootstrap.forms.groups;

import com.jwebmp.core.base.html.Italic;
import com.jwebmp.core.base.html.inputs.InputTextType;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;
import org.junit.jupiter.api.Test;

public class BSFormGroupTest

{
	@Test
	public void testGetLabel()
	{
		BSFormGroup group = new BSFormGroup();
		group.addLabel("THis is the label");
		System.out.println(group.toString(0));
	}


	@Test
	public void testgetAppend()
	{
		BSFormInputGroup<?,InputTextType<?>> group = new BSFormInputGroup<>();
		group.setInput(new InputTextType<>());
		group.append(new Italic<>().addClass("fa fa-icon"));

		group.addLabel("THis is the label");
		System.out.println(group.toString(0));
	}

	@Test
	public void testGetPrepend()
	{
		BSFormInputGroup<?,InputTextType<?>> group = new BSFormInputGroup<>();
		group.setInput(new InputTextType<>());
		group.prepend(new Italic<>().addClass("fa fa-icon"));

		group.addLabel("THis is the label");
		System.out.println(group.toString(0));
	}

}
