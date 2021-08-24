package com.valterleonardo.app1.http.out.app2.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class App2Response implements Serializable {

    @JsonProperty("resposta")
    private String resposta;
}
