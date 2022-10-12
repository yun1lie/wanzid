package com.shop.florist;

import com.shop.florist.entity.User;
import com.shop.florist.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class FloristApplication {

    @Autowired //注入其他类注解
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(FloristApplication.class, args);
    }

    @GetMapping("/")
    public List<User> index() {
        User user = new User();
        return userMapper.findAll();
    }

}
