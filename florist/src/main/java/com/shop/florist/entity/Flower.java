package com.shop.florist.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flower {
    String fname;
    Integer id;
    String fdescribe;
    Double price;
    String picUrl;
}
