package chap03.제어문;

import java.io.File;
import java.util.Scanner;

public class EngScore {
	
	public static void main(String[] args) throws Exception {
		
		//파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);
		
		int score;
		int total = 0;
		
		score = sc.nextInt();
		total += score;
		
		score = sc.nextInt();
		total += score;
		
		score = sc.nextInt();
		total += score;
		
		score = sc.nextInt();
		total += score;
		
		score = sc.nextInt();
		total += score;
		
		//합계출력
		System.out.println(total);
	}
	
}
