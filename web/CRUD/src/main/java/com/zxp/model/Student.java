package com.zxp.model;

import lombok.Data;

@Data
public class Student {
    int id;         // 学号
    String stuName;    // 姓名
    String sex;     // 性别
    int age;        // 年龄

    public Student(int id, String stuName, String sex, int age) {
        this.id = id;
        this.stuName = stuName;
        this.sex = sex;
        this.age = age;
    }
}
