package co.micol.classExam;

public class Car {   //클래스 본체
	public String model;    //멤버속성
	public int price;
	private String name;
	
	public Car() {   //생성자
		
	}
	
	public void run() {
		name = "현대자동차";
		System.out.println(name + " 자동차가 움직인다.");
	}
	
	protected void stop() {
		System.out.println("자동차가 멈춘다.");
	}
	
}
