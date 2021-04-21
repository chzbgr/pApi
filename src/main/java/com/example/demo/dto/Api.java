package com.example.demo.dto;


import com.example.demo.store.tbo.ApiEntity;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class Api {
    private String serviceKey;
    private String apiKor;
    private String des;
    private String url;

    public ApiEntity toEntity() {
        return ApiEntity.builder()
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
