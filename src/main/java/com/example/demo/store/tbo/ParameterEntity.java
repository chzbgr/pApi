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
    private String parameterName;
    @Id
    private String apiId;

    @Column
    private String parameterDes;
    private String parameterType;
    private String valueDes;


}
