package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.base.ajax.AjaxCall;
import com.jwebmp.core.base.ajax.AjaxResponse;
import com.jwebmp.core.base.ajax.AjaxResponseReaction;
import com.jwebmp.core.base.ajax.ReactionType;
import com.jwebmp.core.base.angular.services.compiler.TypeScriptCompiler;
import com.jwebmp.core.base.interfaces.IComponentHierarchyBase;
import com.jwebmp.core.events.click.ClickAdapter;
import io.smallrye.mutiny.Uni;

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
    public Uni<Void> onClick(AjaxCall<?> call, AjaxResponse<?> response)
    {
        try
        {
            new TypeScriptCompiler(new BootstrapApp()).compileApp();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        response.addReaction(new AjaxResponseReaction<>("/", ReactionType.RedirectUrl));
        return Uni.createFrom()
                  .voidItem();
    }
}
