package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class OngetParameter extends HttpServlet
{
    protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{		
		PrintWriter pw=  resp.getWriter();
		resp.setContentType("text/html");
		
		String n1=req.getParameter("n1");
		String n2=req.getParameter("n2");
		String n3=req.getParameter("n3");
		String n4=req.getParameter("n4");
		
		int result= Integer.parseInt(n1)+Integer.parseInt(n2)+Integer.parseInt(n3)+Integer.parseInt(n4);
		System.out.println(" Sum of Integer : "+result);
	}
}
