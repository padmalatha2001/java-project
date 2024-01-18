package springcore.di_constructor;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Student {

	private int id;
	private String name;
	private String city;
	private String[] subjects;
	private Map<String,Integer> scores;
	private Faculty faculty;
	private int k=0;
	

	public Student(int id, String name, String city, String[] subjects, Map<String, Integer> scores, Faculty faculty) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.subjects = subjects;
		this.scores = scores;
		this.faculty = faculty;
	}

	public void print()
	{
		System.out.println("hello"+ ++k);
	}
	
	
	  @Override public String toString() { return "Student [id=" + id + ", name=" +
	  name + ", city=" + city + ", subjects=" + Arrays.toString(subjects) +
	  ", scores=" + scores + ", faculty=" + faculty + "]"; }
	  
	 
	
	
	
}
