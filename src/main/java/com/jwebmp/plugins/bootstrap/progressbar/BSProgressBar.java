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
package com.jwebmp.plugins.bootstrap.progressbar;

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.htmlbuilder.css.measurement.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.*;
import com.jwebmp.plugins.bootstrap.options.*;
import com.jwebmp.plugins.bootstrap.progressbar.interfaces.*;
import jakarta.validation.constraints.*;

/**
 * Progress
 * <p>
 * Use our custom progress component for displaying simple or complex progress bars.
 * We don’t use the HTML5 progress element, ensuring you can stack progress bars, animate them, and place text
 * labels over them.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Progress Bars",
                      description = "Use our custom progress component for displaying simple or complex progress bars.",
                      url = "https://v4-alpha.getbootstrap.com/components/progress/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSProgressBar<J extends BSProgressBar<J>>
		extends Div<BSProgressBarChildren, NoAttributes, BSProgressBarFeatures, BSProgressBarEvents, J>
{
	private double percent;
	
	/**
	 * Whether or not the progress bar is striped
	 */
	private Boolean striped;
	/**
	 * if animated
	 */
	private Boolean animated;
	
	private Integer max;
	private BSColourTypes type;
	private BSColourTypes textType;
	private Boolean showValue;
	
	private MeasurementCSSImpl height;
	
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
	 * @param striped If the progress bar is striped or not
	 */
	public BSProgressBar(boolean striped)
	{
		setTag("ngb-progressbar");
		setStriped(striped);
	}
	
	@Override
	public void init()
	{
		if (getAttribute("[value]") == null)
		{
			addAttribute("[value]", percent + "");
		}
		if (type != null)
		{
			addAttribute("type", type.toString());
		}
		if (textType != null)
		{
			addAttribute("textType", textType.toString());
		}
		if (showValue != null)
		{
			addAttribute("[showValue]", showValue + "");
		}
		if (max != null)
		{
			addAttribute("[max]", max + "");
		}
		
		if (getAttribute("[striped]") == null)
		if (striped != null)
		{
			addAttribute("[striped]", striped + "");
		}
		if (height != null)
		{
			addAttribute("height", height + "");
		}
		if (getAttribute("[animated]") == null)
		if (animated != null)
		{
			addAttribute("[animated]", animated + "");
		}
		
		
		super.init();
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
		return (J) this;
	}
	
	/**
	 * Sets the given percentage
	 *
	 * @param percent
	 * @return
	 */
	
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPercentage(double percent)
	{
		this.percent = percent;
		return (J) this;
	}
	
	public double getPercent()
	{
		return percent;
	}
	
	public Boolean getStriped()
	{
		return striped;
	}
	
	public Boolean getAnimated()
	{
		return animated;
	}
	
	public Integer getMax()
	{
		return max;
	}
	
	public J setMax(Integer max)
	{
		this.max = max;
		return (J) this;
	}
	
	public BSColourTypes getType()
	{
		return type;
	}
	
	public J setType(BSColourTypes type)
	{
		this.type = type;
		return (J) this;
	}
	
	public Boolean getShowValue()
	{
		return showValue;
	}
	
	public J setShowValue(Boolean showValue)
	{
		this.showValue = showValue;
		return (J) this;
	}
	
	public MeasurementCSSImpl getHeight()
	{
		return height;
	}
	
	public J setHeight(MeasurementCSSImpl height)
	{
		this.height = height;
		return (J) this;
	}
	
	public BSColourTypes getTextType()
	{
		return textType;
	}
	
	public J setTextType(BSColourTypes textType)
	{
		this.textType = textType;
		return (J) this;
	}
}
