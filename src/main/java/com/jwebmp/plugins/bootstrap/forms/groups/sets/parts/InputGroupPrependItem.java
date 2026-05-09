package com.jwebmp.plugins.bootstrap.forms.groups.sets.parts;

import com.jwebmp.core.base.html.DivSimple;

import static com.jwebmp.plugins.bootstrap.forms.groups.sets.BSComponentInputGroupOptions.*;

public class InputGroupPrependItem<J extends InputGroupPrependItem<J>>
		extends DivSimple<J>
{
	public InputGroupPrependItem()
	{
		addClass(Input_Group_Prepend);
	}

}
