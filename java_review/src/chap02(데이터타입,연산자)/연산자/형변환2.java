package method;

public class 형변환 {
	public static void main(String[] args) {
		int a = 5 / 2;
		double b = 5 / (double)2;

		short s = (short)a;  //강제형변환 -> 캐스트연산자
		double d3 = a;

		System.out.println(a);
		System.out.println(b);
	}
}
