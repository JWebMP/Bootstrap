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
package com.jwebmp.core.plugins.jquery.bootstrap;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Form;
import com.jwebmp.plugins.bootstrap4.forms.BSForm;
import com.jwebmp.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;
import org.junit.jupiter.api.Test;

/**
 * @author ged_m
 */
public class BootstrapClassesTest
{

	public BootstrapClassesTest()
	{
	}

	@Test
	public void testClassAddition()
	{
		Div d = new Div<>();
		d.addClass(BSDefaultOptions.Active);
		System.out.println(d.toString(0));
		
		BSForm<?> form = new BSForm<>().setID("outer form");
		BSFormInputGroup<?, ?> group = new BSFormInputGroup<>();
		
		group.add(new Form<>().setID("inner form"));
		
		form.add(group);
		
		System.out.println(form.toString(0));
	}

}
