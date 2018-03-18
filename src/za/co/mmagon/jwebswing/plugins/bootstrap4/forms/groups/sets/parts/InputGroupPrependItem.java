package za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.parts;

import za.co.mmagon.jwebswing.base.html.DivSimple;

import static za.co.mmagon.jwebswing.plugins.bootstrap4.forms.groups.sets.BSComponentInputGroupOptions.Input_Group_Prepend;

public class InputGroupPrependItem<J extends InputGroupPrependItem<J>>
		extends DivSimple<J>
{
	public InputGroupPrependItem()
	{
		addClass(Input_Group_Prepend);
	}
	
}
