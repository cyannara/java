package day11.thread1;

public class Print1000 implements Runnable {

	
	@Override
	public void run() {
		for(int i=1000; i<1100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
