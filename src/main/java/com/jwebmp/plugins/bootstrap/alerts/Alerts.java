package com.jwebmp.plugins.bootstrap.alerts;

import com.fasterxml.jackson.annotation.*;
import com.guicedee.guicedinjection.representations.*;
import com.jwebmp.core.base.angular.services.annotations.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

import java.util.*;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,
                getterVisibility = JsonAutoDetect.Visibility.NONE,
                setterVisibility = JsonAutoDetect.Visibility.NONE)
@NgDataType
@NgDataTypeReference(Alert.class)
public class Alerts implements IJsonRepresentation<Alerts>, INgDataType<Alerts>
{
	private List<Alert> alerts = new ArrayList<>();
	
	public Alerts addAlert(Alert alert)
	{
		alerts.add(alert);
		return this;
	}
	
}
