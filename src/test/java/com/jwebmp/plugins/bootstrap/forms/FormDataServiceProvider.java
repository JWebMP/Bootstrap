package com.jwebmp.plugins.bootstrap.forms;

import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;

@NgServiceProvider(variableName = "appData",referenceName = "formData",value = FormDataServiceTest.class, dataType = FormData.class)
public class FormDataServiceProvider implements INgServiceProvider<FormDataServiceProvider>
{

}
