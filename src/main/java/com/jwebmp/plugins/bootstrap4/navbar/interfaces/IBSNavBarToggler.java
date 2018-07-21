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

package com.jwebmp.plugins.bootstrap4.navbar.interfaces;

import com.jwebmp.core.base.html.Button;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.base.interfaces.ICssStructure;

public interface IBSNavBarToggler<C extends GlobalChildren, A extends Enum & AttributeDefinitions, F extends GlobalFeatures, E extends GlobalEvents, J extends Button<C, A, F, E, J>>
		extends ICssStructure<J>
{
	/**
	 * Gets the screen reader aria label
	 *
	 * @return
	 */
	String getAriaLabel();

	/**
	 * sets the screen reader aria label
	 */
	J setAriaLabel(String ariaLabel);

	/**
	 * Gets the span for the navbar icon
	 *
	 * @return
	 */
	Span<?, ?, ?> getIconSpan();

	/**
	 * Gets the Icon Class
	 *
	 * @return
	 */
	String getIconClass();

	/**
	 * Sets the Icon Class
	 *
	 * @param iconClass
	 */
	J setIconClass(String iconClass);

	/**
	 * Sets the icon for the span
	 *
	 * @param iconSpan
	 *
	 * @return
	 */
	J setIconSpan(Span<?, ?, ?> iconSpan);
}
