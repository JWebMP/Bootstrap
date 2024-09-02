package com.jwebmp.plugins.bootstrap.popovers;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.popovers.interfaces.*;

public class BSPopOverContent<J extends BSPopOverContent<J>> extends DivSimple<J> implements BSPopOverChildren
{
    public BSPopOverContent()
    {
        setTag("ng-template");
    }

    @Override
    protected void init()
    {
        addAttribute("#" + getID(), "");
        super.init();
    }

}
