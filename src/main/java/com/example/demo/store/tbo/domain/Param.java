package com.example.demo.store.tbo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor

@Entity
@Getter
public class Param {


    @Id
    @GeneratedValue
    private String Service_Key;

    @Column
    private String api_Kor;

    @Column
    private String des;

    @Column
    private String url;


}
