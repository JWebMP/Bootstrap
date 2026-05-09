package com.jwebmp.plugins.bootstrap.breadcrumbs;

import com.jwebmp.core.base.html.Link;
import com.jwebmp.core.base.interfaces.ICssStructure;

import jakarta.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSBreadCrumbItem<J extends BSBreadCrumbItem<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Adds a link to the Breadcrumb Link
	 *
	 * @param link
	 *
	 * @return
	 */
	
	@NotNull
	J addLink(BSBreadCrumbLink<?> link);

	/**
	 * Returns the crumb link, never null
	 *
	 * @return
	 */
	Link<?> getCrumbLink();

	/**
	 * Sets the given crumb link
	 *
	 * @param crumbLink
	 */
	
	@NotNull
	J setCrumbLink(Link<?> crumbLink);

	/**
	 * Sets this crumb to display as active
	 *
	 * @param active
	 *
	 * @return
	 */
	
	@NotNull
	J setActive(boolean active);
}
