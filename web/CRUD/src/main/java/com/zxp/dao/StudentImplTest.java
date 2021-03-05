package com.zxp.dao;


import com.zxp.model.Student;
import org.junit.jupiter.api.Test;

import java.util.List;


public class StudentImplTest {
    @Test
    public void insertTest() {
        Student student = new Student(2, "lily", "fmale", 22);
        StudentDao studentDao = new StudentImpl();
        int i = studentDao.insert(student);
        System.out.println(i);
    }

    @Test
    public void deleteTest()  {
        int id = 2;
        StudentDao studentDao = new StudentImpl();
        int i = studentDao.delete(id);
        System.out.println(i);
    }

    @Test
    public void updateTest(){
        Student student = new Student(1, "lily", "fmale", 22);
        StudentDao studentDao = new StudentImpl();
        int i = studentDao.update(student);
        System.out.println(i);
    }

    @Test
    public void queryAllStudent(){
        StudentDao studentDao = new StudentImpl();
        List<Student> students = studentDao.queryAllStudent();
        for (Student student : students) {
            System.out.println(student);
        }
    }
}