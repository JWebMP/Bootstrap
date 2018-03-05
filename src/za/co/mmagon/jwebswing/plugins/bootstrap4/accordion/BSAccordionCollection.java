package za.co.mmagon.jwebswing.plugins.bootstrap4.accordion;

import za.co.mmagon.jwebswing.base.html.HeaderText;
import za.co.mmagon.jwebswing.plugins.bootstrap4.buttons.BSButton;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCard;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardBody;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts.BSCardHeader;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * A returnable collection of items when adding according items
 *
 * @param <J>
 */
public class BSAccordionCollection<J extends BSAccordionCollection<J>>
		implements Serializable
{

	private static final long serialVersionUID = 1L;

	private BSCard<?> card;
	private BSCardBody<?> body;
	private BSCardHeader<?> header;
	private HeaderText<?> heading;
	private BSButton<?> headingButton;

	/**
	 * A returnable collection of items when adding according items
	 */
	public BSAccordionCollection()
	{
		//No config required
	}

	/**
	 * Returns the card
	 *
	 * @return
	 */
	public BSCard<?> getCard()
	{
		return card;
	}

	/**
	 * Sets the card
	 *
	 * @param card
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setCard(BSCard<?> card)
	{
		this.card = card;
		return (J) this;
	}

	/**
	 * Gets tje bpdy
	 *
	 * @return
	 */
	public BSCardBody<?> getBody()
	{
		return body;
	}

	/**
	 * Sets the body of the collection
	 *
	 * @param body
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setBody(BSCardBody<?> body)
	{
		this.body = body;
		return (J) this;
	}

	/**
	 * Returns the header of the collection
	 *
	 * @return
	 */
	@Nullable
	public BSCardHeader<?> getHeader()
	{
		return header;
	}

	/**
	 * Sets the header of the accordion
	 *
	 * @param header
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeader(BSCardHeader<?> header)
	{
		this.header = header;
		return (J) this;
	}

	/**
	 * Returns the header of the accordion
	 *
	 * @return
	 */
	@NotNull
	public HeaderText<?> getHeading()
	{
		return heading;
	}

	/**
	 * Sets the heading to the given H tag
	 *
	 * @param heading
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeading(HeaderText<?> heading)
	{
		this.heading = heading;
		return (J) this;
	}

	/**
	 * Returns the button for the accordion
	 *
	 * @return
	 */
	@Nullable
	public BSButton<?> getHeadingButton()
	{
		return headingButton;
	}

	/**
	 * Sets the button
	 *
	 * @param headingButton
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setHeadingButton(BSButton<?> headingButton)
	{
		this.headingButton = headingButton;
		return (J) this;
	}
}
