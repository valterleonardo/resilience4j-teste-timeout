package com.valterleonardo.app2.http.in;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ResponseDto {
    private String resposta;
}
