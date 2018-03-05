package za.co.mmagon.jwebswing.plugins.bootstrap4.breadcrumbs;

import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;

import javax.validation.constraints.NotNull;
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
	@SuppressWarnings("unchecked")
	@NotNull
	J addLink(BSBreadCrumbLink link);

	/**
	 * Returns the crumb link, never null
	 *
	 * @return
	 */
	Link getCrumbLink();

	/**
	 * Sets the given crumb link
	 *
	 * @param crumbLink
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setCrumbLink(Link crumbLink);

	/**
	 * Sets this crumb to display as active
	 *
	 * @param active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setActive(boolean active);
}
