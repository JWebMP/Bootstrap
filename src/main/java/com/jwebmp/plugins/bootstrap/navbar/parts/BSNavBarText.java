package com.jwebmp.plugins.bootstrap.navbar.parts;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarOptions;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;

/**
 * Text
 * <p>
 * Navbars may contain bits of text with the help of .navbar-text. This class adjusts vertical alignment and horizontal spacing for strings
 * of text.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
public class BSNavBarText
		extends Span<GlobalChildren, NoAttributes,BSNavBarText>
		implements BSNavBarChildren
{
	/**
	 * Text
	 * <p>
	 * Navbars may contain bits of text with the help of .navbar-text. This class adjusts vertical alignment and horizontal spacing for
	 * strings of text.
	 */
	public BSNavBarText()
	{
		addClass(BSNavBarOptions.Text);

	}

	public BSNavBarText(String text)
	{
		super(text);
		addClass(BSNavBarOptions.Text);

	}
}
