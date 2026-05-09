package com.jwebmp.plugins.bootstrap.media;

import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap.media.parts.BSMediaBody;
import com.jwebmp.plugins.bootstrap.media.parts.BSMediaHeaderText;
import com.jwebmp.plugins.bootstrap.media.parts.BSMediaLink;

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
