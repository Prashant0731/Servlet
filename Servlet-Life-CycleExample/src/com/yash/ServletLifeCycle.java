package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifeCycle extends HttpServlet {
	
	public ServletLifeCycle() {
		System.out.println("I am Default Constructor");
	}
	
	public void init(ServletConfig config) {
		System.out.println("I am Init_method() ");
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.println("I am from doGet_method");
		pw.close();
	}
	
	public void destroy() {
		System.out.println("I am Destroy_method() ");
	}
}
