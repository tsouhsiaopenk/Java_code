package com.zxp.dao;

import com.zxp.pojo.Product;
import com.zxp.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

public class updateProduct {

    @Test
    public void testInsertProduct(){
        // 1.得到 Session 对象
        Session session = HibernateUtil.getSession();
        // 2.打开事务
        Transaction transaction = session.beginTransaction();
        // 3.实例化对象
        Product product = new Product();
        product.setId("1");
        product.setName("hebernate手册");
        product.setPrice(88);
        // 4.利用save()方法进行相应的保存
        session.update(product);
        // 5.提交事务
        transaction.commit();
        // 6.关闭session
        session.close();
    }
}
