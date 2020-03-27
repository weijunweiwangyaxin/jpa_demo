package com.spirng_jpa.jpa_demo.controller;

import com.spirng_jpa.jpa_demo.mapper.JpaDemo;
import com.spirng_jpa.jpa_demo.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:JpaDemo
 * Package:com.spirng_jpa.jpa_demo.controller
 * Description:
 *
 * @Date:2020/2/28 1:20
 * @Author: To change this template use File | Settings |Editor| File and Code Templates.
 */
@RestController
@Api("jpa测试接口")
public class JpaDemoController {

    @Autowired
    private JpaDemo jpaDemo;
    @RequestMapping("jpa")
    @ApiOperation(value = "jpa测试，查询人员信息",notes = "查询人员")
   // @ApiImplicitParam(name = "id",value = "人员id",required = true)
    public List<User> show(){
        /**
         *这是分支2  wei1
         */
        List<User> users = jpaDemo.findAll();
        int a = 3;
        int b = 3;
        int c = 4;
        int wei = 6;
        int e = 11;
        int wei1 = 5;
        int d = 10;
        System.out.println("你好");
        System.out.println("你好");
        return users;
    }
}
