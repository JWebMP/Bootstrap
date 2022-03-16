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

import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarColourSchemes;
import com.jwebmp.plugins.bootstrap.navbar.toggler.BSNavBarToggleContainer;
import com.jwebmp.plugins.bootstrap.options.BSBackgroundOptions;
import org.junit.jupiter.api.Test;

class BSNavBarTest

{

	@Test
	void testText()
	{
		BSNavBar<?> navBar = new BSNavBar<>();
		navBar.setNavBarTheme(BSNavBarColourSchemes.Navbar_Light);
		navBar.addBackground(BSBackgroundOptions.Bg_Primary);

		navBar.addBrand("New Brand");
		System.out.println(navBar.toString(0));
	}

	@Test
	void testImage()
	{
		BSNavBar<?> navBar = new BSNavBar<>();
		navBar.setNavBarTheme(BSNavBarColourSchemes.Navbar_Light);
		navBar.addBackground(BSBackgroundOptions.Bg_Primary);

		navBar.addBrand(null, "ImageUrl");
		System.out.println(navBar.toString(0));
	}

	@Test
	void testBoth()
	{
		BSNavBar<?> navBar = new BSNavBar<>();
		navBar.setNavBarTheme(BSNavBarColourSchemes.Navbar_Light);
		navBar.addBackground(BSBackgroundOptions.Bg_Primary);

		navBar.addBrand("New Brand", "ImageUrl");
		System.out.println(navBar.toString(0));
	}

	@Test
	void testHeader()
	{
		BSNavBar<?> navBar = new BSNavBar<>();
		navBar.setNavBarTheme(BSNavBarColourSchemes.Navbar_Light);
		navBar.addBackground(BSBackgroundOptions.Bg_Primary);

		navBar.addHeaderText("Header Text");
		System.out.println(navBar.toString(0));
	}

	@Test
	void testFormInline()
	{
		BSNavBar<?> navBar = new BSNavBar<>();
		navBar.setNavBarTheme(BSNavBarColourSchemes.Navbar_Light);
		navBar.addBackground(BSBackgroundOptions.Bg_Primary);

		navBar.addForm()
		      .createTextInput("form.binding", "Form Binding");
		System.out.println(navBar.toString(0));
	}

	@Test
	void testNavCollapse()
	{
		BSNavBar<?> navBar = new BSNavBar<>();
		navBar.setNavBarTheme(BSNavBarColourSchemes.Navbar_Light);
		navBar.addBackground(BSBackgroundOptions.Bg_Primary);

		BSNavBarToggleContainer container = navBar.addToggler();
		container.getContent()
		         .addItem("Home");
		
		System.out.println(navBar.toString(0));
	}

	@Test
	void testText2()
	{
		BSNavBar<?> navBar = new BSNavBar<>();
		navBar.setNavBarTheme(BSNavBarColourSchemes.Navbar_Light);
		navBar.addBackground(BSBackgroundOptions.Bg_Primary);

		navBar.addText("This is inline text");
		System.out.println(navBar.toString(0));
	}
}
