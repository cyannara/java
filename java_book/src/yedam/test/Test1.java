package yedam.test;

public class Test1 {

	public static void main(String[] args) {
		printOdd();
		printEven();
		while(true) {
			System.out.println("main");
		}
	}
	
	//Runnable 익명객체 이용
	public static void printOdd() {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("odd");
			}
		});
		thread.start();
	}
	
	//람다식 이용
	public static void printEven() {
		Thread thread = new Thread(() -> System.out.println("odd") );
		thread.start();
	}
}
