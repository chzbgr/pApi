package com.example.demo.store.tbo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@NoArgsConstructor
@Table(name = "API_LIST")
public class ApiEntity {
    @Id
    @Column(name = "API_ID")
    private String apiId;

    @Column(name = "API_URL")
    private String apiUrl;
    @Column(name = "SERVICE_KEY")
    private String serviceKey;
    @Column(name = "API_KOR")
    private String apiKor;

    @Builder
    public ApiEntity(String apiId, String apiUrl, String serviceKey, String apiKor) {
        this.apiId = apiId;
        this.apiUrl = apiUrl;
        this.serviceKey = serviceKey;
        this.apiKor = apiKor;
    }

}
