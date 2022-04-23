package com.jwebmp.plugins.bootstrap.toasts;

import com.fasterxml.jackson.annotation.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
public class ToastInfo implements INgDataType<ToastInfo>
{
	private String header;
	private String body;
	private Integer delay;
	
	private String classname = "";
	private boolean autohide = true;
	
	
	public String getHeader()
	{
		return header;
	}
	
	public ToastInfo setHeader(String header)
	{
		this.header = header;
		return this;
	}
	
	public String getBody()
	{
		return body;
	}
	
	public ToastInfo setBody(String body)
	{
		this.body = body;
		return this;
	}
	
	public Integer getDelay()
	{
		return delay;
	}
	
	public ToastInfo setDelay(Integer delay)
	{
		this.delay = delay;
		return this;
	}
	
	public String getClassname()
	{
		return classname;
	}
	
	public ToastInfo setClassname(String classname)
	{
		this.classname = classname;
		return this;
	}
	
	public boolean isAutohide()
	{
		return autohide;
	}
	
	public ToastInfo setAutohide(boolean autohide)
	{
		this.autohide = autohide;
		return this;
	}
}
