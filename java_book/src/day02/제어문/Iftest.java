package co.micol.condition;

public class Iftest {
	public static void main(String[] args) {
		int num = 110;  //변수선언과 동시에 초기화
		int num2 = 10;
		boolean b;      //부울변수 선언

		if(num > 100) {
			System.out.println(num + " 100보다 큽니다.");
			if(num2 >= 10) {
				System.out.println("숫자가 정확합니다.");
			}
		}else {		
			System.out.println(num + " 100보다 크지않다");
		}
		
		System.out.println("=========================================조건연산자");
		b = (num > 100)? true : false;
		System.out.println(b);
		System.out.println((num > 100)? true : false);
	}
}
