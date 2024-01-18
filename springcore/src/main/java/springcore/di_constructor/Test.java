package springcore.di_constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BeanFactory beanFactory=new XmlBeanFactory(new ClassPathResource("Config_constructor.xml"));
		Student student=(Student) beanFactory.getBean("student");
		System.out.println(student);
		student.print();
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Config_constructor.xml");
		Student student1=(Student)applicationContext.getBean("student");
		System.out.println(student1);
		student1.print();
	}

}
