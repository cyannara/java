package 메모리;

public class EqualTest {

	public static void main(String[] args) {

		int[] a = new int[10];   //배열은 0으로 초기화
		int[] b = a;			//얕은복사
		int[] c = new int[a.length];
		System.arraycopy(a, 0, c, 0, a.length);  //  깊은복사
		
		b[0] = 100;
		
		System.out.println(a[0]);		
		System.out.println(a == b);
		
		
		//스트링
		String s1 = new String("hello");
		String s2 = new String("hello");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));  
		
		String s3 = "hi";
		String s4 = "hi";
		System.out.println(s3 == s4);
		
		s1 = null;
		s2 = null;
		
	}

}
