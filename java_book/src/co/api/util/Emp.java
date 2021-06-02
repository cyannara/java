package co.api.util;

import lombok.Data;

@Data
public class Emp{
	int id;
	String name;
	String dept;	
	
	public Emp() {}
	public Emp(int id, String name, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}	
}