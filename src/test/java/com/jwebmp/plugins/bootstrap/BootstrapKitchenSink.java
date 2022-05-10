package com.jwebmp.plugins.bootstrap;

import com.google.inject.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;
import com.jwebmp.plugins.bootstrap.accordion.*;
import com.jwebmp.plugins.bootstrap.alerts.*;
import com.jwebmp.plugins.bootstrap.buttons.styles.*;
import com.jwebmp.plugins.bootstrap.carousel.*;
import com.jwebmp.plugins.bootstrap.carousel.parts.*;
import com.jwebmp.plugins.bootstrap.containers.*;
import com.jwebmp.plugins.bootstrap.datepicker.*;
import com.jwebmp.plugins.bootstrap.datetimepicker.*;
import com.jwebmp.plugins.bootstrap.dropdown.*;
import com.jwebmp.plugins.bootstrap.modal.DefaultModalTest;
import com.jwebmp.plugins.bootstrap.navbar.*;
import com.jwebmp.plugins.bootstrap.navbar.parts.*;
import com.jwebmp.plugins.bootstrap.options.*;
import com.jwebmp.plugins.bootstrap.popovers.*;
import com.jwebmp.plugins.bootstrap.progressbar.*;
import com.jwebmp.plugins.bootstrap.timepicker.*;
import com.jwebmp.plugins.bootstrap.toasts.*;

import static com.jwebmp.plugins.bootstrap.buttons.BSButtonOptions.*;

@NgComponent(value = "bootstrap-kitchen-sink")
//@NgProviderReference(SocketClientService.class)
@NgImportReference(name = "NgbDateStruct, NgbCalendar", reference = "@ng-bootstrap/ng-bootstrap")
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
		carouselRow.add(new BSCarouselTest());
		
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
		
		container.add("modal");
		
		BSRow<?> modalRow = new BSRow<>();
		container.add(modalRow);
		modalRow.add(new DefaultModalTest());
		
		BSButtonPrimary<?> launch_modal = new BSButtonPrimary<>("Launch Modal");
		new DefaultModalTest().setOpenButton(launch_modal);
		modalRow.add(launch_modal);
		
		BSRow<?> navRow = new BSRow<>();
		NavsComponent navsComponent = new NavsComponent();
		navRow.add(navsComponent);
		container.add(navRow);
		navRow.add(new BSNavOutlet<>(navsComponent));
		
		
		BSRow<?> navBarRow = new BSRow<>();
		NavBarComponent navBarComponent = new NavBarComponent();
		navBarRow.add(navBarComponent);
		container.add(navBarRow);
		
		BSPopOver<?> popOver = new BSPopOver<>();
		popOver.setTag("button");
		popOver.addAttribute("type", "button");
		popOver.addClass("btn btn-outline-secondary");
		popOver.setText("Click for popup with inner HTML");
		
		popOver.setPopOverTitle(new BSPopOverTitle<>().add(new Paragraph<>("Hello Title").setTextOnly(true)));
		popOver.setPopOverContent(new BSPopOverContent<>().add(new Paragraph<>("World").setTextOnly(true)));
		
		BSRow<?> popOverRow = new BSRow<>();
		popOverRow.add(popOver);
		container.add(popOverRow);
		
		BSRow<?> progressRow = new BSRow<>();
		BSProgressBar<?> bar = new BSProgressBar<>();
		progressRow.add(bar);
		bar.setStriped(true);
		bar.setTextType(BSColourTypes.Light);
		bar.setType(BSColourTypes.Dark);
		bar.setPercentage(25);
		bar.setAnimated(true);
		bar.setMax(50);
		bar.setShowValue(true);
		container.add(progressRow);
		
		
		BSRow<?> timepickerRow = new BSRow<>();
		timepickerRow.add("time picker : ");
		container.add(timepickerRow);
		timepickerRow.add(new BSTimePickerTest());
		
		container.add("toasts....");
		BSRow<?> toastsRow = new BSRow<>();
		container.add(toastsRow);
		
		toastsRow.add(new BSToasts<>(new ToastDataServiceTest()));
		
		BSRow<?> dateTimePickerRow = new BSRow<>();
		container.add("DateTime Picker");
		container.add(dateTimePickerRow);
		dateTimePickerRow.add(new BSDateTimePicker<>());
	}
}
