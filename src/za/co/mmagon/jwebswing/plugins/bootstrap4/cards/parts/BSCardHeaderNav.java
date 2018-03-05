package za.co.mmagon.jwebswing.plugins.bootstrap4.cards.parts;

import za.co.mmagon.jwebswing.base.html.Link;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.base.html.ListItem;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.children.ListChildren;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.plugins.bootstrap4.cards.BSCardOptions;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavsOptions;
import za.co.mmagon.jwebswing.utilities.StaticStrings;

import javax.validation.constraints.NotNull;

/**
 * Constructs a card header with nav properties
 *
 * @param <J>
 */
public class BSCardHeaderNav<J extends BSCardHeaderNav<J>>
		extends List<ListChildren, NoAttributes, GlobalEvents, J>
{

	/**
	 * Constructs a card header with nav properties
	 */
	public BSCardHeaderNav()
	{
		super();
		addClass(BSNavsOptions.Nav);
		addClass(BSNavsOptions.Nav_Tabs);
		addClass(BSCardOptions.Card_Header_Tabs);
	}

	/**
	 * Adds a new list item that is not active
	 *
	 * @param text
	 *
	 * @return
	 */
	@Override
	@NotNull
	public ListItem<?> addItem(String text)
	{
		return addItem(text, false);
	}

	/**
	 * Adds a new list item (tab header that matches the right card-body) to the header with the given active property
	 *
	 * @param text
	 * @param active
	 *
	 * @return
	 */
	@NotNull
	public ListItem<?> addItem(String text, boolean active)
	{
		ListItem<?> item = new ListItem<>();
		item.addClass(BSNavsOptions.Nav_Item);
		Link<?> link = new Link<>(StaticStrings.STRING_HASH);
		link.addClass(BSNavsOptions.Nav_Link);
		if (active)
		{
			link.addClass(BSNavsOptions.Active);
		}
		link.setText(text);

		item.add(link);
		add(item);
		return item;
	}

	@SuppressWarnings("unchecked")
	@NotNull
	public J asPills()
	{
		removeClass(BSNavsOptions.Nav_Tabs);
		addClass(BSNavsOptions.Nav_Pills);

		removeClass(BSCardOptions.Card_Header_Tabs);
		addClass(BSCardOptions.Card_Header_Pills);
		return (J) this;
	}

}
