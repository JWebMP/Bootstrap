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

import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.interfaces.IBSDropDownSplitButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.options.BSDropDownOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.parts.BSDropDownButton;

/**
 * Split button dropdowns
 * <p>
 * Similarly, create split button dropdowns with virtually the same markup as single button dropdowns, but with the addition of
 * .dropdown-toggle-split for proper spacing around the dropdown caret.
 * <p>
 * We use this extra class to reduce the horizontal padding on either side of the caret by 25% and remove the margin-left that’s added for
 * regular button dropdowns. Those extra changes keep the caret
 * centered in the split button and provide a more appropriately sized hit area next to the main button.
 *
 * @author GedMarc
 * @since 14 Jan 2017
 */
public class BSDropDownSplitButton<J extends BSDropDownSplitButton<J>>
		extends BSDropDown<J>
		implements za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.interfaces.IBSDropDownSplitButton<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Split button dropdowns
	 * <p>
	 * Similarly, create split button dropdowns with virtually the same markup as single button dropdowns, but with the addition of
	 * .dropdown-toggle-split for proper spacing around the dropdown caret.
	 * <p>
	 * We use this extra class to reduce the horizontal padding on either side of the caret by 25% and remove the margin-left that’s added
	 * for
	 * regular button dropdowns. Those extra changes keep the caret
	 * centered in the split button and provide a more appropriately sized hit area next to the main button.
	 */
	public BSDropDownSplitButton()
	{
		removeClass(BSDropDownOptions.Dropdown);
		addClass(BSButtonOptions.Btn_Group);
	}

	/**
	 * Returns a slimmer view of this component
	 *
	 * @return
	 */
	@Override
	public IBSDropDownSplitButton<J> asMe()
	{
		return this;
	}

	/**
	 * Adds a split button drop down with caret
	 *
	 * @return
	 */
	@Override
	public BSDropDownButton<?> addSplitButton()
	{
		if (!getChildren().isEmpty())
		{
			BSDropDownButton<?> original = (BSDropDownButton<?>) getChildren().iterator()
			                                                                  .next();
			original.removeAttribute(BSButtonAttributes.Data_Toggle);
			original.removeAttribute(GlobalAttributes.Aria_Expanded);
			original.removeAttribute(GlobalAttributes.Aria_HasPopup);
			original.removeClass(BSDropDownOptions.Dropdown_Toggle);
		}

		BSDropDownButton<?> button = new BSDropDownButton<>();
		button.addClass(BSDropDownOptions.Dropdown_Toggle);
		button.addClass(BSDropDownOptions.Dropdown_Toggle_Split);
		add(button);
		return button;
	}

}
