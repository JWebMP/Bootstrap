package com.jwebmp.plugins.bootstrap4.toasts;

import com.jwebmp.core.base.interfaces.ICssClassName;

import static com.jwebmp.core.utilities.StaticStrings.*;

public enum BSToastClasses implements ICssClassName
{
	Toast,
	Toast_Header,
	Toast_Body,
	;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
