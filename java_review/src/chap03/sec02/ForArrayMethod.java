package 제어문;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ForArrayMethod {

	int score;
	int total = 0;
	int cnt;
	int[] a;
	double avg;
	Scanner sc;

	public void scanner(String src) {
		// 파일 입력
		File file = new File(src);
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void init() {
		cnt = sc.nextInt();
		a = new int[cnt];
	}

	public void calcTotal() {
		for (int i = 0; i < cnt; i++) {
			score = sc.nextInt();
			// 입력값을 배열에 저장
			a[i] = score;
			total += score;
		}
		// 합계출력
		System.out.println("total=" + total);
	}

	public void calcAvg() {
		// 평균 계산
		avg = total / cnt;
	}

	public void print() {
		// 배열 출력
		int downcnt = 0;
		for (int i = 0; i < cnt; i++) {
			if (a[i] < avg) {
				downcnt++;
				System.out.println(a[i]);
			}
		}

		System.out.println("평균미만:" + downcnt);
	}

}
