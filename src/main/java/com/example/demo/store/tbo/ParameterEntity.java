package com.example.demo.store.tbo;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Parameter")
public class ParameterEntity {
    @Id
    private String NameEng;
    private String id;

    @Column
    private String NameKor;
    private String type;
    private String des;


    @Builder
    public ParameterEntity(String id, String NameEng, String NameKor, String type, String des) {
        this.id = id;
        this.NameEng = NameEng;
        this.NameKor = NameKor;
        this.type = type;
        this.des = des;
    }

}