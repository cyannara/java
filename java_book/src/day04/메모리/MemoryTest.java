package day04.메모리;

public class MemoryTest {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;		
		test1(a, b);		
		System.out.println(a + ":" +b);
		
		int[] sc = new int[2];
		sc[0] = 100;
		sc[1] = 110;
		test2(sc);
		System.out.println(sc[0] + ":" + sc[1] );
	}
	
	public static void test2(int[] sc) {
		sc[0] = sc[0] + 100;
		sc[1] = sc[1] + 100;
	}
	
	public static void test1(int a, int b) {
		a = a + 10;
		b = b + 10;
		System.out.println(a +":" +b);
	}

}
