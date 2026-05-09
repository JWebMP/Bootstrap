package com.jwebmp.plugins.bootstrap.buttons.toolbars;

import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Button toolbar
 * <p>
 * Combine sets of button groups into button toolbars for more complex components.
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
public enum BSButtonToolbarOptions
		implements IBSComponentOptions
{
	/**
	 * Button toolbar
	 * <p>
	 * Combine sets of button groups into button toolbars for more complex components.
	 */
	Btn_Toolbar;

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(CHAR_UNDERSCORE, CHAR_DASH);
	}
}
