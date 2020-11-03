package com.zxp.dao;

import com.zxp.pojo.Student;
import com.zxp.pojo.Teacher;
import com.zxp.utils.MybatisUtils;
import junit.framework.TestCase;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TeacherMapperTest extends TestCase {
    @Test
    public void testGetUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        Teacher teacher = mapper.getTeacher(1);
        System.out.println(teacher);
        sqlSession.close();
    }

    @Test
    public void testGetStudentList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }

    @Test
    public void testGetStudentList2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudentList2();
        for (Student student : studentList) {
            System.out.println(student);
        }
        sqlSession.close();
    }
}