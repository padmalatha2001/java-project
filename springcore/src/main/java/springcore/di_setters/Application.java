package springcore.di_setters;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Application {
      public static void main(String[] args) {
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Config.xml"));
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Config.xml");
		//Car car=(Car) beanFactory.getBean("car");
		Car car=(Car) applicationContext.getBean(Car.class);
		System.out.println(car);
		
		Engine engine=(Engine) applicationContext.getBean(Engine.class);
		System.out.println(engine);
		//Car car1=(Car) applicationContext.getBean("car");
		//System.out.println(car1);
		
	}
}
