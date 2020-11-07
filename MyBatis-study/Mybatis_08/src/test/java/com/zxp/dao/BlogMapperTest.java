package com.zxp.dao;

import com.zxp.pojo.Blog;
import com.zxp.utils.IdUtils;
import com.zxp.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;


public class BlogMapperTest {
    @Test
    public void addBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IdUtils.getId());
        blog.setTitle("Java");
        blog.setAuthor("Jamson glosonlen");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);


        blog.setId(IdUtils.getId());
        blog.setTitle("Java");
        blog.setAuthor("Jamson glosonlen");
        blog.setCreateTime(new Date());
        blog.setViews(9999);
        mapper.addBlog(blog);


        blog.setId(IdUtils.getId());
        blog.setTitle("Python");
        mapper.addBlog(blog);

        blog.setId(IdUtils.getId());
        blog.setTitle("C");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    @SuppressWarnings("all")
    public void QueryBlogIF(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        // map.put("title","Java");
        map.put("author","Jamson glosonlen");
        List<Blog> blogs = mapper.queryBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    @SuppressWarnings("all")
    public void QueryBlogChoose(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        // map.put("title","Java");
        map.put("author","Jamson glosonlen");
        map.put("views",9999);
        List<Blog> blogs = mapper.queryBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }

    @Test
    public void updateBlog(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);

        HashMap map = new HashMap();
        map.put("id",1);
        map.put("author","Tom");
        map.put("title","c");

        int i = mapper.updateBlog(map);
        System.out.println(i);
        sqlSession.close();
    }

    @Test
    public void queryBlogForeach(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();

        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids",ids);

        List<Blog> blogs = mapper.queryBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }
        sqlSession.close();
    }
}