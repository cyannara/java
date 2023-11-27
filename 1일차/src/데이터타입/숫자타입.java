package 데이터타입;
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
/*
 * 데이터형 연습
 *                200    200L    10.5F  10.5
 *                기본                    기본
 *   1     2       4      8       4       8
 * byte > short > int > long                          정수
 *                              > float > double      실수
 *        char                                        문자
 * boolean                                            논리   
 */
public class 숫자타입 {
	public static void main(String[] args) {
		
		//최대값, 오버플로우
		int i = Integer.MAX_VALUE ;
		System.out.println("정수형 최대값:" + i );
		System.out.println("정수형 최대값 + 1:" + (i+2) );
		
		long l =Long.MAX_VALUE;   //Long
		System.out.println("롱 정수형 최대값:" + l );
		
		long a = 2200000000L;    //
		
		float f = 0.123456789f;           //유효자릿수 7자리
		System.out.println(f);
		
		double d = 0.1234567890123456789; //유효자릿수 16자리
		System.out.println(d);
		
		//진수표현   2진수:0b   8진수:0  16진수:0x
		//0으로 시작하면 8진수
		int  b = 0111;            	
		System.out.println("8진수 111=" + b);
		
		int b8 = 015 + 04;
		//10진수를 8진수로 변환
		System.out.println(b8 + " " + Integer.toOctalString(b8)); 		
		//0x로 시작하면 16진수
		int b16 = 0xFF;			  	
		System.out.println(b16);		
		//0b로 시작하면 2진수
		int b2 = 0b1111;			
		System.out.println(b2);
		
	}
}