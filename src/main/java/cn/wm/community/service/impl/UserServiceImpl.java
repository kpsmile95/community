package cn.wm.community.service.impl;

import cn.wm.community.mapper.UserMapper;
import cn.wm.community.model.User;
import cn.wm.community.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createOrUpdate(User user) {
        userMapper.insertUser(user);
    }
}
