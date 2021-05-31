package test;
/**
 * 데이터변환 테스트
 * @author user
 * 작성일자 : 2017/04/12
 */
public class Conversion {

	/**
	 * 시작메서드
	 * @param args : 명령행인수
	 * @return : 없음
	 */
	public static void main(String[] args) {
		String s = "100";
		int a = 0;
		Integer objInt = 1;
		// 1. String   -> int
		a = s;    
		
		// 2. int      -> String
		s = a;
		
		// 3. String  -> Integer 
		objInt = s;
		
		// 4. Integer  -> String 
		s = objInt;

		
		System.out.println(s + " : " +
		                   a + " : " +
		                   objInt);
	}
}
