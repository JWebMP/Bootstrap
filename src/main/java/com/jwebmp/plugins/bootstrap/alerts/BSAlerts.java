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
package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.*;
import com.jwebmp.plugins.bootstrap.alerts.events.*;

import java.util.*;
import java.util.List;

/**
 * Alerts
 * <p>
 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
@NgComponent("alert-closable")
@ComponentInformation(name = "Bootstrap Alert",
                      description = "Provide contextual feedback messages for typical user actions with the handful of available and flexible alert " + "messages.",
                      url = "https://v4-alpha.getbootstrap.com/components/alerts/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
@NgDataTypeReference(Alert.class)
@NgImportReference(name = "AfterViewInit", reference = "@angular/core")
@NgImportReference(name = "OnDestroy", reference = "@angular/core")
public abstract class BSAlerts<J extends BSAlerts<J>>
		extends Div<GlobalChildren, NoAttributes, GlobalFeatures, BSAlertEvents, J>
		implements IBSAlerts<J>, INgComponent<J>
{
	private AlertDataService alertDataService;
	
	public BSAlerts(AlertDataService alertDataService)
	{
		this();
		this.alertDataService = alertDataService;
	}
	
	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlerts()
	{
	
	}
	
	public String getServiceName()
	{
		if (alertDataService == null)
		{
			return "alertDataService";
		}
		String name = ITSComponent.getTsFilename(alertDataService.getClass());
		name = name.substring(0, 1)
		           .toLowerCase() + name.substring(1);
		return name;
	}
	
	@Override
	public List<String> componentFields()
	{
		return List.of("    data?: any;\n" +
		               "    private updated: boolean = false;");
	}
	
	@Override
	public List<String> componentMethods()
	{
		if (alertDataService != null)
		{
			String name = getServiceName();
			return List.of("ngAfterViewInit(): void {\n" +
			               "        this." + name + ".data.subscribe((dd) => {\n" +
			               "            this.data = dd;\n" +
			               "            this.updated = true;\n" +
			               "        });\n" +
			               "    }",
					
					
					
					"close(alertItem: Alert) {\n" +
			               "    this.data.out?.splice(this.data.out?.indexOf(alertItem), 1);\n" +
			               "}\n");
		}
		else
		{
			return List.of();
		}
	}
	
	@Override
	public List<String> componentInterfaces()
	{
		return List.of("AfterViewInit");
	}
	
	@Override
	public List<String> componentConstructorParameters()
	{
		List<String> out = new ArrayList<>();
		if (alertDataService != null)
		{
			out.add("public " + getServiceName() + " : " + alertDataService.getClass()
			                                                               .getSimpleName());
		}
		return out;
	}
	
	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlerts(String paragraph)
	{
		this();
		setText(paragraph);
	}
	
	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlerts(IComponentHierarchyBase<?, ?> component)
	{
		this();
		add(component);
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			String name = getServiceName();
			addAttribute("*ngFor", "let alert of data?.out");
			
			add(new BSAlertsAlert().setType(BSColourTypes.AlertsType)
			                       .bind("alert.message")
			                       .addAttribute("(closed)", "close(alert)"));
		}
	}
	
	/**
	 * Neater view of this component
	 *
	 * @return
	 */
	public IBSAlerts<?> asMe()
	{
		return this;
	}
	
}
