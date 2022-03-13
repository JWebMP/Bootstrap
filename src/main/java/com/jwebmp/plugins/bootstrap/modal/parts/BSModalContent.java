package com.jwebmp.plugins.bootstrap.modal.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.plugins.bootstrap.modal.BSModalAttributes;
import com.jwebmp.plugins.bootstrap.modal.BSModalOptions;

public class BSModalContent<J extends BSModalContent<J>>
		extends DivSimple<J>
{
	public BSModalContent()
	{
		addClass(BSModalOptions.Modal_Content);
		addAttribute(BSModalAttributes.Role.toString(), "document");
	}
}
