package com.crnts.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.codehaus.jackson.map.ObjectMapper;

import com.crnts.entity.Student;
import com.crnts.service.*;

public class StudentController extends HttpServlet{
	
	StudentService studentService=new StudentServiceImpl(); 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sql=req.getParameter("sql");
		
		if(sql.equals("insert")) {
		
			String name=req.getParameter("name");
		    String branch=req.getParameter("branch");
		    double cgpa=Double.parseDouble(req.getParameter("cgpa"));
		    studentService.save(new Student(name,branch,cgpa));
		}
		else if(sql.equals("get")) {
			int id=Integer.parseInt(req.getParameter("id"));
			Student student=studentService.getStudent(id);
			ObjectMapper mapper=new ObjectMapper();
			String s=mapper.writeValueAsString(student);
			PrintWriter out=resp.getWriter();
			resp.setContentType("json");
			out.write(s);
			System.out.println(student);
		}
		else if(sql.equals("update")) {
			int id=Integer.parseInt(req.getParameter("id"));
			Student student=studentService.getStudent(id);
			if(student==null)
			{
				throw new FileNotFoundException("Record Not Found Exception");
			}
			else {
			String name=req.getParameter("name");
		    String branch=req.getParameter("branch");
		    double cgpa=Double.parseDouble(req.getParameter("cgpa"));
		    studentService.update(new Student(id,name,branch,cgpa));
			}
		}
		else if(sql.equals("delete"))
		{
			int id=Integer.parseInt(req.getParameter("id"));
			Student student=studentService.getStudent(id);
			if(student!=null)
			{
				studentService.delete(id);
				
			}
			else {
				throw new FileNotFoundException("Record Not Found With Id:"+id);
			}
		}
		else if(sql.equals("all"))
		{
			List<Student> students=studentService.getAll();
		     ObjectMapper mapper=new ObjectMapper();
		     String string=mapper.writeValueAsString(students);
		     PrintWriter out=resp.getWriter();
		     resp.setContentType("json");
		     out.write(string);
					
			System.out.println(students);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletInputStream servletInputStream=req.getInputStream();
		ObjectMapper mapper=new ObjectMapper();
		String string=IOUtils.toString(servletInputStream,"UTF-8");
		Student student=mapper.readValue(string,Student.class);
		studentService.save(student);
	}
}