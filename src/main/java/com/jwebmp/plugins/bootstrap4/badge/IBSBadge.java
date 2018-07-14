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

package com.jwebmp.plugins.bootstrap4.badge;

import com.jwebmp.base.interfaces.ICssStructure;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSBadge<J extends BSBadge<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Sets this badge to render as an actionable link
	 *
	 * @param asLink
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setAsLink(boolean asLink);

	/**
	 * Configures badge as a link with hover and active styles
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setLink(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDanger(boolean applyStyle);

	/**
	 * Default colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDefault(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setInfo(boolean applyStyle);

	/**
	 * Primary colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setPrimary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setSuccess(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setWarning(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setSecondary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDark(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setLight(boolean applyStyle);
}
