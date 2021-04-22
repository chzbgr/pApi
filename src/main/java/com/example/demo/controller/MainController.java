package com.example.demo.controller;

import com.example.demo.dto.Api;
import com.example.demo.dto.Parameter;
import com.example.demo.store.repository.ApiRepository;
import com.example.demo.store.repository.ParameterRepository;
import com.example.demo.store.tbo.ApiEntity;
import com.example.demo.store.tbo.ParameterEntity;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class MainController {

    @Autowired
    private ApiRepository apiRepository;

    @Autowired
    private ParameterRepository parameterRepository;

    @GetMapping("/start")
    public String start(Model model) {

        List<ApiEntity> apis = apiRepository.findAll();
        List<Api> apiList = new ArrayList<>();

        for (int i=0; i<apis.size(); i++){
            Api api = new Api();
            api.setApiId(apis.get(i).getApiId());
            api.setApiKor(apis.get(i).getApiKor());
            api.setApiUrl(apis.get(i).getApiUrl());
            api.setApiUrl(apis.get(i).getServiceKey());
            apiList.add(api);
        }
        log.info(apiList.toString());
        model.addAttribute("apiList", apiList);
        return "main";
    }

    @PostMapping("/api")
    @ResponseBody
    public String request(@RequestParam("apiId") String apiId, Model model) {
        System.out.println(apiId);
//        ModelAndView mav = new ModelAndView();

        List<ParameterEntity> parameterEntityList = parameterRepository.findAllByApiId(apiId);
        List<Parameter> parameterList = new ArrayList<>();

        for (ParameterEntity entityParameter : parameterEntityList) {
            Parameter dtoParameter = new Parameter();
            dtoParameter.setApiId(entityParameter.getApiId());
            dtoParameter.setParameterName(entityParameter.getParameterName());
            dtoParameter.setParameterDes(entityParameter.getParameterDes());
            dtoParameter.setParameterType(entityParameter.getParameterType());
            dtoParameter.setValueDes(entityParameter.getValueDes());
            parameterList.add(dtoParameter);
        }



        //model.addAttribute("data", parameterList);
    //        mav.addObject("parameterList", parameterList);
//        mav.setViewName("api4");
//        mav.addAttribute("parameterList", parameterList);

        return "start";
    }




//    @GetMapping("/api4")
//    public String list(Model model) {
//
//
//        Parameter parameter1 = new Parameter();
//        parameter1.setNameEng("START_INDEX");
//        parameter1.setDes("정수 입력(페이징 시작번호입니다: 데이터행 시작번호)");
//        parameter1.setId("api_4");
//        parameter1.setNameKor("요청시작위치");
//        parameter1.setType("INTEGER(필수)");
////        parameterRepository.save(parameter1.toEntity());
//
//
//        Parameter parameter2 = new Parameter();
//        parameter2.setType("INTEGER(필수)");
//        parameter2.setId("api_4");
//        parameter2.setDes("정수 입력(페이징 끝번호 입니다: 데이터행 끝번호)");
//        parameter2.setNameEng("END_INDEX");
//        parameter2.setNameKor("요청종료위치");
////        parameterRepository.save(parameter2.toEntity());
//
//
//        Parameter parameter3 = new Parameter();
//        parameter3.setNameKor("노출여부");
//        parameter3.setDes("");
//        parameter3.setType("STRING(선택)");
//        parameter3.setId("api_4");
//        parameter3.setNameEng("CORONA19_DISPLAY_YN");
////        parameterRepository.save(parameter3.toEntity());
//
//        List<Parameter> parameters = new ArrayList<>();
//        parameters.add(parameter1);
//        parameters.add(parameter2);
//        parameters.add(parameter3);
//        log.info(parameters.toString());
//
//        model.addAttribute("parameters", parameters);
//
//        return "api4";
//
//    }


/*




    private final ApiRepository apiRepository;

    public MainController(ApiRepository apiRepository) {
        this.apiRepository = apiRepository;
    }

    @RequestMapping("/start")
    public String start(){
        return "start";
    }

    @RequestMapping("/start/Api4")
    public String Api4(){return "Api4";}


*/
}
