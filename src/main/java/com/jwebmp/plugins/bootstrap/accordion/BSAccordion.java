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
package com.jwebmp.plugins.bootstrap.accordion;

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.attributes.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.options.interfaces.*;

import java.util.*;

/**
 * Extend the default collapse behavior to create an accordion.
 * <p>
 *
 * @param <J>
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Accordion",
                      description = "Extend the default collapse behavior to create an accordion.",
                      url = "https://v4-alpha.getbootstrap.com/components/collapse/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSAccordion<J extends BSAccordion<J>>
		extends Div<BSAccordionChildren, NoAttributes, GlobalFeatures, BSAccordionEvents, J>
		implements com.jwebmp.plugins.bootstrap.options.interfaces.IBSAccordion<J>
{
	/**
	 * If this accordion must only display one at a time
	 */
	private boolean closeOthers;
	
	/**
	 * Extend the default collapse behavior to create an accordion.
	 */
	public BSAccordion()
	{
		setTag("ngb-accordion");
	}
	
	public boolean isCloseOthers()
	{
		return closeOthers;
	}
	
	public BSAccordion<J> setCloseOthers(boolean closeOthers)
	{
		this.closeOthers = closeOthers;
		return this;
	}
	
	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (closeOthers)
			{
				addAttribute("[closeOthers]", "true");
			}
			java.util.List<String> ids = new ArrayList<>();
			for (BSAccordionChildren child : getChildren())
			{
				if (child instanceof BSAccordionPanel)
				{
					BSAccordionPanel<?> cc = (BSAccordionPanel<?>) child;
					if (cc.isActive())
					{
						ids.add(cc.getID());
					}
				}
			}
			if (!ids.isEmpty())
			{
				String attributeValue = "";
				for (String id : ids)
				{
					attributeValue += id + ",";
				}
				if (attributeValue.length() > 1)
				{
					attributeValue = attributeValue.substring(0, attributeValue.length() - 1);
				}
				addAttribute("activeIds", attributeValue);
			}
		}
		super.init();
	}
	
	@Override
	public J addPanel(String panelId, BSAccordionPanelTitle<?> defaultHeader, BSAccordionPanelContent<?> content, boolean active)
	{
		BSAccordionPanel<?> panel = new BSAccordionPanel<>(panelId);
		panel.add(defaultHeader);
		panel.add(content);
		panel.setActive(active);
		
		add(panel);
		return (J) this;
	}
	
	@Override
	public J addPanel(String panelId, BSAccordionPanelHeader<?> header, BSAccordionPanelContent<?> content, boolean active)
	{
		BSAccordionPanel<?> panel = new BSAccordionPanel<>(panelId);
		panel.add(header);
		panel.add(content);
		panel.setActive(active);
		
		add(panel);
		return (J) this;
	}
	
	@Override
	public IBSAccordion<?> asMe()
	{
		return this;
	}
}
