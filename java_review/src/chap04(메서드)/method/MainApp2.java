package method;

/*
 * 메서드 선언 / 매개변수 / 리턴타입 /call by reference/value
 */
public class MainApp2 {

	public static void main(String[] args) {

		printHeader();
		add(5,3);
		printFooter();

	}
	
	public static void add(int a, int b) {
		System.out.println(String.format("%d + %d = %d", a,b,a+b) );
	}
	
	public static void printHeader() {
		System.out.println("====================");
		System.out.println("=======header=======");
		System.out.println("====================");
	}
	
	public static void printFooter() {
		System.out.println("====================");
		System.out.println("=======footer=======");
		System.out.println("====================");
	}
}
