package com.zxp.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {

    private static SessionFactory sessionFactory=null;

    //私有化
    private HibernateUtil(){ }
    /*
     * 得到sessionFactory对象
     */
    public static SessionFactory getSessionFactory(){
        if(sessionFactory==null){
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory= configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
    /*
     * 得到session对象
     */
    public static Session getSession(){
        return getSessionFactory().openSession();
    }
}

