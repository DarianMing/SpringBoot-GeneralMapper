package com.li.generalmapper.service;

import com.li.generalmapper.Model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    User selectByKey(int id);
}
