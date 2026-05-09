package com.jwebmp.plugins.bootstrap.forms.groups.sets;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * Input group
 * <p>
 * Easily extend form controls by adding text, buttons, or button groups on either side of textual
 *
 * @author GedMarc
 */
public enum BSComponentInputGroupOptions
		implements IBSComponentOptions
{
	/**
	 * Denotes an input group association
	 */
	Input_Group,
	/**
	 *
	 */
	Input_Group_Prepend,
	Input_Group_Append,
	Input_Group_Text,
	/**
	 * Sizing
	 * <p>
	 * Add the relative form sizing classes to the .input-group itself and contents within will automatically resize—no need for repeating
	 * the form control size classes on each element.
	 */
	Input_Group_Lg,
	/**
	 * Sizing
	 * <p>
	 * Add the relative form sizing classes to the .input-group itself and contents within will automatically resize—no need for repeating
	 * the form control size classes on each element.
	 */
	Input_Group_Sm;

	BSComponentInputGroupOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
