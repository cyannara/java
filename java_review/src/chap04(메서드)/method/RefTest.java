package method;
/*
 * 참조변수 참조객체
 * 불변(상수)
 * 기본형타입      : int,    double
 * wrapper 클래스 : Integer  
 * String
 */
public class RefTest {
	public static void main(String[] args) {
		int a = 10;
		int b = a;   //값을 복사
		b = 20;   // a 변경되냐?

		String[] arr = new String[] {"hello", "scott"};
		String[] dest = arr;
		dest[0] = "bye";
		System.out.println(arr[0]);  // 
				
		 
	}
}
