package com.example.demo.dto;



import com.example.demo.store.tbo.domain.ParamEntity;
import lombok.Data;

@Data
public class ParamList {

    private String Service_Key;
    private String Api_Kor;
    private String des;
    private String Url;
    private boolean Option;
    private String sample;
    private String api_Eng;

    public ParamEntity toEntity() {
        return ParamEntity.builder()
                .Service_Key(Service_Key)
                .api_Kor(Api_Kor)
                .des(des)
                .url(Url)
                .Option(Option)
                .sample(sample)
                .api_Eng(api_Eng)
                .build();
    }

}