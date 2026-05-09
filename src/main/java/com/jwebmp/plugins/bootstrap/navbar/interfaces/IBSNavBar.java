package com.jwebmp.plugins.bootstrap.navbar.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.forms.BSForm;
import com.jwebmp.plugins.bootstrap.navbar.*;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarColourSchemes;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarPositioning;
import com.jwebmp.plugins.bootstrap.navbar.parts.BSNavBarBrand;
import com.jwebmp.plugins.bootstrap.navbar.parts.BSNavBarHeaderSpan;
import com.jwebmp.plugins.bootstrap.navbar.parts.BSNavBarText;
import com.jwebmp.plugins.bootstrap.navbar.toggler.*;
import com.jwebmp.plugins.bootstrap.navs.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;

import jakarta.validation.constraints.NotNull;

public interface IBSNavBar<J extends BSNavBar<J>>
		extends ICssStructure<J>, IBSLayout<J>
{
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
	BSNavBarBrand<?> addBrand(String brandName, String brandImage);

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
	@NotNull
	J addPositioning(BSNavBarPositioning position);

	/**
	 * Adds the given header text
	 *
	 * @param text
	 *
	 * @return
	 */
	BSNavBarHeaderSpan<?, ?> addHeaderText(String text);

	/**
	 * Adds a configured form to the nav bar
	 *
	 * @return
	 */
	@NotNull
	BSForm<?> addForm();

	@NotNull
	BSNavBarToggleButton<?> addToggle();
	
	J addNavs(BSNavBarNavs<?> navigation);
	
	@NotNull BSNavBarToggleContainer<?> addToggleWithContainer();
	
	BSNavBarText addText(String text);
}
