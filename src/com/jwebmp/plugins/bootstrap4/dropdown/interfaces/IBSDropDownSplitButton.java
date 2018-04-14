package com.jwebmp.plugins.bootstrap4.dropdown.interfaces;

import com.jwebmp.plugins.bootstrap4.dropdown.BSDropDownSplitButton;
import com.jwebmp.plugins.bootstrap4.dropdown.parts.BSDropDownButton;

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
