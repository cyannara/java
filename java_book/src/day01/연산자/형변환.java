package day01.연산자;

import java.util.Scanner;

/*
 * 형변환 : 캐스트연산자 (타입)
 * 정수형 : byte < short < int   < long
 * 실수형 :                float < double
 * 
 * 스트링   ---->  byte     Byte.parseByte(변수)     
 *                short    Short.parseShort 
 *                int      Integer.parseInt
 *                long
 *                float
 *                double
 *                char
 *                boolean
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
		double  i =  5 / (double)2;
		System.out.println(i);
		
		//스트링  -> int
		String s1 = "123";
		int j = Integer.parseInt(s1);
		
		//int  -> 스트링
		String s2 = String.valueOf(10.5); 
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력:");
		String greet = scanner.next();
		
		System.out.println(greet);
		
	}

}
