package com.shop.florist.mapper;

import com.shop.florist.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    //    数据库查询接口

    @Select("select * from users;")
    List<User> findAll();

    @Select("INSERT INTO `florist`.`users`(`name`, `password`) VALUES (#{username}, #{password})")
    Integer insert(User user);

}
