package com.candy.mapper;

import com.candy.model.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * <h1> title </h1>
 * Created by chenxiaoqiong on 2017/4/6 0006 上午 11:24.
 */
@Component("userMapper")
public interface UserMapper {
    int count();

    String getNameById(@Param(value = "id") Long id);

    User getUser(@Param(value = "id") Long id);
}
