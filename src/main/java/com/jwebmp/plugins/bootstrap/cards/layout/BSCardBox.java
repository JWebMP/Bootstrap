package com.jwebmp.plugins.bootstrap.cards.layout;

import com.jwebmp.core.base.html.DivSimple;

import static com.jwebmp.plugins.bootstrap.cards.BSCardOptions.*;

public class BSCardBox<J extends BSCardBox<J>>
		extends DivSimple<J>
{
	public BSCardBox()
	{
		this(null);
	}

	public BSCardBox(String text)
	{
		super(text);
		addClass(Card_Box);
	}
}
