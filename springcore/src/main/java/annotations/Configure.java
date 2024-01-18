package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="annotations")
public class Configure {

	@Autowired
	private Vehicle vehicle;
	@Bean(value="product1")
	public Product getProduct()
	{
		return new Product();
	}

	@Bean
	public Cart getCart()
	{
		return new Cart();
	}
	
}
