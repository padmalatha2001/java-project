package com.crnts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.crnts.entity.ErrorMessage;

public class ErrorMessageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ErrorMessageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Object exception=request.getAttribute("javax.servlet.error.exception");
		Integer status_code=(Integer)request.getAttribute("javax.servlet.error.status_code");
		String servlet_name=(String)request.getAttribute("javax.servlet.error.servlet_name");
		ErrorMessage messageBean=new ErrorMessage();
		if(exception!=null)
		{
			messageBean.setErrorMessage(((Exception) exception).getMessage() );
			System.out.println("Exception-Type :"+exception.getClass().getSimpleName());
		}
		else {
			
			messageBean.setErrorMessage((String)request.getAttribute("javax.servlet.error.message"));
		}
		messageBean.setLocation(servlet_name);
		messageBean.setStatus_code(status_code);
		
		ObjectMapper mapper=new ObjectMapper();
		String json=mapper.writeValueAsString(messageBean);
		System.out.println("Error Message: "+json);
		
		PrintWriter printWriter=response.getWriter(); 
		response.setContentType("json");
		response.setCharacterEncoding("UTF-8");
		printWriter.print(json);
		printWriter.flush();
	}

}
