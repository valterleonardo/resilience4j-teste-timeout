package com.valterleonardo.app1.http.out.app2.config;

import com.valterleonardo.app1.http.out.client.AbstractHttpConfigurationImpl;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriComponentsBuilder;

import javax.annotation.PostConstruct;

@Component
public class App2Config extends AbstractHttpConfigurationImpl implements App2ConfigInterface {

    private String dominio = "http://localhost:8082";
    private String path = "app2/timeout/%d";
    private int delay;

    @Override
    public HttpHeaders buildAuth() {
        return null;
    }

    @Override
    public String getUrl() {
        this.url = this.buildUrl();
        return super.getUrl();
    }

    @Override
    @PostConstruct
    public void setServiceName() {
        super.serviceName = "Chamada App2";
    }

    private String buildUrl(){
        return UriComponentsBuilder
                .fromHttpUrl(dominio)
                .path(String.format(path, this.delay))
                .toUriString();
    }

    public void setDelay(int delay){
        this.delay = delay;
    }

}
