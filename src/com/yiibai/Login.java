package com.yiibai;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setCharacterEncoding("utf-8");//设置服务器端编码
	        response.setContentType("text/html;charset=utf-8");
	        PrintWriter out = response.getWriter();

	        String name = request.getParameter("userName");
	        String passwd = request.getParameter("userPass");

	        // 用户输入的密码是否为：mypasswd
	        if (passwd.equals("mypasswd") && name.equals("admin")) {
	            RequestDispatcher rd = request.getRequestDispatcher("welcome");
	          //welcome is the url-pattern of the second servlet
	            System.out.println("Username is : "+name);
	            rd.forward(request, response);//method may be include or forward
	        } else {
	            out.print("Sorry UserName or Password Error!");
	            RequestDispatcher rd = request.getRequestDispatcher("/index.html");
	            rd.include(request, response);
	        }
	}

}
