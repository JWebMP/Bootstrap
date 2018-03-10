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
package za.co.mmagon.jwebswing.plugins.bootstrap4.navbar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.collapse.BSCollapse;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.BSForm;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarAttributes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarColourSchemes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarPositioning;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.interfaces.BSNavBarEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.parts.BSNavBarBrand;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.parts.BSNavBarText;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.toggler.BSNavBarToggleContainer;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.toggler.BSNavBarToggler;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavs;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.*;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

/**
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 13 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Navbar",
		description = "The navbar is a wrapper that positions branding, navigation, and other elements in a concise header. It’s easily "
				              + "extensible and, thanks to our Collapse plugin, can easily integrate responsive behaviors.",
		url = "https://v4-alpha.getbootstrap.com/components/navbar/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSNavBar<J extends BSNavBar<J>>
		extends Div<BSNavBarChildren, BSNavBarAttributes, GlobalFeatures, BSNavBarEvents, J>
		implements za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.interfaces.IBSNavBar<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * The navbar is a wrapper that positions branding, navigation, and other elements in a concise header. It’s easily extensible and,
	 * thanks to our Collapse plugin, can easily integrate responsive
	 * behaviors.
	 *
	 * @param schemes
	 */
	public BSNavBar(BSNavBarColourSchemes schemes)
	{
		this();
		setNavBarTheme(schemes);
	}

	/**
	 * Navbar
	 * <p>
	 * The navbar is a wrapper that positions branding, navigation, and other elements in a concise header. It’s easily extensible and,
	 * thanks to our Collapse plugin, can easily integrate responsive
	 * behaviors.
	 */
	public BSNavBar()
	{
		setTag("nav");
		addClass(BSNavBarOptions.$);
		addAttribute(BSNavBarAttributes.Role, "navigation");
	}


	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNavBarTheme(BSNavBarColourSchemes schemes)
	{
		addClass(schemes);
		return (J) this;
	}

	/**
	 * Shortcut method to add only a brand image
	 *
	 * @param brandImage
	 *
	 * @return
	 */
	@Override
	public BSNavBarBrand<?> addBrandImage(String brandImage)
	{
		return addBrand(null, brandImage);
	}

	/**
	 * Adds a new brand with the given options
	 *
	 * @param brandName
	 * @param brandImage
	 *
	 * @return
	 */
	@Override
	public BSNavBarBrand<?> addBrand(@Nullable String brandName, @Nullable String brandImage)
	{
		BSNavBarBrand<?> brand = new BSNavBarBrand<>();
		if (brandImage != null)
		{
			brand.addImage(brandImage);
		}
		if (brandName != null)
		{
			brand.addText(brandName);
			brand.setRenderTextBeforeChildren(false);
		}
		add(brand);
		return brand;
	}

	/**
	 * Adds a new brand with the given text
	 *
	 * @param brand
	 *
	 * @return
	 */
	@Override
	public BSNavBarBrand<?> addBrand(String brand)
	{
		return addBrand(brand, null);
	}

	/**
	 * Sets this navbar's positioning
	 *
	 * @param position
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addPositioning(BSNavBarPositioning position)
	{
		addClass(position);
		return (J) this;
	}

	/**
	 * Adds the given header text
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	public Span<?, ?, ?> addHeaderText(String text)
	{
		Span<?, ?, ?> span = new Span<>();
		span.addClass(BSMarginOptions.MarginBottom_0);
		span.addClass("h1");
		getChildren().add(span);
		return span;
	}

	/**
	 * Adds a configured form to the nav bar
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSForm<?> addForm()
	{
		BSForm<?> form = new BSForm<>();
		form.setInline(true);
		add(form);
		return form;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public BSNavBarToggleContainer addToggler()
	{
		BSNavBarToggler toggler = new BSNavBarToggler();
		BSNavBarToggleContainer container = new BSNavBarToggleContainer(toggler, new BSNavs<>());
		BSCollapse.link(container.getToggler(), container.getContent(), true);

		container.getContent()
		         .removeClass("collapse");

		add(container.getToggler());
		add(container.getContent());
		return container;
	}

	@Override
	public BSNavBarText addText(String text)
	{
		BSNavBarText navText = new BSNavBarText();
		navText.setText(text);
		add(navText);
		return navText;
	}

	/**
	 * Sets the style with background and colours
	 *
	 * @param backgroundOptions
	 * 		background colour
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBackground(BSBackgroundOptions backgroundOptions)
	{
		addClass(backgroundOptions);
		return (J) this;
	}

	/**
	 * Sets the style with border and colours
	 *
	 * @param coloursOptions
	 * 		text colour
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addForeground(BSColoursOptions coloursOptions)
	{
		addClass(coloursOptions);

		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addMargin(BSMarginOptions margin)
	{
		addClass(margin);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addPadding(BSPaddingOptions padding)
	{
		addClass(padding);
		return (J) this;
	}

	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBorder(BSBorderOptions border)
	{
		addClass(border);
		return (J) this;
	}
}
