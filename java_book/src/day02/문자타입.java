package day02;
/**
 * 참고사이트 :  https://en.wikipedia.org/wiki/Hangul_Syllables
 *             https://ko.wikipedia.org/wiki/한글_음절
 * Hangul Syllables is a Unicode block containing precomposed Hangul syllable blocks for modern Korean
 */
public class 문자타입 {
	public static void main(String[] args) {
				
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