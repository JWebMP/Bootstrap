package com.jwebmp.plugins.bootstrap.carousel;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.carousel.parts.BSCarouselSlide;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSCarousel;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
 * @author GedMarc
 * @version 1.0
 * @since 01 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Carousel",
        description = " slideshow component for cycling through elements—images or slides of text—like a carousel.",
        url = "https://v4-alpha.getbootstrap.com/components/carousel/",
        wikiUrl = "https://github.com/GedMarc/JWebMP-Bootstrap4Plugin/wiki")

@NgImportReference(value = "ViewChild", reference = "@angular/core")
@NgImportReference(value = "NgbCarousel, NgbSlideEvent, NgbSlideEventSource,NgbSlide",
        reference = "@ng-bootstrap/ng-bootstrap")

@NgImportModule("NgbCarousel")
@NgImportModule("NgbSlide")
public abstract class BSCarousel<J extends BSCarousel<J>>
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
        return List.of("@ViewChild('carousel', {static : true}) carousel!: NgbCarousel;",
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
        return (J) this;
    }

    public Boolean getShowNavigationArrows()
    {
        return showNavigationArrows;
    }

    @SuppressWarnings("unchecked")
    public J setShowNavigationArrows(Boolean showNavigationArrows)
    {
        this.showNavigationArrows = showNavigationArrows;
        return (J) this;
    }

    public Boolean getShowNavigationIndicators()
    {
        return showNavigationIndicators;
    }

    @SuppressWarnings("unchecked")
    public J setShowNavigationIndicators(Boolean showNavigationIndicators)
    {
        this.showNavigationIndicators = showNavigationIndicators;
        return (J) this;
    }

    public Integer getInterval()
    {
        return interval;
    }

    @SuppressWarnings("unchecked")
    public J setInterval(Integer interval)
    {
        this.interval = interval;
        return (J) this;
    }

    public Boolean getPauseOnHover()
    {
        return pauseOnHover;
    }

    @SuppressWarnings("unchecked")
    public J setPauseOnHover(Boolean pauseOnHover)
    {
        this.pauseOnHover = pauseOnHover;
        return (J) this;
    }

    public Boolean getPauseOnFocus()
    {
        return pauseOnFocus;
    }

    @SuppressWarnings("unchecked")
    public J setPauseOnFocus(Boolean pauseOnFocus)
    {
        this.pauseOnFocus = pauseOnFocus;
        return (J) this;
    }

    public List<BSCarouselSlide<?>> getCarouselSlides()
    {
        if (carouselSlides == null)
        {
            carouselSlides = new ArrayList<>();
        }
        return carouselSlides;
    }

    @SuppressWarnings("unchecked")
    public J setCarouselSlides(List<BSCarouselSlide<?>> carouselSlides)
    {
        this.carouselSlides = carouselSlides;
        return (J) this;
    }

    @Override
    protected void init()
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
            if (getShowNavigationArrows() != null)
            {
                addAttribute("[showNavigationArrows]", getShowNavigationArrows() + "");
            }
            if (getShowNavigationArrows() != null)
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
