package com.example.demo.controller;

import com.example.demo.dto.ApiList;
import com.example.demo.dto.ParamList;
import com.example.demo.store.repository.ApiRepository;
import com.example.demo.store.repository.ParamRepository;
import com.example.demo.store.tbo.domain.ApiListEntity;
import com.example.demo.store.tbo.domain.ParameterListEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ApiController {

    @Autowired
    private ApiRepository apiRepository;
    @Autowired
    private ParamRepository paramRepository;

    @RequestMapping("/")
    public String hello(Model model){

        List<ApiListEntity> apiList1 = apiRepository.findAll();
        List<ApiList> apilist = new ArrayList<>();

        for(ApiListEntity row : apiList1){
            ApiList apiList = new ApiList();
            apiList.setApiId(row.getApiId());
            apiList.setApiUrl(row.getApiUrl());
            apiList.setServiceKey(row.getServiceKey());
            apiList.setApiKor(row.getApiKor());
            apilist.add(apiList);
        }
        model.addAttribute("apilist",apilist);
        return "api.html";
     }

    @GetMapping("/test2")
    public String hello2(Model model){
      // if api.html에서 버튼을 눌럿을때 날라온 id값에 따라 보여주는 로직

        List<ParameterListEntity> paramlist1 = paramRepository.findAll();
        List<ParamList> paramlist = new ArrayList<>();

        for(ParameterListEntity row : paramlist1){
            ParamList params = new ParamList();
            params.setApiId(params.getApiId());
            params.setParameterName(params.getParameterName());
            params.setParameterType(params.getParameterType());
            params.setParameterDes(params.getParameterDes());
            params.setValueDes(params.getValueDes());
            paramlist.add(params);
        }
        model.addAttribute("paramlist",paramlist);
        return "test2.html";
    }
}




