package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.interfaces;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSFormInputGroup;

import javax.validation.constraints.NotNull;

public interface IBSFormInputGroup<J extends BSFormInputGroup<J, I>, I extends Input<?, ?>>
		extends ICssStructure<J>, IBSFormGroup<J, I>
{
	/**
	 * The text (or component.toString(0)) to prepend
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J prepend(String text);

	/**
	 * The text (or component.toString(0)) to prepend
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J prepend(ComponentHierarchyBase component);

	/**
	 * The text (or component.toString(0)) to append
	 *
	 * @param text
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J append(String text);

	/**
	 * The text (or component.toString(0)) to append
	 *
	 * @param component
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	J append(ComponentHierarchyBase component);

	/**
	 * returns the prepending div as it currently is. Only add spans directly with classes??
	 *
	 * @return
	 */
	Div<?, ?, ?, ?, ?> getPrependDiv();

	/**
	 * returns the appending div as it currently is. Only add spans directly with classes??
	 *
	 * @return
	 */
	Div<?, ?, ?, ?, ?> getAppendDiv();
}
