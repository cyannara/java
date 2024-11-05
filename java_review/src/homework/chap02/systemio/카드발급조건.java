package homework.chap02.systemio;

import java.util.Scanner;

/*
 * 연소득 5,000만 원 이상이거나 신용 등급 B 이상
 */
public class 카드발급조건 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int salary; //연소득
		char grade; //신용등급
		
		salary = scanner.nextInt();
		grade = scanner.next().charAt(0);
		
		boolean result = salary >=5000 || grade <= 'B';
		
		System.out.println("카드발급여부: " + result);
		
	}
}
