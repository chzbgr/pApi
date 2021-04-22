package com.example.demo.controller;

import com.example.demo.dto.RequestRes4;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class RequestController {


    @PostMapping("/api4/request")
    public String requestForm(String START_INDEX, String END_INDEX, String CORONA19_DISPLAY_YN) {

        StringBuilder urlBuilder = new StringBuilder("http://openapi.seoul.go.kr:8088/544c6f5a70657a6f3131306c486f6265/json/Corona19Status");
        urlBuilder.append("/"+START_INDEX);
        urlBuilder.append("/"+END_INDEX);
        if (CORONA19_DISPLAY_YN != ""){
            urlBuilder.append("/"+CORONA19_DISPLAY_YN);
        }
        log.info(urlBuilder.toString());


        return "";
    }


}
