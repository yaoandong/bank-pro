package com.andong.controller;

import com.andong.entity.PaymentDo;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bank")
@Api(tags="BankPro项目")
public class BankController {

    @Autowired
    private PaymentDo paymentDo;


    // 初始化一个项目
    @GetMapping("hello")
    @ApiOperation(value="初始化项目")
    public String sayHello(){
        return "欢迎来到SpringBoot的世界!";
    }

    // 读取配置文件
    @GetMapping("readNum")
    @ApiOperation(value="读取配置文件")
    public String readNum(){
        return String.format("单笔支付金额：%d,每日支付限额：%d",paymentDo.getMaxAmountPerDeal(),paymentDo.getMaxAmountTotal());
    }
}
