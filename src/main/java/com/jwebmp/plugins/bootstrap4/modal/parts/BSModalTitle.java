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

package com.jwebmp.plugins.bootstrap4.modal.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap4.modal.BSModalOptions;

/**
 * Modal
 * Use Bootstrap’s JavaScript modal plugin to add dialogs to your site for lightboxes, user notifications, or completely custom content.
 *
 * @param <J>
 */
public class BSModalTitle<J extends BSModalTitle<J>>
		extends DivSimple<J>
{
	/**
	 * Constructs a new BS Modal Header
	 */
	public BSModalTitle()
	{
		addClass(BSModalOptions.Modal_Title);
	}

}

