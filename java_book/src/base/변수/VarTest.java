package base.변수; 
/**
 * date : 2017/10/16 
 * @author kim yoomi
 * @since jdk1.2
 * @version 1.8
 * 변수 테스트
 * 1. 상수값도 데이터형이 있다.
 * 정수형 상수 -int,   실수형 상수 - double
 *         10L               10.456F
 * 2. 정수형 최대값(표현범위)
 *    실수형 유효자릿수     
 * 3. 데이터형 :  boolean
 *             char
 *             byte, short, int, long
 *             float, double            
 */
public class VarTest {
	public static void main(String[] args) {
		int i = Integer.MAX_VALUE ;		//정수형 상수 기본형
		long a = 2200000000L;
		float b = 10.12345678912345f;
		double c = 10.12345678912345;  // 실수형 상수 기본형
		
		System.out.println("정수형 최대값:" + i );
		System.out.println("정수형 최대값 + 1:" + (i+2) );
		
		long d =Long.MAX_VALUE;   //Long
		System.out.println("롱 정수형 최대값:" + d );
		
		System.out.println( "float " + b + " double " + c );
		
		//char 형 
		char e = 'A';
		int f = 'A';    //65
		char g = '가';
		System.out.println("가 의 코드값:" + (int)g);
		
		g = '\uac01';
		System.out.println("ac01: " + g);
		
		//10진수를 16진수로   toString( ,16)
		System.out.println( Integer.toString(g,16) );
		
		//아스키코드 출력
		for ( int j = 1; j<127 ; j++ ) {
		//	System.out.println( j + " : " + (char)j );	
		}
		
		
		//한글 출력
		for ( int j = 44032; j<45000 ; j++ ) {
			System.out.println( j + " : " + (char)j );	
		}
		 
	}
	/**
	 * 서브 메서드
	 * 
	 */
	public static void sub1() {
		
	}
}
