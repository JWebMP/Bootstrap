package za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.interfaces;

import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.BSDropDownSplitButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.parts.BSDropDownButton;

import java.util.Comparator;

public interface IBSDropDownSplitButton<J extends BSDropDownSplitButton<J>>
		extends Comparator<J>, Comparable<J>, IBSDropDown<J>
{
	/**
	 * Adds a split button drop down with caret
	 *
	 * @return
	 */
	BSDropDownButton<?> addSplitButton();
}
