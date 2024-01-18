package com.crnts.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crnts.entity.Student;

public class StudentDAOImpl implements StudentDAO{

	Connection connection=new DBConnection().getConnection();
	@Override
	public void save(Student student) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("Insert Into"
					+ " student1(name,branch,cgpa) values(?,?,?)");
			preparedStatement.setString(1,student.getName());
			preparedStatement.setString(2,student.getBranch());
			preparedStatement.setDouble(3,student.getCgpa());
			int k=preparedStatement.executeUpdate();
			System.out.println(k+" row is inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
		int id=student.getId();
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("UPDATE student1 set"
					+ " name=?,branch=?,cgpa=? where id=?");
			preparedStatement.setString(1,student.getName());
			preparedStatement.setString(2,student.getBranch());
			preparedStatement.setDouble(3,student.getCgpa());
			preparedStatement.setInt(4, id);
			int k=preparedStatement.executeUpdate();
			System.out.println(k+" row is updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("DELETE FROM student1 "
					+ "WHERE id=?");
			preparedStatement.setInt(1, id);
			int k=preparedStatement.executeUpdate();
			System.out.println(k+" row is deleted");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		Student student=null;
		try {
			PreparedStatement preparedStatement=connection.prepareStatement("select * from student1 where id=?");
			 preparedStatement.setInt(1, id);
			 ResultSet resultSet=preparedStatement.executeQuery();
			 if(resultSet.next())
			 {
				 student=new Student(resultSet.getInt(1),resultSet.getString(2),
						 resultSet.getString(3),resultSet.getDouble(4));
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return student;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		List<Student> students=new ArrayList<>();
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement("select * from student1");
			 ResultSet resultSet=preparedStatement.executeQuery();
			 while(resultSet.next()) {
				 students.add(new Student(resultSet.getInt(1),resultSet.getString(2)
						 ,resultSet.getString(3),resultSet.getDouble(4)));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return students;
	}
	
	

}
