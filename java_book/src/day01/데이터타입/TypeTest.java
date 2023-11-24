package day01.데이터타입;
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
public class TypeTest {
	public static void main(String[] args) {
		//System.out.println(Integer.MAX_VALUE);
		//System.out.println(Long.MAX_VALUE);
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
		
		//char
		System.out.println("========================");
		char c1 = '가';
		System.out.println((int)c1);          	  	 //10진수
		System.out.println(Integer.toHexString(c1)); //16진수
		char c2 = '\uac01';
		int c3 = 44033;
		System.out.println(c2);
		System.out.println((char)c3);
		
		
		
				
				
	}
}