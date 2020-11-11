package com.zxp.service;

import com.zxp.dao.UserDao;
import com.zxp.dao.UserDaoMysqlImpl;
import com.zxp.dao.UserDaoOracleImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserServiceImplTest {

    @Test
    public void getUser1() {
        UserDao userDaoMysql = new UserDaoMysqlImpl();
        UserDao userDaoOracle = new UserDaoOracleImpl();
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao(userDaoOracle);
        service.getUser();
    }

    @Test
    public void getUser(){ // 此处名字要求比较严格
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}