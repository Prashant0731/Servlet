package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class On_getParameterValue extends HttpServlet {

	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		
		String[] value=req.getParameterValues("habits");
		pw.println(" Select ...");
		
		for(int i=0; i<value.length; i++ ) {
			pw.println("</li>"+value[i]+"</li>");
		}
		pw.close();
	}
}
