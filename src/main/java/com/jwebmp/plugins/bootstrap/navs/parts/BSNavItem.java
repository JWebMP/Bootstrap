package com.jwebmp.plugins.bootstrap.navs.parts;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportModule;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.ListItem;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.BSNavBarChildren;
import com.jwebmp.plugins.bootstrap.navs.interfaces.BSNavsChildren;
import jakarta.validation.constraints.NotNull;

import java.util.Set;

/**
 * @author GedMarc
 * @since 23 Jan 2017
 */
@NgImportReference(value = "NgbNavItem", reference = "@ng-bootstrap/ng-bootstrap")
@NgImportModule("NgbNavItem")
public class BSNavItem<J extends BSNavItem<J>>
        extends ListItem<J>
        implements BSNavsChildren, BSNavBarChildren, INgComponent<J>
{
    private String tabId;
    private BSNavLink<?> linkItem;
    private BSNavContent<?> content;

    /**
     * Constructs a list item with a link item inside
     */
    public BSNavItem(Integer tabId)
    {
        this.tabId = String.valueOf(tabId);
    }

    @Override
    protected void init()
    {
        addAttribute("[ngbNavItem]", tabId);
        add(linkItem);
        add(content);
        super.init();
    }

    /**
     * Sets the link item
     *
     * @param linkItem
     * @return
     */
    @SuppressWarnings("unchecked")
    public J setLinkItem(BSNavLink<?> linkItem)
    {
        this.linkItem = linkItem;
        return (J) this;
    }

    /**
     * Returns the associated Link Item
     *
     * @return
     */
    @NotNull
    public BSNavLink<?> getLinkItem()
    {
        return linkItem;
    }

    public String getTabId()
    {
        return tabId;
    }

    public J setTabId(String tabId)
    {
        this.tabId = tabId;
        return (J) this;
    }

    public BSNavContent<?> getContent()
    {
        return content;
    }

    public J setContent(BSNavContent<?> content)
    {
        this.content = content;
        return (J) this;
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
}
