package com.shop.florist.mapper;

import com.shop.florist.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserMapper {
    //    数据库查询接口

    @Select("select * from users;")
    List<User> findAll();

    @Insert("INSERT INTO `florist`.`users`(`name`, `password`) VALUES (#{username}, #{password})")
    int insert(User user);

    @Update("UPDATE `florist`.`users` SET `name` = #{username}, `password` = #{password} WHERE `id` = #{id}")
    int update(User user);
}
