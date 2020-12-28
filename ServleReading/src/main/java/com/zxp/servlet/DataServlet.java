package com.zxp.servlet;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class DataServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws ServletException, IOException {
    	// 设置输出内容格式和编码
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw = null;
        // Servlet 要读取的文件
        String fileName = "share.txt";
        String realPath = request.getSession().getServletContext().getRealPath(fileName);
        System.out.println(realPath);
        try {
			pw = response.getWriter();
            // 解决中文乱码
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream(realPath), StandardCharsets.UTF_8));
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                pw.println(line);
            }
            br.close();
        } catch (IOException e) {
        	e.printStackTrace();
        }finally {
			if (pw != null) {
				pw.flush();
				pw.close();
			}
		}
        System.out.print("执行正确！！");
	}

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}