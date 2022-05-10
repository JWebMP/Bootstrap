package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.ajax.*;
import com.jwebmp.core.base.angular.services.annotations.references.*;
import com.jwebmp.core.base.angular.services.interfaces.*;

import java.util.*;


@NgDataTypeReference(value = ToastInfo.class, primary = false)
@NgImportReference(name = "TemplateRef", reference = "@angular/core")
public abstract class ToastDataService<J extends ToastDataService<J>> implements INgDataService<J>
{
	@Override
	public String providedIn()
	{
		return "any";
	}
	
	@Override
	public List<String> methods()
	{
		return List.of("show(textOrTpl: string | TemplateRef<any>, options: any = {}) {\n" +
		               "        this.dataStore.datas.out?.push({textOrTpl, ...options});\n" +
		               "        this._data.next(Object.assign({}, this.dataStore).datas);\n" +
		               "  }\n" +
		               "\n" +
		               "  remove(toast : any) {\n" +
		               "        this.dataStore.datas.out = this.dataStore.datas.out?.filter(t => t !== toast);\n" +
		               "        this._data.next(Object.assign({}, this.dataStore).datas);\n" +
		               "  }\n" +
		               "\n" +
		               "  clear() {\n" +
		               "    this.dataStore.datas.out?.splice(0, this.dataStore.datas.out?.length);\n" +
		               "        this._data.next(Object.assign({}, this.dataStore).datas);\n" +
		               "  }");
	}
}
