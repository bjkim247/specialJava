package ch07.sec07;

import java.util.Objects;

public class Student {
	private String name;
	private double grade;
	
	
	public Student() {
		this(null, 0.0);
	}


	public Student(String name, double grade) {
		super();
		this.name = name;
		this.grade = grade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getGrade() {
		return grade;
	}


	public void setGrade(double grade) {
		this.grade = grade;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name, grade);
	}


	@Override
	public boolean equals(Object obj) {
		Student stu = null;
		if(!(obj instanceof Student)) {
			return false;
		}
		stu = (Student)obj;
		if(this.name.equals(stu.name) && this.grade == stu.grade) {
			return false;
		}
		return true;
		
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + "]";
	}
	
	
	
	
	
}
