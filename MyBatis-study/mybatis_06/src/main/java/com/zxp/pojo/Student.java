package com.zxp.pojo;

import lombok.Data;

@Data
public class Student {
    private int id;
    private String name;
    // 用 tid 来关联老师
    private Teacher teacher;
}
