package annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configure.class);
		Product product = applicationContext.getBean(Product.class);
		System.out.println(product);
		Cart cart = applicationContext.getBean(Cart.class);
		System.out.println(cart);
		Vehicle vehicle = applicationContext.getBean("vehicle1",Vehicle.class);
		System.out.println(vehicle);
	}

}
