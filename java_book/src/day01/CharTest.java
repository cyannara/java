package day01;

public class CharTest {
	public static void main(String[] args) {
		
		//대소문자
		char c1 = 'A';  // 
		int c2 = c1 + 32;
		System.out.println( c2 + " " +  (char)c2  );
		
		char c3 = '\uac00';
		char c4 = 0xac00;
		char c5 = '가';
		char c6 = 44032;
		
		//문자열
		String s = "안녕\"\n\t하세요\\";
		System.out.println(s);
	}
}
