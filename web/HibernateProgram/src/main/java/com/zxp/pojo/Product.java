package com.zxp.pojo;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Product {
    // 产品 id
    private String id;
    // 产品名称
    private String name;
    // 产品价格
    private double price;
}
