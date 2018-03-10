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
package za.co.mmagon.jwebswing.plugins.bootstrap4.progressbar.bar;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSBackgroundOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSColoursOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.progressbar.interfaces.BSProgressBarDisplayEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap4.progressbar.interfaces.BSProgressBarDisplayFeatures;
import za.co.mmagon.jwebswing.plugins.bootstrap4.progressbar.interfaces.IBSProgressBarDisplay;

import javax.validation.constraints.NotNull;

/**
 * An implementation of the bootstrap bar
 * <p>
 *
 * @param <J>
 *
 * @author Marc Magon
 * @version 1.0
 * @since 29 Aug 2015
 */
public class BSProgressBarDisplay<J extends BSProgressBarDisplay<J>>
		extends Div<GlobalChildren, BSProgressBarDisplayAttributes, BSProgressBarDisplayFeatures, BSProgressBarDisplayEvents, J>
		implements IBSProgressBarDisplay<J>
{

	private static final long serialVersionUID = 1L;

	private Span span;

	/**
	 * The min value to apply
	 */
	private double min;
	/**
	 * The max value to apply
	 */
	private double max;
	/**
	 * The value to apply
	 */
	private double value;
	/**
	 * The label of the bar
	 */
	private String label;
	/**
	 * Sets the item animated
	 */
	private boolean animated;

	/**
	 * Constructs an empty progress bar display
	 */
	public BSProgressBarDisplay()
	{

		this(0, 100, 0);

	}

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param min
	 * 		The minimum value
	 * @param max
	 * 		The maximum value
	 * @param value
	 * 		The actual percentage value
	 */
	public BSProgressBarDisplay(double min, double max, double value)
	{
		this(min, max, value, null);
	}

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param min
	 * 		The minimum value
	 * @param max
	 * 		The maximum value
	 * @param value
	 * 		The actual percentage value
	 * @param label
	 * 		The label to display
	 */
	public BSProgressBarDisplay(double min, double max, double value, String label)
	{
		setMin(min);
		setMax(max);
		setValue(value);
		setLabel(label);
		addClass("progress-bar");
		addAttribute(BSProgressBarDisplayAttributes.Role, "progressbar");
	}

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param value
	 * 		The actual percentage value
	 */
	public BSProgressBarDisplay(double value)
	{
		this(0, 100, value);
	}

	/**
	 * Construct a new progress bar display with the given values
	 *
	 * @param value
	 * 		The actual percentage value
	 * @param label
	 * 		The label to display
	 */
	public BSProgressBarDisplay(double value, String label)
	{
		this(0, 100, value, label);
	}

	/**
	 * Returns the current min value
	 *
	 * @return
	 */
	public double getMin()
	{
		return min;
	}

	/**
	 * Returns the current min value
	 *
	 * @param min
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setMin(double min)
	{
		this.min = min;
		addAttribute(BSProgressBarDisplayAttributes.Aria_ValueMin, Double.toString(min));
		return (J) this;
	}

	/**
	 * Sets the current theme
	 *
	 * @param theme
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setTheme(BSBackgroundOptions theme)
	{
		addClass(theme);
		return (J) this;
	}

	/**
	 * Returns this label
	 *
	 * @return
	 */
	@Override
	public String getLabel()
	{
		return label;
	}

	/**
	 * Sets this label
	 *
	 * @param label
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setLabel(String label)
	{
		this.label = label;
		getSpan().setText(label);
		return (J) this;
	}

	/**
	 * Gets the current max value
	 *
	 * @return
	 */
	@Override
	public double getMax()
	{
		return max;
	}

	/**
	 * Sets the current max value
	 *
	 * @param max
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setMax(double max)
	{
		this.max = max;
		addAttribute(BSProgressBarDisplayAttributes.Aria_ValueMax, Double.toString(max));
		return (J) this;
	}

	/**
	 * Returns this associated span
	 *
	 * @return
	 */
	@Override
	public Span getSpan()
	{
		if (span == null)
		{
			span = new Span();
			add(span);
		}
		span.addClass(BSColoursOptions.Sr_Only);
		return span;
	}

	/**
	 * Returns the current percentage
	 *
	 * @return
	 */
	@Override
	public double getValue()
	{
		return value;
	}

	/**
	 * Sets the current percentage / width
	 *
	 * @param value
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setValue(double value)
	{
		this.value = value;
		addAttribute(BSProgressBarDisplayAttributes.Aria_Valuenow, Double.toString(value));
		addAttribute(GlobalAttributes.Style, "width:" + value + "%;");
		return (J) this;
	}

	/**
	 * If is animated
	 *
	 * @return
	 */
	public boolean isAnimated()
	{
		return animated;
	}

	public void setAnimated(boolean animated)
	{
		if (animated)
		{
			addClass("progress-bar-animated");
		}
		else
		{
			removeClass("progress-bar-animated");
		}

		this.animated = animated;
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
