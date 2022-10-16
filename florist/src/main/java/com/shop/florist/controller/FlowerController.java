package com.shop.florist.controller;

import com.shop.florist.entity.Flower;
import com.shop.florist.mapper.FlowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flower") // 统一给接口加前缀
public class FlowerController {
    @Autowired
    private FlowerMapper flowerMapper;

    //查询8朵花
    @GetMapping("/")
    public List<Flower> index() {
        return flowerMapper.findEight();
    }

}


