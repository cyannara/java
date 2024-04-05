package javautil;

import java.util.Random;

public class MathTest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			//난수 만들기
			int a = (int) (Math.random() * 10);
			System.out.println(a);
		}
		
		System.out.println("===========");
		for (int i = 0; i < 10; i++) {
			Random rand = new Random();
			System.out.println(rand.nextInt(10));
		}
		
		System.out.println("===========");
		System.out.println(System.currentTimeMillis());
	
	}

}
