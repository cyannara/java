package day01.c02데이터타입;
/**
 * date : 2023/10/16 
 * @author kim yoomi
 * @version 1.8
 * 
 * 숫자형 타입에 대한 연습프로그램
 * 
 * 1. 상수값도 데이터형이 있다.
 *    정수형 상수
 *               10    (int)   
 *               10L   (long)
 *         진수      
 *               0b111 (2진수  0b 시작)
 *               0777  (8진수  0  시작)
 *               0xfff (16진수 0x 시작)
 *                
 *    실수형 상수 
 *               10.0  (double) 
 *               10.0F (float)  
 *                            
 * 2. 정수형 최대값(표현범위)
 *    실수형 유효자릿수 
 *    오버플로우
 * 
 * 3. 숫자 데이터형 :  boolean
 *                  char
 *                  byte, short, int, long
 *                  float, double    
 * 
 * 4. 메모리크기          
 * 
 *                정수형상수               실수형상수
 *                   200   200L   10.5F   10.5
 *   1        2       4      8             
 * byte  >  short >  int  > long     4       8        정수형
 *                               > float > double     실수형
 *          char                                      문자형                                
 */
public class 숫자타입 {
	public static void main(String[] args) {
		
		//int형 최대값
		int i = 200;
		i = Integer.MAX_VALUE ;
		System.out.println("int형 최대값: " + i );

		//오버플로우
		System.out.println("int형 최대값 + 1: " + (i+1) );

		//long형 최대값
		long l = 2200000000L;    
		l = Long.MAX_VALUE;      //Long
		System.out.println("long형 최대값: " + l );
		
		//float형		
		float f = 0.123456789f;           //유효자릿수 7자리
		System.out.println(f);
		
		//double형
		double d = 0.1234567890123456789; //유효자릿수 16자리
		System.out.println(d);
		
		//진수표현 :  2진수:0b   8진수:0  16진수:0x
		//0으로 시작하면 8진수
		int  b8 = 0111;            	
		System.out.println("8진수 111=" + b8);
		System.out.println(b8 + " " + Integer.toOctalString(b8));
		
		b8 = 07 + 02;
		//10진수를 8진수로 변환
		System.out.println("07 + 02 = " + Integer.toOctalString(b8)); 		
		
		//0x로 시작하면 16진수
		int b16 = 0xFF;			  	
		System.out.println("0xFF = " + b16);		
		
		//0b로 시작하면 2진수
		int b2 = 0b1111;			
		System.out.println("0b1111 = " + b2);
		
	}
}