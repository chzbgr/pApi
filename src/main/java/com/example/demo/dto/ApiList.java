package com.example.demo.dto;

import com.example.demo.store.tbo.domain.ApiListEntity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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




