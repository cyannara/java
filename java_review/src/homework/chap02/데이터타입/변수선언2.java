package homework.chap02.데이터타입;

/*
 * 값의 종류에 따라서 올바른 변수를 선언 
 * 문자(String), 정수형(int), 실수형(double)
 * 
 * 사원 정보를 변수에 저장하고 출력하세요.
 */
public class 변수선언2 {
	public static void main(String[] args) {
	
		/* 사원 정보
		 * 사원명 : 홍길동
		 * 입사년도 : 2024
		 * 연봉 27,540,000
		 * 보너스비율 : 0.25 
		 */
		
		//1. 사원명을 empName 변수에 저장하세요
		String name = "홍길동";
		
		//2. 입사년도를 hireDate 변수에 저장하세요
		int hireDate = 2024;
		 
		//3. 연봉을 salary 변수에 저장하세요
		int salary = 2_540_000;
		
		//4. 보너스 비율을 bonusRatio 변수에 저장하세요
		double bonusRatio = 0.25;
		
		//5. 보너스 계산 (급여 * 상여금 비율)
		double bonus = salary * bonusRatio;
		
		//5. 급여와 상여금을 출력
		System.out.println("급여 :" + salary);
		System.out.println("보너스 :" + bonus );
		System.out.println("급여+보너스 :" + (salary + bonus) );
		
		/*실행결과 : 
		 * 급여 :2540000
			보너스 :635000.0
			급여+보너스 :3175000.0
		 */
	}
}