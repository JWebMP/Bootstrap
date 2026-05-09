package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.html.interfaces.events.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;
import com.jwebmp.plugins.bootstrap.navs.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;

/**
 * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states. Swap
 * modifier classes to switch between each style.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Navs",
                      description = "Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and " +
                              "disabled states. Swap modifier classes to switch between each style.",
                      url = "https://v4-alpha.getbootstrap.com/components/navs/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSNavBarNavs<J extends BSNavBarNavs<J>>
        extends Div<BSNavsChildren, BSNavsAttributes, GlobalFeatures, GlobalEvents, J>
        implements BSNavBarChildren, INgComponent<J>
{
    /**
     * Navs Navigation available in Bootstrap share general markup and styles, from the base .nav class to the active and disabled states.
     * Swap modifier classes to switch between each style.
     */
    public BSNavBarNavs()
    {
        setTag("ul");
        addClass("navbar-nav");
    }

    public J addNav(BSNavBarItem<?> navBarItem)
    {
        return addNav(navBarItem, false);
    }

    public J addNav(BSNavBarItem<?> navBarItem, boolean active)
    {
        add(navBarItem);
        if (active)
        {
            navBarItem.addClass("active");
        }
        return (J) this;
    }

    @Override
    protected void init()
    {
        super.init();
    }

}
