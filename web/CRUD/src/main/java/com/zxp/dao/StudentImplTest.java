package com.zxp.dao;


import com.zxp.model.Student;
import org.junit.jupiter.api.Test;

public class StudentImplTest {
    @Test
    public void insertTest() {
        Student student = new Student(1, "lily", "fmale", 22);
        StudentDao studentDao = new StudentImpl();
        int i = studentDao.insert(student);
        System.out.println(i);
    }
}