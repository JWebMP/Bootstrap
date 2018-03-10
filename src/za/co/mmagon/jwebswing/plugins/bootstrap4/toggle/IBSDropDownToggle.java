package za.co.mmagon.jwebswing.plugins.bootstrap4.toggle;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Button;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.interfaces.children.ListChildren;

import javax.validation.constraints.NotNull;

public interface IBSDropDownToggle<J extends BSDropDownToggle<J>>
{
	/**
	 * Sets the title
	 *
	 * @param title
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setTitle(Button title);

	/**
	 * Returns the title component
	 *
	 * @return
	 */
	@NotNull
	ComponentHierarchyBase getTitle();

	/**
	 * Sets the title
	 *
	 * @param title
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setTitle(Link title);

	/**
	 * Returns the contents
	 *
	 * @return
	 */
	@NotNull
	List<ListChildren, ?, ?, ?> getContents();

	/**
	 * Sets the contents
	 *
	 * @param contents
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setContents(List contents);
}
