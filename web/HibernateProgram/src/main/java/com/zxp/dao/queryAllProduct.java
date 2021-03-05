package com.zxp.dao;

import com.zxp.pojo.Product;
import com.zxp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

public class queryAllProduct {
    @Test
    public void testInsertProduct(){
        // 得到 Session 对象
        Session session = HibernateUtil.getSession();
        String hql = "FROM Product as pro";
        // 通过 Query方法查询
        Query query = session.createQuery(hql);
        // 查询结果保存到 list
        List list = query.list();
        // 遍历是否存在该id的产品，如果存在则进行输出
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Product product = (Product) iterator.next();
            System.out.println(product.toString());
        }
        // 6.关闭session
        session.close();
    }
}
