package chap04.sec02;

import java.util.Scanner;

public class ForTest1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int total = 0;
		for(int i=0; i<10; i++) {
			num = scanner.nextInt();
			total += num;
		}
		System.out.println(total);
	}
}
