package com.valterleonardo.app1.http.out.app2.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class App2Resquest {
    private int delay;
}
