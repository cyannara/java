package 쓰레드2;

class Task1 extends Thread {
	public void run() {
		//홀수번째만 출력
		for(int i=1; i<100; i+=2) {
			System.out.println(i);
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Task2 extends Thread {
	public void run() {
		//짝수번째만 출력
		for(int i=0; i<100; i+=2) {
			System.out.println(i);
			try {
				this.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		Thread task1 = new Task1();
		Thread task2 = new Task2();
		
		task1.start();
		task2.start();
	}

}
