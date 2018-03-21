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

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.SmallText;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.dropdown.BSDropDown;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroup;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.BSFormGroupChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.parts.InputGroupAppendItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.parts.InputGroupPrependItem;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.interfaces.IBSFormInputGroup;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.LinkedHashSet;
import java.util.Set;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSComponentInputGroupOptions.*;

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
		implements BSFormGroupChildren, za.co.mmagon.jwebswing.plugins.bootstrap4.forms.interfaces.IBSFormInputGroup<J, I>
{

	private static final long serialVersionUID = 1L;

	private final InputGroupPrependItem<?> prependDiv;
	private final InputGroupAppendItem<?> appendDiv;

	private SmallText helpText;

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
	public BSFormInputGroup(@Nullable Boolean largeOrSmall)
	{
		getClasses().clear();
		addClass(Input_Group);
		prependDiv = new InputGroupPrependItem<>();
		prependDiv.addClass(Input_Group_Prepend);
		appendDiv = new InputGroupAppendItem<>();
		appendDiv.addClass(Input_Group_Append);
		if (largeOrSmall != null)
		{
			if (largeOrSmall)
			{
				addClass(Input_Group_Lg);
			}
			else
			{
				addClass(Input_Group_Sm);
			}
		}
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
		prependDiv.add(span);
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
	public J prepend(ComponentHierarchyBase component)
	{
		if (BSButton.class.isAssignableFrom(component.getClass()) || BSDropDown.class.isAssignableFrom(component.getClass()))
		{
			prependDiv.add(component);
		}
		else
		{
			Span<?, ?, ?> span = new Span<>();
			span.addClass(Input_Group_Text);
			span.setText(component.toString(0));
			prependDiv.add(span);
		}

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
		appendDiv.add(span);
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
	public J append(ComponentHierarchyBase component)
	{
		if (BSButton.class.isAssignableFrom(component.getClass()) || BSDropDown.class.isAssignableFrom(component.getClass()))
		{
			appendDiv.add(component);
		}
		else
		{
			Span<?, ?, ?> span = new Span<>();
			span.setText(component.toString(0));
			span.addClass(Input_Group_Text);
			appendDiv.add(span);
		}
		return (J) this;
	}

	/**
	 * returns the prepending div as it currently is. Only add spans directly with classes??
	 *
	 * @return
	 */
	@Override
	public Div<?, ?, ?, ?, ?> getPrependDiv()
	{
		return prependDiv;
	}

	/**
	 * returns the appending div as it currently is. Only add spans directly with classes??
	 *
	 * @return
	 */
	@Override
	public Div<?, ?, ?, ?, ?> getAppendDiv()
	{
		return appendDiv;
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
	public J append(ComponentHierarchyBase component, boolean renderInSpan)
	{
		if (renderInSpan)
		{
			Span<?, ?, ?> span = new Span<>();
			span.setText(component.toString(0));
			span.addClass(Input_Group_Text);
			appendDiv.add(span);
		}
		else
		{
			appendDiv.add(component);
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
	@Nullable
	@Override
	protected StringBuilder renderBeforeTag()
	{
		StringBuilder output = new StringBuilder();

		if (getLabel() != null && getLabel().getText() != null)
		{
			output.append(new StringBuilder(getCurrentTabIndentString() + getLabel().toString(0) + getNewLine()));
		}
		if (helpText != null)
		{
			output.append(new StringBuilder(getCurrentTabIndentString() + helpText.toString(0) + getNewLine()));
		}
		return output;
	}

	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			getChildren().removeIf(a -> a.equals(getLabel()));
			Set<ComponentHierarchyBase<?, ?, ?, ?, ?>> newOrder = new LinkedHashSet<>();
			if (!prependDiv.getChildren()
			               .isEmpty())
			{
				newOrder.add(prependDiv);
			}
			newOrder.addAll(getChildren());
			if (!appendDiv.getChildren()
			              .isEmpty())
			{
				newOrder.add(appendDiv);
			}
			setChildren(newOrder);
		}
		super.preConfigure();
	}

	@Override
	public IBSFormInputGroup<J, I> asMe()
	{
		return this;
	}

	@Override
	public SmallText<?> addHelpText(String text)
	{
		SmallText sm = super.addHelpText(text);
		getChildren().remove(sm);
		helpText = sm;
		return sm;
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
