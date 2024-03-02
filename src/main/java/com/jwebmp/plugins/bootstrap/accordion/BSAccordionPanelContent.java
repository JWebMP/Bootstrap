package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import jakarta.validation.constraints.NotNull;

public class BSAccordionPanelContent<J extends BSAccordionPanelContent<J>> extends DivSimple<J>
{
    private boolean collapse = true;
    private BSAccordionPanelBody<?> body = new BSAccordionPanelBody<>();

    public BSAccordionPanelContent()
    {
        //	setTag("ng-template");
    }

    @Override
    public void init()
    {
        if (!isInitialized())
        {
            if (collapse)
            {
                addAttribute("ngbAccordionCollapse", "");
            }
            super.add(body);
        }
        super.init();
    }


    @Override
    public @NotNull J add(@NotNull String textToAdd)
    {
        body.add(textToAdd);
        return (J) this;
    }

    @Override
    public @NotNull J add(@NotNull GlobalChildren newChild)
    {
        body.add(newChild);
        return (J) this;
    }

    @Override
    public @NotNull J add(@NotNull Integer position, @NotNull GlobalChildren newChild)
    {
        body.add(position, newChild);
        return (J) this;
    }

    public boolean isCollapse()
    {
        return collapse;
    }

    public J setCollapse(boolean collapse)
    {
        this.collapse = collapse;
        return (J) this;
    }
}
