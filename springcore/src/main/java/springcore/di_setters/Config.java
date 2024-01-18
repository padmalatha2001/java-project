package springcore.di_setters;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Config {

	@Bean
	public Car getCar()
	{
		return new Car();
	}
	
	@Bean
	public Engine getEngine()
	{
		Engine engine= new Engine();
		engine.setId(11);
		engine.setName("B13S");
		return engine;
	}
}
