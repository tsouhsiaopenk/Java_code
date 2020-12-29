package com.zxp.dao;

import com.zxp.model.Student;
import com.zxp.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentImpl implements StudentDao {


    @Override
    public int insert(Student student) {
        Connection conn = DBUtil.getConnection();
        String sql = "insert into student (id,stu_name,sex,age) values(?,?,?,?)";
        PreparedStatement pst;
        int i = 0;
        try {
            pst = (PreparedStatement) conn.prepareStatement(sql);
            pst.setInt(1, student.getId());
            pst.setString(2,student.getStuName());
            pst.setString(3,student.getSex());
            pst.setInt(4, student.getAge());
            i = pst.executeUpdate();
            pst.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(int id) {

    }

    @Override
    public List<Student> queryAllStudent() {
        return null;
    }

    @Override
    public Student queryById(int id) {
        return null;
    }
}
