package com.example.demo.store.tbo;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Parameter")
public class ParameterEntity {
    @Id
    private Long id;
    private String NameEng;

    @Column
    private String NameKor;
    private String type;
    private String des;

}