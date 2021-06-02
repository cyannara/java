package oop;

public abstract class Member {

	//캡슐화
	private String name;
	String id;

	//getter :read
	//setter :write
	
	public Member() {
		super();
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void sal() ;

	public void print() {	
		System.out.println(name);
	}

}