package com.jwebmp.plugins.bootstrap.badge;

import com.jwebmp.core.base.interfaces.ICssStructure;

import jakarta.validation.constraints.NotNull;
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
	@NotNull
	J setAsLink(boolean asLink);

	/**
	 * Configures badge as a link with hover and active styles
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	J setLink(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	@NotNull
	J setDanger(boolean applyStyle);

	/**
	 * Default colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setDefault(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setInfo(boolean applyStyle);

	/**
	 * Primary colour theme
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setPrimary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setSuccess(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setWarning(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setSecondary(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setDark(boolean applyStyle);

	/**
	 * Set or remove the style
	 *
	 * @param applyStyle
	 *
	 * @return
	 */
	
	@NotNull
	J setLight(boolean applyStyle);
}
