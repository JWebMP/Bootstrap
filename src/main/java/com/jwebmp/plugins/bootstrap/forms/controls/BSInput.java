/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
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
