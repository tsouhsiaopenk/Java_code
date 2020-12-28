package com.zxp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

// 过滤器，满足 url 请求的url匹配的路径规则，才会过滤（调用filter中的方法）
@WebFilter("/*")
public class CharFilter implements Filter {

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("非法文字过滤器初始化！");
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1,
						 FilterChain arg2) throws IOException, ServletException {
		//设置参数的接收格式
		HttpServletRequest request = (HttpServletRequest)arg0;
		//设置参数的编码格式
		request.setCharacterEncoding("utf-8");
		//接收聊天内容
		String charContent = request.getParameter("charContent");

		if(charContent != null){
			if(!charContent.contains("晕")){
				arg2.doFilter(arg0, arg1);
			}else{
				request.getRequestDispatcher("/SendFailure.jsp").forward(arg0, arg1);
			}
		}else{
			arg2.doFilter(arg0, arg1);
		}
	}

	public void destroy() {
		System.out.println("非法文字过滤器销毁！");
	}
}