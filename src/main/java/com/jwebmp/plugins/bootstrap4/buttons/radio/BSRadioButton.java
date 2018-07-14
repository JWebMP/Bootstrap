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

package com.jwebmp.plugins.bootstrap4.buttons.radio;

import com.jwebmp.base.html.DivSimple;
import com.jwebmp.base.html.Label;
import com.jwebmp.base.html.inputs.InputRadioType;
import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;

import javax.validation.constraints.NotNull;

/**
 * Checkbox and radio buttons
 * Bootstrap’s .button styles can be applied to other elements, such as lt;labelgt;s, to provide checkbox or radio style button toggling.
 * Add
 * data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
 * .btn-group-toggle to style the lt;inputgt;s within your buttons. Note that you can create single input-powered buttons or groups of
 * them.
 * lt;pgt;
 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the input—e.g.,
 * with lt;input type="reset"gt; or by manually applying the input’s checked property—you’ll need to toggle .active on the lt;labelgt;
 * manually.
 * lt;pgt;
 * Note that pre-checked buttons require you to manually add the .active class to the input’s lt;labelgt;.
 *
 * @param <J>
 */
public class BSRadioButton<J extends BSRadioButton<J>>
		extends DivSimple<J>
{
	/**
	 * The label component
	 */
	private Label<?> label;
	/**
	 * The input component
	 */
	private InputRadioType<?> input;

	/**
	 * Checkbox and radio buttons
	 * Bootstrap’s .button styles can be applied to other elements, such as &lt;labelgt;s, to provide checkbox or radio style button
	 * toggling.
	 * Add data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
	 * .btn-group-toggle to style the &lt;inputgt;s within your buttons. Note that you can create single input-powered buttons or groups of
	 * them.
	 * &lt;pgt;
	 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the
	 * input—e.g., with &lt;input type="reset"gt; or by manually applying the input’s checked property—you’ll need to toggle .active on the
	 * &lt;labelgt; manually.
	 * &lt;pgt;
	 * Note that pre-checked buttons require you to manually add the .active class to the input’s &lt;labelgt;.
	 */
	public BSRadioButton(String groupName)
	{
		addClass(BSButtonOptions.Btn_Group);
		addClass(BSButtonOptions.Btn_Group_Toggle);
		addAttribute("data-toggle", "buttons");
		setLabel(new Label());
		setInput(new InputRadioType());
		setName(groupName);
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			add(label);
			add(input);
		}
		super.preConfigure();
	}

	/**
	 * Sets if the checkbox must display as active
	 *
	 * @param active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		if (active)
		{
			addClass(BSDefaultOptions.Active);
		}
		else
		{
			removeClass(BSDefaultOptions.Active);
		}
		return (J) this;
	}

	/**
	 * Returns the label associated with this checkbox
	 *
	 * @return
	 */
	@NotNull
	public Label<?> getLabel()
	{
		return label;
	}

	/**
	 * Sets the label of this checkbox
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLabel(@NotNull Label<?> label)
	{
		this.label = label;
		label.addClass(BSButtonOptions.Btn);
		return (J) this;
	}

	/**
	 * Gets the input component for the checkbox
	 *
	 * @return
	 */
	@NotNull
	public InputRadioType<?> getInput()
	{
		return input;
	}

	/**
	 * Sets the input component for the checkbox
	 *
	 * @param input
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInput(@NotNull InputRadioType<?> input)
	{
		this.input = input;
		input.addAttribute("autocomplete", "off");
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
