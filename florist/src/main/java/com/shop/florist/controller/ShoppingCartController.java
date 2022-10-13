package com.shop.florist.controller;


import com.shop.florist.entity.Flower;
import com.shop.florist.entity.ShoppingCart;
import com.shop.florist.entity.User;
import com.shop.florist.mapper.FlowerMapper;
import com.shop.florist.mapper.ShoppingCartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ShopCart") // 统一给接口加前缀
public class ShoppingCartController {
    @Autowired
    private ShoppingCartMapper shoppingCartMapper;


    //查询购物车信息
    @PostMapping("/")
    public List<Flower> index(@RequestBody User user) {

        return shoppingCartMapper.findCar(user);
    }
}
