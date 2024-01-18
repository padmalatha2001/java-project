package com.crnts.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.crnts.entity.ErrorMessage;

public class ErrorMessageController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Object exception=req.getAttribute("javax.servlet.error.exception");
		Integer status_code=(Integer) req.getAttribute("javax.servlet.error.status_code");
		String servlet_name=(String) req.getAttribute("javax.servlet.error.servlet_name");
		ErrorMessage errorMessage=new ErrorMessage();
		if(exception!=null)
		{
			errorMessage.setErrorMessage(((Exception)exception).getMessage());
			System.out.println("ExceptionType:"+exception.getClass().getSimpleName());
		}else {
			errorMessage.setErrorMessage((String)req.getAttribute("javax.servlet.error.message"));
		}
		
		errorMessage.setStatus_code(status_code);
		errorMessage.setLocation(servlet_name);
		
		ObjectMapper mapper=new ObjectMapper();
		String string=mapper.writeValueAsString(errorMessage);
		System.out.println("Error Message: "+string);
		PrintWriter out=resp.getWriter();
		resp.setContentType("json");
		resp.setCharacterEncoding("UTF-8");
		out.print(string);
		out.flush();
		
		
	}

}
