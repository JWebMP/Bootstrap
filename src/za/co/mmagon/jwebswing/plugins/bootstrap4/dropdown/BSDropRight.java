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
package za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown;

import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.options.BSDropDownOptions;

/**
 * Dropup variation
 * <p>
 * Trigger dropdown menus above elements by adding .dropup to the parent element.
 *
 * @author GedMarc
 * @since 14 Jan 2017
 */
public class BSDropRight<J extends BSDropRight<J>>
		extends BSDropDown<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Dropup variation
	 * <p>
	 * Trigger dropdown menus above elements by adding .dropup to the parent element.
	 */
	public BSDropRight()
	{
		removeClass(BSDropDownOptions.Dropdown);
		addClass(BSButtonOptions.Btn_Group);
		addClass(BSDropDownOptions.DropRight);
	}
}
