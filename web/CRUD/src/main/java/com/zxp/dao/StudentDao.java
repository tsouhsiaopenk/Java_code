package com.zxp.dao;

import com.zxp.model.Student;

import java.util.List;

public interface StudentDao {
    // 增加一条学生消息
    public int insert(Student student);
    // 删除一条学生信息（按照学号删除）
    public void delete(int id);
    // 改一条学生信息（按照学号更改）
    public void update(int id);
    // 查询
    // 1.查询全部
    public List<Student> queryAllStudent();
    // 2.按照学号查询
    public Student queryById(int id);
}
