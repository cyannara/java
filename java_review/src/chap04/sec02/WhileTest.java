package chap04.sec02;

import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = 0;
		int num;
		
		while(scanner.hasNextInt()) {
			num = scanner.nextInt();
			System.out.println(num);
			cnt ++;
		}
		System.out.println(cnt);
	}
}
