package com.jwebmp.plugins.bootstrap.dropdown.parts;

import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.dropdown.interfaces.*;
import com.jwebmp.plugins.bootstrap.options.*;
import jakarta.validation.constraints.*;

/**
 * The Link Button for a drop down
 * <p>
 * Dropdowns
 * <p>
 * Dropdowns are toggleable, contextual overlays for displaying lists of links and more. They’re made interactive with the included
 * Bootstrap dropdown JavaScript plugin. They’re toggled by clicking,
 * not by hovering; this is an intentional design decision.
 *
 * @author GedMarc
 * @since 13 Jan 2017
 */
public class BSNavDropDownItem<J extends BSNavDropDownItem<J>>
		extends Link<J>
{
	/**
	 * Constructs a new bootstrap drop down link item
	 */
	public BSNavDropDownItem()
	{
		super("#");
		addClass("ngbDropdownItem");
	}

	public BSNavDropDownItem(String text)
	{
		super(text);
	}

	/**
	 * Set the style to active using the "active" class
	 *
	 * @param active
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setActive(boolean active)
	{
		if (active)
		{
			addClass(BSDefaultOptions.Active);
		}
		else
		{
			removeClass(BSDefaultOptions.Active);
		}
		return (J) this;
	}

	/**
	 * Set the style to active using the "active" class
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@NotNull
	public J setDisabled(boolean disabled)
	{
		if (disabled)
		{
			addClass(BSDefaultOptions.Disabled);
		}
		else
		{
			removeClass(BSDefaultOptions.Disabled);
		}
		return (J) this;
	}
}
