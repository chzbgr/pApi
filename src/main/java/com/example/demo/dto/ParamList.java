package com.example.demo.dto;


import com.example.demo.store.tbo.domain.ApiListEntity;
import com.example.demo.store.tbo.domain.ParameterListEntity;
import lombok.Data;

import javax.persistence.Column;

@Data
public class ParamList {

    private String apiId;
    private String parameterName;
    private String parameterType;
    private String parameterDes;
    private String valueDes;

    public ParameterListEntity toEntity() {
        return ParameterListEntity.builder()
                .apiId(apiId)
                .parameterName(parameterName)
                .parameterType(parameterType)
                .parameterDes(parameterDes)
                .valueDes(valueDes)
                .build();
    }

}