package homework.chap02.systemio;

import java.util.Scanner;

/*
 * 신체질량지수(BMI) = 체중(kg) / (신장(m) * 신장(m)) 
 */
public class BMI계산 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//1. 키보드로 체중을 입력받아서 w 변수에 저장
		double w = scanner.nextDouble();
		
		//2. 키보드로 키를 입력받아서 h 변수에 저장
		double h = scanner.nextDouble();
		
		//3. bmi 변수에 계산결과를 저장
		// 신체질량지수(BMI) = 체중(kg) / (신장(m) * 신장(m) ) 주의사항 신장은 단위가 m입니다.
		double bmi = w / (h*h);
				
		//4. bmi 결과 출력
		System.out.println("체질랑지수: "+ bmi);
		
	}
}
