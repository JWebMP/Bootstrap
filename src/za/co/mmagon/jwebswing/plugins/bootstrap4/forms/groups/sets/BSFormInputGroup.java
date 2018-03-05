/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets;

import za.co.mmagon.jwebswing.base.html.DivSimple;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.controls.BSFormSelectInput;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.controls.BSFormTextAreaInput;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.controls.BSFormTextInput;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.controls.BSInput;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroupChildren;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Input group
 * <p>
 * Easily extend form controls by adding text, buttons, or button groups on either side of textual inputs.
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSFormInputGroup<J extends BSFormInputGroup<J>>
		extends DivSimple<J>
		implements BSFormGroupChildren, BSFormSetChildren, IBSFormInputGroup
{

	private static final long serialVersionUID = 1L;
	/**
	 * The input group addons
	 */
	private List<Span> inputGroupAddons;
	/**
	 * The input group addons
	 */
	private List<Span> inputGroupAddonsRight;

	private Input input;

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(Input input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(BSInput input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(BSFormSelectInput input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual input's.
	 *
	 * @param input
	 * @param size
	 */
	public BSFormInputGroup(BSFormTextAreaInput input, BSComponentInputGroupOptions... size)
	{
		this.input = input;
		addClass(BSComponentInputGroupOptions.Input_Group);
		if (size != null && size.length > 0)
		{
			for (BSComponentInputGroupOptions bSComponentInputGroupOptions : size)
			{
				addClass(bSComponentInputGroupOptions);
			}
		}
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			getInputGroupAddons().forEach(inputGroupAddon ->
			                              {
				                              inputGroupAddon.addClass(BSComponentInputGroupOptions.Input_Group_Addon);
				                              List tempList = new ArrayList<>(getChildren());
				                              tempList.add(0, inputGroupAddon);
				                              setChildren(new LinkedHashSet(tempList));
			                              });
			if (getInput() == null)
			{
				setInput(new BSFormTextInput());
			}
			add(getInput());
			getInputGroupAddonsRight().forEach(inputGroupAddon ->
			                                   {
				                                   inputGroupAddon.addClass(BSComponentInputGroupOptions.Input_Group_Addon);
				                                   add(inputGroupAddon);
			                                   });
		}
		super.init();
	}

	/**
	 * @return
	 */
	@Override
	public List<Span> getInputGroupAddons()
	{
		if (inputGroupAddons == null)
		{
			setInputGroupAddons(new ArrayList<>());
		}
		return inputGroupAddons;
	}

	/**
	 * The input group addons
	 *
	 * @param inputGroupAddons
	 *
	 * @return
	 */
	@Override
	public BSFormInputGroup setInputGroupAddons(List<Span> inputGroupAddons)
	{
		this.inputGroupAddons = inputGroupAddons;
		return this;
	}

	/**
	 * Sets the input group addons to the right
	 *
	 * @return
	 */
	@Override
	public List<Span> getInputGroupAddonsRight()
	{
		if (inputGroupAddonsRight == null)
		{
			setInputGroupAddonsRight(new ArrayList());
		}
		return inputGroupAddonsRight;
	}

	/**
	 * Sets the input group addons to the right
	 *
	 * @param inputGroupAddonsRight
	 *
	 * @return
	 */
	@Override
	public BSFormInputGroup setInputGroupAddonsRight(List<Span> inputGroupAddonsRight)
	{
		this.inputGroupAddonsRight = inputGroupAddonsRight;
		return this;
	}

	/**
	 * Gets the input component
	 *
	 * @return
	 */
	public Input getInput()
	{
		return input;
	}

	/**
	 * Sets the input component
	 *
	 * @param input
	 */
	public J setInput(@NotNull Input input)
	{
		this.input = input;
		if (this.input != null)
		{
			this.input.addClass("form-control");
		}
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
