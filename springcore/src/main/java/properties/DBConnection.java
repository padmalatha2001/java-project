package properties;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Value;

public class DBConnection {

	@Value(value="${driver}")
	String driver;
	@Value(value="${url}")
	String url;
	@Value(value="${user}")
	String username;
	@Value(value="${password}")
	String password;
	
	
//	public String getDriver() {
//		return driver;
//	}
//	public void setDriver(String driver) {
//		this.driver = driver;
//	}
//	public String getUrl() {
//		return url;
//	}
//	public void setUrl(String url) {
//		this.url = url;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public Connection getCon() {
//		return con;
//	}
//	public void setCon(Connection con) {
//		this.con = con;
//	}
	private Connection con;
	public Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(url);
//			System.out.println(getUrl());
			//con= DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets","root","padma");
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
            con= DriverManager.getConnection(url,username,password);
            System.out.println("connection success");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
