package co.api.wrapper;

/**
 * 
 * @author KYM
 * @since JDK1.8
 * 작성일자 : 2017/07/10
 * 설명 : wrapper 클래스 테스트
 * 1. int를 객체화
 * int   -->  Integer
 * char  -->  Char
 * double ->  Double
 * byte   --> Byte
 *  
 * 2. 데이터형변환 
 */
public class IntegerTest {
	
	public static void main(String[] args) {
			
			//1. int --> Integer
			int i = 10 ;
			Integer objI = i;    //  Boxing
			
			//2. Integer --> int
			i = objI;            // UnBoxing
			
			//3. int --> String
			String s = Integer.toString(i); 
		
			//4. String  --> int
			i = Integer.parseInt(s);
		
			//5. String --> Integer
			objI = Integer.parseInt(s);
				
			//6. Integer --> String
			s = objI.toString();
	}
	
}
