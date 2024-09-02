package com.jwebmp.plugins.bootstrap;

import com.guicedee.client.IGuiceContext;
import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.ajax.AjaxResponseReaction;
import com.jwebmp.core.base.ajax.ReactionType;
import com.jwebmp.core.base.angular.services.compiler.JWebMPTypeScriptCompiler;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.events.click.ClickAdapter;

import java.io.IOException;

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
            new JWebMPTypeScriptCompiler(new BootstrapApp()).renderAppTS(IGuiceContext.get(BootstrapApp.class));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        response.addReaction(new AjaxResponseReaction<>("/", ReactionType.RedirectUrl));
    }
}
