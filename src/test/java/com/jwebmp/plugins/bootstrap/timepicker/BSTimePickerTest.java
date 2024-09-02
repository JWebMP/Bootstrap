package com.jwebmp.plugins.bootstrap.timepicker;

import com.jwebmp.core.base.angular.client.annotations.angular.NgComponent;
import org.junit.jupiter.api.Test;

@NgComponent("timepickertest")
public class BSTimePickerTest extends BSTimePicker<BSTimePickerTest>
{
    @Override
    protected void init()
    {
        //	bind("time");
        super.init();
    }

    @Test
    public void testPicker()
    {

        BSTimePicker<?> picker = new BSTimePicker<>();
        //picker.setTime(LocalDateTime.now());
        picker.setMeridian(true);
        picker.setSpinners(true);
        //	picker.bind("time");
        System.out.println(picker.toString(0));
    }
}
