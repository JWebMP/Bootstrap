package com.jwebmp.plugins.bootstrap;

import com.guicedee.guicedinjection.*;
import com.guicedee.guicedservlets.undertow.GuicedUndertow;
import com.guicedee.logger.LogFactory;
import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.angular.services.compiler.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import org.junit.jupiter.api.*;

import java.io.*;
import java.util.logging.Level;

import static com.jwebmp.core.base.angular.client.services.interfaces.AnnotationUtils.*;
import static com.jwebmp.core.base.angular.client.services.interfaces.IComponent.*;

public class BootstrapTestGen
{
	public static void main(String[] args) throws Exception
	{
		LogFactory.configureDefaultLogHiding();
		LogFactory.configureConsoleColourOutput(Level.FINE);
		GuicedUndertow.boot("localhost", 6524);
	}
	
	@Test
	public void testAppSearch() throws IOException
	{
		GuiceContext.inject();
		for (INgApp<?> app : JWebMPTypeScriptCompiler.getAllApps())
		{
			JWebMPTypeScriptCompiler compiler = new JWebMPTypeScriptCompiler(app);
			
			System.out.println("Generating @NgApp (" + getTsFilename(app.getClass()) + ") " +
			                   "in folder " + getClassDirectory(app.getClass()));
			System.out.println("================");
			//	compiler.renderAppTS(app);
			System.out.println("================");
		}
	}
	
}
