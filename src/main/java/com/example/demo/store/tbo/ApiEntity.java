package com.example.demo.store.tbo;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "API")
public class ApiEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String url;
    private String ServiceKey;
    private String des;
    private String apiKor;

    @Builder
    public ApiEntity(String url, String ServiceKey, String des, String apiKor) {
        this.url = url;
        this.ServiceKey = ServiceKey;
        this.des = des;
        this.apiKor = apiKor;

    }

    // API Class 형태에서 ApiEntity 로 변환
//    sdfdfdfdfdf 여기서 코딩하세용...

}
