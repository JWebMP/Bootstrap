package za.co.mmagon.jwebswing.plugins.bootstrap4.breadcrumbs;

import za.co.mmagon.jwebswing.base.html.Div;
import za.co.mmagon.jwebswing.base.html.attributes.GlobalAttributes;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;
import za.co.mmagon.jwebswing.base.html.interfaces.GlobalFeatures;
import za.co.mmagon.jwebswing.base.html.interfaces.events.GlobalEvents;
import za.co.mmagon.jwebswing.base.servlets.enumarations.ComponentTypes;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap4.navs.BSNavsAttributes;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

/**
 * Indicate the current page’s location within a navigational hierarchy that automatically adds separators via CSS.
 *
 * @param <J>
 */
@ComponentInformation(name = "Bootstrap Breadcrumbs",
		description = "Indicate the current page’s location within a navigational hierarchy. Separators are automatically added in CSS " +
				              "through ::before and content.",
		url = "https://v4-alpha.getbootstrap.com/components/breadcrumb/",
		wikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapPlugin/wiki")
public class BSBreadCrumb<J extends BSBreadCrumb<J>>
		extends Div<BSBreadcrumbContainer, NoAttributes, GlobalFeatures, GlobalEvents, J>
		implements IBSBreadCrumb<J>
{
	private static final String NavigationString = "navigation";
	private static final String BreadCrumbsString = "breadcrumbs";

	private final BSBreadcrumbContainer crumbs;

	/**
	 * Indicate the current page’s location within a navigational hierarchy that automatically adds separators via CSS.
	 *
	 * @param optionalAriaLabel
	 */
	public BSBreadCrumb(@Nullable String... optionalAriaLabel)
	{
		super(ComponentTypes.Navigation);
		if (optionalAriaLabel != null)
		{
			addAttribute(GlobalAttributes.Aria_Label, optionalAriaLabel.length > 0 ? optionalAriaLabel[0] : BreadCrumbsString);
		}
		else
		{
			addAttribute(GlobalAttributes.Aria_Label, BreadCrumbsString);
		}
		addAttribute(BSNavsAttributes.Role.toString(), NavigationString);
		crumbs = new BSBreadcrumbContainer();
		add(crumbs);
	}

	/**
	 * Adds a new breadcrumb item to the colletion
	 *
	 * @param item
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	@NotNull
	public J addBreadCrumb(BSBreadCrumbItem item)
	{
		crumbs.add(item);
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		return super.equals(o);
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}
}
