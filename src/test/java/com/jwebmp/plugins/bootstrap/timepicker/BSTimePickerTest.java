package com.jwebmp.plugins.bootstrap.timepicker;

import com.jwebmp.core.base.angular.implementations.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import org.junit.jupiter.api.*;

import java.time.*;

@NgComponent("timepickertest")
public class BSTimePickerTest extends BSTimePicker<BSTimePickerTest>
{
	@Override
	public void init()
	{
	//	bind("time");
		super.init();
	}
	
	@Test
	public void testPicker()
	{
		AngularTSPostStartup.loadTSOnStartup = false;
		BSTimePicker<?> picker = new BSTimePicker<>();
		//picker.setTime(LocalDateTime.now());
		picker.setMeridian(true);
		picker.setSpinners(true);
	//	picker.bind("time");
		System.out.println(picker.toString(0));
	}
}
