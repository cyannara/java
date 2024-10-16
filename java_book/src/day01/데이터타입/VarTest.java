package day01.데이터타입;
/**
 * @author kim yoomi
 * @since jdk1.2
 * @version 1.8
 * 
 * 상수와 변수 데이터 타입
 * 1. 상수값도 데이터형이 있다.
 *    정수형 상수 -10(int), 10L(long)
 *    실수형 상수 - 10.0(double) 10.0F(float)
 *    
 * 2. 정수형 최대값(표현범위)
 *    실수형 유효자릿수
 *         
 * 3. 데이터형 :  boolean
 *              char
 *              byte, short, int, long
 *              float, double    
 * 
 * 4. 메모리크기             
 *                200    200L    10.5F   10.5
 *   1     2       4      8       4       8
 * byte > short > int > long                         정수형
 *                             > float > double      실수형
 *        char                                       문자형
 * boolean                                           불린형        
 */
public class VarTest {
	public static void main(String[] args) {
		
		// 숫자
		int intMax = Integer.MAX_VALUE ;		// int : 정수형 상수 기본형 
		long l = 2200000000L;           // long
		float f = 10.12345678912345f;   // float
		double d = 10.12345678912345;   // double : 실수형 상수 기본형
		
		System.out.println("정수형 최대값:" + intMax );
		System.out.println("정수형 최대값 + 1:" + (intMax+2) );
		
		long longMax =Long.MAX_VALUE;   //Long
		System.out.println("롱 정수형 최대값:" + longMax );
		
		System.out.println( "float " + f + " double " + d );
		
		// 진수표현
		int  b8 = 0111;            	
		System.out.println("8진수 111=" + b8);
		System.out.println(b8 + " " + Integer.toOctalString(b8));
		
		int b16 = 0xFF;			  	
		System.out.println(b16);		

		int b2 = 0b1111;			
		System.out.println(b2);
		
		//문자 
		char c1 = 'A';
		int c2 = 'A';    //65
		char g = '가';
		System.out.println("가 의 코드값:" + (int)g);
		
		char unicode1 = '\uac01';
		int unicode2 = 44033;
		System.out.println("unicode: " +unicode1);
		System.out.println("unicode: " + unicode2);
		System.out.println("unicode: " + (char)unicode2);
		
		//10진수를 16진수로   toString( ,16)
		System.out.println( Integer.toString(g,16) );
		
		//아스키코드 출력
		for ( int j = 1; j<127 ; j++ ) {
		//	System.out.println( j + " : " + (char)j );	
		}
		
		//한글 출력
		for ( int j = 44032; j<45000 ; j++ ) {
			//System.out.println( j + " : " + (char)j );	
		}
		 
	}
	/**
	 * 서브 메서드
	 * 
	 */
	public static void sub1() {
		
	}
}
