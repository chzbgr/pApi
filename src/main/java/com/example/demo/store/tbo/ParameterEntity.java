package com.example.demo.store.tbo;


import com.example.demo.store.tbo.key.ParameterEntityKey;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "PARAMETER_LIST")
@IdClass(ParameterEntityKey.class)
public class ParameterEntity {
    @Id
    @Column(name = "API_ID")
    private String apiId;
    @Id
    @Column(name = "PARAMETER_NAME")
    private String parameterName;

    @Column(name = "PARAMETER_TYPE")
    private String parameterType;
    @Column(name = "PARAMETER_DES")
    private String parameterDes;
    @Column(name = "VALUE_DES")
    private String valueDes;

    @Builder
    public ParameterEntity(String apiId, String parameterName, String parameterType, String parameterDes, String valueDes) {
        this.apiId = apiId;
        this.parameterName = parameterName;
        this.parameterType = parameterType;
        this.parameterDes = parameterDes;
        this.valueDes = valueDes;
    }

}