package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForTest {
	public static void main(String[] args) throws FileNotFoundException {

		// 파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);

		int score;
		int total = 0;
		
		int cnt = sc.nextInt();
		
		for(int i=0; i<cnt; i++) {
			score = sc.nextInt();
			total += score;
		}

	
		// 합계출력
		System.out.println(total);
	}
}
