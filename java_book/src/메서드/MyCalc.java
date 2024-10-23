package 메서드;

/**
 * 
 * @author 김유미
 * @version 1.4
 * 사칙연산 계산기
 * 개발내용
 *     2024-04-06  김유미 합계계산
 *     2024-05-06  홍길동 차이계산
 */
public class MyCalc {

	/**
	 * 두 수의 합의 계산해서 결과 리턴
	 * @param num1 첫번째 정수형 숫자
	 * @param num2 두번째 정수형 숫자
	 * @return 두수의 합
	 */
	public static int sum(int num1, int num2) {
		int result =0;
		result = num1 + num2;
		return result;
	}
	
	/**
	 * 두 수의 차이의 계산해서 결과 리턴
	 * @param num1 첫번째 정수형 숫자
	 * @param num2 두번째 정수형 숫자
	 * @return 두수의 차이
	 */
	public static int minus(int num1, int num2) {
		int result =0;
		if(num1>num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		return result;
	}
}
