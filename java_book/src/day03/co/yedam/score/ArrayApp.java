package day03.co.yedam.score;

import java.util.Scanner;

//클래스 선언
public class ArrayApp {
	
	int[] arr;   			//성적
	int studentNum;			//학생수
	
	Scanner scanner = new Scanner(System.in);
	
	void init() {
		System.out.println("인원수>");
		studentNum = scanner.nextInt();
		arr = new int[studentNum];
	}
	
	void input() {
		//배열에 초기값 지정
		for(int i=0; i<arr.length; i++) {
			System.out.printf("scores[%d]>",i);
			arr[i] = scanner.nextInt();
		}
	}
	
	void print() {
		//배열 출력
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	void total() {
		//합계
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		System.out.println("합계="+result);
	}
	
	void max() {
		//최대값
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최댓값="+max);
	}
	
	public static void main(String[] args) {
		
		ArrayApp app = new ArrayApp();
		boolean run  = true;
		Scanner scanner = new Scanner(System.in);
		int selectNo = 0;
		while(run) {
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.print("선택>");
			selectNo = scanner.nextInt();
			if(selectNo == 1 ) {
				app.init();
			}
		}
		
//		app.total();
//		app.max();
//		app.print();	
	}

}
