package za.co.mmagon.jwebswing.plugins.bootstrap4.badge;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;

import javax.validation.constraints.NotNull;
import java.util.Comparator;

public interface IBSBadge<J extends BSBadge<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Sets this badge to render as an actionable link
	 *
	 * @param asLink
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setAsLink(boolean asLink);

	/**
	 * Configures badge as a link with hover and active styles
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setLink(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDanger(boolean applyStyle);

	/**
	 * Default colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDefault(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setInfo(boolean applyStyle);

	/**
	 * Primary colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setPrimary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setSuccess(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setWarning(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setSecondary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setDark(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J setLight(boolean applyStyle);
}
