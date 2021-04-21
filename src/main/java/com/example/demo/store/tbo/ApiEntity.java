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
@Table(name = "tbl_api")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApiEntity {

    @Id
    private String id;

    @Column
    private String url;
    private String serviceKey;
    private String des;
    private String apiKor;


}
