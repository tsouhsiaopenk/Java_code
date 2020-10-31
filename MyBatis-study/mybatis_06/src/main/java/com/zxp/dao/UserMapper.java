package com.zxp.dao;


import com.zxp.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUserList();

    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into mybatis.user(id,name,pwd) values (#{id},#{name},#{password})")
    int addUser(User user);

    @Delete("delete from user where id=#{uid}")
    int delete(@Param("uid") int id);

    @Update("update user set name=#{name},pwd=#{password} where id=#{id}")
    int updateUser(User user);

}
