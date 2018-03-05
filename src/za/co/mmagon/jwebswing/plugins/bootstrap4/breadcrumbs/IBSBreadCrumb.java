package za.co.mmagon.jwebswing.plugins.bootstrap4.breadcrumbs;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSBreadCrumb<J extends BSBreadCrumb<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Adds a new breadcrumb item to the colletion
	 *
	 * @param item
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J addBreadCrumb(BSBreadCrumbItem item);
}
