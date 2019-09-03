package com.jwebmp.plugins.bootstrap4.toasts;

import com.jwebmp.core.base.html.DivSimple;

import static com.jwebmp.plugins.bootstrap4.toasts.BSToastClasses.*;

public class BSToastBody<J extends BSToastBody<J>>
		extends DivSimple<J>
{
	public BSToastBody()
	{
		addClass(Toast_Body);
	}
}
