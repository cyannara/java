package 쓰레드;

/* 둘 이상의 쓰레드가 동일한 변수에 접근하는 것은 문제를 일으킬 수 있다 
 * 동기화가 필요*/

class Counter {
	   int count = 0;

	   synchronized public void increment() {
	      count++;
	   }

	   synchronized public void decrement() {
	      count--;
	   }

	   public int getCount() { return count; }
	}


public class MultiAccess {
	public static Counter cnt = new Counter();
	public static void main(String[] args) throws InterruptedException {
		Runnable task1 = () -> {
			for(int i=0; i<10000; i++) {
				cnt.increment();
			}
		};
		Runnable task2 = () -> {
			for(int i=0; i<10000; i++) {
				cnt.decrement();
			}
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(cnt.getCount());
	}
}
