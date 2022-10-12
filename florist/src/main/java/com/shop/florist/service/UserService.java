package com.shop.florist.service;


import com.shop.florist.entity.User;
import com.shop.florist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public int save(User user) {
        if(user.getId() == null){
            return userMapper.insert(user);
        }else{
            // user没有id新增，否则为更新
            return userMapper.update(user);
        }
    }

}
