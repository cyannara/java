package day05.메서드;

// 두 수의 합을 계산
public class TestMethod {
	int num1 = 10;
	int num2 = 20;
	int result;
	
	//매개변수가 없고 리턴값이 없는 메서드 선언
	public void sum() {
		result= num1 + num2;
		System.out.println(result);
	}
	
	//매개변수와 리턴값이 있는 메서드 선언
	public int sum(int a, int b) {
		return a+b;
	}
	
	//가변인수
	public int sum(int... num) {
		result = 0;
		for(int i=0; i<num.length; i++) {
			
		}
		return 0;
	}
	
	public static void main(String[] args) {
		TestMethod m = new TestMethod();
		m.sum();				// 두수의 합을 화면에 출력
		int c = m.sum(20,40);	//두 인수의 합을 리턴
		System.out.println(c);
		
		c = m.sum(3,4,5,8,6);	//가변 인수
		System.out.println(c);
	}
}
