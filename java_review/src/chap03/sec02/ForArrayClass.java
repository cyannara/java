package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForArrayClass {
	
	static int score;
	static int total = 0;
	static int cnt;
	static int[] a;
	static double avg; 
	static Scanner sc;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		
		// 파일 입력
		File file = new File("src/resources/engScore.txt");
		Scanner sc = new Scanner(file);

		
		 cnt = sc.nextInt();
		 a = new int[cnt];
		
		// 평균 계산
		avg = total/cnt;
		
		// 배열 출력
		int downcnt = 0;
		for(int i=0; i<cnt; i++) {
			if(a[i] < avg) {
				downcnt++;
				System.out.println(a[i]);
			}
		}
		
		System.out.println("평균미만:"+ downcnt);

	}
	
	public static void calcTotal() {
		for(int i=0; i<cnt; i++) {
			score = sc.nextInt();
			//입력값을 배열에 저장
			a[i] = score;
			total += score;
		}
		// 합계출력
		System.out.println("total="+total);
	}
}
