package com.example.demo.dto;


import com.example.demo.store.tbo.ApiEntity;
import lombok.Data;

import java.util.List;

@Data
public class ApiList {
    private String apiId;
    private String apiUrl;
    private String serviceKey;
    private String apiKor;
    private List<Object> resultApi;
    private List<ParameterList> listPar;

    public ApiEntity toEntity() {
        return ApiEntity.builder()
                .apiId(apiId)
                .apiUrl(apiUrl)
                .serviceKey(serviceKey)
                .apiKor(apiKor)
                .build();
    }

}


