package com.example.demo.dto;

import com.example.demo.store.tbo.ParameterEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.lang.reflect.ParameterizedType;


@Data
public class Parameter {
    private String parameterName;
    private String apiId;
    private String parameterDes;
    private String parameterType;
    private String valueDes;

    @Builder
    public ParameterEntity toEntity() {
        return ParameterEntity.builder()
                .parameterName(parameterName)
                .apiId(apiId)
                .parameterDes(parameterDes)
                .parameterType(parameterType)
                .valueDes(valueDes)
                .build();
    }
}
