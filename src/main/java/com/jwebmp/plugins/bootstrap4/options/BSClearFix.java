package com.jwebmp.plugins.bootstrap4.options;

import com.jwebmp.core.base.html.DivSimple;

public class BSClearFix extends DivSimple<BSClearFix>
{
	private static final BSClearFix instance = new BSClearFix();
	
	BSClearFix()
	{
		addClass(BSClearfixOptions.Clearfix);
	}
	
	public static BSClearFix getInstance()
	{
		return instance;
	}
	
}
