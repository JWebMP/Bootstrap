package com.jwebmp.plugins.bootstrap.carousel.events;

import com.jwebmp.core.base.angular.modules.services.*;
import com.jwebmp.core.base.angular.modules.services.angular.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

import java.util.*;

@NgDirective(selector = "[slideClassName]")
@NgModuleReference(NgDirectiveModule.class)
@NgModuleReference(HostListenerModule.class)
@NgModuleReference(NgInputModule.class)
@NgModuleReference(NgRouterModule.class)
@NgModuleReference(OnInitModule.class)
@NgModuleReference(ElementRefModule.class)
@NgProviderReference(SocketClientService.class)
@NgModuleImportReference(name = "NgbCarousel, NgbSlideEvent, NgbSlideEventSource", reference = "@ng-bootstrap/ng-bootstrap")
public class OnSlidListenerDirective implements INgDirective<OnSlidListenerDirective>
{
	public OnSlidListenerDirective()
	{
	}
	
	@Override
	public List<String> constructorParameters()
	{
		return List.of("private elementRef: ElementRef");
	}
	
	@Override
	public List<String> fields()
	{
		return List.of("@Input() slideClassName: string ='';");
	}
	
	@Override
	public List<String> interfaces()
	{
		return List.of("OnInit");
	}
	
	@Override
	public List<String> methods()
	{
		return List.of("ngOnInit() {}\n",
				"@HostListener('slide', ['$event'])\n" +
				"onSlide(slideEvent: NgbSlideEvent) {\n" +
				"  this.socketClientService.send('ajax',{eventClass : this.slideClassName},'onSlide',slideEvent,this.elementRef);\n" +
				"}\n");
	}
	
}
