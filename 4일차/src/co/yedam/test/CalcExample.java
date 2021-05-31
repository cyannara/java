package co.yedam.test;

public class CalcExample {

	public static void main(String[] args) {
		Calc calc = new Calc();
		
		calc.turnOn();
		calc.sum(10, 20);
		calc.sum(10.5, 20.5);
		int r = calc.sum2(100,200);
		System.out.println(r);
		System.out.println(calc.sum3(1,2,3));
		System.out.println(calc.sum3(1,2,3,4,5));
		
	}

}
