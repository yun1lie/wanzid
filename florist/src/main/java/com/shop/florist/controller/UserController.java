package com.shop.florist.controller;

import com.shop.florist.mapper.UserMapper;

import com.shop.florist.entity.User;
import com.shop.florist.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user") // 统一给接口加前缀
public class UserController {
    @Autowired //注入其他类注解
    private UserMapper userMapper;

    @Autowired
    private UserService userService;


    @PostMapping("/save")
    public Integer save(@RequestBody User user) {
        return userService.save(user); // 新增或者更新
    }

    // 查询
    @GetMapping("/")
    public List<User> index() {
        User user = new User();
        return userMapper.findAll();
    }
}
