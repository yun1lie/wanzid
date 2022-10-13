package com.shop.florist.mapper;

import com.shop.florist.entity.Flower;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FlowerMapper {
    //    数据库查询接口
    @Select("select * from flower LIMIT 8;")
    List<Flower> findEight();

    @Select("select * from flower where id = #{id}")
    Flower findById(Flower flower);
}

