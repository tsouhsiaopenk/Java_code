package com.zxp.dao;

import com.zxp.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    // 增加一条学生消息
    public int insert(Student student);
    // 删除一条学生信息（按照学号删除）
    public int delete(int id);
    // 改一条学生信息（按照学号更改）
    public int update(Student student);
    // 查询全部
    public List<Student> queryAllStudent();
}
