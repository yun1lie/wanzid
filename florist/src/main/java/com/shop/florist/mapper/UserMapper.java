package com.shop.florist.mapper;

import com.shop.florist.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    //    数据库查询接口

    @Select("select * from users;")
    List<User> findAll();

    @Insert("INSERT INTO `florist`.`users`(`username`, `password`) VALUES (#{username}, #{password})")
    int insert(User user);

    @Update("UPDATE `florist`.`users` SET `username` = #{username}, `password` = #{password} WHERE `id` = #{id}")
    int update(User user);

    @Delete("DELETE FROM `florist`.`users` WHERE `id` = #{id}")
    Integer deleteById(@Param(("id")) Integer id);

    //按照用户姓名查询
    @Select("select * from users where users.username = #{username}")
    List<User> selectByName(User user);
}
