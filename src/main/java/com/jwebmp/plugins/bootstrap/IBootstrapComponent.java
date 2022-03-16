package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.base.interfaces.*;

public interface IBootstrapComponent<J extends IBootstrapComponent<J> & IComponentHTMLAttributeBase<?, ?>>
{
	default J disableAnimation()
	{
		J me = (J) this;
		me.addAttribute("[animation]", "false");
		return (J) this;
	}
}
