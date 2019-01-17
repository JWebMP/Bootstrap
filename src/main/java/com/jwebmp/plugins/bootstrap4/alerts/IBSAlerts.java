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

package com.jwebmp.plugins.bootstrap4.alerts;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.ICssStructure;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSAlerts<J extends BSAlert<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Adds the link styling for an alert to any component
	 *
	 * @param component
	 *
	 * @return
	 */
	@NotNull
	Link<?> wrapLinkStyle(ComponentHierarchyBase<?, ?, ?, ?, ?> component, String href);

	/**
	 * Creates and adds dismiss button assigned to this alert
	 *
	 * @return
	 */
	@NotNull
	BSAlertDismissButton createDismissButton();

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setDanger(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setInfo(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setLink(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setSuccess(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setWarning(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setPrimary(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setLight(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setDark(boolean applyStyle);
}
