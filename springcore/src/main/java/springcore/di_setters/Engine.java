package springcore.di_setters;

import org.springframework.stereotype.Component;

//@Component
public class Engine {
      private int id;
      private String name;
      
      
      
	public Engine() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", name=" + name + "]";
	}
	
	
      
}
