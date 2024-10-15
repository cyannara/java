package day09.innerClass;
//인터페이스 구현 클래스를  정의 할 때 람다식 (추상메서드는 하나만 존재)

interface Printable2 {
	void print(String s);
}

public class LambdaTest2 {

	public static void main(String[] args) {

		Printable2 prn = (s) -> {System.out.print(s); };
		prn.print("람다 테스트");
	}

}
