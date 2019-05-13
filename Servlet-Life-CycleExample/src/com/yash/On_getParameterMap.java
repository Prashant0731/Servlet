package com.yash;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class On_getParameterMap extends HttpServlet {

	
	@SuppressWarnings("unused")
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException{
		PrintWriter pw= res.getWriter();
		res.setContentType("text/html");

		//Map
		Map<String, String[]> m=req.getParameterMap();
		Set<Entry<String, String[]>> s =m.entrySet();
		Iterator<?> it=s.iterator();
		
		
		while(it.hasNext()) {
			Map.Entry<String,String[]> entry = (Map.Entry<String,String[]>)it.next();
			String key = entry.getKey();
            String[] value = entry.getValue();
            pw.println("Key is "+key+"<br>");
           
           if(value.length>1) {
			for(int i=0; i<value.length; i++) {
				pw.println("<li>"+value[i].toString()+"</li> <br>");
			}
           }
           else 
        	   pw.println("Value is "+value[0].toString()+"<br>");
           	   pw.println("-------------------<br>");
           	   
          	   
		}
	pw.close();
	}
}