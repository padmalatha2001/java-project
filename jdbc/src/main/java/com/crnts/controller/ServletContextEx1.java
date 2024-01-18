package com.crnts.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextEx1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletContextEx1() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
    	// TODO Auto-generated method stub
    	System.out.println(config.getInitParameter("init-2"));
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("---------servlet1------------");
		ServletContext context=request.getServletContext();
		System.out.println(context.getInitParameter("username"));
		System.out.println(context.getAttribute("city"));
		System.out.println(request.getAttribute("state"));
		
		Cookie cookie1=new Cookie("cookie","cookies");
		response.addCookie(cookie1);
		Cookie[] cookies=request.getCookies();
		for(Cookie cookie:cookies) {
			System.out.println(cookie.getName());
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
