package com.valterleonardo.app1.core.ports;

import com.valterleonardo.app1.http.out.app2.dto.App2Response;
import com.valterleonardo.app1.http.out.app2.dto.App2Resquest;

public interface RestApp2Interface {
    App2Response processar(App2Resquest app2Resquest) throws Exception;
}
