package com.li.generalmapper.service.impl;

import com.li.generalmapper.Model.User;
import com.li.generalmapper.mapper.UserMapper;
import com.li.generalmapper.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.selectAll();
    }

    @Override
    public User selectByKey(int id) {
        return userMapper.findByid(id);
    }
}
