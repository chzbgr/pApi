package com.example.demo.controller;


import com.example.demo.dto.Api;
import com.example.demo.dto.Parameter;
import com.example.demo.store.repository.ApiRepository;
import com.example.demo.store.repository.ParameterRepository;
import com.example.demo.store.tbo.ParameterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    private ApiRepository apiRepository;
    @Autowired
    private ParameterRepository parameterRepository;

    @RequestMapping(value = "/")
    public String start() {
//      ApiEntity가 아닌 dto의 API로 생성한다음 save해야 한다!
        Api api5_list = new Api();
        api5_list.setId("API_5");
        api5_list.setApiKor("서울특별시 코로나19 백신 예방접종 현황");
        api5_list.setDes("서울시 기준의 코로나19 백신 접종자 관련 정보 현황");
        api5_list.setServiceKey("6f6a4a6747716c7337326b67596165");
        api5_list.setUrl("http://openapi.seoul.go.kr:8088/6f6a4a6747716c7337326b67596165/json/TbCorona19Vaccinestat");
        apiRepository.save(api5_list.toEntity());


        /* TODO
        API api = new API();
        api.set
        1. Antity -> ??? API 인스턴스 생성 데이터 세팅!!!
        2. List<API> api = new ArrayList<>();
        3. data -> 화면에다가 넘겨주셈!
        4.  Model, ModelAndView 이 클래스가 있음... 이거 검색해서 하셈 ㅇㅋ? RestController 로 할건지 Controller 할건지 정하셈 ㅇㅋ? ㅇㅋ
        */
        return "start.html";
    }

    @RequestMapping(value = "/API5")
    public String api5(Model model) {
        Parameter parameter1 = new Parameter();
        parameter1.setId("API_5");
        parameter1.setNameEng("START_INDEX");
        parameter1.setNameKor("요청시작위치");
        parameter1.setType("INTEGER(필수)");
        parameter1.setDes("정수 입력 (페이징 시작번호 입니다 : 데이터 행 시작번호)");
        parameterRepository.save(parameter1.toEntity());

        Parameter parameter2 = new Parameter();
        parameter2.setId("API_5");
        parameter2.setNameEng("END_INDEX");
        parameter2.setNameKor("요청종료위치");
        parameter2.setType("INTEGER(필수)");
        parameter2.setDes("정수 입력 (페이징 끝번호 입니다 : 데이터 행 끝번호)");
        parameterRepository.save(parameter2.toEntity());

        // TODO 1. Model Input Data(model.addAttribute)
        // TODO 2. return HTML :: #result_data

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(parameter1);
        parameters.add(parameter2);
        model.addAttribute("parameters", parameters);


        return "API5.html";
//        apiRepository.
//        Entity OneToMany;

//        1. 화면에 뿌려주삼
    }

    @GetMapping(value = "/API5/get", produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public List<ParameterEntity> getlist() {
        return parameterRepository.findAll();
    }
}

