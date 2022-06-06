package com.jwebmp.plugins.bootstrap.timepicker;

import com.jwebmp.core.base.angular.client.services.interfaces.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.core.base.html.*;

import java.time.*;
import java.util.*;
import java.util.List;

public class BSTimePicker<J extends BSTimePicker<J>> extends DivSimple<J> implements INgComponent<J>
{
	private NgbTimeStruct time;
	
	private Integer hourStep;
	private Boolean meridian;
	private Integer minuteStep;
	private Boolean readonlyInputs;
	private Boolean seconds;
	private Integer secondStep;
	private Boolean spinners;
	
	public BSTimePicker()
	{
		setTag("ngb-timepicker");
	}
	
	@Override
	public List<String> fields()
	{
		if (time != null)
			return List.of("time = " + time.toJson());
		else
		{
			return List.of();
		}
	}
	
	@Override
	public void init()
	{
		if (hourStep != null)
		{
			addAttribute("[hourStep]", hourStep + "");
		}
		if (meridian != null)
		{
			addAttribute("[meridian]", meridian + "");
		}
		if (minuteStep != null)
		{
			addAttribute("[minuteStep]", minuteStep + "");
		}
		if (readonlyInputs != null)
		{
			addAttribute("[readonlyInputs]", readonlyInputs + "");
		}
		if (seconds != null)
		{
			addAttribute("[seconds]", seconds + "");
		}
		if (secondStep != null)
		{
			addAttribute("secondStep", secondStep + "");
		}
		if (spinners != null)
		{
			addAttribute("spinners", spinners + "");
		}
		super.init();
	}
	
	public NgbTimeStruct getTime()
	{
		return time;
	}
	
	public J setTime(NgbTimeStruct time)
	{
		this.time = time;
		return (J)this;
	}
	
	public J setTime(Date time)
	{
		this.time = new NgbTimeStruct(time);
		return (J)this;
	}
	
	public J setTime(LocalTime time)
	{
		this.time = new NgbTimeStruct(time);
		return (J)this;
	}
	
	public J setTime(LocalDateTime time)
	{
		this.time = new NgbTimeStruct(time);
		return (J)this;
	}
	
	public J setTime(Duration time)
	{
		this.time = new NgbTimeStruct(time);
		return (J)this;
	}
	
	public Integer getHourStep()
	{
		return hourStep;
	}
	
	public J setHourStep(Integer hourStep)
	{
		this.hourStep = hourStep;
		return (J)this;
	}
	
	public Boolean getMeridian()
	{
		return meridian;
	}
	
	public J setMeridian(Boolean meridian)
	{
		this.meridian = meridian;
		return (J)this;
	}
	
	public Integer getMinuteStep()
	{
		return minuteStep;
	}
	
	public J setMinuteStep(Integer minuteStep)
	{
		this.minuteStep = minuteStep;
		return (J)this;
	}
	
	public Boolean getReadonlyInputs()
	{
		return readonlyInputs;
	}
	
	public J setReadonlyInputs(Boolean readonlyInputs)
	{
		this.readonlyInputs = readonlyInputs;
		return (J)this;
	}
	
	public Boolean getSeconds()
	{
		return seconds;
	}
	
	public J setSeconds(Boolean seconds)
	{
		this.seconds = seconds;
		return (J)this;
	}
	
	public Integer getSecondStep()
	{
		return secondStep;
	}
	
	public J setSecondStep(Integer secondStep)
	{
		this.secondStep = secondStep;
		return (J)this;
	}
	
	public Boolean getSpinners()
	{
		return spinners;
	}
	
	public J setSpinners(Boolean spinners)
	{
		this.spinners = spinners;
		return (J)this;
	}
}
