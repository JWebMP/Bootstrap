/*
 * Copyright (C) 2017 GedMarc
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
package com.jwebmp.plugins.bootstrap.forms.groups.sets;

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.generics.*;
import com.jwebmp.plugins.bootstrap.buttons.BSButton;
import com.jwebmp.plugins.bootstrap.dropdown.BSDropDown;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroup;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.parts.InputGroupAppendItem;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.parts.InputGroupPrependItem;
import com.jwebmp.plugins.bootstrap.forms.interfaces.IBSFormInputGroup;

import jakarta.validation.constraints.NotNull;

import java.util.*;
import java.util.List;

import static com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions.*;
import static com.jwebmp.plugins.bootstrap.forms.groups.sets.BSComponentInputGroupOptions.*;
import static com.jwebmp.plugins.bootstrap.options.BSTypographyOptions.*;

/**
 * Input group
 * <p>
 * Easily extend form controls by adding text, buttons, or button groups on either side of textual inputs.
 *
 * @author GedMarc
 * @since 18 Jan 2017
 */
public class BSFormInputGroup<J extends BSFormInputGroup<J, I>, I extends Input<?, ?>>
		extends BSFormGroup<J, I>
		implements BSFormGroupChildren, IBSFormInputGroup<J, I>
{
	private IComponentHierarchyBase<?,?> helpText;

	private boolean styleInputGroupTextWithValidation;

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual inputs.
	 */
	public BSFormInputGroup()
	{
		this(null);
	}

	/**
	 * Input group
	 * <p>
	 * Easily extend form controls by adding text, buttons, or button groups on either side of textual inputs.
	 */
	public BSFormInputGroup(Boolean largeOrSmall)
	{
		getClasses().clear();
		addClass(Input_Group);
		if (largeOrSmall != null)
		{
			if (largeOrSmall)
			{
				setLarge();
			}
			else
			{
				setSmall();
			}
		}
	}
	
	public J setLarge()
	{
		removeClass(Input_Group_Sm);
		addClass(Input_Group_Lg);
		return (J)this;
	}
	
	public J setSmall()
	{
		removeClass(Input_Group_Lg);
		addClass(Input_Group_Sm);
		return (J)this;
	}
	
	/**
	 * The text (or component.toString(0)) to prepend
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J prepend(String text)
	{
		Span<?, ?, ?> span = new Span<>();
		span.addClass(Input_Group_Text);
		span.setText(text);
		List<GlobalChildren> children = new ArrayList<>();
		Object[] array = (Object[]) getChildren().toArray();
		for (int i = 0, arrayLength = array.length; i < arrayLength; i++)
		{
			Object o = array[i];
			if (o instanceof Input<?, ?>)
			{
				children.add(span);
				children.add((GlobalChildren) o);
			}
			else
			{
				children.add((GlobalChildren) o);
			}
		}
		setChildren(new LinkedHashSet<>(children));
		return (J) this;
	}

	/**
	 * The text (or component.toString(0)) to prepend
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J prepend(IComponentHierarchyBase<?,?> component)
	{
		if (!(BSButton.class.isAssignableFrom(component.getClass()) || BSDropDown.class.isAssignableFrom(component.getClass())))
		{
			component.addClass(Input_Group_Text);
		}
		
		List<GlobalChildren> children = new ArrayList<>();
		Object[] array = (Object[]) getChildren().toArray();
		for (int i = 0, arrayLength = array.length; i < arrayLength; i++)
		{
			Object o = array[i];
			if (o instanceof Input<?, ?>)
			{
				children.add(component);
				children.add((GlobalChildren) o);
			}
			else
			{
				children.add((GlobalChildren) o);
			}
		}
		setChildren(new LinkedHashSet<>(children));
		return (J) this;
	}

	/**
	 * The text (or component.toString(0)) to append
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J append(String text)
	{
		Span<?, ?, ?> span = new Span<>();
		span.setText(text);
		span.addClass(Input_Group_Text);
		add(span);
		return (J) this;
	}

	/**
	 * The text (or component.toString(0)) to append
	 *
	 * @param component
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J append(IComponentHierarchyBase<?,?> component)
	{
		if (!(BSButton.class.isAssignableFrom(component.getClass()) || BSDropDown.class.isAssignableFrom(component.getClass())))
		{
			component.addClass(Input_Group_Text);
		}
		return (J) this;
	}

	/**
	 * The text (or component.toString(0)) to append
	 *
	 * @param component
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	@Override
	public J append(IComponentHierarchyBase<?,?> component, boolean renderInSpan)
	{
		if (renderInSpan)
		{
			Span<?, ?, ?> span = new Span<>();
			span.setText(component.toString(0));
			span.addClass(Input_Group_Text);
			add(span);
		}
		else
		{
			add(component);
		}
		return (J) this;
	}

	/**
	 * Sets whether or not the text of the input group must be validated
	 *
	 * @return
	 */
	@Override
	public boolean isStyleInputGroupTextWithValidation()
	{
		return styleInputGroupTextWithValidation;
	}

	/**
	 * Sets whether or not the text of the input group must be validated
	 *
	 * @param styleInputGroupTextWithValidation
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setStyleInputGroupTextWithValidation(boolean styleInputGroupTextWithValidation)
	{
		this.styleInputGroupTextWithValidation = styleInputGroupTextWithValidation;
		return (J) this;
	}

	/**
	 * Renders the label, help text and validation messages before the tag
	 *
	 * @return
	 */

	@Override
	protected StringBuilder renderBeforeTag()
	{
		StringBuilder output = new StringBuilder();
		
		if(getMessagePlacement() == CompassPoints.N && getMessages() != null && !getMessages().getChildren().isEmpty())
		{
			output.append(getMessages().toString(0));
		}

		if (getLabel() != null && getLabel().getText() != null)
		{
			output.append(getCurrentTabIndentString())
			      .append(getLabel().toString(0))
			      .append(getNewLine());
		}
		if (helpText != null)
		{
			output.append(getCurrentTabIndentString())
			      .append(helpText.toString(0))
			      .append(getNewLine());
		}
		return output;
	}
	
	@Override
	protected StringBuilder renderAfterTag()
	{
		StringBuilder output = new StringBuilder();
		if(getMessagePlacement() == CompassPoints.S && getMessages() != null && !getMessages().getChildren().isEmpty())
		{
			output.append(getMessages().toString(0));
		}
		return output;
	}
	
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getChildren().removeIf(a -> a.equals(getLabel()));
			Set<GlobalChildren> newOrder = new LinkedHashSet<>();
			if(getMessagePlacement() == CompassPoints.E && getMessages() != null && !getMessages().getChildren().isEmpty())
			{
				newOrder.add(getMessages());
			}
			newOrder.addAll(getChildren());
			if(getMessagePlacement() == CompassPoints.W && getMessages() != null && !getMessages().getChildren().isEmpty())
			{
				newOrder.add(getMessages());
			}
			//noinspection unchecked, rawtypes
			setChildren(new LinkedHashSet(newOrder));
		}
		super.preConfigure();
	}

	@Override
	public IBSFormInputGroup<J, I> asMe()
	{
		return this;
	}

	/**
	 * Does not add immediately, allows you to set the position via setHelpTextPosition
	 *
	 * @param text
	 * 		The component to show
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J addHelpText(IComponentHierarchyBase<?,?> text)
	{
		text.addClass(Form_Text, Text_Muted);
		add(text);
		return (J) this;
	}

	/**
	 * Does not add immediately, allows you to set the position via setHelpTextPosition
	 *
	 * @param text
	 * 		The component to show
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J addHelpText(String text)
	{
		SmallText<?> sm = new SmallText<>().addClass(Form_Text, Text_Muted)
		                                .setText(text);
		add(sm);
		helpText = sm;
		return (J) this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}
}
