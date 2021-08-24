package com.valterleonardo.app1.http.in;

import com.valterleonardo.app1.core.ports.RestApp2Interface;
import com.valterleonardo.app1.http.out.app2.dto.App2Resquest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app1")
public class App1Controller {

    @Autowired
    RestApp2Interface restApp2Interface;

    public static final String TIMEOUT_20 = "/timeout/{delay}";

    @GetMapping(TIMEOUT_20)
    public String timeout20(@PathVariable int delay) throws Exception {
        return restApp2Interface.processar(App2Resquest.builder().delay(delay).build()).toString();
    }
}
