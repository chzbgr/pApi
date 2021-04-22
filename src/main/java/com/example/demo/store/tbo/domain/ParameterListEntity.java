package com.example.demo.store.tbo.domain;

import com.example.demo.store.tbo.domain.key.ParameterEntityKey;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity

@IdClass(ParameterEntityKey.class)
public class ParameterListEntity {

    @Id
    @GeneratedValue
    private String apiId;
    @Id
    private String parameterName;

    @Column
    private String parameterType;

    @Column
    private String parameterDes;

    @Column
    private String valueDes;


    @Builder
    public ParameterListEntity(String apiId, String parameterName, String parameterType, String parameterDes,String valueDes){
        this.apiId=apiId;
        this.parameterName=parameterName;
        this.parameterType=parameterType;
        this.parameterDes=parameterDes;
        this.valueDes=valueDes;

    }


}
