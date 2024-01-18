package com.crnts.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.crnts.entity.Student;

public class StudentDAOImpl implements StudentDAO {
	
	Connection con=DBConnection.getConnection();
	
	@Override
	public void insert(Student s) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement st=con.prepareStatement("INSERT INTO student(name,gender,branch) values(?,?,?)");
			st.setString(1,s.getName());
			st.setString(2,s.getGender());
			st.setString(3,s.getBranch());
			int k=st.executeUpdate();
			System.out.println(k+" row is inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement st=con.prepareStatement("DELETE FROM student WHERE id=?");
			st.setInt(1, id);
			int k=st.executeUpdate();
			System.out.println(k+" row is deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateBranch(int id, String branch) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement st=con.prepareStatement("UPDATE student set branch=? where id=?");
			st.setString(1, branch);
			st.setInt(2, id);
			int k=st.executeUpdate();
			System.out.println(k+"row is updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list=new ArrayList<>();
		try {
			PreparedStatement st=con.prepareStatement("select * from student");
			ResultSet rs=st.executeQuery();
			/*System.out.println("----------Student Details--------");
			while(rs.next())
			{
				System.out.println("ID : "+rs.getInt(1)+" Name : "+rs.getString(2)+" Gender : "
						+rs.getString(3)+" Branch : "+rs.getString(4));
			}*/
			
			while(rs.next())
			{
				Student student=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
				list.add(student);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
	}

	@Override
	public Student getById(int id) {
		// TODO Auto-generated method stub
		Student student=null;
		try {
			PreparedStatement st=con.prepareStatement("select * from student where id=?");
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			if(rs.next())
			{
				student=new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4));
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
	}


}
