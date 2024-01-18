package properties;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages="properties")
@PropertySource("classpath:/db.properties")
public class Configure {
	
	@Bean
	public DBConnection getDBConnectin()
	{
        return new DBConnection();
		
	}
}
