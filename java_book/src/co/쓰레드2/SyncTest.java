package co.쓰레드2;
/* 
 * 동기화(멀티쓰레드 환경에서 동시 실행여부 지정)
 * 한번에 하나의 쓰레드에서만 실행 가능
 */
class Counter {
	int count = 0;
	public void increment() {
		//synchronized(this) {  //블록 동기화
			count++;
		//}
	}
	//synchronized 
	public void decrement() {  //메서드 동기화
		count--;
	}
	public int getCount() {
		return count;
	}
}

public class SyncTest {
	public static Counter cnt = new Counter();
	public static void main(String[] args) {
		Runnable task1 = () -> {
			for(int i=0; i<1000; i++) {
				cnt.increment();  //증가
			}
		};
		Runnable task2 = () -> {
			for(int i=0; i<1000; i++) {
				cnt.decrement();  //감소
			}
		};
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		
		t1.start();
		t2.start();
	/*	try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		System.out.println(cnt.getCount());
	}

}
