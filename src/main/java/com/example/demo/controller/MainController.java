package com.example.demo.controller;


import com.example.demo.dto.ApiList;
import com.example.demo.dto.ParameterList;
import com.example.demo.store.repository.ApiRepository;
import com.example.demo.store.repository.ParameterRepository;
import com.example.demo.store.tbo.ApiEntity;
import com.example.demo.store.tbo.ParameterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
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

    @RequestMapping(value = "/apitest")
    public String start(Model model) {

        List<ApiEntity> entityList = apiRepository.findAll();
        List<ApiList> apiList = new ArrayList<>();

        for (ApiEntity row: entityList) {
            ApiList api = new ApiList();
            api.setApiId(row.getApiId());

            api.setApiUrl(row.getApiUrl());
            api.setServiceKey(row.getServiceKey());
            api.setApiKor(row.getApiKor());
            apiList.add(api);
        }
        model.addAttribute("apiRepository", apiList);
        return "start.html";
    }

//    @RequestMapping(value = "/API5")
//    public String api5(Model model) {
//
//        System.out.println(parameterRepository.findAll());
//
//        ParameterList parameter1 = new ParameterList();
//        parameter1.setId("API_5");
//        parameter1.setNameEng("START_INDEX");
//        parameter1.setNameKor("요청시작위치");
//        parameter1.setType("INTEGER(필수)");
//        parameter1.setDes("정수 입력 (페이징 시작번호 입니다 : 데이터 행 시작번호)");
//        parameterRepository.save(parameter1.toEntity());
//
//        ParameterList parameter2 = new ParameterList();
//        parameter2.setId("API_5");
//        parameter2.setNameEng("END_INDEX");
//        parameter2.setNameKor("요청종료위치");
//        parameter2.setType("INTEGER(필수)");
//        parameter2.setDes("정수 입력 (페이징 끝번호 입니다 : 데이터 행 끝번호)");
//        parameterRepository.save(parameter2.toEntity());
////
////        // TODO 1. Model Input Data(model.addAttribute)
////        // TODO 2. return HTML :: #result_data
////
//        List<ParameterList> parameters = new ArrayList<>();
//        parameters.add(parameter1);
//        parameters.add(parameter2);
//        model.addAttribute("parameters", parameters);
//
//
//        return "API5.html";
//        apiRepository.
//        Entity OneToMany;

//        1. 화면에 뿌려주삼
//    }
//
//    @GetMapping(value = "/API5/get", produces = {MediaType.APPLICATION_JSON_VALUE})
//    @ResponseBody
//    public List<ParameterEntity> getlist() {
//        return parameterRepository.findAll();
//    }
}

