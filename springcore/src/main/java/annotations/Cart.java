package annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Cart {
    
	private int id;
	@Autowired
    private Product product;
	@Autowired
	@Qualifier(value="vehicle1")
	private Vehicle vehicle;
    public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Cart(int id, Product product, Vehicle vehicle) {
		super();
		this.id = id;
		this.product = product;
		this.vehicle = vehicle;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	
	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", product=" + product + ", vehicle=" + vehicle + "]";
	}

	
    
    
}
