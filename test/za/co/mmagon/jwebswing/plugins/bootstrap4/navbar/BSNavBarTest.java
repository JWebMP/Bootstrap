package za.co.mmagon.jwebswing.plugins.bootstrap4.navbar;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.enumerations.BSNavBarColourSchemes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navbar.toggler.BSNavBarToggleContainer;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSBackgroundOptions;

class BSNavBarTest
		extends BaseTestClass
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
		      .addTextInput("form.binding", "Form Binding");
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

		container.getContent()
		         .addDropDown()
		         .addDropDownMenu();

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
