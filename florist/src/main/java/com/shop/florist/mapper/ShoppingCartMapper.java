package com.shop.florist.mapper;

import com.shop.florist.entity.ShoppingCart;
import com.shop.florist.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    @Select("select * from shoppingcart where userId = #{id}")
    List<ShoppingCart> findCar(User user);
}
