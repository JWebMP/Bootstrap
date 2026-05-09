package com.jwebmp.plugins.bootstrap.navbar;

import com.google.common.base.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.children.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;

/**
 * A navigation link item
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSNavBarLink<J extends BSNavBarLink<J>>
        extends Link<J>
        implements BSNavsChildren, ListItemChildren
{
    private String routerLink;

    /**
     * A navigation link item
     */
    public BSNavBarLink(String routerLink)
    {
        this.routerLink = routerLink;
        setTag("a");
        addClass("nav-link");
    }

    @Override
    protected void init()
    {
        if (!Strings.isNullOrEmpty(routerLink))
        {
            addAttribute("routerLink", routerLink);
        }
        removeAttribute("href");
        super.init();
    }

    public String getRouterLink()
    {
        return routerLink;
    }

    public J setRouterLink(String routerLink)
    {
        this.routerLink = routerLink;
        return (J) this;
    }
}
