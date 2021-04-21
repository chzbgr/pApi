package com.example.demo.dto;

import com.example.demo.store.tbo.ParameterEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.ParameterizedType;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Parameter {
    private String nameKor;
    private String nameEng;
    private String des;
    private String type;
    private String id;

    public ParameterEntity toEntity() {
        return ParameterEntity.builder()
                .nameEng(nameEng)
                .nameKor(nameKor)
                .type(type)
                .des(des)
                .id(id)
                .build();
    }
}
