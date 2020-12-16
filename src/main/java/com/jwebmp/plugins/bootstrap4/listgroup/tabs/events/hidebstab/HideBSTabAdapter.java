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
package com.jwebmp.plugins.bootstrap4.listgroup.tabs.events.hidebstab;

import com.guicedee.logger.LogFactory;
import com.jwebmp.core.Component;
import com.jwebmp.core.Event;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.core.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;

import jakarta.validation.constraints.NotNull;
import java.util.logging.Level;

import static com.guicedee.guicedinjection.json.StaticStrings.STRING_CLOSING_BRACKET_SEMICOLON;

/**
 * Handles all events. Over-ride methods.
 *
 * @author GedMarc
 */
@ComponentInformation(name = "BS DropDown Hiden Event",
		description = "Server Side Event for BS DropDown Hiden.",
		url = "https://www.armineasy.com/JWebSwing",
		wikiUrl = "https://github.com/GedMarc/JWebMP/wiki")
public abstract class HideBSTabAdapter
		extends Event<GlobalFeatures,HideBSTabAdapter>
		implements GlobalEvents
{

	/**
	 * Logger for the Component
	 */
	private static final java.util.logging.Logger LOG = LogFactory.getInstance()
	                                                              .getLogger("HideBSTabAdapter");

	/**
	 * The directive for this adapter
	 */
	private HideBSTabDirective directive;

	/**
	 * Performs a click
	 *
	 * @param component
	 * 		The component this click is going to be acting on
	 */
	public HideBSTabAdapter(Component component)
	{
		super(EventTypes.undefined, component);
		setComponent(component);
	}

	@Override
	public void fireEvent(AjaxCall<?> call, AjaxResponse<?> response)
	{
		try
		{
			onHide(call, response);
		}
		catch (Exception e)
		{
			LOG.log(Level.WARNING, "Error In Firing Event", e);
		}
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * This object is never equal to another as an event
	 *
	 * @param obj
	 *
	 * @return
	 */
	@Override
	public boolean equals(Object obj)
	{
		return false;
	}

	/**
	 * Sets JQuery and Angular enabled, adds the directive to angular, and the attribute to the component
	 */
	@Override
	public void preConfigure()
	{
		if (!isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			
			getComponent().asAttributeBase().addAttribute("hide-bs-tab", com.jwebmp.core.utilities.StaticStrings.STRING_ANGULAR_EVENT_START + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
		}
		super.preConfigure();
	}

	/**
	 * Triggers on Click
	 * <p>
	 *
	 * @param call
	 * 		The physical AJAX call
	 * @param response
	 * 		The physical Ajax Receiver
	 */
	public abstract void onHide(AjaxCall<?> call, AjaxResponse<?> response);

	/**
	 * Returns the angular directive associated with the right click event
	 *
	 * @return
	 */
	@NotNull
	public HideBSTabDirective getDirective()
	{
		if (directive == null)
		{
			directive = new HideBSTabDirective();
		}
		return directive;
	}

	/**
	 * Sets the right click angular event
	 *
	 * @param directive
	 */
	public void setDirective(HideBSTabDirective directive)
	{
		this.directive = directive;
	}
}
