package com.jwebmp.plugins.bootstrap.breadcrumbs;

import com.jwebmp.core.base.ComponentHierarchyBase;
import com.jwebmp.core.base.html.Link;

/**
 * @param <J>
 *
 * @author GedMarc
 * @since 16 Feb 2017
 */
public class BSBreadCrumbLink<J extends BSBreadCrumbLink<J>>
		extends Link<J>
{
	/**
	 * A new default crumb link
	 */
	public BSBreadCrumbLink()
	{
		//No configu required
	}

	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 */
	public BSBreadCrumbLink(String directToAddress)
	{
		super(directToAddress);

	}

	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 */
	public BSBreadCrumbLink(String directToAddress, String targetFrameName)
	{
		super(directToAddress, targetFrameName);

	}

	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 * @param text
	 */
	public BSBreadCrumbLink(String directToAddress, String targetFrameName, String text)
	{
		super(directToAddress, targetFrameName, text);

	}

	/**
	 * A new default crumb link
	 *
	 * @param directToAddress
	 * @param targetFrameName
	 * @param component
	 */
	public BSBreadCrumbLink(String directToAddress, String targetFrameName, ComponentHierarchyBase component)
	{
		super(directToAddress, targetFrameName, component);

	}

}
