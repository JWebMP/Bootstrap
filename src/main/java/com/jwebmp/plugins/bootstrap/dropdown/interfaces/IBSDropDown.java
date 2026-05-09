package com.jwebmp.plugins.bootstrap.dropdown.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.dropdown.BSDropDown;

import java.util.Comparator;

public interface IBSDropDown<J extends BSDropDown<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{

}
