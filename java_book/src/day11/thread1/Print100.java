package day11.thread1;

public class Print100 extends Thread {

	public Print100() {
		super.setName("100출력");
	}
	@Override
	public void run() {
		for(int i=1; i<100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
