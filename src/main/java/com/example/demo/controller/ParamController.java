package com.example.demo.controller;


import com.example.demo.store.tbo.domain.Param;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller

@AllArgsConstructor
public class ParamController {

    @RequestMapping("/")
    public String first() {

     Param ParamLIST = new Param();
     ParamLIST.getService_Key();
     ParamLIST.getUrl();
     ParamLIST.getDes();
     ParamLIST.getApi_Kor();



     

     return "start";

    }




}