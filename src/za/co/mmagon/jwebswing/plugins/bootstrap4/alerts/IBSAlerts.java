package za.co.mmagon.jwebswing.plugins.bootstrap4.alerts;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSAlerts<J extends BSAlert<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Adds the link styling for an alert to any component
	 *
	 * @param component
	 *
	 * @return
	 */
	@NotNull
	Link<?> wrapLinkStyle(ComponentHierarchyBase<?, ?, ?, ?, ?> component, String href);

	/**
	 * Creates and adds dismiss button assigned to this alert
	 *
	 * @return
	 */
	@NotNull
	BSAlertDismissButton createDismissButton();

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setDanger(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setInfo(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setLink(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setSuccess(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setWarning(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setPrimary(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setLight(boolean applyStyle);

	/**
	 * Sets the style as link
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	@SuppressWarnings("unchecked")
	J setDark(boolean applyStyle);
}
