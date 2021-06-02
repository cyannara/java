package oop;

public class Emp extends Member {

	String dept;
	String ho;
	
	@Override
	public void sal() {
		System.out.println("직원급여");
	}
	
	@Override
	public void print() {
		System.out.println("직원");
	}

	public void meth() {
		System.out.println("자재관리");
	}
}
