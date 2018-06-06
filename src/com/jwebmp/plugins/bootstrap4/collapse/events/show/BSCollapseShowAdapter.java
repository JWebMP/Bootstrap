/*
 * Copyright (C) 2017 Marc Magon
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
package com.jwebmp.plugins.bootstrap4.collapse.events.show;

import com.jwebmp.Component;
import com.jwebmp.Event;
import com.jwebmp.base.ajax.AjaxCall;
import com.jwebmp.base.ajax.AjaxResponse;
import com.jwebmp.base.angular.AngularPageConfigurator;
import com.jwebmp.base.html.interfaces.events.GlobalEvents;
import com.jwebmp.events.activate.ActivateDirective;
import com.jwebmp.htmlbuilder.javascript.events.enumerations.EventTypes;
import com.jwebmp.logger.LogFactory;
import com.jwebmp.plugins.ComponentInformation;
import com.jwebmp.plugins.jquery.JQueryPageConfigurator;

import javax.validation.constraints.NotNull;
import java.util.logging.Level;

import static com.jwebmp.utilities.StaticStrings.*;

/**
 * Handles all events. Over-ride methods.
 *
 * @author Marc Magon
 */
@ComponentInformation(name = "Activate Event",
		description = "Server Side Event for Active Adapter.",
		url = "https://www.armineasy.com/JWebSwing",
		wikiUrl = "https://github.com/GedMarc/JWebSwing/wiki")
public abstract class BSCollapseShowAdapter
		extends Event
		implements GlobalEvents
{

	/**
	 * Logger for the Component
	 */
	private static final java.util.logging.Logger LOG = LogFactory.getInstance()
	                                                              .getLogger("ActivateEvent");
	private static final long serialVersionUID = 1L;
	/**
	 * The directive for this adapter
	 */
	private ActivateDirective directive;

	/**
	 * Performs a click
	 *
	 * @param component
	 * 		The component this click is going to be acting on
	 */
	public BSCollapseShowAdapter(Component component)
	{
		super(EventTypes.undefined, component);
		setComponent(component);
	}

	@Override
	public void fireEvent(AjaxCall call, AjaxResponse response)
	{
		try
		{
			onShow(call, response);
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

			getComponent().addAttribute("bs-collapse-show", STRING_ANGULAR_EVENT_START + renderVariables() + STRING_CLOSING_BRACKET_SEMICOLON);
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
	public abstract void onShow(AjaxCall call, AjaxResponse response);

	/**
	 * Returns the angular directive associated with the right click event
	 *
	 * @return
	 */
	@NotNull
	public ActivateDirective getDirective()
	{
		if (directive == null)
		{
			directive = new ActivateDirective();
		}
		return directive;
	}

	/**
	 * Sets the right click angular event
	 *
	 * @param directive
	 */
	public void setDirective(ActivateDirective directive)
	{
		this.directive = directive;
	}
}
