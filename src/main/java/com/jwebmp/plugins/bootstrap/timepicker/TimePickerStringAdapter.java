package com.jwebmp.plugins.bootstrap.timepicker;


import com.jwebmp.core.base.angular.client.annotations.angular.*;
import com.jwebmp.core.base.angular.client.annotations.references.*;
import com.jwebmp.core.base.angular.client.annotations.structures.*;
import com.jwebmp.core.base.angular.client.services.interfaces.*;

import java.util.*;

@NgDataType
@NgImportReference(value = "Injectable", reference = "@angular/core")
@NgImportReference(value = "NgbTimeStruct, NgbTimeAdapter",reference = "@ng-bootstrap/ng-bootstrap")
@NgMethod("fromModel(value: string| null): NgbTimeStruct | null {\n" +
          "    if (!value) {\n" +
          "      return null;\n" +
          "    }\n" +
          "    const split = value.split(':');\n" +
          "    return {\n" +
          "      hour: parseInt(split[0], 10),\n" +
          "      minute: parseInt(split[1], 10),\n" +
          "      second: parseInt(split[2], 10)\n" +
          "    };\n" +
          "  }")
@NgMethod("toModel(time: NgbTimeStruct | null): string | null {\n" +
          "    return time != null ? `${pad(time.hour)}:${pad(time.minute)}:${pad(time.second)}` : null;\n" +
          "  }")
public class TimePickerStringAdapter implements INgDataType<TimePickerStringAdapter>
{
	@Override
	public String ofType()
	{
		return "extends NgbTimeAdapter<string>";
	}
	
	@Override
	public List<String> decorators()
	{
		return List.of("@Injectable()");
	}
	
	@Override
	public List<String> globalFields()
	{
		return List.of("const pad = (i: number): string => i < 10 ? `0${i}` : `${i}`;");
	}
	
	
}
