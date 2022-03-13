package com.jwebmp.plugins.bootstrap.forms.groups.sets.parts;

import com.jwebmp.core.base.html.DivSimple;

import static com.jwebmp.plugins.bootstrap.forms.groups.sets.BSComponentInputGroupOptions.*;

public class InputGroupAppendItem<J extends InputGroupAppendItem<J>>
		extends DivSimple<J>
{
	public InputGroupAppendItem()
	{
		addClass(Input_Group_Append);
	}

}
