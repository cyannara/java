package co.yedam.test;

public class CarMain {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		System.out.println("제작회사:"+myCar.company);
		System.out.println("스피드:"+myCar.speed);
		myCar.speed=20;
		System.out.println("스피드:"+myCar.speed);
	}

}
