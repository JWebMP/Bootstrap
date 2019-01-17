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

package com.jwebmp.plugins.bootstrap4.buttons.checkbox.styles;

import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.checkbox.BSCheckBox;

/**
 * Checkbox and radio buttons
 * Bootstrap’s .button styles can be applied to other elements, such as &lt;label&gt;s, to provide checkbox or radio style button toggling.
 * Add
 * data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
 * .btn-group-toggle to style the &lt;input&gt;s within your buttons. Note that you can create single input-powered buttons or groups of
 * them.
 * &lt;p&gt;
 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the input—e.g.,
 * with &lt;input type="reset"&gt; or by manually applying the input’s checked property—you’ll need to toggle .active on the &lt;label&gt;
 * manually.
 * &lt;p&gt;
 * Note that pre-checked buttons require you to manually add the .active class to the input’s &lt;label&gt;.
 *
 * @param <J>
 */
public class BSCheckBoxPrimaryOutline<J extends BSCheckBoxPrimaryOutline<J>>
		extends BSCheckBox<J>
{

	/**
	 * Checkbox and radio buttons
	 * Bootstrap’s .button styles can be applied to other elements, such as &lt;label&gt;s, to provide checkbox or radio style button
	 * toggling. Add
	 * data-toggle="buttons" to a .btn-group containing those modified buttons to enable their toggling behavior via JavaScript and add
	 * .btn-group-toggle to style the &lt;input&gt;s within your buttons. Note that you can create single input-powered buttons or
	 * groups of
	 * them.
	 * &lt;p&gt;
	 * The checked state for these buttons is only updated via click event on the button. If you use another method to update the
	 * input—e.g.,
	 * with &lt;input type="reset"&gt; or by manually applying the input’s checked property—you’ll need to toggle .active on the
	 * &lt;label&gt; manually.
	 * &lt;p&gt;
	 * Note that pre-checked buttons require you to manually add the .active class to the input’s &lt;label&gt;.
	 */
	public BSCheckBoxPrimaryOutline()
	{
		getLabel().addClass(BSButtonOptions.Btn_Outline_Primary);
	}
}
