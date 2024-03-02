package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;

public class BSAccordionPanelHeader<J extends BSAccordionPanelHeader<J>> extends DivSimple<J>
{
    public BSAccordionPanelHeader()
    {
        setTag("h2");
        addAttribute("ngbAccordionItem", "");
    }

    public J addTitle(Button<?, ?, ?, ?, ?> button)
    {
        button.addAttribute("ngbAccordionButton", "");
        add(button);
        return (J) this;
    }

}
