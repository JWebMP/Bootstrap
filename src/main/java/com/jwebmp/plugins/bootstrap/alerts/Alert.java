package com.jwebmp.plugins.bootstrap.alerts;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.guicedee.services.jsonrepresentation.IJsonRepresentation;
import com.jwebmp.core.base.angular.client.annotations.angular.NgDataType;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataType;
import com.jwebmp.plugins.bootstrap.BSColourTypes;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
public class Alert implements IJsonRepresentation<Alert>, INgDataType<Alert>
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
