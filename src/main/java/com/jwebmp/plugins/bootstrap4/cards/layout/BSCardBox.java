package com.jwebmp.plugins.bootstrap4.cards.layout;

import com.jwebmp.core.base.html.DivSimple;

import static com.jwebmp.plugins.bootstrap4.cards.BSCardOptions.*;

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
