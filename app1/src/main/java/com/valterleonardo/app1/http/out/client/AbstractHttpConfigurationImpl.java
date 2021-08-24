package com.valterleonardo.app1.http.out.client;

public abstract class AbstractHttpConfigurationImpl {
    protected String serviceName;
    protected String url;

    public String getUrl(){
        return url;
    }

    public String getServiceName(){
        return serviceName;
    }

    protected abstract void setServiceName();
}
