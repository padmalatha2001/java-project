package com.crnts.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletContextEx extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(config.getInitParameter("init-1"));
	}
 
    public ServletContextEx() {
        super();
        // TODO Auto-generated constructor stub
    }


 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("---------------------");
	    ServletContext context=request.getServletContext();
	    System.out.println(context.getInitParameter("username"));
	    context.setAttribute("city", "Banglore");
	    request.setAttribute("state", "Banglore");
	    System.out.println(context.getAttribute("city"));
	    context.setAttribute("city", "Hyderabad");
	    System.out.println(context.getAttribute("city"));
	    
	    HttpSession session=request.getSession();
	    session.setAttribute("sessio1", "new-session");
	    System.out.println(session.getId());
	   // System.out.println(session.getValue("session1"));
	    System.out.println(session.getMaxInactiveInterval());
	    System.out.println(session.getLastAccessedTime());
	    //System.out.println(session.getAttribute("session1"));
	    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("-------------dopost----------");
		ServletContext context=request.getServletContext();
		System.out.println(context.getInitParameter("username"));
		System.out.println(context.getInitParameter("city"));
		System.out.println(context.getAttribute("city"));
		System.out.println(request.getAttribute("state"));
	}

}
