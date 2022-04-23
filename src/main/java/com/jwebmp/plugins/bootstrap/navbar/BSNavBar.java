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
package com.jwebmp.plugins.bootstrap.navbar;

import com.google.common.base.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.*;
import com.jwebmp.plugins.bootstrap.collapse.*;
import com.jwebmp.plugins.bootstrap.containers.*;
import com.jwebmp.plugins.bootstrap.forms.*;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.*;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;
import com.jwebmp.plugins.bootstrap.navbar.parts.*;
import com.jwebmp.plugins.bootstrap.navbar.toggler.*;
import com.jwebmp.plugins.bootstrap.navs.*;
import com.jwebmp.plugins.bootstrap.options.*;
import jakarta.validation.constraints.*;

import java.util.List;

/**
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 13 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Navbar",
                      description = "The navbar is a wrapper that positions branding, navigation, and other elements in a concise header. It’s easily " +
                                    "extensible and, thanks to our Collapse plugin, can easily integrate responsive behaviors.",
                      url = "https://v4-alpha.getbootstrap.com/components/navbar/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSNavBar<J extends BSNavBar<J>>
		extends Div<BSNavBarChildren, BSNavBarAttributes, GlobalFeatures, BSNavBarEvents, J>
		implements IBSNavBar<J>, INgComponent<J>
{
	private BSContainer<?> container = new BSContainer<>(BSContainerOptions.Container_Fluid);
	private String collapsedFieldName = "isMenuCollapsed";
	private boolean menuCollapsed = true;
	private BSNavBarCollapse<?> collapseDiv;
	
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
		collapseDiv = new BSNavBarCollapse<>(collapsedFieldName);
	}
	
	public BSNavBar(String collapsedFieldName)
	{
		this();
		this.collapsedFieldName = collapsedFieldName;
		collapseDiv = new BSNavBarCollapse<>(collapsedFieldName);
	}
	
	@Override
	public List<String> fields()
	{
		return List.of("public " + collapsedFieldName + " = " + menuCollapsed + ";");
	}
	
	@Override
	public @NotNull J add(@NotNull BSNavBarChildren newChild)
	{
		container.add(newChild);
		return (J) this;
	}
	
	public @NotNull J addToCollapsable(@NotNull GlobalChildren newChild)
	{
		collapseDiv.add(newChild);
		return (J) this;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setNavBarTheme(BSNavBarColourSchemes schemes)
	{
		addClass(schemes);
		return (J) this;
	}
	
	public BSContainer<?> getContainer()
	{
		return container;
	}
	
	public BSNavBar<J> setContainer(BSContainer<?> container)
	{
		this.container = container;
		return this;
	}
	
	public String getCollapsedFieldName()
	{
		return collapsedFieldName;
	}
	
	public BSNavBar<J> setCollapsedFieldName(String collapsedFieldName)
	{
		this.collapsedFieldName = collapsedFieldName;
		return this;
	}
	
	public boolean isMenuCollapsed()
	{
		return menuCollapsed;
	}
	
	public BSNavBar<J> setMenuCollapsed(boolean menuCollapsed)
	{
		this.menuCollapsed = menuCollapsed;
		return this;
	}
	
	public BSNavBarCollapse<?> getCollapseDiv()
	{
		return collapseDiv;
	}
	
	public BSNavBar<J> setCollapseDiv(BSNavBarCollapse<?> collapseDiv)
	{
		this.collapseDiv = collapseDiv;
		return this;
	}
	
	@Override
	public void init()
	{
		super.add(container);
		container.add(collapseDiv);
		
		super.init();
	}
	
	/**
	 * Shortcut method to add only a brand image
	 *
	 * @param brandImage
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
	 * @return
	 */
	@Override
	public BSNavBarBrand<?> addBrand(String brandName, String brandImage)
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
	 * @return
	 */
	@Override
	public BSNavBarHeaderSpan<?, ?> addHeaderText(String text)
	{
		BSNavBarHeaderSpan<?, ?> span = new BSNavBarHeaderSpan<>();
		addToCollapsable(span);
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
		addToCollapsable(form);
		return form;
	}
	
	@Override
	@NotNull
	public BSNavBarToggleButton<?> addToggle()
	{
		BSNavBarToggleButton<?> toggler = new BSNavBarToggleButton<>();
		container.add(toggler);
		return toggler;
	}
	
	@Override
	public J addNavs(BSNavBarNavs<?> navigation)
	{
		addToCollapsable(navigation);
		return (J)this;
	}
	
	@Override
	@NotNull
	public BSNavBarToggleContainer<?> addToggleWithContainer()
	{
		BSNavBarToggler<?, ?, ?, ?, ?> toggler = new BSNavBarToggler<>();
		BSNavBarToggleContainer<?> container = new BSNavBarToggleContainer<>(toggler, new BSNavs<>());
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
	 * @param backgroundOptions background colour
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
	 * @param coloursOptions text colour
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
	
	public J setColourTheme(BSNavBarColourSchemes schemes)
	{
		addClass(schemes);
		return (J)this;
	}
	
	public J setCollapseWhen(BSSizes size)
	{
		switch(size)
		{
			case ExtraLarge -> addClass("navbar-expand-xl");
			case Large -> addClass("navbar-expand-lg");
			case Medium -> addClass("navbar-expand-md");
			case Small -> addClass("navbar-expand-sm");
			case XSmall -> addClass("navbar-expand-xs");
		}
		return (J)this;
	}
}
