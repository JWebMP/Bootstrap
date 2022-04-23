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
package com.jwebmp.plugins.bootstrap.popovers;

import com.jwebmp.core.base.html.*;
import com.jwebmp.core.base.html.interfaces.*;
import com.jwebmp.core.plugins.*;
import com.jwebmp.plugins.bootstrap.*;
import com.jwebmp.plugins.bootstrap.popovers.interfaces.*;

import java.util.List;
import java.util.*;

/**
 * Popovers
 * <p>
 * Add small overlay content, like those found in iOS, to any element for housing secondary information.
 * <p>
 * Overview
 * <p>
 * Things to know when using the popover plugin:
 * <p>
 * Popovers rely on the 3rd party library Tether for positioning. You must include tether.min.js before bootstrap.js in order for popovers
 * to work! Popovers require the tooltip plugin as a dependency.
 * Popovers are opt-in for performance reasons, so you must initialize them yourself. Zero-length title and content values will never show a
 * popover. Specify container: 'body' to avoid rendering
 * problems in more complex components (like our input groups, button groups, etc). Triggering popovers on hidden elements will not work.
 * Popovers for .disabled or disabled elements must be triggered
 * on a wrapper element. When triggered from hyperlinks that span multiple lines, popovers will be centered. Use white-space: nowrap; on
 * your as to avoid this behavior.
 * <p>
 * <p>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Popovers",
                      description = "Add small overlay content, like those found in iOS, to any element for housing secondary information.",
                      url = "https://v4-alpha.getbootstrap.com/components/popovers/",
                      wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSPopOver<J extends BSPopOver<J>>
		extends Div<GlobalChildren, BSPopOverAttributes, BSPopOverFeatures, BSPopOverEvents, J>
		implements IBSPopOver
{
	private BSPopOverTitle<?> popOverTitle;
	private BSPopOverContent<?> popOverContent;
	
	
	private boolean animation;
	private BSTriggers autoClose;
	private Integer closeDelay;
	private Boolean containInBody;
	private boolean disablePopover;
	private Integer openDelay;
	private BSPlacements placement;
	private String popoverClass;
	private List<BSTriggers> triggers = new ArrayList<>();
	
	/**
	 * Popovers
	 * <p>
	 * Add small overlay content, like those found in iOS, to any element for housing secondary information.
	 * <p>
	 * Overview
	 * <p>
	 * Things to know when using the popover plugin:
	 * <p>
	 * Popovers rely on the 3rd party library Tether for positioning.
	 * <p>
	 * You must include tether.min.js before bootstrap.js in order for popovers to work!
	 * <p>
	 * Popovers require the tooltip plugin as a
	 * <p>
	 * dependency. Popovers are opt-in for performance reasons, so you must initialize them yourself.
	 * <p>
	 * Zero-length title and content values will never show a popover. Specify container: 'body' to avoid
	 * <p>
	 * rendering problems in more complex components (like our input groups, button groups, etc).
	 * <p>
	 * Triggering popovers on hidden elements will not work. Popovers for .disabled or disabled elements must be triggered on a wrapper
	 * element. When triggered from hyperlinks that span multiple
	 * lines, popovers will be centered.
	 * <p>
	 * Use white-space: nowrap; on your as to avoid this behavior.
	 * <p>
	 * <p>
	 */
	public BSPopOver()
	{
	
	}
	
	@Override
	public BSPopOverTitle<?> getPopOverTitle()
	{
		return popOverTitle;
	}
	
	@Override
	public BSPopOver<J> setPopOverTitle(BSPopOverTitle<?> popOverTitle)
	{
		this.popOverTitle = popOverTitle;
		return this;
	}
	
	@Override
	public BSPopOverContent<?> getPopOverContent()
	{
		return popOverContent;
	}
	
	@Override
	public BSPopOver<J> setPopOverContent(BSPopOverContent<?> popOverContent)
	{
		this.popOverContent = popOverContent;
		return this;
	}
	
	@Override
	protected StringBuilder renderBeforeTag()
	{
		StringBuilder sb = new StringBuilder();
		if (popOverTitle != null)
		{
			sb.append(getCurrentTabIndentString())
			  .append(popOverTitle.toString(0))
			  .append(getNewLine());
		}
		if (popOverContent != null)
		{
			sb.append(getCurrentTabIndentString())
			  .append(popOverContent.toString(0))
			  .append(getNewLine());
		}
		return sb;
	}
	
	@Override
	public void init()
	{
		if (popOverTitle != null)
		{
			addAttribute("[popoverTitle]", popOverTitle.getID());
		}
		if (popOverContent != null)
		{
			addAttribute("[ngbPopover]", popOverContent.getID());
		}
		
		addOption("animation", animation);
		if (autoClose != null)
		{
			addOption("autoClose", autoClose.toString());
		}
		if (closeDelay != null)
		{
			addOption("closeDelay", closeDelay);
		}
		if (containInBody != null)
		{
			if (containInBody)
			{
				addOption("container", "body");
			}
		}
		if (disablePopover)
		{
			addOption("disablePopover", disablePopover);
		}
		if (openDelay != null)
		{
			addOption("openDelay", openDelay);
		}
		if (placement != null)
		{
			addOption("placement", placement.toString());
		}
		if (popoverClass != null)
		{
			addOption("popoverClass", popoverClass);
		}
		if (triggers != null && !triggers.isEmpty())
		{
			StringBuilder sb = new StringBuilder();
			for (BSTriggers trigger : triggers)
			{
				sb.append(trigger.toString())
				  .append(" ");
			}
		}
		super.init();
	}
	
	
	public boolean isAnimation()
	{
		return animation;
	}
	
	public BSPopOver<J> setAnimation(boolean animation)
	{
		this.animation = animation;
		return this;
	}
	
	public BSTriggers getAutoClose()
	{
		return autoClose;
	}
	
	public BSPopOver<J> setAutoClose(BSTriggers autoClose)
	{
		this.autoClose = autoClose;
		return this;
	}
	
	public Integer getCloseDelay()
	{
		return closeDelay;
	}
	
	public BSPopOver<J> setCloseDelay(Integer closeDelay)
	{
		this.closeDelay = closeDelay;
		return this;
	}
	
	public boolean isContainInBody()
	{
		return containInBody;
	}
	
	public BSPopOver<J> setContainInBody(boolean containInBody)
	{
		this.containInBody = containInBody;
		return this;
	}
	
	public boolean isDisablePopover()
	{
		return disablePopover;
	}
	
	public BSPopOver<J> setDisablePopover(boolean disablePopover)
	{
		this.disablePopover = disablePopover;
		return this;
	}
	
	public Integer getOpenDelay()
	{
		return openDelay;
	}
	
	public BSPopOver<J> setOpenDelay(Integer openDelay)
	{
		this.openDelay = openDelay;
		return this;
	}
	
	public BSPlacements getPlacement()
	{
		return placement;
	}
	
	public BSPopOver<J> setPlacement(BSPlacements placement)
	{
		this.placement = placement;
		return this;
	}
	
	public String getPopoverClass()
	{
		return popoverClass;
	}
	
	public BSPopOver<J> setPopoverClass(String popoverClass)
	{
		this.popoverClass = popoverClass;
		return this;
	}
	
	public List<BSTriggers> getTriggers()
	{
		return triggers;
	}
	
	public BSPopOver<J> setTriggers(List<BSTriggers> triggers)
	{
		this.triggers = triggers;
		return this;
	}
	
	/**
	 * Neater representation
	 *
	 * @return
	 */
	public IBSPopOver asMe()
	{
		return this;
	}
}
