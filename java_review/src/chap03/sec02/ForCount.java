package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//60미만 몇명
public class ForCount {
	public static void main(String[] args) throws FileNotFoundException {
		// 파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);
		
		// 전체 건수 입력
		int cnt = sc.nextInt();

		// 60미만 건수 저장 변수
		int lowcnt = 0;
		for(int i=0; i<cnt; i++) {
			int score = sc.nextInt();
			if (score<60) {
				lowcnt++;
				//System.out.println(score);
			}
		}
		System.out.println(cnt +":"+ lowcnt);
		
	}
}
