package com.yiibai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServlet
 */
@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setCharacterEncoding("utf-8");//设置服务器端编码
	        response.setContentType("text/html;charset=utf-8");
	        String name = request.getParameter("userName");
	        if(name==null || name=="") {
	            name = "";
	        }
	        PrintWriter out = response.getWriter();
	        //String chset = response.getCharacterEncoding(); 
	        out.print("<!DOCTYPE html>\r\n" + 
	                "<html>\r\n" + 
	                "<head>\r\n" + 
	                "<meta charset=\"UTF-8\">\r\n" + 
	                "<title>登录成功</title>\r\n" + 
	                "</head>\r\n" + 
	                "<body>");
	        out.print("<b>登录成功啦lala  ~ </b><hr/>");
	        out.print("Welcome, " + name);
	        out.close();
	}

}
