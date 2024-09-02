package com.jwebmp.plugins.bootstrap.alerts;

import com.jwebmp.core.base.angular.client.annotations.references.NgDataTypeReference;
import com.jwebmp.core.base.angular.client.services.interfaces.INgDataService;

import java.util.List;

@NgDataTypeReference(value = Alert.class, primary = false)
public abstract class AlertDataService<J extends AlertDataService<J>> implements INgDataService<J>
{
    @Override
    public List<String> methods()
    {
        var list = INgDataService.super.methods();
        list.addAll(List.of("close(alert: Alert) {\n" +
                                    "        this.dataStore.datas.out?.splice(this.dataStore.datas.out?.indexOf(alert), 1);\n" +
                                    "        this._data.next(Object.assign({}, this.dataStore).datas);\n" +
                                    "}\n"));
        return list;
    }
}
