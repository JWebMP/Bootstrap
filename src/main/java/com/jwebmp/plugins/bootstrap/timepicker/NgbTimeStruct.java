package com.jwebmp.plugins.bootstrap.timepicker;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.guicedee.services.jsonrepresentation.IJsonRepresentation;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
public class NgbTimeStruct implements IJsonRepresentation<NgbTimeStruct>
{
	private Integer  hour;
	private Integer minute;
	private Integer second;
	
	public NgbTimeStruct()
	{
	}
	
	public NgbTimeStruct(Date time)
	{
		hour = time.getHours();
		minute = time.getMinutes();
		second = time.getSeconds();
	}
	
	public NgbTimeStruct(LocalTime time)
	{
		hour = time.getHour();
		minute = time.getMinute();
		second = time.getSecond();
	}
	
	public NgbTimeStruct(LocalDateTime time)
	{
		hour = time.getHour();
		minute = time.getMinute();
		second = time.getSecond();
	}
	
	public NgbTimeStruct(Duration time)
	{
		hour = time.toHoursPart();
		minute = time.toMinutesPart();
		second = time.toSecondsPart();
	}
	
	
	public Integer getHour()
	{
		return hour;
	}
	
	public NgbTimeStruct setHour(Integer hour)
	{
		this.hour = hour;
		return this;
	}
	
	public Integer getMinute()
	{
		return minute;
	}
	
	public NgbTimeStruct setMinute(Integer minute)
	{
		this.minute = minute;
		return this;
	}
	
	public Integer getSecond()
	{
		return second;
	}
	
	public NgbTimeStruct setSecond(Integer second)
	{
		this.second = second;
		return this;
	}
}
