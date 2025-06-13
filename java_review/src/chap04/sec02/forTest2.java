package chap04.sec02;

/** 
 * 60미만의 학생수는?
 */
import java.util.Scanner;

public class forTest2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int count = 0;
		for (int i = 0; i < 10; i++) {
			num = scanner.nextInt();
			if(num < 60) {
				count++;
			}
		}
		System.out.println("60미만의 학생은 " + count + "명입니다.");
	}
}
