package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.HttpURLConnection;
import java.net.URL;

@RestController
public class ApiPreviewController {

    @RequestMapping(value="/api1Preview",method={RequestMethod.GET,RequestMethod.POST})
    public String callapihttp(){

        StringBuffer result = new StringBuffer();
        try {
            String urlstr = "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?" + "ServiceKey=kxV21DakENMiVpk%2FUBzitxwvTrw%2FJ87QGg0jGFyFGGBgwmF4itvBo3x7ZQNKYXxMgEPhkaqMYu13HqZoCo2C7A%3D%3D" +
                    "&pageNo=1" +
                    "&numOfRows=10" +
                    "&startCreateDt=20200310" +
                    "&endCreateDt=20200311";
            URL url = new URL(urlstr);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");


        }catch(Exception e){
            e.printStackTrace();

        }
        return result.toString();
    }

}
