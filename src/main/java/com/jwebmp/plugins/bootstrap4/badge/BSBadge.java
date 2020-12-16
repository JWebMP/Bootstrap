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
package com.jwebmp.plugins.bootstrap4.badge;

import com.jwebmp.core.base.html.Span;
import com.jwebmp.core.base.html.attributes.ALinkAttributes;
import com.jwebmp.core.base.html.interfaces.GlobalChildren;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.core.plugins.ComponentInformation;
import com.guicedee.guicedinjection.json.StaticStrings;

import jakarta.validation.constraints.NotNull;

/**
 * With badges
 * <p>
 * Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note the
 * justify-content-between utility class and the badge’s placement.
 * <p>
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 17 Jan 2017
 */
@ComponentInformation(name = "Bootstrap Badge",
		description = "Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note " +
		              "the justify-content-between utility class and the badge’s placement.",
		url = "https://v4-alpha.getbootstrap.com/components/badge/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")

public class BSBadge<J extends BSBadge<J>>
		extends Span<GlobalChildren, BSBadgeAttributes, J>
		implements IBSBadge<J>
{


	/**
	 * With badges
	 * <p>
	 * Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note the
	 * justify-content-between utility class and the badge’s placement.
	 *
	 * @param asPill
	 * @param badgeOptions
	 * 		start with "badge"
	 */
	public BSBadge(boolean asPill, BSBadgeOptions... badgeOptions)
	{
		addClass(BSBadgeOptions.Badge);
		if (asPill)
		{
			addClass(BSBadgeOptions.Badge_Pill);
		}
		for (BSBadgeOptions badgeOption : badgeOptions)
		{
			addClass(badgeOption);
		}

	}

	/**
	 * With badges
	 * <p>
	 * Add badges to any list group item to show unread counts, activity, and more with the help of some utilities. Note the
	 * justify-content-between utility class and the badge’s placement.
	 *
	 * @param text
	 * @param asPill
	 * @param badgeOptions
	 * 		start with "badge"
	 */
	public BSBadge(String text, boolean asPill, BSBadgeOptions... badgeOptions)
	{
		super(text);
		addClass(BSBadgeOptions.Badge);
		if (asPill)
		{
			addClass(BSBadgeOptions.Badge_Pill);
		}
		for (BSBadgeOptions badgeOption : badgeOptions)
		{
			addClass(badgeOption);
		}

	}

	/**
	 * Sets this badge to render as an actionable link
	 *
	 * @param asLink
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setAsLink(boolean asLink)
	{
		if (asLink)
		{
			setTag("a");
			addAttribute("href", "#");
		}
		else
		{
			setTag("span");
			removeAttribute("href");
		}
		return (J) this;
	}

	/**
	 * Configures badge as a link with hover and active styles
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLink(boolean applyStyle)
	{
		if (applyStyle)
		{
			setTag(ComponentTypes.Link.getComponentTag());
			addAttribute(ALinkAttributes.HRef.toString(), StaticStrings.STRING_HASH);
		}
		else
		{
			setTag(ComponentTypes.Span.getComponentTag());
			removeAttribute(ALinkAttributes.HRef.toString());
		}
		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDanger(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Danger);
		}
		else

		{
			removeClass(BSBadgeOptions.Badge_Danger);
		}

		return (J) this;
	}

	/**
	 * Default colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDefault(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Default);
		}
		else

		{
			removeClass(BSBadgeOptions.Badge_Default);
		}

		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setInfo(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Info);
		}
		else
		{
			removeClass(BSBadgeOptions.Badge_Info);
		}

		return (J) this;
	}

	/**
	 * Primary colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setPrimary(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Primary);
		}
		else

		{
			removeClass(BSBadgeOptions.Badge_Primary);
		}

		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSuccess(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Success);
		}
		else
		{
			removeClass(BSBadgeOptions.Badge_Success);
		}
		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setWarning(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Warning);
		}
		else
		{
			removeClass(BSBadgeOptions.Badge_Warning);
		}
		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setSecondary(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Secondary);
		}
		else
		{
			removeClass(BSBadgeOptions.Badge_Secondary);
		}
		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDark(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Dark);
		}
		else
		{
			removeClass(BSBadgeOptions.Badge_Dark);
		}
		return (J) this;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J setLight(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSBadgeOptions.Badge_Light);
		}
		else
		{
			removeClass(BSBadgeOptions.Badge_Light);
		}
		return (J) this;
	}

	/**
	 * Neater output
	 *
	 * @return
	 */
	@NotNull
	public IBSBadge<?> asMe()
	{
		return this;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equals(obj);
	}

}
