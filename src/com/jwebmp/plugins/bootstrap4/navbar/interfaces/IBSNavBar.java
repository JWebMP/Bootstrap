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

import com.jwebmp.base.html.Span;
import com.jwebmp.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap4.forms.BSForm;
import com.jwebmp.plugins.bootstrap4.navbar.BSNavBar;
import com.jwebmp.plugins.bootstrap4.navbar.enumerations.BSNavBarColourSchemes;
import com.jwebmp.plugins.bootstrap4.navbar.enumerations.BSNavBarPositioning;
import com.jwebmp.plugins.bootstrap4.navbar.parts.BSNavBarBrand;
import com.jwebmp.plugins.bootstrap4.navbar.parts.BSNavBarText;
import com.jwebmp.plugins.bootstrap4.navbar.toggler.BSNavBarToggleContainer;
import com.jwebmp.plugins.bootstrap4.options.interfaces.IBSLayout;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

public interface IBSNavBar<J extends BSNavBar<J>>
		extends ICssStructure<J>, IBSLayout<J>
{
	@SuppressWarnings("unchecked")
	@NotNull
	J setNavBarTheme(BSNavBarColourSchemes schemes);

	/**
	 * Shortcut method to add only a brand image
	 *
	 * @param brandImage
	 *
	 * @return
	 */
	BSNavBarBrand<?> addBrandImage(String brandImage);

	/**
	 * Adds a new brand with the given options
	 *
	 * @param brandName
	 * @param brandImage
	 *
	 * @return
	 */
	BSNavBarBrand<?> addBrand(@Nullable String brandName, @Nullable String brandImage);

	/**
	 * Adds a new brand with the given text
	 *
	 * @param brand
	 *
	 * @return
	 */
	BSNavBarBrand<?> addBrand(String brand);

	/**
	 * Sets this navbar's positioning
	 *
	 * @param position
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J addPositioning(BSNavBarPositioning position);

	/**
	 * Adds the given header text
	 *
	 * @param text
	 *
	 * @return
	 */
	Span<?, ?, ?> addHeaderText(String text);

	/**
	 * Adds a configured form to the nav bar
	 *
	 * @return
	 */
	@NotNull
	BSForm<?> addForm();

	@SuppressWarnings("unchecked")
	@NotNull
	BSNavBarToggleContainer addToggler();

	BSNavBarText addText(String text);
}
