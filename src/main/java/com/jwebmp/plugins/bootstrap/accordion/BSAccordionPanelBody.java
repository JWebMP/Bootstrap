package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import jakarta.validation.constraints.NotNull;

public class BSAccordionPanelBody<J extends BSAccordionPanelBody<J>> extends DivSimple<J>
{
    private DivSimple<?> ngTemplate = new DivSimple<>();

    public BSAccordionPanelBody()
    {
        addAttribute("ngbAccordionBody", "");
        ngTemplate.setTag("ng-template");
    }

    @Override
    public void init()
    {
        if (!isInitialized())
        {
            super.add(ngTemplate);
        }
        super.init();
    }

    @Override
    public @NotNull J add(@NotNull String textToAdd)
    {
        ngTemplate.add(textToAdd);
        return (J) this;
    }

    @Override
    public @NotNull J add(@NotNull GlobalChildren newChild)
    {
        ngTemplate.add(newChild);
        return (J) this;
    }

    @Override
    public @NotNull J add(@NotNull Integer position, @NotNull GlobalChildren newChild)
    {
        ngTemplate.add(position, newChild);
        return (J) this;
    }


}
