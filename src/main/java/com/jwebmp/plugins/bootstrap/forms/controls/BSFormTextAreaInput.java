package com.jwebmp.plugins.bootstrap.forms.controls;

import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions;

/**
 * @author GedMarc
 * @since 17 Jan 2017
 */
public class BSFormTextAreaInput<J extends BSFormTextAreaInput<J>>
		extends BSInput<J>
		implements BSFormGroupChildren
{
	/**
	 * A bootstrap default form select
	 */
	public BSFormTextAreaInput()
	{
		this(3);
	}

	/**
	 * Constructs a new select input with multiple
	 *
	 * @param linesToShow
	 */
	public BSFormTextAreaInput(int linesToShow)
	{
		addAttribute("rows", Integer.toString(linesToShow));
		addClass(BSFormGroupOptions.Form_Control);
		setTag("textarea");
		setInlineClosingTag(false);
		setClosingTag(true);
	}

}
