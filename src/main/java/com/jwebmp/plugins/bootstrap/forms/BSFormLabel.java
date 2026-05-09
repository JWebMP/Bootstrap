package com.jwebmp.plugins.bootstrap.forms;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.Label;
import com.jwebmp.core.base.html.interfaces.children.FormChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroupChildren;

/**
 * A label that can be used in a bootstrap form
 *
 * @param <J>
 *
 * @author GedMarc
 * @since 20 Feb 2017
 */
public class BSFormLabel<J extends BSFormLabel<J>>
		extends Label<J>
		implements BSFormGroupChildren, BSFormChildren, FormChildren
{


	/**
	 * Constructs a new label for a bootstrap form
	 */
	public BSFormLabel()
	{
		this(null);
	}

	/**
	 * Constructs a new label for a bootstrap form
	 *
	 * @param label
	 */
	public BSFormLabel(String label)
	{
		this(label, null);
	}

	/**
	 * Constructs a new label for a bootstrap form
	 *
	 * @param label
	 * @param forInputComponent
	 */
	public BSFormLabel(String label, Input forInputComponent)
	{
		super(label, forInputComponent);
	}

}
