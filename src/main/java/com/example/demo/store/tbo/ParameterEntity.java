package com.example.demo.store.tbo;

import com.example.demo.store.tbo.key.ParameterEntityKey;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "PARAMETER_LIST")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ParameterEntityKey.class)
public class ParameterEntity {

    @Id
    @Column(name = "PARAMETER_NAME")
    private String parameterName;
    @Id
    @Column(name = "API_ID")
    private String apiId;

    @Column(name = "PARAMETER_DES")
    private String parameterDes;
    @Column(name = "PARAMETER_TYPE")
    private String parameterType;
    @Column(name = "VALUE_DES")
    private String valueDes;


}
