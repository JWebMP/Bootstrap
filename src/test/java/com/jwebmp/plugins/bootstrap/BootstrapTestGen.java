package com.jwebmp.plugins.bootstrap;

import com.guicedee.client.IGuiceContext;
import com.jwebmp.core.base.angular.client.services.interfaces.INgApp;
import com.jwebmp.core.base.angular.services.compiler.JWebMPTypeScriptCompiler;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils.getTsFilename;
import static com.jwebmp.core.base.angular.client.services.interfaces.IComponent.getClassDirectory;

public class BootstrapTestGen
{

    @Test
    public void testAppSearch() throws IOException, InterruptedException
    {
        IGuiceContext.instance()
                .inject();
        for (INgApp<?> app : JWebMPTypeScriptCompiler.getAllApps())
        {
            JWebMPTypeScriptCompiler compiler = new JWebMPTypeScriptCompiler(app);

            System.out.println("Generating @NgApp (" + getTsFilename(app.getClass()) + ") " +
                    "in folder " + getClassDirectory(app.getClass()));
            System.out.println("================");
            //	compiler.renderAppTS(app);
            System.out.println("================");
        }
        TimeUnit.SECONDS.sleep(2);
    }

}
