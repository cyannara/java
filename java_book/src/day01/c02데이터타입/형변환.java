package day01.c02데이터타입;

import java.util.Scanner;

/*
 * 형변환 : 캐스트연산자 (타입)
 * 정수형 : byte < short < int   < long
 * 실수형 :                float < double
 * 
 * 스트링   ---->  byte      Byte.parseByte(문자열)     
 *                short     Short.parseShort(문자열)
 *                int       Integer.parseInt(문자열)
 *                long
 *                float
 *                double
 *                char
 *                boolean   Boolean.parseBoolean(문자열)
 *         <----  
 * String.valueOf(   )       
 */
public class 형변환 {

	public static void main(String[] args) {
		
		//자동형변환
		int a = 10;
		long b = a;
		
		//강제형변환
		a = (int)b;
		
		//char(문자) <-> int(코드)
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		
		// 실수(double)  ->  정수(int)
		double e = 10.5;
		long f = (long)e;
		System.out.println(f);
		
		// 수식내에서 자동으로 형변환
		double g = 5 + 10.5;
		String h = "hi" + 5;
		System.out.println(h);
		System.out.println("hi" + (5 + 10));
		System.out.println(5 + 10 + "hi");
		
		//정수 끼리의 연산결과는 정수
		double  d1 =  10 / 3;          //자동 형 변환
		System.out.println(d1);
		
		double  d2 =  10 / (double)3;  //강제 type 변환
		System.out.println(d2);
		//소수점 둘째자리까지 표현
		System.out.println( (int)(d2*100)/100.0); 
		
		//스트링  -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		
		//int  -> 스트링
		String s2 = String.valueOf(10.5); 
		
		
	}

}
