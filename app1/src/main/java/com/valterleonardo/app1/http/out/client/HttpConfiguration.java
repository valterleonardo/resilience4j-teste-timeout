package com.valterleonardo.app1.http.out.client;

import org.springframework.http.HttpHeaders;

public interface HttpConfiguration {
    HttpHeaders buildAuth();
    String getUrl();
    String getServiceName();
}
