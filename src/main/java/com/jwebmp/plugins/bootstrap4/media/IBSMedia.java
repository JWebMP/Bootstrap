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
package com.jwebmp.plugins.bootstrap4.media;

import com.jwebmp.core.Component;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.media.parts.BSMediaBody;
import com.jwebmp.plugins.bootstrap4.media.parts.BSMediaHeaderText;
import com.jwebmp.plugins.bootstrap4.media.parts.BSMediaLink;

/**
 * @author GedMarc
 * @since 21 Feb 2017
 */
public interface IBSMedia
{

	/**
	 * Returns the body portion of this media object
	 *
	 * @return
	 */
	BSMediaBody<?> getMediaBody();

	/**
	 * Returns the component displayed inside the link that is used for display
	 *
	 * @return
	 */
	IComponentHierarchyBase<?,?> getMediaComponent();

	/**
	 * Returns a new H4 header
	 *
	 * @return
	 */
	BSMediaHeaderText<?> getMediaHeader();

	/**
	 * Returns the associated media link, never null
	 *
	 * @return
	 */
	BSMediaLink<?> getMediaLink();

	/**
	 * Sets the media body and adds it to this object
	 *
	 * @param mediaBody
	 *
	 * @return
	 */
	BSMedia<?> setMediaBody(BSMediaBody<?> mediaBody);

	/**
	 * Sets the component displayed to the left or right (set that in the link)
	 *
	 * @param mediaComponent
	 *
	 * @return
	 */
	BSMedia<?> setMediaComponent(IComponentHierarchyBase<?,?> mediaComponent);

	/**
	 * Sets the header to the required object
	 *
	 * @param mediaHeader
	 *
	 * @return
	 */
	BSMedia<?> setMediaHeader(BSMediaHeaderText<?> mediaHeader);

	/**
	 * Sets the media link, and moves the media object into the new link if necessary
	 *
	 * @param mediaLink
	 * @param left
	 *
	 * @return
	 */
	BSMedia<?> setMediaLink(BSMediaLink<?> mediaLink, boolean left);

}
