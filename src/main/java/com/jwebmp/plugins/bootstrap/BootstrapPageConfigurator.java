package com.jwebmp.plugins.bootstrap;

import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgPolyfill;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgScript;
import com.jwebmp.core.base.angular.client.annotations.angularconfig.NgStyleSheet;
import com.jwebmp.core.base.angular.client.annotations.typescript.TsDependency;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.PluginStatus;
import com.jwebmp.core.services.IPage;
import com.jwebmp.core.services.IPageConfigurator;
import jakarta.validation.constraints.NotNull;

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
        pluginVersion = "5.3.8",
        pluginCategories = "bootstrap, ui, web ui, framework",
        pluginSubtitle = "Bootstrap makes front-end web development faster and easier.",
        pluginSourceUrl = "https://getbootstrap.com/",
        pluginWikiUrl = "https://github.com/JWebMP/JWebMP/wiki",
        pluginGitUrl = "https://github.com/JWebMP/JWebMP",
        pluginIconUrl = "",
        pluginIconImageUrl = "",
        pluginOriginalHomepage = "https://getbootstrap.com/",
        pluginDownloadUrl = "https://jwebmp.com/",
        pluginGroupId = "com.jwebmp.plugins",
        pluginArtifactId = "bootstrap",
        pluginModuleName = "com.jwebmp.plugins.bootstrap",
        pluginStatus = PluginStatus.Released
)
@TsDependency(value = "@ng-bootstrap/ng-bootstrap", version = "^20.0.0")
@TsDependency(value = "@popperjs/core", version = "*")
@TsDependency(value = "bootstrap", version = "^5.3.8")
@TsDependency(value = "@angular/localize", version = "^21.0.0")

/*@TsDependency(value = "ng-bootstrap-datetime-angular-13", version = "^0.1.33")
@NgBootImportReference(name = "NgBootstrapDatetimeAngularModule ", reference = "ng-bootstrap-datetime-angular-13")
@NgBootModuleImport("NgBootstrapDatetimeAngularModule")*/

@NgPolyfill("@angular/localize/init")

@NgStyleSheet(value = "node_modules/bootstrap/scss/bootstrap.scss", name = "bootstrap")
@NgScript(value = "@popperjs/core/dist/umd/popper.js", sortOrder = 4)
@NgScript(value = "bootstrap/dist/js/bootstrap.js", sortOrder = 5)

//@NgModuleImport("NgbModule")
//@NgImportReference(value = "NgbModule", reference = "@ng-bootstrap/ng-bootstrap")
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
    public IPage<?> configure(IPage<?> page)
    {
        return page;
    }

    @Override
    public boolean enabled()
    {
        return true;
    }

}
