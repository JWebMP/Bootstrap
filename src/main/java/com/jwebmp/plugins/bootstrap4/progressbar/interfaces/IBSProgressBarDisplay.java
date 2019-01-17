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
package com.jwebmp.plugins.bootstrap4.progressbar.interfaces;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.plugins.bootstrap4.options.BSBackgroundOptions;
import com.jwebmp.plugins.bootstrap4.progressbar.bar.BSProgressBarDisplay;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 21 Feb 2017
 */
public interface IBSProgressBarDisplay<J extends BSProgressBarDisplay>
{

	/**
	 * Returns this label
	 *
	 * @return
	 */
	String getLabel();

	/**
	 * Gets the current max value
	 *
	 * @return
	 */
	double getMax();

	/**
	 * Returns this associated span
	 *
	 * @return
	 */
	Span getSpan();

	/**
	 * Returns the current percentage
	 *
	 * @return
	 */
	double getValue();

	/**
	 * Sets this label
	 *
	 * @param label
	 *
	 * @return
	 */
	J setLabel(String label);

	/**
	 * Sets the current max value
	 *
	 * @param max
	 *
	 * @return
	 */
	J setMax(double max);

	/**
	 * Returns the current min value
	 *
	 * @param min
	 *
	 * @return
	 */
	J setMin(double min);

	/**
	 * Sets the current theme
	 *
	 * @param theme
	 *
	 * @return
	 */
	J setTheme(BSBackgroundOptions theme);

	/**
	 * Sets the current percentage / width
	 *
	 * @param value
	 *
	 * @return
	 */
	J setValue(double value);

}
