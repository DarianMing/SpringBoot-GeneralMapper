package com.li.generalmapper.mapper;

import com.li.generalmapper.Model.MyMapper;
import com.li.generalmapper.Model.User;

import org.apache.ibatis.annotations.Select;


public interface UserMapper extends MyMapper<User> {
    @Select("select * from users where id=#{id}")
    User findByid (int id);
}
