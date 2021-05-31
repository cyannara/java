package co.yedam.test;

import java.util.Scanner;

//클래스 선언
public class Exam06 {
	int[] scores = null;   //0~9
	int studentNum =0;	
	Scanner scanner = new Scanner(System.in);
	
	void init() {
		System.out.printf("학생수>");
		studentNum = scanner.nextInt();
		scores = new int[studentNum];
	}
	
	void input() {
		//배열에 초기값 지정
		for(int i=0; i<scores.length; i++) {
			System.out.printf("scores[%d]>",i);
			scores[i] = scanner.nextInt();
		}
	}
	
	void print() {
		//배열 출력
		for(int i=0; i<scores.length; i++) {
			System.out.printf("scroe[%d] %d\n" ,i, scores[i]);
		}
		System.out.println();
	}
	
	void avg() {
		//합계
		int result = 0;
		for(int i=0; i<scores.length; i++) {
			result += scores[i];
		}
		System.out.println("평균="+result/scores.length);
	}

	void max() {
		//최대값
		int max=scores[0];
		for(int i=0; i<scores.length; i++) {
			if(scores[i] > max) {
				max = scores[i];
			}
		}
		System.out.println("최댓값="+max);
	}
	
}
