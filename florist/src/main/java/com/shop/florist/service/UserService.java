package com.shop.florist.service;


import com.shop.florist.entity.User;
import com.shop.florist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int save(User user) {
        if (user.getId() == null) {
            return userMapper.insert(user);
        } else {
            // user没有id新增，否则为更新
            return userMapper.update(user);
        }
    }

    public boolean userLogin(User user) {
        List<User> userList = userMapper.selectByName(user);
        if (userList.size() > 0) {
            User dataUser = userList.get(0);
            if (dataUser.getUsername().equals(user.getUsername()) && dataUser.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
