package com.candy.service.impl;

import com.candy.mapper.UserMapper;
import com.candy.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <h1> title </h1>
 * Created by chenxiaoqiong on 2017/1/10 0010 上午 10:55.
 */
@Service
public class TestService implements ITestService {

    @Autowired
    private UserMapper userMapper;

    public int test() {
        return userMapper.count();
    }
}
