package com.zxp.dao;

import com.zxp.pojo.Student;

import java.util.List;

public interface StudentMapper {

    // 查询出所有学生以及学生所对应老师的名字
    // 使用子查询: 查询嵌套
    List<Student> getStudentList();
    // 使用联表查询: 结果嵌套
    List<Student> getStudentList2();
}
