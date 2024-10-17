package day01.c03연산자;

public class 관계연산 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		//첫번째 관계식이 false 두번째 관계식은 계산안함
  		if( ++y > 10 && ++x > 10) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
		System.out.println(x);
		System.out.println(y);
	}

}
