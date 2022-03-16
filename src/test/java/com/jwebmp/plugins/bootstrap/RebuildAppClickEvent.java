package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.*;
import com.jwebmp.core.base.angular.services.*;
import com.jwebmp.core.base.interfaces.*;
import com.jwebmp.core.events.click.*;

import java.io.*;

public class RebuildAppClickEvent extends ClickAdapter<RebuildAppClickEvent>
{
	public RebuildAppClickEvent()
	{
	}
	
	public RebuildAppClickEvent(IComponentHierarchyBase<?, ?> component)
	{
		super(component);
	}
	
	@Override
	public void onClick(AjaxCall<?> call, AjaxResponse<?> response)
	{
		try
		{
			new JWebMPTypeScriptCompiler(new BootstrapApp()).renderAppTS();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		response.addReaction(new AjaxResponseReaction<>("/", ReactionType.RedirectUrl));
	}
}
