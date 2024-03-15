package day05.co.yedam.test;

//클래스 : 필드 + 메서드 + 생성자
public class Calc {
	//on   1. 리턴값도 없고 매개변수 없슴.
	void turnOn() {
		System.out.println("계산기 on");
	}	
	//덧셈 2. 리턴값 없고 매개변수 있음
//	void sum(int a, int b) {
//		System.out.println("int 메서드");
//		System.out.println("두수의핪:" + (a+b));
//	}
	void sum(double a, double b) {
		System.out.println("double 메서드");
		System.out.println("두수의핪:" + (a+b));
	}
	//3. 리턴도 있고 매개변수 있음.
	int sum2(int a, int b) {
		return a + b;
	}	
	
	//4. 가변인수
	int sum3(int ... arr) {
		int result = 0;
		//코딩
		for(int i=0; i<arr.length; i++) {
			result = arr[i];
		}
		return result;
	}
}
