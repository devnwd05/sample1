package com.csc.hibonetomany;









import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	private String name;
	@Id
	private String rollno;
	private float marks;
	
	public Student() 
	{
		
	}

	
	
	public Student(String name, String rollno, float marks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	

}

