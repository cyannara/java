package day11.thread2;

/*class Thread1 implements Runnable {
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("first:" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}*/

public class ThreadTest {

	public static void main(String[] args) {

		//쓰레드 생성
		/*Runnable task = new Runnable() {
			public void run() {
				for(int i=0; i<1000; i++) {
					System.out.println("first:" + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};*/
		Runnable task = () -> {
			for(int i=0; i<1000; i++) {
				System.out.println(Thread.currentThread().getName() + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread = new Thread(task);
		thread.start();
		
		Runnable task2 = () -> {
			for(int i=20000; i<21000; i++) {
				System.out.println("second:" + i);
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread thread2 = new Thread(task2);
		thread2.start();
	
	}

}


