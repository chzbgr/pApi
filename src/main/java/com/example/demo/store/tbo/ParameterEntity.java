package com.example.demo.store.tbo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_parameter")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ParameterEntity {

    @Id
    private String nameEng;
    private String id;

    @Column
    private String nameKor;
    private String type;
    private String des;

}
