package com.example.demo.dto;

import com.example.demo.store.tbo.ParameterEntity;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;


@Data
public class ParameterList {
    private String apiId;
    private String parameterName;
    private String parameterType;
    private String parameterDes;
    private String valueDes;

    public ParameterEntity toEntity() {
        return ParameterEntity.builder()
                .apiId(apiId)
                .parameterName(parameterName)
                .parameterType(parameterType)
                .parameterDes(parameterDes)
                .valueDes(valueDes)
                .build();
    }
}

//class getPar {
//}
//
//class setPar {
//}



