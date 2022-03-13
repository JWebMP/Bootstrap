package com.jwebmp.plugins.bootstrap.forms.interfaces;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.html.Input;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.forms.groups.sets.BSFormInputGroup;

import jakarta.validation.constraints.NotNull;

public interface IBSFormInputGroup<J extends BSFormInputGroup<J, I>, I extends Input<?, ?>>
		extends ICssStructure<J>, IBSFormGroup<J, I>
{
	/**
	 * The text (or component.toString(0)) to prepend
	 *
	 * @return
	 */
	
	@NotNull
	J prepend(String text);

	/**
	 * The text (or component.toString(0)) to prepend
	 *
	 * @return
	 */
	
	@NotNull
	J prepend(IComponentHierarchyBase<?,?> component);

	/**
	 * The text (or component.toString(0)) to append
	 *
	 * @param text
	 *
	 * @return
	 */
	
	@NotNull
	J append(String text);

	/**
	 * The text (or component.toString(0)) to append
	 *
	 * @param component
	 *
	 * @return
	 */
	
	@NotNull
	J append(IComponentHierarchyBase<?,?> component);

	/**
	 * returns the prepending div as it currently is. Only add spans directly with classes??
	 *
	 * @return
	 */
	DivSimple<?> getPrependDiv();

	/**
	 * returns the appending div as it currently is. Only add spans directly with classes??
	 *
	 * @return
	 */
	DivSimple<?> getAppendDiv();

	
	@NotNull
	J append(IComponentHierarchyBase<?,?> component, boolean renderInSpan);

	boolean isStyleInputGroupTextWithValidation();

	J setStyleInputGroupTextWithValidation(boolean styleInputGroupTextWithValidation);
}
