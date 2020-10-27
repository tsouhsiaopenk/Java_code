package com.zxp.utils;

import com.zxp.dao.UserMapper;
import com.zxp.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            // 获取 sqlSessionFactory 对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 通过 SqlSessionFactory 就可以创建 SqlSession 的实例
    // sqlSession 包含了面向数据库执行SQL命令所需要的方法。
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}
