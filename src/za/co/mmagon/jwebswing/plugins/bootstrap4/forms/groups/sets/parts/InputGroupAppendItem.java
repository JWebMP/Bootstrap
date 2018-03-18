package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.parts;

import za.co.mmagon.jwebswing.base.html.DivSimple;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSComponentInputGroupOptions.Input_Group_Append;

public class InputGroupAppendItem<J extends InputGroupAppendItem<J>>
		extends DivSimple<J>
{
	public InputGroupAppendItem()
	{
		addClass(Input_Group_Append);
	}

}
