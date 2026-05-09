package com.jwebmp.plugins.bootstrap.listgroup.parts;

import com.jwebmp.plugins.bootstrap.listgroup.BSListGroupOptions;

/**
 * Links and buttons Use &gt;a&lt;s or &gt;button&lt;s to create actionable list group items with hover, disabled, and active states by
 * adding .list-group-item-action. We separate these pseudo-classes
 * to ensure list groups made of non-interactive elements (like &gt;li&lt;s or &gt;div&lt;s) don’t provide a click or tap affordance.
 *
 * @author GedMarc
 * @since 19 Jan 2017
 */
public class BSListGroupButtonItem<J extends BSListGroupListItem<J>>
		extends BSListGroupListItem<J>
{


	/**
	 * Links and buttons Use &gt;a&lt;s or &gt;button&lt;s to create actionable list group items with hover, disabled, and active states by
	 * adding .list-group-item-action. We separate these
	 * pseudo-classes to ensure list groups made of non-interactive elements (like &gt;li&lt;s or &gt;div&lt;s) don’t provide a click or
	 * tap
	 * affordance.
	 */
	public BSListGroupButtonItem()
	{
		setTag("button");
		addClass(BSListGroupOptions.List_Group_Item_Action);
	}
}
