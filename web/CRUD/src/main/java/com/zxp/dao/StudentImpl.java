package com.zxp.dao;

import com.zxp.model.Student;
import com.zxp.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentImpl implements StudentDao {

    @Override
    public int insert(Student student) {
        Connection conn = DBUtil.getConnection();
        String sql = "insert into student (id,stu_name,sex,age) values(?,?,?,?)";
        PreparedStatement pst = null;
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
        DBUtil.close(conn,pst);
        return i;
    }

    @Override
    public int delete(int id) {
        Connection conn = DBUtil.getConnection();
        String sql = "delete from student where id = " + id;
        PreparedStatement pst = null;
        int i = 0;
        try {
            conn.setAutoCommit(false);
            pst = conn.prepareStatement(sql);
            i = pst.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        DBUtil.close(conn,pst);
        return i;
    }

    @Override
    public int update(Student student) {
        Connection conn = DBUtil.getConnection();
        String sql = "update student set stu_name = ? , sex = ? ,age = ?" +
                " where id = " + student.getId(); // 换行注意空格
        PreparedStatement pst = null;
        int i = 0;
        try {
            conn.setAutoCommit(false);
            pst = conn.prepareStatement(sql);
            pst.setString(1,student.getStuName());
            pst.setString(2,student.getSex());
            pst.setInt(3,student.getAge());
            i = pst.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,pst);
        }
        return i;
    }

    @Override
    public List<Student> queryAllStudent() {
        List<Student> result = new ArrayList<>();
        Connection conn = DBUtil.getConnection();
        String sql = "select * from student;";
        PreparedStatement pst = null;
        ResultSet resultSet = null;
        try {
            conn.setAutoCommit(false);
            pst = conn.prepareStatement(sql);
            resultSet = pst.executeQuery();
            while (resultSet.next()){
                // 注意这里与数据库里的字段对应
                int id = resultSet.getInt("id");
                String stuName = resultSet.getString("stu_name");
                String sex = resultSet.getString("sex");
                int age = resultSet.getInt("age");
                Student student = new Student(id, stuName, sex, age);
                result.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn,pst,resultSet);
        }
        return result;
    }

}
