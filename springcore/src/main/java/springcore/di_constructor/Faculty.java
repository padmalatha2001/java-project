package springcore.di_constructor;

public class Faculty {

	 private int id;
	 private String name;
	 
	public Faculty(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + "]";
	}

	
	 
	 
}
