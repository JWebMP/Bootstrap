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
package com.jwebmp.plugins.bootstrap4.progressbar;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap4.progressbar.bar.BSProgressBarDisplay;
import com.jwebmp.plugins.bootstrap4.progressbar.interfaces.BSProgressBarChildren;
import com.jwebmp.plugins.bootstrap4.progressbar.interfaces.BSProgressBarEvents;
import com.jwebmp.plugins.bootstrap4.progressbar.interfaces.BSProgressBarFeatures;

import jakarta.validation.constraints.NotNull;

/**
 * Progress
 * <p>
 * Use our custom progress component for displaying simple or complex progress bars.
 * We don’t use the HTML5 progress element, ensuring you can stack progress bars, animate them, and place text
 * labels over them.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Progress Bars",
		description = "Use our custom progress component for displaying simple or complex progress bars.",
		url = "https://v4-alpha.getbootstrap.com/components/progress/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSProgressBar<J extends BSProgressBar<J>>
		extends Div<BSProgressBarChildren, BSProgressBarAttributes, BSProgressBarFeatures, BSProgressBarEvents, J>
{
	/**
	 * Whether or not the progress bar is striped
	 */
	private boolean striped;
	/**
	 * Whether or not this progress bar should display as active
	 */
	private boolean active;
	/**
	 * if animated
	 */
	private boolean animated;

	/**
	 * The actual progress bar
	 */
	private BSProgressBarDisplay<?> progressBar;

	/**
	 * Use our custom progress component for displaying simple or complex progress bars.
	 */
	public BSProgressBar()
	{
		this(false);
	}

	/**
	 * Creates a new instance of a progress bar
	 *
	 * @param striped
	 * 		If the progress bar is striped or not
	 */
	public BSProgressBar(boolean striped)
	{
		this(striped, false);
	}

	/**
	 * Creates a new instance of a progress bar
	 *
	 * @param striped
	 * 		If the progress bar is striped or not
	 * @param active
	 * 		if the progress bar is active or not
	 */
	public BSProgressBar(boolean striped, boolean active)
	{
		this(striped, active, null);
	}

	/**
	 * Creates a new instance of a progress bar
	 *
	 * @param striped
	 * 		If the progress bar is striped or not
	 * @param active
	 * 		if the progress bar is active or not
	 * @param progressBar
	 * 		The actual progress bar
	 */
	public BSProgressBar(boolean striped, boolean active, BSProgressBarDisplay<?> progressBar)
	{
		addClass(BSProgressBarOptions.Progress);
		setStriped(striped);
		setActive(active);
		setProgressBar(progressBar);

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

	/**
	 * Returns if this progress bar should return as active
	 *
	 * @return
	 */
	public boolean isActive()
	{
		return active;
	}

	/**
	 * Sets if this component should return as active
	 *
	 * @param active
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		this.active = active;
		if (active)
		{
			getProgressBar().addClass(BSDefaultOptions.Active);
		}
		else
		{
			getProgressBar().removeClass(BSDefaultOptions.Active);
		}
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

	/**
	 * Sets if animated
	 *
	 * @param animated
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAnimated(boolean animated)
	{
		this.animated = animated;
		if (animated)
		{
			getProgressBar().addClass(BSProgressBarOptions.Progress_Bar_Animated);
		}
		else
		{
			getProgressBar().removeClass(BSProgressBarOptions.Progress_Bar_Animated);
		}
		return (J) this;
	}

	/**
	 * Returns the actual progress bar
	 *
	 * @return
	 */

	public BSProgressBarDisplay<?> getProgressBar()
	{
		if (progressBar == null)
		{
			progressBar = new BSProgressBarDisplay<>();
			setProgressBar(progressBar);
		}
		return progressBar;
	}

	/**
	 * Sets the actual progress bar
	 *
	 * @param progressBar
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setProgressBar(BSProgressBarDisplay<?> progressBar)
	{
		remove(this.progressBar);
		this.progressBar = progressBar;
		if (progressBar != null)
		{
			add(progressBar);
		}
		return (J) this;
	}

	/**
	 * Sets if this component is striped or not
	 *
	 * @return
	 */

	public boolean isStriped()
	{
		return striped;
	}

	/**
	 * Sets if this components is striped or not
	 *
	 * @param striped
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public final J setStriped(boolean striped)
	{
		this.striped = striped;
		if (striped)
		{
			getProgressBar().addClass(BSProgressBarOptions.Progress_Bar_Striped);
		}
		else
		{
			getProgressBar().removeClass(BSProgressBarOptions.Progress_Bar_Striped);
		}
		return (J) this;
	}

	/**
	 * Sets the given percentage
	 *
	 * @param percent
	 *
	 * @return
	 */

	@SuppressWarnings("unchecked")
	@NotNull
	public J setPercentage(double percent)
	{
		getProgressBar().setValue(percent);
		return (J) this;
	}

}
