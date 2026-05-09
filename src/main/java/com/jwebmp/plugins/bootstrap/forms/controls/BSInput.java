package com.jwebmp.plugins.bootstrap.forms.controls;

import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.html.attributes.GlobalAttributes;
import com.jwebmp.core.base.html.attributes.InputTypes;
import com.jwebmp.core.base.html.attributes.NoAttributes;
import com.jwebmp.plugins.bootstrap.forms.groups.BSFormGroupChildren;
import com.jwebmp.plugins.bootstrap.forms.groups.enumerations.BSFormGroupOptions;

/**
 * Denotes a bootstrap input type
 *
 * @author GedMarc
 * @since 17 Jan 2017
 */
public class BSInput<J extends BSInput<J>>
        extends Input<NoAttributes, J>
        implements BSFormGroupChildren
{
    /**
     * Allows construction of a bootstrap input component
     */
    public BSInput()
    {
        //input
    }

    /**
     * Allows construction of a bootstrap input component
     *
     * @param inputType
     */
    public BSInput(InputTypes inputType)
    {
        super(inputType);

    }

    @Override
    protected void preConfigure()
    {
        if (!isConfigured())
        {
            addAttribute(GlobalAttributes.Name, getID());
            addClass(BSFormGroupOptions.Form_Control.toString());
        }
        super.preConfigure();
    }
}
