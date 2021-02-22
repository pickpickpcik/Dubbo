package com.bjpowernode.service.impl;

import com.bjpowernode.domian.User;
import com.bjpowernode.service.UserService;

public class UserServiceImpl implements UserService {
    public User queryById(Integer id) {
        User user=new User();
        user.setId(id);
        user.setName("junjun");
        return user;
    }
}
