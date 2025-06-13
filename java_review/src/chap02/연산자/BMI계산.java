package chap02.연산자;

/*
 * 신체질량지수(BMI) = 체중(kg) / (신장(m) * 신장(m)) 
 */
public class BMI계산 {
	public static void main(String[] args) {
		
		//1. 체중 70kg을  w 변수에 저장
		double w = 70;
		
		//2. 신장 175cm를 h 변수에 저장
		double h = 1.75;
		
		//3. bmi 변수에 계산결과를 저장
		// 신체질량지수(BMI) = 체중(kg) / (신장(m) * 신장(m) ) 주의사항 신장은 단위가 m입니다.
		double bmi = w / (h*h);
				
		//4. bmi 결과 출력
		System.out.println("체질랑지수: "+ bmi);
		
		/*
		 * 실행결과 
		 * 체질랑지수: 22.857142857142858
		 */
		
	}
}
