package com.jwebmp.plugins.bootstrap4.navbar.parts;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.interfaces.AttributeDefinitions;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap4.options.BSMarginOptions;

public class BSNavBarHeaderSpan<A extends Enum & AttributeDefinitions, J extends BSNavBarHeaderSpan<A, J>>
		extends Span<IComponentHierarchyBase, A, J>
		implements BSNavBarChildren<IComponentHierarchyBase, J>
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
