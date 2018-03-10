package za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.interfaces;

import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSForm;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.BSNavBar;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarColourSchemes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarPositioning;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.parts.BSNavBarBrand;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.parts.BSNavBarText;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.toggler.BSNavBarToggleContainer;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.interfaces.IBSLayout;

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
