package com.jwebmp.plugins.bootstrap.modal.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.modal.BSModalAttributes;
import com.jwebmp.plugins.bootstrap.modal.BSModalChildren;
import com.jwebmp.plugins.bootstrap.modal.BSModalOptions;

public class BSModalDialog<J extends BSModalDialog<J>>
		extends DivSimple<J>
		implements BSModalChildren
{
	public BSModalDialog()
	{
		addClass(BSModalOptions.Modal_Dialog);
		addAttribute(BSModalAttributes.Role.toString(), "document");
	}
}
