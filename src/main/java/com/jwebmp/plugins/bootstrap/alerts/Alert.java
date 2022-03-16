package com.jwebmp.plugins.bootstrap.alerts;

import com.fasterxml.jackson.annotation.*;
import com.guicedee.guicedinjection.representations.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.plugins.bootstrap.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
public class Alert implements IJsonRepresentation<Alert>,INgDataType<Alert>
{
	private String type;
	private String message;
	
	public Alert()
	{
	}
	
	public Alert(BSColourTypes type, String message)
	{
		this.type = type.toString();
		this.message = message;
	}
	
	public BSColourTypes getType()
	{
		return BSColourTypes.valueOf(type);
	}
	
	public Alert setType(BSColourTypes type)
	{
		this.type = type.toString();
		return this;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	public Alert setMessage(String message)
	{
		this.message = message;
		return this;
	}
}
