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

    //删除
    @DeleteMapping("delete/{id}")
    public Integer delete(@PathVariable Integer id) {
        return userMapper.deleteById(id);
    }

    //按照用户姓名查询
    @PostMapping("/name")
    public List<User> findName(@RequestBody User user) {
        return userMapper.selectByName(user);
    }


    //用户登录
    @PostMapping("/login")
    public boolean userLogin(@RequestBody User user) {
        return userService.userLogin(user);
    }

    //管理员用户
    @PostMapping("/adminLogin")
    public boolean adminLogin(@RequestBody User user) {
        User user2 = userMapper.selectAdmin(user).get(0);
        if (user.getPassword().equals(user2.getPassword()) && user.getUsername().equals(user2.getUsername())) {
            return true;
        }
        return false;
    }


}
