package com.example.demo.store.tbo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "API_LIST")
@Getter
@AllArgsConstructor
@NoArgsConstructor
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

}
