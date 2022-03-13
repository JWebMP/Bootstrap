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

package com.jwebmp.plugins.bootstrap.cards.parts.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions;
import com.jwebmp.plugins.bootstrap.cards.parts.BSCardButton;
import com.jwebmp.plugins.bootstrap.options.interfaces.IBSLayout;

import java.util.Comparator;

public interface IBSCardButton<J extends BSCardButton<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>, IBSLayout<J>
{
	/**
	 * Sets the style with button options
	 *
	 * @param buttonOptions
	 *
	 * @return
	 */
	J setStyle(BSButtonOptions buttonOptions);
}
