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

import java.util.Set;

/**
 * @author GedMarc
 * @since 13 Jan 2017
 */
@NgImportReference(value = "NgbDropdownItem", reference = "@ng-bootstrap/ng-bootstrap")
public class BSDropDownItem<J extends BSDropDownItem<J>>
        extends DivSimple<J> implements INgComponent<J>
{
    public BSDropDownItem()
    {
        setTag("button");
        addAttribute("ngbDropdownItem", "");
    }

    @Override
    public Set<String> moduleImports()
    {
        var s = INgComponent.super.moduleImports();
        s.add("NgbDropdownItem");
        return s;
    }

}
