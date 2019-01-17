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

package com.jwebmp.plugins.bootstrap4.alerts.styles;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.html.Span;
import com.jwebmp.plugins.bootstrap4.alerts.BSAlert;
import org.junit.jupiter.api.Test;

class BSAlertPrimaryTest
{

	@Test
	public void testMe()
	{
		BSAlert alert = new BSAlertPrimary<>().setText("This is an alert");
		System.out.println(alert.toString(0));

		alert.asMe()
		     .createDismissButton();

		System.out.println(alert.toString(0));

		Link wrapped = alert.wrapLinkStyle(new Span<>("Does it wrappeth?"), null);
		alert.add(wrapped);
		System.out.println(alert.toString(0));
	}
}
