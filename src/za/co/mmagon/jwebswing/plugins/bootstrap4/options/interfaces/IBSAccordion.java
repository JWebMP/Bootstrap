package za.co.mmagon.jwebswing.plugins.bootstrap4.options.interfaces;

import za.co.mmagon.jwebswing.base.interfaces.ICssStructure;
import za.co.mmagon.jwebswing.plugins.bootstrap4.accordion.BSAccordion;
import za.co.mmagon.jwebswing.plugins.bootstrap4.accordion.BSAccordionCollection;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardBody;

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
