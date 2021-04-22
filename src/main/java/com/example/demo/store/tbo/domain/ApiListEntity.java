package com.example.demo.store.tbo.domain;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Data
@Entity(name = "API_LIST")
@Getter
@Table
public class ApiListEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String apiId;

    @Column
    private String apiUrl;

    @Column
    private String serviceKey;

    @Column
    private String apiKor;

    @Builder
    public ApiListEntity(String apiId, String apiUrl,String serviceKey,String apiKor){
        this.apiId =apiId;
        this.apiUrl=apiUrl;
        this.serviceKey=serviceKey;
        this.apiKor=apiKor;
    }
}

