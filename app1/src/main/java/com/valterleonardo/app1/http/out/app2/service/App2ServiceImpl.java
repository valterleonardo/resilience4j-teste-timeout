package com.valterleonardo.app1.http.out.app2.service;

import com.valterleonardo.app1.core.ports.RestApp2Interface;
import com.valterleonardo.app1.http.out.app2.dto.App2Response;
import com.valterleonardo.app1.http.out.app2.dto.App2Resquest;
import com.valterleonardo.app1.http.out.app2.config.App2Config;
import com.valterleonardo.app1.http.out.client.AbstractHttpGetClient;
import org.springframework.stereotype.Service;

@Service
public class App2ServiceImpl extends AbstractHttpGetClient<App2Resquest, App2Response, App2Config> implements RestApp2Interface {

    public App2Response processar(App2Resquest app2Resquest) throws Exception {

        System.out.println("Chamando App2 com "+app2Resquest.getDelay()+"ms de delay");
        configuration.setDelay(app2Resquest.getDelay());
        App2Response app2Response = this.getRequest(App2Response.class).getBody();
        System.out.println("sucesso ao Chamar App2 com "+app2Resquest.getDelay()+"ms de delay");
        return app2Response;
    }

}
