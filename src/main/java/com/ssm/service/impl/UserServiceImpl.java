package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public Object queryAll() {
        return userMapper.selectUsersOrders();
    }
}
