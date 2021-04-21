package com.example.demo.controller;

import com.example.demo.dto.api1SaveRequestDto;
import com.example.demo.store.repository.Api1Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiResController {

    private Api1Repository api1Repository;

    @GetMapping("api1")
    public String apires() {


        return "hio";
    }

    // api1 포스트 매핑 시 레퍼지토리에 내용 저장
    @PostMapping("api1")
    public void saveApi1(@RequestBody api1SaveRequestDto dto){
        api1Repository.save(dto.toEntity());
    }

}


