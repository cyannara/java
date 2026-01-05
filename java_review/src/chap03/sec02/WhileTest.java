package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WhileTest {
	public static void main(String[] args) throws FileNotFoundException {

		// 파일 입력
		File file = new File("src/resources/engScore2.txt");
		Scanner sc = new Scanner(file);

		int score;
		int total = 0;
				
		while(true) {
			score1 = sc.nextInt();
			score2 = sc.nextInt();
			if(score == 0 ) break;
			total += score;
		}

	
		// 합계출력
		System.out.println(total);
	}
}
