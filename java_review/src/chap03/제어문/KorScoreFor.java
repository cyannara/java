package chap03.제어문;

import java.io.File;
import java.util.Scanner;

public class KorScoreFor {
	
	public static void main(String[] args) throws Exception {
		
		//파일 입력
		File file = new File("src/resources/korScore.txt");
		Scanner sc = new Scanner(file);
		
		int total = 0;
		
		int cnt = sc.nextInt();
		int[] scores = new int[cnt];
		
		for(int i=0; i<scores.length; i++) {
			scores[i] = sc.nextInt();
			total += scores[i];
		}
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		//합계출력
		System.out.println(total);
	}
	
}
