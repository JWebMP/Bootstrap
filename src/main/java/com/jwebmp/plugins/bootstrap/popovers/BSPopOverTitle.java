package com.jwebmp.plugins.bootstrap.popovers;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.popovers.interfaces.*;

public class BSPopOverTitle<J extends BSPopOverTitle<J>> extends DivSimple<J> implements BSPopOverChildren
{
    public BSPopOverTitle()
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
