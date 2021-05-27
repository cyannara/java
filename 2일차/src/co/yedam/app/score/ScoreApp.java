package co.yedam.app.score;

import java.util.Scanner;

/*
 * 성적처리 프로그램
 * 국어,영어,수학 입력
 * 총점, 평균, 등급 계산
 */
public class ScoreApp {
	int kor;
	int eng;
	int mat;
	int sum;
	float avg;
	char grade;
	
	//성적입력
	void input() {
		//국어 , 영어, 수학 입력
		Scanner scanner = new Scanner(System.in);
		System.out.print("국어:");
		kor = scanner.nextInt();
		System.out.print("영어");
		eng = scanner.nextInt();
		System.out.print("수학");
		mat = scanner.nextInt();		
		//총점
		sum = kor + eng + mat;
		//평균
		avg = (float)sum /3;
	}
	
	//합계 계산
	int getSum() {
		return sum;
	}
	
	float getAvg() {
		return avg;
	}
	
	boolean isPass() {
		//평균이 60이상 true
		//아니면 false;
		return false;
	}
	
	char getGrade() {
		switch ((int) avg / 10) { // 80 상 60 중 하
		case 10:		
		case 9:			
		case 8:			grade = '상'; break;
		case 7:			
		case 6:			grade = '중'; break;
		default:		grade = '하'; break;
		}
		return grade;
	}
}
