package com.valterleonardo.app1.http.out.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

public abstract class AbstractHttpGetClient<RequestType, ResponseType, Configuration extends HttpConfiguration> {

    @Autowired private RestTemplate restTemplate;
    @Autowired protected Configuration configuration;

    protected <T> ResponseEntity<T> getRequest(Class<T> responseTypeClass) throws Exception {
        try{
            HttpEntity requestEntity = new HttpEntity(configuration.buildAuth());
            ResponseEntity<T> response =
                    restTemplate.exchange(
                            configuration.getUrl(),
                            HttpMethod.GET,
                            requestEntity,
                            responseTypeClass);
            return response;
        } catch (HttpClientErrorException | HttpServerErrorException e){
            System.out.println(configuration.getServiceName() + "/(" + e.getStatusCode()+")");
            throw new Exception(e.getMessage());
        } catch (Exception e){
            System.out.println(configuration.getServiceName() + "/(" + e.getMessage() +")");
            throw new Exception(e.getMessage());
        }
    }
}
