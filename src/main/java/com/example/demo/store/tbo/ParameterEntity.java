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
    private String apiId;
    @Id
    private String parameterName;

    @Column
    private String parameterType;
    private String parameterDes;
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