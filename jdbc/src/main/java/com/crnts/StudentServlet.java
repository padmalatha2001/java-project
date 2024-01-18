package com.crnts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;

import com.crnts.dao.DBConnection;
import com.crnts.entity.Student;
import com.crnts.service.StudentServiceImpl;



import com.crnts.service.StudentService;


public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//System.out.println("doGet");
		
		
		String sql=request.getParameter("sql");
		//System.out.println("name: "+name);
		StudentService studentService=new StudentServiceImpl();
	   
	    if(sql.equals("insert"))
	    {
	    	String name=request.getParameter("name");
			String gender=request.getParameter("gender");
			String branch=request.getParameter("branch");
			 Student student=new Student(name,gender,branch);
	    	studentService.insert(student);
	    }
	    else if(sql.equals("delete"))
	    {
	    	int id=Integer.parseInt(request.getParameter("id"));
	    	studentService.delete(id);
	    }
	    else if(sql.equals("update"))
	    {
	    	int id=Integer.parseInt(request.getParameter("id"));
	    	Student student=studentService.getById(id);
	    	if(student!=null)
	    	{
	    		String branch=request.getParameter("branch");
	    		studentService.updateBranch(id, branch);
	    	}
	    	else {
	    		throw new FileNotFoundException("Record Not Found with id:"+id);
	    	}
	    	
	    }
	    else if(sql.equals("get")){
	    
	    	List<Student> students=studentService.getAll();
	    	ObjectMapper mapper=new ObjectMapper();
	    	String result=mapper.writeValueAsString(students);
	    	PrintWriter printWriter=response.getWriter();
	    	response.setContentType("application/json");
	    	printWriter.print(result);
	    }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		StudentService studentService=new StudentServiceImpl();
		ServletInputStream is=request.getInputStream();
		ObjectMapper mapper=new ObjectMapper();
		
		String record=IOUtils.toString(is,"UTF-8");
		Student student=mapper.readValue(record, Student.class);
		studentService.insert(student);
		
	}

}
