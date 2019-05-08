package com.yash;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class OnGeneric extends GenericServlet
{
	public void service(ServletRequest req,ServletResponse resp)throws  ServletException,IOException 
	{
		resp.setContentType("text/html");
		PrintWriter pw=resp.getWriter();
		pw.println("This is the servlet program on GenericServlet");
		pw.println("I_AM_Prashant");
		pw.println(" Hi This is priya");
		pw.close();
	}
}