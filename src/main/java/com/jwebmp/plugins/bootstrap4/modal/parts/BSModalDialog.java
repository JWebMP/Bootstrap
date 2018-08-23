package com.jwebmp.plugins.bootstrap4.modal.parts;

import com.jwebmp.core.base.html.DivSimple;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.plugins.bootstrap4.modal.BSModalAttributes;
import com.jwebmp.plugins.bootstrap4.modal.BSModalChildren;
import com.jwebmp.plugins.bootstrap4.modal.BSModalOptions;

public class BSModalDialog<J extends BSModalDialog<J>>
		extends DivSimple<J>
		implements BSModalChildren<IComponentHierarchyBase, J>
{
	public BSModalDialog()
	{
		addClass(BSModalOptions.Modal_Dialog);
		addAttribute(BSModalAttributes.Role.toString(), "document");
	}
}
