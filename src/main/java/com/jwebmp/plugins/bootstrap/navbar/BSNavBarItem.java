package com.jwebmp.plugins.bootstrap.navbar;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.navbar.interfaces.*;
import com.jwebmp.plugins.bootstrap.navs.interfaces.*;
import jakarta.validation.constraints.*;

/**
 * @author GedMarc
 * @since 23 Jan 2017
 */
public class BSNavBarItem<J extends BSNavBarItem<J>>
		extends ListItem<J>
		implements BSNavsChildren, BSNavBarChildren
{
	private BSNavBarLink<?> linkItem;
	private String collapsedMenuFieldName;
	
	/**
	 * Constructs a list item with a link item inside
	 */
	public BSNavBarItem(BSNavBarLink<?> linkItem,String collapsedMenuFieldName)
	{
		this(linkItem, collapsedMenuFieldName, false);
	}
	/**
	 * Constructs a list item with a link item inside
	 */
	public BSNavBarItem(BSNavBarLink<?> linkItem,String collapsedMenuFieldName,boolean active)
	{
		this.collapsedMenuFieldName = collapsedMenuFieldName;
		setLinkItem(linkItem);
		addClass("nav-item");
		if(active)
		{
			addClass("active");
		}
	}

	/**
	 * Sets the link item
	 * @param linkItem
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLinkItem(BSNavBarLink<?> linkItem)
	{
		this.linkItem = linkItem;
		getChildren().clear();
		add(linkItem);
		linkItem.addAttribute("(click)", collapsedMenuFieldName + " = true");
		return (J) this;
	}
	
	/**
	 * Returns the associated Link Item
	 *
	 * @return
	 */
	@NotNull
	public BSNavBarLink<?> getLinkItem()
	{
		return linkItem;
	}
}
