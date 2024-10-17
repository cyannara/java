package day01.c02데이터타입;

public class 문자타입 {
	public static void main(String[] args) {
		
		//문자형
		char c1 = 'A';   
		int c2 = 'A';
		System.out.println(c1);
		System.out.println((int)c1);	

		
		//대소문자 바꾸기
		c2 = c1 + 32;
		System.out.println( c2 + " " +  (char)c2  );
		
		//한글 표현(유니코드)
		c1 = '가';
		char unicode1 = '\uac01';
		int unicode2 = 44033;
		
		System.out.println("unicode: " + (int)c1); //코드 10진수
		System.out.println(Integer.toHexString(c1)); //16진수
		
		System.out.println("unicode: " +unicode1);  //문자값
		System.out.println("unicode: " + unicode2);
		System.out.println("unicode: " + (char)unicode2);				 
		
		//문자열
		String s = "안녕\"\n\t하세요\\";
		System.out.println(s);
		
	}
}