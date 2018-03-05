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
package za.co.mmagon.jwebswing.plugins.bootstrap4.close;

import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Span;
import za.co.mmagon.jwebswing.base.html.attributes.ButtonAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.base.servlets.enumarations.ComponentTypes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.options.BSCloseIconOptions;

import javax.validation.constraints.NotNull;

/**
 * Close icon
 * <p>
 * Use a generic close icon for dismissing content like modals and alerts. Be sure to include text for screen readers, as we’ve done with
 * aria-label.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
@ComponentInformation(name = "Bootstrap Dismiss Buttons",
		description = "Use a generic close icon for dismissing content like modals and alerts. Be sure to include text for screen " +
				              "readers, as we’ve done with  aria-label.",
		url = "https://v4-alpha.getbootstrap.com/utilities/close-icon/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSCloseIcon<J extends BSCloseIcon<J>>
		extends Button<GlobalChildren, ButtonAttributes, GlobalFeatures, GlobalEvents, J>
{

	private static final long serialVersionUID = 1L;
	/**
	 * The actual close icon
	 */
	private Span closeIcon;
	/**
	 * The actual text for the close icon
	 */
	private String closeIconText = "&times;";

	/**
	 * Constructs a new instance of the close icon
	 * <p>
	 */
	public BSCloseIcon()
	{
		setAriaLabel("Close");
		addClass(BSCloseIconOptions.Close);
		addAttribute(GlobalAttributes.Type, ComponentTypes.Button.getComponentTag());
		getCloseIcon();

	}

	/**
	 * Sets the label to be shown on screen readers
	 *
	 * @param label
	 *
	 * @return
	 */
	public BSCloseIcon setAriaLabel(String label)
	{
		addAttribute(GlobalAttributes.Aria_Label, label);
		return this;
	}

	/**
	 * The physical close icon span display
	 *
	 * @return
	 */
	public Span getCloseIcon()
	{
		if (closeIcon == null)
		{
			setCloseIcon(new Span(closeIconText));
		}
		return closeIcon;
	}

	/**
	 * The physical close icon span
	 *
	 * @param closeIcon
	 *
	 * @return
	 */
	public BSCloseIcon setCloseIcon(Span closeIcon)
	{
		if (this.closeIcon != null)
		{
			remove(this.closeIcon);
			this.closeIcon = null;
		}
		this.closeIcon = closeIcon;
		if (this.closeIcon != null)
		{
			add(this.closeIcon);
			this.closeIcon.addAttribute(GlobalAttributes.Aria_Hidden, Boolean.toString(true));
		}
		return this;
	}

	/**
	 * Sets the close icon as a data dismissable
	 *
	 * @param dismiss
	 *
	 * @return
	 */
	public BSCloseIcon setDataDismiss(String dismiss)
	{
		addAttribute(ButtonAttributes.Data_Dismiss.toString(), dismiss);
		return this;
	}


	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * Return the text used for the close icon
	 *
	 * @return
	 */
	public String getCloseIconText()
	{
		return closeIconText;
	}

	/**
	 * Sets the close icon text for the span
	 *
	 * @param closeIconText
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCloseIconText(String closeIconText)
	{
		this.closeIconText = closeIconText;
		if (this.closeIconText != null)
		{
			getCloseIcon().setText(closeIconText);
		}
		return (J) this;
	}

}