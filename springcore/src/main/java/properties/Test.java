package properties;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext(Configure.class);
		DBConnection connection=context.getBean(DBConnection.class);
		connection.getConnection();
		
		//PreparedStatement statement=connection.prepareStatement("");
		//System.out.println(connection.getConnection());
		
			
	}

}
