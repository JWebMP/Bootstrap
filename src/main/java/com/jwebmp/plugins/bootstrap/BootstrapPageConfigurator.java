/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.INgModule;
import com.jwebmp.core.base.client.Browsers;
import com.jwebmp.core.base.client.InternetExplorerCompatibilityMode;
import com.jwebmp.core.base.html.Meta;
import com.jwebmp.core.base.html.attributes.MetaAttributes;
import com.jwebmp.core.base.references.JavascriptReference;
import com.jwebmp.core.base.servlets.enumarations.RequirementsPriority;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPageConfigurator;

import jakarta.validation.constraints.NotNull;

import java.util.*;

/**
 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
 * <p>
 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page via
 * file://
 */
@PluginInformation(pluginName = "Bootstrap",
                   pluginDescription = "Bootstrap is the most popular HTML, CSS, and JS framework for developing responsive, mobile first projects " +
                                       "on the web",
                   pluginUniqueName = "bootstrap",
                   pluginVersion = "5.0.2",
                   pluginCategories = "bootstrap,ui,web ui, framework",
                   pluginSubtitle = "Bootstrap makes front-end web development faster and easier.",
                   pluginSourceUrl = "http://getbootstrap.com/",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin/wiki",
                   pluginGitUrl = "https://github.com/GedMarc/JWebMP-BootstrapPlugin",
                   pluginIconUrl = "",
                   pluginIconImageUrl = "",
                   pluginOriginalHomepage = "http://getbootstrap.com/",
                   pluginDownloadUrl = "https://mvnrepository.com/artifact/com.jwebmp.plugins.bootstrap/jwebmp-bootstrap",
                   pluginGroupId = "com.jwebmp.plugins.bootstrap",
                   pluginArtifactId = "jwebmp-bootstrap",
                   pluginModuleName = "com.jwebmp.plugins.bootstrap4",
                   pluginStatus = PluginStatus.Released
)
@TsDependency(value = "@ng-bootstrap/ng-bootstrap", version = "^12.0.1")
@TsDependency(value = "@popperjs/core", version = "*")
@TsDependency(value = "bootstrap", version = "^5.1.3")
@TsDependency(value = "@angular/localize", version = "^13.3.4")

@NgPolyfill("@angular/localize/init")


@NgStyleSheet(value = "node_modules/bootstrap/scss/bootstrap.scss", name = "bootstrap")
@NgScript(value = "@popperjs/core/dist/umd/popper.js",sortOrder = 4)
@NgScript(value = "bootstrap/dist/js/bootstrap.js",sortOrder = 5)

@NgBootModuleImport("NgbModule")
@NgBootImportReference(name = "NgbModule",reference = "@ng-bootstrap/ng-bootstrap")

public class BootstrapPageConfigurator
		implements IPageConfigurator<BootstrapPageConfigurator>
{
	
	/**
	 * The default page configurator for bootstrap
	 */
	public BootstrapPageConfigurator()
	{
		//Nothing Needed
	}
	
	/**
	 * The 3 meta tags *must* come first in the head; any other head content must come *after* these tags
	 * <p>
	 * HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries WARNING: Respond.js doesn't work if you view the page
	 * via file://
	 *
	 * @return
	 */
	@NotNull
	@Override
	public Page<?> configure(Page<?> page)
	{
		return page;
	}
	
	@Override
	public boolean enabled()
	{
		return true;
	}
	
}
