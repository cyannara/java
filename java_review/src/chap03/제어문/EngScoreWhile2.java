package chap03.제어문;

import java.io.File;
import java.util.Scanner;

public class EngScoreWhile2 {
	
	public static void main(String[] args) throws Exception {
		
		//파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);
		
		int score;
		int total = 0;
		
		int i=0;
		while( (score = sc.nextInt()) != 0 ) {
			
			total += score;
			i++;
		}
		
		//합계출력
		System.out.println(i +":" + total);
	}
	
}
