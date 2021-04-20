package com.example.demo.dto;

import lombok.NoArgsConstructor;




public class ParamList {

    private String Service_Key;
    private String Api_Kor;
    private String des;
    private String Url;

    public String getService_Key() {
        return Service_Key;
    }

    public void setService_Key(String service_Key) {
        Service_Key = service_Key;
    }

    public String getApi_Kor() {
        return Api_Kor;
    }

    public void setApi_Kor(String api_Kor) {
        Api_Kor = api_Kor;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }
}
