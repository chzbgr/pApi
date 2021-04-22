package com.example.demo.dto;

import com.example.demo.store.tbo.domain.ApiListEntity;
import com.example.demo.store.tbo.domain.ParameterListEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
public class ApiList {

    private String apiId;
    private String apiUrl;
    private String serviceKey;
    private String apiKor;

    public ApiListEntity toEntity(){
        return ApiListEntity.builder()
                .apiId(apiId)
                .apiUrl(apiUrl)
                .serviceKey(serviceKey)
                .apiKor(apiKor)
                .build();
        }
    }




