package com.jwebmp.plugins.bootstrap.navbar.parts;

import com.google.common.base.*;
import com.jwebmp.core.base.angular.client.annotations.references.NgComponentReference;
import com.jwebmp.core.base.angular.components.modules.RouterModuleConfig;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Image;
import com.jwebmp.plugins.bootstrap.navbar.enumerations.BSNavBarOptions;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;

import jakarta.validation.constraints.NotNull;

/**
 * Brand
 * <p>
 * The .navbar-brand can be applied to most elements, but an anchor works best as some elements might require utility classes or custom
 * styles.
 *
 * @author GedMarc
 * @since 21 Jan 2017
 */
@NgComponentReference(RouterModuleConfig.class)
public class BSNavBarBrand<J extends BSNavBarBrand<J>>
        extends DivSimple<J>
        implements BSNavBarChildren
{
    private String routerLink;

    /**
     * Brand
     * <p>
     * The .navbar-brand can be applied to most elements, but an anchor works best as some elements might require utility classes or custom
     * styles.
     */
    public BSNavBarBrand()
    {
        addClass(BSNavBarOptions.Brand);
        setTag("a");
        addAttribute("href", "#");
    }

    /**
     * Adds a BS Image with the image properties all set
     *
     * @param imageUrl
     * @return
     */
    public BSNavBarBrandImage<?> addImage(String imageUrl)
    {
        return addImage(imageUrl, null);
    }

    public String getRouterLink()
    {
        return routerLink;
    }

    @SuppressWarnings("unchecked")
    public J setRouterLink(String routerLink)
    {
        this.routerLink = routerLink;
        return (J) this;
    }

    /**
     * Adds a BS Image with the image properties all set
     *
     * @param imageUrl
     * @return
     */
    @NotNull
    public BSNavBarBrandImage<?> addImage(String imageUrl, String textAfter)
    {
        Image<?> image = new Image<>(imageUrl);
        BSNavBarBrandImage<?> brandImage = new BSNavBarBrandImage<>(image);

        image.addStyle("width", "30px");
        image.addStyle("height", "30px");
        image.addClass("d-inline-block align-top");

        add(image);

        addText(textAfter);
        return brandImage;
    }

    @SuppressWarnings("unchecked")
    public J addText(String text)
    {
        if (text != null)
        {
            setText(text);
        }
        return (J) this;
    }

    @Override
    protected void init()
    {
        if (!Strings.isNullOrEmpty(routerLink))
        {
            addAttribute("[routerLink]", routerLink);
        }
    }
}
