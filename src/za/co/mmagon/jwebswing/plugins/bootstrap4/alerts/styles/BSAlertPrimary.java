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
package za.co.mmagon.jwebswing.plugins.bootstrap4.alerts.styles;

import za.co.mmagon.jwebswing.plugins.bootstrap4.alerts.BSAlert;
import za.co.mmagon.jwebswing.plugins.bootstrap4.alerts.BSAlertOptions;

/**
 * Alerts
 * <p>
 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public class BSAlertPrimary<J extends BSAlertPrimary<J>>
		extends BSAlert<J>
{

	private static final long serialVersionUID = 1L;

	/**
	 * Alerts
	 * <p>
	 * Provide contextual feedback messages for typical user actions with the handful of available and flexible alert messages.
	 */
	public BSAlertPrimary()
	{
		addClass(BSAlertOptions.Alert_Primary);
	}
}