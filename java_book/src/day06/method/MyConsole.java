package day06.method;

public class MyConsole {

	public static void printline() {
		for(int i=0; i<50; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	public static void printline(int size) {
		for(int i=0; i<size; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
	
	public static void printline(int size, String shape) {
		for(int i=0; i<size; i++) {
			System.out.print(shape);
		}
		System.out.println();
	}	
}
