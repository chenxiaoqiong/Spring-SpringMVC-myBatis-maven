package com.candy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <h1> TestController </h1>
 * Created by chenxiaoqiong on 2016/12/22 0022 下午 8:42.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/testApi")
    @ResponseBody
    public String testApi(HttpServletRequest request, HttpServletResponse httpServletResponse){

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
        return "gdsdgs";
    }

}
