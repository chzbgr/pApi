package com.example.demo.controller;


import com.example.demo.dto.API;
import com.example.demo.dto.Parameter;
import com.example.demo.store.repository.ApiRepository;
import com.example.demo.store.tbo.ApiEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class MainController {

    @Autowired
    private ApiRepository apiRepository;

    @RequestMapping(value = "/")
    public String start() {
        API api5_list = new API();
        api5_list.setApiKor("서울특별시 코로나19 백신 예방접종 현황");
        api5_list.setDes("서울시 기준의 코로나19 백신 접종자 관련 정보 현황");
        api5_list.setServiceKey("6f6a4a6747716c7337326b67596165");
        api5_list.setUrl("http://openapi.seoul.go.kr:8088/6f6a4a6747716c7337326b67596165/json/TbCorona19Vaccinestat");
//        apiRepository.save(api5_list);

//        API api = new API();
//        api.set

//        1. Antity -> ??? API 인스턴스 생성 데이터 세팅!!!
//        2. List<API> api = new ArrayList<>();
//        3. data -> 화면에다가 넘겨주셈!
//        4.  Model, ModelAndView 이 클래스가 있음... 이거 검색해서 하셈 ㅇㅋ? RestController 로 할건지 Controller 할건지 정하셈 ㅇㅋ? ㅇㅋ
        System.out.println(apiRepository.findAll());
        return "start.html";
    }

    @RequestMapping(value = "/API5")
    public String api5() {
//        apiRepository.
//        Entity OneToMany;

//        1. 화면에 뿌려주삼
        return "API5.html";
    }
}
