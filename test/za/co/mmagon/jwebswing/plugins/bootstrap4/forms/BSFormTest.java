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
package za.co.mmagon.jwebswing.plugins.bootstrap4.forms;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.inputs.InputEmailType;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;

/**
 * @author GedMarc
 */
public class BSFormTest
		extends BaseTestClass
{
	public BSFormTest()
	{
	}

	@org.junit.jupiter.api.Test
	void addSubmitButton()
	{
	}

	@Test
	public void testBasic()
	{
		BSForm<?> form = new BSForm<>();

		BSFormGroup<?, InputEmailType<?>> input = form.addEmailInput("binded", "This is the label");
		input.getInput()
		     .setPlaceholder("Input Placeholder");
		input.getInput()
		     .setRequired();


		form.addCheckboxInput("checkBound", "Checkbox Label");

		form.addSubmitButton();

		System.out.println(form.toString(0));
	}


}
