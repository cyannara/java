package day01.데이터타입;

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
		c1 = '\uac00';
		c1 = 0xac00;
		c1 = 44032;
		
		System.out.println(c1);						 //문자값
		System.out.println((int)c1); 				 //코드 10진수
		System.out.println(Integer.toHexString(c1)); //16진수
		
		//문자열
		String s = "안녕\"\n\t하세요\\";
		System.out.println(s);
		
		
		//아스키코드 출력
		for ( int j = 1; j<127 ; j++ ) {
		//	System.out.println( j + " : " + (char)j );	
		}
		
		
		//한글 출력
		for ( int j = 44032; j<45000 ; j++ ) {
			System.out.println( j + " : " + (char)j );	
		}
	}
}