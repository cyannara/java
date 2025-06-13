package baekjoon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B10951 {
	public static void main(String[] args) throws FileNotFoundException {
		//Scanner scanner = new Scanner(System.in);
		Scanner scanner  = new Scanner(new File("src/homework/chap04/sec02/score3.txt"));
		int num1, num2;
		int total;
		while(scanner.hasNextInt()) {
			num1 = scanner.nextInt();
			num2 = scanner.nextInt();
			total = num1 + num2;
			System.out.println(total);
		}
	}
}
