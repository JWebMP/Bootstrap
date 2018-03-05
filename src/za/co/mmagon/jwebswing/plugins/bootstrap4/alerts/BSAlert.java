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
package za.co.mmagon.jwebswing.plugins.bootstrap4.alerts;

import com.google.common.base.Strings;
import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.alerts.events.BSAlertEvents;

import javax.validation.constraints.NotNull;

/**
 * Alerts
 * <p>
 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
@ComponentInformation(name = "Bootstrap Alert",
		description = "Provide contextual feedback messages for typical user actions with the handful of available and flexible alert " +
				              "messages.",
		url = "https://v4-alpha.getbootstrap.com/components/alerts/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSAlert<J extends BSAlert<J>>
		extends Div<GlobalChildren, BSAlertAttributes, GlobalFeatures, BSAlertEvents, J>
		implements IBSAlerts<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlert()
	{
		addAttribute(BSAlertAttributes.Role, BSAlertOptions.Alert.toString());
		addClass(BSAlertOptions.Alert);

	}

	/**
	 * Neater view of this component
	 *
	 * @return
	 */
	public IBSAlerts asMe()
	{
		return this;
	}

	/**
	 * Adds the link styling for an alert to any component
	 *
	 * @param <T>
	 * @param component
	 *
	 * @return
	 */
	@Override
	@NotNull
	public Link<?> wrapLinkStyle(ComponentHierarchyBase<?, ?, ?, ?, ?> component, String href)
	{
		BSAlertLink<?> newLink = new BSAlertLink<>();
		newLink.add(component);
		if (!Strings.isNullOrEmpty(href))
		{
			newLink.setDirectToAddress(href);
		}
		return newLink;
	}

	/**
	 * Creates and adds dismiss button assigned to this alert
	 *
	 * @return
	 */
	@Override
	@NotNull
	public BSAlertDismissButton createDismissButton()
	{
		BSAlertDismissButton news = new BSAlertDismissButton(this, true);
		add(news);
		return news;
	}

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDanger(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Danger);
		}
		else

		{
			removeClass(BSAlertOptions.Alert_Danger);
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
	@NotNull
	@SuppressWarnings("unchecked")
	public J setInfo(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Info);
		}
		else
		{
			removeClass(BSAlertOptions.Alert_Info);
		}

		return (J) this;
	}

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setLink(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Link);
		}
		else
		{
			removeClass(BSAlertOptions.Alert_Link);
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
	@NotNull
	@SuppressWarnings("unchecked")
	public J setSuccess(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Success);
		}
		else
		{
			removeClass(BSAlertOptions.Alert_Success);
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
	@NotNull
	@SuppressWarnings("unchecked")
	public J setWarning(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Warning);
		}
		else
		{
			removeClass(BSAlertOptions.Alert_Warning);
		}
		return (J) this;
	}

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setPrimary(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Primary);
		}
		else
		{
			removeClass(BSAlertOptions.Alert_Primary);
		}

		return (J) this;
	}

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setLight(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Light);
		}
		else
		{
			removeClass(BSAlertOptions.Alert_Light);
		}

		return (J) this;
	}

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@Override
	@NotNull
	@SuppressWarnings("unchecked")
	public J setDark(boolean applyStyle)
	{
		if (applyStyle)
		{
			addClass(BSAlertOptions.Alert_Dark);
		}
		else
		{
			removeClass(BSAlertOptions.Alert_Dark);
		}

		return (J) this;
	}

}
