package com.jwebmp.plugins.bootstrap.toasts;

import com.fasterxml.jackson.annotation.*;
import com.guicedee.guicedinjection.representations.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;
import com.jwebmp.plugins.bootstrap.alerts.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
@NgDataTypeReference(ToastInfo.class)
public class Toasts implements IJsonRepresentation<Toasts>, INgDataType<Toasts>
{
	private List<ToastInfo> toasts = new ArrayList<>();
	
	public Toasts addToast(ToastInfo alert)
	{
		toasts.add(alert);
		return this;
	}
	
}
