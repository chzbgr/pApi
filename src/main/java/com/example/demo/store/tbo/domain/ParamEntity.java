package com.example.demo.store.tbo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity
@Getter

public class ParamEntity {


    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String Service_Key;

    @Column
    private String api_Kor;

    @Column
    private String des;

    @Column
    private String url;

    @Column
    private Boolean Option;

    @Column
    private String sample;

    @Column
    private String api_Eng;
    @Builder
    public ParamEntity(String Service_Key, String api_Kor , String des, String url,Boolean Option,String sample,String api_Eng){
        this.Service_Key=Service_Key;
        this.api_Kor=api_Kor;
        this.des=des;
        this.url=url;
        this.Option=Option;
        this.sample=sample;
        this.api_Eng=api_Eng;
    }
}
