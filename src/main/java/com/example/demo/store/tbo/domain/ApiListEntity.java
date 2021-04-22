package com.example.demo.store.tbo.domain;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Data
@Entity
@Getter
@Table(name="API_LIST")
public class ApiListEntity {

    @Id
    @Column(name = "API_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String apiId;

    @Column(name = "API_URL")
    private String apiUrl;

    @Column(name = "SERVICE_KEY")
    private String serviceKey;

    @Column(name = "API_KOR")
    private String apiKor;

    @Builder
    public ApiListEntity(String apiId, String apiUrl,String serviceKey,String apiKor){
        this.apiId =apiId;
        this.apiUrl=apiUrl;
        this.serviceKey=serviceKey;
        this.apiKor=apiKor;
    }
}

