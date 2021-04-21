package com.example.demo.controller;




import com.example.demo.dto.ParamList;
import com.example.demo.store.repository.ParamRepository;
import com.example.demo.store.tbo.domain.ParamEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;


@Controller

@AllArgsConstructor
public class ParamController {


    private ParamRepository paramRepository;

    @RequestMapping("/")
    public String first() {

        ParamList apiparam1 = new ParamList();
        apiparam1.setApi_Kor("보건복지부_코로나19 감염_현황");
        apiparam1.setDes("코로나19감염증으로 인한 일별 확진자,완치자,지료중인환자,사망자등에 대한 현황자");
        apiparam1.setService_Key("kxV21DakENMiVpk%2FUBzitxwvTrw%2FJ87QGg0jGFyFGGBgwmF4itvBo3x7ZQNKYXxMgEPhkaqMYu13HqZoCo2C7A%3D%3D");
        apiparam1.setUrl("https://www.data.go.kr/data/15043376/openapi.do");

        paramRepository.save(apiparam1.toEntity());

        return "start";
    }

    @RequestMapping("test2")
    public String list(Model model){

    ParamEntity parameters1 = new ParamEntity();
    parameters1.setApi_Kor("서비스키");
    parameters1.setApi_Eng("ServiceKey");
    parameters1.setOption(true);
    parameters1.setSample("-");
    parameters1.setDes("공공포털에서 받은 인증키");

    ParamEntity parameters2 = new ParamEntity();
    parameters2.setApi_Kor("페이지 번호");
    parameters2.setApi_Eng("pageNo");
    parameters2.setOption(false);
    parameters2.setSample("1");
    parameters2.setDes("페이지번호");

    ParamEntity parameters3 = new ParamEntity();
    parameters3.setApi_Kor("한 페이지 결과 수");
    parameters3.setApi_Eng("numofRows");
    parameters3.setOption(false);
    parameters3.setSample("10");
    parameters3.setDes("한 페이지 결과 수");

    ParamEntity parameters4 = new ParamEntity();
    parameters4.setApi_Kor("데이터 생성일 시작범위");
    parameters4.setApi_Eng("startCreateDt");
    parameters4.setOption(false);
    parameters4.setSample("20200310");
    parameters4.setDes("검색할 생성일 범위의 시작");

    ParamEntity parameters5 = new ParamEntity();
    parameters5.setApi_Kor("데이터 생성일 종료범위");
    parameters5.setApi_Eng("endCreateDt");
    parameters5.setOption(false);
    parameters5.setSample("20200315");
    parameters5.setDes("검색할 생성일 범위의 종료");

    List<ParamEntity> parameters = new ArrayList<>();
    parameters.add(parameters1);
    parameters.add(parameters2);
    parameters.add(parameters3);
    parameters.add(parameters4);
    parameters.add(parameters5);

    model.addAttribute("parameters",parameters);

    return "test2";
    }


}