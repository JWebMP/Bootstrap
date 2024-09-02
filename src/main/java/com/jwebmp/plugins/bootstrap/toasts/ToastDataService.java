package com.jwebmp.plugins.bootstrap.toasts;

import com.jwebmp.core.base.angular.client.annotations.references.NgDataTypeReference;
import com.jwebmp.core.base.angular.client.annotations.references.NgImportReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataService;

import java.util.List;


@NgDataTypeReference(value = ToastInfo.class, primary = false)
@NgImportReference(value = "TemplateRef", reference = "@angular/core")
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
        var list = INgDataService.super.methods();
        list.addAll(List.of("show(textOrTpl: string | TemplateRef<any>, options: any = {}) {\n" +
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
                                    "  }"));
        return list;
    }
}
