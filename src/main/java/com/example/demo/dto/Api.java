package com.example.demo.dto;


import com.example.demo.store.tbo.ApiEntity;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.List;

@Data
public class Api {
    private String id;
    private String serviceKey;
    private String apiKor;
    private String des;
    private String url;
    private List<Object> resultApi;
    private List<Parameter> listPar;

    public ApiEntity toEntity() {
        return ApiEntity.builder()
                .id(id)
                .ServiceKey(serviceKey)
                .apiKor(apiKor)
                .des(des)
                .url(url)
                .build();

    }

//    public APIEntity toEntity() {
//        API api = new API();
//        BeanUtils.copyProperties(this, api);
//        return api;
//    }
}

//class getList {
//}
//
//class setList {
//}
//
//class callApi {
//}
//
//class showPreview {
//}
//
//class getListPar {
//}

