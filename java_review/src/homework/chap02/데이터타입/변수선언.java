package homework.chap02.데이터타입;

/*
 * 값의 종류에 따라서 올바른 변수를 선언 
 * 문자(String), 정수형(int), 실수형(double)
 * 
 * 반려견의 정보를 변수에 저장하고 출력하세요.
 */
public class 변수선언 {
	public static void main(String[] args) {
	
		/* 반려견 정보
		 * 이름 : 몽몽
		 * 나이 : 4
		 * 몸무게(kg) : 12.4
		 */
		
		//1. 반려견의 이름을 name 변수에 저장하세요
		String name = "몽몽";
		
		//2. 반려견의 나이를 age 변수에 저장하세요
		int age = 4;
		 
		//3. 반려견의 몸무게를 weight 변수에 저장하세요
		double weight = 12.4;
		
		System.out.println("나의 반려견 이름은 :" + name);
		System.out.println("나의 반려견 나이는 :" + age );
		System.out.println("나의 반려견 몸무게는 :" + weight );
		
	}
}