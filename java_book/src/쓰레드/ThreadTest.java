package 쓰레드;
/**
 * Thread 상속 
 *
 */
public class ThreadTest {

	public static void main(String[] args) {
		
		Print100 print100 = new Print100();
		print100.setPriority(Thread.MIN_PRIORITY);
		System.out.println(print100.getName());
		print100.start();
		
		Print1000 print1000 = new Print1000();
		Thread thread2 = new Thread(print1000);
		thread2.start();
		
		Thread thread1 = new Thread(new Print10000());
		thread1.start();
		//익명객체
		Thread thread3 = new Thread(new Runnable(){
			public void run() {
				for(int i=2000; i<2100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		});
		thread3.start();
		
		//람다식 : 익명객체 -> 구현메서드가 1개일때
		Thread thread4 = new Thread( () -> {
			for(int i=3000; i<3100; i++) {
				System.out.println(i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} 
		});
		
		
	}
}
