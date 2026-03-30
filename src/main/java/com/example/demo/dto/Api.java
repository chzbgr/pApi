package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Api {

    private String apiId;
    private String apiKor;
    private String serviceKey;
    private String apiUrl;
    private List<Object> resultApi;
    private List<Parameter> listPar;

}
