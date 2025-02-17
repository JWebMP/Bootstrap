package com.jwebmp.plugins.bootstrap.carousel.events;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.annotations.components.*;
import com.jwebmp.core.base.angular.client.annotations.references.*;
import com.jwebmp.core.base.angular.client.annotations.structures.*;
import com.jwebmp.core.base.angular.client.services.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;

@NgDirective(value = "[slideClassName]")
@NgImportReference(value = "Input", reference = "@angular/core")
@NgImportReference(value = "HostListener", reference = "@angular/core")
@NgImportReference(value = "RouterModule, ParamMap,Router", reference = "@angular/router")
@NgComponentReference(EventBusService.class)
@NgImportReference(value = "NgbCarousel, NgbSlideEvent, NgbSlideEventSource", reference = "@ng-bootstrap/ng-bootstrap")
@NgInput("slideClassName")

@NgMethod("\t@HostListener('slide', ['$event'])\n" +
        "\tonSlide(slideEvent: NgbSlideEvent) {\n" +
        "\t\tthis.eventBusService.send('ajax',{eventClass : this.slideClassName},'onSlide',slideEvent,this.elementRef);\n" +
        "\t}\n")
public class OnSlidListenerDirective implements INgDirective<OnSlidListenerDirective>
{
    public OnSlidListenerDirective()
    {
    }
}
