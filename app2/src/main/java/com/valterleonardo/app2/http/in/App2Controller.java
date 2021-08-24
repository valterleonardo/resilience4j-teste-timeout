package com.valterleonardo.app2.http.in;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app2")
public class App2Controller {

    @GetMapping("/timeout/{delay}")
    public ResponseDto timeout(@PathVariable int delay) throws InterruptedException {
        System.out.println("Recebendo request com "+delay+"ms de delay");
        System.out.println("Iniciando delay");
        int tempo = 0;
        while (tempo < delay){
            Thread.sleep(1000);
            tempo += 1000;
            System.out.println("tempo acumulado= " + tempo);
        }

        System.out.println("Fim do delay");
        System.out.println("Respondendo OK");
        return ResponseDto.builder().resposta("OK").build();
    }
}
