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
@Table(name = "API")
public class ApiEntity {
    @Id
    private String id;

    @Column
    private String url;
    private String ServiceKey;
    private String des;
    private String apiKor;

    @Builder
    public ApiEntity(String id, String url, String ServiceKey, String des, String apiKor) {
        this.id = id;
        this.url = url;
        this.ServiceKey = ServiceKey;
        this.des = des;
        this.apiKor = apiKor;
    }

    // API Class 형태에서 ApiEntity 로 변환
//    sdfdfdfdfdf 여기서 코딩하세용...

}
