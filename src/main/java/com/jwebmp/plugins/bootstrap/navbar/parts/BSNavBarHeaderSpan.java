package com.jwebmp.plugins.bootstrap.navbar.parts;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap.options.BSMarginOptions;

public class BSNavBarHeaderSpan<A extends Enum<?> & AttributeDefinitions, J extends BSNavBarHeaderSpan<A, J>>
		extends Span<GlobalChildren, A, J>
		implements BSNavBarChildren
{
	public BSNavBarHeaderSpan()
	{
		this(null);
	}

	public BSNavBarHeaderSpan(String text)
	{
		super(text);
		addClass(BSMarginOptions.MarginBottom_0);
		addClass("h1");
	}
}
