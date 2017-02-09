package com.candy.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1> title </h1>
 * Created by chenxiaoqiong on 2017/1/6 0006 上午 11:04.
 */
public class Test {
    public static void main(String[] arg){
        List<Long> idList = new ArrayList<Long>();
        update(idList);
        System.out.println(idList);
    }
    public static void update(List<Long> idList){
        for(int i=0;i<10;i++) {
            idList.add(Long.valueOf(i));
        }
    }
}
