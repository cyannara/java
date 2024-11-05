package homework.chap04.sec02;

/** 
 * 각 등급별 학생수는?
 * 80점이상인 학생
 * 60점이상인 학생
 * 
 */
import java.util.Scanner;

public class forTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num;
		int count80 = 0;
		int count60 = 0;
		int count0 = 0;
		
		for (int i = 0; i < 10; i++) {
			num = scanner.nextInt();
			if(num >=80) {
				count80++;
			} else if( num >=60) {
				count60++;
			} else {
				count0++;
			}
		}
		System.out.println("80이상의 학생은 " + count80 + "명입니다.");
		System.out.println("60이상의 학생은 " + count60 + "명입니다.");
		System.out.println("60미만의 학생은 " + count0 + "명입니다.");
	}
}
