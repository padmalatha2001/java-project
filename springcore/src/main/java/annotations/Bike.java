package annotations;

import org.springframework.stereotype.Component;

@Component(value = "vehicle1")
public class Bike implements Vehicle {

	private int id;
	private String name;

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
		return "Bike [id=" + id + ", name=" + name + "]";
	}

}
