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
package com.jwebmp.plugins.bootstrap.dropdown.parts;

import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgComponent;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;

import java.util.Set;

/**
 * @author GedMarc
 * @since 13 Jan 2017
 */
@NgImportReference(value = "NgbDropdownMenu", reference = "@ng-bootstrap/ng-bootstrap")
public class BSDropDownMenu<J extends BSDropDownMenu<J>>
        extends DivSimple<J> implements INgComponent<J>
{
    @Override
    public Set<String> moduleImports()
    {
        var s = INgComponent.super.moduleImports();
        s.add("NgbDropdownMenu");
        return s;
    }


    /**
     * Identifies a drop down menu
     *
     * @author GedMarc
     * @since 13 Jan 2017
     */
    public BSDropDownMenu()
    {
        addAttribute("ngbDropdownMenu", "");
    }

    /**
     * Adds a new item to the menu
     *
     * @param text
     * @return
     */
    public BSDropDownItem<?> addItem(String text)
    {
        BSDropDownItem<?> link = new BSDropDownItem<>();
        link.setText(text);
        add(link);
        return link;
    }

    /**
     * Adds a new item to the menu
     *
     * @param text
     * @return
     */
    public BSNavDropDownItem<?> addNavItem(String text)
    {
        return addNavItem().setText(text);
    }

    /**
     * Adds a new item to the menu
     *
     * @return
     */
    public BSNavDropDownItem<?> addNavItem()
    {
        BSNavDropDownItem<?> link = new BSNavDropDownItem<>();
        add(link);
        return link;
    }

    /**
     * Adds a divider to the menu
     *
     * @return
     */
    public J addDivider()
    {
        BSDropDownDivider<?> divider = new BSDropDownDivider<>();
        add(divider);
        return (J) this;
    }

    /**
     * Adds a header with the given text set
     *
     * @param text
     * @return
     */
    public J addHeader(String text)
    {
        BSDropDownHeader<?> menu = new BSDropDownHeader<>();
        menu.setText(text);
        add(menu);
        return (J) this;
    }

    /**
     * Adds a header with the given text set
     *
     * @param header
     * @return
     */
    public J addHeader(IComponentHierarchyBase<?, ?> header)
    {
        BSDropDownHeader<?> menu = new BSDropDownHeader<>();
        menu.add(header);
        add(menu);
        return (J) this;
    }
}
