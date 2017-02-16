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

    @RequestMapping(value = "/ip")
    @ResponseBody
    public String testApi(HttpServletRequest request, HttpServletResponse httpServletResponse){

        return getIP(request);
    }

    public static String getIP(HttpServletRequest request) {
        String sip = "";
        sip = request.getHeader("x-forwarded-for");
        if (sip == null || sip.length() == 0 || "unknown".equalsIgnoreCase(sip)) {
            sip = request.getHeader("proxy-Client-IP");
        }

        if (sip == null || sip.length() == 0 || "unknown".equalsIgnoreCase(sip)) {
            sip = request.getHeader("WL-Proxy-Client-IP");
        }

        if (sip == null || sip.length() == 0 || "unknown".equalsIgnoreCase(sip)) {
            sip = request.getRemoteAddr();
        }

        return sip;
    }

    private void testGit(){
        System.out.println("testGit");
        System.out.println("test1");
        System.out.println("test2");
    }
}
