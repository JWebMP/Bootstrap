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

package com.jwebmp.plugins.bootstrap4.buttons;

import com.jwebmp.core.base.interfaces.ICssStructure;

import java.util.Comparator;

public interface IBSButton<J extends BSButton<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setDanger(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setDangerOutline(boolean applyStyle);

	/**
	 * Disabled state
	 * <p>
	 * Make buttons look inactive by adding the disabled boolean attribute to any button element.
	 * <p>
	 * Heads up! IE9 and below render disabled buttons with gray, shadowed text that we can’t override.
	 * <p>
	 * Disabled buttons using the a element behave a bit different:
	 * <p>
	 * a's don’t support the disabled attribute, so you must add the .disabled class to make it visually appear disabled. Some
	 * future-friendly styles are included to disable all pointer-events on
	 * anchor buttons. In browsers which support that property, you won’t see the disabled cursor at all. Disabled buttons should include
	 * the aria-disabled="true" attribute to indicate the state of
	 * the element to assistive technologies.
	 * <p>
	 * <p>
	 * <p>
	 * Link functionality caveat
	 * <p>
	 * The .disabled class uses pointer-events: none to try to disable the link functionality of as, but that CSS property is not yet
	 * standardized. In addition, even in browsers that do support
	 * pointer-events: none, keyboard navigation remains unaffected, meaning that sighted keyboard users and users of assistive
	 * technologies
	 * will still be able to activate these links. So to be safe,
	 * add a tabindex="-1" attribute on these links (to prevent them from receiving keyboard focus) and use custom JavaScript to disable
	 * their functionality.
	 *
	 * @param disabled
	 *
	 * @return
	 */
	BSButton setDisabled(boolean disabled);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setInfo(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setInfoOutline(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setLink(boolean applyStyle);

	/**
	 * Buttons will appear pressed (with a darker background, darker border, and inset shadow) when active.
	 * <p>
	 * There’s no need to add a class to buttons as they use a pseudo-class. However, you can still force the same active appearance with
	 * .active (and include the aria-pressed="true" attribute) should
	 * you need to replicate the state programmatically.
	 *
	 * @param pressed
	 *
	 * @return
	 */
	BSButton setPressed(boolean pressed);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setPrimary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setPrimaryOutline(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setSecondary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setSecondaryOutline(boolean applyStyle);

	/**
	 * Sizes
	 * <p>
	 * Fancy larger or smaller buttons? Add .btn-lg or .btn-sm for additional sizes.
	 *
	 * @param size
	 *
	 * @return
	 */
	BSButton setSize(BSButtonSizeOptions size);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setSuccess(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setSuccessOutline(boolean applyStyle);

	/**
	 * Button plugin Do more with buttons. Control button states or create groups of buttons for more components like toolbars.
	 * <p>
	 * Toggle states Add data-toggle="button" to toggle a button’s active state. If you’re pre-toggling a button, you must manually add the
	 * .active class
	 *
	 * @param toggle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setToggle(boolean toggle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setWarning(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	J setWarningOutline(boolean applyStyle);
}
