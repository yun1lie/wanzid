package com.shop.florist.mapper;

import com.shop.florist.entity.Flower;
import com.shop.florist.entity.ShoppingCart;
import com.shop.florist.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    @Select("select * from flower where flower.id in (select flowerId from shoppingcart where userId = #{id})")
    List<Flower> findCar(User user);
}
