package com.andong.controller;

import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bank")
public class BankController {

    //
    @GetMapping("hello")
    public String sayHello(){
        return "欢迎来到SpringBoot的世界!";
    }
}
