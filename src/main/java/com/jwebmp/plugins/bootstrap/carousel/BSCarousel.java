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
package com.jwebmp.plugins.bootstrap.carousel;

import com.jwebmp.core.base.angular.modules.services.angular.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.carousel.features.*;
import com.jwebmp.plugins.bootstrap.carousel.parts.*;
import com.jwebmp.plugins.bootstrap.options.BSColoursOptions;
import com.jwebmp.plugins.bootstrap.options.BSDefaultOptions;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSCarousel;

import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Carousel
 * <p>
 * A slideshow component for cycling through elements—images or slides of text—like a carousel.
 * <p>
 * In browsers where the Page Visibility API is supported, the carousel will avoid sliding when the webpage is not visible to the user (such
 * as when the browser tab is inactive, the browser window is
 * minimized, etc.). Nested carousels are not supported.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Carousel",
                      description = " slideshow component for cycling through elements—images or slides of text—like a carousel.",
                      url = "https://v4-alpha.getbootstrap.com/components/carousel/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-Bootstrap4Plugin/wiki")
@NgImportReference(name = "ViewChild",reference = "@angular/core")
@NgImportReference(name = "NgbCarousel, NgbSlideEvent, NgbSlideEventSource", reference = "@ng-bootstrap/ng-bootstrap")
public class BSCarousel<J extends BSCarousel<J>>
		extends Div<BSCarouselChildren, BSCarouselAttributes, BSCarouselFeatures, BSCarouselEvents, J>
		implements com.jwebmp.plugins.bootstrap.options.interfaces.IBSCarousel<J>, INgComponent<J>
{
	private Boolean showNavigationArrows;
	private Boolean showNavigationIndicators;
	private Integer interval;
	private Boolean pauseOnHover;
	private Boolean pauseOnFocus;
	
	@Override
	public List<String> fields()
	{
		return List.of("@ViewChild('carousel', {static : true}) carousel!: NgbCarousel;" +
		               "paused = false;");
	}
	
	@Override
	public List<String> methods()
	{
		return List.of("togglePaused() {\n" +
		               "    if (this.paused) {\n" +
		               "      this.carousel.cycle();\n" +
		               "    } else {\n" +
		               "      this.carousel.pause();\n" +
		               "    }\n" +
		               "    this.paused = !this.paused;\n" +
		               "  }",
				"" +
				"");
	}
	
	/**
	 * The actual carousel slides displaying div
	 */
	private List<BSCarouselSlide<?>> carouselSlides;
	
	/**
	 * Carousel
	 * <p>
	 * A slideshow component for cycling through elements—images or slides of text—like a carousel.
	 * <p>
	 * In browsers where the Page Visibility API is supported, the carousel will avoid sliding when the webpage is not visible to the user
	 * (such as when the browser tab is inactive, the browser window
	 * is minimized, etc.). Nested carousels are not supported.
	 */
	public BSCarousel()
	{
		setTag("ngb-carousel");
		addAttribute("#carousel", "");
	}
	
	public J addSlide(BSCarouselSlide<?> slide)
	{
		getCarouselSlides().add(slide);
		return (J)this;
	}
	
	public Boolean getShowNavigationArrows()
	{
		return showNavigationArrows;
	}
	
	public BSCarousel<J> setShowNavigationArrows(Boolean showNavigationArrows)
	{
		this.showNavigationArrows = showNavigationArrows;
		return this;
	}
	
	public Boolean getShowNavigationIndicators()
	{
		return showNavigationIndicators;
	}
	
	public BSCarousel<J> setShowNavigationIndicators(Boolean showNavigationIndicators)
	{
		this.showNavigationIndicators = showNavigationIndicators;
		return this;
	}
	
	public Integer getInterval()
	{
		return interval;
	}
	
	public BSCarousel<J> setInterval(Integer interval)
	{
		this.interval = interval;
		return this;
	}
	
	public Boolean getPauseOnHover()
	{
		return pauseOnHover;
	}
	
	public BSCarousel<J> setPauseOnHover(Boolean pauseOnHover)
	{
		this.pauseOnHover = pauseOnHover;
		return this;
	}
	
	public Boolean getPauseOnFocus()
	{
		return pauseOnFocus;
	}
	
	public BSCarousel<J> setPauseOnFocus(Boolean pauseOnFocus)
	{
		this.pauseOnFocus = pauseOnFocus;
		return this;
	}
	
	public List<BSCarouselSlide<?>> getCarouselSlides()
	{
		if(carouselSlides == null)
		{
			carouselSlides = new ArrayList<>();
		}
		return carouselSlides;
	}
	
	public BSCarousel<J> setCarouselSlides(List<BSCarouselSlide<?>> carouselSlides)
	{
		this.carouselSlides = carouselSlides;
		return this;
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (getInterval() != null)
			{
				addAttribute("[interval]", getInterval() + "");
			}
			if (getPauseOnHover() != null)
			{
				addAttribute("[pauseOnHover]", getPauseOnHover() + "");
			}
			if (getPauseOnHover() != null)
			{
				addAttribute("[pauseOnFocus]", getPauseOnFocus() + "");
			}
			if (getShowNavigationArrows()  != null)
			{
				addAttribute("[showNavigationArrows]", getShowNavigationArrows() + "");
			}
			if (getShowNavigationArrows()  != null)
			{
				addAttribute("[showNavigationIndicators]", getShowNavigationIndicators() + "");
			}
			for (BSCarouselSlide<?> carouselSlide : getCarouselSlides())
			{
				add(carouselSlide);
			}
		}
		super.init();
	}
	
	/**
	 * Returns a slimmed down version of this class
	 *
	 * @return
	 */
	public IBSCarousel<J> asMe()
	{
		return this;
	}
}
