package javautil;

import java.io.Serializable;

public class Emp implements Serializable{
	String firstName;
	transient String lastName;
	long salary;
	
	public Emp() {} 
	public Emp(String firstName, String lastName, long salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}	
}
