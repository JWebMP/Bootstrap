package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

import java.util.*;

@NgDataTypeReference(Toasts.class)
@NgDataTypeReference(value = ToastInfo.class, primary = false)
@NgImportReference(name = "TemplateRef",reference = "@angular/core")
public abstract class ToastDataService<J extends ToastDataService<J>> implements INgDataService<J>
{
	@Override
	public abstract Toasts getData(AjaxCall<?> call);
	
	@Override
	public List<String> decorators()
	{
		return List.of("@Injectable({ providedIn: 'root' })");
	}
	
	@Override
	public List<String> methods()
	{
		return List.of("show(textOrTpl: string | TemplateRef<any>, options: any = {}) {\n" +
		               "    this.data.toasts?.push({ textOrTpl, ...options });\n" +
		               "  }\n" +
		               "\n" +
		               "  remove(toast : any) {\n" +
		               "    this.data.toasts = this.data.toasts?.filter(t => t !== toast);\n" +
		               "  }\n" +
		               "\n" +
		               "  clear() {\n" +
		               "    this.data.toasts?.splice(0, this.data.toasts?.length);\n" +
		               "  }");
	}
}
