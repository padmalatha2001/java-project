package annotations;

import org.springframework.stereotype.Component;

@Component(value = "vehicle")
public class Car implements Vehicle {

	private int id;
	private String name;

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String name) {
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
		return "Car [id=" + id + ", name=" + name + "]";
	}

}
