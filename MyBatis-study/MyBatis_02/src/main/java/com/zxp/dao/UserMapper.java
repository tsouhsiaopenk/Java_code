package com.zxp.dao;

import com.zxp.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    // 查询用户列表
    List<User> getUserList();

    // 根据用户id查询用户信息
    User getUserById(int id);

    // 插入一个用户
    int addUser(User user);

    // 修改用户信息
    int updateUser(User user);

    // 删除一个用户
    int deleteUser(int id);

    // 分页查询
    List<User> getUserListByLimit(Map<String,Integer> map);
}
