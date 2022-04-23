package com.jwebmp.plugins.bootstrap.navs.interfaces;

import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.plugins.bootstrap.dropdown.*;
import com.jwebmp.plugins.bootstrap.navs.*;
import jakarta.validation.constraints.*;

public interface IBSNavs<J extends BSNavs<J>>
		extends ICssStructure<J>
{
	/**
	 * Stack your navigation by changing the flex item direction with the .flex-column utility. Need to stack them on some viewports but
	 * not
	 * others? Use the responsive versions (e.g., .flex-sm-column).
	 *
	 * @param vertical
	 *
	 * @return
	 */
	
	@NotNull
	J setVertical(boolean vertical);

	/**
	 * Fill and justify
	 * Force your .nav’s contents to extend the full available width one of two modifier classes. To proportionately fill all available
	 * space with your .nav-items, use .nav-fill. Notice that all horizontal space is occupied, but not every nav item has the same width.
	 *
	 * @param fill
	 *
	 * @return
	 */
	
	@NotNull
	J setFill(boolean fill);
	
	/**
	 * Sets the buttons to equal width layout
	 *
	 * @param equalWidth
	 *
	 * @return
	 */
	
	@NotNull
	J setEqualWidth(boolean equalWidth);

	/**
	 * Adds a drop down to the dav items
	 *
	 * @return
	 */
	@NotNull
	J addDropDown(BSDropDown<?> dropDown);
}
