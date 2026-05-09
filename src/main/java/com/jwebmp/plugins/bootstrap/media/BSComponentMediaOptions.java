package com.jwebmp.plugins.bootstrap.media;

import com.guicedee.modules.services.jsonrepresentation.json.StaticStrings;
import com.jwebmp.plugins.bootstrap.options.IBSComponentOptions;

import static com.guicedee.modules.services.jsonrepresentation.json.StaticStrings.*;

/**
 * The media object is an abstract element used as the basis for building more complex and repetitive components (like blog comments,
 * Tweets, etc).
 * <p>
 * Included is support for left and right aligned content, content alignment options, nesting, and more.
 *
 * @author GedMarc
 * @version 1.0
 * @since 31 Dec 2016
 */
public enum BSComponentMediaOptions
		implements IBSComponentOptions
{
	/**
	 * Denotes this as a bootstrap media object
	 */
	Media,
	/**
	 * Aligns in the media object to the left
	 */
	Media_Left,
	/**
	 * Aligns in the media object to the right
	 */
	Media_Right,
	/**
	 * Aligns in the media object to the heading
	 */
	Media_Heading,
	/**
	 * Aligns to the media object in the body
	 */
	Media_Body,
	/**
	 * Marks the object displayed as the media object
	 */
	Media_Object;

	BSComponentMediaOptions()
	{

	}

	@Override
	public String toString()
	{
		return name().toLowerCase()
		             .replace(StaticStrings.CHAR_UNDERSCORE, CHAR_DASH);
	}

}
