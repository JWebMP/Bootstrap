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
package com.jwebmp.plugins.bootstrap.media;

import com.jwebmp.core.base.html.Div;
import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.attributes.HeaderTypes;
import com.jwebmp.core.base.html.interfaces.GlobalFeatures;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.plugins.ComponentInformation;
import com.jwebmp.plugins.bootstrap.media.parts.BSMediaBody;
import com.jwebmp.plugins.bootstrap.media.parts.BSMediaHeaderText;
import com.jwebmp.plugins.bootstrap.media.parts.BSMediaImage;
import com.jwebmp.plugins.bootstrap.media.parts.BSMediaLink;
import com.jwebmp.plugins.bootstrap.options.BSSpacingOptions;

import static com.guicedee.guicedinjection.json.StaticStrings.*;

/**
 * Media object
 * <p>
 * The media object is an abstract element used as the basis for building more complex and repetitive components (like blog comments,
 * Tweets, etc).
 * <p>
 * Included is support for left and right aligned content, content alignment options, nesting, and more.
 *
 * @param <J>
 *
 * @author GedMarc
 * @version 1.0
 * @since 29 Aug 2015
 */
@ComponentInformation(name = "Bootstrap Media",
		description = "The media object helps build complex and repetitive components where some media is positioned alongside content " +
		              "that doesn’t wrap around said media. Plus, it does this with only two required classes thanks to flexbox.",
		url = "https://v4-alpha.getbootstrap.com/layout/media-object/",
		wikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki")
public class BSMedia<J extends BSMedia<J>>
		extends Div<BSMediaChildren, BSMediaAttributes, GlobalFeatures, BSMediaEvents, J>
		implements IBSMedia
{
	/**
	 * The media image
	 */
	private BSMediaImage<?> mediaImage;
	/**
	 * The link for the media object
	 */
	private BSMediaLink<?> mediaLink;
	/**
	 * The body for the media object
	 */
	private BSMediaBody<?> mediaBody;
	/**
	 * The header for the media object
	 */
	private BSMediaHeaderText<?> mediaHeader;
	/**
	 * The media object being displayed (usually image or something)
	 */
	private IComponentHierarchyBase<?,?> mediaComponent;

	/**
	 * The media object is an abstract element used as the basis for building more complex and repetitive components (like blog comments,
	 * Tweets, etc).
	 * <p>
	 * Included is support for left and right aligned content, content alignment options, nesting, and more.
	 */
	public BSMedia()
	{
		addClass(BSComponentMediaOptions.Media);

	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	/**
	 * Gets the media image
	 *
	 * @return
	 */
	public BSMediaImage<?> getMediaImage()
	{
		return mediaImage;
	}

	/**
	 * Sets the media image
	 *
	 * @param mediaImage
	 */
	@SuppressWarnings("unchecked")
	public J setMediaImage(BSMediaImage<?> mediaImage)
	{
		this.mediaImage = mediaImage;
		if (mediaImage != null)
		{
			mediaImage.addClass(BSSpacingOptions.Margin_Right_3);
			add(mediaImage);
		}
		return (J) this;
	}

	/**
	 * Returns the body portion of this media object
	 *
	 * @return
	 */
	@Override
	public BSMediaBody<?> getMediaBody()
	{
		if (mediaBody == null)
		{
			setMediaBody(new BSMediaBody<>());
		}
		return mediaBody;
	}

	/**
	 * Sets the media body and adds it to this object
	 *
	 * @param mediaBody
	 *
	 * @return
	 */
	@Override
	public BSMedia<?> setMediaBody(BSMediaBody<?> mediaBody)
	{
		if (this.mediaBody != null)
		{
			remove(this.mediaBody);
			this.mediaBody = null;
		}
		this.mediaBody = mediaBody;
		add(mediaBody);
		return this;
	}

	/**
	 * Returns the component displayed inside the link that is used for display
	 *
	 * @return
	 */
	@Override
	public IComponentHierarchyBase<?,?> getMediaComponent()
	{
		if (mediaComponent == null)
		{
			setMediaComponent(new DivSimple<>());
		}
		return mediaComponent;
	}

	/**
	 * Returns a new H4 header
	 *
	 * @return
	 */
	@Override
	public BSMediaHeaderText<?> getMediaHeader()
	{
		if (mediaHeader == null)
		{
			setMediaHeader(new BSMediaHeaderText<>().setText("")
			                                        .setHeaderType(HeaderTypes.H4));
		}
		return mediaHeader;
	}

	/**
	 * Returns the associated media link, never null
	 *
	 * @return
	 */
	@Override
	public BSMediaLink<?> getMediaLink()
	{
		if (mediaLink == null)
		{
			setMediaLink(new BSMediaLink<>(STRING_HASH), true);
		}
		return mediaLink;
	}

	/**
	 * Sets the media link
	 *
	 * @param mediaLink
	 */
	@SuppressWarnings("unchecked")
	public J setMediaLink(BSMediaLink<?> mediaLink)
	{
		this.mediaLink = mediaLink;
		return (J) this;
	}

	/**
	 * Sets the header to the required object
	 *
	 * @param mediaHeader
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setMediaHeader(BSMediaHeaderText<?> mediaHeader)
	{
		if (this.mediaHeader != null)
		{
			getMediaBody().remove(this.mediaHeader);
			this.mediaHeader = null;
		}
		this.mediaHeader = mediaHeader;
		if (this.mediaHeader != null)
		{
			getMediaBody().add(this.mediaHeader);
		}
		return (J) this;
	}

	/**
	 * Sets the media link, and moves the media object into the new link if necessary
	 *
	 * @param mediaLink
	 * @param left
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setMediaLink(BSMediaLink<?> mediaLink, boolean left)
	{
		if (this.mediaLink != null)
		{
			mediaLink.add(getMediaComponent());
			remove(this.mediaLink);
			this.mediaLink = null;
		}
		this.mediaLink = mediaLink;
		if (this.mediaLink != null)
		{
			add(this.mediaLink);
		}
		return (J) this;
	}

	/**
	 * Sets the component displayed to the left or right (set that in the link)
	 *
	 * @param mediaComponent
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setMediaComponent(IComponentHierarchyBase<?,?> mediaComponent)
	{
		if (this.mediaComponent != null)
		{
			getMediaLink().remove(this.mediaComponent);
			this.mediaComponent = null;
		}
		this.mediaComponent = mediaComponent;
		if (this.mediaComponent != null)
		{
			this.mediaComponent.addClass(BSComponentMediaOptions.Media_Object);
			getMediaLink().add(this.mediaComponent);
		}
		return (J) this;
	}

}
