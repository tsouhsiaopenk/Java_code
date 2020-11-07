package com.zxp.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime; // 此处字段与数据库字段名对应不一致，需要解决
    private int views;
}
