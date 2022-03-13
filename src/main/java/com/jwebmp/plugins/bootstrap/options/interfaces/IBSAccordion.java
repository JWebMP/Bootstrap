package com.jwebmp.plugins.bootstrap.options.interfaces;

import com.jwebmp.core.base.interfaces.ICssStructure;
import com.jwebmp.plugins.bootstrap.accordion.BSAccordion;
import com.jwebmp.plugins.bootstrap.accordion.BSAccordionCollection;
import com.jwebmp.plugins.bootstrap.cards.parts.BSCardBody;

import java.util.Comparator;

public interface IBSAccordion<J extends BSAccordion<J>>
		extends Comparator<J>, Comparable<J>, ICssStructure<J>
{
	/**
	 * Adds a new accordion card formatted with the settings applied with the content hidden
	 *
	 * @param headerText
	 *
	 * @return
	 */
	BSAccordionCollection<?> addCard(String headerText);

	/**
	 * Adds a new accordion card formatted with the settings applied
	 *
	 * @return
	 */
	BSAccordionCollection<?> addCard(String headerText, BSCardBody<?> bodyContent, boolean show);

	/**
	 * Adds a new accordion card formatted with the settings applied with the content hidden
	 *
	 * @param headerText
	 * @param bodyContent
	 *
	 * @return
	 */
	BSAccordionCollection<?> addCard(String headerText, BSCardBody<?> bodyContent);
}
