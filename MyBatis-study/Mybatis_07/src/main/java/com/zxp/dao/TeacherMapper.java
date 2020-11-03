package com.zxp.dao;

import com.zxp.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

public interface TeacherMapper {

   Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid") int id);
}
