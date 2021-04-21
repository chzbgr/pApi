package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Api {

    private String id;
    private String name;
    private String serviceKey;
    private String url;
    private String des;
    private List<Object> resultApi;
    private List<Parameter> listPar;

}
