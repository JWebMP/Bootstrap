package com.jwebmp.plugins.bootstrap4.options;

import static com.jwebmp.utilities.StaticStrings.CHAR_DASH;
import static com.jwebmp.utilities.StaticStrings.CHAR_UNDERSCORE;

/**
 * Colour settings for bootstrap 4 beta and up
 */
public enum BSBackgroundOptions
		implements IBSComponentOptions
{
	Bg_Primary,
	Bg_Secondary,
	Bg_Success,
	Bg_Warning,
	Bg_Danger,
	Bg_Info,
	Bg_Light,
	Bg_Dark,
	Bg_Transparent,;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}