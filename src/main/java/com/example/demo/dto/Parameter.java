package com.example.demo.dto;

import com.example.demo.store.tbo.ParameterEntity;
import lombok.Data;


@Data
public class Parameter {
    private String id;
    private String NameEng;
    private String NameKor;
    private String type;
    private String des;

    public ParameterEntity toEntity() {
        return ParameterEntity.builder()
                .id(id)
                .NameEng(NameEng)
                .NameKor(NameKor)
                .type(type)
                .des(des)
                .build();
    }
}

//class getPar {
//}
//
//class setPar {
//}



