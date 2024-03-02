package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;

public class BSAccordionItem<J extends BSAccordionItem<J>> extends DivSimple<J> implements BSAccordionChildren
{
    private boolean active;
    private boolean destroyOnHide;

    private BSAccordionPanelHeader<?> header;
    private BSAccordionPanelContent<?> content;


    public BSAccordionItem()
    {
        addAttribute("ngbAccordionItem", "");
    }

    @Override
    public void init()
    {
        if (!isInitialized())
        {
            if (destroyOnHide)
            {
                addAttribute("[destroyOnHide]", "true");
            }
            add(header);
            add(content);
        }
        super.init();
    }


    public boolean isActive()
    {
        return active;
    }

    public J setActive(boolean active)
    {
        this.active = active;
        return (J) this;
    }

    public J addHeader(BSAccordionPanelHeader<?> header)
    {
        this.header = header;
        return (J) this;
    }

    public J addContent(BSAccordionPanelContent<?> content)
    {
        this.content = content;
        return (J) this;
    }

    public boolean isDestroyOnHide()
    {
        return destroyOnHide;
    }

    public J setDestroyOnHide(boolean destroyOnHide)
    {
        this.destroyOnHide = destroyOnHide;
        return (J) this;
    }
}
