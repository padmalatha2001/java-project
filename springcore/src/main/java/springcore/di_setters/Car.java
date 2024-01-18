package springcore.di_setters;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
//@Component
public class Car {
     private int id;
     private String color;
     @Autowired
     private Engine engine;
     private List<String> brands;
     private Map<Integer,String> quotes;
     
     public void init()
     {
    	 System.out.println("init-method");
     }
     
	public Car() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("car");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Engine getEngine() {
		return engine;
	}
	//@Autowired
	//@Qualifier(value="engine")
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public List<String> getBrands() {
		return brands;
	}

	public void setBrands(List<String> brands) {
		this.brands = brands;
	}

	public Map<Integer, String> getQuotes() {
		return quotes;
	}

	public void setQuotes(Map<Integer, String> quotes) {
		this.quotes = quotes;
	}
	
	 public void destroy()
     {
    	 System.out.println("destroy-method");
     }
     

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", engine=" + engine + ", brands=" + brands + ", quotes=" + quotes
				+ "]";
	}
	
     
     
}
