package co.쓰레드;

public class ThreadTest {
	public static void main(String[] args) {
		   Runnable task = () -> { // 쓰레드가 실행하게 할 내용
		      int n1 = 10;
		      int n2 = 20;
		      String name = Thread.currentThread().getName();
		      System.out.println(name + ": " + (n1 + n2));
		   };
		   
		   Thread t = new Thread(task,"thread1");
		   t.start(); // 쓰레드 생성 및 실행
		   System.out.println("End " + Thread.currentThread().getName());
		}    
}
