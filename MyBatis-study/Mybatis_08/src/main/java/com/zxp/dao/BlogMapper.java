package com.zxp.dao;

import com.zxp.pojo.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlogMapper {
    // 插入数据
    void addBlog(Blog blog);
    // 查询博客
    List<Blog> queryBlogIF(Map map);

    // 查询博客
    List<Blog> queryBlogChoose(Map map);

    // 更新博客
    int updateBlog(Map map);

    // 查询博客
    List<Blog> queryBlogForeach(Map map);
}
