package za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.interfaces;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.BSDropDown;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.parts.BSDropDownButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.parts.BSDropDownMenu;

import java.util.Comparator;

public interface IBSDropDown<J extends BSDropDown<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * adds a default drop down button
	 *
	 * @return
	 */
	BSDropDownButton<?> addDropDownButton();

	/**
	 * Adds the drop down button to the drop down (add before menu)
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions);

	BSDropDownButton<?> addDropDownButton(BSButtonOptions buttonOptions, BSButtonSizeOptions sizeOptions);

	/**
	 * Adds the menu to the drop down (call after button)
	 *
	 * @return
	 */
	BSDropDownMenu<?> addDropDownMenu();
}
