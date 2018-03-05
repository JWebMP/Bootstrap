package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts;

import org.junit.jupiter.api.Test;
import za.co.mmagon.jwebswing.BaseTestClass;
import za.co.mmagon.jwebswing.base.html.attributes.HeaderTypes;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButtonSizeOptions;

class BSCardBodyTest
		extends BaseTestClass
{

	@Test
	void addTitle()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addTitle(HeaderTypes.H5, "Test Body Title");

		System.out.println(body.toString(0));
	}

	@Test
	void addSubtitleTitle()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addSubtitle(HeaderTypes.H3, "Test Body Sub Title");
		System.out.println(body.toString(0));

		BSCardBody<?> body2 = new BSCardBody<>();
		body2.addSubtitle("Test Body Sub Title 2");
		System.out.println(body2.toString(0));
	}

	@Test
	void addText()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addText("Test Body Text");
		System.out.println(body.toString(0));
	}

	@Test
	void addButtonLink()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addButtonLink("Test Button Link");
		System.out.println(body.toString(0));
	}

	@Test
	void addButtonLink1()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addButtonLink("Test Button Link", BSButtonOptions.Btn_Danger, BSButtonSizeOptions.Btn_Block);
		System.out.println(body.toString(0));
	}

	@Test
	void addBlockQuote()
	{
		BSCardBody<?> body = new BSCardBody<>();
		body.addBlockQuote("Test Button Link", (String) null);
		System.out.println(body.toString(0));

		BSCardBody<?> body2 = new BSCardBody<>();
		body2.addBlockQuote("Test Button Link", new BSCardBlockQuoteFooter<>().setText("Footer"));
		System.out.println(body2.toString(0));
	}
}

