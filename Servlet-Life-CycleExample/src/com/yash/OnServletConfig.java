package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OnServletConfig extends HttpServlet {

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
	
		ServletConfig conf=getServletConfig();
		
		String s1=conf.getInitParameter("n1");
		String s2=conf.getInitParameter("n2");
		pw.println(" S1 Value : "+s1+" S2 Value : "+s2);
		
		pw.println();
		pw.close();
	}	
}
