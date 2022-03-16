package com.jwebmp.plugins.bootstrap;

import com.google.inject.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.angularconfig.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.accordion.*;
import com.jwebmp.plugins.bootstrap.alerts.*;
import com.jwebmp.plugins.bootstrap.buttons.styles.*;
import com.jwebmp.plugins.bootstrap.carousel.*;
import com.jwebmp.plugins.bootstrap.carousel.parts.*;
import com.jwebmp.plugins.bootstrap.containers.*;
import com.jwebmp.plugins.bootstrap.datepicker.*;
import com.jwebmp.plugins.bootstrap.dropdown.*;
import com.jwebmp.plugins.bootstrap.options.*;

import static com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions.*;

@NgComponent(value = "bootstrap-kitchen-sink")
//@NgProviderReference(SocketClientService.class)
@NgModuleImportReference(name = "NgbDateStruct, NgbCalendar", reference = "@ng-bootstrap/ng-bootstrap")
public class BootstrapKitchenSink extends DivSimple<BootstrapKitchenSink>
		implements INgComponent<BootstrapKitchenSink>
{
	
	
	@Inject
	public void initialize()
	{
		BSButtonPrimary<?> rebuildButton = new BSButtonPrimary<>("Rebuild App");
		rebuildButton.addEvent(new RebuildAppClickEvent());
		add(rebuildButton);
		
		BSContainer<?> container = BSContainer.newInstance(BSContainerOptions.Container_Fluid);
		add(container);
		
		BSRow<?> accordionRow = new BSRow<>();
		container.add(accordionRow);
		
		BSAccordion<?> accordion = new BSAccordion<>();
		accordionRow.add(accordion);
		accordion.setID("test");
		
		accordion.addPanel("static-1", new BSAccordionPanelTitle<>().add("Title 1"),
				new BSAccordionPanelContent<>().add("Content 1"), true);
		
		accordion.addPanel("static-2", new BSAccordionPanelTitle<>().add("Title 2"),
				new BSAccordionPanelContent<>().add("Content 2"), false);
		
		BSRow<?> alertRow = new BSRow<>();
		container.add(alertRow);
		
		alertRow.add(new BSAlertsTest());
		
		
		BSRow<?> carouselRow = new BSRow<>();
		container.add(carouselRow);
		carouselRow.add(new BSCarousel<>().addSlide(new BSCarouselSlide<>().add("Slide 1"))
		                                  .addSlide(new BSCarouselSlide<>().add("Slide 2"))
		);
		
		BSRow<?> datepickerRow = new BSRow<>();
		container.add("datepicker");
		container.add(datepickerRow);
		
		datepickerRow.add(new BSDatePicker<>());
		datepickerRow.add(new BSDatePicker<>().createToggle(new Button<>("Toggle DP")));
		
		container.add("dropdown");
		BSRow<?> dropdownRow = new BSRow<>();
		container.add(dropdownRow);
		BSDropDown j = new BSDropDown<>().setText("Drop Down Test")
		                        .addItem("Edit")
		                        .addItem("Duplicate");
		j.getDropDownButton()
		 .addClass(Btn_Outline_Primary);
		dropdownRow.add(j);
		
		
	}
}
