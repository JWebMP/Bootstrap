package com.jwebmp.plugins.bootstrap4.media;

import com.jwebmp.base.html.DivSimple;
import com.jwebmp.base.servlets.enumarations.ComponentTypes;
import com.jwebmp.plugins.bootstrap4.options.BSDefaultOptions;

import static com.jwebmp.base.servlets.enumarations.ComponentTypes.*;

/**
 * Media list
 * Because the media object has so few structural requirements, you can also use these classes on list HTML elements.
 * On your ul or ol, add the .list-unstyled to remove any browser default list styles, and then apply .media to your lis.
 * <p>
 * As always, use spacing utilities wherever needed to fine tune.
 *
 * @param <J>
 */
public class BSMediaList<J extends BSMediaList<J>>
		extends DivSimple<J>
{
	/**
	 * Media list
	 * Because the media object has so few structural requirements, you can also use these classes on list HTML elements.
	 * On your ul or ol, add the .list-unstyled to remove any browser default list styles, and then apply .media to your lis.
	 * <p>
	 * As always, use spacing utilities wherever needed to fine tune.
	 */
	public BSMediaList()
	{
		setComponentType(UnorderedList);
		setTag(UnorderedList.getComponentTag());
		addClass(BSDefaultOptions.List_Unstyled);
	}

	/**
	 * Adds the given media in the correct manner to the object
	 *
	 * @param media
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J addMedia(BSMedia media)
	{
		if (media != null)
		{
			add(media);
			media.setTag(ComponentTypes.ListItem.getComponentTag());
		}
		return (J) this;
	}
}
