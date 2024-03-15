package day06.api.wrapper;
/**
 * �����ͺ�ȯ �׽�Ʈ
 * @author user
 * �ۼ����� : 2017/04/12
 */
public class Conversion {

	/**
	 * ���۸޼���
	 * @param args : ������μ�
	 * @return : ����
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
