package com.jwebmp.plugins.bootstrap.breadcrumbs;

import com.jwebmp.core.base.interfaces.ICssStructure;

import jakarta.validation.constraints.NotNull;
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
	@NotNull
	J addBreadCrumb(BSBreadCrumbItem<?> item);
}
