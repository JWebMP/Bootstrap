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

package com.jwebmp.plugins.bootstrap4.buttons.radio.styles;

import com.jwebmp.plugins.bootstrap4.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap4.buttons.radio.BSRadioButton;

public class BSRadioButtonSecondary<J extends BSRadioButtonSecondary<J>>
		extends BSRadioButton<J>
{
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
	 *
	 * @param groupName
	 */
	public BSRadioButtonSecondary(String groupName)
	{
		super(groupName);
		addClass(BSButtonOptions.Btn_Secondary);
	}
}
