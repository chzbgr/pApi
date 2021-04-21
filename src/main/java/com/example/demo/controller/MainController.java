package com.example.demo.controller;

import com.example.demo.dto.Parameter;
import com.example.demo.store.repository.ParameterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@Slf4j
public class MainController {

    private final ParameterRepository parameterRepository;

    public MainController(ParameterRepository parameterRepository) {
        this.parameterRepository = parameterRepository;
    }

    @GetMapping("/start")
    public String start() {
        return "start";
    }

    @GetMapping("/api4")
    public String requestForm() {
        return "api4";
    }


    @GetMapping("/")
    public String list(Model model) {


        Parameter parameter1 = new Parameter();
        parameter1.setNameEng("START_INDEX");
        parameter1.setDes("정수 입력(페이징 시작번호입니다: 데이터행 시작번호)");
        parameter1.setId("api_4");
        parameter1.setNameKor("요청시작위치");
        parameter1.setType("INTEGER(필수)");
        parameterRepository.save(parameter1.toEntity());


        Parameter parameter2 = new Parameter();
        parameter2.setType("INTEGER(필수)");
        parameter2.setId("api_4");
        parameter2.setDes("정수 입력(페이징 끝번호 입니다: 데이터행 끝번호)");
        parameter2.setNameEng("END_INDEX");
        parameter2.setNameKor("요청종료위치");
        parameterRepository.save(parameter2.toEntity());


        Parameter parameter3 = new Parameter();
        parameter3.setNameKor("노출여부");
        parameter3.setDes("");
        parameter3.setType("STRING(선택)");
        parameter3.setId("api_4");
        parameter3.setNameEng("CORONA19_DISPLAY_YN");
        parameterRepository.save(parameter3.toEntity());

        List<Parameter> parameters = new ArrayList<>();
        parameters.add(parameter1);
        parameters.add(parameter2);
        parameters.add(parameter3);
        log.info(parameters.toString());

        model.addAttribute("parameters", parameters);

        return "list";

    }

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
