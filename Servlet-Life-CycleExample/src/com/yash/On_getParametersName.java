package com.yash;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class On_getParametersName extends HttpServlet{
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		
		Enumeration<String> en=req.getParameterNames();
		
		while(en.hasMoreElements()) {
			
			Object obj=en.nextElement();
			String param=(String)obj;
			String value=req.getParameter(param);
			
			pw.println(" Parameter name : "+param);
			pw.println("& Parameter Value :"+value);
			pw.println(" <br> ");
			
		}
			pw.close();
	}
}